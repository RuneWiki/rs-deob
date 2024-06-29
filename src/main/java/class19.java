import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class19 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lnj;")
    public class151 field269 = new class151();

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lmb;")
    public static class132 field270 = class166.method1092("mod_icons", 116);

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lmb;")
    private static class132 field274 = class166.method1092("Welcome to RuneScape", 125);

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lmb;")
    public static class132 field266 = field274;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lmb;")
    public static class132 field278 = class166.method1092("Keine Antwort vom Server)3", 126);

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field284 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Lnj;")
    private class151 field275;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[Lrd;")
    public static class188[] field267;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lha;")
    public static final class78 method116(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3096; var4++) {
            class78 var5 = var3.field3103[var4];
            if ((var5.field1355 >> 29 & 0x3L) == 2L && var5.field1353 == arg1 && var5.field1362 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Lnj;")
    public final class151 method117(byte arg0) {
        class151 var2 = this.field269.field2759;
        field282++;
        if (this.field269 == var2) {
            return null;
        } else {
            var2.method995((byte) -83);
            return arg0 == 6 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static final void method118(int arg0) {
        field265++;
        if (arg0 != -1333036600) {
            field266 = null;
        }
        for (int var1 = 0; var1 < class220.field4003; var1++) {
            int var2 = class211.field3874[var1];
            class159 var3 = class68.field1120[var2];
            int var4 = class118.field2241.method716(-1308);
            if ((var4 & 0x1) != 0) {
                var4 += class118.field2241.method716(arg0 ^ 0x4F74832C) << 8;
            }
            class184.method1180(var2, var3, (byte) 36, var4);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lnj;")
    public final class151 method119(boolean arg0) {
        class151 var2 = this.field269.field2759;
        field264++;
        if (this.field269 == var2) {
            this.field275 = null;
            return null;
        }
        if (!arg0) {
            this.method119(false);
        }
        this.field275 = var2.field2759;
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILnj;)V")
    public final void method120(int arg0, class151 arg1) {
        if (arg0 != 0) {
            field267 = null;
        }
        field280++;
        if (arg1.field2769 != null) {
            arg1.method995((byte) -47);
        }
        arg1.field2769 = this.field269.field2769;
        arg1.field2759 = this.field269;
        arg1.field2769.field2759 = arg1;
        arg1.field2759.field2769 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lnj;Lnj;B)V")
    public final void method121(class151 arg0, class151 arg1, byte arg2) {
        if (arg1.field2769 != null) {
            arg1.method995((byte) 100);
        }
        arg1.field2769 = arg0.field2769;
        field268++;
        if (arg2 <= 40) {
            field284 = 8;
        }
        arg1.field2759 = arg0;
        arg1.field2769.field2759 = arg1;
        arg1.field2759.field2769 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lnj;I)V")
    public final void method122(class151 arg0, int arg1) {
        if (arg1 != 3) {
            return;
        }
        field276++;
        if (arg0.field2769 != null) {
            arg0.method995((byte) -56);
        }
        arg0.field2759 = this.field269.field2759;
        arg0.field2769 = this.field269;
        arg0.field2769.field2759 = arg0;
        arg0.field2759.field2769 = arg0;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method123(int arg0) {
        field271++;
        int var1 = 97 / ((arg0 + 74) / 42);
        if (class57.field964 != null) {
            class70 var2 = class57.field964;
            synchronized (class57.field964) {
                class57.field964 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class19() {
        this.field269.field2769 = this.field269;
        this.field269.field2759 = this.field269;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Lnj;")
    public final class151 method124(int arg0) {
        class151 var2 = this.field269.field2769;
        field283++;
        if (this.field269 == var2) {
            this.field275 = null;
            return null;
        }
        if (arg0 != 0) {
            this.field275 = null;
        }
        this.field275 = var2.field2769;
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Lnj;")
    public final class151 method125(byte arg0) {
        field281++;
        class151 var2 = this.field275;
        if (this.field269 == var2) {
            this.field275 = null;
            return null;
        }
        if (arg0 >= -13) {
            this.method125((byte) 82);
        }
        this.field275 = var2.field2759;
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[Lmb;)[Lmb;")
    public static final class132[] method126(int arg0, class132[] arg1) {
        class132[] var2 = new class132[5];
        field273++;
        int var3 = 28 / ((-arg0 - 73) / 36);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = class187.method1197(new class132[] { class132.method889(var4, (byte) 95), class53.field899 }, -95);
            if (arg1 != null && arg1[var4] != null) {
                var2[var4] = class187.method1197(new class132[] { var2[var4], arg1[var4] }, -102);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V")
    public static final void method127(int arg0, int arg1, int arg2) {
        class154.field2818 = true;
        class205.field3758 = arg0;
        class171.field3192 = arg1;
        class17.field259 = arg2;
        class140.field2618 = -1;
        class6.field60 = -1;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V")
    public static void method128(int arg0) {
        field267 = null;
        if (arg0 == 0) {
            field270 = null;
            field278 = null;
            field274 = null;
            field266 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)Lnj;")
    public final class151 method129(byte arg0) {
        field272++;
        class151 var2 = this.field275;
        if (arg0 >= -123) {
            return null;
        } else if (this.field269 == var2) {
            this.field275 = null;
            return null;
        } else {
            this.field275 = var2.field2769;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
    public final void method130(int arg0) {
        if (arg0 != 12040) {
            this.method130(-64);
        }
        field279++;
        while (true) {
            class151 var2 = this.field269.field2759;
            if (this.field269 == var2) {
                return;
            }
            var2.method995((byte) -78);
        }
    }
}
