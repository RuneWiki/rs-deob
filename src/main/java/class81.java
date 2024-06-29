import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class81 extends class464 {

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field1146 = -1;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "[Z")
    public static boolean[] field1151 = new boolean[8];

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lvi;")
    public static class388 field1147;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 3)
    public static final void method507(int arg0) {
        field1145++;
        class5.field58 = arg0;
        class235.field3224 = 0;
        for (int var1 = 0; var1 < class449.field5867; var1++) {
            int var2 = class66.field867 * var1;
            for (int var3 = 0; var3 < class66.field867; var3++) {
                int var4 = var2 + var3;
                class465.field6034[var4].method3183(class65.field852 * var3, class422.field5550 * var1, class65.field852, class422.field5550, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 35)
    public final void method508(int arg0) {
        if (arg0 < 27) {
            field1147 = null;
        }
        field1148++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I", line = 45)
    public static final int method509(byte arg0) {
        field1149++;
        if (arg0 < 10) {
            return 79;
        } else {
            class536 var1 = class240.field3253;
            synchronized (class240.field3253) {
                return class240.field3253.method2922(0);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V", line = 58)
    public final void method510(OggPacket arg0, boolean arg1) {
        if (!arg1) {
            field1147 = null;
        }
        field1144++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBLuaa;)I", line = 69)
    public static final int method511(int arg0, byte arg1, class391 arg2) {
        field1150++;
        if (arg1 != 114) {
            return -108;
        } else if (!client.method2637(arg2).method2126(arg0, -1) && arg2.field5146 == null) {
            return -1;
        } else if (arg2.field5048 == null || arg2.field5048.length <= arg0) {
            return -1;
        } else {
            return arg2.field5048[arg0];
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 87)
    public class81(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V", line = 94)
    public static void method512(byte arg0) {
        if (arg0 == 55) {
            field1151 = null;
            field1147 = null;
        }
    }
}
