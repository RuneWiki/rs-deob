import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class359 {

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lmja;")
    public static class441 field4463 = new class441("runescape", "RuneScape", 0);

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
    public static int[] field4467 = new int[1];

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field4466 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "B")
    public byte field4444;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "B")
    public byte field4445;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "B")
    public byte field4449;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "B")
    public byte field4453;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "B")
    public byte field4458;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "B")
    public byte field4459;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "B")
    public byte field4462;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public int field4450;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "S")
    public short field4448;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Z")
    public boolean field4447;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Z")
    public boolean field4451;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Z")
    public boolean field4452;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Z")
    public boolean field4455;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Z")
    public boolean field4460;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Z")
    public boolean field4461;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Z")
    public boolean field4464;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Z")
    public boolean field4465;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[I")
    public static int[] field4454;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Ljava/lang/String;", line = 4)
    public static final String method2100(int arg0, int arg1) {
        field4446++;
        int var2 = 43 % ((29 - arg1) / 36);
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF3657) >> 16) + "." + ((arg0 & 0xFF27) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 26)
    public static void method2101(int arg0) {
        field4467 = null;
        field4463 = null;
        if (arg0 >= -109) {
            method2101(-48);
        }
        field4454 = null;
    }
}
