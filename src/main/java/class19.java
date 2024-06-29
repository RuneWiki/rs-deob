import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class19 {

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "I")
    public static int field292 = 50;

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "I")
    public static int field294 = 0;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Lh;")
    public static class15 field293 = class26.method190(true, "Slayer Master");

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "J")
    public static long field295;

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Lo;")
    public static class28 field296;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Z)V", line = 6)
    public static void method159(boolean arg0) {
        field296 = null;
        if (!arg0) {
            field292 = 116;
        }
        field293 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Lh;Lh;ILaa;)Lea;", line = 60)
    public static final class10 method160(class15 arg0, class15 arg1, int arg2, class2 arg3) {
        if (arg2 == 0) {
            int var4 = arg3.method43(arg0, (byte) 45);
            int var5 = arg3.method38(arg1, var4, 3);
            return class33.method233(arg3, var5, false, var4);
        } else {
            return (class10) null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)Z", line = 82)
    public static final boolean method161(int arg0) {
        if (arg0 != 14453) {
            field293 = null;
        }
        class21 var1 = class26.field354;
        synchronized (class26.field354) {
            if (class6.field134 == class17.field274) {
                return false;
            } else {
                class2.field91 = class28.field383[class6.field134];
                class36.field458 = class14.field239[class6.field134];
                class6.field134 = class6.field134 + 1 & 0x7F;
                return true;
            }
        }
    }
}
