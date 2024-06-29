import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class class79 extends class271 {

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "Lri;")
    public static class73 field1190 = new class73(90, -2);

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "[[Z")
    public static boolean[][] field1194 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field1195 = 0;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "Lki;")
    public static class498 field1193 = new class498(9, 12);

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Z")
    public abstract boolean method141(byte arg0);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method464(int arg0) {
        field1194 = null;
        field1190 = null;
        field1193 = null;
        if (arg0 != -31305) {
            method464(90);
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method142(byte arg0);

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V")
    public class79(int arg0) {
        this.field1191 = arg0;
    }
}
