import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class31 {

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "I")
    public static int field428 = 500;

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Z")
    public static boolean field424 = false;

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Lea;")
    public static class10 field429 = class3.method8("Archery Shop", -85);

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Lea;")
    public static class10 field430 = class3.method8("Agility Training", -12);

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lea;")
    public static class10 field425 = class3.method8("Platelegs Shop", 92);

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "Lea;")
    public static class10 field431 = class3.method8("Prev page", 116);

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "I")
    public static int field432 = 20;

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "Lea;")
    public static class10 field433 = class3.method8("fonts", 103);

    @OriginalMember(owner = "mapview!q", name = "m", descriptor = "Lea;")
    public static class10 field435 = class3.method8("Windmill", 111);

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "J")
    public long field426;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "Lq;")
    public class31 field423;

    @OriginalMember(owner = "mapview!q", name = "l", descriptor = "Lq;")
    public class31 field434;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(JI)V", line = 10)
    public static final void method220(long arg0, int arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class19.method134(255, arg0 - 1L);
            class19.method134(255, 1L);
        } else {
            class19.method134(255, arg0);
        }
        if (arg1 != -17164) {
            method221(true);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Z)B", line = 36)
    public static final byte method221(boolean arg0) {
        if (!arg0) {
            field431 = null;
        }
        return class40.field513 == null ? 0 : class40.field513[class22.field238];
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 77)
    public final void method222(int arg0) {
        if (this.field434 == null) {
            return;
        }
        this.field434.field423 = this.field423;
        this.field423.field434 = this.field434;
        this.field434 = null;
        if (arg0 >= 31) {
            this.field423 = null;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 117)
    public static void method223(byte arg0) {
        field431 = null;
        field433 = null;
        field429 = null;
        field435 = null;
        field430 = null;
        field425 = null;
        if (arg0 > -31) {
            field428 = 52;
        }
    }
}
