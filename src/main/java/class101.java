import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class101 extends class28 {

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Lrw;")
    public static class535 field1229 = new class535(128);

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "F")
    public static float field1224;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "[I")
    public int[] field1222;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "[I")
    public int[] field1227;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "[I")
    public int[] field1231;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "[Lrp;")
    public class280[] field1225;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "[Lrp;")
    public class280[] field1230;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "[[[B")
    public byte[][][] field1232;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public static void method548(byte arg0) {
        int var1 = 98 / ((arg0 - 11) / 51);
        field1229 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)Lvu;")
    public static final class184 method549(boolean arg0) {
        field1226++;
        class184 var1 = (class184) class267.field3664.method2219((byte) -85);
        if (!arg0) {
            field1224 = -2.5762117F;
        }
        if (var1 == null) {
            return new class184();
        } else {
            class597.field8172--;
            return var1;
        }
    }
}
