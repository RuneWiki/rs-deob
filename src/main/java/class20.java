import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class20 extends RuntimeException {

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Ljava/lang/String;")
    public String field171;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field173;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Lt;")
    public static class31 field175 = class14.method84(110, "POH Portal");

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Lt;")
    public static class31 field172 = class14.method84(114, "Gem Shop");

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "I")
    public static int field178 = 0;

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "[I")
    public static int[] field179 = new int[128];

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "I")
    public static int field176 = 0;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "I")
    public static int field174 = 1;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "Lt;")
    public static class31 field183 = class14.method84(124, "[red]Number of functions exceeded)3 Increase MAX_FUNCTIONS)3");

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Li;")
    public static class16 field177;

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field180;

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "[I")
    public static int[] field182;

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 44)
    public class20(Throwable arg0, String arg1) {
        this.field171 = arg1;
        this.field173 = arg0;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 62)
    public static void method118(byte arg0) {
        field177 = null;
        field183 = null;
        int var1 = 106 % ((arg0 + 4) / 55);
        field172 = null;
        field182 = null;
        field175 = null;
        field180 = null;
        field179 = null;
    }
}
