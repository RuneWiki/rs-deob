import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class294 {

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4369 = 0;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4368 = 0;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[Ljk;")
    public static class324[] field4367 = new class324[8];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lpn;")
    public static class170 field4371;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[[[B")
    public static byte[][][] field4370;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIBII)V", line = 6)
    public static final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4366++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = arg7 - arg6;
        int var11 = 0;
        int var12 = arg1 - arg6;
        int var13 = arg1 * arg1;
        int var14 = arg7 * arg7;
        int var15 = var10 * var10;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = 125 / ((arg5 + 58) / 36);
        int var19 = var14 << 1;
        int var20 = var16 << 1;
        int var21 = arg1 << 1;
        int var22 = (1 - var21) * var14 + var17;
        int var23 = var12 << 1;
        int var24 = var15 << 1;
        int var25 = var13 - ((var21 - 1) * var19);
        int var26 = var16 - ((var23 - 1) * var24);
        int var27 = (1 - var23) * var15 + var20;
        int var28 = var16 << 2;
        int var29 = var13 << 2;
        int var30 = var14 << 2;
        int var31 = var15 << 2;
        int var32 = var17 * 3;
        int var33 = (var21 - 3) * var19;
        int var34 = var20 * 3;
        int var35 = var29;
        int var36 = var28;
        int var37 = (arg1 - 1) * var30;
        int var38 = (var12 - 1) * var31;
        int[] var39 = class126.field1723[arg0];
        class190.method1329(var39, arg2 - var10, arg4, (byte) -87, arg2 - arg7);
        int var40 = (var23 - 3) * var24;
        class190.method1329(var39, arg2 + var10, arg3, (byte) -126, arg2 - var10);
        class190.method1329(var39, arg2 + arg7, arg4, (byte) -83, arg2 + var10);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var32;
                    var32 += var29;
                    var25 += var35;
                    var8++;
                    var35 += var29;
                }
            }
            boolean var41 = var12 >= var9;
            if (var25 < 0) {
                var22 += var32;
                var8++;
                var25 += var35;
                var32 += var29;
                var35 += var29;
            }
            var22 += -var37;
            var37 -= var30;
            if (var41) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var26 += var36;
                        var27 += var34;
                        var34 += var28;
                        var36 += var28;
                        var11++;
                    }
                }
                if (var26 < 0) {
                    var11++;
                    var26 += var36;
                    var27 += var34;
                    var34 += var28;
                    var36 += var28;
                }
                var27 += -var38;
                var38 -= var31;
                var26 += -var40;
                var40 -= var31;
            }
            int var42 = arg2 + var8;
            int var43 = arg2 - var8;
            var9--;
            int var44 = arg0 + var9;
            int var45 = arg0 - var9;
            var25 += -var33;
            var33 -= var30;
            if (var41) {
                int var46 = arg2 + var11;
                int var47 = arg2 - var11;
                class190.method1329(class126.field1723[var45], var47, arg4, (byte) -107, var43);
                class190.method1329(class126.field1723[var45], var46, arg3, (byte) -89, var47);
                class190.method1329(class126.field1723[var45], var42, arg4, (byte) -114, var46);
                class190.method1329(class126.field1723[var44], var47, arg4, (byte) -88, var43);
                class190.method1329(class126.field1723[var44], var46, arg3, (byte) -82, var47);
                class190.method1329(class126.field1723[var44], var42, arg4, (byte) -121, var46);
            } else {
                class190.method1329(class126.field1723[var45], var42, arg4, (byte) -100, var43);
                class190.method1329(class126.field1723[var44], var42, arg4, (byte) -101, var43);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V", line = 176)
    public static final void method2004(int arg0, int arg1, int arg2, int arg3) {
        class202 var4 = class142.field1940[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class269 var5 = var4.field2879;
        if (var5 != null) {
            var5.field3985 = var5.field3985 * arg3 / 16;
            var5.field3991 = var5.field3991 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 206)
    public static void method2005(byte arg0) {
        field4370 = (byte[][][]) null;
        field4371 = null;
        if (arg0 != 50) {
            field4370 = (byte[][][]) ((byte[][][]) null);
        }
        field4367 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 218)
    public static final void method2006(int arg0) {
        class148.field2053.method717((byte) 49);
        if (arg0 >= -32) {
            field4369 = 107;
        }
        class257.field3796.method717((byte) 75);
        field4372++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIILq;I)Lq;", line = 238)
    public static final class345 method2007(int arg0, int arg1, int arg2, int arg3, int arg4, class345 arg5, int arg6) {
        field4364++;
        long var7 = (long) arg4;
        class345 var9 = (class345) class306.field4589.method716(var7, false);
        if (var9 == null) {
            class308 var10 = class308.method2089(class249.field3579, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2097(64, 768, -50, -10, -50);
            class306.field4589.method721(var7, var9, 0);
        }
        int var11 = arg5.method316();
        int var12 = arg5.method347();
        int var13 = arg5.method313();
        int var14 = arg5.method343();
        if (arg1 != 16) {
            return (class345) null;
        }
        class345 var15 = var9.method323(true, true, true);
        if (arg6 != 0) {
            var15.method335(arg6);
        }
        if (class67.field908) {
            class267 var18 = (class267) var15;
            if (arg0 != class135.method985(arg3 + var13, class251.field3603, arg2 + var11, (byte) -92) || arg0 != class135.method985(arg3 + var14, class251.field3603, arg2 + var12, (byte) -104)) {
                for (int var19 = 0; var19 < var18.field3894; var19++) {
                    var18.field3916[var19] += class135.method985(var18.field3886[var19] + arg3, class251.field3603, var18.field3904[var19] + arg2, (byte) -92) - arg0;
                }
                var18.field3890.field5120 = false;
                var18.field3915.field3065 = false;
            }
        } else {
            class50 var16 = (class50) var15;
            if (class135.method985(arg3 + var13, class251.field3603, arg2 + var11, (byte) -106) != arg0 || class135.method985(arg3 + var14, class251.field3603, arg2 + var12, (byte) -90) != arg0) {
                for (int var17 = 0; var17 < var16.field609; var17++) {
                    var16.field642[var17] += class135.method985(var16.field611[var17] + arg3, class251.field3603, var16.field638[var17] + arg2, (byte) -104) - arg0;
                }
                var16.field629 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I", line = 322)
    public static final int method2008(byte arg0, int arg1) {
        field4365++;
        return arg0 == 76 ? arg1 & 0xFF : -34;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B)V")
    public abstract void method1489(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method1488(boolean arg0);
}
