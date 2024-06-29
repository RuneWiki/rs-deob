import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class439 implements class255 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field6164;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lut;")
    public static class664 field6165 = new class664(64);

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lpg;")
    public static class711 field6167;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2592(int arg0, int arg1, int arg2) {
        field6166++;
        if (arg0 > -60) {
            field6167 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V", line = 16)
    public class439(int arg0) {
        this.field6164 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V", line = 31)
    public static void method2593(boolean arg0) {
        field6165 = null;
        field6167 = null;
        if (!arg0) {
            method2593(true);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)Lqi;", line = 43)
    public final class669 method271(boolean arg0) {
        if (arg0) {
            method2593(true);
        }
        field6168++;
        return class480.field6848;
    }
}
