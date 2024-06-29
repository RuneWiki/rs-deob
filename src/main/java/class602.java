import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class602 extends class502 {

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    private int field7999 = 0;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Z")
    public boolean field7998 = false;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lad;")
    public class394 field7991 = new class394();

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "Lad;")
    private class394 field8002 = new class394();

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "Z")
    private boolean field8010 = false;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lhv;")
    public class485 field7992;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Ljt;")
    public class93 field7990;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "J")
    private long field7987;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lih;")
    public class656 field7996;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Laea;")
    public class47 field7988;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Ldb;")
    public static class298 field7997 = new class298(53, 8);

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Ldb;")
    public static class298 field8001 = new class298(105, 8);

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public int field7995;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    private int field8003;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    private int field8004;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    private int field8005;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    private int field8006;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    private int field8007;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    private int field8008;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    private int field8009;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Lbi;")
    public static class449 field7989;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V", line = 6)
    public final void method3319(boolean arg0) {
        this.field7991.field5188 = this.field7990.field1428;
        this.field7991.field5202 = this.field7990.field1415;
        this.field7991.field5199 = this.field7990.field1423;
        field8000++;
        this.field7991.field5195 = this.field7990.field1418;
        this.field7991.field5201 = this.field7990.field1421;
        this.field7991.field5194 = this.field7990.field1414;
        this.field7991.field5190 = this.field7990.field1419;
        this.field7991.field5197 = this.field7990.field1408;
        this.field7991.field5193 = this.field7990.field1410;
        if (arg0) {
            this.method3320(null, -61L, (byte) 24);
        }
        if (this.field7991.field5195 == this.field7991.field5190 && this.field7991.field5201 == this.field7991.field5195 && this.field7991.field5197 == this.field7991.field5194 && this.field7991.field5202 == this.field7991.field5197 && this.field7991.field5193 == this.field7991.field5188 && this.field7991.field5199 == this.field7991.field5188) {
            this.field8010 = true;
        } else if (this.field8010) {
            this.field8002.field5201 = this.field7991.field5201;
            this.field8002.field5190 = this.field7991.field5190;
            this.field8002.field5195 = this.field7991.field5195;
            this.field8002.field5188 = this.field7991.field5188;
            this.field8002.field5202 = this.field7991.field5202;
            this.field8002.field5194 = this.field7991.field5194;
            this.field8002.field5193 = this.field7991.field5193;
            this.field8010 = false;
            this.field8002.field5199 = this.field7991.field5199;
            this.field8002.field5197 = this.field7991.field5197;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Loa;JB)V", line = 50)
    public final void method3320(class651 arg0, long arg1, byte arg2) {
        class183 var5 = (class183) this.field7988.method328(0);
        if (arg2 <= 37) {
            this.method3321(13L, 82, 109, false, null);
        }
        while (var5 != null) {
            var5.method1214(arg0, arg1);
            var5 = (class183) this.field7988.method331((byte) -122);
        }
        field7994++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JIIZLoa;)V", line = 70)
    public final void method3321(long arg0, int arg1, int arg2, boolean arg3, class651 arg4) {
        field7993++;
        if (this.field7998) {
            arg3 = false;
        } else if (class671.field9506 < this.field7996.field8927) {
            arg3 = false;
        } else if (class379.field5082 > class290.field4110[class671.field9506]) {
            arg3 = false;
        } else if (this.field8010) {
            arg3 = false;
        } else if (this.field7996.field8952 != -1) {
            int var7 = (int) (arg0 - this.field7987);
            if (this.field7996.field8915 || var7 <= this.field7996.field8952) {
                var7 %= this.field7996.field8952;
            } else {
                arg3 = false;
            }
            if (!this.field7996.field8929 && this.field7996.field8882 > var7) {
                arg3 = false;
            }
            if (this.field7996.field8929 && var7 >= this.field7996.field8882) {
                arg3 = false;
            }
        }
        if (arg3) {
            class233.field3267++;
            int var8 = (this.field7991.field5195 + this.field7991.field5190 + this.field7991.field5201) / 3;
            int var9 = (this.field7991.field5197 + this.field7991.field5194 + this.field7991.field5202) / 3;
            int var10 = (this.field7991.field5193 + this.field7991.field5199 + this.field7991.field5188) / 3;
            if (this.field7991.field5191 != var8 || this.field7991.field5192 != var9 || this.field7991.field5196 != var10) {
                this.field7991.field5196 = var10;
                this.field7991.field5191 = var8;
                this.field7991.field5192 = var9;
                int var11 = this.field7991.field5195 - this.field7991.field5190;
                int var12 = this.field7991.field5197 - this.field7991.field5194;
                int var13 = this.field7991.field5188 - this.field7991.field5193;
                int var14 = this.field7991.field5201 - this.field7991.field5190;
                int var15 = this.field7991.field5202 - this.field7991.field5194;
                int var16 = this.field7991.field5199 - this.field7991.field5193;
                this.field8008 = var11 * var15 - var12 * var14;
                this.field8003 = var13 * var14 - (var11 * var16);
                this.field8009 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field8009 <= 32767 && this.field8003 <= 32767 && this.field8008 <= 32767 && this.field8009 >= -32767 && this.field8003 >= -32767 && this.field8008 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8009 * this.field8009 + this.field8003 * this.field8003 + (this.field8008 * this.field8008)));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8008 = this.field8008 * 32767 / var17;
                        this.field8003 = this.field8003 * 32767 / var17;
                        this.field8009 = this.field8009 * 32767 / var17;
                        if (this.field7996.field8883 > 0 || this.field7996.field8950 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8008, (double) this.field8009) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8003, Math.sqrt((double) (this.field8009 * this.field8009 + this.field8008 * this.field8008))) * 2607.5945876176133D);
                            this.field8005 = this.field7996.field8883 - this.field7996.field8924;
                            this.field8006 = this.field7996.field8950 - this.field7996.field8895;
                            this.field8004 = var18 + this.field7996.field8924 - (this.field8005 >> 1);
                            this.field8007 = this.field7996.field8895 + var19 - (this.field8006 >> 1);
                        }
                        break;
                    }
                    this.field8008 >>= 0x1;
                    this.field8009 >>= 0x1;
                    this.field8003 >>= 0x1;
                }
            }
            this.field7999 += (int) ((Math.random() * (double) (this.field7996.field8884 - this.field7996.field8899) + (double) this.field7996.field8899) * (double) arg1);
            if (this.field7999 > 63) {
                int var20 = this.field7999 >> 6;
                this.field7999 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field7996.field8883 <= 0 && this.field7996.field8950 <= 0) {
                        var22 = this.field8008;
                        var23 = this.field8003;
                        var24 = this.field8009;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field8005) + this.field8004;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class126.field2116[var26];
                        int var28 = class126.field2105[var26];
                        int var29 = (int) ((double) this.field8006 * Math.random()) + this.field8007;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class126.field2116[var30];
                        int var32 = class126.field2105[var30];
                        byte var33 = 13;
                        var23 = (var32 << 1) * -1;
                        var24 = var28 * var31 >> var33;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var34 - var35;
                    int var37 = (int) ((float) this.field7991.field5201 * var36 + (float) this.field7991.field5195 * var35 + (float) this.field7991.field5190 * var34);
                    int var38 = (int) ((float) this.field7991.field5202 * var36 + (float) this.field7991.field5197 * var35 + (float) this.field7991.field5194 * var34);
                    int var39 = (int) ((float) this.field7991.field5199 * var36 + (float) this.field7991.field5193 * var34 + (float) this.field7991.field5188 * var35);
                    int var40 = (int) ((float) this.field8002.field5201 * var36 + (float) this.field8002.field5195 * var35 + (float) this.field8002.field5190 * var34);
                    int var41 = (int) ((float) this.field8002.field5202 * var36 + (float) this.field8002.field5197 * var35 + (float) this.field8002.field5194 * var34);
                    int var42 = (int) ((float) this.field8002.field5199 * var36 + (float) this.field8002.field5193 * var34 + (float) this.field8002.field5188 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + (double) var43 * Math.random());
                    int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = this.field7996.field8891 + ((int) ((double) (this.field7996.field8935 - this.field7996.field8891) * Math.random()));
                    int var50 = this.field7996.field8918 + (int) ((double) (this.field7996.field8898 - this.field7996.field8918) * Math.random());
                    int var51 = (int) ((double) (this.field7996.field8911 - this.field7996.field8893) * Math.random()) + this.field7996.field8893;
                    int var54;
                    if (this.field7996.field8949) {
                        double var52 = Math.random();
                        var54 = (int) (Math.random() * (double) this.field7996.field8881 + (double) this.field7996.field8941) << 24 | (int) ((double) this.field7996.field8904 * var52 + (double) this.field7996.field8913) | (int) ((double) this.field7996.field8890 * var52 + (double) this.field7996.field8886) << 8 | (int) ((double) this.field7996.field8908 * var52 + (double) this.field7996.field8923) << 16;
                    } else {
                        var54 = (int) ((double) this.field7996.field8941 + Math.random() * (double) this.field7996.field8881) << 24 | (int) ((double) this.field7996.field8904 * Math.random() + (double) this.field7996.field8913) | (int) ((double) this.field7996.field8886 + Math.random() * (double) this.field7996.field8890) << 8 | (int) (Math.random() * (double) this.field7996.field8908 + (double) this.field7996.field8923) << 16;
                    }
                    int var55 = this.field7996.field8909;
                    if (!arg4.method388() && !this.field7996.field8900) {
                        var55 = -1;
                    }
                    if (class331.field4537 == class311.field4284) {
                        new class183(this, var46, var47, var48, var24, var23, var22, var49, var50, var54, var51, var55, this.field7996.field8906, this.field7996.field8947);
                    } else {
                        class183 var57 = class154.field2423[class311.field4284];
                        class311.field4284 = class311.field4284 + 1 & 0x3FF;
                        var57.method1216(this, var46, var47, var48, var24, var23, var22, var49, var50, var54, var51, var55, this.field7996.field8906, this.field7996.field8947);
                    }
                }
            }
        }
        if (!this.field7991.method2260(-1879, this.field8002)) {
            class394 var58 = this.field8002;
            this.field8002 = this.field7991;
            this.field7991 = var58;
            this.field7991.field5195 = this.field7990.field1418;
            this.field7991.field5201 = this.field7990.field1421;
            this.field7991.field5194 = this.field7990.field1414;
            this.field7991.field5199 = this.field7990.field1423;
            this.field7991.field5202 = this.field7990.field1415;
            this.field7991.field5197 = this.field7990.field1408;
            this.field7991.field5190 = this.field7990.field1419;
            this.field7991.field5188 = this.field7990.field1428;
            this.field7991.field5193 = this.field7990.field1410;
        }
        this.field7995 = arg2;
        for (class183 var59 = (class183) this.field7988.method328(0); var59 != null; var59 = (class183) this.field7988.method331((byte) -60)) {
            var59.method1215(arg0, arg1);
            this.field7995++;
        }
        class530.field7064 += this.field7995;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 324)
    public static void method3322(int arg0) {
        field8001 = null;
        field7997 = null;
        field7989 = null;
        if (arg0 != -70617448) {
            method3322(-84);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Loa;Ljt;Lhv;J)V", line = 375)
    public class602(class651 arg0, class93 arg1, class485 arg2, long arg3) {
        this.field7992 = arg2;
        this.field7990 = arg1;
        this.field7987 = arg3;
        this.field7996 = this.field7990.method733((byte) -19);
        if (!arg0.method388() && this.field7996.field8943 != -1) {
            this.field7996 = class253.method1537(-31164, this.field7996.field8943);
        }
        this.field7988 = new class47();
        this.field7999 = (int) ((double) this.field7999 + Math.random() * 64.0D);
        this.method3319(false);
        this.field8002.field5201 = this.field7991.field5201;
        this.field8002.field5199 = this.field7991.field5199;
        this.field8002.field5197 = this.field7991.field5197;
        this.field8002.field5190 = this.field7991.field5190;
        this.field8002.field5195 = this.field7991.field5195;
        this.field8002.field5188 = this.field7991.field5188;
        this.field8002.field5202 = this.field7991.field5202;
        this.field8002.field5193 = this.field7991.field5193;
        this.field8002.field5194 = this.field7991.field5194;
    }
}
