import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class329 {

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lwp;")
    public static class453 field4202 = new class453(93, 6);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "J")
    public long field4199;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lpj;")
    public static class235 field4193;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Ld;")
    public class329 field4196;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Ld;")
    public class329 field4201;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4194;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public static void method1870(int arg0) {
        field4193 = null;
        field4194 = null;
        if (arg0 != -7141) {
            method1870(103);
        }
        field4202 = null;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
    public final void method1871(int arg0) {
        field4198++;
        if (arg0 <= -8 && this.field4196 != null) {
            this.field4196.field4201 = this.field4201;
            this.field4201.field4196 = this.field4196;
            this.field4196 = null;
            this.field4201 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)[I")
    public static final int[] method1872(int arg0) {
        field4200++;
        if (arg0 >= -81) {
            method1870(-113);
        }
        return new int[] { class622.field8710, class201.field2536, class413.field5162 };
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)Z")
    public final boolean method1873(int arg0) {
        field4197++;
        int var2 = 32 / ((54 - arg0) / 62);
        return this.field4196 != null;
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
    public static final void method1874(int arg0) {
        field4195++;
        if (arg0 != -21715) {
            field4194 = null;
        }
        for (class62 var1 = (class62) class467.field5934.method237(120); var1 != null; var1 = (class62) class467.field5934.method245((byte) 85)) {
            if (var1.field838 > 0) {
                var1.field838--;
            }
            if (var1.field838 != 0) {
                if (var1.field843 > 0) {
                    var1.field843--;
                }
                if (var1.field843 == 0 && var1.field845 >= 1 && var1.field835 >= 1 && (class431.field5395 - 2) >= var1.field845 && class452.field5802 - 2 >= var1.field835 && (var1.field837 < 0 || class172.method1093((byte) -110, var1.field836, var1.field837))) {
                    class590.method3246(var1.field839, -1, var1.field846, (byte) 68, var1.field845, var1.field835, var1.field836, var1.field844, var1.field837);
                    var1.field843 = -1;
                    if (var1.field840 == var1.field837 && var1.field840 == -1) {
                        var1.method1871(-55);
                    } else if (var1.field840 == var1.field837 && var1.field846 == var1.field841 && var1.field842 == var1.field836) {
                        var1.method1871(-50);
                    }
                }
            } else if (var1.field840 < 0 || class172.method1093((byte) -110, var1.field842, var1.field840)) {
                class590.method3246(var1.field839, -1, var1.field841, (byte) 68, var1.field845, var1.field835, var1.field842, var1.field844, var1.field840);
                var1.method1871(-95);
            }
        }
    }
}
