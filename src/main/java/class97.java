import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 {

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[Lod;")
    public static class101[] field2106 = new class101[8];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lod;")
    public static class101 field2097 = class46.method335(-81, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2110 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2099 = new CRC32();

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lod;")
    public static class101 field2111 = class46.method335(120, "::fpson");

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lt;")
    public static class132 field2103;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "[[S")
    public static short[][] field2112;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)V")
    public static final void method674(byte arg0, int arg1) {
        class130 var2 = (class130) class93.field1999.method1141((long) arg1, -1);
        if (arg0 >= -58) {
            field2097 = null;
        }
        field2105++;
        if (var2 != null) {
            var2.method959(11835);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method675(int arg0) {
        field2112 = null;
        field2097 = null;
        field2103 = null;
        field2111 = null;
        if (arg0 != 25032) {
            method677(28, null, -86, 42);
        }
        field2106 = null;
        field2099 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLc;)V")
    public static final void method676(byte arg0, class15 arg1) {
        field2098++;
        class65.field1484 = arg1;
        if (arg0 != -122) {
            method678(-11, -105);
        }
        class154.field3509 = class65.field1484.method112(16, 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILc;II)[Lrd;")
    public static final class122[] method677(int arg0, class15 arg1, int arg2, int arg3) {
        field2104++;
        if (class134.method1038(arg3, arg2, arg1, 2001)) {
            return arg0 == 5424 ? class41.method311((byte) 123) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lod;")
    public static final class101 method678(int arg0, int arg1) {
        field2102++;
        if (arg0 < 100000) {
            return class15.method101(-5, new class101[] { class23.field533, class82.method592(false, arg0), class46.field1097 });
        } else {
            if (arg1 != 0) {
                method678(58, -7);
            }
            return arg0 < 10000000 ? class15.method101(-100, new class101[] { class153.field3481, class82.method592(false, arg0 / 1000), class112.field2399, class46.field1097 }) : class15.method101(84, new class101[] { class144.field3328, class82.method592(false, arg0 / 1000000), class129.field2946, class46.field1097 });
        }
    }
}
