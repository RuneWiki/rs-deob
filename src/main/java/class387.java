import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class387 extends class512 {

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "Lrh;")
    public static class482 field5958 = new class482(128);

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "[I")
    public static int[] field5962 = new int[250];

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field5963 = 0;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field5965 = -1;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Z")
    public static boolean field5967 = false;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "Lfr;")
    public static class231 field5964 = new class231(20);

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "Lo;")
    public static class138 field5966;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)V")
    public static final void method2426(int arg0, int arg1) {
        field5957++;
        if (!class468.method2782(arg1, -24955)) {
            return;
        }
        class68[] var2 = class508.field7389[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class68 var4 = var2[var3];
            if (var4 != null) {
                var4.field1025 = 1;
                var4.field1084 = 0;
                var4.field1046 = 0;
            }
        }
        if (arg0 != 1) {
            method2427((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        field5960++;
        int var3 = 17 / ((43 - arg1) / 48);
        return class276.field4540;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
    public static void method2427(byte arg0) {
        field5964 = null;
        field5958 = null;
        if (arg0 == -10) {
            field5962 = null;
            field5966 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class387() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method2428(int arg0, String arg1, byte arg2) {
        field5959++;
        int var3 = class151.field2425;
        int[] var4 = class45.field734;
        boolean var5 = false;
        if (arg2 > -11) {
            method2426(14, -113);
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class166 var7 = class435.field6489[var4[var6]];
            if (var7 != null && class302.field4850 != var7 && var7.field2652 != null && var7.field2652.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    class289.field4698++;
                    class265.method1775(-2, class131.field2240);
                    class261.field4357.method178(var4[var6], (byte) 60);
                    class261.field4357.method119(0, -4729);
                } else if (arg0 == 4) {
                    class187.field2922++;
                    class265.method1775(-2, class199.field3166);
                    class261.field4357.method178(var4[var6], (byte) 53);
                    class261.field4357.method164(0, (byte) -111);
                } else if (arg0 == 5) {
                    class117.field2081++;
                    class265.method1775(-2, class127.field2187);
                    class261.field4357.method160(-742698264, var4[var6]);
                    class261.field4357.method130(0, -115);
                } else if (arg0 == 6) {
                    class432.field6466++;
                    class265.method1775(-2, class118.field2095);
                    class261.field4357.method163(0, (byte) 49);
                    class261.field4357.method160(-742698264, var4[var6]);
                } else if (arg0 == 7) {
                    class265.method1775(-2, class528.field7776);
                    class17.field191++;
                    class261.field4357.method178(var4[var6], (byte) 118);
                    class261.field4357.method163(0, (byte) 49);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class467.method2774(class462.field6874.method1954(class300.field4813, -30366) + arg1, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method2429(boolean arg0, int arg1, int arg2) {
        field5961++;
        if (arg2 == -1) {
            return arg0 && arg1 >= 0 ? class403.method2498(arg0, (byte) 117, arg1, 10) : Integer.toString(arg1);
        } else {
            return null;
        }
    }
}
