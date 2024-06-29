import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class8 {

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "Z")
    public static boolean field78 = true;

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "Lt;")
    public static class36 field79 = class3.method8(13631, "Pub)4Bar");

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "Lt;")
    public static class36 field85 = class3.method8(13631, "???");

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "Lt;")
    public static class36 field82 = class3.method8(13631, "Apothecary");

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "Lt;")
    public static class36 field80 = class3.method8(13631, "Next page");

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "Lt;")
    public static class36 field81 = class3.method8(13631, "Farming shop");

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "Lt;")
    public static class36 field86 = class3.method8(13631, "download");

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "Lt;")
    public static class36 field84 = class3.method8(13631, "Requesting");

    @OriginalMember(owner = "mapview!e", name = "l", descriptor = "[[[[B")
    public static byte[][][][] field88 = new byte[5][][][];

    @OriginalMember(owner = "mapview!e", name = "k", descriptor = "Lt;")
    public static class36 field87 = class3.method8(13631, "Furnace");

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "Lt;")
    public static class36 field83 = class3.method8(13631, "loc)3dat");

    @OriginalMember(owner = "mapview!e", name = "m", descriptor = "Lw;")
    public static class41 field89;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field77;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)V", line = 67)
    public static void method34(int arg0) {
        field89 = null;
        field79 = null;
        field77 = null;
        field86 = null;
        field82 = null;
        field85 = null;
        field88 = null;
        field81 = null;
        if (arg0 < -122) {
            field87 = null;
            field84 = null;
            field80 = null;
            field83 = null;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Lk;III)[Lq;", line = 92)
    public static final class30[] method35(class19 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 95) {
            return (class30[]) null;
        } else if (class41.method265(arg3, arg1, (byte) 75, arg0)) {
            return class7.method30(true);
        } else {
            return null;
        }
    }
}
