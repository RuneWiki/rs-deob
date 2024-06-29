import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class338 {

    @OriginalMember(owner = "client!tda", name = "v", descriptor = "I")
    public int field4952 = 0;

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
    public int field4945 = 0;

    @OriginalMember(owner = "client!tda", name = "s", descriptor = "Z")
    private boolean field4949 = false;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "Lri;")
    public static class342 field4931 = new class342();

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "Lcb;")
    public static class631 field4947 = new class631(18, 3);

    @OriginalMember(owner = "client!tda", name = "t", descriptor = "[C")
    public static char[] field4950 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!tda", name = "w", descriptor = "[I")
    public static int[] field4953 = new int[14];

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public int field4932;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    private int field4935;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public int field4936;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!tda", name = "k", descriptor = "I")
    public int field4941;

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!tda", name = "m", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "I")
    public int field4946;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!tda", name = "x", descriptor = "I")
    public int field4954;

    @OriginalMember(owner = "client!tda", name = "y", descriptor = "I")
    public int field4955;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "J")
    public long field4933;

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "Lau;")
    public static class245 field4951;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public final void method2154(int arg0) {
        field4942++;
        this.field4955 = class582.field8230[this.field4935 << 3];
        long var2 = (long) this.field4932;
        long var4 = (long) this.field4943;
        long var6 = (long) this.field4941;
        this.field4954 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
        if (this.field4939 == 0) {
            this.field4939 = 1;
        }
        if (this.field4940 == 0) {
            this.field4933 = 2147483647L;
        } else if (this.field4940 == 1) {
            this.field4933 = (this.field4954 * 8 / this.field4939);
            this.field4933 *= this.field4933;
        } else if (this.field4940 == 2) {
            this.field4933 = (this.field4954 * 8 / this.field4939);
        }
        if (this.field4949) {
            this.field4954 *= -1;
        }
        int var8 = -70 % ((-arg0 - 13) / 42);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lofa;I)V")
    public final void method2155(class301 arg0, int arg1) {
        field4938++;
        if (arg1 < 122) {
            return;
        }
        while (true) {
            int var3 = arg0.method1987(-24);
            if (var3 == 0) {
                return;
            }
            this.method2157(var3, arg0, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
    public static final void method2156(int arg0) {
        int var1 = 0;
        if (arg0 != -31898) {
            return;
        }
        while (class115.field1790 > var1) {
            label162: {
                class625 var3 = class374.field5649[var1];
                boolean var4 = false;
                if (var3.field8751 == null) {
                    var3.field8748--;
                    if (var3.field8748 >= (var3.method3532(arg0 ^ 0xFFFF8319) ? -1500 : -10)) {
                        if (var3.field8758 == 1 && var3.field8757 == null) {
                            var3.field8757 = class667.method3738(class431.field6296, var3.field8756, 0);
                            if (var3.field8757 == null) {
                                break label162;
                            }
                            var3.field8748 += var3.field8757.method3739();
                        } else if (var3.method3532(123) && (var3.field8749 == null || var3.field8752 == null)) {
                            if (var3.field8749 == null) {
                                var3.field8749 = class61.method609(class518.field7495, var3.field8756);
                            }
                            if (var3.field8749 == null) {
                                break label162;
                            }
                            if (var3.field8752 == null) {
                                var3.field8752 = var3.field8749.method599(new int[] { 22050 });
                                if (var3.field8752 == null) {
                                    break label162;
                                }
                            }
                        }
                        if (var3.field8748 < 0) {
                            int var5 = 8192;
                            int var7;
                            if (var3.field8747 == 0) {
                                var7 = var3.field8762 * (var3.field8758 == 3 ? class654.field9289.field5426.method155(arg0 + 31901) : class654.field9289.field5439.method155(3)) >> 2;
                            } else {
                                int var6 = (var3.field8747 & 0x397234F) >> 24;
                                if (class145.field2251.field9470 == var6) {
                                    int var8 = (var3.field8747 & 0xFF) << 9;
                                    int var9 = class145.field2251.method878(arg0 ^ 0x6AF2) << 8;
                                    int var10 = (var3.field8747 & 0xFF6D78) >> 16;
                                    int var11 = (var10 << 9) + var9 + 256 - class145.field2251.field9477;
                                    int var12 = (var3.field8747 & 0xFF52) >> 8;
                                    int var13 = (var12 << 9) + var9 + 256 - class145.field2251.field9475;
                                    int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                    if (var8 < var14) {
                                        var3.field8748 = -99999;
                                        break label162;
                                    }
                                    if (var14 < 0) {
                                        var14 = 0;
                                    }
                                    var7 = class654.field9289.field5435.method155(3) * (var8 - var14) * var3.field8762 / var8 >> 2;
                                    if (var3.field8760 != null && var3.field8760 instanceof class559) {
                                        class559 var15 = (class559) var3.field8760;
                                        short var16 = var15.field7930;
                                        short var17 = var15.field7927;
                                    }
                                    if (var11 != 0 || var13 != 0) {
                                        int var18 = -class608.field8587 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                        if (var18 > 8192) {
                                            var18 = 16384 - var18;
                                        }
                                        int var19;
                                        if (var14 <= 0) {
                                            var19 = 8192;
                                        } else if (var14 >= 4096) {
                                            var19 = 16384;
                                        } else {
                                            var19 = (8192 - var14) / 4096 + 8192;
                                        }
                                        var5 = var18 * var19 / 8192 + (16384 - var19 >> 1);
                                    }
                                } else {
                                    var7 = 0;
                                }
                            }
                            if (var7 > 0) {
                                class538 var20 = null;
                                if (var3.field8758 == 1) {
                                    var20 = var3.field8757.method3737().method3159(class703.field9941);
                                } else if (var3.method3532(86)) {
                                    var20 = var3.field8752;
                                }
                                class57 var21 = var3.field8751 = class57.method556(var20, var3.field8759, var7, var5);
                                var21.method536(var3.field8761 - 1);
                                class324.field4793.method2226(var21);
                            }
                        }
                    } else {
                        var4 = true;
                    }
                } else if (!var3.field8751.method637((byte) 115)) {
                    var4 = true;
                }
                if (var4) {
                    class115.field1790--;
                    for (int var22 = var1; var22 < class115.field1790; var22++) {
                        class374.field5649[var22] = class374.field5649[var22 + 1];
                    }
                    var1--;
                }
            }
            var1++;
        }
        field4937++;
        if (class354.field5373 && !class126.method971((byte) 0)) {
            if (class654.field9289.field5420.method155(3) != 0 && class647.field9210 != -1) {
                if (class431.field6300 == null) {
                    class736.method4110((byte) -118, class647.field9210, class654.field9289.field5420.method155(arg0 + 31901), 0, class521.field7518, false);
                } else {
                    class177.method1382(arg0 ^ 0xFFFF834E, class647.field9210, class431.field6300, false, class654.field9289.field5420.method155(3), class521.field7518, 0);
                }
            }
            class354.field5373 = false;
            class431.field6300 = null;
        } else if (class654.field9289.field5420.method155(3) != 0 && class647.field9210 != -1 && !class126.method971((byte) 0)) {
            class721.field10118++;
            class540 var2 = class257.method1732(true, class86.field1269, class655.field9332);
            var2.field7707.method1970((byte) 29, class647.field9210);
            class756.method4211(var2, arg0 ^ 0xFFFF831D);
            class647.field9210 = -1;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILofa;B)V")
    private final void method2157(int arg0, class301 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field4935 = arg1.method1989((byte) -27);
        } else if (arg0 == 2) {
            arg1.method1987(-113);
        } else if (arg0 == 3) {
            this.field4932 = arg1.method1934(-2);
            this.field4943 = arg1.method1934(-2);
            this.field4941 = arg1.method1934(-2);
        } else if (arg0 == 4) {
            this.field4940 = arg1.method1987(-20);
            this.field4939 = arg1.method1934(-2);
        } else if (arg0 == 6) {
            this.field4936 = arg1.method1987(-71);
        } else if (arg0 == 8) {
            this.field4952 = 1;
        } else if (arg0 == 9) {
            this.field4945 = 1;
        } else if (arg0 == 10) {
            this.field4949 = true;
        }
        field4934++;
        if (arg2 > -12) {
            this.field4932 = 125;
        }
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)V")
    public static void method2158(int arg0) {
        int var1 = 97 % ((arg0 + 49) / 37);
        field4951 = null;
        field4947 = null;
        field4950 = null;
        field4953 = null;
        field4931 = null;
    }
}
