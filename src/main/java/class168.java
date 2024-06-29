import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class168 extends class67 {

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Z")
    public boolean field3237 = false;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lid;")
    public static class92 field3230 = new class92(64);

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Lca;")
    public static class24 field3238 = new class24(50);

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "Li;")
    public static class88 field3239 = class208.method1425(105, "document)3cookie=(R");

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "[Li;")
    public static class88[] field3240 = new class88[200];

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "[I")
    public static int[] field3242 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "Li;")
    public static class88 field3241 = class208.method1425(105, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "Li;")
    private static class88 field3246 = class208.method1425(105, "<col=ff0000>");

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "Li;")
    public static class88 field3243 = class208.method1425(105, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "Li;")
    public static class88 field3245 = class208.method1425(105, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "[I")
    public static int[] field3247 = new int[2000];

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static void method1151(byte arg0) {
        field3247 = null;
        field3245 = null;
        field3246 = null;
        field3243 = null;
        if (arg0 < 63) {
            method1153((byte) 101);
        }
        field3230 = null;
        field3240 = null;
        field3238 = null;
        field3242 = null;
        field3241 = null;
        field3239 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Lsi;")
    public static final class205 method1152(byte arg0, int arg1) {
        class205 var2 = (class205) class131.field2449.method666((long) arg1, 0);
        if (arg0 != 62) {
            method1152((byte) 43, -84);
        }
        field3232++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class36.field633.method941((byte) 56, arg1 & 0x7FFF, 1);
        } else {
            var3 = class78.field1417.method941((byte) 56, arg1, 1);
        }
        class205 var4 = new class205();
        if (var3 != null) {
            var4.method1413(new class46(var3), (byte) -125);
        }
        if (arg1 >= 32768) {
            var4.method1417(-125);
        }
        class131.field2449.method664((long) arg1, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public static final void method1153(byte arg0) {
        class230.field4314.method34(8);
        field3234++;
        int var1 = class230.field4314.method28(1, -315);
        if (var1 == 0) {
            return;
        }
        int var2 = class230.field4314.method28(2, -315);
        if (var2 == 0) {
            class139.field2581[class192.field3704++] = 2047;
        } else if (var2 == 1) {
            int var3 = class230.field4314.method28(3, -315);
            class240.field4458.method1478((byte) 127, false, var3);
            int var4 = class230.field4314.method28(1, -315);
            if (var4 == 1) {
                class139.field2581[class192.field3704++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class230.field4314.method28(3, -315);
            class240.field4458.method1478((byte) 127, true, var5);
            int var6 = class230.field4314.method28(3, -315);
            class240.field4458.method1478((byte) 127, true, var6);
            int var7 = class230.field4314.method28(1, -315);
            if (var7 == 1) {
                class139.field2581[class192.field3704++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class230.field4314.method28(1, -315);
            class149.field2909 = class230.field4314.method28(2, -315);
            int var9 = class230.field4314.method28(1, -315);
            if (var9 == 1) {
                class139.field2581[class192.field3704++] = 2047;
            }
            int var10 = class230.field4314.method28(7, -315);
            int var11 = class230.field4314.method28(7, -315);
            class240.field4458.method1476(var8 == 1, var10, 0, var11);
        } else if (arg0 >= -79) {
            method1152((byte) -84, 3);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Li;")
    public static final class88 method1154(int arg0, int arg1, int arg2) {
        field3236++;
        if (arg2 != 14058) {
            field3243 = null;
        }
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return field3246;
        } else if (var3 < -6) {
            return class186.field3638;
        } else if (var3 < -3) {
            return class2.field18;
        } else if (var3 < 0) {
            return class31.field502;
        } else if (var3 > 9) {
            return class12.field182;
        } else if (var3 > 6) {
            return class33.field553;
        } else if (var3 > 3) {
            return class231.field4340;
        } else if (var3 > 0) {
            return class136.field2528;
        } else {
            return class8.field120;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
    public static final Object method1155(boolean arg0, byte arg1, byte[] arg2) {
        field3233++;
        if (arg1 > -53) {
            return null;
        } else if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class11.field166) {
                try {
                    class1 var3 = (class1) Class.forName("qi").getDeclaredConstructor().newInstance();
                    var3.method4(0, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class11.field166 = true;
                }
            }
            return arg0 ? class179.method1278(arg2, true) : arg2;
        }
    }
}
