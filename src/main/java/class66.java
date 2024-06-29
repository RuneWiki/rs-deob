import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class66 extends class43 {

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "I")
    private int field1092 = 4096;

    @OriginalMember(owner = "client!fj", name = "gb", descriptor = "[I")
    private int[] field1098 = new int[3];

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    private int field1090 = 3216;

    @OriginalMember(owner = "client!fj", name = "ib", descriptor = "I")
    private int field1100 = 3216;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "Lmb;")
    private static class132 field1088 = class166.method1092("go back to the main RuneScape webpage", 122);

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "Lmb;")
    public static class132 field1086 = class166.method1092("(U1", 118);

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "Lmb;")
    private static class132 field1089 = class166.method1092("To play on this world move to a free area first)3", 123);

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "Lmb;")
    public static class132 field1091 = class166.method1092("<img=0>", 119);

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "Lmb;")
    public static class132 field1087 = field1089;

    @OriginalMember(owner = "client!fj", name = "cb", descriptor = "Lmb;")
    public static class132 field1094 = field1088;

    @OriginalMember(owner = "client!fj", name = "eb", descriptor = "Z")
    public static boolean field1096 = false;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "Lq;")
    public static class174 field1093 = new class174(30);

    @OriginalMember(owner = "client!fj", name = "kb", descriptor = "I")
    public static int field1102 = 0;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!fj", name = "db", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!fj", name = "fb", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!fj", name = "hb", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!fj", name = "jb", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            this.method234(-113);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field1100 = arg2.method739(-127);
                }
            } else {
                this.field1090 = arg2.method739(97);
            }
        } else {
            this.field1092 = arg2.method739(-128);
        }
        ++field1085;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field1097;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = class231.field4170 * this.field1092 >> 12;
            int[] var5 = this.method300(arg1 ^ 89, 0, arg0 + -1 & class185.field3423);
            int[] var6 = this.method300(114, 0, arg0);
            int[] var7 = this.method300(88, 0, arg0 + 1 & class185.field3423);
            for (int var8 = 0; class131.field2427 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class90.field1593 & var8 - 1] + -var6[var8 - -1 & class90.field1593]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class116.field2221[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field1098[0] * var15 >> 12;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field1098[1] * var17 >> 12;
                int var19 = this.field1098[2] * var14 >> 12;
                var3[var8] = var16 - -var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
    private final void method411(int arg0) {
        double var2 = Math.cos((double) ((float) this.field1100 / 4096.0F));
        if (arg0 <= -58) {
            this.field1098[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1090 / 4096.0F)));
            ++field1099;
            this.field1098[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field1090 / 4096.0F)));
            this.field1098[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1100 / 4096.0F)));
            int var4 = this.field1098[1] * this.field1098[1] >> 12;
            int var5 = this.field1098[0] * this.field1098[0] >> 12;
            int var6 = this.field1098[2] * this.field1098[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field1098[1] = (this.field1098[1] << 12) / var7;
                this.field1098[0] = (this.field1098[0] << 12) / var7;
                this.field1098[2] = (this.field1098[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V")
    public static void method412(byte arg0) {
        field1089 = null;
        field1087 = null;
        field1094 = null;
        field1093 = null;
        field1086 = null;
        field1091 = null;
        if (arg0 <= 74) {
            field1088 = null;
        }
        field1088 = null;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 <= 21) {
            this.method200(104, (byte) -125, (class112) null);
        }
        this.method411(-66);
        ++field1101;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method413(int arg0, int arg1, int arg2, int arg3) {
        if (!class145.method973(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class78.field1364[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class213.field3897) {
                        if (!class136.method928(var4, var6, var5)) {
                            return false;
                        }
                        if (!class136.method928(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class136.method928(var4, var7, var5)) {
                            return false;
                        }
                        if (!class136.method928(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class136.method928(var4, var8, var5)) {
                        return false;
                    }
                    if (!class136.method928(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class191.field3537) {
                        if (!class136.method928(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class136.method928(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class136.method928(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class136.method928(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class136.method928(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class136.method928(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class213.field3897) {
                        if (!class136.method928(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class136.method928(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class136.method928(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class136.method928(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class136.method928(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class136.method928(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class191.field3537) {
                        if (!class136.method928(var4, var6, var5)) {
                            return false;
                        }
                        if (!class136.method928(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class136.method928(var4, var7, var5)) {
                            return false;
                        }
                        if (!class136.method928(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class136.method928(var4, var8, var5)) {
                        return false;
                    }
                    if (!class136.method928(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class136.method928(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class136.method928(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class136.method928(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class136.method928(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class136.method928(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class66() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)Lhg;")
    public static final class84 method414(int arg0, int arg1) {
        ++field1095;
        class84 var2 = (class84) class89.field1564.method777(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class195.field3625.method1079(class135.method921(arg1, 12659), -37, class96.method596((byte) 28, arg1));
            class84 var4 = new class84();
            var4.field1425 = arg1;
            if (var3 != null) {
                var4.method518(1, new class112(var3));
            }
            var4.method522((byte) 110);
            if (!class1.field4 && var4.field1415) {
                var4.field1419 = null;
            }
            if (var4.field1463) {
                var4.field1427 = 0;
                var4.field1447 = false;
            }
            class89.field1564.method774((long) arg1, var4, arg0);
            return var4;
        }
    }
}
