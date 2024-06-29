import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Lwq;")
    private class178 field418 = new class178(256);

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Ld;")
    private class160 field423;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "Lffa;")
    private class197 field422;

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field428 = new String[] { method249(method248("ELrP\u0011")), method249(method248("ELrQ\u0011")), method249(method248("ELrU\u0011")), method249(method248("ELr.P\\S(,\u0011")), method249(method248("I\u0014r<D")), method249(method248("\\O0~")), method249(method248("ELrV\u0011")), method249(method248("ELrW\u0011")), method249(method248("ELrT\u0011")), method249(method248("ELrS\u0011")) };

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field425 = 0;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static final void method241(byte arg0) {
        try {
            field427++;
            if (class138.field1645 == 9) {
                class86.method728(5, (byte) -96);
            } else if (class138.field1645 == 5 || class138.field1645 == 6) {
                class86.method728(3, (byte) -96);
            } else if (class138.field1645 == 12) {
                class86.method728(3, (byte) -96);
            }
            if (arg0 > -19) {
                field425 = 10;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field428[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method242(int arg0, int arg1, int arg2, byte[] arg3) {
        try {
            int var4 = -73 / ((arg1 - 32) / 46);
            field419++;
            byte[] var5 = new byte[arg2];
            class467.method3556(arg3, arg0, var5, 0, arg2);
            return var5;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field428[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field428[5] : field428[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
    public final void method243(byte arg0) {
        try {
            int var2 = 9 / ((arg0 + 43) / 51);
            this.field418.method1559(0);
            field420++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field428[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public final void method244(int arg0) {
        try {
            this.field418.method1557(arg0, (byte) -118);
            field426++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field428[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)Lbca;")
    public final class689 method245(boolean arg0, int arg1) {
        try {
            field421++;
            Object var3 = this.field418.method1558((byte) 96, (long) arg1);
            if (var3 != null) {
                return (class689) var3;
            } else if (this.field423.method1363(arg1, (byte) 124)) {
                class439 var4 = this.field423.method1366((byte) -122, arg1);
                int var5 = var4.field6481 ? 64 : this.field422.field2842;
                class689 var7;
                if (var4.field6468 && this.field422.method566()) {
                    float[] var8 = this.field423.method1368(false, var5, arg1, 0.7F, var5, -8388);
                    var7 = new class689(this.field422, 3553, 34842, var5, var5, var4.field6469 != 0, var8, 6408);
                } else {
                    int[] var6;
                    if (var4.field6478 != 2 && class672.method4943(var4.field6467, -2)) {
                        var6 = this.field423.method1364(-25656, true, arg1, var5, var5, 0.7F);
                    } else {
                        var6 = this.field423.method1365((byte) -59, var5, false, 0.7F, arg1, var5);
                    }
                    var7 = new class689(this.field422, 3553, 6408, var5, var5, var4.field6469 != 0, var6, 0, 0, false);
                }
                var7.method5046(var4.field6463, (byte) -125, var4.field6470);
                this.field418.method1556((long) arg1, var7, 1);
                if (arg0) {
                    this.field418 = null;
                }
                return var7;
            } else {
                return null;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field428[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lib;B)Lrfa;")
    public static final class211 method246(class163 arg0, byte arg1) {
        try {
            arg0.method1455((byte) 62);
            int var2 = 39 % ((arg1 + 48) / 50);
            field424++;
            int var3 = arg0.method1455((byte) 62);
            class211 var4 = class788.method5699(-4064, var3);
            var4.field3238 = arg0.method1455((byte) 62);
            int var5 = arg0.method1455((byte) 62);
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg0.method1455((byte) 62);
                var4.method201((byte) 71, var7, arg0);
            }
            var4.method437(27132);
            return var4;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field428[6] + (arg0 == null ? field428[5] : field428[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)V")
    public static final void method247(byte arg0, int arg1, int arg2) {
        try {
            if ((class161.field2159 > class161.field2163)) {
                class161.field2163 = (float) ((double) class161.field2163 / 30.0D + (double) class161.field2163);
                if (class161.field2163 > class161.field2159) {
                    class161.field2163 = class161.field2159;
                }
                class685.method5024(-1);
                class161.field2162 = (int) class161.field2163 >> 1;
                class161.field2161 = class256.method2170(class161.field2162, -1);
            } else if (class161.field2159 < class161.field2163) {
                class161.field2163 = (float) ((double) class161.field2163 - (double) class161.field2163 / 30.0D);
                if (class161.field2159 > class161.field2163) {
                    class161.field2163 = class161.field2159;
                }
                class685.method5024(-1);
                class161.field2162 = (int) class161.field2163 >> 1;
                class161.field2161 = class256.method2170(class161.field2162, -1);
            }
            field417++;
            if (class388.field5859 != -1 && class348.field5385 != -1) {
                int var3 = class388.field5859 - class494.field7096;
                if (var3 < 2 || var3 > 2) {
                    var3 /= 8;
                }
                int var4 = class348.field5385 - class560.field8334;
                class494.field7096 += var3;
                if (var4 < 2 || var4 > 2) {
                    var4 /= 8;
                }
                class560.field8334 -= -var4;
                if (var3 == 0 && var4 == 0) {
                    class348.field5385 = -1;
                    class388.field5859 = -1;
                }
                class685.method5024(-1);
            }
            if (arg0 < -80) {
                if (class352.field5439 <= 0) {
                    class599.field8812 = -1;
                    class84.field942 = -1;
                } else {
                    class180.field2496--;
                    if (class180.field2496 == 0) {
                        class180.field2496 = 100;
                        class352.field5439--;
                    }
                }
                if (class775.field11253 && class728.field10550 != null) {
                    for (class238 var5 = (class238) class728.field10550.method3863((byte) 64); var5 != null; var5 = (class238) class728.field10550.method3862(-353)) {
                        class306 var6 = class161.field2147.method622(var5.field3611.field1532, (byte) 63);
                        if (var5.method2043((byte) 122, arg2, arg1)) {
                            if (var6.field4785 != null) {
                                if (var6.field4785[4] != null) {
                                    class719.method5244(var6.field4825, (long) var5.field3611.field1532, false, (long) var5.field3611.field1532, var6.field4785[4], 0, false, var6.field4820, -1, (byte) 11, 1006, true, -1);
                                }
                                if (var6.field4785[3] != null) {
                                    class719.method5244(var6.field4825, (long) var5.field3611.field1532, false, (long) var5.field3611.field1532, var6.field4785[3], 0, false, var6.field4820, -1, (byte) 126, 1010, true, -1);
                                }
                                if (var6.field4785[2] != null) {
                                    class719.method5244(var6.field4825, (long) var5.field3611.field1532, false, (long) var5.field3611.field1532, var6.field4785[2], 0, false, var6.field4820, -1, (byte) -56, 1011, true, -1);
                                }
                                if (var6.field4785[1] != null) {
                                    class719.method5244(var6.field4825, (long) var5.field3611.field1532, false, (long) var5.field3611.field1532, var6.field4785[1], 0, false, var6.field4820, -1, (byte) -128, 1001, true, -1);
                                }
                                if (var6.field4785[0] != null) {
                                    class719.method5244(var6.field4825, (long) var5.field3611.field1532, false, (long) var5.field3611.field1532, var6.field4785[0], 0, false, var6.field4820, -1, (byte) -121, 1012, true, -1);
                                }
                            }
                            if (!var5.field3611.field1528) {
                                var5.field3611.field1528 = true;
                                class782.method5652(class734.field10685, var5.field3611.field1532, var6.field4825);
                            }
                            if (var5.field3611.field1528) {
                                class782.method5652(class742.field10794, var5.field3611.field1532, var6.field4825);
                            }
                        } else if (var5.field3611.field1528) {
                            var5.field3611.field1528 = false;
                            class782.method5652(class227.field3475, var5.field3611.field1532, var6.field4825);
                        }
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field428[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lffa;Ld;)V")
    public class37(class197 arg0, class160 arg1) {
        try {
            this.field423 = arg1;
            this.field422 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field428[3] + (arg0 == null ? field428[5] : field428[4]) + ',' + (arg1 == null ? field428[5] : field428[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method248(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method249(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
