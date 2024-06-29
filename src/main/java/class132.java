import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class132 extends class118 {

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "[I")
    private int[] field3331 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "Z")
    public boolean field3344 = false;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "[S")
    private short[] field3334 = new short[6];

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public int field3346 = -1;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "[S")
    private short[] field3348 = new short[6];

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "Lfc;")
    public static class39 field3330 = class90.method774(":0", -80);

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Lfc;")
    private static class39 field3328 = class90.method774("go back to the main RuneScape webpage", -125);

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lfc;")
    private static class39 field3340 = class90.method774("wave2:", -112);

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lfc;")
    public static class39 field3335 = class90.method774("Lade Wordpack )2 ", -125);

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lfc;")
    public static class39 field3337 = field3340;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lfc;")
    public static class39 field3341 = field3328;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lfc;")
    private static class39 field3345 = class90.method774("Friends", -114);

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Lfc;")
    public static class39 field3332 = field3340;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "Lfc;")
    public static class39 field3347 = class90.method774("http:)4)4", -107);

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Lfc;")
    public static class39 field3329 = field3345;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "Loc;")
    public static class100 field3343;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "Lue;")
    public static class141 field3323;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3338;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "[I")
    private int[] field3326;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1070(boolean arg0) {
        field3343 = null;
        field3337 = null;
        field3335 = null;
        field3328 = null;
        field3323 = null;
        field3330 = null;
        field3341 = null;
        if (arg0) {
            return;
        }
        field3332 = null;
        field3347 = null;
        field3340 = null;
        field3345 = null;
        field3329 = null;
        field3338 = null;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)Z", line = 44)
    public final boolean method1071(byte arg0) {
        field3327++;
        if (this.field3326 == null) {
            return true;
        }
        if (arg0 < 11) {
            this.field3344 = true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3326.length; var3++) {
            if (!class50.field1252.method835((byte) 71, this.field3326[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)Lub;", line = 70)
    public final class138 method1072(int arg0) {
        field3336++;
        if (this.field3326 == null) {
            return null;
        }
        class138[] var2 = new class138[this.field3326.length];
        for (int var3 = 0; var3 < this.field3326.length; var3++) {
            var2[var3] = class138.method1122(class50.field1252, this.field3326[var3], 0);
        }
        class138 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class138(var2, var2.length);
        }
        if (arg0 != -3250) {
            method1073(null, 44);
        }
        for (int var5 = 0; var5 < 6 && this.field3334[var5] != 0; var5++) {
            var4.method1124(this.field3334[var5], this.field3348[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lta;I)V", line = 143)
    public static final void method1073(class131 arg0, int arg1) {
        field3324++;
        int var2 = 0;
        if (arg0.field3292 == 0) {
            var2 = class139.field3503.method48(arg0.field3303, arg0.field3295, arg0.field3288);
        }
        int var3 = -1;
        if (arg0.field3292 == 1) {
            var2 = class139.field3503.method50(arg0.field3303, arg0.field3295, arg0.field3288);
        }
        if (arg0.field3292 == 2) {
            var2 = class139.field3503.method46(arg0.field3303, arg0.field3295, arg0.field3288);
        }
        int var4 = 0;
        if (arg0.field3292 == 3) {
            var2 = class139.field3503.method76(arg0.field3303, arg0.field3295, arg0.field3288);
        }
        int var5 = 0;
        if (var2 != 0) {
            int var6 = class139.field3503.method43(arg0.field3303, arg0.field3295, arg0.field3288, var2);
            var4 = var6 & 0x1F;
            var3 = var2 >> 14 & 0x7FFF;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field3312 = var4;
        arg0.field3304 = var3;
        arg0.field3294 = var5;
        int var7 = -120 % ((-arg1 - 9) / 58);
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Lub;", line = 205)
    public final class138 method1074(int arg0) {
        int var2 = 70 / ((arg0 - 58) / 60);
        field3333++;
        class138[] var3 = new class138[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field3331[var5] != -1) {
                var3[var4++] = class138.method1122(class50.field1252, this.field3331[var5], 0);
            }
        }
        class138 var6 = new class138(var3, var4);
        for (int var7 = 0; var7 < 6 && this.field3334[var7] != 0; var7++) {
            var6.method1124(this.field3334[var7], this.field3348[var7]);
        }
        return var6;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ldc;BI)V", line = 262)
    private final void method1075(class25 arg0, byte arg1, int arg2) {
        if (arg1 != 113) {
            return;
        }
        field3339++;
        if (arg2 == 1) {
            this.field3346 = arg0.method322((byte) -50);
        } else if (arg2 == 2) {
            int var4 = arg0.method322((byte) -50);
            this.field3326 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3326[var5] = arg0.method301(-4853);
            }
        } else if (arg2 == 3) {
            this.field3344 = true;
        } else if (arg2 < 40 || arg2 >= 50) {
            if (arg2 >= 50 && arg2 < 60) {
                this.field3348[arg2 - 50] = (short) arg0.method301(class83.method697(arg1, -4742));
                return;
            }
            if (arg2 >= 60 && arg2 < 70) {
                this.field3331[arg2 - 60] = arg0.method301(arg1 - 4966);
                return;
            }
        } else {
            this.field3334[arg2 - 40] = (short) arg0.method301(-4853);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ldc;I)V", line = 309)
    public final void method1076(class25 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method322((byte) -50);
            if (var3 == 0) {
                field3342++;
                int var4 = -113 % ((58 - arg1) / 52);
                return;
            }
            this.method1075(arg0, (byte) 113, var3);
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Z", line = 344)
    public final boolean method1077(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3331[var3] != -1 && !class50.field1252.method835((byte) 117, this.field3331[var3], 0)) {
                var2 = false;
            }
        }
        field3325++;
        if (arg0 == 13272) {
            return var2;
        } else {
            return true;
        }
    }
}
