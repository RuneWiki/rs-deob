import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class18 {

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "[Lc;")
    private class5[] field161;

    @OriginalMember(owner = "mapview!ia", name = "i", descriptor = "Lu;")
    public static class38 field165 = class9.method45(-41, "Amulet Shop");

    @OriginalMember(owner = "mapview!ia", name = "k", descriptor = "Lu;")
    public static class38 field167 = class9.method45(-41, "mapscene");

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "mapview!ia", name = "j", descriptor = "Lu;")
    public static class38 field166 = class9.method45(-41, "Anvil");

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "I")
    public static int field162 = 50;

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "Lj;")
    public static class19 field164 = new class19();

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "Lu;")
    public static class38 field170 = class9.method45(-41, "map");

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "Lu;")
    public static class38 field171 = class9.method45(-41, "Find");

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "[J")
    public static long[] field173 = new long[32];

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "mapview!ia", name = "l", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "mapview!ia", name = "m", descriptor = "J")
    private long field169;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "Lc;")
    private class5 field157;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([Lu;I)V", line = 18)
    public static final void method87(class38[] arg0, int arg1) {
        class33.method191(arg0, (byte) 67, arg1, arg0.length);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 30)
    public static final void method88(Component arg0, int arg1) {
        arg0.addMouseListener(field164);
        if (arg1 != 1) {
            method88(null, -128);
        }
        arg0.addMouseMotionListener(field164);
        arg0.addFocusListener(field164);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)V", line = 49)
    public static void method89(int arg0) {
        field173 = null;
        field171 = null;
        field164 = null;
        field166 = null;
        field167 = null;
        if (arg0 >= -66) {
            method87(null, 11);
        }
        field170 = null;
        field165 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(II)I", line = 85)
    public static int method90(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)Lc;", line = 95)
    public final class5 method91(byte arg0) {
        if (this.field157 == null) {
            return null;
        }
        int var2 = -8 / ((arg0 - 45) / 49);
        class5 var3 = this.field161[(int) (this.field169 & (long) (this.field160 - 1))];
        while (this.field157 != var3) {
            if (this.field157.field29 == this.field169) {
                class5 var4 = this.field157;
                this.field157 = this.field157.field24;
                return var4;
            }
            this.field157 = this.field157.field24;
        }
        this.field157 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IJ)Lc;", line = 136)
    public final class5 method92(int arg0, long arg1) {
        this.field169 = arg1;
        class5 var4 = this.field161[(int) (arg1 & (long) (this.field160 - arg0))];
        for (this.field157 = var4.field24; this.field157 != var4; this.field157 = this.field157.field24) {
            if (this.field157.field29 == arg1) {
                class5 var5 = this.field157;
                this.field157 = this.field157.field24;
                return var5;
            }
        }
        this.field157 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "(I)V", line = 185)
    public class18(int arg0) {
        this.field160 = arg0;
        this.field161 = new class5[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class5 var3 = this.field161[var2] = new class5();
            var3.field24 = var3;
            var3.field26 = var3;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(JLc;B)V", line = 211)
    public final void method93(long arg0, class5 arg1, byte arg2) {
        if (arg2 >= -104) {
            return;
        }
        if (arg1.field26 != null) {
            arg1.method13((byte) 111);
        }
        class5 var5 = this.field161[(int) ((long) (this.field160 - 1) & arg0)];
        arg1.field29 = arg0;
        arg1.field26 = var5.field26;
        arg1.field24 = var5;
        arg1.field26.field24 = arg1;
        arg1.field24.field26 = arg1;
    }
}
