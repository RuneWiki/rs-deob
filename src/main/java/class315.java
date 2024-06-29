import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class315 extends class148 implements class305 {

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    private int field4900 = 50;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "Z")
    private boolean field4923 = false;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Ll;")
    private class133 field4883;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Ll;")
    private class133 field4882;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Lba;")
    private class53 field4889;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "Lba;")
    private class53 field4918;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field4903 = 0;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4894 = "Members object";

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "Z")
    public static boolean field4922 = false;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "Ll;")
    public static class133 field4888;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "Loa;")
    public static class22 field4917;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4910;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "[[[I")
    public static int[][][] field4897;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/Object;ILki;)V", line = 10)
    public static final void method2135(Object arg0, int arg1, class180 arg2) {
        field4901++;
        if (arg2.field2720 == null) {
            return;
        }
        if (arg1 != -9352) {
            field4913 = -60;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2720.peekEvent() != null; var3++) {
            class5.method26(0, 1L);
        }
        if (arg0 != null) {
            arg2.field2720.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Z", line = 35)
    public final boolean method2080(int arg0, int arg1) {
        int var3 = -102 % ((-arg0 - 29) / 38);
        field4898++;
        return this.method574(0, arg1).field4745;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 45)
    public static void method2136(int arg0) {
        field4894 = null;
        field4897 = (int[][][]) null;
        field4910 = null;
        int var1 = -47 / ((-arg0 - 50) / 59);
        field4888 = null;
        field4917 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z", line = 59)
    public final boolean method2078(int arg0, int arg1) {
        field4907++;
        class248 var3 = this.method2143((byte) 105, arg0);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 != 1) {
                this.method2084((byte) -8, -38, 63);
            }
            return var3.method1702(this, this.field4882);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I", line = 76)
    public final int method2082(int arg0, int arg1) {
        field4912++;
        if (arg0 != 255) {
            field4903 = -117;
        }
        return this.method574(0, arg1).field4746 & 0xFF;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(IB)Z", line = 87)
    public final boolean method2090(int arg0, byte arg1) {
        field4905++;
        if (arg1 != 106) {
            this.field4889 = (class53) null;
        }
        return this.method574(0, arg0).field4740;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)I", line = 100)
    public final int method2088(int arg0, byte arg1) {
        int var3 = -82 % ((arg1) / 56);
        field4920++;
        return this.method574(0, arg0).field4750 & 0xFF;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([BBII)Z", line = 113)
    public static final boolean method2137(byte[] arg0, byte arg1, int arg2, int arg3) {
        boolean var4 = true;
        field4896++;
        if (arg1 > -112) {
            return true;
        }
        class166 var5 = new class166(arg0);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1123(32767);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var5.method1145(128);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 & 0x3F;
                    int var13 = (var9 & 0xFE4) >> 6;
                    int var14 = var12 + arg3;
                    int var15 = var13 + arg2;
                    int var16 = var5.method1178(0) >> 2;
                    if (var15 > 0 && var14 > 0 && var15 < 103 && var14 < 103) {
                        class85 var17 = class201.method1431(-86, var6);
                        if (var16 != 22 || class260.field4071 || var17.field1377 != 0 || var17.field1337 == 1 || var17.field1336) {
                            var8 = true;
                            if (!var17.method601(0)) {
                                class202.field3034++;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var5.method1145(128);
                if (var10 == 0) {
                    break;
                }
                var5.method1178(0);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(II)I", line = 195)
    public final int method2089(int arg0, int arg1) {
        if (arg0 != 16871) {
            this.method2092(-13, 37);
        }
        field4924++;
        return this.method574(0, arg1).field4749 & 0xFF;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)V", line = 208)
    public final void method2138(byte arg0, int arg1) {
        this.field4900 = arg1;
        this.field4889 = new class53(this.field4900);
        if (class94.field1516) {
            this.field4918 = new class53(this.field4900);
        } else {
            this.field4918 = null;
        }
        if (arg0 >= -43) {
            field4910 = (String) null;
        }
        field4908++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(CII)I", line = 230)
    public static final int method2139(char arg0, int arg1, int arg2) {
        field4899++;
        if (arg1 >= -54) {
            field4903 = -67;
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)I", line = 254)
    public final int method2085(int arg0, byte arg1) {
        if (arg1 == -84) {
            field4895++;
            return this.method574(0, arg0).field4744 & 0xFFFF;
        } else {
            return 102;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lqf;Lqf;IIZ)I", line = 265)
    public static final int method2140(class341 arg0, class341 arg1, int arg2, int arg3, boolean arg4) {
        field4909++;
        if (arg2 == arg3) {
            int var5 = arg0.field472;
            int var6 = arg1.field472;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class137.method997((byte) 123, arg1.method2363((byte) 79).field2283, class195.field2920, arg0.method2363((byte) -67).field2283);
        } else if (arg2 == 3) {
            if (arg0.field5315.equals("-")) {
                if (arg1.field5315.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field5315.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class137.method997((byte) 17, arg1.field5315, class195.field2920, arg0.field5315);
            }
        } else if (arg2 == 4) {
            return arg0.method266(arg3 ^ 0x1) ? (arg1.method266(arg3 ^ 0x1) ? 0 : 1) : (arg1.method266(0) ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method265(arg3 + 1) ? (arg1.method265(2) ? 0 : 1) : (arg1.method265(2) ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method264(true) ? (arg1.method264(true) ? 0 : 1) : (arg1.method264(true) ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method268((byte) -79) ? (arg1.method268((byte) -79) ? 0 : 1) : (arg1.method268((byte) -79) ? -1 : 0);
        } else {
            return arg0.field5319 - arg1.field5319;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIF)[I", line = 340)
    public final int[] method2081(int arg0, int arg1, float arg2) {
        if (arg0 != 255) {
            this.field4882 = (class133) null;
        }
        field4914++;
        class248 var4 = this.method2143((byte) -113, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field3936 = true;
            return var4.method1701(this, this.field4882, arg2, this.field4923 || this.method574(0, arg1).field4748);
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(II)Z", line = 358)
    public final boolean method2086(int arg0, int arg1) {
        if (arg1 == 15374) {
            field4886++;
            return this.field4923 || this.method574(0, arg0).field4748;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII)V", line = 375)
    public final void method2084(byte arg0, int arg1, int arg2) {
        boolean var4 = false;
        class37.method313(this.method574(0, arg2).field4749 & 0xFF, this.method574(0, arg2).field4742 & 0xFF, 0);
        if (arg0 != 74) {
            field4897 = (int[][][]) ((int[][][]) null);
        }
        class248 var5 = this.method2143((byte) 110, arg2);
        if (var5 != null) {
            var4 = var5.method1708(this, this.field4882, arg1);
        }
        if (!var4) {
            class73 var6 = this.method2141(84, arg2);
            var6.method547(2477);
        }
        field4915++;
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(II)Luh;", line = 405)
    private final class73 method2141(int arg0, int arg1) {
        field4890++;
        class73 var3 = (class73) this.field4918.method443(-2, (long) arg1);
        if (var3 == null) {
            class73 var4 = new class73(this.method574(0, arg1).field4744 & 0xFFFF);
            this.field4918.method439(var4, (long) arg1, (byte) 18);
            return arg0 <= 70 ? (class73) null : var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ll;Ll;Ll;IZ)V", line = 423)
    public class315(class133 arg0, class133 arg1, class133 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4883 = arg0;
        this.field4882 = arg2;
        this.field4923 = arg4;
        this.field4900 = arg3;
        this.field4889 = new class53(this.field4900);
        if (class94.field1516) {
            this.field4918 = new class53(this.field4900);
        } else {
            this.field4918 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)[I", line = 450)
    public final int[] method2091(int arg0, boolean arg1) {
        field4906++;
        class248 var3 = this.method2143((byte) 105, arg0);
        if (arg1) {
            this.method2088(58, (byte) -2);
        }
        return var3 == null ? null : var3.method1703(this, this.field4882, this.field4923 || this.method574(0, arg0).field4748);
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(II)Lhj;", line = 472)
    public final class76 method1031(int arg0, int arg1) {
        field4919++;
        class248 var3 = this.method2143((byte) -110, arg0);
        if (arg1 == -12818) {
            return var3 == null ? null : var3.field3926;
        } else {
            return (class76) null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V", line = 489)
    public final void method2142(byte arg0) {
        this.field4889.method440((byte) -104);
        field4916++;
        if (this.field4918 != null) {
            this.field4918.method440((byte) -111);
        }
        int var2 = 106 % ((arg0 + 16) / 61);
        class248.field3924 = null;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)V", line = 504)
    public final void method2083(int arg0, int arg1) {
        this.method2084((byte) 74, this.field4923 || this.method574(0, arg1).field4748 ? 64 : 128, arg1);
        if (arg0 != 32612) {
            this.field4889 = (class53) null;
        }
        field4893++;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(BI)Lei;", line = 515)
    private final class248 method2143(byte arg0, int arg1) {
        field4891++;
        class248 var3 = (class248) this.field4889.method443(-2, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4883.method980(arg1, 0, 5);
        if (var4 == null) {
            return null;
        } else {
            class248 var5 = new class248(new class166(var4));
            this.field4889.method439(var5, (long) arg1, (byte) 18);
            int var6 = -60 % ((38 - arg0) / 52);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)I", line = 542)
    public final int method2079(byte arg0, int arg1) {
        if (arg0 == 42) {
            field4885++;
            return this.method574(arg0 - 42, arg1).field4742 & 0xFF;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(IZ)V", line = 559)
    public final void method2144(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        for (class248 var3 = (class248) this.field4889.method438(-6213); var3 != null; var3 = (class248) this.field4889.method437(121)) {
            if (var3.field3936) {
                var3.method1707(arg0);
                var3.field3936 = false;
            }
        }
        field4904++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZIFI)Lgm;", line = 590)
    public final class249 method2087(int arg0, boolean arg1, int arg2, float arg3, int arg4) {
        if (arg0 > -103) {
            this.method2142((byte) 0);
        }
        field4921++;
        class248 var6 = this.method2143((byte) 99, arg4);
        if (var6 != null && var6.method1702(this, this.field4882)) {
            return arg1 ? var6.field3926.method559(false, this.field4882, -122, (double) arg3, arg2, arg2, this) : var6.field3926.method553(false, 127, this.field4882, arg2, (double) arg3, this, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(II)Z", line = 624)
    public final boolean method2092(int arg0, int arg1) {
        field4911++;
        if (arg1 != -20003) {
            this.method2080(31, -73);
        }
        return !this.method574(0, arg0).field4747;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZB)V", line = 636)
    public final void method2145(boolean arg0, byte arg1) {
        this.field4923 = arg0;
        this.method2142((byte) 58);
        int var3 = -40 / ((-arg1 - 26) / 43);
        field4892++;
    }

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "(II)V", line = 649)
    public static final void method2146(int arg0, int arg1) {
        if (arg1 >= -2) {
            method2137((byte[]) null, (byte) -89, -89, 100);
        }
        class338 var2 = class195.method1391(4, (byte) -92, arg0);
        field4902++;
        var2.method2347(true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V", line = 661)
    public static final void method2147(int arg0, int arg1, int arg2) {
        if (arg1 == -18191) {
            field4881++;
            class338 var3 = class195.method1391(12, (byte) -92, arg0);
            var3.method2352((byte) 127);
            var3.field5279 = arg2;
        }
    }
}
