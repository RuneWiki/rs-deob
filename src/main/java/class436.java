import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class436 extends class115 {

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    private int field6230 = 0;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Laj;")
    private class71 field6233 = new class71(16);

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    private int field6234 = 0;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "Lfi;")
    private class166 field6237 = new class166();

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "J")
    private long field6239 = 0L;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    private int field6225;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lan;")
    private class377 field6206;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "Z")
    private boolean field6235;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "Lfi;")
    private class166 field6236;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    private int field6217;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lps;")
    private class395 field6210;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "Lp;")
    private class446 field6229;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Lan;")
    private class377 field6224;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    private int field6232;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "Z")
    private boolean field6240;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lqc;")
    private class95 field6221;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "J")
    public static volatile long field6207 = 0L;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "Z")
    public static boolean field6228 = false;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Llr;")
    private class105 field6211;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "Z")
    private boolean field6238;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[B")
    private byte[] field6212;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)Lqc;")
    private final class95 method2700(byte arg0, int arg1, int arg2) {
        field6208++;
        class95 var4 = (class95) this.field6233.method614(-97, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field1374 && var4.field1384) {
            var4.method2367(5);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field6206 == null || this.field6212[arg1] == -1) {
                    if (this.field6229.method2763(true)) {
                        return null;
                    }
                    var4 = this.field6229.method2764((byte) 2, true, arg1, this.field6225, (byte) -60);
                } else {
                    var4 = this.field6210.method2434(this.field6206, -16151, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field6206 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6210.method2427(this.field6206, (byte) 122, arg1);
            } else if (arg2 == 2) {
                if (this.field6206 == null) {
                    throw new RuntimeException();
                }
                if (this.field6212[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6229.method2773((byte) 85)) {
                    return null;
                }
                var4 = this.field6229.method2764((byte) 2, false, arg1, this.field6225, (byte) -60);
            } else {
                throw new RuntimeException();
            }
            this.field6233.method612((long) arg1, -1, var4);
        }
        if (var4.field1384) {
            return null;
        }
        if (arg0 >= -121) {
            this.field6206 = null;
        }
        byte[] var5 = var4.method643(false);
        if (!var4 instanceof class74) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class314.field4255.reset();
                class314.field4255.update(var5, 0, var5.length - 2);
                int var6 = (int) class314.field4255.getValue();
                if (this.field6211.field1537[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field6229.field6435 = 0;
                this.field6229.field6438 = 0;
            } catch (RuntimeException var12) {
                this.field6229.method2760((byte) -21);
                var4.method2367(5);
                if (var4.field1374 && !this.field6229.method2763(true)) {
                    class440 var7 = this.field6229.method2764((byte) 2, true, arg1, this.field6225, (byte) -60);
                    this.field6233.method612((long) arg1, -1, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6211.field1534[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field6211.field1534[arg1];
            if (this.field6206 != null) {
                this.field6210.method2430(103, arg1, this.field6206, var5);
                if (this.field6212[arg1] != 1) {
                    this.field6230++;
                    this.field6212[arg1] = 1;
                }
            }
            if (!var4.field1374) {
                var4.method2367(5);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class314.field4255.reset();
            class314.field4255.update(var5, 0, var5.length - 2);
            int var8 = (int) class314.field4255.getValue();
            if (this.field6211.field1537[arg1] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6211.field1534[arg1] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field6212[arg1] != 1) {
                this.field6230++;
                this.field6212[arg1] = 1;
            }
            if (!var4.field1374) {
                var4.method2367(5);
            }
            return var4;
        } catch (Exception var11) {
            this.field6212[arg1] = -1;
            var4.method2367(5);
            if (var4.field1374 && !this.field6229.method2763(true)) {
                class440 var10 = this.field6229.method2764((byte) 2, true, arg1, this.field6225, (byte) -60);
                this.field6233.method612((long) arg1, -1, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    public static final void method2701(int arg0, int arg1) {
        field6216++;
        if (arg1 != -5955) {
            field6207 = -7L;
        }
        if (class375.field5283 == null || arg0 > class375.field5283.length) {
            class375.field5283 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public final void method2702(byte arg0) {
        field6220++;
        if (arg0 >= 17 && this.field6206 != null) {
            this.field6238 = true;
            if (this.field6236 == null) {
                this.field6236 = new class166();
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)I")
    public final int method2703(int arg0) {
        field6226++;
        if (arg0 != 21210) {
            this.method2700((byte) -84, -92, 14);
        }
        return this.field6230;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
    public final int method930(int arg0, int arg1) {
        field6213++;
        if (arg1 == 0) {
            class95 var3 = (class95) this.field6233.method614(-82, (long) arg0);
            return var3 == null ? 0 : var3.method646(arg1);
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)I")
    public final int method2704(byte arg0) {
        field6218++;
        if (arg0 != 10) {
            method2708(-103, -89, (class139) null);
        }
        if (this.field6211 == null) {
            return 0;
        } else if (this.field6235) {
            class381 var2 = this.field6236.method1240((byte) -121);
            return var2 == null ? 0 : (int) var2.field5349;
        } else {
            return this.field6211.field1542;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)I")
    public final int method2705(int arg0) {
        field6205++;
        if (this.method926(-10123) == null) {
            return this.field6221 == null ? 0 : this.field6221.method646(0);
        } else if (arg0 == 0) {
            return 100;
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
    public final void method2706(int arg0) {
        field6222++;
        if (this.field6236 == null || this.method926(-10123) == null) {
            return;
        }
        class381 var2 = this.field6237.method1240((byte) -127);
        if (arg0 <= 18) {
            this.method926(71);
        }
        while (var2 != null) {
            int var3 = (int) var2.field5349;
            if (var3 < 0 || this.field6211.field1547 <= var3 || this.field6211.field1529[var3] == 0) {
                var2.method2367(5);
            } else {
                if (this.field6212[var3] == 0) {
                    this.method2700((byte) -122, var3, 1);
                }
                if (this.field6212[var3] == -1) {
                    this.method2700((byte) -128, var3, 2);
                }
                if (this.field6212[var3] == 1) {
                    var2.method2367(5);
                }
            }
            var2 = this.field6237.method1245(1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
    public final void method2707(int arg0) {
        field6215++;
        if (arg0 > -5) {
            return;
        }
        if (this.field6236 != null) {
            if (this.method926(-10123) == null) {
                return;
            }
            if (this.field6235) {
                boolean var6 = true;
                for (class381 var7 = this.field6236.method1240((byte) -82); var7 != null; var7 = this.field6236.method1245(1)) {
                    int var9 = (int) var7.field5349;
                    if (this.field6212[var9] == 0) {
                        this.method2700((byte) -122, var9, 1);
                    }
                    if (this.field6212[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2367(5);
                    }
                }
                while (this.field6211.field1529.length > this.field6234) {
                    if (this.field6211.field1529[this.field6234] == 0) {
                        this.field6234++;
                    } else {
                        if (this.field6210.field5541 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field6212[this.field6234] == 0) {
                            this.method2700((byte) -125, this.field6234, 1);
                        }
                        if (this.field6212[this.field6234] == 0) {
                            class381 var8 = new class381();
                            var8.field5349 = (long) this.field6234;
                            this.field6236.method1249(var8, (byte) -125);
                            var6 = false;
                        }
                        this.field6234++;
                    }
                }
                if (var6) {
                    this.field6235 = false;
                    this.field6234 = 0;
                }
            } else if (this.field6238) {
                boolean var2 = true;
                for (class381 var3 = this.field6236.method1240((byte) -120); var3 != null; var3 = this.field6236.method1245(1)) {
                    int var5 = (int) var3.field5349;
                    if (this.field6212[var5] != 1) {
                        this.method2700((byte) -128, var5, 2);
                    }
                    if (this.field6212[var5] == 1) {
                        var3.method2367(5);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field6234 < this.field6211.field1529.length) {
                    if (this.field6211.field1529[this.field6234] == 0) {
                        this.field6234++;
                    } else {
                        if (this.field6229.method2773((byte) 101)) {
                            var2 = false;
                            break;
                        }
                        if (this.field6212[this.field6234] != 1) {
                            this.method2700((byte) -124, this.field6234, 2);
                        }
                        if (this.field6212[this.field6234] != 1) {
                            class381 var4 = new class381();
                            var4.field5349 = (long) this.field6234;
                            var2 = false;
                            this.field6236.method1249(var4, (byte) -124);
                        }
                        this.field6234++;
                    }
                }
                if (var2) {
                    this.field6238 = false;
                    this.field6234 = 0;
                }
            } else {
                this.field6236 = null;
            }
        }
        if (!this.field6240 || class108.method902((byte) -93) < this.field6239) {
            return;
        }
        for (class95 var10 = (class95) this.field6233.method608(-116); var10 != null; var10 = (class95) this.field6233.method606((byte) 97)) {
            if (!var10.field1384) {
                if (var10.field1375) {
                    if (!var10.field1374) {
                        throw new RuntimeException();
                    }
                    var10.method2367(5);
                } else {
                    var10.field1375 = true;
                }
            }
        }
        this.field6239 = class108.method902((byte) -93) + 1000L;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)[B")
    public final byte[] method928(int arg0, boolean arg1) {
        field6231++;
        class95 var3 = this.method2700((byte) -126, arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method643(false);
            var3.method2367(5);
            return arg1 ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILbi;)I")
    public static final int method2708(int arg0, int arg1, class139 arg2) {
        field6219++;
        if (arg2.field2058 == null || arg2.field2058.length <= arg0) {
            return -2;
        } else if (arg1 == 21721) {
            try {
                int[] var3 = arg2.field2058[arg0];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (var7 == 0) {
                        return var4;
                    }
                    if (var7 == 1) {
                        var8 = class78.field1163[var3[var5++]];
                    }
                    if (var7 == 2) {
                        var8 = class426.field6030[var3[var5++]];
                    }
                    if (var7 == 3) {
                        var8 = class414.field5786[var3[var5++]];
                    }
                    if (var7 == 4) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class139 var12 = class10.method57(arg1 + 43814, var11);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class234.method1569(arg1 ^ 0x5C87, var13).field6569 || class78.field1178)) {
                            for (int var14 = 0; var14 < var12.field2101.length; var14++) {
                                if (var13 + 1 == var12.field2101[var14]) {
                                    var8 += var12.field2071[var14];
                                }
                            }
                        }
                    }
                    if (var7 == 5) {
                        var8 = class414.field5782[var3[var5++]];
                    }
                    if (var7 == 6) {
                        var8 = class212.field2939[class426.field6030[var3[var5++]] - 1];
                    }
                    if (var7 == 7) {
                        var8 = class414.field5782[var3[var5++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var8 = class95.field1379.field4599;
                    }
                    if (var7 == 9) {
                        for (int var15 = 0; var15 < 25; var15++) {
                            if (class400.field5598[var15]) {
                                var8 += class426.field6030[var15];
                            }
                        }
                    }
                    if (var7 == 10) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class139 var18 = class10.method57(65535, var17);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class234.method1569(2142, var19).field6569 || class78.field1178)) {
                            for (int var20 = 0; var20 < var18.field2101.length; var20++) {
                                if ((var19 + 1) == var18.field2101[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var7 == 11) {
                        var8 = class64.field978;
                    }
                    if (var7 == 12) {
                        var8 = class210.field2928;
                    }
                    if (var7 == 13) {
                        int var21 = class414.field5782[var3[var5++]];
                        int var22 = var3[var5++];
                        var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                    }
                    if (var7 == 15) {
                        var9 = 1;
                    }
                    if (var7 == 14) {
                        int var23 = var3[var5++];
                        var8 = class218.method1490(var23, -23365);
                    }
                    if (var7 == 16) {
                        var9 = 2;
                    }
                    if (var7 == 18) {
                        var8 = (class95.field1379.field3176 >> 7) + class283.field3794;
                    }
                    if (var7 == 17) {
                        var9 = 3;
                    }
                    if (var7 == 19) {
                        var8 = (class95.field1379.field3167 >> 7) + class296.field3988;
                    }
                    if (var7 == 20) {
                        var8 = var3[var5++];
                    }
                    if (var9 == 0) {
                        if (var6 == 0) {
                            var4 += var8;
                        }
                        if (var6 == 1) {
                            var4 -= var8;
                        }
                        if (var6 == 2 && var8 != 0) {
                            var4 /= var8;
                        }
                        if (var6 == 3) {
                            var4 *= var8;
                        }
                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Llr;")
    public final class105 method926(int arg0) {
        field6209++;
        if (this.field6211 != null) {
            return this.field6211;
        }
        if (this.field6221 == null) {
            if (this.field6229.method2763(true)) {
                return null;
            }
            this.field6221 = this.field6229.method2764((byte) 0, true, this.field6225, 255, (byte) -60);
        }
        if (this.field6221.field1384) {
            return null;
        }
        byte[] var2 = this.field6221.method643(false);
        if (arg0 != -10123) {
            this.field6235 = true;
        }
        if (this.field6221 instanceof class74) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6211 = new class105(var2, this.field6217);
                if (this.field6211.field1543 != this.field6232) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6211 = null;
                if (this.field6229.method2763(true)) {
                    this.field6221 = null;
                } else {
                    this.field6221 = this.field6229.method2764((byte) 0, true, this.field6225, 255, (byte) -60);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6211 = new class105(var2, this.field6217);
            } catch (RuntimeException var4) {
                this.field6229.method2760((byte) -21);
                this.field6211 = null;
                if (this.field6229.method2763(true)) {
                    this.field6221 = null;
                } else {
                    this.field6221 = this.field6229.method2764((byte) 0, true, this.field6225, 255, (byte) -60);
                }
                return null;
            }
            if (this.field6224 != null) {
                this.field6210.method2430(126, this.field6225, this.field6224, var2);
            }
        }
        if (this.field6206 != null) {
            this.field6212 = new byte[this.field6211.field1547];
            this.field6230 = 0;
        }
        this.field6221 = null;
        return this.field6211;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)I")
    public final int method2709(int arg0) {
        if (arg0 != -27113) {
            this.field6234 = 102;
        }
        field6214++;
        return this.field6211 == null ? 0 : this.field6211.field1542;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)V")
    public final void method931(int arg0, byte arg1) {
        field6223++;
        if (arg1 != 1 || this.field6206 == null) {
            return;
        }
        for (class381 var3 = this.field6237.method1240((byte) -123); var3 != null; var3 = this.field6237.method1245(arg1)) {
            if (((long) arg0) == var3.field5349) {
                return;
            }
        }
        class381 var4 = new class381();
        var4.field5349 = (long) arg0;
        this.field6237.method1249(var4, (byte) -123);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ILan;Lan;Lp;Lps;IIZ)V")
    public class436(int arg0, class377 arg1, class377 arg2, class446 arg3, class395 arg4, int arg5, int arg6, boolean arg7) {
        this.field6225 = arg0;
        this.field6206 = arg1;
        if (this.field6206 == null) {
            this.field6235 = false;
        } else {
            this.field6235 = true;
            this.field6236 = new class166();
        }
        this.field6217 = arg5;
        this.field6210 = arg4;
        this.field6229 = arg3;
        this.field6224 = arg2;
        this.field6232 = arg6;
        this.field6240 = arg7;
        if (this.field6224 != null) {
            this.field6221 = this.field6210.method2434(this.field6224, -16151, this.field6225);
        }
    }
}
