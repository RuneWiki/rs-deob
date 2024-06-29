import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class472 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    private int field6944 = -1;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    private int field6943 = 0;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lko;")
    private class348 field6950 = new class348();

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Z")
    public boolean field6959 = false;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    private int field6949;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    private int field6942;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[[[I")
    private int[][][] field6947;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[Ldc;")
    private class5[] field6952;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lnk;")
    public static class500 field6945 = new class500("WTWIP", 3);

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lgf;")
    public static class180 field6955 = new class180("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field6958 = 0;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "F")
    public static float field6960;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public final void method2818(int arg0) {
        field6948++;
        int var2 = 0;
        if (arg0 != 14933) {
            this.field6943 = -94;
        }
        while (this.field6942 > var2) {
            this.field6947[var2][0] = null;
            this.field6947[var2][1] = null;
            this.field6947[var2][2] = null;
            this.field6947[var2] = null;
            var2++;
        }
        this.field6952 = null;
        this.field6947 = null;
        this.field6950.method2264(108);
        this.field6950 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method2819(byte arg0, int arg1) {
        if (arg0 > -7) {
            return null;
        }
        field6946++;
        if (this.field6949 == this.field6942) {
            this.field6959 = this.field6952[arg1] == null;
            this.field6952[arg1] = class67.field1169;
            return this.field6947[arg1];
        } else if (this.field6942 == 1) {
            this.field6959 = this.field6944 != arg1;
            this.field6944 = arg1;
            return this.field6947[0];
        } else {
            class5 var3 = this.field6952[arg1];
            if (var3 == null) {
                this.field6959 = true;
                if (this.field6943 < this.field6942) {
                    var3 = new class5(arg1, this.field6943);
                    this.field6943++;
                } else {
                    class5 var4 = (class5) this.field6950.method2260(2);
                    var3 = new class5(arg1, var4.field77);
                    this.field6952[var4.field78] = null;
                    var4.method2663(-120);
                }
                this.field6952[arg1] = var3;
            } else {
                this.field6959 = false;
            }
            this.field6950.method2265((byte) -120, var3);
            return this.field6947[var3.field77];
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method2820(int arg0) {
        field6956++;
        if (this.field6949 != this.field6942) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6942; var2++) {
            this.field6952[var2] = class67.field1169;
        }
        return this.field6947;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method2821(byte arg0) {
        field6955 = null;
        field6945 = null;
        if (arg0 >= -118) {
            method2822((byte) -107, null);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLqa;)V")
    public static final void method2822(byte arg0, class162 arg1) {
        field6953++;
        if (!(class106.field1669 >= 2 || class301.field4287) || class13.field221 != null) {
            return;
        }
        if (arg0 <= 109) {
            field6955 = null;
        }
        String var2;
        if (class301.field4287 && class106.field1669 < 2) {
            var2 = class200.field2920 + class169.field2540.method1273(true, class370.field5530) + class318.field4553 + " ->";
        } else if (class76.field1245 && class351.field5334.method1767(81, (byte) -104) && class106.field1669 > 2) {
            var2 = class96.method766((byte) 110, (class231) class246.field3563.field5279.field6396.field6396);
        } else {
            class231 var3 = (class231) class246.field3563.field5279.field6396;
            var2 = class96.method766((byte) -106, var3);
            int[] var4 = null;
            if (class219.method1455(var3.field3368, -102)) {
                var4 = class8.field111.method3077(-125, (int) var3.field3371).field2556;
            } else if (var3.field3365 != -1) {
                var4 = class8.field111.method3077(-125, var3.field3365).field2556;
            } else if (class32.method259(var3.field3368, (byte) -42)) {
                class13 var7 = class132.field2030[(int) var3.field3371];
                if (var7 != null) {
                    class148 var8 = var7.field210;
                    if (var8.field2193 != null) {
                        var8 = var8.method1059((byte) -51, class526.field7733);
                    }
                    if (var8 != null) {
                        var4 = var8.field2194;
                    }
                }
            } else if (class358.method2308((byte) -17, var3.field3368)) {
                Object var5 = null;
                class510 var6;
                if (var3.field3368 == 1001) {
                    var6 = class246.field3567.method609(112, (int) var3.field3371);
                } else {
                    var6 = class246.field3567.method609(118, (int) (var3.field3371 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field7497 != null) {
                    var6 = var6.method3027(class526.field7733, -12889);
                }
                if (var6 != null) {
                    var4 = var6.field7488;
                }
            }
            if (var4 != null) {
                var2 = var2 + class168.method1193(var4, (byte) -57);
            }
        }
        if (class106.field1669 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class106.field1669 - 2) + class279.field4011.method1273(true, class370.field5530);
        }
        if (class288.field4146 != null) {
            class488 var10 = class288.field4146.method414(arg1, (byte) -107);
            if (var10 == null) {
                var10 = class526.field7731;
            }
            var10.method2917(class288.field4146.field842, var2, class4.field75, class414.field6083, class288.field4146.field943, class147.field2166, class288.field4146.field925, class527.field7754, class314.field4491, class182.field2747, class288.field4146.field896, class288.field4146.field988, class288.field4146.field983, class444.field6515, (byte) 106);
            class346.method2246(class527.field7754[1], class527.field7754[0], (byte) -93, class527.field7754[2], class527.field7754[3]);
        } else if (class443.field6496 != null && class371.field5565 == class321.field4649) {
            int var9 = class526.field7731.method2919(16777215, 0, class147.field2166, class182.field2747, class4.field75, (byte) 124, class371.field5566 + 16, class444.field6515, class229.field3352 + 4, var2);
            class346.method2246(class371.field5566, class229.field3352 + 4, (byte) -93, class476.field6998.method105(var2, 1) + var9, 16);
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
    public static final int method2823(int arg0, int arg1, int arg2) {
        field6957++;
        if (arg2 == 1 || arg2 == 3) {
            return class365.field5483[arg1 & 0x3];
        } else if (arg0 == 3) {
            return class296.field4238[arg1 & 0x3];
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lti;I)Lal;")
    public static final class65 method2824(class303 arg0, int arg1) {
        if (arg1 != 1478637600) {
            method2823(-11, 91, -101);
        }
        field6954++;
        return new class65(arg0.method1901(126), arg0.method1901(123), arg0.method1901(125), arg0.method1901(arg1 ^ 0x58223858), arg0.method1866(false), arg0.method1918((byte) -44));
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(III)V")
    public class472(int arg0, int arg1, int arg2) {
        this.field6949 = arg1;
        this.field6942 = arg0;
        this.field6947 = new int[this.field6942][3][arg2];
        this.field6952 = new class5[this.field6949];
    }
}
