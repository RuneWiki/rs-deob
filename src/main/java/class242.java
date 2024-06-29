import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class242 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Z")
    public boolean field4187 = true;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public int field4194 = 0;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field4191 = -1;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field4199 = -1;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lsb;")
    private static class98 field4193 = class47.method368("OFF", 0);

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lsb;")
    public static class98 field4198 = class47.method368(")1j", 0);

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lsb;")
    public static class98 field4200 = field4193;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Llj;")
    public static class216 field4192 = new class216(8);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field4202 = 0;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "J")
    public static long field4201 = 0L;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method1667(int arg0) {
        if (arg0 != -29581) {
            field4198 = null;
        }
        field4193 = null;
        field4198 = null;
        field4192 = null;
        field4200 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILlj;)V")
    public final void method1668(int arg0, int arg1, class216 arg2) {
        int var4 = -24 / ((arg0 - 3) / 59);
        while (true) {
            int var5 = arg2.method1446(5350);
            if (var5 == 0) {
                field4190++;
                return;
            }
            this.method1670(var5, (byte) -86, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
    public static final void method1669(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4195++;
        if (arg3 != 16488) {
            field4192 = null;
        }
        int var5 = 0;
        int var6 = -arg2;
        int var7 = arg2;
        int var8 = -1;
        int var9 = class47.method369(2, arg0 + arg2, class229.field3933, class106.field1899);
        int var10 = class47.method369(2, arg0 - arg2, class229.field3933, class106.field1899);
        class37.method305(-7, class43.field721[arg4], var9, arg1, var10);
        while (var5 < var7) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var7--;
                var6 -= var7 << 1;
                int var11 = arg4 - var7;
                int var12 = arg4 + var7;
                if (class116.field2077 <= var12 && var11 <= class215.field3666) {
                    int var13 = class47.method369(arg3 ^ 0x406A, arg0 + var5, class229.field3933, class106.field1899);
                    int var14 = class47.method369(2, arg0 - var5, class229.field3933, class106.field1899);
                    if (var12 <= class215.field3666) {
                        class37.method305(-7, class43.field721[var12], var13, arg1, var14);
                    }
                    if (class116.field2077 <= var11) {
                        class37.method305(-7, class43.field721[var11], var13, arg1, var14);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class116.field2077 <= var16 && class215.field3666 >= var15) {
                int var17 = class47.method369(2, arg0 + var7, class229.field3933, class106.field1899);
                int var18 = class47.method369(2, arg0 - var7, class229.field3933, class106.field1899);
                if (var16 <= class215.field3666) {
                    class37.method305(-7, class43.field721[var16], var17, arg1, var18);
                }
                if (class116.field2077 <= var15) {
                    class37.method305(-7, class43.field721[var15], var17, arg1, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLlj;I)V")
    private final void method1670(int arg0, byte arg1, class216 arg2, int arg3) {
        if (arg1 != -86) {
            this.field4187 = false;
        }
        if (arg0 == 1) {
            this.field4194 = class237.method1619(-1, arg2.method1448(26420));
        } else if (arg0 == 2) {
            this.field4191 = arg2.method1446(5350);
        } else if (arg0 == 3) {
            this.field4191 = arg2.method1487(113);
            if (this.field4191 == 65535) {
                this.field4191 = -1;
            }
        } else if (arg0 == 5) {
            this.field4187 = false;
        } else if (arg0 == 7) {
            this.field4199 = class237.method1619(-1, arg2.method1448(26420));
        } else if (arg0 == 8) {
            class2.field39 = arg3;
        } else if (arg0 == 9) {
            arg2.method1487(59);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg2.method1446(5350);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg2.method1448(26420);
                } else if (arg0 == 14) {
                    arg2.method1446(5350);
                }
            }
        }
        field4188++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method1671(byte arg0) {
        field4197++;
        for (class262 var1 = (class262) class153.field2794.method371((byte) 61); var1 != null; var1 = (class262) class153.field2794.method370(true)) {
            if (var1.field4608 == -1) {
                var1.field4601 = 0;
                class205.method1383(1115, var1);
            } else {
                var1.method1611((byte) -20);
            }
        }
        if (arg0 != -123) {
            method1669(25, 81, 9, -27, 26);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILtg;)V")
    public static final void method1672(int arg0, class75 arg1) {
        field4196++;
        class246.field4335 = class80.method599(false, 0, class246.field4333, arg1);
        class220.field3792 = new class24[class246.field4335.length];
        class13.field250 = new class24[class246.field4335.length];
        class243.field4218 = new class24[class246.field4335.length];
        for (int var2 = 0; var2 < class246.field4335.length; var2++) {
            class246.field4335[var2].method261();
            class220.field3792[var2] = class246.field4335[var2].method257();
            class246.field4335[var2].method261();
            class13.field250[var2] = class246.field4335[var2].method257();
            class246.field4335[var2].method261();
            class243.field4218[var2] = class246.field4335[var2].method257();
            class246.field4335[var2].method261();
        }
        class23.field467 = class215.method1430(9893, arg1, 0, class41.field682);
        class32.field560 = class112.method843(0, arg1, 83, class43.field705);
        class265.field4642 = class112.method843(0, arg1, arg0 ^ 0x38, class229.field3944);
        class93.field1638 = class112.method843(0, arg1, 35, class28.field524);
        class117.field2102 = class112.method843(0, arg1, 93, class43.field730);
        class14.field276 = client.method770(class134.field2364, 0, arg1, 0);
        class156.field2850 = client.method770(class28.field515, arg0 ^ 0x15, arg1, 0);
        class262.field4599 = class253.method1752(arg1, class121.field2224, 0, -110);
        class203.field3462 = client.method770(class113.field2017, 0, arg1, 0);
        class204.field3487 = client.method770(class75.field1326, arg0 ^ 0x15, arg1, 0);
        class92.field1621 = class49.method384(arg1, 0, 0, class161.field2914);
        class192.field3359 = class49.method384(arg1, 0, 0, class169.field2990);
        class134.field2369.method536(class192.field3359, (int[]) null);
        class23.field471.method536(class192.field3359, (int[]) null);
        class90.field1581.method536(class192.field3359, (int[]) null);
        class247 var3 = class245.method1691(class86.field1513, false, 0, arg1);
        var3.method1716();
        class53.field854 = var3;
        class247[] var4 = class215.method1430(9893, arg1, 0, class180.field3100);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1716();
        }
        int var6 = (int) ((double) arg0 * Math.random()) - 10;
        class67.field1075 = var4;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class23.field467.length; var10++) {
            class23.field467[var10].method1709(var6 + var9, var8 + var9, var7 + var9);
        }
        class246.field4335[0].method252(var6 + var9, var8 + var9, var7 + var9);
        class235.field4068 = class23.field467;
    }
}
