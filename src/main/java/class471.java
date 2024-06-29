import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class471 {

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lfi;")
    public class37 field6885 = new class37();

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[I")
    public static int[] field6889 = new int[4];

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lhb;")
    public static class250 field6879 = new class250(8, 7);

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "S")
    public static short field6891 = 256;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "F")
    public static float field6892;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "Lji;")
    public static class249 field6882;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lfi;")
    private class37 field6890;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Lbi;")
    public static class381 field6888;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I", line = 6)
    public static final int method2825(int arg0, int arg1, int arg2) {
        field6880++;
        if (arg1 != 3) {
            method2825(-65, -78, -8);
        }
        return arg2 == 1 || arg2 == 3 ? class180.field2341[arg0 & 0x3] : class235.field3066[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lfi;I)V", line = 21)
    public final void method2826(class37 arg0, int arg1) {
        field6881++;
        if (arg0.field569 != null) {
            arg0.method240(3);
        }
        arg0.field568 = this.field6885;
        arg0.field569 = this.field6885.field569;
        if (arg1 > -41) {
            field6882 = null;
        }
        arg0.field569.field568 = arg0;
        arg0.field568.field569 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)I", line = 47)
    public final int method2827(int arg0) {
        field6887++;
        int var2 = arg0;
        for (class37 var3 = this.field6885.field568; var3 != this.field6885; var3 = var3.field568) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lfi;", line = 69)
    public final class37 method2828(int arg0) {
        if (arg0 != 7) {
            field6879 = null;
        }
        field6883++;
        class37 var2 = this.field6885.field568;
        if (this.field6885 == var2) {
            this.field6890 = null;
            return null;
        } else {
            this.field6890 = var2.field568;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 91)
    public final void method2829(int arg0) {
        field6884++;
        while (true) {
            class37 var2 = this.field6885.field568;
            if (this.field6885 == var2) {
                if (arg0 <= 75) {
                    this.method2831(-18);
                }
                this.field6890 = null;
                return;
            }
            var2.method240(3);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 114)
    public static void method2830(byte arg0) {
        field6888 = null;
        int var1 = 44 % ((85 - arg0) / 40);
        field6879 = null;
        field6882 = null;
        field6889 = null;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 156)
    public class471() {
        this.field6885.field569 = this.field6885;
        this.field6885.field568 = this.field6885;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)Lfi;", line = 137)
    public final class37 method2831(int arg0) {
        field6886++;
        class37 var2 = this.field6890;
        if (arg0 != 256) {
            method2825(-72, 74, 122);
        }
        if (this.field6885 == var2) {
            this.field6890 = null;
            return null;
        } else {
            this.field6890 = var2.field568;
            return var2;
        }
    }
}
