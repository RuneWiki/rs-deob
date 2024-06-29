import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class343 {

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public int field4965 = -1;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[Z")
    public static boolean[] field4944 = new boolean[100];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Lje;")
    public static class275 field4952;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lwa;")
    private class433 field4953;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Ljava/lang/String;")
    private String field4949;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Ljava/lang/String;")
    private String field4957;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[I")
    private int[] field4946;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[I")
    private int[] field4947;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
    private int[] field4950;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "[I")
    private int[] field4951;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[I")
    private int[] field4958;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "[I")
    private int[] field4961;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[I")
    private int[] field4962;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "[I")
    private int[] field4964;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field4948;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field4963;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[[I")
    private int[][] field4945;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "[[I")
    private int[][] field4959;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "[[I")
    private int[][] field4960;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILdh;B)V", line = 3)
    private final void method2099(int arg0, class209 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field4949 = arg1.method1421(-70);
        } else if (arg0 == 2) {
            this.field4957 = arg1.method1421(-86);
        } else if (arg0 == 3) {
            int var22 = arg1.method1428(32122);
            this.field4959 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4959[var23][0] = arg1.method1450((byte) 31);
                this.field4959[var23][1] = arg1.method1452(65280);
                this.field4959[var23][2] = arg1.method1452(65280);
            }
        } else if (arg0 == 4) {
            int var20 = arg1.method1428(arg2 ^ 0x7D03);
            this.field4960 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field4960[var21][0] = arg1.method1450((byte) 55);
                this.field4960[var21][1] = arg1.method1452(65280);
                this.field4960[var21][2] = arg1.method1452(65280);
            }
        } else if (arg0 == 5) {
            arg1.method1450((byte) 31);
        } else if (arg0 == 6) {
            arg1.method1428(32122);
        } else if (arg0 == 7) {
            arg1.method1428(arg2 + 32001);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method1428(32122);
            } else if (arg0 == 10) {
                int var4 = arg1.method1428(32122);
                this.field4947 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4947[var5] = arg1.method1452(65280);
                }
            } else if (arg0 == 12) {
                arg1.method1452(65280);
            } else if (arg0 == 13) {
                int var18 = arg1.method1428(arg2 ^ 0x7D03);
                this.field4958 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field4958[var19] = arg1.method1450((byte) 108);
                }
            } else if (arg0 == 14) {
                int var16 = arg1.method1428(32122);
                this.field4945 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field4945[var17][0] = arg1.method1428(32122);
                    this.field4945[var17][1] = arg1.method1428(class315.method1970(arg2, 32003));
                }
            } else if (arg0 == 15) {
                arg1.method1450((byte) 119);
            } else if (arg0 == 17) {
                this.field4965 = arg1.method1450((byte) 52);
            } else if (arg0 == 18) {
                int var14 = arg1.method1428(arg2 ^ 0x7D03);
                this.field4964 = new int[var14];
                this.field4963 = new String[var14];
                this.field4950 = new int[var14];
                this.field4951 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field4951[var15] = arg1.method1452(class315.method1970(arg2, 65401));
                    this.field4964[var15] = arg1.method1452(65280);
                    this.field4950[var15] = arg1.method1452(class315.method1970(arg2, 65401));
                    this.field4963[var15] = arg1.method1449(98);
                }
            } else if (arg0 == 19) {
                int var12 = arg1.method1428(32122);
                this.field4961 = new int[var12];
                this.field4962 = new int[var12];
                this.field4948 = new String[var12];
                this.field4946 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field4961[var13] = arg1.method1452(arg2 + 65159);
                    this.field4946[var13] = arg1.method1452(65280);
                    this.field4962[var13] = arg1.method1452(65280);
                    this.field4948[var13] = arg1.method1449(118);
                }
            } else if (arg0 == 249) {
                int var6 = arg1.method1428(arg2 + 32001);
                if (this.field4953 == null) {
                    int var7 = class476.method2841(var6, true);
                    this.field4953 = new class433(var7);
                }
                for (int var8 = 0; var8 < var6; var8++) {
                    boolean var9 = arg1.method1428(32122) == 1;
                    int var10 = arg1.method1458((byte) -10);
                    class337 var11;
                    if (var9) {
                        var11 = new class141(arg1.method1449(93));
                    } else {
                        var11 = new class427(arg1.method1452(65280));
                    }
                    this.field4953.method2606(var11, (long) var10, arg2 - 121);
                }
            }
        }
        if (arg2 != 121) {
            method2105(-22, -108, -102, -117, (byte) 108, false, 38, 27, -95);
        }
        field4943++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 249)
    public final void method2100(byte arg0) {
        field4954++;
        if (arg0 != -117) {
            this.field4953 = null;
        }
        if (this.field4957 == null) {
            this.field4957 = this.field4949;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILmv;Loq;I)V", line = 267)
    public static final void method2101(boolean arg0, int arg1, class252 arg2, class239 arg3, int arg4) {
        field4955++;
        byte var5 = -1;
        if ((arg1 & 0x4000) != 0) {
            var5 = arg2.method1438(3);
        }
        if ((arg1 & 0x400) != 0) {
            arg3.field3525 = arg2.method1430(false) == 1;
        }
        if ((arg1 & 0x800) != 0) {
            int var6 = arg2.method1450((byte) 52);
            int var7 = arg2.method1432(23094);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var8 = arg2.method1424((byte) -79);
            arg3.method857(false, var7, var6, -1, var8);
        }
        if ((arg1 & 0x1000) != 0) {
            arg3.field1944 = arg2.method1449(117);
            if (arg3.field1944.charAt(0) == '~') {
                arg3.field1944 = arg3.field1944.substring(1);
                class401.method2418(2, arg3.method1610(0, false), 0, arg3.method1619(182029155, true), arg3.field1944, false);
            } else if (class500.field7365 == arg3) {
                class401.method2418(2, arg3.method1610(0, false), 0, arg3.method1619(182029155, true), arg3.field1944, false);
            }
            arg3.field1914 = 150;
            arg3.field1926 = 0;
            arg3.field1932 = 0;
        }
        if ((arg1 & 0x2000) != 0) {
            arg3.field1984 = arg2.method1440((byte) 63);
            arg3.field1928 = arg2.method1417(false);
            arg3.field1941 = arg2.method1440((byte) 75);
            arg3.field1900 = arg2.method1438(3);
            arg3.field1965 = arg2.method1451((byte) -47) + class317.field4559;
            arg3.field1982 = arg2.method1451((byte) -47) + class317.field4559;
            arg3.field1988 = arg2.method1428(32122);
            arg3.field1999 = 0;
            if (arg3.field3512) {
                arg3.field2000 = 0;
                arg3.field1984 += arg3.field3536;
                arg3.field1941 += arg3.field3536;
                arg3.field1900 += arg3.field3509;
                arg3.field1928 += arg3.field3509;
            } else {
                arg3.field1928 += arg3.field1996[0];
                arg3.field1984 += arg3.field1997[0];
                arg3.field1941 += arg3.field1997[0];
                arg3.field1900 += arg3.field1996[0];
                arg3.field2000 = 1;
            }
        }
        if ((arg1 & 0x10) != 0) {
            arg3.field3556 = arg2.method1462((byte) -118);
            if (arg3.field2000 == 0) {
                arg3.method854(arg3.field3556, 0);
                arg3.field3556 = -1;
            }
        }
        if ((arg1 & 0x4) != 0) {
            int var9 = arg2.method1428(32122);
            byte[] var10 = new byte[var9];
            class209 var11 = new class209(var10);
            arg2.method1433(var9, (byte) 69, 0, var10);
            class353.field5403[arg4] = var11;
            arg3.method1621(var11, 5);
        }
        if ((arg1 & 0x100) != 0) {
            int var12 = class317.field4559;
            int var13 = arg2.method1434(16887);
            int var14 = arg2.method1430(false);
            arg3.method848(var14, var12, -5, var13);
        }
        if (arg0) {
            return;
        }
        if ((arg1 & 0x40000) != 0) {
            int var15 = arg2.method1451((byte) -47);
            int var16 = arg2.method1423(437589608);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var17 = arg2.method1430(false);
            arg3.method857(true, var16, var15, -1, var17);
        }
        if ((arg1 & 0x2) != 0) {
            class284.field4082[arg4] = arg2.method1417(false);
        }
        if ((arg1 & 0x10000) != 0) {
            int var18 = arg2.method1469(128);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; var22 < var18; var22++) {
                int var23 = arg2.method1450((byte) 116);
                if (var23 == 65535) {
                    var23 = -1;
                }
                var19[var22] = var23;
                var20[var22] = arg2.method1430(false);
                var21[var22] = arg2.method1451((byte) -47);
            }
            class339.method2059(var21, arg3, var20, 101, var19);
        }
        if ((arg1 & 0x8000) != 0) {
            int var24 = arg2.method1450((byte) 90);
            arg3.field1951 = arg2.method1469(128);
            arg3.field1921 = arg2.method1428(32122);
            arg3.field1907 = (var24 & 0x8000) != 0;
            arg3.field1920 = var24 & 0x7FFF;
            arg3.field1953 = class317.field4559 + arg3.field1951 + arg3.field1920;
        }
        if ((arg1 & 0x20) != 0) {
            int var25 = arg2.method1462((byte) -113);
            int var26 = arg2.method1430(false);
            int var27 = arg2.method1424((byte) -116);
            int var28 = arg2.field3037;
            boolean var29 = (var25 & 0x8000) != 0;
            if (arg3.field3548 != null && arg3.field3532 != null) {
                boolean var30 = false;
                if (var26 <= 1) {
                    if (!var29 && (class56.field871 && !class447.field6665 || class214.field3124)) {
                        var30 = true;
                    } else if (class135.method898(-38, arg3.field3548)) {
                        var30 = true;
                    }
                }
                if (!var30 && class269.field3927 == 0) {
                    class37.field392.field3037 = 0;
                    arg2.method1436((byte) 111, 0, class37.field392.field3036, var27);
                    class37.field392.field3037 = 0;
                    int var31 = -1;
                    String var32;
                    if (var29) {
                        var25 &= 0x7FFF;
                        class3 var33 = class456.method2736(499, class37.field392);
                        var31 = var33.field37;
                        var32 = var33.field39.method475(class37.field392, -32);
                    } else {
                        var32 = class323.method2003(1, class282.method1825(class37.field392, -2));
                    }
                    arg3.field1944 = var32.trim();
                    arg3.field1914 = 150;
                    arg3.field1926 = var25 >> 8;
                    arg3.field1932 = var25 & 0xFF;
                    int var34;
                    if (var26 == 1 || var26 == 2) {
                        var34 = var29 ? 17 : 1;
                    } else {
                        var34 = var29 ? 17 : 2;
                    }
                    if (var26 == 2) {
                        class159.method1013(var32, var34, null, 87, "<img=1>" + arg3.method1610(0, false), "<img=1>" + arg3.method1619(182029155, true), var31, 0);
                    } else if (var26 == 1) {
                        class159.method1013(var32, var34, null, 3, "<img=0>" + arg3.method1610(0, false), "<img=0>" + arg3.method1619(182029155, true), var31, 0);
                    } else {
                        class159.method1013(var32, var34, null, -94, arg3.method1610(0, false), arg3.method1619(182029155, true), var31, 0);
                    }
                }
            }
            arg2.field3037 = var27 + var28;
        }
        if ((arg1 & 0x8) != 0) {
            int var35 = arg2.method1434(16887);
            int var36 = arg2.method1469(128);
            arg3.method848(var36, class317.field4559, -5, var35);
            arg3.field1958 = class317.field4559 + 300;
            arg3.field1930 = arg2.method1469(128);
        }
        if ((arg1 & 0x20000) != 0) {
            arg3.field1989 = arg2.method1440((byte) 51);
            arg3.field1901 = arg2.method1442(82);
            arg3.field1960 = arg2.method1442(124);
            arg3.field1957 = (byte) arg2.method1424((byte) 123);
            arg3.field1917 = class317.field4559 + arg2.method1462((byte) -71);
            arg3.field1954 = class317.field4559 + arg2.method1451((byte) -47);
        }
        if ((arg1 & 0x1) != 0) {
            int var37 = arg2.method1465((byte) 104);
            if (var37 == 65535) {
                var37 = -1;
            }
            arg3.field1904 = var37;
        }
        if ((arg1 & 0x40) != 0) {
            int var38 = arg2.method1465((byte) -85);
            if (var38 == 65535) {
                var38 = -1;
            }
            int var39 = arg2.method1469(128);
            class34.method193(var38, var39, 8, arg3);
        }
        if (!arg3.field3512) {
            return;
        }
        if (var5 == 127) {
            arg3.method1616(arg3.field3536, (byte) -67, arg3.field3509);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class284.field4082[arg4];
        } else {
            var40 = var5;
        }
        arg3.method1615(var40, arg3.field3509, arg3.field3536, (byte) 127);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLdh;)V", line = 620)
    public final void method2102(boolean arg0, class209 arg1) {
        if (!arg0) {
            this.field4963 = null;
        }
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                field4942++;
                return;
            }
            this.method2099(var3, arg1, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIZ)Ljava/lang/String;", line = 645)
    public static final String method2103(int arg0, int arg1, int arg2, boolean arg3) {
        field4941++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[arg2] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg0;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 713)
    public static void method2104(int arg0) {
        field4952 = null;
        if (arg0 != 32768) {
            field4944 = null;
        }
        field4944 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIBZIII)Z", line = 732)
    public static final boolean method2105(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field4956++;
        int var9 = class500.field7365.field1997[0];
        if (arg4 <= 77) {
            method2105(-105, 34, -49, 123, (byte) -114, true, -25, 0, 7);
        }
        int var10 = class500.field7365.field1996[0];
        if (var9 < 0 || class30.field323 <= var9 || var10 < 0 || var10 >= class182.field2661) {
            return false;
        } else if (arg2 >= 0 && arg2 < class30.field323 && arg0 >= 0 && arg0 < class182.field2661) {
            int var11 = class190.method1296(arg8, var9, arg2, arg7, class150.field2231, var10, arg0, class434.field6500[class500.field7365.field1768], class157.field2288, arg5, class500.field7365.method847(-1), (byte) -96, arg1, arg6, arg3);
            if (var11 < 1) {
                return false;
            }
            class401.field6030 = class150.field2231[var11 - 1];
            class523.field7749 = class157.field2288[var11 - 1];
            class255.field3778 = false;
            class282.method1823(28460);
            return true;
        } else {
            return false;
        }
    }
}
