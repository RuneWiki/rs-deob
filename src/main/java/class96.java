import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class96 extends class379 {

    @OriginalMember(owner = "client!iia", name = "J", descriptor = "I")
    public int field1275 = 0;

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "Z")
    public static boolean field1252 = true;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "Lfj;")
    public static class684 field1251 = new class684(9, -1);

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!iia", name = "r", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!iia", name = "s", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!iia", name = "x", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!iia", name = "y", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!iia", name = "z", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!iia", name = "A", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!iia", name = "C", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!iia", name = "D", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!iia", name = "E", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!iia", name = "H", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!iia", name = "I", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!iia", name = "K", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!iia", name = "M", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!iia", name = "O", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!iia", name = "Q", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!iia", name = "B", descriptor = "Ltba;")
    public class174 field1268;

    @OriginalMember(owner = "client!iia", name = "v", descriptor = "Laia;")
    public class242 field1262;

    @OriginalMember(owner = "client!iia", name = "L", descriptor = "Laia;")
    public class242 field1277;

    @OriginalMember(owner = "client!iia", name = "P", descriptor = "Lvk;")
    public class388 field1281;

    @OriginalMember(owner = "client!iia", name = "S", descriptor = "Liaa;")
    public class521 field1283;

    @OriginalMember(owner = "client!iia", name = "q", descriptor = "Leaa;")
    public class527 field1257;

    @OriginalMember(owner = "client!iia", name = "N", descriptor = "Leaa;")
    public class527 field1279;

    @OriginalMember(owner = "client!iia", name = "t", descriptor = "Loi;")
    public class80 field1260;

    @OriginalMember(owner = "client!iia", name = "F", descriptor = "Loi;")
    public class80 field1272;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "Z")
    public boolean field1250;

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "Z")
    public boolean field1256;

    @OriginalMember(owner = "client!iia", name = "u", descriptor = "Z")
    public boolean field1261;

    @OriginalMember(owner = "client!iia", name = "w", descriptor = "[I")
    public int[] field1263;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZIBIIIIII)Z", line = 6)
    public static final boolean method834(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1266++;
        int var9 = class300.field3596.field3453[0];
        int var10 = class300.field3596.field3455[0];
        int var11 = -97 % ((arg2 - 55) / 46);
        if (var9 < 0 || var9 >= class596.field8090 || var10 < 0 || class107.field1350 <= var10) {
            return false;
        } else if (arg7 >= 0 && class596.field8090 > arg7 && arg3 >= 0 && class107.field1350 > arg3) {
            int var12 = class482.method2863(arg3, class633.field8649[class300.field3596.field808], arg6, false, arg0, var10, var9, arg4, arg1, class716.field10030, arg7, arg5, class300.field3596.method1665(1720746760), arg8, class199.field2384);
            if (var12 < 1) {
                return false;
            }
            class754.field10460 = class199.field2384[var12 - 1];
            class687.field9376 = class716.field10030[var12 - 1];
            class327.field4052 = false;
            class123.method955((byte) 123);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IJ)V", line = 43)
    public static final void method835(int arg0, long arg1) {
        field1273++;
        int var3 = class535.field7540 + class300.field3596.field823;
        int var4 = class451.field6372 + class300.field3596.field813;
        if (arg0 != -11423) {
            method834(false, 62, (byte) -81, -56, 112, -127, -35, 83, 13);
        }
        if ((class713.field10000 - var3) < -2000 || class713.field10000 - var3 > 2000 || class353.field4390 - var4 < -2000 || (class353.field4390 - var4) > 2000) {
            class713.field10000 = var3;
            class353.field4390 = var4;
        }
        if (class713.field10000 != var3) {
            int var5 = var3 - class713.field10000;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class713.field10000 += var6;
        }
        class229.field2718 += (float) arg1 * class174.field2108 / 6.0F;
        class47.field626 += (float) arg1 * class687.field9377 / 6.0F;
        if (class353.field4390 != var4) {
            int var7 = var4 - class353.field4390;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class353.field4390 += var8;
        }
        class434.method2569(arg0 + 11334);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V", line = 137)
    public final void method836(int arg0) {
        field1249++;
        int var2 = this.field1274;
        boolean var3 = this.field1256;
        if (this.field1268 != null) {
            class174 var6 = this.field1268.method1178(false, class2.field30);
            if (var6 == null) {
                this.field1282 = 0;
                this.field1248 = 256;
                this.field1254 = 256;
                this.field1278 = 0;
                this.field1261 = false;
                this.field1264 = 0;
                this.field1263 = null;
                this.field1256 = false;
                this.field1259 = 0;
                this.field1269 = 0;
                this.field1274 = -1;
            } else {
                this.field1263 = var6.field2175;
                this.field1261 = var6.field2165;
                this.field1269 = var6.field2180;
                this.field1254 = var6.field2114;
                this.field1256 = var6.field2163;
                this.field1264 = var6.field2116 << 9;
                this.field1278 = var6.field2099;
                this.field1259 = var6.field2093;
                this.field1274 = var6.field2148;
                this.field1248 = var6.field2084;
            }
        } else if (this.field1281 != null) {
            int var4 = class136.method1002(this.field1281, (byte) -128);
            if (var2 != var4) {
                this.field1274 = var4;
                class479 var5 = this.field1281.field5003;
                if (var5.field6636 != null) {
                    var5 = var5.method2843(class2.field30, 228);
                }
                if (var5 == null) {
                    this.field1254 = 256;
                    this.field1256 = this.field1281.field5003.field6686;
                    this.field1248 = 256;
                    this.field1278 = this.field1264 = this.field1282 = 0;
                } else {
                    this.field1248 = var5.field6672;
                    this.field1264 = var5.field6663 << 9;
                    this.field1256 = var5.field6686;
                    this.field1282 = var5.field6704 << 9;
                    this.field1278 = var5.field6660;
                    this.field1254 = var5.field6646;
                }
            }
        } else if (this.field1283 != null) {
            this.field1274 = class427.method2544(-4293, this.field1283);
            this.field1256 = this.field1283.field7382;
            this.field1264 = this.field1283.field7369 << 9;
            this.field1278 = this.field1283.field7376;
            this.field1254 = 256;
            this.field1248 = 256;
            this.field1282 = 0;
        }
        if ((this.field1274 != var2 || this.field1256 != var3) && this.field1260 != null) {
            class783.field10811.method3257(this.field1260);
            this.field1260 = null;
            this.field1279 = null;
            this.field1277 = null;
        }
        if (arg0 <= 45) {
            field1252 = false;
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V", line = 247)
    public static void method837(int arg0) {
        field1251 = null;
        if (arg0 != -29765) {
            method837(-43);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V", line = 257)
    public static final void method838(int arg0, int arg1) {
        field1265++;
        int var2 = 104 % ((arg1 - 52) / 52);
        class714 var3 = class350.method2072((long) arg0, 14, (byte) 125);
        var3.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V", line = 271)
    public static final void method839(byte arg0) {
        field1253++;
        if (arg0 > -84) {
            field1251 = null;
        }
        class520.field7342.method1690(0);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "([J[II)V", line = 301)
    public static final void method840(long[] arg0, int[] arg1, int arg2) {
        field1280++;
        int var3 = 77 / ((arg2 - 32) / 33);
        class121.method948(arg0.length - 1, arg0, arg1, 0, true);
    }
}
