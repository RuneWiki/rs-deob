import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class159 extends class113 {

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Z")
    public boolean field3169 = true;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public int field3180 = -1;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public int field3178 = 0;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public int field3181 = -1;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Lsa;")
    public static class162 field3170 = new class162(20);

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "I")
    public static int field3191 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "Lkg;")
    public static class96 field3190 = new class96(5000);

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "Lcd;")
    private static class23 field3192 = class54.method414("Loaded config", -1);

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "Lcd;")
    public static class23 field3193 = field3192;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "Lhh;")
    public static class71 field3185;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "[Lpa;")
    public static class135[] field3189;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "[Lcb;")
    public static class21[] field3188;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public final void method974(byte arg0) {
        field3183++;
        if (this.field3181 != -1) {
            this.method978(this.field3181, (byte) 125);
            this.field3176 = this.field3179;
            this.field3173 = this.field3172;
            this.field3184 = this.field3177;
        }
        if (arg0 != 10) {
            method977(70);
        }
        this.method978(this.field3178, (byte) 125);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lva;IB)V")
    public final void method975(class189 arg0, int arg1, byte arg2) {
        field3175++;
        while (true) {
            int var4 = arg0.method1202(-86);
            if (var4 == 0) {
                if (arg2 == 113) {
                    return;
                } else {
                    this.method974((byte) -114);
                    return;
                }
            }
            this.method979(arg1, var4, arg0, 70);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public static final void method976(int arg0, int arg1) {
        field3182++;
        if (arg0 == -1 || !class82.method556(arg0, (byte) -7)) {
            return;
        }
        class47[] var2 = class100.field2114[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class47 var4 = var2[var3];
            if (var4.field1043 != null) {
                class144 var5 = new class144();
                var5.field2942 = var4.field1043;
                var5.field2939 = var4;
                class50.method391(-1142686098, var5);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public static void method977(int arg0) {
        if (arg0 != -2403) {
            method977(93);
        }
        field3193 = null;
        field3185 = null;
        field3188 = null;
        field3189 = null;
        field3192 = null;
        field3170 = null;
        field3190 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
    private final void method978(int arg0, byte arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        if (arg1 != 125) {
            method976(92, -94);
        }
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        field3187++;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        double var13 = 0.0D;
        if (var3 > var7) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        if (var7 > var3) {
            var11 = var7;
        }
        double var15 = 0.0D;
        if (var11 < var5) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (-var9 + var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field3172 = (int) (var17 * 256.0D);
        this.field3179 = (int) (var15 * 256.0D);
        if (this.field3172 < 0) {
            this.field3172 = 0;
        } else if (this.field3172 > 255) {
            this.field3172 = 255;
        }
        double var19 = var13 / 6.0D;
        this.field3177 = (int) (var19 * 256.0D);
        if (this.field3179 < 0) {
            this.field3179 = 0;
        } else if (this.field3179 > 255) {
            this.field3179 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILva;I)V")
    private final void method979(int arg0, int arg1, class189 arg2, int arg3) {
        if (arg3 <= 43) {
            return;
        }
        field3174++;
        if (arg1 == 1) {
            this.field3178 = arg2.method1177(true);
        } else if (arg1 == 2) {
            this.field3180 = arg2.method1202(-87);
        } else if (arg1 == 3) {
            this.field3180 = arg2.method1197(-1);
            if (this.field3180 == 65535) {
                this.field3180 = -1;
                return;
            }
            return;
        } else if (arg1 == 5) {
            this.field3169 = false;
            return;
        } else if (arg1 == 7) {
            this.field3181 = arg2.method1177(true);
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public static final void method980(byte arg0) {
        class174.field3441.method997(false);
        class154.field3074.method997(false);
        field3186++;
        if (arg0 != -126) {
            method976(51, 41);
        }
    }
}
