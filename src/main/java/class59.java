import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class59 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field920 = -1;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field921 = 128;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lma;")
    public static class5 field922 = null;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lel;")
    public static class218 field925 = new class218();

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Ltj;")
    public static class73 field926 = new class73(50);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 10)
    public static final void method439(int arg0) {
        int var1 = -8 % ((3 - arg0) / 41);
        field924++;
        class164.field2496.method1382((byte) -86);
        class260.field4430.method782(-18590);
        class65.field1019.method782(-18590);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lii;I)Ljh;", line = 25)
    public static final class62 method440(class221 arg0, int arg1) {
        field919++;
        if (arg1 != 0) {
            field922 = (class5) null;
        }
        return new class62(arg0.method1505(-60), arg0.method1505(arg1 - 15), arg0.method1505(-28), arg0.method1505(-6), arg0.method1505(0), arg0.method1505(121), arg0.method1505(-79), arg0.method1505(104), arg0.method1497(3610), arg0.method1509(true));
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 36)
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class115.field1721 * 128) {
            arg0 = class115.field1721 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class179.field2708 * 128) {
            arg2 = class179.field2708 * 128 - 1;
        }
        class111.field1658 = class229.field3805[arg3];
        class259.field4423 = class229.field3806[arg3];
        class61.field952 = class229.field3805[arg4];
        class171.field2633 = class229.field3806[arg4];
        class211.field3365 = arg0;
        class67.field1038 = arg1;
        class57.field898 = arg2;
        class195.field3038 = arg0 / 128;
        class103.field1537 = arg2 / 128;
        class70.field1111 = class195.field3038 - class147.field2137;
        if (class70.field1111 < 0) {
            class70.field1111 = 0;
        }
        class74.field1159 = class103.field1537 - class147.field2137;
        if (class74.field1159 < 0) {
            class74.field1159 = 0;
        }
        class72.field1132 = class195.field3038 + class147.field2137;
        if (class72.field1132 > class115.field1721) {
            class72.field1132 = class115.field1721;
        }
        class80.field1242 = class147.field2137 + class103.field1537;
        if (class80.field1242 > class179.field2708) {
            class80.field1242 = class179.field2708;
        }
        short var15 = 3584;
        for (int var16 = 0; var16 < class147.field2137 + class147.field2137 + 2; var16++) {
            for (int var17 = 0; var17 < class147.field2137 + class147.field2137 + 2; var17++) {
                int var18 = (var16 - class147.field2137 << 7) - (class211.field3365 & 0x7F);
                int var19 = (var17 - class147.field2137 << 7) - (class57.field898 & 0x7F);
                int var20 = class195.field3038 + var16 - class147.field2137;
                int var21 = class103.field1537 + var17 - class147.field2137;
                if (var20 >= 0 && var21 >= 0 && var20 < class115.field1721 && var21 < class179.field2708) {
                    int var22;
                    if (class181.field2769 == null) {
                        var22 = class88.field1318[0][var20][var21] + 128 - class67.field1038;
                    } else {
                        var22 = class181.field2769[0][var20][var21] + 128 - class67.field1038;
                    }
                    int var23 = class88.field1318[3][var20][var21] - class67.field1038 - 1000;
                    class111.field1645[var16][var17] = class68.method489(var18, var23, var22, var19, var15);
                } else {
                    class111.field1645[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class147.field2137 + class147.field2137 + 1; var24++) {
            for (int var25 = 0; var25 < class147.field2137 + class147.field2137 + 1; var25++) {
                class251.field4166[var24][var25] = class111.field1645[var24][var25] || class111.field1645[var24 + 1][var25] || class111.field1645[var24][var25 + 1] || class111.field1645[var24 + 1][var25 + 1];
            }
        }
        class218.field3517 = arg6;
        class257.field4405 = arg7;
        class33.field511 = arg8;
        class62.field976 = arg9;
        class282.field4781 = arg10;
        class19.method155();
        if (class225.field3700 != null) {
            class50.method379(true);
            class155.method994(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class257.field4397 = false;
            class264.method1814(0, 0, (byte) 96);
            class293.method1977((float[]) null);
            class53.method400();
            class50.method379(false);
        }
        class155.method994(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 160)
    public static final void method442(byte arg0) {
        field918++;
        int[] var1 = new int[class100.field1495];
        int var2 = 0;
        for (int var3 = 0; var3 < class100.field1495; var3++) {
            class196 var4 = class235.method1664(118, var3);
            if (var4.field3053 >= 0 || var4.field3056 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 == -76) {
            class40.field606 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                class40.field606[var5] = var1[var5];
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)Z", line = 194)
    public static final boolean method443(int arg0, int arg1, int arg2, int arg3) {
        if (class24.method188(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class232.method1653(var4 + 1, class208.field3304[arg0][arg1][arg2] + arg3, var5 + 1) && class232.method1653(var4 + 128 - 1, class208.field3304[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class232.method1653(var4 + 128 - 1, class208.field3304[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class232.method1653(var4 + 1, class208.field3304[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V", line = 214)
    public static void method444(byte arg0) {
        field925 = null;
        field926 = null;
        field922 = null;
        if (arg0 > -97) {
            method441(-64, -42, 62, -120, 38, (byte[][][]) ((byte[][][]) null), (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 15, (byte) -41, 122, 74);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)I", line = 227)
    public static final int method445(int arg0, int arg1, int arg2) {
        field923++;
        class255 var3 = (class255) class300.field5062.method1372(false, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4360.length; var5++) {
                if (var3.field4355[var5] == arg2) {
                    var4 += var3.field4360[var5];
                }
            }
            int var6 = 78 / ((arg1 + 45) / 61);
            return var4;
        }
    }
}
