import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class178 extends class28 {

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field3178 = 0;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "Lvf;")
    public static class265 field3176 = class87.method582(-46, "<col=ff3000>");

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "Lvf;")
    public static class265 field3180 = class87.method582(-46, "Module texte charg-B");

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "Lvf;")
    public class265 field3181;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "[[Lgk;")
    public static class6[][] field3174;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lde;")
    public static final class51 method1156(Throwable arg0, String arg1) {
        ++field3177;
        class51 var2;
        if (arg0 instanceof class51) {
            var2 = (class51) arg0;
            var2.field1076 = var2.field1076 + ' ' + arg1;
        } else {
            var2 = new class51(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I")
    public final int method1157(int arg0) {
        if (arg0 != -2265) {
            this.method1162(true);
        }
        ++field3166;
        return (int) super.field393;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
    public static void method1158(int arg0) {
        field3176 = null;
        if (arg0 == 255) {
            field3174 = null;
            field3180 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)I")
    public final int method1159(int arg0) {
        if (arg0 != 255) {
            this.field3170 = -127;
        }
        ++field3173;
        return (int) (255L & super.field393 >>> 32);
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
    public final void method1160(int arg0) {
        super.field727 = class136.method950(8954) - -500L | super.field727 & Long.MIN_VALUE;
        if (arg0 <= 111) {
            this.method1160(-89);
        }
        class1.field13.method1154(this, -31849);
        ++field3167;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)J")
    public final long method1161(byte arg0) {
        ++field3175;
        return arg0 != 120 ? -124L : super.field727 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public final void method1162(boolean arg0) {
        super.field727 |= Long.MIN_VALUE;
        if (!arg0) {
            this.field3172 = 104;
        }
        ++field3179;
        if (this.method1161((byte) 120) == 0L) {
            class186.field3366.method1154(this, -31849);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B[B)Z")
    public static final boolean method1163(byte arg0, byte[] arg1) {
        ++field3169;
        class135 var2 = new class135(arg1);
        int var3 = var2.method920((byte) 87);
        if (var3 != 1) {
            return false;
        } else {
            if (arg0 != 48) {
                method1156((Throwable) null, (String) null);
            }
            boolean var4 = var2.method920((byte) 80) == 1;
            if (var4) {
                class244.method1627(-51, var2);
            }
            class158.method1060(var2, 90);
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
    public class178(int arg0, int arg1) {
        super.field393 = (long) arg1 | (long) arg0 << 32;
    }
}
