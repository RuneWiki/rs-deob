import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class184 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lok;")
    public static class41 field3005 = class137.method956("scape main", 45);

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[Lqa;")
    public static class79[] field3006 = new class79[0];

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[I")
    public static int[] field3007;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[[[I")
    public static int[][][] field3008;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 8)
    public static final void method1335(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class272.field4434 * 128) {
            arg0 = class272.field4434 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class65.field996 * 128) {
            arg2 = class65.field996 * 128 - 1;
        }
        class196.field3162 = class31.field450[arg3];
        class178.field2885 = class31.field455[arg3];
        class128.field1905 = class31.field450[arg4];
        class286.field4659 = class31.field455[arg4];
        class140.field2155 = arg0;
        class299.field4843 = arg1;
        class302.field5027 = arg2;
        class86.field1259 = arg0 / 128;
        class30.field429 = arg2 / 128;
        class236.field3798 = class86.field1259 - class122.field1816;
        if (class236.field3798 < 0) {
            class236.field3798 = 0;
        }
        class238.field3816 = class30.field429 - class122.field1816;
        if (class238.field3816 < 0) {
            class238.field3816 = 0;
        }
        class169.field2691 = class86.field1259 + class122.field1816;
        if (class169.field2691 > class272.field4434) {
            class169.field2691 = class272.field4434;
        }
        class171.field2728 = class30.field429 + class122.field1816;
        if (class171.field2728 > class65.field996) {
            class171.field2728 = class65.field996;
        }
        short var15;
        if (class166.field2625) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class122.field1816 + class122.field1816 + 2; var16++) {
            for (int var17 = 0; var17 < class122.field1816 + class122.field1816 + 2; var17++) {
                int var18 = (var16 - class122.field1816 << 7) - (class140.field2155 & 0x7F);
                int var19 = (var17 - class122.field1816 << 7) - (class302.field5027 & 0x7F);
                int var20 = class86.field1259 + var16 - class122.field1816;
                int var21 = class30.field429 + var17 - class122.field1816;
                if (var20 >= 0 && var21 >= 0 && var20 < class272.field4434 && var21 < class65.field996) {
                    int var22;
                    if (field3008 == null) {
                        var22 = class214.field3443[0][var20][var21] + 128 - class299.field4843;
                    } else {
                        var22 = field3008[0][var20][var21] + 128 - class299.field4843;
                    }
                    int var23 = class214.field3443[3][var20][var21] - class299.field4843 - 1000;
                    class141.field2173[var16][var17] = class93.method665(var18, var23, var22, var19, var15);
                } else {
                    class141.field2173[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class122.field1816 + class122.field1816 + 1; var24++) {
            for (int var25 = 0; var25 < class122.field1816 + class122.field1816 + 1; var25++) {
                class113.field1668[var24][var25] = class141.field2173[var24][var25] || class141.field2173[var24 + 1][var25] || class141.field2173[var24][var25 + 1] || class141.field2173[var24 + 1][var25 + 1];
            }
        }
        class202.field3242 = arg6;
        class59.field859 = arg7;
        class95.field1418 = arg8;
        class119.field1749 = arg9;
        class122.field1815 = arg10;
        class160.method1130();
        if (class207.field3356 != null) {
            class201.method1427(true);
            class16.method74(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class166.field2625) {
                class226.field3610 = false;
                class274.method1934(0, 0, (byte) -126);
                class58.method407((float[]) null);
                class179.method1274();
            }
            class201.method1427(false);
        }
        class16.method74(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 144)
    public static final void method1336(int arg0) {
        class57.method401((byte) 69);
        System.gc();
        class282.method1991(-8, arg0);
        field3010++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V", line = 154)
    public static final void method1337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class297.field4797 = arg3;
        class24.field371 = arg0;
        int var6 = -40 % ((arg4 - 30) / 43);
        class315.field5326 = arg1;
        class95.field1405 = arg5;
        field3009++;
        class65.field998 = arg2;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V", line = 187)
    public static void method1338(int arg0) {
        field3008 = (int[][][]) null;
        field3007 = null;
        if (arg0 >= 0) {
            field3005 = (class41) null;
        }
        field3006 = null;
        field3005 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Lqk;")
    public abstract class2 method660(int arg0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)V")
    public abstract void method655(int arg0, byte arg1);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[B")
    public abstract byte[] method659(int arg0, int arg1);

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)I")
    public abstract int method653(int arg0, int arg1);
}
