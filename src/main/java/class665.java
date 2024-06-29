import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class665 {

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public int field9461 = 0;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public int field9463 = 0;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "Liha;")
    private class29 field9462 = new class29(64);

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Lhia;")
    private class70 field9472 = null;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "Lgda;")
    private class58 field9464;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "Lgda;")
    private class58 field9467;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9473 = new String[] { method4831(method4830("\"Q?Y")), method4831(method4830("sv+=\u0012")), method4831(method4830("y,+WG")), method4831(method4830("sv+ESlkqG\u0012")), method4831(method4830("lwi\u0015")), method4831(method4830("sv+>\u0012")), method4831(method4830("sv+:\u0012")), method4831(method4830("sv+<\u0012")), method4831(method4830("PA?Y")), method4831(method4830("sv+;\u0012")), method4831(method4830("sv+8\u0012")), method4831(method4830("sv+?\u0012")) };

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "[[[I")
    public static int[][][] field9470 = new int[2][][];

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "Z")
    public static boolean field9466 = true;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field9469;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method4823(int arg0, byte arg1, int arg2) {
        try {
            field9468++;
            if (arg1 == 43) {
                return (arg0 & 0x22) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9473[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lha;IIIIIBI)V", line = 14)
    public static final void method4824(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        try {
            arg0.method664(arg7, arg2, arg5, arg4, arg1, true);
            field9469++;
            if (arg6 >= -8) {
                method4823(45, (byte) -39, -107);
            }
            arg0.method664(arg7 + 1, arg3, arg5 - 2, arg4 + 1, 16, true);
            arg0.method661(arg7 + 18, arg3, arg5 - 2, 126, arg4 + 1, arg1 + -19);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9473[9] + (arg0 == null ? field9473[4] : field9473[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)Lkca;", line = 27)
    public static final class88 method4825(int arg0, int arg1) {
        try {
            field9471++;
            class88 var2 = (class88) class309.field5029.method4427(29, (long) arg1);
            if (var2 != null) {
                return var2;
            }
            int var3 = -108 % ((arg0 - 73) / 53);
            byte[] var4 = class546.field8029.method604((byte) -125, 0, arg1);
            if (var4 == null || var4.length <= 1) {
                return null;
            }
            class88 var5;
            try {
                var5 = class190.method1768((byte) 41, var4);
            } catch (Exception var8) {
                throw new RuntimeException(var8.getMessage() + field9473[0] + arg1);
            }
            class309.field5029.method4428((byte) 112, var5, (long) arg1);
            return var5;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9473[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lgr;", line = 57)
    public final class461 method4826(int arg0, int arg1) {
        try {
            field9460++;
            class461 var3 = (class461) this.field9462.method302(-94, (long) arg0);
            if (var3 != null) {
                return var3;
            }
            byte[] var4;
            if (arg0 < 32768) {
                var4 = this.field9464.method604((byte) 7, arg0, 1);
            } else {
                var4 = this.field9467.method604((byte) -17, arg0 & 0x7FFF, 1);
            }
            class461 var5 = new class461();
            if (arg1 != 1) {
                this.field9472 = null;
            }
            var5.field7089 = this;
            if (var4 != null) {
                var5.method3570(new class176(var4), false);
            }
            if (arg0 >= 32768) {
                var5.method3571(-1);
            }
            this.field9462.method295(false, (long) arg0, var5);
            return var5;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9473[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 90)
    public static final void method4827(int arg0) {
        try {
            field9459++;
            if (class623.field8996.field6384.method5351(true) == 2) {
                byte var1 = (byte) (class680.field9672 - 4 & 0xFF);
                int var2 = class680.field9672 % class126.field1823;
                for (int var3 = 0; var3 < 4; var3++) {
                    for (int var4 = 0; var4 < class169.field2725; var4++) {
                        class32.field388[var3][var2][var4] = var1;
                    }
                }
                int var5 = -80 % ((arg0 + 65) / 56);
                if (class673.field9554 != 3) {
                    for (int var6 = 0; var6 < 2; var6++) {
                        class783.field11429[var6] = -1000000;
                        class738.field10850[var6] = 1000000;
                        class297.field4845[var6] = 0;
                        class69.field987[var6] = 1000000;
                        class390.field6231[var6] = 0;
                    }
                    int var7 = class438.field6846.field9985;
                    int var8 = class438.field6846.field9983;
                    if (class401.field6334 != 1 && class344.field5593 == -1) {
                        int var19 = class207.method1873(class791.field11550, -10, class673.field9554, class133.field1896);
                        if (var19 - class396.field6285 < 3200 && (class224.field3519[class673.field9554][class791.field11550 >> 9][class133.field1896 >> 9] & 0x4) != 0) {
                            class680.method4957(class85.field1280, class791.field11550 >> 9, 1, class133.field1896 >> 9, false, 512);
                            return;
                        }
                    } else {
                        if (class401.field6334 != 1) {
                            var8 = class210.field3323;
                            var7 = class344.field5593;
                        }
                        if ((class224.field3519[class673.field9554][var7 >> 9][var8 >> 9] & 0x4) != 0) {
                            class680.method4957(class85.field1280, var7 >> 9, 0, var8 >> 9, false, 512);
                        }
                        if (class134.field1902 < 2560) {
                            int var9 = class791.field11550 >> 9;
                            int var10 = class133.field1896 >> 9;
                            int var11 = var7 >> 9;
                            int var12 = var8 >> 9;
                            int var13;
                            if (var9 >= var11) {
                                var13 = var9 - var11;
                            } else {
                                var13 = var11 - var9;
                            }
                            int var14;
                            if (var12 <= var10) {
                                var14 = var10 - var12;
                            } else {
                                var14 = var12 - var10;
                            }
                            if ((var13 != 0 || var14 != 0) && var13 > (-class126.field1823) && class126.field1823 > var13 && var14 > -class169.field2725 && var14 < class169.field2725) {
                                if (var14 >= var13) {
                                    int var15 = var13 * 65536 / var14;
                                    int var16 = 32768;
                                    while (var10 != var12) {
                                        if (var10 < var12) {
                                            var10++;
                                        } else if (var10 > var12) {
                                            var10--;
                                        }
                                        if ((class224.field3519[class673.field9554][var9][var10] & 0x4) != 0) {
                                            class680.method4957(class85.field1280, var9, 1, var10, false, 512);
                                            return;
                                        }
                                        var16 += var15;
                                        if (var16 >= 65536) {
                                            var16 -= 65536;
                                            if (var9 < var11) {
                                                var9++;
                                            } else if (var11 < var9) {
                                                var9--;
                                            }
                                            if ((class224.field3519[class673.field9554][var9][var10] & 0x4) != 0) {
                                                class680.method4957(class85.field1280, var9, 1, var10, false, 512);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                }
                                int var17 = var14 * 65536 / var13;
                                int var18 = 32768;
                                while (var9 != var11) {
                                    if (var9 < var11) {
                                        var9++;
                                    } else if (var9 > var11) {
                                        var9--;
                                    }
                                    if ((class224.field3519[class673.field9554][var9][var10] & 0x4) != 0) {
                                        class680.method4957(class85.field1280, var9, 1, var10, false, 512);
                                        return;
                                    }
                                    var18 += var17;
                                    if (var18 >= 65536) {
                                        var18 -= 65536;
                                        if (var10 < var12) {
                                            var10++;
                                        } else if (var12 < var10) {
                                            var10--;
                                        }
                                        if ((class224.field3519[class673.field9554][var9][var10] & 0x4) != 0) {
                                            class680.method4957(class85.field1280, var9, 1, var10, false, 512);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            class622.method4544(null, field9473[8] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class397.field6289 + "," + class141.field2011, true);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field9473[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(JZLpe;[I)Ljava/lang/String;", line = 290)
    public final String method4828(long arg0, boolean arg1, class636 arg2, int[] arg3) {
        try {
            if (arg1) {
                this.field9464 = null;
            }
            field9465++;
            if (this.field9472 != null) {
                String var6 = this.field9472.method742(arg2, arg3, arg0, true);
                if (var6 != null) {
                    return var6;
                }
            }
            return Long.toString(arg0);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9473[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9473[4] : field9473[2]) + ',' + (arg3 == null ? field9473[4] : field9473[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V", line = 320)
    public static void method4829(boolean arg0) {
        try {
            field9470 = null;
            if (!arg0) {
                method4823(-70, (byte) 20, 98);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9473[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(ILgda;Lgda;Lhia;)V", line = 356)
    public class665(int arg0, class58 arg1, class58 arg2, class70 arg3) {
        try {
            this.field9464 = arg1;
            this.field9472 = arg3;
            this.field9467 = arg2;
            if (this.field9464 != null) {
                this.field9463 = this.field9464.method580(102, 1);
            }
            if (this.field9467 != null) {
                this.field9461 = this.field9467.method580(66, 1);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9473[3] + arg0 + ',' + (arg1 == null ? field9473[4] : field9473[2]) + ',' + (arg2 == null ? field9473[4] : field9473[2]) + ',' + (arg3 == null ? field9473[4] : field9473[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4830(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4831(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
