import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class165 {

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3046 = 0;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lhh;")
    public static class163 field3045 = class137.method1065("floorshadows", 17);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lv;")
    public static class22 field3050;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lqh;")
    public static class69 field3043;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lv;ZLvg;I)V")
    public static final void method1238(class22 arg0, boolean arg1, class262 arg2, int arg3) {
        if (arg1) {
            field3043 = null;
        }
        field3047++;
        byte[] var4 = null;
        class128 var5 = class250.field4395;
        synchronized (class250.field4395) {
            for (class103 var6 = (class103) class250.field4395.method1017(103); var6 != null; var6 = (class103) class250.field4395.method1016((byte) -31)) {
                if ((long) arg3 == var6.field2641 && var6.field1976 == arg2 && var6.field1979 == 0) {
                    var4 = var6.field1981;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method1772(16711680, arg3);
            arg0.method144(true, !arg1, var7, arg3, arg2);
        } else {
            arg0.method144(true, true, var4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()Z")
    public boolean method295() {
        field3042++;
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
    public void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            this.method28(76, 70, -21, -125, -115);
        }
        field3041++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3044++;
        if (arg1 >= 1 && arg5 >= 1 && arg1 <= 102 && arg5 <= 102) {
            if (!class177.method1310(4643) && (class123.field2344[0][arg1][arg5] & 0x2) == 0) {
                int var8 = arg3;
                if ((class123.field2344[arg3][arg1][arg5] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class233.field4167 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (class123.field2344[1][arg1][arg5] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class124.method991(var9, arg0, arg1, arg5, class140.field2670[arg3], 21626, arg3);
            if (arg6 >= 0) {
                boolean var10 = class119.field2247;
                class119.field2247 = true;
                class218.method1549(false, true, arg4, arg6, class140.field2670[arg3], arg5, arg1, false, arg3, var9, arg7);
                class119.field2247 = var10;
            }
        }
        if (arg2 > -37) {
            method1241(23, (byte) 127, -23, 115, -43, -59, 86);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lta;IIIZ)V")
    public void method306(class165 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3049++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILqh;)Lhh;")
    public static final class163 method1240(int arg0, class69 arg1) {
        field3038++;
        if (class100.method807(4096, client.method826(arg1)) == 0) {
            return null;
        } else if (arg0 != -1) {
            return null;
        } else if (arg1.field1206 == null || arg1.field1206.method1194(1).method1221(arg0 ^ 0x5A37) == 0) {
            return class127.field2470 ? class3.field62 : null;
        } else {
            return arg1.field1206;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1241(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class106.method859(false, arg3);
        int var7 = arg3 - arg5;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        field3048++;
        int var9 = arg3;
        int var10 = -arg3;
        if (arg1 != 76) {
            method1241(54, (byte) 114, 55, -90, 92, -67, -24);
        }
        int var11 = var7;
        int var12 = -var7;
        if (arg0 >= class182.field3344 && arg0 <= class201.field3593) {
            int[] var13 = class85.field1605[arg0];
            int var14 = class221.method1561(class127.field2465, (byte) -42, arg6 - arg3, class252.field4407);
            int var15 = class221.method1561(class127.field2465, (byte) -42, arg3 + arg6, class252.field4407);
            int var16 = class221.method1561(class127.field2465, (byte) -42, arg6 - var7, class252.field4407);
            int var17 = class221.method1561(class127.field2465, (byte) -42, arg6 + var7, class252.field4407);
            class227.method1585(var14, (byte) -66, arg4, var13, var16);
            class227.method1585(var16, (byte) -66, arg2, var13, var17);
            class227.method1585(var17, (byte) -66, arg4, var13, var15);
        }
        int var18 = -1;
        int var19 = -1;
        while (var9 > var8) {
            var19 += 2;
            var18 += 2;
            var12 += var19;
            var10 += var18;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class240.field4282[var11] = var8;
            }
            var8++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (class182.field3344 <= var21 && class201.field3593 >= var20) {
                    if (var7 <= var9) {
                        int var22 = class221.method1561(class127.field2465, (byte) -42, arg6 + var8, class252.field4407);
                        int var23 = class221.method1561(class127.field2465, (byte) -42, arg6 - var8, class252.field4407);
                        if (var21 <= class201.field3593) {
                            class227.method1585(var23, (byte) -66, arg4, class85.field1605[var21], var22);
                        }
                        if (class182.field3344 <= var20) {
                            class227.method1585(var23, (byte) -66, arg4, class85.field1605[var20], var22);
                        }
                    } else {
                        int var24 = class240.field4282[var9];
                        int var25 = class221.method1561(class127.field2465, (byte) -42, arg6 + var8, class252.field4407);
                        int var26 = class221.method1561(class127.field2465, (byte) -42, arg6 - var8, class252.field4407);
                        int var27 = class221.method1561(class127.field2465, (byte) -42, arg6 + var24, class252.field4407);
                        int var28 = class221.method1561(class127.field2465, (byte) -42, arg6 - var24, class252.field4407);
                        if (var21 <= class201.field3593) {
                            int[] var29 = class85.field1605[var21];
                            class227.method1585(var26, (byte) -66, arg4, var29, var28);
                            class227.method1585(var28, (byte) -66, arg2, var29, var27);
                            class227.method1585(var27, (byte) -66, arg4, var29, var25);
                        }
                        if (var20 >= class182.field3344) {
                            int[] var30 = class85.field1605[var20];
                            class227.method1585(var26, (byte) -66, arg4, var30, var28);
                            class227.method1585(var28, (byte) -66, arg2, var30, var27);
                            class227.method1585(var27, (byte) -66, arg4, var30, var25);
                        }
                    }
                }
            }
            int var31 = arg0 + var8;
            int var32 = arg0 - var8;
            if (var31 >= class182.field3344 && var32 <= class201.field3593) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class127.field2465 && var34 <= class252.field4407) {
                    int var35 = class221.method1561(class127.field2465, (byte) -42, var33, class252.field4407);
                    int var36 = class221.method1561(class127.field2465, (byte) -42, var34, class252.field4407);
                    if (var8 < var7) {
                        int var37 = var11 >= var8 ? var11 : class240.field4282[var8];
                        int var38 = class221.method1561(class127.field2465, (byte) -42, arg6 + var37, class252.field4407);
                        int var39 = class221.method1561(class127.field2465, (byte) -42, arg6 - var37, class252.field4407);
                        if (var31 <= class201.field3593) {
                            int[] var40 = class85.field1605[var31];
                            class227.method1585(var36, (byte) -66, arg4, var40, var39);
                            class227.method1585(var39, (byte) -66, arg2, var40, var38);
                            class227.method1585(var38, (byte) -66, arg4, var40, var35);
                        }
                        if (var32 >= class182.field3344) {
                            int[] var41 = class85.field1605[var32];
                            class227.method1585(var36, (byte) -66, arg4, var41, var39);
                            class227.method1585(var39, (byte) -66, arg2, var41, var38);
                            class227.method1585(var38, (byte) -66, arg4, var41, var35);
                        }
                    } else {
                        if (var31 <= class201.field3593) {
                            class227.method1585(var36, (byte) -66, arg4, class85.field1605[var31], var35);
                        }
                        if (var32 >= class182.field3344) {
                            class227.method1585(var36, (byte) -66, arg4, class85.field1605[var32], var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field3043 = null;
        field3050 = null;
        field3045 = null;
        int var1 = 97 % ((arg0 + 47) / 37);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()I")
    public abstract int method21();

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Lqf;")
    public static final class104 method1243(int arg0) {
        if (arg0 <= 15) {
            method1241(-26, (byte) -92, -25, -93, -118, -14, -126);
        }
        field3040++;
        try {
            return (class104) Class.forName("vc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class107();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Lta;")
    public class165 method284(int arg0, int arg1, int arg2) {
        field3039++;
        return this;
    }
}
