import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class305 extends class170 {

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    private int field4764;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    private int field4783;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    private int field4780;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    private int field4765;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4768 = "glow2:";

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    private int field4779;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    private int field4782;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    private int field4785;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Lce;")
    public static class8 field4777;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "[B")
    private byte[] field4767;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "[[B")
    public static byte[][] field4775;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "[[[B")
    public static byte[][][] field4784;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIFFF)V", line = 3)
    public class305(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4764 = (int) (arg7 * 4096.0F);
        this.field4783 = (int) (arg6 * 4096.0F);
        this.field4765 = this.field4780 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V", line = 14)
    public void method814(int arg0, byte arg1) {
        field4774++;
        this.field4767[arg0] = arg1;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 32)
    public final void method1154(int arg0) {
        field4766++;
        this.field4765 = this.field4780;
        if (arg0 != 255) {
            this.field4782 = -80;
        }
        this.field4778 >>= 0x4;
        if (this.field4778 < 0) {
            this.field4778 = 0;
        } else if (this.field4778 > 255) {
            this.field4778 = 255;
        }
        this.method814(this.field4785++, (byte) this.field4778);
        this.field4778 = 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 54)
    public static final String method2073(boolean arg0, long arg1) {
        field4769++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            StringBuffer var6 = new StringBuffer(var5);
            if (arg0) {
                field4768 = (String) null;
            }
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class334.field5194[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V", line = 105)
    public static void method2074(byte arg0) {
        field4768 = null;
        field4775 = (byte[][]) null;
        field4777 = null;
        field4784 = (byte[][][]) null;
        int var1 = 30 / ((arg0) / 37);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IB)V", line = 128)
    public static final void method2075(int arg0, byte arg1) {
        int var2 = 44 % ((arg1 - 73) / 39);
        field4773++;
        class75 var3 = class204.method1371(5, 7, arg0);
        var3.method533(22461);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII)V", line = 139)
    public final void method1149(boolean arg0, int arg1, int arg2) {
        field4771++;
        if (!arg0) {
            this.field4780 = -15;
        }
        if (arg1 == 0) {
            this.field4782 = this.field4783 - (arg2 < 0 ? -arg2 : arg2);
            this.field4782 = this.field4782 * this.field4782 >> 12;
            this.field4778 = this.field4782;
            this.field4779 = 4096;
            return;
        }
        this.field4779 = this.field4782 * this.field4764 >> 12;
        this.field4782 = this.field4783 - (arg2 >= 0 ? arg2 : -arg2);
        if (this.field4779 < 0) {
            this.field4779 = 0;
        } else if (this.field4779 > 4096) {
            this.field4779 = 4096;
        }
        this.field4782 = this.field4782 * this.field4782 >> 12;
        this.field4782 = this.field4782 * this.field4779 >> 12;
        this.field4778 += this.field4782 * this.field4765 >> 12;
        this.field4765 = this.field4780 * this.field4765 >> 12;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V", line = 186)
    public static final void method2076(byte arg0) {
        field4762++;
        if (class146.field2290 == 0 || class146.field2290 == 5) {
            return;
        }
        try {
            if ((++class230.field3716) > 2000) {
                if (class308.field4851 != null) {
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                }
                if (class27.field352 >= 1) {
                    class146.field2290 = 0;
                    class51.field728 = -5;
                    return;
                }
                class146.field2290 = 1;
                if (class43.field610 == class23.field292) {
                    class23.field292 = class221.field3506;
                } else {
                    class23.field292 = class43.field610;
                }
                class27.field352++;
                class230.field3716 = 0;
            }
            if (class146.field2290 == 1) {
                class84.field1266 = class89.field1359.method1508(-68, class23.field292, class82.field1229);
                class146.field2290 = 2;
            }
            if (class146.field2290 == 2) {
                if (class84.field1266.field3931 == 2) {
                    throw new IOException();
                }
                if (class84.field1266.field3931 != 1) {
                    return;
                }
                class308.field4851 = new class88((Socket) class84.field1266.field3929, class89.field1359);
                class84.field1266 = null;
                long var1 = class230.field3722 = class108.method723(class170.field2584, -107);
                class265.field4095.field4679 = 0;
                class265.field4095.method2034(-80, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class265.field4095.method2034(-128, var3);
                class308.field4851.method598(0, 2, 1, class265.field4095.field4716);
                if (class228.field3654 != null) {
                    class228.field3654.method1192(false);
                }
                if (class196.field2944 != null) {
                    class196.field2944.method1192(false);
                }
                int var4 = class308.field4851.method602(57);
                if (class228.field3654 != null) {
                    class228.field3654.method1192(false);
                }
                if (class196.field2944 != null) {
                    class196.field2944.method1192(false);
                }
                if (var4 != 0) {
                    class51.field728 = var4;
                    class146.field2290 = 0;
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                    return;
                }
                class146.field2290 = 3;
            }
            if (class146.field2290 == 3) {
                if (class308.field4851.method607(69) < 8) {
                    return;
                }
                class308.field4851.method604(118, 8, 0, class230.field3713.field4716);
                class230.field3713.field4679 = 0;
                class293.field4509 = class230.field3713.method2047((byte) -84);
                class265.field4095.field4679 = 0;
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class293.field4509 >> 32), (int) class293.field4509 };
                class265.field4095.method2034(-36, 10);
                class265.field4095.method2013(var5[0], -60);
                class265.field4095.method2013(var5[1], -90);
                class265.field4095.method2013(var5[2], -110);
                class265.field4095.method2013(var5[3], -83);
                class265.field4095.method2023(class108.method723(class170.field2584, -105), -121);
                class265.field4095.method2057(-124, class169.field2581);
                class265.field4095.method2024(32069, class44.field623, class52.field738);
                class33.field426.field4679 = 0;
                if (class304.field4758 == 40) {
                    class33.field426.method2034(-125, 18);
                } else {
                    class33.field426.method2034(-13, 16);
                }
                class33.field426.method2044(1247686728, class265.field4095.field4679 + class332.method2279(107, class266.field4101) + 163);
                class33.field426.method2013(538, -78);
                class33.field426.method2034(-102, class249.field3912);
                class33.field426.method2034(-60, class237.field3796 ? 1 : 0);
                class33.field426.method2034(-68, 1);
                class33.field426.method2034(-42, class166.method1132(false));
                class33.field426.method2044(1247686728, class334.field5203);
                class33.field426.method2044(1247686728, class174.field2644);
                class33.field426.method2034(-15, class10.field95);
                class100.method681(class33.field426, (byte) -84);
                class33.field426.method2057(-127, class266.field4101);
                class33.field426.method2013(class123.field1928, -88);
                class33.field426.method2013(class297.method1950((byte) 53), -102);
                class342.field5335 = true;
                class33.field426.method2044(1247686728, class166.field2558);
                class33.field426.method2013(class231.field3728.method2104(0), -61);
                class33.field426.method2013(class199.field2990.method2104(0), -67);
                class33.field426.method2013(class121.field1861.method2104(0), -68);
                class33.field426.method2013(class36.field455.method2104(0), -63);
                class33.field426.method2013(class311.field4935.method2104(0), -98);
                class33.field426.method2013(class297.field4554.method2104(0), -82);
                class33.field426.method2013(class211.field3353.method2104(0), -113);
                class33.field426.method2013(class54.field762.method2104(0), -83);
                class33.field426.method2013(class121.field1859.method2104(0), -71);
                class33.field426.method2013(class90.field1381.method2104(0), -82);
                class33.field426.method2013(class81.field1201.method2104(0), -104);
                class33.field426.method2013(class269.field4142.method2104(0), -81);
                class33.field426.method2013(class236.field3795.method2104(0), -64);
                class33.field426.method2013(class143.field2275.method2104(0), -100);
                class33.field426.method2013(class304.field4749.method2104(0), -83);
                class33.field426.method2013(class89.field1353.method2104(0), -92);
                class33.field426.method2013(class58.field818.method2104(0), -50);
                class33.field426.method2013(class234.field3761.method2104(0), -81);
                class33.field426.method2013(class143.field2262.method2104(0), -95);
                class33.field426.method2013(class90.field1373.method2104(0), -101);
                class33.field426.method2013(class222.field3532.method2104(0), -51);
                class33.field426.method2013(class172.field2609.method2104(0), -100);
                class33.field426.method2013(class193.field2917.method2104(0), -107);
                class33.field426.method2013(class2.field13.method2104(0), -99);
                class33.field426.method2013(class112.field1718.method2104(0), -70);
                class33.field426.method2013(class125.field1959.method2104(0), -84);
                class33.field426.method2013(class183.field2794.method2104(0), -122);
                class33.field426.method2013(class88.field1332.method2104(0), -48);
                class33.field426.method2013(class225.field3590.method2104(0), -122);
                class33.field426.method2060(class265.field4095.field4716, -1927867096, class265.field4095.field4679, 0);
                class308.field4851.method598(0, class33.field426.field4679, 1, class33.field426.field4716);
                class265.field4095.method2065(var5, -128);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class230.field3713.method2065(var5, -87);
                class146.field2290 = 4;
            }
            if (arg0 > -116) {
                field4781 = 30;
            }
            if (class146.field2290 == 4) {
                if (class308.field4851.method607(-116) < 1) {
                    return;
                }
                int var7 = class308.field4851.method602(-115);
                if (var7 == 21) {
                    class146.field2290 = 7;
                } else if (var7 == 29) {
                    class146.field2290 = 10;
                } else if (var7 == 1) {
                    class51.field728 = var7;
                    class146.field2290 = 5;
                    return;
                } else if (var7 == 2) {
                    class146.field2290 = 8;
                } else if (var7 == 15) {
                    class51.field728 = var7;
                    class146.field2290 = 0;
                    return;
                } else if (var7 == 23 && class27.field352 < 1) {
                    class230.field3716 = 0;
                    class146.field2290 = 1;
                    class27.field352++;
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                    return;
                } else {
                    class51.field728 = var7;
                    class146.field2290 = 0;
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                    return;
                }
            }
            if (class146.field2290 == 6) {
                class265.field4095.field4679 = 0;
                class265.field4095.method2064(255, 17);
                class308.field4851.method598(0, class265.field4095.field4679, 1, class265.field4095.field4716);
                class146.field2290 = 4;
                return;
            }
            if (class146.field2290 == 7) {
                if (class308.field4851.method607(111) < 1) {
                    return;
                }
                class15.field153 = class308.field4851.method602(-119) * 60 + 180;
                class51.field728 = 21;
                class146.field2290 = 0;
                class308.field4851.method596(false);
                class308.field4851 = null;
                return;
            }
            if (class146.field2290 == 10) {
                if (class308.field4851.method607(-124) < 1) {
                    return;
                }
                class123.field1933 = class308.field4851.method602(-114);
                class146.field2290 = 0;
                class51.field728 = 29;
                class308.field4851.method596(false);
                class308.field4851 = null;
                return;
            }
            if (class146.field2290 == 8) {
                if (class308.field4851.method607(44) < 14) {
                    return;
                }
                class308.field4851.method604(48, 14, 0, class230.field3713.field4716);
                class230.field3713.field4679 = 0;
                class215.field3399 = class230.field3713.method2043((byte) -118);
                class307.field4839 = class230.field3713.method2043((byte) -122);
                class50.field707 = class230.field3713.method2043((byte) -121) == 1;
                class83.field1258 = class230.field3713.method2043((byte) -121) == 1;
                class222.field3526 = class230.field3713.method2043((byte) -124) == 1;
                class207.field3288 = class230.field3713.method2043((byte) -125) == 1;
                class214.field3388 = class230.field3713.method2043((byte) -128) == 1;
                class124.field1944 = class230.field3713.method1994(false);
                class84.field1275 = class230.field3713.method2043((byte) -125) == 1;
                class219.field3484 = class230.field3713.method2043((byte) -117) == 1;
                class160.method1104(class219.field3484, (byte) -29);
                class255.method1719(class219.field3484, 8192);
                if (!class237.field3796) {
                    if ((!class50.field707 || class222.field3526) && !class84.field1275) {
                        try {
                            class254.method1715("unzap", (byte) -88, class89.field1359.field3569);
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class254.method1715("zap", (byte) -88, class89.field1359.field3569);
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class254.method1715("loggedin", (byte) -88, class89.field1359.field3569);
                } catch (Throwable var12) {
                }
                class93.field1441 = class230.field3713.method2071(818003299);
                class85.field1284 = class230.field3713.method1994(false);
                class146.field2290 = 9;
            }
            if (class146.field2290 == 9) {
                if (class308.field4851.method607(-127) >= class85.field1284) {
                    class230.field3713.field4679 = 0;
                    class308.field4851.method604(116, class85.field1284, 0, class230.field3713.field4716);
                    class51.field728 = 2;
                    class146.field2290 = 0;
                    class222.method1491(true);
                    class144.field2288 = -1;
                    class115.method793(false, 0);
                    class93.field1441 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class308.field4851 != null) {
                class308.field4851.method596(false);
                class308.field4851 = null;
            }
            if (class27.field352 < 1) {
                class146.field2290 = 1;
                class230.field3716 = 0;
                if (class43.field610 == class23.field292) {
                    class23.field292 = class221.field3506;
                } else {
                    class23.field292 = class43.field610;
                }
                class27.field352++;
            } else {
                class51.field728 = -4;
                class146.field2290 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lsn;Lsn;Z)V", line = 570)
    public static final void method2077(class187 arg0, class187 arg1, boolean arg2) {
        if (arg1.field2850 != null) {
            arg1.method1284(0);
        }
        arg1.field2850 = arg0.field2850;
        field4770++;
        arg1.field2846 = arg0;
        arg1.field2850.field2846 = arg1;
        arg1.field2846.field2850 = arg1;
        if (!arg2) {
            method2074((byte) 40);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 590)
    public final void method1152(int arg0) {
        if (arg0 != 4096) {
            this.field4765 = 16;
        }
        this.field4778 = 0;
        this.field4785 = 0;
        field4763++;
    }
}
