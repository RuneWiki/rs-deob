import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class404 extends class534 {

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public int field5696 = -1;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "[Z")
    public static boolean[] field5699 = new boolean[100];

    @OriginalMember(owner = "client!io", name = "w", descriptor = "Lwo;")
    public static class690 field5706 = new class690(14, 2);

    @OriginalMember(owner = "client!io", name = "x", descriptor = "Loe;")
    public static class183 field5707 = new class183();

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public int field5698;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Lod;")
    public static class470 field5708;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "Ljava/lang/String;")
    public String field5697;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "Ljava/lang/String;")
    public String field5703;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2432(boolean arg0) {
        field5706 = null;
        if (arg0) {
            field5708 = null;
            field5707 = null;
            field5699 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([Ljava/lang/String;B)V", line = 23)
    public static final void method2433(String[] arg0, byte arg1) {
        if (arg1 > 94) {
            ++field5701;
            if (arg0.length <= 1) {
                class220.field2850 = class220.field2850 + arg0[0];
            } else {
                for (int var2 = 0; var2 < arg0.length; ++var2) {
                    if (arg0[var2].startsWith("pause")) {
                        int var3 = 5;
                        try {
                            var3 = Integer.parseInt(arg0[var2].substring(6));
                        } catch (Exception var4) {
                        }
                        class79.method660((byte) -81, "Pausing for " + var3 + " seconds...");
                        class20.field528 = var2 + 1;
                        class410.field5806 = arg0;
                        class544.field7883 = (long) (var3 * 1000) + class301.method1787((byte) -81);
                        return;
                    }
                    class220.field2850 = arg0[var2];
                    class559.method3272(-16392, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZII)Z", line = 70)
    public static final boolean method2434(boolean arg0, int arg1, int arg2) {
        ++field5700;
        if (!arg0) {
            field5706 = null;
        }
        return ~(2048 & arg2) != -1;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)Lmfa;", line = 86)
    public final class570 method2435(boolean arg0) {
        ++field5705;
        if (arg0) {
            method2436(-85, -15, -4, 90, 0.26839066F, 116, 84, true);
        }
        return class702.field9918[super.field7793];
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIFIIZ)[I", line = 98)
    public static final int[] method2436(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, boolean arg7) {
        ++field5704;
        int[] var8 = new int[arg3];
        class263 var9 = new class263();
        var9.field3628 = arg7;
        var9.field3611 = (int) (arg4 * 4096.0F);
        var9.field3621 = arg0;
        var9.field3616 = arg5;
        var9.field3612 = arg1;
        var9.field3619 = arg2;
        var9.method358(arg6 ^ 32);
        if (arg6 != 5) {
            return null;
        } else {
            class415.method2490(arg3, (byte) 33, 1);
            var9.method1600(true, var8, 0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 124)
    public static final void method2437(byte arg0) {
        ++field5702;
        class361.field4805 = false;
        if (arg0 == 5) {
            class79.method661(class1.field2, class675.field9685, 10, class84.field1195, class22.field548);
        }
    }
}
