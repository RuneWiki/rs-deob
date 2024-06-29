import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class372 {

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[B")
    private byte[] field6037;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field6022;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field6026;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field6035;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lqr;")
    private class69 field6040;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field6043 = new String[] { method3075(method3074("2$OI\u0003")), method3075(method3074("+'\u0015`")), method3075(method3074("2$OH\u0003")), method3075(method3074(";hO+V")), method3075(method3074("2$OC\u0003")), method3075(method3074(".3\ri")), method3075(method3074("2$OO\u0003")), method3075(method3074("2$OA\u0003")), method3075(method3074("2$OF\u0003")), method3075(method3074("2$OB\u0003")), method3075(method3074("2$OG\u0003")), method3075(method3074("2$O@\u0003")), method3075(method3074("2$OT\u0003")), method3075(method3074("2$OL\u0003")), method3075(method3074("2$OJ\u0003")), method3075(method3074("2$ON\u0003")), method3075(method3074("\u0006'\biN$f\u0015j\u000b,)\u0000a\u000b*'\u0006qC%)\u0013d\u000b,/\u0003wJ2?")), method3075(method3074("*'\u0006qC%)\u0013d")), method3075(method3074("2$O9B./\u0015;\u0003")), method3075(method3074("2$OU\u0003")), method3075(method3074("2$OK\u0003")), method3075(method3074("2$OD\u0003")) };

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Lue;")
    private class242 field6018;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "Len;")
    private class337 field6029;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Llja;")
    public static class747 field6038;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lrl;")
    private class755 field6016;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Ljava/lang/String;")
    private String field6042;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Z")
    private boolean field6017;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Z")
    private boolean field6019;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
    private boolean field6023;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Z")
    private boolean field6024;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public final void method3058(String arg0, int arg1) {
        try {
            this.field6042 = arg0;
            field6031++;
            int var3 = 61 / ((arg1 + 22) / 53);
            if (this.field6042 == null) {
                this.field6029 = null;
            } else {
                if (this.field6029 != null && !this.field6042.equals(this.field6029.method2842(0))) {
                    this.field6029 = null;
                }
                if (this.field6029 == null) {
                    for (class423 var4 = (class423) this.field6040.method735(0); var4 != null; var4 = (class423) this.field6040.method734((byte) -50)) {
                        if (var4 instanceof class337) {
                            class337 var5 = (class337) var4;
                            if (this.field6042.equals(var5.method2842(0))) {
                                this.field6029 = var5;
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6043[4] + (arg0 == null ? field6043[5] : field6043[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 55)
    private final void method3059(int arg0) {
        try {
            class423 var2 = (class423) this.field6040.method735(0);
            int var3 = 103 % ((arg0 - 6) / 62);
            while (var2 != null) {
                if (this.field6018 != var2) {
                    while (var2.field6673.packetOut() == 1) {
                        var2.method3360((byte) -99, this.field6035);
                    }
                }
                var2 = (class423) this.field6040.method734((byte) -50);
            }
            field6032++;
            if (this.field6018 != null) {
                for (int var4 = 0; var4 < 10; var4++) {
                    if (!this.method3067(-1)) {
                        return;
                    }
                    if (this.field6018.field6673.packetOut() != 1) {
                        this.method3066(0);
                        return;
                    }
                    this.field6018.method3360((byte) -83, this.field6035);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6043[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Z", line = 97)
    public final boolean method3060(boolean arg0) {
        try {
            field6027++;
            if (this.field6017 || this.field6019) {
                if (!arg0) {
                    this.method3073(-88);
                }
                return this.field6016 == null || this.field6016.method5465(-17402) <= 0;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6043[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILha;Lnh;I)V", line = 123)
    public static final void method3061(int arg0, class63 arg1, class781 arg2, int arg3) {
        try {
            field6034++;
            if (class195.field3106 != null && arg3 <= arg2.field11399) {
                for (int var4 = 0; var4 < class195.field3106.length; var4++) {
                    if (class195.field3106[var4] != -1000000 && (class195.field3106[var4] >= arg2.field11409[0] || class195.field3106[var4] >= arg2.field11409[1] || arg2.field11409[2] <= class195.field3106[var4] || class195.field3106[var4] >= arg2.field11409[3]) && (class559.field8137[var4] >= arg2.field11403[0] || class559.field8137[var4] >= arg2.field11403[1] || class559.field8137[var4] >= arg2.field11403[2] || arg2.field11403[3] <= class559.field8137[var4]) && (arg2.field11403[0] >= class320.field5214[var4] || arg2.field11403[1] >= class320.field5214[var4] || class320.field5214[var4] <= arg2.field11403[2] || arg2.field11403[3] >= class320.field5214[var4]) && (arg2.field11400[0] <= class476.field7254[var4] || arg2.field11400[1] <= class476.field7254[var4] || arg2.field11400[2] <= class476.field7254[var4] || class476.field7254[var4] >= arg2.field11400[3]) && (class247.field3817[var4] <= arg2.field11400[0] || class247.field3817[var4] <= arg2.field11400[1] || arg2.field11400[2] >= class247.field3817[var4] || class247.field3817[var4] <= arg2.field11400[3])) {
                        return;
                    }
                }
            }
            if (arg2.field11405 == 1) {
                int var5 = class297.field4835 + arg2.field11401 - class54.field689;
                if (var5 >= 0 && (class297.field4835 + class297.field4835) >= var5) {
                    int var6 = class297.field4835 + arg2.field11394 - class316.field5137;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (class297.field4835 + class297.field4835 < var6) {
                        return;
                    }
                    int var7 = class297.field4835 + arg2.field11404 - class316.field5137;
                    if (class297.field4835 + class297.field4835 < var7) {
                        var7 = class297.field4835 + class297.field4835;
                    } else if (var7 < 0) {
                        return;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class441.field6890[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        float var9 = (float) (class764.field11211 - arg2.field11403[0]);
                        if (var9 < 0.0F) {
                            var9 *= -1.0F;
                        }
                        if (!((float) class720.field10543 > var9) && class297.method2558(0, arg2, false) && class297.method2558(1, arg2, false) && class297.method2558(2, arg2, false) && class297.method2558(3, arg2, false)) {
                            class568.field8254[class678.field9643++] = arg2;
                        }
                    }
                }
            } else {
                if (arg0 != -10151) {
                    method3064(1);
                }
                if (arg2.field11405 == 2) {
                    int var10 = class297.field4835 + arg2.field11394 - class316.field5137;
                    if (var10 >= 0 && class297.field4835 + class297.field4835 >= var10) {
                        int var11 = arg2.field11401 + class297.field4835 - class54.field689;
                        if (var11 < 0) {
                            var11 = 0;
                        } else if (var11 > class297.field4835 + class297.field4835) {
                            return;
                        }
                        int var12 = arg2.field11396 + class297.field4835 - class54.field689;
                        if (var12 > (class297.field4835 + class297.field4835)) {
                            var12 = class297.field4835 + class297.field4835;
                        } else if (var12 < 0) {
                            return;
                        }
                        boolean var13 = false;
                        while (var12 >= var11) {
                            if (class441.field6890[var11++][var10]) {
                                var13 = true;
                                break;
                            }
                        }
                        if (var13) {
                            float var14 = (float) (class97.field1421 - arg2.field11400[0]);
                            if (var14 < 0.0F) {
                                var14 *= -1.0F;
                            }
                            if (!((float) class720.field10543 > var14) && class297.method2558(0, arg2, false) && class297.method2558(1, arg2, false) && class297.method2558(2, arg2, false) && class297.method2558(3, arg2, false)) {
                                class568.field8254[class678.field9643++] = arg2;
                            }
                        }
                    }
                } else if (arg2.field11405 == 16 || arg2.field11405 == 8) {
                    int var15 = class297.field4835 + arg2.field11401 - class54.field689;
                    if (var15 >= 0 && var15 <= (class297.field4835 + class297.field4835)) {
                        int var16 = arg2.field11394 + class297.field4835 - class316.field5137;
                        if (var16 >= 0 && class297.field4835 + class297.field4835 >= var16 && class441.field6890[var15][var16]) {
                            float var17 = (float) (class764.field11211 - arg2.field11403[0]);
                            if (var17 < 0.0F) {
                                var17 *= -1.0F;
                            }
                            float var18 = (float) (class97.field1421 - arg2.field11400[0]);
                            if (var18 < 0.0F) {
                                var18 *= -1.0F;
                            }
                            if (!((float) class720.field10543 > var17) || !((float) class720.field10543 > var18) && class297.method2558(0, arg2, false) && class297.method2558(1, arg2, false) && class297.method2558(2, arg2, false) && class297.method2558(3, arg2, false)) {
                                class568.field8254[class678.field9643++] = arg2;
                            }
                        }
                    }
                } else if (arg2.field11405 == 4) {
                    float var19 = (float) (arg2.field11409[0] - class655.field9375);
                    if (!((float) class50.field603 >= var19)) {
                        int var20 = arg2.field11394 - (class316.field5137 - class297.field4835);
                        if (var20 < 0) {
                            var20 = 0;
                        } else if (var20 > (class297.field4835 + class297.field4835)) {
                            return;
                        }
                        int var21 = arg2.field11404 + class297.field4835 - class316.field5137;
                        if (var21 > class297.field4835 + class297.field4835) {
                            var21 = class297.field4835 + class297.field4835;
                        } else if (var21 < 0) {
                            return;
                        }
                        int var22 = arg2.field11401 + class297.field4835 - class54.field689;
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 > (class297.field4835 + class297.field4835)) {
                            return;
                        }
                        int var23 = arg2.field11396 + class297.field4835 - class54.field689;
                        if (var23 > class297.field4835 + class297.field4835) {
                            var23 = class297.field4835 + class297.field4835;
                        } else if (var23 < 0) {
                            return;
                        }
                        boolean var24 = false;
                        label344: for (int var25 = var22; var25 <= var23; var25++) {
                            for (int var26 = var20; var26 <= var21; var26++) {
                                if (class441.field6890[var25][var26]) {
                                    var24 = true;
                                    break label344;
                                }
                            }
                        }
                        if (var24 && class297.method2558(0, arg2, false) && class297.method2558(1, arg2, false) && class297.method2558(2, arg2, false) && class297.method2558(3, arg2, false)) {
                            class568.field8254[class678.field9643++] = arg2;
                        }
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field6043[11] + arg0 + ',' + (arg1 == null ? field6043[5] : field6043[3]) + ',' + (arg2 == null ? field6043[5] : field6043[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)Len;", line = 459)
    public final class337 method3062(byte arg0) {
        try {
            field6021++;
            if (arg0 > -33) {
                this.method3068(46);
            }
            return this.field6029;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6043[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZ)V", line = 470)
    public final void method3063(boolean arg0, boolean arg1) {
        try {
            if (!arg1) {
                this.field6017 = false;
            }
            field6014++;
            if (this.field6016 != null) {
                class739 var3 = this.field6016.method5463(-106);
                if (var3 != null) {
                    var3.method5375(arg0, 6);
                }
            }
            this.field6023 = !this.field6023;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6043[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V", line = 493)
    public static void method3064(int arg0) {
        try {
            field6038 = null;
            if (arg0 != -27877) {
                method3064(115);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6043[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 508)
    private final void method3065(byte arg0) {
        try {
            field6015++;
            if (arg0 != -12) {
                this.method3062((byte) -113);
            }
            for (class423 var2 = (class423) this.field6040.method735(0); var2 != null; var2 = (class423) this.field6040.method734((byte) -50)) {
                if (var2 instanceof class337) {
                    class337 var3 = (class337) var2;
                    while ((var3.field6668 <= 8 || this.method3073(102) > (double) var3.method2843(2)) && var3.field6673.packetOut(this.field6035) == 1) {
                        var3.method3360((byte) -84, this.field6035);
                    }
                }
            }
            this.method3058(this.field6042, -90);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6043[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V", line = 543)
    public final void method3066(int arg0) {
        try {
            field6041++;
            if (!this.field6017) {
                for (class423 var2 = (class423) this.field6040.method735(arg0); var2 != null; var2 = (class423) this.field6040.method734((byte) -50)) {
                    var2.method2090((byte) 124);
                    var2.field6673.method5417();
                }
                this.field6035.method5417();
                this.field6026.method5417();
                this.field6022.method5417();
                this.field6017 = true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6043[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z", line = 569)
    private final boolean method3067(int arg0) {
        try {
            field6033++;
            if (arg0 != -1) {
                this.field6022 = null;
            }
            if (this.field6016 == null) {
                double var2 = (double) this.field6018.method2087(381);
                return var2 == 0.0D || (double) class712.method5167(-2334) >= 1000.0D / var2 + (double) this.field6018.method2091(0);
            } else {
                return !this.field6018.method2081((byte) 35) || this.method3073(116) > this.field6018.method2085(29484);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6043[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Lue;", line = 596)
    public final class242 method3068(int arg0) {
        try {
            field6028++;
            return arg0 == 1 ? this.field6018 : null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6043[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)Lrl;", line = 611)
    public final class755 method3069(byte arg0) {
        try {
            field6036++;
            return arg0 == -69 ? this.field6016 : null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6043[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 623)
    private final void method3070(int arg0) throws IOException {
        try {
            if (arg0 != 0) {
                this.field6023 = true;
            }
            field6039++;
            while (this.field6018.field6673.packetOut(this.field6035) != 1) {
                class423 var2 = this.method3072((byte) 96);
                if (var2 == null) {
                    if (this.field6019) {
                        this.method3059(-79);
                    }
                    return;
                }
                if (this.field6029 == var2) {
                    this.method3065((byte) -12);
                }
            }
            this.field6018.method3360((byte) -84, this.field6035);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6043[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V", line = 655)
    public final void method3071(boolean arg0) throws IOException {
        try {
            if (!arg0) {
                this.method3073(66);
            }
            field6020++;
            if (!this.field6023) {
                while (!this.field6017) {
                    class423 var2;
                    if (this.field6024) {
                        var2 = (class423) this.field6040.method737((byte) -39, (long) this.field6026.getSerialNumber());
                    } else {
                        var2 = this.method3072((byte) 96);
                        if (var2 == null) {
                            if (this.field6019) {
                                this.method3059(98);
                            }
                            return;
                        }
                        if (var2 == null) {
                            throw new IllegalStateException();
                        }
                        this.field6024 = true;
                    }
                    if (this.field6016 == var2) {
                        if (this.field6016.method5465(-17402) >= 50) {
                            return;
                        }
                        while (this.field6016.field6673.packetOut(this.field6035) == 1) {
                            this.field6016.method3360((byte) -116, this.field6035);
                            this.method3065((byte) -12);
                            if (this.field6018 != null) {
                                double var4 = this.field6018.method2085(29484);
                                for (int var6 = 0; var6 < 10 && this.method3067(-1); var6++) {
                                    this.method3070(0);
                                    if (this.field6017) {
                                        return;
                                    }
                                }
                                if (var4 < this.field6018.method2085(29484)) {
                                    return;
                                }
                            }
                            if (this.field6016.method5465(-17402) >= 50) {
                                return;
                            }
                        }
                    } else if ((var2 instanceof class337)) {
                        this.method3065((byte) -12);
                    } else if (this.field6018 != var2) {
                        while (var2.field6673.packetOut(this.field6035) == 1) {
                            if (var2.field6668 == 1 && var2 instanceof class337) {
                                this.method3058(this.field6042, -99);
                            }
                            var2.method3360((byte) -125, this.field6035);
                        }
                    } else if (this.field6016 == null && !this.field6023) {
                        for (int var3 = 0; var3 < 10 && this.method3067(-1); var3++) {
                            this.method3070(0);
                            if (this.field6017) {
                                return;
                            }
                        }
                        return;
                    }
                    this.field6024 = false;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6043[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V", line = 771)
    public class372(int arg0) {
        try {
            if (!class259.method2177((byte) -72, field6043[17])) {
                throw new RuntimeException(field6043[16]);
            }
            this.field6037 = new byte[arg0];
            this.field6022 = new OggSyncState();
            this.field6026 = new OggPage();
            this.field6035 = new OggPacket();
            this.field6040 = new class69(8);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6043[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Ldf;", line = 786)
    private final class423 method3072(byte arg0) throws IOException {
        try {
            field6025++;
            if (this.field6017) {
                throw new IllegalStateException();
            } else if (this.field6019) {
                return null;
            } else if (arg0 == 96) {
                while (this.field6022.pageOut(this.field6026) <= 0) {
                    int var2 = this.method1807(2, this.field6037);
                    if (var2 == -1) {
                        this.field6019 = true;
                        return null;
                    }
                    if (var2 == 0) {
                        return null;
                    }
                    if (!this.field6022.write(this.field6037, var2)) {
                        throw new RuntimeException("");
                    }
                }
                int var3 = this.field6026.getSerialNumber();
                if (!this.field6026.isBOS()) {
                    class423 var10 = (class423) this.field6040.method737((byte) -39, (long) var3);
                    if (!var10.field6673.pageIn(this.field6026)) {
                        throw new IllegalStateException();
                    }
                    return var10;
                }
                OggStreamState var4 = new OggStreamState(var3);
                if (!var4.pageIn(this.field6026)) {
                    throw new IllegalStateException();
                } else if (var4.packetPeek(this.field6035) == 1) {
                    class423 var9;
                    if (this.field6018 == null && this.field6035.isTheora()) {
                        this.field6018 = new class242(var4);
                        var9 = this.field6018;
                    } else if (this.field6016 == null && this.field6035.isVorbis()) {
                        this.field6016 = new class755(var4);
                        var9 = this.field6016;
                    } else {
                        byte[] var5 = this.field6035.getData();
                        StringBuffer var6 = new StringBuffer();
                        for (int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                            var6.append((char) var5[var7]);
                        }
                        String var8 = var6.toString();
                        if (var8.equals(field6043[1])) {
                            var9 = new class337(var4);
                        } else {
                            var9 = new class264(var4);
                        }
                    }
                    this.field6040.method738(var9, (long) var3, -12002);
                    return var9;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                return null;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field6043[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)D", line = 903)
    public final double method3073(int arg0) {
        try {
            if (arg0 <= 92) {
                this.field6026 = null;
            }
            field6030++;
            if (this.field6016 == null) {
                return this.field6018 == null ? 0.0D : this.field6018.method2085(29484);
            } else {
                return this.field6016.method5464((byte) -92);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6043[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B)I")
    public abstract int method1807(int arg0, byte[] arg1) throws IOException;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3074(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3075(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 97;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
