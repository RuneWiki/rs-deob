import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class196 extends class2 {

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    private int field3515 = 0;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lnc;")
    private class85 field3506 = new class85(16);

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    private int field3542 = 0;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "Lgk;")
    private class157 field3545 = new class157();

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "J")
    private long field3547 = 0L;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lcg;")
    private class166 field3534;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    private int field3535;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "Z")
    private boolean field3543;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "Lgk;")
    private class157 field3544;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lcg;")
    private class166 field3523;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lca;")
    private class263 field3518;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    private int field3511;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "Z")
    private boolean field3548;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    private int field3540;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lej;")
    private class50 field3510;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Ldf;")
    private class55 field3528;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Lid;")
    public static class149 field3513 = class60.method382("huffman", (byte) 16);

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Lid;")
    public static class149 field3532 = class60.method382("", (byte) 23);

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "Lid;")
    public static class149 field3530 = class60.method382(":", (byte) 92);

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field3538 = 0;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Ldb;")
    private class17 field3524;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "Z")
    private boolean field3546;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "[B")
    private byte[] field3519;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[Lrh;Lal;)V")
    public static final void method1331(int arg0, class46[] arg1, class230 arg2) {
        field3522++;
        class19.field291 = arg2;
        class143.field2609 = arg1;
        class210.field3745 = new boolean[class143.field2609.length];
        class167.field3095.method1132((byte) 126);
        int var3 = class19.field291.method1550((byte) 49, class39.field577);
        int[] var4 = class19.field291.method1555(var3, (byte) -123);
        int var5 = 0;
        if (arg0 > 102) {
            while (var4.length > var5) {
                class167.field3095.method1131(class39.method229(new class74(class19.field291.method1562(-809612665, var4[var5], var3)), (byte) -114), false);
                var5++;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)I")
    public final int method1332(byte arg0) {
        if (arg0 == 64) {
            field3521++;
            return this.field3524 == null ? 0 : this.field3524.field243;
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method1333(int arg0) {
        if (arg0 == -25377) {
            field3532 = null;
            field3530 = null;
            field3513 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)I")
    public final int method1334(boolean arg0) {
        if (!arg0) {
            method1344(-125, -80, -72, -25, false);
        }
        field3539++;
        return this.field3515;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)I")
    public final int method1335(int arg0) {
        field3527++;
        if (this.field3524 == null) {
            return 0;
        } else if (arg0 <= 109) {
            return 122;
        } else if (this.field3543) {
            class64 var2 = this.field3544.method1140(0);
            return var2 == null ? 0 : (int) var2.field1148;
        } else {
            return this.field3524.field243;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[B")
    public final byte[] method7(int arg0, int arg1) {
        field3525++;
        class55 var3 = this.method1336(arg0, arg1, -122);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method352(0);
            var3.method401((byte) -118);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V")
    public final void method8(int arg0, int arg1) {
        field3531++;
        if (this.field3534 == null) {
            return;
        }
        class64 var3 = this.field3545.method1140(0);
        if (arg0 != 21190) {
            this.method1342(-67);
        }
        while (var3 != null) {
            if (((long) arg1) == var3.field1148) {
                return;
            }
            var3 = this.field3545.method1127(0);
        }
        class64 var4 = new class64();
        var4.field1148 = (long) arg1;
        this.field3545.method1131(var4, false);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Ldf;")
    private final class55 method1336(int arg0, int arg1, int arg2) {
        field3537++;
        class55 var4 = (class55) this.field3506.method639((byte) -124, (long) arg1);
        if (var4 != null && arg0 == 0 && !var4.field988 && var4.field987) {
            var4.method401((byte) -118);
            var4 = null;
        }
        if (arg2 >= -117) {
            return null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field3534 == null || this.field3519[arg1] == -1) {
                    if (this.field3510.method326((byte) 63)) {
                        return null;
                    }
                    var4 = this.field3510.method330((byte) 2, arg1, this.field3535, (byte) -100, true);
                } else {
                    var4 = this.field3518.method1829(1, arg1, this.field3534);
                }
            } else if (arg0 == 1) {
                if (this.field3534 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3518.method1832(this.field3534, arg1, 17427);
            } else if (arg0 == 2) {
                if (this.field3534 == null) {
                    throw new RuntimeException();
                }
                if (this.field3519[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3510.method328(31)) {
                    return null;
                }
                var4 = this.field3510.method330((byte) 2, arg1, this.field3535, (byte) -79, false);
            } else {
                throw new RuntimeException();
            }
            this.field3506.method638((byte) -89, var4, (long) arg1);
        }
        if (var4.field987) {
            return null;
        }
        byte[] var5 = var4.method352(0);
        if (!var4 instanceof class63) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class18.field273.reset();
                class18.field273.update(var5, 0, var5.length - 2);
                int var9 = (int) class18.field273.getValue();
                if (this.field3524.field248[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field3510.field930 = 0;
                this.field3510.field929 = 0;
            } catch (RuntimeException var12) {
                this.field3510.method332((byte) -101);
                var4.method401((byte) -118);
                if (var4.field988 && !this.field3510.method326((byte) 69)) {
                    class122 var10 = this.field3510.method330((byte) 2, arg1, this.field3535, (byte) -71, true);
                    this.field3506.method638((byte) -89, var10, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3524.field235[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field3524.field235[arg1];
            if (this.field3534 != null) {
                this.field3518.method1834(arg1, this.field3534, -2127, var5);
                if (this.field3519[arg1] != 1) {
                    this.field3515++;
                    this.field3519[arg1] = 1;
                }
            }
            if (!var4.field988) {
                var4.method401((byte) -118);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class18.field273.reset();
            class18.field273.update(var5, 0, var5.length - 2);
            int var6 = (int) class18.field273.getValue();
            if (this.field3524.field248[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3524.field235[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3519[arg1] != 1) {
                this.field3515++;
                this.field3519[arg1] = 1;
            }
            if (!var4.field988) {
                var4.method401((byte) -118);
            }
            return var4;
        } catch (Exception var11) {
            this.field3519[arg1] = -1;
            var4.method401((byte) -118);
            if (var4.field988 && !this.field3510.method326((byte) 75)) {
                class122 var8 = this.field3510.method330((byte) 2, arg1, this.field3535, (byte) -107, true);
                this.field3506.method638((byte) -89, var8, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public static final void method1337(int arg0) {
        class77.field1443.method1291(0);
        field3529++;
        if (arg0 != -2) {
            method1337(51);
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V")
    public final void method1338(int arg0) {
        field3514++;
        if (this.field3544 != null) {
            if (this.method9(255) == null) {
                return;
            }
            if (this.field3543) {
                boolean var2 = true;
                for (class64 var3 = this.field3544.method1140(0); var3 != null; var3 = this.field3544.method1127(0)) {
                    int var5 = (int) var3.field1148;
                    if (this.field3519[var5] == 0) {
                        this.method1336(1, var5, arg0 ^ 0xFFFF8D34);
                    }
                    if (this.field3519[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method401((byte) -118);
                    }
                }
                while (this.field3542 < this.field3524.field246.length) {
                    if (this.field3524.field246[this.field3542] == 0) {
                        this.field3542++;
                    } else {
                        if (this.field3518.field4689 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3519[this.field3542] == 0) {
                            this.method1336(1, this.field3542, -121);
                        }
                        if (this.field3519[this.field3542] == 0) {
                            class64 var4 = new class64();
                            var4.field1148 = (long) this.field3542;
                            var2 = false;
                            this.field3544.method1131(var4, false);
                        }
                        this.field3542++;
                    }
                }
                if (var2) {
                    this.field3542 = 0;
                    this.field3543 = false;
                }
            } else if (this.field3546) {
                boolean var6 = true;
                for (class64 var7 = this.field3544.method1140(0); var7 != null; var7 = this.field3544.method1127(0)) {
                    int var9 = (int) var7.field1148;
                    if (this.field3519[var9] != 1) {
                        this.method1336(2, var9, -122);
                    }
                    if (this.field3519[var9] == 1) {
                        var7.method401((byte) -118);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3524.field246.length > this.field3542) {
                    if (this.field3524.field246[this.field3542] == 0) {
                        this.field3542++;
                    } else {
                        if (this.field3510.method328(26)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3519[this.field3542] != 1) {
                            this.method1336(2, this.field3542, -118);
                        }
                        if (this.field3519[this.field3542] != 1) {
                            var6 = false;
                            class64 var8 = new class64();
                            var8.field1148 = (long) this.field3542;
                            this.field3544.method1131(var8, false);
                        }
                        this.field3542++;
                    }
                }
                if (var6) {
                    this.field3546 = false;
                    this.field3542 = 0;
                }
            } else {
                this.field3544 = null;
            }
        }
        if (this.field3548 && this.field3547 <= class81.method608(19644)) {
            for (class55 var10 = (class55) this.field3506.method633((byte) 56); var10 != null; var10 = (class55) this.field3506.method630(11)) {
                if (!var10.field987) {
                    if (var10.field992) {
                        if (!var10.field988) {
                            throw new RuntimeException();
                        }
                        var10.method401((byte) -118);
                    } else {
                        var10.field992 = true;
                    }
                }
            }
            this.field3547 = class81.method608(19644) + 1000L;
        }
        if (arg0 != 29373) {
            method1344(-15, -76, -69, -6, false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 - arg4) >= class257.field4496 && class192.field3449 >= (arg1 + arg4) && class224.field3940 <= arg5 - arg4 && class94.field1655 >= (arg4 + arg5)) {
            class69.method429(arg3, arg1, arg4, arg2, arg6, true, arg5);
        } else {
            class227.method1524(arg2, arg3, 20, arg4, arg1, arg6, arg5);
        }
        field3517++;
        if (arg0 != 1) {
            field3516 = -23;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)I")
    public final int method10(int arg0, int arg1) {
        field3526++;
        class55 var3 = (class55) this.field3506.method639((byte) -25, (long) arg0);
        if (var3 == null) {
            if (arg1 != 0) {
                this.field3523 = null;
            }
            return 0;
        } else {
            return var3.method348((byte) -52);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method1340(byte[] arg0, int arg1, boolean arg2) {
        field3509++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < arg0.length && !class247.field4345) {
            try {
                class267 var3 = (class267) Class.forName("md").getDeclaredConstructor().newInstance();
                var3.method1487((byte) 60, arg0);
                return var3;
            } catch (Throwable var4) {
                class247.field4345 = true;
            }
        }
        return arg2 ? class156.method1122(arg0, arg1 - 136) : arg0;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
    public final void method1341(byte arg0) {
        field3520++;
        if (arg0 > -7) {
            this.method8(99, 8);
        }
        if (this.field3534 != null) {
            this.field3546 = true;
            if (this.field3544 == null) {
                this.field3544 = new class157();
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)I")
    public final int method1342(int arg0) {
        field3508++;
        if (arg0 != 0) {
            this.field3523 = null;
        }
        if (this.method9(255) == null) {
            return this.field3528 == null ? 0 : this.field3528.method348((byte) -52);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public final void method1343(byte arg0) {
        field3536++;
        if (this.field3544 == null || this.method9(255) == null) {
            return;
        }
        if (arg0 <= 43) {
            this.method10(126, -66);
        }
        for (class64 var2 = this.field3545.method1140(0); var2 != null; var2 = this.field3545.method1127(0)) {
            int var3 = (int) var2.field1148;
            if (var3 < 0 || this.field3524.field239 <= var3 || this.field3524.field246[var3] == 0) {
                var2.method401((byte) -118);
            } else {
                if (this.field3519[var3] == 0) {
                    this.method1336(1, var3, -128);
                }
                if (this.field3519[var3] == -1) {
                    this.method1336(2, var3, -120);
                }
                if (this.field3519[var3] == 1) {
                    var2.method401((byte) -118);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Ldb;")
    public final class17 method9(int arg0) {
        field3507++;
        if (this.field3524 != null) {
            return this.field3524;
        }
        if (this.field3528 == null) {
            if (this.field3510.method326((byte) 76)) {
                return null;
            }
            this.field3528 = this.field3510.method330((byte) 0, this.field3535, 255, (byte) -44, true);
        }
        if (this.field3528.field987) {
            return null;
        }
        if (arg0 != 255) {
            method1337(-127);
        }
        byte[] var2 = this.field3528.method352(0);
        if (this.field3528 instanceof class63) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3524 = new class17(var2, this.field3511);
                if (this.field3524.field245 != this.field3540) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3524 = null;
                if (this.field3510.method326((byte) 121)) {
                    this.field3528 = null;
                } else {
                    this.field3528 = this.field3510.method330((byte) 0, this.field3535, 255, (byte) -50, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3524 = new class17(var2, this.field3511);
            } catch (RuntimeException var4) {
                this.field3510.method332((byte) -119);
                this.field3524 = null;
                if (this.field3510.method326((byte) 81)) {
                    this.field3528 = null;
                } else {
                    this.field3528 = this.field3510.method330((byte) 0, this.field3535, 255, (byte) -63, true);
                }
                return null;
            }
            if (this.field3523 != null) {
                this.field3518.method1834(this.field3535, this.field3523, -2127, var2);
            }
        }
        this.field3528 = null;
        if (this.field3534 != null) {
            this.field3519 = new byte[this.field3524.field239];
            this.field3515 = 0;
        }
        return this.field3524;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1344(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class181.field3264 = arg1;
        class129.field2291 = arg2;
        class200.field3624 = arg3;
        class31.field465 = new class231[arg0][class181.field3264][class129.field2291];
        class211.field3759 = new int[arg0][class181.field3264 + 1][class129.field2291 + 1];
        if (arg4) {
            class102.field1798 = new class231[1][class181.field3264][class129.field2291];
            class108.field1867 = new int[class181.field3264][class129.field2291];
            class54.field973 = new int[1][class181.field3264 + 1][class129.field2291 + 1];
        } else {
            class102.field1798 = null;
            class108.field1867 = null;
            class54.field973 = null;
        }
        class22.method128(false);
        class206.field3693 = new class168[500];
        field3533 = 0;
        class173.field3200 = new class168[500];
        class8.field106 = 0;
        class162.field3017 = new int[arg0][class181.field3264 + 1][class129.field2291 + 1];
        class213.field3778 = new class23[5000];
        class277.field4951 = 0;
        class140.field2572 = new class23[100];
        class272.field4897 = new boolean[class200.field3624 + class200.field3624 + 1][class200.field3624 + class200.field3624 + 1];
        client.field2851 = new boolean[class200.field3624 + class200.field3624 + 2][class200.field3624 + class200.field3624 + 2];
        class60.field1080 = new byte[arg0][class181.field3264][class129.field2291];
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(ILcg;Lcg;Lej;Lca;IIZ)V")
    public class196(int arg0, class166 arg1, class166 arg2, class50 arg3, class263 arg4, int arg5, int arg6, boolean arg7) {
        this.field3534 = arg1;
        this.field3535 = arg0;
        if (this.field3534 == null) {
            this.field3543 = false;
        } else {
            this.field3543 = true;
            this.field3544 = new class157();
        }
        this.field3523 = arg2;
        this.field3518 = arg4;
        this.field3511 = arg5;
        this.field3548 = arg7;
        this.field3540 = arg6;
        this.field3510 = arg3;
        if (this.field3523 != null) {
            this.field3528 = this.field3518.method1829(1, this.field3535, this.field3523);
        }
    }
}
