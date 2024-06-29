import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class133 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2842 = new CRC32();

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field2847 = -1;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Ldd;")
    public static class35 field2846 = class180.method1196((byte) -78, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Ldd;")
    public static class35 field2848 = class180.method1196((byte) 126, "<col=40ff00>");

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[[I")
    public static int[][] field2844;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lfd;II)Ldd;")
    public static final class35 method908(class55 arg0, int arg1, int arg2) {
        field2845++;
        if (!class49.method435(0, arg2, class59.method508(arg0, (byte) 32)) && arg0.field1356 == null) {
            return null;
        }
        if (arg1 != 28039) {
            method908(null, -75, -80);
        }
        if (arg0.field1359 == null || arg0.field1359.length <= arg2 || arg0.field1359[arg2] == null || arg0.field1359[arg2].method340(20).method347((byte) -96) == 0) {
            return class207.field4117 ? class63.method529(new class35[] { class36.field800, class3.method19(arg2, -29578) }, (byte) 97) : null;
        } else {
            return arg0.field1359[arg2];
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method909(byte arg0) {
        int var1 = 91 % ((-arg0 - 52) / 37);
        field2846 = null;
        field2842 = null;
        field2844 = null;
        field2848 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
    public abstract void method910(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
    public abstract void method911(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(III)V")
    public abstract void method912(int arg0, int arg1, int arg2);
}
