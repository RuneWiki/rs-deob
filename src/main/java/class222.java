import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class222 {

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "[I")
    private int[] field2975;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2968 = 0;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lfd;")
    public static class194 field2972;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lam;")
    public static class286 field2974;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method1198(int arg0, boolean arg1) {
        field2969++;
        if (!arg1) {
            method1203(61, 17, -94, -98, (class91) null, (class158) null, -69, (class225) null);
        }
        for (class338 var2 = class176.field2206.method315((byte) -115); var2 != null; var2 = class176.field2206.method310(-114)) {
            if ((var2.field4510 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1967(-1);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1199(int arg0) {
        class314.field4205.method2344(arg0 ^ arg0);
        field2970++;
        class266.field3616 = null;
        class252.field3445 = 1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V", line = 38)
    public static void method1200(boolean arg0) {
        field2974 = null;
        field2972 = null;
        if (!arg0) {
            field2978 = -23;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([BB)[B", line = 49)
    public static final byte[] method1201(byte[] arg0, byte arg1) {
        field2977++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        class358.method2183(arg0, 0, var2, 0, arg0.length);
        if (arg1 != -18) {
            field2978 = 39;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I", line = 68)
    public final int method1202(int arg0, int arg1) {
        if (arg1 <= 48) {
            return 9;
        }
        field2976++;
        int var3 = (this.field2975.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field2975[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2975[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIILur;Lc;ILds;)V", line = 96)
    public static final void method1203(int arg0, int arg1, int arg2, int arg3, class91 arg4, class158 arg5, int arg6, class225 arg7) {
        field2971++;
        class319 var8 = new class319();
        var8.field4261 = arg3 * 128;
        var8.field4249 = arg2 * 128;
        if (arg0 != -1) {
            field2978 = -113;
        }
        var8.field4242 = arg6;
        if (arg7 != null) {
            var8.field4251 = arg7;
            int var10 = arg7.field2995;
            int var11 = arg7.field3019;
            if (arg1 == 1 || arg1 == 3) {
                var11 = arg7.field2995;
                var10 = arg7.field3019;
            }
            var8.field4256 = arg7.field3017;
            var8.field4248 = arg7.field3040;
            var8.field4245 = (arg3 + var10) * 128;
            var8.field4244 = arg7.field3023;
            var8.field4255 = arg7.field3000;
            var8.field4252 = (arg2 + var11) * 128;
            var8.field4254 = arg7.field2997 * 128;
            var8.field4260 = arg7.field3063;
            if (arg7.field3061 != null) {
                var8.field4267 = true;
                var8.method1843(0);
            }
            if (var8.field4260 != null) {
                var8.field4250 = var8.field4248 + (int) ((double) (var8.field4255 - var8.field4248) * Math.random());
            }
            class98.field1158.method825(arg0 ^ 0xFFFFFFA9, var8);
        } else if (arg4 != null) {
            var8.field4247 = arg4;
            class345 var9 = arg4.field1035;
            if (var9.field4672 != null) {
                var8.field4267 = true;
                var9 = var9.method2026(-1);
            }
            if (var9 != null) {
                var8.field4245 = (var9.field4624 + arg3) * 128;
                var8.field4252 = (var9.field4624 + arg2) * 128;
                var8.field4256 = class247.method1318(arg4, (byte) 91);
                var8.field4254 = var9.field4654 * 128;
                var8.field4244 = var9.field4637;
            }
            class296.field4034.method825(62, var8);
        } else if (arg5 != null) {
            var8.field4270 = arg5;
            var8.field4245 = (arg3 + arg5.method857((byte) -106)) * 128;
            var8.field4252 = (arg2 + arg5.method857((byte) -106)) * 128;
            var8.field4256 = class356.method2169((byte) -102, arg5);
            var8.field4254 = arg5.field2025 * 128;
            var8.field4244 = arg5.field2020;
            class420.field6128.method314((long) arg5.field6095, var8, 7079);
            return;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILc;I)V", line = 188)
    public static final void method1204(byte arg0, int arg1, class158 arg2, int arg3) {
        field2973++;
        if (arg0 != -41) {
            return;
        }
        if ((arg1 & 0x800) != 0) {
            int var4 = class448.field6514.method1364(90);
            arg2.field6067 = class448.field6514.method1387(arg0 + 39);
            arg2.field6042 = class448.field6514.method1344(arg0 - 63);
            arg2.field6048 = (var4 & 0x8000) != 0;
            arg2.field6055 = var4 & 0x7FFF;
            arg2.field6062 = arg2.field6067 + arg2.field6055 + class234.field3224;
        }
        if ((arg1 & 0x1) != 0) {
            int var5 = class448.field6514.method1383(255);
            int var6 = class448.field6514.method1350(31351);
            arg2.method2603(var6, class234.field3224, true, var5);
            arg2.field6034 = class234.field3224 + 300;
            arg2.field6043 = class448.field6514.method1331(true);
        }
        if ((arg1 & 0x80) != 0) {
            arg2.field6099 = class448.field6514.method1374(-2);
            arg2.field6023 = class448.field6514.method1334(-17290);
        }
        if ((arg1 & 0x100) != 0) {
            int var7 = class448.field6514.method1383(255);
            int var8 = class448.field6514.method1344(-86);
            arg2.method2603(var8, class234.field3224, true, var7);
        }
        if ((arg1 & 0x1000) != 0) {
            int var9 = class448.field6514.method1334(arg0 ^ 0x43A1);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = class448.field6514.method1348(-11299);
            boolean var11 = true;
            if (var9 != -1 && arg2.field6027 != -1) {
                if (arg2.field6027 == var9) {
                    class393 var16 = class220.method1186((byte) -110, var9);
                    if (var16.field5666 && var16.field5648 != -1) {
                        class208 var17 = class193.method1037(arg0 ^ 0xFFFFFFE7, var16.field5648);
                        int var18 = var17.field2806;
                        if (var18 == 0) {
                            var11 = false;
                        } else if (var18 == 1) {
                            var11 = true;
                        } else if (var18 == 2) {
                            var11 = false;
                            arg2.field6059 = 0;
                        }
                    }
                } else {
                    class393 var12 = class220.method1186((byte) -110, var9);
                    class393 var13 = class220.method1186((byte) -110, arg2.field6027);
                    if (var12.field5648 != -1 && var13.field5648 != -1) {
                        class208 var14 = class193.method1037(33, var12.field5648);
                        class208 var15 = class193.method1037(101, var13.field5648);
                        if (var15.field2819 > var14.field2819) {
                            var11 = false;
                        }
                    }
                }
            }
            if (var11) {
                arg2.field6078 = (var10 & 0xFFFF) + class234.field3224;
                arg2.field6083 = 0;
                arg2.field6027 = var9;
                arg2.field6068 = 1;
                arg2.field6091 = var10 >> 16;
                arg2.field6039 = 0;
                if (class234.field3224 < arg2.field6078) {
                    arg2.field6039 = -1;
                }
                if (arg2.field6027 != -1 && class234.field3224 == arg2.field6078) {
                    int var19 = class220.method1186((byte) -110, arg2.field6027).field5648;
                    if (var19 != -1) {
                        class208 var20 = class193.method1037(arg0 + 99, var19);
                        if (var20 != null && var20.field2823 != null) {
                            class320.method1848(class427.field6264 == arg2, 99, var20, 0, arg2.field152, arg2.field154);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x4) != 0) {
            int var21 = class448.field6514.method1334(-17290);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = class448.field6514.method1350(31351);
            class390.method2424(arg2, (byte) -72, var21, var22);
        }
        if ((arg1 & 0x20) != 0) {
            arg2.field6024 = class448.field6514.method1364(90);
            if (arg2.field6024 == 65535) {
                arg2.field6024 = -1;
            }
        }
        if ((arg1 & 0x200) != 0) {
            arg2.field6020 = class448.field6514.method1387(-2);
            arg2.field6089 = class448.field6514.method1387(-2);
            arg2.field6026 = class448.field6514.method1344(-98);
            arg2.field6031 = class448.field6514.method1344(arg0 - 56);
            arg2.field6029 = class448.field6514.method1374(arg0 ^ 0x29) + class234.field3224;
            arg2.field6037 = class448.field6514.method1334(arg0 - 17249) + class234.field3224;
            arg2.field6076 = class448.field6514.method1344(arg0 - 64);
            arg2.field6118 = 0;
            arg2.field6111 = 1;
        }
        if ((arg1 & 0x2) != 0) {
            int var23 = class448.field6514.method1344(-97);
            byte[] var24 = new byte[var23];
            class250 var25 = new class250(var24);
            class448.field6514.method1373(0, (byte) -104, var24, var23);
            class312.field4194[arg3] = var25;
            arg2.method852(arg0 ^ 0xFFFFFFD7, var25);
        }
        if ((arg1 & 0x400) != 0) {
            int var26 = class448.field6514.method1344(arg0 - 45);
            int[] var27 = new int[var26];
            int[] var28 = new int[var26];
            int[] var29 = new int[var26];
            for (int var30 = 0; var30 < var26; var30++) {
                int var31 = class448.field6514.method1334(-17290);
                if (var31 == 65535) {
                    var31 = -1;
                }
                var27[var30] = var31;
                var28[var30] = class448.field6514.method1387(-2);
                var29[var30] = class448.field6514.method1364(90);
            }
            class110.method586(var28, var29, var27, arg2, false);
        }
        if ((arg1 & 0x10) != 0) {
            int var32 = class448.field6514.method1334(-17290);
            int var33 = class448.field6514.method1344(-103);
            int var34 = class448.field6514.method1350(31351);
            int var35 = class448.field6514.field3389;
            boolean var36 = (var32 & 0x8000) != 0;
            if (arg2.field2034 != null && arg2.field2017 != null) {
                boolean var37 = false;
                if (var33 <= 1) {
                    if (!var36 && (class142.field1814 && !class342.field4576 || class374.field5268)) {
                        var37 = true;
                    } else if (class398.method2491(arg2.field2034, 127)) {
                        var37 = true;
                    }
                }
                if (!var37 && class17.field155 == 0) {
                    class230.field3172.field3389 = 0;
                    class448.field6514.method1351(class230.field3172.field3406, (byte) -125, 0, var34);
                    class230.field3172.field3389 = 0;
                    int var38 = -1;
                    String var40;
                    if (var36) {
                        var32 &= 0x7FFF;
                        class97 var39 = class122.method647(class230.field3172, arg0 ^ 0x54);
                        var38 = var39.field1148;
                        var40 = var39.field1150.method2550(class230.field3172, arg0 + 40);
                    } else {
                        var40 = class183.method980((byte) -113, class56.method288(-7023, class451.method2805(arg0 - 77, class230.field3172)));
                    }
                    arg2.field6060 = var40.trim();
                    arg2.field6098 = var32 & 0xFF;
                    arg2.field6044 = 150;
                    arg2.field6061 = var32 >> 8;
                    int var41;
                    if (var33 == 1 || var33 == 2) {
                        var41 = var36 ? 17 : 1;
                    } else {
                        var41 = var36 ? 17 : 2;
                    }
                    if (var33 == 2) {
                        class418.method2595(0, "<img=1>" + arg2.method851(true, -116), var40, 0, var41, "<img=1>" + arg2.method855(false, false), var38, (String) null);
                    } else if (var33 == 1) {
                        class418.method2595(0, "<img=0>" + arg2.method851(true, -116), var40, 0, var41, "<img=0>" + arg2.method855(false, false), var38, (String) null);
                    } else {
                        class418.method2595(0, arg2.method851(true, -116), var40, 0, var41, arg2.method855(false, false), var38, (String) null);
                    }
                }
            }
            class448.field6514.field3389 = var35 + var34;
        }
        if ((arg1 & 0x40) == 0) {
            return;
        }
        arg2.field6060 = class448.field6514.method1349(-1754884856);
        if (arg2.field6060.charAt(0) == '~') {
            arg2.field6060 = arg2.field6060.substring(1);
            class275.method1518(2, 0, (byte) -107, arg2.field6060, arg2.method855(false, false), arg2.method851(true, -116));
        } else if (class427.field6264 == arg2) {
            class275.method1518(2, 0, (byte) -107, arg2.field6060, arg2.method855(false, false), arg2.method851(true, arg0 ^ 0x5B));
        }
        arg2.field6098 = 0;
        arg2.field6061 = 0;
        arg2.field6044 = 150;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([I)V", line = 520)
    public class222(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field2975 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2975[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2975[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2975[var5 + var5] = arg0[var4];
            this.field2975[var5 + var5 + 1] = var4++;
        }
    }
}
