import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class92 extends class72 {

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field1373 = 0;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "[[B")
    public static byte[][] field1374 = new byte[50][];

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "[Z")
    public static boolean[] field1371 = new boolean[100];

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "Lla;")
    public static class422 field1375;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Llr;")
    public static class745 field1376;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V", line = 26)
    public static void method774(int arg0) {
        field1371 = null;
        field1374 = null;
        field1376 = null;
        int var1 = -59 / ((arg0 - 49) / 48);
        field1375 = null;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Lqn;")
    public abstract class295 method773(int arg0);
}
