import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class684 {

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "Ltb;")
    private class450 field9608 = new class450(64);

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public int field9613 = 0;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "Lpl;")
    private class612 field9602;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public int field9605;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field9604 = 0;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Ldj;")
    public static class196 field9606;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cp", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field9614;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3852(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V", line = 3)
    public final void method3846(int arg0) {
        class450 var2 = this.field9608;
        synchronized (this.field9608) {
            this.field9608.method2406(18385);
        }
        if (arg0 > -71) {
            method3851(114);
        }
        field9612++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILr;)Z", line = 19)
    public static final boolean method3847(int arg0, int arg1, class566 arg2) {
        field9603++;
        int var3 = (class431.field5395 - 104) / 2;
        int var4 = (class452.field5802 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class367.method2011(var58, arg0, var6, (byte) 108, var57)) {
                        int var59 = var58;
                        if (class3.method22(var57, var6, 5706)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class412.method2182(var57, arg1 - 4, var6, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else if (arg1 == 104) {
            int[] var7 = new int[262144];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = -16777216;
            }
            class570.field7976 = arg2.method1025(var7, 0, 512, 512, 512);
            class306.method1754(arg1 ^ 0xFFFFFF78);
            int var9 = ((int) (Math.random() * 20.0D)) - (-((((int) (Math.random() * 20.0D)) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16)) - 238) - 10 | 0xFF000000;
            int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x1CFFFF00) << 16;
            int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
            boolean[][] var12 = new boolean[class49.field700 + 1][class49.field700 + 1];
            for (int var13 = var3; var13 < var3 + 104; var13 += class49.field700) {
                for (int var36 = var4; var36 < var4 + 104; var36 += class49.field700) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (var13 > 0) {
                        var39 = var13 - 1;
                        var37 += 4;
                    }
                    int var40 = var36;
                    if (var36 > 0) {
                        var40 = var36 - 1;
                    }
                    int var41 = class49.field700 + var13;
                    if (var41 < 104) {
                        var41++;
                    }
                    int var42 = var36 + class49.field700;
                    if (var42 < 104) {
                        var38 += 4;
                        var42++;
                    }
                    arg2.method1083(0, 0, class49.field700 * 4 + var37, class49.field700 * 4 + var38);
                    arg2.method1028(-16777216);
                    for (int var43 = arg0; var43 <= 3; var43++) {
                        for (int var50 = 0; var50 <= class49.field700; var50++) {
                            for (int var56 = 0; var56 <= class49.field700; var56++) {
                                var12[var50][var56] = class367.method2011(var43, arg0, var39 + var50, (byte) 108, var40 + var56);
                            }
                        }
                        class256.field3127[var43].method1280(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class683.field9601) {
                            for (int var51 = -4; var51 < class49.field700; var51++) {
                                for (int var52 = -4; var52 < class49.field700; var52++) {
                                    int var53 = var13 + var51;
                                    int var54 = var36 + var52;
                                    if (var53 >= var3 && var4 <= var54 && class367.method2011(var43, arg0, var53, (byte) 108, var54)) {
                                        int var55 = var43;
                                        if (class3.method22(var54, var53, arg1 + 5602)) {
                                            var55 = var43 - 1;
                                        }
                                        if (var55 >= 0) {
                                            class402.method2138((byte) -10, var55, var53, var51 * 4 + var37, (class49.field700 - var52) * 4 + var38 + -4, var54, arg2, var9, var10);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class683.field9601) {
                        class356 var44 = class154.field1991[arg0];
                        for (int var45 = 0; var45 < class49.field700; var45++) {
                            for (int var46 = 0; var46 < class49.field700; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                int var49 = var44.field4537[var47 - var44.field4555][var48 - var44.field4547];
                                if ((var49 & 0x40240000) != 0) {
                                    arg2.method3118(-1713569622, var45 * 4 + var37, (-var46 + class49.field700) * 4 + (var38 - 4), 1, 4, 4);
                                } else if ((var49 & 0x800000) != 0) {
                                    arg2.method3114((class49.field700 - var46) * 4 + var38 - 4, (byte) 11, var45 * 4 + var37, 4, -1713569622);
                                } else if ((var49 & 0x2000000) != 0) {
                                    arg2.method3109(var45 * 4 + var37 + 3, (byte) 4, -1713569622, 4, (class49.field700 - var46) * 4 + var38 - 4);
                                } else if ((var49 & 0x8000000) != 0) {
                                    arg2.method3114((class49.field700 - var46) * 4 + var38 - 1, (byte) 11, var45 * 4 + var37, 4, -1713569622);
                                } else if ((var49 & 0x20000000) != 0) {
                                    arg2.method3109(var45 * 4 + var37, (byte) 4, -1713569622, 4, (class49.field700 - var46) * 4 + (var38 - 4));
                                }
                            }
                        }
                    }
                    arg2.method1090(var37, var38, class49.field700 * 4, class49.field700 * 4, var11, 2);
                    class570.field7976.method156(((var13 - var3) * 4) + 48, 464 - (-var4 + var36) * 4 + -(class49.field700 * 4), class49.field700 * 4, class49.field700 * 4, var37, var38);
                }
            }
            arg2.method1017();
            arg2.method1028(-16777215);
            class544.method2941(0);
            class651.field9190 = 0;
            class100.field1348.method247(arg1 - 102);
            if (!class683.field9601) {
                for (int var14 = var3; var14 < (var3 + 104); var14++) {
                    for (int var20 = var4; var20 < (var4 + 104); var20++) {
                        for (int var21 = arg0; arg0 + 1 >= var21 && var21 <= 3; var21++) {
                            if (class367.method2011(var21, arg0, var14, (byte) 108, var20)) {
                                class339 var22 = (class339) class279.method1586(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class339) class700.method3933(var21, var14, var20, field9614 == null ? (field9614 = method3852("vda")) : field9614);
                                }
                                if (var22 == null) {
                                    var22 = (class339) class312.method1803(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class339) class480.method2615(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class441 var23 = class428.field5352.method3138((byte) 77, var22.method65((byte) 127));
                                    if (!var23.field5580 || class66.field896) {
                                        int var24 = var23.field5542;
                                        if (var23.field5574 != null) {
                                            for (int var25 = 0; var25 < var23.field5574.length; var25++) {
                                                if (var23.field5574[var25] != -1) {
                                                    class441 var26 = class428.field5352.method3138((byte) 38, var23.field5574[var25]);
                                                    if (var26.field5542 >= 0) {
                                                        var24 = var26.field5542;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class647 var28 = class556.field7727.method3771(var24, 16);
                                                if (var28 != null && var28.field9117) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class154.field1991[var21].field4537;
                                                int var32 = class154.field1991[var21].field4555;
                                                int var33 = class154.field1991[var21].field4547;
                                                for (int var34 = 0; var34 < 10; var34++) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                        var29--;
                                                    }
                                                    if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                        var29++;
                                                    }
                                                    if (var35 == 2 && var4 < var30 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                        var30--;
                                                    }
                                                    if (var35 == 3 && (var4 + 104 - 1) > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                        var30++;
                                                    }
                                                }
                                            }
                                            class530.field7166[class651.field9190] = var23.field5504;
                                            class529.field7160[class651.field9190] = var29;
                                            class77.field1063[class651.field9190] = var30;
                                            class651.field9190++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class61.field827 != null) {
                    class493.field6500.field8600 = 1;
                    class556.field7727.method3777(64, true, 1024);
                    for (int var15 = 0; var15 < class61.field827.field4261; var15++) {
                        int var16 = class61.field827.field4266[var15];
                        if ((var16 >> 28) == class376.field4748.field6470) {
                            int var17 = ((var16 & 0xFFFCB23) >> 14) - class145.field1879;
                            int var18 = (var16 & 0x3FFF) - class630.field8817;
                            if (var17 >= 0 && var17 < class431.field5395 && var18 >= 0 && class452.field5802 > var18) {
                                class100.field1348.method239(new class262(var15), (byte) 93);
                            } else {
                                class647 var19 = class556.field7727.method3771(class61.field827.field4262[var15], 95);
                                if (var19.field9130 != null && var19.field9113 + var17 >= 0 && class431.field5395 > var19.field9131 + var17 && (var19.field9091 + var18) >= 0 && (var18 + var19.field9092) < class452.field5802) {
                                    class100.field1348.method239(new class262(var15), (byte) 93);
                                }
                            }
                        }
                    }
                    class556.field7727.method3777(64, true, 128);
                    class493.field6500.field8600 = 2;
                    class493.field6500.method3355(-27756);
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V", line = 468)
    public final void method3848(byte arg0) {
        class450 var2 = this.field9608;
        synchronized (this.field9608) {
            this.field9608.method2412((byte) 18);
        }
        if (arg0 != 30) {
            this.field9602 = null;
        }
        field9609++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Lng;", line = 484)
    public final class221 method3849(int arg0, byte arg1) {
        field9607++;
        class450 var3 = this.field9608;
        class221 var4;
        synchronized (this.field9608) {
            var4 = (class221) this.field9608.method2418((long) arg0, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field9602;
        byte[] var6;
        synchronized (this.field9602) {
            var6 = this.field9602.method3365(arg0, 19, 4);
        }
        class221 var7 = new class221();
        var7.field2704 = arg0;
        var7.field2694 = this;
        if (var6 != null) {
            var7.method1306(new class630(var6), -3990);
        }
        var7.method1305(3);
        class450 var8 = this.field9608;
        synchronized (this.field9608) {
            if (arg1 != 19) {
                this.field9608 = null;
            }
            this.field9608.method2409((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V", line = 527)
    public final void method3850(int arg0, int arg1) {
        class450 var3 = this.field9608;
        synchronized (this.field9608) {
            if (arg0 != -4) {
                this.method3850(-54, -7);
            }
            this.field9608.method2411(true, arg1);
        }
        field9611++;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V", line = 541)
    public static void method3851(int arg0) {
        field9606 = null;
        if (arg0 != 486539008) {
            method3851(-120);
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 559)
    public class684(class112 arg0, int arg1, class612 arg2) {
        this.field9602 = arg2;
        this.field9605 = this.field9602.method3349(4, true);
    }
}
