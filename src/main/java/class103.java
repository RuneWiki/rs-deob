import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class103 extends class123 {

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public int field2395 = 1000;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Lr;")
    public static class110 field2391 = new class110(5000);

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "[Lod;")
    public static class96[] field2396 = new class96[50];

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "Lvc;")
    public static class137 field2399 = class45.method325("Bitte entfernen Sie ", -46);

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "Lrb;")
    public static class112 field2397 = new class112(32);

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lvc;")
    private static class137 field2401 = class45.method325("You need a members account to login to this world)3", -46);

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "Lvc;")
    private static class137 field2400 = class45.method325("red:", -46);

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "Lvc;")
    public static class137 field2402 = field2401;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "Lvc;")
    public static class137 field2403 = field2400;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "Loa;")
    public static class93 field2398;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "Ljava/lang/Class;")
    public static Class field2404;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
    public static void method750(int arg0) {
        field2402 = null;
        field2401 = null;
        field2396 = null;
        field2398 = null;
        field2397 = null;
        field2399 = null;
        if (arg0 != 1) {
            field2396 = null;
        }
        field2403 = null;
        field2391 = null;
        field2400 = null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)Lbf;")
    public class14 method38(boolean arg0) {
        if (!arg0) {
            method750(19);
        }
        field2388++;
        return null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIII)V")
    public void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2393++;
        class14 var10 = this.method38(true);
        if (var10 != null) {
            this.field2395 = var10.field2395;
            var10.method113(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public static final void method751(byte arg0) {
        field2394++;
        if (class68.field1398 == null) {
            return;
        }
        long var1 = class60.method432(true);
        if (class111.field2636 >= var1 || arg0 != 110) {
            return;
        }
        class68.field1398.method370(var1);
        int var3 = (int) (var1 - class111.field2636);
        class111.field2636 = var1;
        synchronized (field2404 == null ? (field2404 = method754("n")) : field2404) {
            class111.field2639 += class85.field2025 * var3;
            int var5 = (class111.field2639 - class85.field2025 * 2000) / 1000;
            if (var5 > 0) {
                if (class143.field3357 != null) {
                    class143.field3357.method117(var5);
                }
                class111.field2639 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLeb;)V")
    public static final void method752(byte arg0, class31 arg1) {
        arg1.field675 = false;
        field2389++;
        if (arg1.field678 != null) {
            arg1.field678.field3127 = 0;
        }
        int var2 = -120 / ((arg0 - 11) / 53);
        for (class31 var3 = arg1.method116(); var3 != null; var3 = arg1.method120()) {
            method752((byte) 126, var3);
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
    public static final void method753(byte arg0) {
        field2391.method848((byte) 66);
        int var1 = field2391.method847(1, (byte) 74);
        field2390++;
        if (var1 == 0) {
            return;
        }
        int var2 = field2391.method847(2, (byte) 66);
        if (var2 == 0) {
            class85.field2036[class68.field1416++] = 2047;
        } else if (arg0 == 14) {
            if (var2 == 1) {
                int var3 = field2391.method847(3, (byte) 58);
                class104.field2412.method560(arg0 ^ 0xFFFFA654, false, var3);
                int var4 = field2391.method847(1, (byte) 50);
                if (var4 == 1) {
                    class85.field2036[class68.field1416++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = field2391.method847(3, (byte) 45);
                class104.field2412.method560(-22950, true, var5);
                int var6 = field2391.method847(3, (byte) 101);
                class104.field2412.method560(-22950, true, var6);
                int var7 = field2391.method847(1, (byte) 88);
                if (var7 == 1) {
                    class85.field2036[class68.field1416++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = field2391.method847(7, (byte) 119);
                class28.field627 = field2391.method847(2, (byte) 66);
                int var9 = field2391.method847(1, (byte) 78);
                int var10 = field2391.method847(7, (byte) 57);
                int var11 = field2391.method847(1, (byte) 48);
                if (var11 == 1) {
                    class85.field2036[class68.field1416++] = 2047;
                }
                class104.field2412.method559(var9 == 1, (byte) -103, var10, var8);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method754(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
