import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class266 {

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Leb;")
    public static class230 field4728 = class68.method589(0, "::rebuild");

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field4731 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1837(boolean arg0, String arg1) {
        field4723++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (!arg0) {
            method1840((byte) 51);
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Leb;B)V")
    public static final void method1838(class230 arg0, byte arg1) {
        field4724++;
        if (arg1 <= 22) {
            method1839(-46);
        }
        for (class189 var2 = (class189) class124.field2189.method839(128); var2 != null; var2 = (class189) class124.field2189.method834((byte) 82)) {
            if (var2.field3321.method1585(arg0, -116)) {
                class125.field2192 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method1839(int arg0) {
        if (arg0 != 0) {
            method1840((byte) 65);
        }
        field4728 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static final void method1840(byte arg0) {
        field4729++;
        int var1 = class76.field1382.method783(class155.field2756);
        for (int var2 = 0; var2 < class186.field3266; var2++) {
            int var6 = class76.field1382.method783(class158.method1201(false, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class186.field3266 * 15 + 21;
        int var4 = class246.field4375 - (var1 / 2);
        int var5 = class61.field1178;
        if ((var1 + var4) > class180.field3155) {
            var4 = class180.field3155 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if ((var3 + var5) > class135.field2434) {
            var5 = class135.field2434 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (arg0 > -28) {
            field4722 = 51;
        }
        if (class176.field3083 != 1) {
            if (class246.field4375 != class225.field3886 || class92.field1657 != class61.field1178) {
                class270.field4777 = class92.field1657;
                class176.field3083 = 1;
                class194.field3495 = class225.field3886;
                return;
            }
            class176.field3083 = 0;
            class53.field920 = var1;
            class243.field4188 = true;
            class30.field555 = var4;
            class275.field4826 = var5;
            class218.field3759 = class186.field3266 * 15 + 22;
        } else if (class246.field4375 == class194.field3495 && class61.field1178 == class270.field4777) {
            class275.field4826 = var5;
            class30.field555 = var4;
            class218.field3759 = class186.field3266 * 15 + 22;
            class53.field920 = var1;
            class243.field4188 = true;
            class176.field3083 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public static final void method1841(boolean arg0) {
        if (arg0) {
            field4730 = -93;
        }
        field4727++;
        class183.field3208.method1122(10);
    }
}
