import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class303 extends class236 {

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "Z")
    public boolean field4384 = false;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    private int field4395 = 0;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Z")
    private boolean field4372 = false;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "Lin;")
    public class56 field4386;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "J")
    private long field4389;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "Lko;")
    public class332 field4401;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "Lou;")
    public class412 field4391;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "Li;")
    public class30 field4402;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Lgn;")
    public static class475 field4377 = new class475(81, 8);

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    private int field4374;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    private int field4376;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    private int field4378;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    private int field4380;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    private int field4381;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    private int field4382;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    private int field4385;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    private int field4387;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    private int field4396;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    private int field4397;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    private int field4398;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    private int field4399;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    private int field4403;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    private int field4406;

    static {
        new class194("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(JI)V", line = 4)
    public final void method1821(long arg0, int arg1) {
        for (class241 var4 = (class241) this.field4402.method242(false); var4 != null; var4 = (class241) this.field4402.method244((byte) -73)) {
            var4.method1484(arg0);
        }
        if (arg1 != 5202) {
            this.field4378 = -59;
        }
        field4390++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[BIIILjava/lang/String;)I", line = 38)
    public static final int method1822(int arg0, byte[] arg1, int arg2, int arg3, int arg4, String arg5) {
        field4400++;
        int var6 = arg3 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg4 + var7] = -97;
            } else {
                arg1[arg4 + var7] = 63;
            }
        }
        if (arg0 != 8220) {
            field4377 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Leq;Lin;Lko;J)V", line = 504)
    public class303(class134 arg0, class56 arg1, class332 arg2, long arg3) {
        this.field4386 = arg1;
        this.field4389 = arg3;
        this.field4401 = arg2;
        this.field4391 = this.field4386.method418((byte) 123);
        if (!arg0.method751() && this.field4391.field6065 != -1) {
            this.field4391 = class337.method2041(this.field4391.field6065, -27822);
        }
        this.field4402 = new class30();
        this.field4395 = (int) ((double) this.field4395 + Math.random() * 64.0D);
        this.method1823(-16052);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 189)
    public final void method1823(int arg0) {
        this.field4398 = this.field4386.field860;
        this.field4374 = this.field4386.field862;
        this.field4387 = this.field4386.field870;
        this.field4383 = this.field4386.field864;
        this.field4388 = this.field4386.field861;
        this.field4376 = this.field4386.field868;
        if (arg0 != -16052) {
            method1826(-106, -101, null, (byte) -17, null);
        }
        field4404++;
        this.field4406 = this.field4386.field874;
        this.field4397 = this.field4386.field866;
        this.field4396 = this.field4386.field872;
        if (this.field4388 == this.field4387 && this.field4387 == this.field4383 && this.field4398 == this.field4374 && this.field4376 == this.field4374 && this.field4397 == this.field4396 && this.field4406 == this.field4397) {
            this.field4372 = true;
            return;
        }
        this.field4372 = false;
        int var2 = (this.field4388 + this.field4383 + this.field4387) / 3;
        int var3 = (this.field4398 + this.field4374 + this.field4376) / 3;
        int var4 = (this.field4397 + this.field4396 + this.field4406) / 3;
        if (this.field4393 == var2 && this.field4375 == var3 && this.field4373 == var4) {
            return;
        }
        this.field4393 = var2;
        this.field4373 = var4;
        this.field4375 = var3;
        int var5 = this.field4387 - this.field4388;
        int var6 = this.field4374 - this.field4398;
        int var7 = this.field4397 - this.field4396;
        int var8 = this.field4383 - this.field4388;
        int var9 = this.field4376 - this.field4398;
        int var10 = this.field4406 - this.field4396;
        this.field4382 = var7 * var8 - var5 * var10;
        this.field4378 = var6 * var10 - (var7 * var9);
        this.field4380 = var5 * var9 - (var6 * var8);
        while (this.field4378 > 32767 || this.field4382 > 32767 || this.field4380 > 32767 || this.field4378 < -32767 || this.field4382 < -32767 || this.field4380 < -32767) {
            this.field4380 >>= 0x1;
            this.field4382 >>= 0x1;
            this.field4378 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field4380 * this.field4380 + this.field4382 * this.field4382 + this.field4378 * this.field4378));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field4378 = this.field4378 * 32767 / var11;
        this.field4380 = this.field4380 * 32767 / var11;
        this.field4382 = this.field4382 * 32767 / var11;
        if (this.field4391.field6089 <= 0 && this.field4391.field6073 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field4380, (double) this.field4378) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field4382, Math.sqrt((double) (this.field4380 * this.field4380 + this.field4378 * this.field4378))) * 2607.5945876176133D);
        this.field4399 = this.field4391.field6089 - this.field4391.field6058;
        this.field4403 = this.field4391.field6073 - this.field4391.field6061;
        this.field4385 = this.field4391.field6058 + var12 - (this.field4399 >> 1);
        this.field4381 = this.field4391.field6061 + var13 - (this.field4403 >> 1);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 273)
    public static void method1824(int arg0) {
        if (arg0 > 109) {
            field4377 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Leq;IZIJ)V", line = 283)
    public final void method1825(class134 arg0, int arg1, boolean arg2, int arg3, long arg4) {
        int var7 = 48 / ((arg1 + 30) / 63);
        field4392++;
        if (this.field4384) {
            arg2 = false;
        } else if (this.field4391.field6042 > class373.field5596) {
            arg2 = false;
        } else if (class26.field437 > class505.field7712[class373.field5596]) {
            arg2 = false;
        } else if (this.field4372) {
            arg2 = false;
        } else if (this.field4391.field6082 != -1) {
            int var8 = (int) (arg4 - this.field4389);
            if (this.field4391.field6096 || this.field4391.field6082 >= var8) {
                var8 %= this.field4391.field6082;
            } else {
                arg2 = false;
            }
            if (!this.field4391.field6054 && this.field4391.field6097 > var8) {
                arg2 = false;
            }
            if (this.field4391.field6054 && var8 >= this.field4391.field6097) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field4395 += (int) (((double) this.field4391.field6102 + (double) (this.field4391.field6092 - this.field4391.field6102) * Math.random()) * (double) arg3);
            if (this.field4395 > 63) {
                int var9 = this.field4395 >> 6;
                this.field4395 &= 0x3F;
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11;
                    int var12;
                    int var13;
                    if (this.field4391.field6089 <= 0 && this.field4391.field6073 <= 0) {
                        var11 = this.field4380;
                        var12 = this.field4382;
                        var13 = this.field4378;
                    } else {
                        int var14 = this.field4385 + (int) ((double) this.field4399 * Math.random());
                        int var15 = var14 & 0x3FFF;
                        int var16 = class323.field4731[var15];
                        int var17 = class323.field4733[var15];
                        int var18 = this.field4381 + ((int) ((double) this.field4403 * Math.random()));
                        int var19 = var18 & 0x1FFF;
                        int var20 = class323.field4731[var19];
                        int var21 = class323.field4733[var19];
                        byte var22 = 15;
                        var13 = var17 * var20 >> var22;
                        var12 = (var21 << 0) * -1;
                        var11 = var16 * var20 >> var22;
                    }
                    int var23 = (int) (Math.random() * 65535.0D);
                    int var24 = (int) (Math.random() * 65535.0D);
                    if (var23 + var24 > 65535) {
                        var24 = 65535 - var24;
                        var23 = 65535 - var23;
                    }
                    int var25 = 65535 - var23 - var24;
                    int var26 = this.field4387 * var24 + this.field4388 * var23 + this.field4383 * var25 >> 16;
                    int var27 = this.field4376 * var25 + (this.field4398 * var23 + (this.field4374 * var24)) >> 16;
                    int var28 = this.field4397 * var24 + this.field4396 * var23 + (this.field4406 * var25) >> 16;
                    int var29 = this.field4391.field6076 + (int) ((double) (this.field4391.field6044 - this.field4391.field6076) * Math.random());
                    int var30 = (int) ((double) (this.field4391.field6063 - this.field4391.field6038) * Math.random()) + this.field4391.field6038;
                    int var31 = (int) ((double) (this.field4391.field6099 - this.field4391.field6051) * Math.random()) + this.field4391.field6051;
                    int var32;
                    if (this.field4391.field6069) {
                        double var33 = Math.random();
                        var32 = (int) ((double) this.field4391.field6085 * var33 + (double) this.field4391.field6047) << 8 | (int) ((double) this.field4391.field6036 * var33 + (double) this.field4391.field6060) << 16 | (int) ((double) this.field4391.field6053 * var33 + (double) this.field4391.field6041) | (int) (Math.random() * (double) this.field4391.field6087 + (double) this.field4391.field6062) << 24;
                    } else {
                        var32 = (int) ((double) this.field4391.field6041 + (double) this.field4391.field6053 * Math.random()) | (int) (Math.random() * (double) this.field4391.field6036 + (double) this.field4391.field6060) << 16 | (int) ((double) this.field4391.field6047 + (double) this.field4391.field6085 * Math.random()) << 8 | (int) ((double) this.field4391.field6087 * Math.random() + (double) this.field4391.field6062) << 24;
                    }
                    int var35 = this.field4391.field6091;
                    if (!arg0.method751() && !this.field4391.field6094) {
                        var35 = -1;
                    }
                    if (class354.field5115 == class110.field1444) {
                        new class241(this, var26, var27, var28, var13, var12, var11, var29, var30, var32, var31, var35, this.field4391.field6079, this.field4391.field6057);
                    } else {
                        class241 var37 = class173.field2373[class354.field5115];
                        class354.field5115 = class354.field5115 + 1 & 0x3FF;
                        var37.method1486(this, var26, var27, var28, var13, var12, var11, var29, var30, var32, var31, var35, this.field4391.field6079, this.field4391.field6057);
                    }
                }
            }
        }
        this.field4405 = 0;
        for (class241 var38 = (class241) this.field4402.method242(false); var38 != null; var38 = (class241) this.field4402.method244((byte) -73)) {
            var38.method1485(arg4, arg3);
            this.field4405++;
        }
        class409.field6001 += this.field4405;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILum;BLeq;)V", line = 460)
    public static final void method1826(int arg0, int arg1, class347 arg2, byte arg3, class134 arg4) {
        class56.field883.method2089(328);
        field4379++;
        if (class428.field6308 || arg3 != 109) {
            return;
        }
        for (class410 var5 = (class410) arg2.method2096(-21400); var5 != null; var5 = (class410) arg2.method2084((byte) 19)) {
            class170 var6 = class249.field3573.method282(var5.field6017, 19);
            if (class440.method2576(arg3 ^ 0x92, var6)) {
                boolean var7 = class58.method425(arg1, var6, var5, (byte) 12, arg0, arg4);
                if (var7) {
                    class297.method1803(1, var5, arg4, var6);
                }
            }
        }
    }
}
