import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class89 extends class27 {

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    private int field1253 = 4096;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
    private int field1251 = 0;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "S")
    public static short field1254 = 320;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "Lph;")
    public static class361 field1244;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "Lph;")
    public static class361 field1246;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BC)C", line = 4)
    public static final char method705(byte arg0, char arg1) {
        if (arg0 < 65) {
            method705((byte) 125, '\u001a');
        }
        field1245++;
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[[I", line = 21)
    public final int[][] method19(int arg0, int arg1) {
        int[][] var3 = this.field379.method668(arg1, 0);
        if (arg0 != -28941) {
            method711((byte) 72);
        }
        if (this.field379.field1171) {
            int[][] var4 = this.method168(0, arg0 ^ 0x7101, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class209.field3053; var11++) {
                int var12 = var5[var11];
                int var13 = var8[var11];
                int var14 = var6[var11];
                if (var12 < this.field1251) {
                    var7[var11] = this.field1251;
                } else if (var12 <= this.field1253) {
                    var7[var11] = var12;
                } else {
                    var7[var11] = this.field1253;
                }
                if (this.field1251 > var14) {
                    var9[var11] = this.field1251;
                } else if (var14 > this.field1253) {
                    var9[var11] = this.field1253;
                } else {
                    var9[var11] = var14;
                }
                if (this.field1251 > var13) {
                    var10[var11] = this.field1251;
                } else if (this.field1253 >= var13) {
                    var10[var11] = var13;
                } else {
                    var10[var11] = this.field1253;
                }
            }
        }
        field1256++;
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)I", line = 98)
    public static final int method706(int arg0) {
        field1243++;
        if (class124.field1809 != null) {
            return 3;
        } else if (class141.field2031 && class352.field5420) {
            return 2;
        } else if (class141.field2031 && !class352.field5420) {
            return 1;
        } else {
            if (arg0 != -12311) {
                field1244 = (class361) null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILsb;I)V", line = 121)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field1248++;
        if (arg2 == 0) {
            this.field1251 = arg1.method1317((byte) 64);
        } else if (arg2 == 1) {
            this.field1253 = arg1.method1317((byte) 13);
        } else if (arg2 == 2) {
            this.field376 = arg1.method1319(255) == 1;
        }
        if (arg0 != -5836) {
            method705((byte) 39, (char) 65454);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)[I", line = 168)
    public final int[] method18(int arg0, byte arg1) {
        field1250++;
        if (arg1 != -62) {
            method713(-14, (byte) -102);
        }
        int[] var3 = this.field375.method2087(-52, arg0);
        if (this.field375.field4382) {
            int[] var4 = this.method164(arg0, arg1 ^ 0xFFFFFFF8, 0);
            for (int var5 = 0; var5 < class209.field3053; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field1251) {
                    var3[var5] = this.field1251;
                } else if (this.field1253 < var6) {
                    var3[var5] = this.field1253;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 211)
    public class89() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIILh;IJZ)Z", line = 215)
    public static final boolean method707(int arg0, int arg1, int arg2, int arg3, int arg4, class111 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class165.method1180(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)V", line = 256)
    public static final void method708(int arg0) {
        if (arg0 != 0) {
            method705((byte) 15, (char) 65475);
        }
        class316.field4694.method462(24);
        field1258++;
    }

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)V", line = 268)
    public static final void method709(int arg0) {
        class95.field1336 = 0;
        field1252++;
        class22.field337 = 0;
        class32.method230(true);
        class127.method940((byte) 118);
        class303.method2138(5);
        class110.method843((byte) -21);
        for (int var1 = 0; var1 < class22.field337; var1++) {
            int var2 = class177.field2548[var1];
            if (class304.field4560 != class343.field5312[var2].field5153) {
                if (class343.field5312[var2].field3432 > 0) {
                    class247.method1812(class343.field5312[var2], var2, arg0 ^ 0xFFFFFFF7);
                }
                class343.field5312[var2] = null;
            }
        }
        if (class358.field5481 != class83.field1194.field2776) {
            throw new RuntimeException("gpp1 pos:" + class83.field1194.field2776 + " psize:" + class358.field5481);
        }
        for (int var3 = 0; var3 < class265.field4053; var3++) {
            if (class343.field5312[class227.field3426[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class265.field4053);
            }
        }
        if (arg0 != -11) {
            field1244 = (class361) null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 320)
    public static final void method710(String arg0, int arg1, int arg2, int arg3, int arg4) {
        field1249++;
        class359 var5 = class165.method1172(arg3, -1, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field5670 != null) {
            class300 var6 = new class300();
            var6.field4494 = var5.field5670;
            var6.field4491 = var5;
            var6.field4482 = arg0;
            var6.field4481 = arg2;
            class48.method412(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field5515 > 0) {
            var7 = class131.method951(var5, 26565);
        }
        if (!var7 || !client.method347(var5).method1452(false, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class83.field1191++;
            class107.field1533.method1915(true, 161);
            class107.field1533.method1354(arg1, (byte) 109);
            class107.field1533.method1361(arg3, (byte) 125);
        }
        if (arg4 != 8477) {
            return;
        }
        if (arg2 == 2) {
            class333.field5102++;
            class107.field1533.method1915(true, 5);
            class107.field1533.method1354(arg1, (byte) -10);
            class107.field1533.method1361(arg3, (byte) 126);
        }
        if (arg2 == 3) {
            class107.field1533.method1915(true, 199);
            class107.field1533.method1354(arg1, (byte) -7);
            class250.field3717++;
            class107.field1533.method1361(arg3, (byte) 123);
        }
        if (arg2 == 4) {
            class285.field4300++;
            class107.field1533.method1915(true, 174);
            class107.field1533.method1354(arg1, (byte) -90);
            class107.field1533.method1361(arg3, (byte) 123);
        }
        if (arg2 == 5) {
            class202.field2972++;
            class107.field1533.method1915(true, 151);
            class107.field1533.method1354(arg1, (byte) 103);
            class107.field1533.method1361(arg3, (byte) 123);
        }
        if (arg2 == 6) {
            class107.field1533.method1915(true, 85);
            class107.field1533.method1354(arg1, (byte) -107);
            class107.field1533.method1361(arg3, (byte) 126);
            class287.field4343++;
        }
        if (arg2 == 7) {
            class107.field1533.method1915(true, 58);
            class77.field1125++;
            class107.field1533.method1354(arg1, (byte) -88);
            class107.field1533.method1361(arg3, (byte) 124);
        }
        if (arg2 == 8) {
            class252.field3757++;
            class107.field1533.method1915(true, 50);
            class107.field1533.method1354(arg1, (byte) -121);
            class107.field1533.method1361(arg3, (byte) 125);
        }
        if (arg2 == 9) {
            class72.field1059++;
            class107.field1533.method1915(true, 132);
            class107.field1533.method1354(arg1, (byte) -35);
            class107.field1533.method1361(arg3, (byte) 127);
        }
        if (arg2 == 10) {
            class73.field1074++;
            class107.field1533.method1915(true, 228);
            class107.field1533.method1354(arg1, (byte) -71);
            class107.field1533.method1361(arg3, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)V", line = 451)
    public static void method711(byte arg0) {
        field1244 = null;
        if (arg0 == -66) {
            field1246 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIB)Z", line = 462)
    public static final boolean method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field1255++;
        if (arg6 >= arg2 + arg1 || arg2 >= (arg4 + arg6)) {
            return false;
        } else if (arg3 + arg7 > arg5 && arg5 + arg0 > arg3) {
            return arg8 >= -59 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)I", line = 485)
    public static final int method713(int arg0, byte arg1) {
        if (arg1 < 2) {
            method711((byte) 117);
        }
        field1247++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)V", line = 509)
    public static final void method714(int arg0, int arg1) {
        class95 var2 = class227.method1699(6, -1855723168, arg0);
        if (arg1 <= 96) {
            method708(-90);
        }
        field1257++;
        var2.method743(0);
    }
}
