import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class314 extends class333 {

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lwd;")
    public static class357 field3899 = new class357(8, 0, 4, 1);

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lqg;")
    public static class216 field3902 = new class216("WTI", 5);

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lko;")
    public static class259 field3907 = new class259("RC", 1);

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field3908 = 2;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "F")
    public static float field3904;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[[B")
    public static byte[][] field3909;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
    public static final void method1799() {
        for (int var0 = 0; var0 < class282.field3532; var0++) {
            class613 var1 = class138.field1525[var0];
            class609.method3390(var1, true);
            class138.field1525[var0] = null;
        }
        class282.field3532 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1800(int arg0) {
        field3907 = null;
        field3902 = null;
        field3909 = null;
        field3899 = null;
        if (arg0 <= 24) {
            field3902 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Z")
    public final boolean method1801(int arg0) {
        int var2 = 19 / ((60 - arg0) / 61);
        field3903++;
        return ((this.field3898 & 0x316E63) >> 21) != 0;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I")
    public final int method1802(int arg0) {
        if (arg0 != 1) {
            this.method1803(-77, 80);
        }
        field3896++;
        return class475.method2734(this.field3898, 12077);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
    public final boolean method1803(int arg0, int arg1) {
        if (arg1 != -22899) {
            method1800(95);
        }
        field3901++;
        return (this.field3898 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
    public final boolean method1804(byte arg0) {
        if (arg0 > -104) {
            this.method1807(true);
        }
        field3895++;
        return (this.field3898 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(II)V")
    public class314(int arg0, int arg1) {
        this.field3898 = arg0;
        this.field3897 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Z")
    public final boolean method1805(byte arg0) {
        if (arg0 > -53) {
            method1799();
        }
        field3900++;
        return (this.field3898 & 0x798588) >> 22 != 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lki;Lki;I)V")
    public static final void method1806(class321 arg0, class321 arg1, int arg2) {
        if (arg1.field3946 != null) {
            arg1.method1821(114);
        }
        field3906++;
        arg1.field3946 = arg0.field3946;
        if (arg2 != 1) {
            method1806(null, null, -112);
        }
        arg1.field3948 = arg0;
        arg1.field3946.field3948 = arg1;
        arg1.field3948.field3946 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)I")
    public final int method1807(boolean arg0) {
        field3905++;
        if (!arg0) {
            field3902 = null;
        }
        return this.field3898 >> 18 & 0x7;
    }
}
