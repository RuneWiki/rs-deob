import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class156 implements class746 {

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    private int field1919 = -1;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    private int field1918 = 0;

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "[Lwr;")
    private class482[] field1940 = new class482[9];

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "Lffa;")
    private class197 field1934;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field1945 = new String[] { method1319(method1318(" \u0012\u007fgj")), method1319(method1318(" \u0012\u007fmj")), method1319(method1318(" \u0012\u007fij")), method1319(method1318(" \u0012\u007fyj")), method1319(method1318("-\u0013=@")), method1319(method1318("8H\u007f\u0002?")), method1319(method1318(" \u0012\u007f`j")), method1319(method1318(" \u0012\u007f|j")), method1319(method1318(" \u0012\u007fbj")), method1319(method1318(" \u0012\u007f}j")), method1319(method1318(" \u0012\u007ffj")), method1319(method1318(" \u0012\u007fhj")), method1319(method1318(" \u0012\u007fJ+-\u0007=E8&N")), method1319(method1318(" \u0012\u007fjj")), method1319(method1318(" \u0012\u007fnj")), method1319(method1318(" \u0012\u007fdj")), method1319(method1318(" \u0012\u007foj")), method1319(method1318(" \u0012\u007f\u0010+-\u000f%\u0012j")), method1319(method1318(" \u0012\u007f~j")), method1319(method1318(" \u0012\u007fxj")), method1319(method1318(" \u0012\u007faj")), method1319(method1318(" \u0012\u007fej")), method1319(method1318(" \u0012\u007f\u007fj")), method1319(method1318(" \u0012\u007fcj")), method1319(method1318(" \u0012\u007fkj")) };

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "[I")
    public static int[] field1922 = new int[1000];

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "[I")
    public static int[] field1913 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    public static int field1943 = -2;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1944 = 0;

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    private int field1939;

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)V", line = 3)
    public final void method1297(byte arg0) {
        try {
            OpenGL.glBindFramebufferEXT(36160, 0);
            field1925++;
            this.field1918 &= 0xFFFFFFFB;
            if (arg0 < -42) {
                this.field1919 = this.method1313(1000);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1945[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lbca;IIB)V", line = 20)
    private final void method1298(class689 arg0, int arg1, int arg2, byte arg3) {
        try {
            if (arg3 == 23) {
                field1930++;
                if (this.field1919 == -1) {
                    throw new RuntimeException();
                }
                int var5 = 0x1 << arg1;
                if ((this.field1931 & ~var5) == 0) {
                    this.field1939 = arg0.field9982;
                    this.field1926 = arg0.field9988;
                } else if (this.field1939 != arg0.field9982 || this.field1926 != arg0.field9988) {
                    throw new RuntimeException();
                }
                arg0.method5045(5121, class579.field8593[arg1], this.field1919, arg2);
                this.field1940[arg1] = arg0;
                this.field1931 |= var5;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1945[22] + (arg0 == null ? field1945[4] : field1945[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V", line = 50)
    public final void method1299(int arg0, int arg1) {
        try {
            field1915++;
            if (this.field1919 == arg0) {
                throw new RuntimeException();
            }
            OpenGL.glReadBuffer(class579.field8593[arg1]);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1945[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)V", line = 67)
    public final void method1300(byte arg0, int arg1) {
        try {
            if (arg0 != 41) {
                field1943 = 40;
            }
            if (this.field1940[arg1] != null) {
                this.field1940[arg1].method705(-126);
            }
            field1941++;
            this.field1931 &= ~(0x1 << arg1);
            this.field1940[arg1] = null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1945[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIILod;I)V", line = 83)
    private final void method1301(int arg0, int arg1, int arg2, class532 arg3, int arg4) {
        try {
            field1927++;
            if (this.field1919 == -1) {
                throw new RuntimeException();
            }
            int var6 = 0x1 << arg2;
            if ((this.field1931 & ~var6) == arg1) {
                this.field1939 = arg3.field7805;
                this.field1926 = arg3.field7805;
            } else if (this.field1939 != arg3.field7805 || this.field1926 != arg3.field7805) {
                throw new RuntimeException();
            }
            arg3.method4025(arg0, this.field1919, arg4, (byte) -6, class579.field8593[arg2]);
            this.field1940[arg2] = arg3;
            this.field1931 |= var6;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1945[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1945[4] : field1945[5]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V", line = 115)
    public final void method1302(int arg0) {
        try {
            field1924++;
            if (arg0 <= 27) {
                field1913 = null;
            }
            OpenGL.glBindFramebufferEXT(36008, this.field1942);
            this.field1918 |= 0x1;
            this.field1919 = this.method1313(1000);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1945[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V", line = 128)
    public final void method1303(int arg0, int arg1) {
        try {
            field1912++;
            if (this.field1919 == -1) {
                throw new RuntimeException();
            }
            OpenGL.glDrawBuffer(class579.field8593[arg0]);
            if (arg1 != -4356) {
                field1922 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1945[23] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "(I)Lco;", line = 155)
    public static final class131 method1304(int arg0) {
        try {
            field1920++;
            if (arg0 != 36008) {
                field1922 = null;
            }
            if (class161.field2158 == null || class693.field10124 == null) {
                return null;
            }
            class693.field10124.method2399((byte) -69, class161.field2158);
            class131 var1 = (class131) class693.field10124.method2397(-127);
            if (var1 == null) {
                return null;
            } else {
                class306 var2 = class161.field2147.method622(var1.field1532, (byte) 75);
                return var2 != null && var2.field4776 && var2.method2593(class161.field2148, false) ? var1 : class362.method2939(arg0 - 35125);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1945[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILbca;)V", line = 183)
    public final void method1305(int arg0, int arg1, class689 arg2) {
        try {
            this.method1298(arg2, arg0, 0, (byte) 23);
            field1937++;
            int var4 = -43 / ((89 - arg1) / 36);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1945[15] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1945[4] : field1945[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lffa;)V", line = 418)
    public class156(class197 arg0) {
        try {
            if (!arg0.field2983) {
                throw new IllegalStateException("");
            }
            this.field1934 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class716.field10363, 0);
            this.field1942 = class716.field10363[0];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1945[17] + (arg0 == null ? field1945[4] : field1945[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIILod;)V", line = 199)
    public final void method1306(int arg0, int arg1, int arg2, class532 arg3) {
        try {
            this.method1301(arg1, 0, arg0, arg3, 0);
            if (arg2 == -3) {
                field1936++;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1945[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1945[4] : field1945[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)[Lel;", line = 215)
    public static final class573[] method1307(int arg0) {
        try {
            field1921++;
            return arg0 == 0 ? new class573[] { class36.field408, class169.field2317, class447.field6568, class586.field8629, class678.field9842, class216.field3298, class542.field8119, class235.field3552, class592.field8691, class95.field1071, class168.field2308, class603.field8841, class506.field7326, class440.field6487, class716.field10348, class134.field1564, class282.field4226, class154.field1897, class409.field6061, class533.field7813, class477.field6951, class187.field2565, class580.field8600, class104.field1211, class625.field9143, class717.field10377, class267.field4084, class376.field5732, class387.field5847, class627.field9184, class26.field310, class777.field11281, class565.field8389, class561.field8346, class16.field189, class516.field7458, class278.field4179, class709.field10272, class414.field6093, class129.field1520, class176.field2456, class94.field1058, class447.field6577, class675.field9791, class384.field5808, class116.field1383, class712.field10318, class65.field672, class594.field8716, class426.field6283, class473.field6866, class231.field3497, class690.field10018, class740.field10749, class279.field4191, class555.field8286, class507.field7342, class672.field9754, class447.field6564, class640.field9294, class474.field6878, class519.field7613, class154.field1907, class369.field5633, class146.field1800, class411.field6068, class490.field7032, class405.field6040, class324.field5116, class779.field11349, class13.field156, class288.field4279, class611.field8919, class276.field4167, class67.field720, class414.field6096, class497.field7193, class741.field10762, class732.field10626, class562.field8350, class391.field5885, class512.field7363, class657.field9492, class138.field1643, class182.field2512, class440.field6485, class269.field4101, class235.field3548, class518.field7491, class269.field4099, class212.field3245, class165.field2278, class370.field5642, class516.field7460, class478.field6956, class521.field7630, class220.field3397, class45.field525, class217.field3314, class593.field8710, class48.field544, class199.field3117, class76.field884, class682.field9877, class515.field7443, class239.field3621, class415.field6103, class748.field10882, class131.field1530, class265.field4053, class90.field1035, class653.field9427, class520.field7620, class727.field10542, class225.field3445, class251.field3889, class781.field11365, class627.field9187, class144.field1751, class606.field8879, class198.field3053, class739.field10744, class655.field9458, class603.field8845, class560.field8340, class754.field10974, class304.field4755, class311.field4934, class737.field10731, class88.field996, class289.field4293, class186.field2561, class166.field2287, class142.field1703, class65.field674 } : null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1945[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "(I)V", line = 226)
    public static void method1308(int arg0) {
        try {
            if (arg0 != -1) {
                method1307(53);
            }
            field1913 = null;
            field1922 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1945[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "finalize", descriptor = "()V", line = 237)
    protected final void finalize() throws Throwable {
        try {
            field1914++;
            this.field1934.method1695(4, this.field1942);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1945[12] + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(B)Z", line = 246)
    public final boolean method1309(byte arg0) {
        try {
            if (arg0 != 37) {
                field1913 = null;
            }
            field1935++;
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1919);
            return var2 == 36053;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1945[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 270)
    public final void method1310(int arg0) {
        try {
            if (arg0 == -25398) {
                OpenGL.glBindFramebufferEXT(36160, this.field1942);
                field1923++;
                this.field1918 |= 0x4;
                this.field1919 = this.method1313(1000);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1945[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 284)
    public final void method1311(int arg0) {
        try {
            OpenGL.glBindFramebufferEXT(36009, this.field1942);
            field1916++;
            this.field1918 |= 0x2;
            if (arg0 != -21522) {
                method1304(-11);
            }
            this.field1919 = this.method1313(arg0 + 22522);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1945[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBLvq;)V", line = 297)
    public final void method1312(int arg0, byte arg1, class486 arg2) {
        try {
            field1932++;
            if (this.field1919 == -1) {
                throw new RuntimeException();
            }
            int var4 = 0x1 << arg0;
            if ((this.field1931 & ~var4) == 0) {
                this.field1926 = arg2.field6999;
                this.field1939 = arg2.field6996;
            } else if (this.field1939 != arg2.field6996 || this.field1926 != arg2.field6999) {
                throw new RuntimeException();
            }
            if (arg1 != -34) {
                field1944 = -24;
            }
            arg2.method3693(this.field1919, class579.field8593[arg0], 127);
            this.field1940[arg0] = arg2;
            this.field1931 |= var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1945[21] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1945[4] : field1945[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "(I)I", line = 333)
    private final int method1313(int arg0) {
        try {
            field1917++;
            if ((this.field1918 & 0x4) != 0) {
                return 36160;
            }
            if (arg0 != 1000) {
                method1304(53);
            }
            if ((this.field1918 & 0x2) == 0) {
                return (this.field1918 & 0x1) == 0 ? -1 : 36008;
            } else {
                return 36009;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1945[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V", line = 353)
    public static final void method1314(int arg0) {
        try {
            field1938++;
            if (class336.method2810((byte) -105)) {
                if (class725.field10472 == null) {
                    class40.method272(arg0);
                }
                class597.field8757 = 0;
                class478.field6955 = true;
            }
            if (arg0 != 0) {
                field1943 = -107;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1945[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILcn;I)V", line = 374)
    public static final void method1315(int arg0, int arg1, class541 arg2, int arg3) {
        try {
            class382.field5790 = arg2;
            field1929++;
            if (arg1 != -10213) {
                method1315(-73, -78, null, -14);
            }
            class530.field7757 = arg3;
            class760.field11010 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1945[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1945[4] : field1945[5]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V", line = 390)
    public final void method1316(int arg0) {
        try {
            OpenGL.glBindFramebufferEXT(36009, 0);
            field1928++;
            this.field1918 &= 0xFFFFFFFD;
            if (arg0 != -25101) {
                this.method1297((byte) 39);
            }
            this.field1919 = this.method1313(1000);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1945[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 403)
    public final void method1317(byte arg0) {
        try {
            int var2 = 127 % (-arg0 / 32);
            field1933++;
            OpenGL.glBindFramebufferEXT(36008, 0);
            this.field1918 &= 0xFFFFFFFE;
            this.field1919 = this.method1313(1000);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1945[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1318(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1319(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
