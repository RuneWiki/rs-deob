import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class92 extends class601 {

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Z")
    public boolean field1073 = false;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    private int field1067 = 0;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Z")
    private boolean field1086 = false;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Lfca;")
    public class75 field1082;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "J")
    private long field1079;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lkw;")
    public class211 field1059;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Lgk;")
    public class409 field1065;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Lfh;")
    public class567 field1076;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "[Lwt;")
    public static class262[] field1069;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
    public static int method583(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static void method584(byte arg0) {
        if (arg0 != 47) {
            method584((byte) -124);
        }
        field1069 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLoa;JII)V")
    public final void method585(boolean arg0, class605 arg1, long arg2, int arg3, int arg4) {
        field1066++;
        if (this.field1073) {
            arg0 = false;
        } else if (class178.field2192 < this.field1065.field6203) {
            arg0 = false;
        } else if (class121.field1512[class178.field2192] < class239.field3401) {
            arg0 = false;
        } else if (this.field1086) {
            arg0 = false;
        } else if (this.field1065.field6187 != -1) {
            int var7 = (int) (arg2 - this.field1079);
            if (this.field1065.field6210 || this.field1065.field6187 >= var7) {
                var7 %= this.field1065.field6187;
            } else {
                arg0 = false;
            }
            if (!this.field1065.field6216 && var7 < this.field1065.field6218) {
                arg0 = false;
            }
            if (this.field1065.field6216 && this.field1065.field6218 <= var7) {
                arg0 = false;
            }
        }
        if (arg0) {
            this.field1067 += (int) ((double) arg3 * ((double) (this.field1065.field6181 - this.field1065.field6212) * Math.random() + (double) this.field1065.field6212));
            if (this.field1067 > 63) {
                int var8 = this.field1067 >> 6;
                this.field1067 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field1065.field6163 <= 0 && this.field1065.field6209 <= 0) {
                        var10 = this.field1056;
                        var11 = this.field1064;
                        var12 = this.field1061;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field1084) + this.field1077;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class605.field8859[var14];
                        int var16 = class605.field8858[var14];
                        int var17 = this.field1070 + ((int) (Math.random() * (double) this.field1063));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class605.field8859[var18];
                        int var20 = class605.field8858[var18];
                        byte var21 = 13;
                        var12 = (var20 << 1) * -1;
                        var11 = var16 * var19 >> var21;
                        var10 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var23 - var22;
                    int var25 = (int) ((long) this.field1074 * (long) var24 + (long) this.field1081 * (long) var23 + (long) this.field1062 * (long) var22 >> 16);
                    int var26 = (int) ((long) this.field1075 * (long) var23 + (long) this.field1058 * (long) var24 + (long) this.field1054 * (long) var22 >> 16);
                    int var27 = (int) ((long) this.field1078 * (long) var23 + ((long) this.field1080 * (long) var22 + ((long) this.field1071 * (long) var24)) >> 16);
                    int var28 = this.field1065.field6198 + ((int) ((double) (this.field1065.field6217 - this.field1065.field6198) * Math.random()));
                    int var29 = this.field1065.field6168 + ((int) (Math.random() * (double) (this.field1065.field6221 - this.field1065.field6168)));
                    int var30 = (int) ((double) (this.field1065.field6153 - this.field1065.field6199) * Math.random()) + this.field1065.field6199;
                    int var31;
                    if (this.field1065.field6197) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field1065.field6171 * Math.random() + (double) this.field1065.field6165) << 24 | (int) ((double) this.field1065.field6208 * var32 + (double) this.field1065.field6182) | (int) ((double) this.field1065.field6183 * var32 + (double) this.field1065.field6213) << 16 | (int) ((double) this.field1065.field6179 * var32 + (double) this.field1065.field6207) << 8;
                    } else {
                        var31 = (int) (Math.random() * (double) this.field1065.field6171 + (double) this.field1065.field6165) << 24 | (int) ((double) this.field1065.field6182 + (double) this.field1065.field6208 * Math.random()) | (int) (Math.random() * (double) this.field1065.field6179 + (double) this.field1065.field6207) << 8 | (int) (Math.random() * (double) this.field1065.field6183 + (double) this.field1065.field6213) << 16;
                    }
                    int var34 = this.field1065.field6192;
                    if (!arg1.method356() && !this.field1065.field6185) {
                        var34 = -1;
                    }
                    if (class621.field8993 == class287.field3977) {
                        new class516(this, var25, var26, var27, var11, var12, var10, var28, var29, var31, var30, var34, this.field1065.field6184, this.field1065.field6158);
                    } else {
                        class516 var35 = class472.field6987[class287.field3977];
                        class287.field3977 = class287.field3977 + 1 & 0x3FF;
                        var35.method3062(this, var25, var26, var27, var11, var12, var10, var28, var29, var31, var30, var34, this.field1065.field6184, this.field1065.field6158);
                    }
                }
            }
        }
        this.field1068 = 0;
        for (class516 var37 = (class516) this.field1076.method3297((byte) 102); var37 != null; var37 = (class516) this.field1076.method3296((byte) -106)) {
            var37.method3064(arg2, arg3);
            this.field1068++;
        }
        int var38 = -19 / ((-arg4 - 35) / 37);
        class73.field779 += this.field1068;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
    public final void method586(byte arg0) {
        this.field1062 = this.field1082.field813;
        this.field1071 = this.field1082.field795;
        this.field1058 = this.field1082.field794;
        this.field1080 = this.field1082.field801;
        this.field1074 = this.field1082.field811;
        this.field1075 = this.field1082.field812;
        this.field1078 = this.field1082.field802;
        this.field1054 = this.field1082.field805;
        int var2 = -54 / ((arg0 - 30) / 43);
        field1055++;
        this.field1081 = this.field1082.field808;
        if (this.field1081 == this.field1062 && this.field1081 == this.field1074 && this.field1075 == this.field1054 && this.field1075 == this.field1058 && this.field1080 == this.field1078 && this.field1078 == this.field1071) {
            this.field1086 = true;
            return;
        }
        this.field1086 = false;
        int var3 = (this.field1081 + this.field1062 + this.field1074) / 3;
        int var4 = (this.field1075 + this.field1058 + this.field1054) / 3;
        int var5 = (this.field1080 + this.field1071 + this.field1078) / 3;
        if (this.field1072 == var3 && this.field1057 == var4 && this.field1085 == var5) {
            return;
        }
        this.field1057 = var4;
        this.field1085 = var5;
        this.field1072 = var3;
        int var6 = this.field1081 - this.field1062;
        int var7 = this.field1075 - this.field1054;
        int var8 = this.field1078 - this.field1080;
        int var9 = this.field1074 - this.field1062;
        int var10 = this.field1058 - this.field1054;
        int var11 = this.field1071 - this.field1080;
        this.field1064 = var7 * var11 - (var8 * var10);
        this.field1056 = var6 * var10 - var7 * var9;
        for (this.field1061 = var8 * var9 - (var6 * var11); this.field1064 > 32767 || this.field1061 > 32767 || this.field1056 > 32767 || this.field1064 < -32767 || this.field1061 < -32767 || this.field1056 < -32767; this.field1061 >>= 0x1) {
            this.field1064 >>= 0x1;
            this.field1056 >>= 0x1;
        }
        int var12 = (int) Math.sqrt((double) (this.field1064 * this.field1064 + this.field1061 * this.field1061 + (this.field1056 * this.field1056)));
        if (var12 <= 0) {
            var12 = 1;
        }
        this.field1064 = this.field1064 * 32767 / var12;
        this.field1056 = this.field1056 * 32767 / var12;
        this.field1061 = this.field1061 * 32767 / var12;
        if (this.field1065.field6163 <= 0 && this.field1065.field6209 <= 0) {
            return;
        }
        int var13 = (int) (Math.atan2((double) this.field1056, (double) this.field1064) * 2607.5945876176133D);
        int var14 = (int) (Math.atan2((double) this.field1061, Math.sqrt((double) (this.field1064 * this.field1064 + this.field1056 * this.field1056))) * 2607.5945876176133D);
        this.field1084 = this.field1065.field6163 - this.field1065.field6167;
        this.field1063 = this.field1065.field6209 - this.field1065.field6201;
        this.field1077 = this.field1065.field6167 + var13 - (this.field1084 >> 1);
        this.field1070 = var14 + this.field1065.field6201 - (this.field1063 >> 1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLoa;J)V")
    public final void method587(byte arg0, class605 arg1, long arg2) {
        if (arg0 == 65) {
            field1060++;
            for (class516 var5 = (class516) this.field1076.method3297((byte) 102); var5 != null; var5 = (class516) this.field1076.method3296((byte) -117)) {
                var5.method3063(arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Loa;Lfca;Lkw;J)V")
    public class92(class605 arg0, class75 arg1, class211 arg2, long arg3) {
        this.field1082 = arg1;
        this.field1079 = arg3;
        this.field1059 = arg2;
        this.field1065 = this.field1082.method492(-120);
        if (!arg0.method356() && this.field1065.field6180 != -1) {
            this.field1065 = class595.method3473(this.field1065.field6180, 0);
        }
        this.field1076 = new class567();
        this.field1067 = (int) ((double) this.field1067 + Math.random() * 64.0D);
        this.method586((byte) -121);
    }
}
