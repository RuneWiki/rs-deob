import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 extends InputStream {

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[I")
    public static int[] field49 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!se", name = "b", descriptor = "[I")
    public static int[] field45 = new int[5];

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Z")
    public static boolean field51 = false;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Ltl;")
    public static class59 field53 = class85.method639("1", 9588);

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lpc;")
    public static class118 field44;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[[[I")
    public static int[][][] field57;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)J", line = 7)
    public static final long method25(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        return var3 == null || var3.field4098 == null ? 0L : var3.field4098.field3325;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V", line = 15)
    public static final void method26(int arg0, int arg1, int arg2) {
        field46++;
        class186 var3 = class67.method561(32, arg0, 5);
        var3.method1380(arg1 - 10528);
        var3.field3117 = arg2;
        if (arg1 != 13821) {
            field53 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 30)
    public static final void method27(int arg0) {
        class297.field5088.method1484(false);
        if (arg0 >= -19) {
            method27(123);
        }
        field48++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 41)
    public static final void method28(int arg0, int arg1) {
        field47++;
        class100.field1624 = arg0;
        if (arg1 < -46) {
            class69.field1065 = -1;
            class69.field1065 = -1;
            class64.method528(126);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIII)V", line = 58)
    public static final void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg4 && arg6 == arg8 && arg2 == arg7 && arg1 == arg5) {
            class94.method687(1112685644, arg6, arg3, arg7, arg0, arg1);
        } else {
            int var10 = arg0;
            int var11 = arg6;
            int var12 = arg0 * 3;
            int var13 = arg6 * 3;
            int var14 = arg4 * 3;
            int var15 = arg8 * 3;
            int var16 = arg2 * 3;
            int var17 = arg5 * 3;
            int var18 = var15 + arg1 - arg6 - var17;
            int var19 = arg7 + var14 - var16 - arg0;
            int var20 = var17 - var15 - (var15 - var13);
            int var21 = var14 - var12;
            int var22 = var15 - var13;
            int var23 = var16 + var12 - var14 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var23 * var25;
                int var30 = var20 * var25;
                int var31 = var21 * var24;
                int var32 = var22 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg0;
                int var34 = arg6 + (var28 + var30 + var32 >> 12);
                class94.method687(1112685644, var11, arg3, var33, var10, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg9 != 128) {
            method26(0, -94, 20);
        }
        field55++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIZI)V", line = 141)
    public static final void method30(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (!arg5) {
            method29(48, 101, 4, 110, 86, -12, -89, -125, 21, 43);
        }
        field52++;
        if ((arg4 - arg2) >= class69.field1061 && class153.field2504 >= (arg2 + arg4) && class28.field369 <= arg6 - arg2 && class62.field957 >= arg6 + arg2) {
            class41.method266((byte) 79, arg2, arg0, arg6, arg3, arg4, arg1);
        } else {
            class215.method1494(-1, arg2, arg1, arg0, arg4, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 161)
    public static void method31(boolean arg0) {
        field57 = (int[][][]) null;
        if (!arg0) {
            method27(-34);
        }
        field49 = null;
        field45 = null;
        field53 = null;
        field44 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BII)Z", line = 183)
    public static final boolean method32(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        class170 var5 = new class170(arg1);
        int var6 = arg2;
        field54++;
        label58: while (true) {
            int var7 = var5.method1240(true);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1249(false);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = arg3 + var12;
                    int var15 = var5.method1221(arg2 ^ 0xFFFFFF94) >> 2;
                    int var16 = arg0 + var13;
                    if (var14 > 0 && var16 > 0 && var14 < 103 && var16 < 103) {
                        class180 var17 = class188.method1390(var6, false);
                        if (var15 != 22 || class198.field3288 || var17.field2944 != 0 || var17.field3011 == 1 || var17.field2991) {
                            if (!var17.method1337(-122)) {
                                var4 = false;
                                class200.field3316++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1249(false);
                if (var10 == 0) {
                    break;
                }
                var5.method1221(71);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "read", descriptor = "()I", line = 272)
    public final int read() {
        field50++;
        class183.method1360(false, 30000L);
        return -1;
    }
}
