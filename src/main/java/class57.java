import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class57 extends class83 {

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public int field995 = 0;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Lwg;")
    public static class23 field987 = new class23();

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field1011 = 0;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Lga;")
    public class141 field1002;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lte;")
    public class206 field989;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Lc;")
    public class284 field1001;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Lc;")
    public class284 field1008;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Lnh;")
    public class288 field994;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
    public boolean field990;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
    public int[] field997;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "[[[B")
    public static byte[][][] field1006;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static final void method351(boolean arg0) {
        field996++;
        if (class154.field2572 == -1 || class162.field2688 == -1) {
            return;
        }
        int var1 = class72.field1187 + ((class66.field1107 - class72.field1187) * class112.field2027 >> 16);
        float[] var2 = new float[3];
        int var3 = class210.field3556 * 2;
        class112.field2027 += var1;
        if (class112.field2027 >= 65535) {
            class112.field2027 = 65535;
            if (class67.field1117) {
                class229.field3863 = false;
            } else {
                class229.field3863 = true;
            }
            class67.field1117 = true;
        } else {
            class229.field3863 = false;
            class67.field1117 = false;
        }
        float var4 = (float) class112.field2027 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class105.field1879[class154.field2572][var3 + 1][var5] * 3;
            int var22 = class105.field1879[class154.field2572][var3][var5] * 3;
            int var23 = (class105.field1879[class154.field2572][var3 + 2][var5] + class105.field1879[class154.field2572][var3 + 2][var5] - class105.field1879[class154.field2572][var3 + 3][var5]) * 3;
            int var24 = class105.field1879[class154.field2572][var3][var5];
            int var25 = var22 + var23 - (var21 * 2);
            int var26 = class105.field1879[class154.field2572][var3 + 2][var5] + var21 - var24 - var23;
            int var27 = var21 - var22;
            var2[var5] = (((float) var26 * var4 + (float) var25) * var4 + (float) var27) * var4 + (float) var24;
        }
        class237.field3904 = (int) var2[2] - (class255.field4162 * 128);
        int var6 = class27.field414 * 2;
        class56.field976 = (int) var2[0] - (class126.field2206 * 128);
        float[] var7 = new float[3];
        class250.field4093 = (int) var2[1] * -1;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class105.field1879[class162.field2688][var6][var8] * 3;
            int var15 = class105.field1879[class162.field2688][var6][var8];
            int var16 = class105.field1879[class162.field2688][var6 + 1][var8] * 3;
            int var17 = (class105.field1879[class162.field2688][var6 + 2][var8] + class105.field1879[class162.field2688][var6 - -2][var8] - class105.field1879[class162.field2688][var6 + 3][var8]) * 3;
            int var18 = var16 - var14;
            int var19 = class105.field1879[class162.field2688][var6 + 2][var8] - var15 - (-var16 + var17);
            int var20 = var14 + var17 - (var16 * 2);
            var7[var8] = (((float) var19 * var4 + (float) var20) * var4 + (float) var18) * var4 + (float) var15;
        }
        if (!arg0) {
            field1006 = null;
        }
        float var9 = (var7[1] - var2[1]) * -1.0F;
        float var10 = var7[2] - var2[2];
        float var11 = var7[0] - var2[0];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class41.field605 = (float) Math.atan2((double) var9, var12);
        class203.field3321 = -((float) Math.atan2((double) var11, (double) var10));
        class52.field914 = (int) ((double) class203.field3321 * 325.949D) & 0x7FF;
        class228.field3844 = (int) ((double) class41.field605 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILta;III)V")
    public static final void method352(int arg0, int arg1, int arg2, class189 arg3, int arg4, int arg5, int arg6) {
        field1005++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg5 == 0) {
            var7 = class112.method784(arg0, arg6, arg2);
        } else if (arg5 == 1) {
            var7 = class155.method1062(arg0, arg6, arg2);
        } else if (arg5 == 2) {
            var7 = class275.method1801(arg0, arg6, arg2);
        } else if (arg5 == 3) {
            var7 = class108.method747(arg0, arg6, arg2);
        }
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var11 = 97 / ((arg4 + 19) / 37);
        boolean var12 = false;
        int var13 = (int) var7 >> 14 & 0x1F;
        boolean var14 = false;
        int var15 = ((int) var7 & 0x389E63) >> 20;
        class206 var16 = class10.method64(64, var10);
        if (var16.method1365(-30552)) {
            class158.method1087(arg2, arg6, arg0, 128, var16);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg5 == 0) {
            class203.method1340(arg0, arg6, arg2);
            if (var16.field3387 != 0) {
                arg3.method1239(arg6, var16.field3403, arg2, var15, var13, !var16.field3406, (byte) -41);
            }
        } else if (arg5 == 1) {
            class72.method437(arg0, arg6, arg2);
        } else if (arg5 == 2) {
            class136.method957(arg0, arg6, arg2);
            if (var16.field3387 != 0 && (arg6 + var16.field3377) < 104 && var16.field3377 + arg2 < 104 && (var16.field3404 + arg6) < 104 && (var16.field3404 + arg2) < 104) {
                arg3.method1238(var16.field3404, var16.field3377, (byte) -88, arg2, var16.field3403, !var16.field3406, var15, arg6);
            }
        } else if (arg5 == 3) {
            class110.method765(arg0, arg6, arg2);
            if (var16.field3387 == 1) {
                arg3.method1231(arg2, arg6, true);
            }
        }
        if (var16.field3373 != null) {
            class206 var21 = var16.method1375((byte) 93);
            return;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZII)V")
    public static final void method353(boolean arg0, int arg1, int arg2) {
        field1007++;
        class47 var3 = class133.method925(arg2, (byte) 83);
        int var4 = var3.field828;
        int var5 = var3.field827;
        int var6 = var3.field823;
        int var7 = class256.field4176[var6 - var5];
        if (arg0) {
            return;
        }
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class10.method67(var8 & arg1 << var5 | class125.field2191[var4] & ~var8, var4, -103);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public static void method354(int arg0) {
        field987 = null;
        field1006 = null;
        if (arg0 != 0) {
            method352(-86, 45, -107, (class189) null, -93, 37, 28);
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method355(int arg0) {
        if (arg0 >= -105) {
            method353(true, -85, 75);
        }
        int var2 = this.field988;
        field999++;
        if (this.field989 != null) {
            class206 var5 = this.field989.method1375((byte) 93);
            if (var5 == null) {
                this.field1000 = 0;
                this.field988 = -1;
                this.field998 = 0;
                this.field1004 = 0;
                this.field1003 = 0;
                this.field997 = null;
            } else {
                this.field1004 = var5.field3362 * 128;
                this.field1003 = var5.field3385;
                this.field997 = var5.field3413;
                this.field988 = var5.field3380;
                this.field1000 = var5.field3370;
                this.field998 = var5.field3398;
            }
        } else if (this.field1002 != null) {
            int var3 = class52.method326((byte) -83, this.field1002);
            if (var2 != var3) {
                this.field988 = var3;
                class208 var4 = this.field1002.field2421;
                if (var4.field3521 != null) {
                    var4 = var4.method1402((byte) -119);
                }
                if (var4 == null) {
                    this.field1000 = this.field1004 = 0;
                } else {
                    this.field1004 = var4.field3525 * 128;
                    this.field1000 = var4.field3526;
                }
            }
        } else if (this.field994 != null) {
            this.field988 = class207.method1379((byte) -95, this.field994);
            this.field1004 = this.field994.field4596 * 128;
            this.field1000 = this.field994.field4588;
        }
        if (this.field988 != var2 && this.field1001 != null) {
            class10.field149.method259(this.field1001);
            this.field1001 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method356(byte arg0) {
        if (arg0 < 9) {
            method354(62);
        }
        field1010++;
        class163.field2694.method58(0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
    public static final void method357(byte arg0, int arg1) {
        field986++;
        if (arg0 == 27) {
            class163.field2694.method63(0, arg1);
        }
    }
}
