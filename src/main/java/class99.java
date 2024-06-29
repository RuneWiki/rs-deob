import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class99 extends class117 {

    @OriginalMember(owner = "client!qo", name = "P", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!qo", name = "J", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!qo", name = "N", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "[I")
    public static int[] field1402 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    public static int field1409 = 0;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "I")
    public static int field1421 = 2;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Lc;")
    public static class142 field1394 = new class142(0, 0);

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!qo", name = "O", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!qo", name = "Q", descriptor = "Lkc;")
    public static class29 field1425;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Lph;")
    public static class361 field1400;

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "Lph;")
    public static class361 field1411;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "Lph;")
    public static class361 field1416;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V", line = 4)
    public static void method775(byte arg0) {
        if (arg0 > -44) {
            field1425 = (class29) null;
        }
        field1400 = null;
        field1402 = null;
        field1411 = null;
        field1425 = null;
        field1394 = null;
        field1416 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZII)Z", line = 21)
    public final boolean method776(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return true;
        } else {
            field1414++;
            return this.field1413 == arg3 && this.field1418 <= arg0 && this.field1408 >= arg0 && arg2 >= this.field1407 && this.field1424 >= arg2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)Z", line = 37)
    public final boolean method777(int arg0, int arg1, int arg2) {
        field1403++;
        if (arg0 != 2) {
            this.field1406 = -92;
        }
        return this.field1418 <= arg1 && arg1 <= this.field1408 && arg2 >= this.field1407 && this.field1424 >= arg2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 52)
    public static final byte[] method778(Object arg0, boolean arg1, int arg2) {
        field1417++;
        if (arg2 != 2) {
            field1401 = 11;
        }
        if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class121.method898(false, var4) : var4;
        } else if ((arg0 instanceof class170)) {
            class170 var3 = (class170) arg0;
            return var3.method1197(2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[III)V", line = 99)
    public final void method779(int arg0, int[] arg1, int arg2, int arg3) {
        field1397++;
        arg1[2] = arg0 + this.field1407 - this.field1422;
        arg1[0] = this.field1413;
        if (arg2 >= -86) {
            field1400 = (class361) null;
        }
        arg1[1] = arg3 + this.field1418 - this.field1406;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)Z", line = 114)
    public final boolean method780(int arg0, byte arg1, int arg2) {
        int var4 = -89 % ((arg1 - 43) / 41);
        field1395++;
        return arg0 >= this.field1406 && this.field1396 >= arg0 && this.field1422 <= arg2 && this.field1420 >= arg2;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I[III)V", line = 129)
    public final void method781(int arg0, int[] arg1, int arg2, int arg3) {
        field1415++;
        arg1[0] = this.field1410;
        arg1[1] = this.field1406 + arg0 - this.field1418;
        if (arg2 <= -44) {
            arg1[2] = arg3 + this.field1422 - this.field1407;
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V", line = 142)
    public static final void method782(int arg0) {
        field1398++;
        for (int var1 = arg0; var1 < class30.field420; var1++) {
            class12 var2 = class262.method1946(var1, 121);
            if (var2 != null && var2.field188 == 0) {
                class307.field4594[var1] = 0;
                class227.field3423[var1] = 0;
            }
        }
        class64.field918 = new class196(16);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BIIIIII)V", line = 172)
    public static final void method783(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class30.method211(arg3, (byte) -85);
        int var7 = 0;
        field1405++;
        int var8 = -arg3;
        int var9 = arg3 - arg2;
        int var10 = arg3;
        if (arg0 >= -56) {
            method785(56, 98, -54);
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        if (class326.field4901 <= arg4 && class261.field3911 >= arg4) {
            int[] var15 = class274.field4158[arg4];
            int var16 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 - arg3);
            int var17 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 + arg3);
            int var18 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 - var9);
            int var19 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 + var9);
            class329.method2285(var16, var15, (byte) -108, var18, arg6);
            class329.method2285(var18, var15, (byte) 115, var19, arg5);
            class329.method2285(var19, var15, (byte) -112, var17, arg6);
        }
        while (var10 > var7) {
            var13 += 2;
            var14 += 2;
            var8 += var14;
            var12 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class347.field5364[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var8 >= 0) {
                var10--;
                var8 -= var10 << 1;
                int var20 = arg4 + var10;
                int var21 = arg4 - var10;
                if (var20 >= class326.field4901 && var21 <= class261.field3911) {
                    if (var10 < var9) {
                        int var22 = class347.field5364[var10];
                        int var23 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 + var7);
                        int var24 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 - var7);
                        int var25 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 + var22);
                        int var26 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 - var22);
                        if (var20 <= class261.field3911) {
                            int[] var27 = class274.field4158[var20];
                            class329.method2285(var24, var27, (byte) 80, var26, arg6);
                            class329.method2285(var26, var27, (byte) 116, var25, arg5);
                            class329.method2285(var25, var27, (byte) 112, var23, arg6);
                        }
                        if (class326.field4901 <= var21) {
                            int[] var28 = class274.field4158[var21];
                            class329.method2285(var24, var28, (byte) -52, var26, arg6);
                            class329.method2285(var26, var28, (byte) 78, var25, arg5);
                            class329.method2285(var25, var28, (byte) 112, var23, arg6);
                        }
                    } else {
                        int var29 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 + var7);
                        int var30 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 - var7);
                        if (class261.field3911 >= var20) {
                            class329.method2285(var30, class274.field4158[var20], (byte) -107, var29, arg6);
                        }
                        if (var21 >= class326.field4901) {
                            class329.method2285(var30, class274.field4158[var21], (byte) -62, var29, arg6);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (class326.field4901 <= var32 && class261.field3911 >= var31) {
                int var33 = arg1 + var10;
                int var34 = arg1 - var10;
                if (class355.field5452 <= var33 && var34 <= class348.field5378) {
                    int var35 = class251.method1840((byte) 107, class348.field5378, class355.field5452, var33);
                    int var36 = class251.method1840((byte) 107, class348.field5378, class355.field5452, var34);
                    if (var7 < var9) {
                        int var37 = var11 >= var7 ? var11 : class347.field5364[var7];
                        int var38 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 + var37);
                        int var39 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg1 - var37);
                        if (var32 <= class261.field3911) {
                            int[] var40 = class274.field4158[var32];
                            class329.method2285(var36, var40, (byte) -127, var39, arg6);
                            class329.method2285(var39, var40, (byte) 119, var38, arg5);
                            class329.method2285(var38, var40, (byte) -50, var35, arg6);
                        }
                        if (var31 >= class326.field4901) {
                            int[] var41 = class274.field4158[var31];
                            class329.method2285(var36, var41, (byte) -62, var39, arg6);
                            class329.method2285(var39, var41, (byte) -86, var38, arg5);
                            class329.method2285(var38, var41, (byte) 78, var35, arg6);
                        }
                    } else {
                        if (var32 <= class261.field3911) {
                            class329.method2285(var36, class274.field4158[var32], (byte) -54, var35, arg6);
                        }
                        if (var31 >= class326.field4901) {
                            class329.method2285(var36, class274.field4158[var31], (byte) -103, var35, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V", line = 388)
    public static final void method784(int arg0) {
        field1419++;
        if (class95.field1325) {
            return;
        }
        if (class274.field4156) {
            class103.field1476 = (float) ((int) class103.field1476 + 47 & 0xFFFFFFF0);
        } else {
            class354.field5443 += (12.0F - class354.field5443) / 2.0F;
        }
        if (arg0 > 51) {
            class71.field1010 = true;
            class95.field1325 = true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V", line = 412)
    public static final void method785(int arg0, int arg1, int arg2) {
        class247.field3658 = new class57(arg0);
        if (arg2 != 0) {
            method783((byte) 104, -55, 117, 19, 11, 113, -101);
        }
        class59.field866 = new class57(arg1);
        field1423++;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 422)
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1424 = arg5;
        this.field1407 = arg3;
        this.field1406 = arg6;
        this.field1418 = arg2;
        this.field1408 = arg4;
        this.field1396 = arg8;
        this.field1422 = arg7;
        this.field1410 = arg1;
        this.field1413 = arg0;
        this.field1420 = arg9;
    }
}
