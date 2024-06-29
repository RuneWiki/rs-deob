import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 extends class16 {

    @OriginalMember(owner = "mapview!oa", name = "o", descriptor = "I")
    public static int field388 = 1;

    @OriginalMember(owner = "mapview!oa", name = "r", descriptor = "Z")
    public static boolean field391 = true;

    @OriginalMember(owner = "mapview!oa", name = "u", descriptor = "Lh;")
    public static class15 field394 = class26.method190(true, "Mace Shop");

    @OriginalMember(owner = "mapview!oa", name = "w", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "mapview!oa", name = "y", descriptor = "Lh;")
    public static class15 field398 = class26.method190(true, "???");

    @OriginalMember(owner = "mapview!oa", name = "x", descriptor = "Lh;")
    public static class15 field397 = class26.method190(true, "labels)3dat");

    @OriginalMember(owner = "mapview!oa", name = "s", descriptor = "Lh;")
    public static class15 field392 = class26.method190(true, "Clothes Shop");

    @OriginalMember(owner = "mapview!oa", name = "B", descriptor = "[[B")
    public static byte[][] field401 = new byte[50][];

    @OriginalMember(owner = "mapview!oa", name = "A", descriptor = "Lh;")
    public static class15 field400 = class26.method190(true, "null");

    @OriginalMember(owner = "mapview!oa", name = "v", descriptor = "I")
    public static int field395 = -1;

    @OriginalMember(owner = "mapview!oa", name = "n", descriptor = "Lh;")
    public static class15 field387 = class26.method190(true, "Agility Training");

    @OriginalMember(owner = "mapview!oa", name = "q", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field390;

    @OriginalMember(owner = "mapview!oa", name = "t", descriptor = "Ljava/lang/String;")
    public static String field393;

    @OriginalMember(owner = "mapview!oa", name = "p", descriptor = "[B")
    public static byte[] field389;

    @OriginalMember(owner = "mapview!oa", name = "z", descriptor = "[I")
    public static int[] field399;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(I)Lea;", line = 6)
    public static final class10 method206(int arg0) {
        class10 var1 = new class10(class2.field87, class16.field261, field399, class16.field269, class6.field130);
        class4.method58(121);
        if (arg0 != -1) {
            method207(32);
        }
        return var1;
    }

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(I)V", line = 62)
    public static void method207(int arg0) {
        field393 = null;
        field399 = null;
        field400 = null;
        if (arg0 <= 47) {
            field396 = -72;
        }
        field389 = null;
        field401 = null;
        field387 = null;
        field397 = null;
        field392 = null;
        field394 = null;
        field398 = null;
        field390 = null;
    }
}
