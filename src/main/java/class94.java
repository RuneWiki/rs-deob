import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class94 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[[[B")
    public static byte[][][] field1653 = new byte[4][104][104];

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Loh;")
    public static class258 field1655 = class153.method1046("<col=c0ff00>", 119);

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1654 = 100;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Loh;")
    public static class258 field1652 = class153.method1046(":assistreq:", 94);

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Loh;")
    public static class258 field1657 = class153.method1046("<br>", 91);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lgb;")
    public static class213 field1656;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 9)
    public static void method693(byte arg0) {
        int var1 = 2 / ((arg0 + 12) / 44);
        field1655 = null;
        field1657 = null;
        field1656 = null;
        field1652 = null;
        field1653 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 25)
    public static final void method694(int arg0) {
        class45.method375((byte) -128);
        System.gc();
        if (arg0 == 25033) {
            class106.method791((byte) 8, 25);
            field1651++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILvd;)Lvd;")
    public abstract class280 method109(int arg0, class280 arg1);
}
