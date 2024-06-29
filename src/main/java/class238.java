import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class238 {

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "Liha;")
    private class29 field3653 = new class29(64);

    @OriginalMember(owner = "client!aia", name = "f", descriptor = "Liha;")
    private class29 field3661 = new class29(100);

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "Lgda;")
    private class58 field3660;

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3663 = new String[] { method2060(method2059("qDWRN8")), method2060(method2059("~XZ\u0010")), method2060(method2059(",NY\u00105vKP\u001anv\u0013\u0016S(")), method2060(method2059("0\u0000\b")), method2060(method2059("k\u0003\u0018Ru")), method2060(method2059("qDWRJ8")), method2060(method2059("qDWRK8")), method2060(method2059("qDWRL8")), method2060(method2059("qDWRI8")), method2060(method2059("qDWR4yC_\b68")), method2060(method2059("qDWRO8")), method2060(method2059("qDWRM8")) };

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "J")
    public static long field3659 = -1L;

    @OriginalMember(owner = "client!aia", name = "g", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!aia", name = "e", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)Lvu;")
    public final class356 method2052(int arg0, int arg1) {
        try {
            field3662++;
            class29 var3 = this.field3661;
            synchronized (this.field3661) {
                if (arg0 <= 20) {
                    this.field3660 = null;
                }
                class356 var4 = (class356) this.field3661.method302(-106, (long) arg1);
                if (var4 == null) {
                    var4 = new class356(arg1);
                    this.field3661.method295(false, (long) arg1, var4);
                }
                return var4.method2950((byte) -102) ? var4 : null;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field3663[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIZ)V")
    public static final void method2053(int arg0, int arg1, boolean arg2) {
        try {
            field3658++;
            class758 var3 = class603.field8714[arg0][arg1];
            if (var3 != null) {
                class225.field3534 = var3.field11132;
                class332.field5430 = var3.field11138;
                class159.field2342 = var3.field11141;
            }
            if (arg2) {
                field3659 = -43L;
            }
            class289.method2438(-398200286);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3663[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
    public final void method2054(byte arg0) {
        try {
            field3652++;
            if (arg0 != -105) {
                method2053(-105, -17, false);
            }
            class29 var2 = this.field3653;
            synchronized (this.field3653) {
                this.field3653.method304(arg0 + 106);
            }
            class29 var3 = this.field3661;
            synchronized (this.field3661) {
                this.field3661.method304(1);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3663[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)V")
    public final void method2055(byte arg0) {
        try {
            class29 var2 = this.field3653;
            synchronized (this.field3653) {
                this.field3653.method298(5);
            }
            field3656++;
            class29 var3 = this.field3661;
            synchronized (this.field3661) {
                if (arg0 > 68) {
                    this.field3661.method298(5);
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3663[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(II)V")
    public final void method2056(int arg0, int arg1) {
        try {
            class29 var3 = this.field3653;
            synchronized (this.field3653) {
                this.field3653.method294(arg1, arg0 - 629);
            }
            if (arg0 == -1) {
                field3657++;
                class29 var4 = this.field3661;
                synchronized (this.field3661) {
                    this.field3661.method294(arg1, -630);
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3663[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lpo;ILgda;Lgda;Lgda;)V")
    public class238(class585 arg0, int arg1, class58 arg2, class58 arg3, class58 arg4) {
        try {
            this.field3660 = arg2;
            if (this.field3660 != null) {
                int var6 = this.field3660.method600(1) - 1;
                this.field3660.method580(74, var6);
            }
            class151.method1373(arg3, (byte) -76, arg4, 2);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3663[9] + (arg0 == null ? field3663[1] : field3663[4]) + ',' + arg1 + ',' + (arg2 == null ? field3663[1] : field3663[4]) + ',' + (arg3 == null ? field3663[1] : field3663[4]) + ',' + (arg4 == null ? field3663[1] : field3663[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLha;)V")
    public static final void method2057(byte arg0, class63 arg1) {
        try {
            field3654++;
            if ((class320.field5213 >= 2 || class501.field7499) && class360.field5806 == null) {
                String var2;
                if (class501.field7499 && class320.field5213 < 2) {
                    var2 = class480.field7309 + class709.field10234.method5154(class795.field11624, (byte) 65) + class304.field4915 + field3663[3];
                } else if (class558.field8130 && class196.field3117.method1189(81, 15708) && class320.field5213 > 2) {
                    var2 = class207.method1869(class750.field11049, (byte) -112);
                } else {
                    class59 var3 = class750.field11049;
                    if (var3 == null) {
                        return;
                    }
                    var2 = class207.method1869(var3, (byte) -112);
                    int[] var4 = null;
                    if (class772.method5571((byte) -54, var3.field773)) {
                        var4 = class229.field3563.method531((int) var3.field762, (byte) 40).field8476;
                    } else if (var3.field771 != -1) {
                        var4 = class229.field3563.method531(var3.field771, (byte) 120).field8476;
                    } else if (class738.method5357(12, var3.field773)) {
                        class19 var5 = (class19) class176.field2797.method737((byte) -39, (long) ((int) var3.field762));
                        if (var5 != null) {
                            class426 var6 = var5.field194;
                            class162 var7 = var6.field6716;
                            if (var7.field2620 != null) {
                                var7 = var7.method1530(-85, class398.field6315);
                            }
                            if (var7 != null) {
                                var4 = var7.field2569;
                            }
                        }
                    } else if (class252.method2138(-1, var3.field773)) {
                        Object var8 = null;
                        class362 var9;
                        if (var3.field773 == 1001) {
                            var9 = class370.field5999.method4002(-107, (int) var3.field762);
                        } else {
                            var9 = class370.field5999.method4002(127, (int) (var3.field762 >>> 32 & 0x7FFFFFFFL));
                        }
                        if (var9.field5873 != null) {
                            var9 = var9.method2997(-57, class398.field6315);
                        }
                        if (var9 != null) {
                            var4 = var9.field5900;
                        }
                    }
                    if (var4 != null) {
                        var2 = var2 + class679.method4944(0, var4);
                    }
                }
                if (class320.field5213 > 2) {
                    var2 = var2 + field3663[2] + (class320.field5213 - 2) + class709.field10227.method5154(class795.field11624, (byte) 65);
                }
                if (class189.field2991 != null) {
                    class64 var10 = class189.field2991.method4975(arg1, 9596);
                    if (var10 == null) {
                        var10 = class461.field7108;
                    }
                    var10.method671(var2, class189.field2991.field9826, class640.field9185, class161.field2545, class189.field2991.field9725, class714.field10323, class189.field2991.field9781, class279.field4563, class189.field2991.field9789, class189.field2991.field9797, -87, class166.field2698, class197.field3137, class189.field2991.field9777, class475.field7238);
                    class481.method3669(class166.field2698[1], class166.field2698[3], class166.field2698[0], class166.field2698[2], 0);
                } else if (class634.field9110 != null && class305.field4924 == class229.field3561) {
                    int var11 = class461.field7108.method676(0, class466.field7144 + 4, var2, class475.field7238, class714.field10323, class417.field6593 + 16, 16777215, class279.field4563, class640.field9185, 69);
                    class481.method3669(class417.field6593, 16, class466.field7144 + 4, client.field5163.method498(var2, -1) + var11, 0);
                }
                int var12 = -125 % ((-arg0 - 45) / 34);
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field3663[0] + arg0 + ',' + (arg1 == null ? field3663[1] : field3663[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IB)Loe;")
    public final class210 method2058(int arg0, byte arg1) {
        try {
            field3655++;
            class29 var3 = this.field3653;
            class210 var4;
            synchronized (this.field3653) {
                var4 = (class210) this.field3653.method302(-111, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field3660;
            byte[] var6;
            synchronized (this.field3660) {
                var6 = this.field3660.method604((byte) -123, class722.method5245((byte) -24, arg0), class496.method3749((byte) 126, arg0));
            }
            class210 var7 = new class210();
            var7.field3342 = this;
            int var8 = 17 / ((68 - arg1) / 50);
            var7.field3314 = arg0;
            if (var6 != null) {
                var7.method1899(new class176(var6), (byte) 87);
            }
            var7.method1896(128);
            class29 var9 = this.field3653;
            synchronized (this.field3653) {
                this.field3653.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field3663[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2059(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2060(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
