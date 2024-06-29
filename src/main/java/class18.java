import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 {

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lf;")
    public static class10 field163 = class23.method139("Short)2cut", (byte) -113);

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "I")
    public static int field160 = 0;

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "Z")
    public static boolean field165 = false;

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "[I")
    public static int[] field166 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Lf;")
    public static class10 field164 = class23.method139("Requesting", (byte) -91);

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "Z")
    public static volatile boolean field167 = false;

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Lf;")
    public static class10 field170 = class23.method139("Estate Agent", (byte) -60);

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "Lf;")
    public static class10 field171 = class23.method139("Guide", (byte) -116);

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "Lf;")
    public static class10 field172 = class23.method139("Suchen", (byte) -99);

    @OriginalMember(owner = "mapview!j", name = "n", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field169;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Lo;[BB)V", line = 17)
    public final void method111(class28 arg0, byte[] arg1, byte arg2) {
        if (arg0.field392[arg0.field389] != 31 || arg0.field392[arg0.field389 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field169 == null) {
            this.field169 = new Inflater(true);
        }
        if (arg2 <= 49) {
            field162 = -7;
        }
        try {
            this.field169.setInput(arg0.field392, arg0.field389 + 10, arg0.field392.length + -10 + -arg0.field389 + -8);
            this.field169.inflate(arg1);
        } catch (Exception var5) {
            this.field169.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field169.reset();
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 48)
    public static void method112(int arg0) {
        field163 = null;
        field171 = null;
        field166 = null;
        field164 = null;
        field170 = null;
        field172 = null;
        if (arg0 != -1) {
            field172 = null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "()V", line = 78)
    public class18() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)V", line = 105)
    public static final void method113(int arg0) {
        if (arg0 != -1) {
            return;
        }
        class33.field470 = null;
        class41.field539 = null;
        class31.field425 = null;
        class35.field490 = null;
        class19.field180 = null;
        class1.field10 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(III)V", line = 123)
    private class18(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(I)B", line = 139)
    public static final byte method114(int arg0) {
        if (arg0 < 72) {
            return 66;
        } else if (class15.field140 == null) {
            return 0;
        } else {
            return class15.field140[class41.field538];
        }
    }
}
