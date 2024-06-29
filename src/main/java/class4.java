import java.awt.FontMetrics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 extends RuntimeException {

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Ljava/lang/String;")
    public String field34;

    @OriginalMember(owner = "mapview!ba", name = "k", descriptor = "Ljava/lang/Throwable;")
    public Throwable field38;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Lt;")
    public static class36 field30 = class3.method8(13631, "100(U");

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Lt;")
    public static class36 field31 = class3.method8(13631, "Saw Mill");

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Z")
    public static volatile boolean field33 = true;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "[Z")
    public static boolean[] field32 = new boolean[112];

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Lt;")
    public static class36 field37 = class3.method8(13631, "Summoning Store");

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "Lt;")
    public static class36 field36 = class3.method8(13631, "Crafting Shop");

    @OriginalMember(owner = "mapview!ba", name = "n", descriptor = "Lt;")
    public static class36 field41 = class3.method8(13631, "Combat Training");

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Lt;")
    public static class36 field35 = class3.method8(13631, "Enter place name to find");

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "Lt;")
    public static class36 field40 = class3.method8(13631, "");

    @OriginalMember(owner = "mapview!ba", name = "o", descriptor = "Lt;")
    public static class36 field42 = class3.method8(13631, "General Store");

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field28;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field29;

    @OriginalMember(owner = "mapview!ba", name = "l", descriptor = "[[Lw;")
    public static class41[][] field39;

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 53)
    public class4(Throwable arg0, String arg1) {
        this.field34 = arg1;
        this.field38 = arg0;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)V", line = 64)
    public static void method9(byte arg0) {
        int var1 = 94 / ((2 - arg0) / 62);
        field32 = null;
        field37 = null;
        field42 = null;
        field36 = null;
        field28 = null;
        field29 = null;
        field39 = null;
        field30 = null;
        field40 = null;
        field31 = null;
        field41 = null;
        field35 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)B", line = 89)
    public static final byte method10(int arg0) {
        if (arg0 == 0) {
            return class35.field487 == null ? 0 : class35.field487[class6.field65];
        } else {
            return 78;
        }
    }
}
