import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class36 {

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "I")
    public static int field487 = 20;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "Lr;")
    public static class33 field496 = class29.method192(" ", (byte) 126);

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "Lr;")
    public static class33 field498 = class29.method192("Magic Shop", (byte) 126);

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "I")
    public static int field499 = 0;

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Lr;")
    public static class33 field488 = class29.method192("Sword Shop", (byte) 126);

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "J")
    public long field493;

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "Lt;")
    public class36 field492;

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "Lt;")
    public class36 field497;

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "[B")
    public static byte[] field491;

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "[B")
    public static byte[] field495;

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "[I")
    public static int[] field494;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)V", line = 15)
    public final void method245(byte arg0) {
        if (this.field497 == null) {
            return;
        }
        this.field497.field492 = this.field492;
        int var2 = -62 / ((arg0 + 32) / 54);
        this.field492.field497 = this.field497;
        this.field492 = null;
        this.field497 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 74)
    public static void method246(int arg0) {
        if (arg0 != 20) {
            field490 = -51;
        }
        field498 = null;
        field488 = null;
        field495 = null;
        field491 = null;
        field494 = null;
        field496 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 113)
    public static final void method247(int arg0) {
        if (arg0 != 0) {
            method247(27);
        }
        if (class29.field417 != null) {
            class14 var1 = class29.field417;
            synchronized (class29.field417) {
                class29.field417 = null;
            }
        }
    }
}
