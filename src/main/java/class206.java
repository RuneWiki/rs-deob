import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class206 {

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Lnc;")
    private class85 field3699 = new class85(256);

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "Lnc;")
    private class85 field3710 = new class85(256);

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Lal;")
    private class230 field3698;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lal;")
    private class230 field3692;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
    public static int[] field3694 = new int[5];

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "[Lcb;")
    public static class241[] field3700 = new class241[4];

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[I")
    public static int[] field3703 = new int[25];

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "Lid;")
    public static class149 field3709 = class60.method382("Ladevorgang )2 bitte warten Sie)3", (byte) 95);

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "Lgd;")
    public static class74 field3702 = new class74(new byte[5000]);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lal;")
    public static class230 field3697;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "[Ljg;")
    public static class168[] field3693;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "[Lvc;")
    public static class190[] field3708;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[II)Lji;")
    public final class42 method1402(int arg0, int[] arg1, int arg2) {
        field3696++;
        if (this.field3698.method1531(arg2 ^ 0x5331) == arg2) {
            return this.method1405(arg1, 0, arg0, (byte) 110);
        } else if (this.field3698.method1559(arg0, -95) == 1) {
            return this.method1405(arg1, arg0, 0, (byte) 76);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBIIII)V")
    public static final void method1403(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3711++;
        if (class94.field1655 >= arg3 && class224.field3940 <= arg4) {
            boolean var6;
            if (class257.field4496 > arg2) {
                arg2 = class257.field4496;
                var6 = false;
            } else if (arg2 > class192.field3449) {
                arg2 = class192.field3449;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg0 < class257.field4496) {
                arg0 = class257.field4496;
                var7 = false;
            } else if (arg0 <= class192.field3449) {
                var7 = true;
            } else {
                var7 = false;
                arg0 = class192.field3449;
            }
            if (arg3 >= class224.field3940) {
                class141.method987(2, arg2, class15.field220[arg3++], arg0, arg5);
            } else {
                arg3 = class224.field3940;
            }
            if (arg4 <= class94.field1655) {
                class141.method987(2, arg2, class15.field220[arg4--], arg0, arg5);
            } else {
                arg4 = class94.field1655;
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg4; var8++) {
                    int[] var9 = class15.field220[var8];
                    var9[arg2] = var9[arg0] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg4; var10++) {
                    class15.field220[var10][arg2] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg4; var11++) {
                    class15.field220[var11][arg0] = arg5;
                }
            }
        }
        if (arg1 != -113) {
            field3709 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lgd;I)Lbf;")
    public static final class200 method1404(class74 arg0, int arg1) {
        field3706++;
        if (arg1 != 2790) {
            return null;
        }
        arg0.method489((byte) 98);
        int var2 = arg0.method489((byte) -6);
        class200 var3 = class96.method701(arg1 ^ 0xFFFFF569, var2);
        var3.field3640 = arg0.method489((byte) -48);
        int var4 = arg0.method489((byte) -113);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method489((byte) 79);
            var3.method31(arg0, true, var6);
        }
        var3.method150(-122);
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([IIIB)Lji;")
    private final class42 method1405(int[] arg0, int arg1, int arg2, byte arg3) {
        int var5 = 120 % ((32 - arg3) / 33);
        field3691++;
        int var6 = (arg1 >>> 12 | arg1 << 4 & 0xFFF1) ^ arg2;
        int var7 = var6 | arg1 << 16;
        long var8 = (long) var7;
        class42 var10 = (class42) this.field3710.method639((byte) -75, var8);
        if (var10 != null) {
            return var10;
        } else if (arg0 == null || arg0[0] > 0) {
            class4 var11 = class4.method21(this.field3698, arg1, arg2);
            if (var11 == null) {
                return null;
            }
            class42 var12 = var11.method19();
            this.field3710.method638((byte) -89, var12, var8);
            if (arg0 != null) {
                arg0[0] -= var12.field650.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static final void method1406(byte arg0) {
        class189.field3382.method553(-123);
        field3707++;
        class76.field1375 = 1;
        int var1 = 76 % ((arg0 - 7) / 51);
        class128.field2254 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
    public static final void method1407(int arg0, int arg1) {
        class41.field646.method1289(arg1, 84);
        class116.field1987.method1289(arg1, 106);
        field3695++;
        if (arg0 != 29469) {
            field3697 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB[II)Lji;")
    private final class42 method1408(int arg0, byte arg1, int[] arg2, int arg3) {
        if (arg1 != 39) {
            field3697 = null;
        }
        int var5 = arg3 ^ (arg0 << 4 & 0xFFF7 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field3701++;
        class42 var9 = (class42) this.field3710.method639((byte) -53, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class153 var10 = (class153) this.field3699.method639((byte) -104, var7);
            if (var10 == null) {
                var10 = class153.method1086(this.field3692, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3699.method638((byte) -89, var10, var7);
            }
            class42 var11 = var10.method1082(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method401((byte) -118);
                this.field3710.method638((byte) -89, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method1409(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 6685) {
            field3708 = null;
        }
        boolean var4 = true;
        field3704++;
        int var5 = -1;
        class74 var6 = new class74(arg1);
        label58: while (true) {
            int var7 = var6.method524((byte) -73);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            boolean var9 = false;
            var5 += var7;
            while (true) {
                while (!var9) {
                    int var11 = var6.method512(-69);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = (var8 & 0xFDC) >> 6;
                    int var14 = var6.method489((byte) 100) >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class268 var17 = class108.method755(11525, var5);
                        if (var14 != 22 || class211.field3761 || var17.field4806 != 0 || var17.field4831 == 1 || var17.field4779) {
                            var9 = true;
                            if (!var17.method1861((byte) -20)) {
                                class57.field1003++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var6.method512(arg2 - 6783);
                if (var10 == 0) {
                    break;
                }
                var6.method489((byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[I)Lji;")
    public final class42 method1410(int arg0, int arg1, int[] arg2) {
        field3705++;
        if (this.field3692.method1531(21296) == 1) {
            return this.method1408(0, (byte) 39, arg2, arg0);
        } else if (this.field3692.method1559(arg0, 19) == 1) {
            return this.method1408(arg0, (byte) 39, arg2, 0);
        } else {
            if (arg1 <= 8) {
                method1403(-9, (byte) 9, 65, -105, -15, 32);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V")
    public static void method1411(byte arg0) {
        field3709 = null;
        if (arg0 != -38) {
            method1406((byte) -102);
        }
        field3693 = null;
        field3703 = null;
        field3694 = null;
        field3702 = null;
        field3700 = null;
        field3697 = null;
        field3708 = null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lal;Lal;)V")
    public class206(class230 arg0, class230 arg1) {
        this.field3698 = arg0;
        this.field3692 = arg1;
    }
}
