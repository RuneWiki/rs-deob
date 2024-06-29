import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class7 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field124 = -1;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lhh;")
    public static class163 field125 = class137.method1065("::noclip", 17);

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "[J")
    public static long[] field128 = new long[32];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lud;")
    public static class198 field120;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
    public static int method50(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method51(int arg0) {
        class93.method739(true);
        class243.method1680((byte) -96);
        if (arg0 >= -58) {
            field126 = -50;
        }
        class188.method1388((byte) 37);
        field127++;
        class95.method757(-4206);
        class69.method478((byte) -127);
        class49.method349(-1102);
        class72.method535(0);
        class102.method817(-6764);
        class129.method1024(false);
        class46.method336(96);
        class96.method761((byte) 59);
        class190.method1399(20);
        class134.method1053((byte) 70);
        class71.method516((byte) 83);
        class124.field2394.method111((byte) -52);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([Lcg;IZI[BIII)V")
    public static final void method52(class1[] arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 17379) {
            field120 = null;
        }
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg3 + var11 > 0 && arg3 + var11 < 103) {
                            arg0[var9].field11[arg5 + var10][arg3 + var11] = method50(arg0[var9].field11[arg5 + var10][arg3 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class81 var12 = new class81(arg4);
        field121++;
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class229.method1595(arg3 + var15, var13, var12, arg5 + var14, arg2, -3781, 0, arg7, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method53(int arg0) {
        field125 = null;
        if (arg0 != 71) {
            method51(76);
        }
        field120 = null;
        field128 = null;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static final void method54(int arg0) {
        class144.field2719 = arg0;
        for (int var1 = 0; var1 < class58.field948; var1++) {
            for (int var2 = 0; var2 < class106.field2033; var2++) {
                if (class259.field4542[arg0][var1][var2] == null) {
                    class259.field4542[arg0][var1][var2] = new class144(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)J")
    public static final synchronized long method55(int arg0) {
        field119++;
        if (arg0 != 0) {
            return -81L;
        }
        long var1 = System.currentTimeMillis();
        if (class208.field3778 > var1) {
            class76.field1424 += class208.field3778 - var1;
        }
        class208.field3778 = var1;
        return var1 + class76.field1424;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILhh;)V")
    public static final void method56(byte arg0, int arg1, class163 arg2) {
        field122++;
        class169.field3092++;
        if (arg0 < 28) {
            method51(-71);
        }
        class191.field3499.method75(71, 109);
        class191.field3499.method655(0, arg1);
        class191.field3499.method637(arg2.method1193((byte) 54), (byte) 27);
    }
}
