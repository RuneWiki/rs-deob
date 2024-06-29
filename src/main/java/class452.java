import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class452 {

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "Lhp;")
    private class277 field6747 = new class277(256);

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "Le;")
    private class462 field6743;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Ltu;")
    private class294 field6739;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "Lea;")
    public static class474 field6744 = new class474("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "Lig;")
    public static class206 field6745 = new class206(115, 6);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "[I")
    public static int[] field6746;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lrt;BI)Ljava/lang/String;")
    public static final String method2791(class194 arg0, byte arg1, int arg2) {
        field6738++;
        try {
            if (arg1 != 4) {
                return null;
            }
            int var3 = arg0.method1176((byte) -53);
            if (var3 > arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field2610 += class180.field2218.method1745(arg0.field2622, arg0.field2610, var3, 2, var4, 0);
            return class79.method514(0, var4, arg1 ^ 0x5, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V")
    public static void method2792(boolean arg0) {
        field6745 = null;
        field6744 = null;
        field6746 = null;
        if (!arg0) {
            field6746 = null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BII)V")
    public static final void method2793(byte arg0, int arg1, int arg2) {
        field6735++;
        class308.method2044(class90.field1035, -7434);
        class618.field8974++;
        class468.field6960.method1214(arg1, 126);
        if (arg0 != -52) {
            method2791(null, (byte) 0, 59);
        }
        class468.field6960.method1235(arg2, (byte) 11);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public final void method2794(int arg0) {
        this.field6747.method1811((byte) -59, 5);
        field6740++;
        if (arg0 != -5180) {
            method2792(true);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public static final void method2795(byte arg0) {
        field6737++;
        if (arg0 != -7) {
            method2795((byte) 102);
        }
        if (class550.field7846 < 0) {
            return;
        }
        long var1 = class84.method550((byte) -86);
        class550.field7846 = (int) ((long) class550.field7846 - (var1 - class443.field6632));
        if (class550.field7846 <= 0) {
            class410.field6247 = class193.field2555.field9146;
            class3.field21 = class193.field2555.field9145;
            class550.field7846 = -1;
            class488.field7120 = class193.field2555.field9152;
            class592.field8496 = class193.field2555.field9138;
            class20.field203 = class193.field2555.field9140;
            class326.field4704 = class193.field2555.field9149;
            class601.field8778 = class193.field2555.field9154;
            class181.field2223 = class193.field2555.field9139;
            class440.field6570 = class193.field2555.field9144;
            class28.field294 = class193.field2555.field9142;
        } else {
            int var3 = (class550.field7846 << 8) / class398.field6051;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class440.field6570 = ((class179.field2202 & 0xFF00) * var3 + (class193.field2555.field9144 & 0xFF00) * var4 & 0xFF0000) + ((class179.field2202 & 0xFF00FF) * var3 + (class193.field2555.field9144 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class592.field8496 = (class193.field2555.field9138 - class558.field7954) * var6 + class558.field7954;
            class28.field294 = ((class590.field8478 & 0xFF00FF) * var3 + (class193.field2555.field9142 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class590.field8478 & 0xFF00) * var3 + (class193.field2555.field9142 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class410.field6247 = (class193.field2555.field9146 - class347.field4967) * var6 + class347.field4967;
            class3.field21 = (class193.field2555.field9145 - class637.field9162) * var6 + class637.field9162;
            class601.field8778 = (class193.field2555.field9154 - class436.field6497) * var6 + class436.field6497;
            class488.field7120 = class411.field6257 * var3 + class193.field2555.field9152 * var4 >> 8;
            class326.field4704 = (class193.field2555.field9149 - class499.field7283) * var6 + class499.field7283;
            class181.field2223 = (class193.field2555.field9139 - class253.field3578) * var6 + class253.field3578;
            if (class30.field346 != class193.field2555.field9140) {
                class20.field203 = class108.field1302.method371(class30.field346, class193.field2555.field9140, var6, class20.field203);
            }
        }
        class443.field6632 = var1;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Lica;")
    public final class579 method2796(int arg0, int arg1) {
        field6736++;
        Object var3 = this.field6747.method1801(0, (long) arg0);
        if (var3 != null) {
            return (class579) var3;
        } else if (this.field6743.method436(arg0, -5686)) {
            class614 var4 = this.field6743.method438(96, arg0);
            int var5 = var4.field8944 ? 64 : this.field6739.field4269;
            class579 var7;
            if (var4.field8937 && this.field6739.method359()) {
                float[] var6 = this.field6743.method440((byte) -56, var5, false, var5, 0.7F, arg0);
                var7 = this.field6739.method1929(class538.field7742, var4.field8940 != 0, var6, var5, 0, var5);
            } else {
                int[] var8 = var4.field8943 ? this.field6743.method433(51, false, var5, arg0, var5, 0.7F) : this.field6743.method432(var5, 0.7F, arg0, var5, -18170, true);
                var7 = this.field6739.method1947(112, var8, var4.field8940 != 0, var5, var5);
            }
            var7.method476(var4.field8932, var4.field8947, (byte) 126);
            this.field6747.method1808((long) arg0, var7, (byte) -49);
            if (arg1 <= 1) {
                method2793((byte) -109, -70, 43);
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
    public final void method2797(int arg0) {
        if (arg0 < -28) {
            this.field6747.method1810(false);
            field6742++;
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Ltu;Le;)V")
    public class452(class294 arg0, class462 arg1) {
        this.field6743 = arg1;
        this.field6739 = arg0;
    }
}
