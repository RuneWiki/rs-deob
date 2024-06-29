import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class231 {

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Z")
    public boolean field4120 = true;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lsg;")
    public static class30 field4099 = class167.method1221((byte) 33, "<col=00ff00>");

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lsg;")
    public static class30 field4106 = class167.method1221((byte) 33, "<col=ffffff>");

    @OriginalMember(owner = "client!re", name = "k", descriptor = "[I")
    public static int[] field4108 = new int[500];

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lsg;")
    public static class30 field4107 = class167.method1221((byte) 33, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field4109 = 1;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lsg;")
    public static class30 field4117 = class167.method1221((byte) 33, "Hidden)2");

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[I")
    public static int[] field4118 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lsg;")
    public static class30 field4116 = class167.method1221((byte) 33, ")2");

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lsg;")
    public static class30 field4119 = class167.method1221((byte) 33, "_labels");

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lsg;")
    public static class30 field4113 = class167.method1221((byte) 33, ")2");

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[[[B")
    public static byte[][][] field4111;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILdl;I)V")
    public static final void method1637(int arg0, int arg1, class31 arg2, int arg3) {
        field4104++;
        if (class166.field3053 != null || class94.field1890 || arg2 == null || class99.method809(94, arg2) == null) {
            return;
        }
        class166.field3053 = arg2;
        if (arg0 >= -93) {
            method1638(-15);
        }
        class172.field3212 = class99.method809(89, arg2);
        class77.field1687 = arg1;
        class119.field2321 = 0;
        class138.field2711 = false;
        class64.field1420 = arg3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method1638(int arg0) {
        class259.field4572 = new class31[class236.field4213.method1108((byte) 19)][];
        field4098++;
        class82.field1750 = new boolean[class236.field4213.method1108((byte) 19)];
        if (arg0 != 7) {
            field4099 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method1639(byte arg0) {
        field4102++;
        class31.field784.method1650(87);
        if (arg0 != -117) {
            field4106 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1640(int arg0) {
        field4113 = null;
        if (arg0 != 8) {
            return;
        }
        field4117 = null;
        field4106 = null;
        field4111 = null;
        field4107 = null;
        field4099 = null;
        field4118 = null;
        field4119 = null;
        field4108 = null;
        field4116 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Lai;")
    public static final class103 method1641(boolean arg0) {
        if (arg0) {
            return null;
        }
        field4101++;
        try {
            return (class103) Class.forName("sa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class60();
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4110 = arg3;
        this.field4105 = arg1;
        this.field4112 = arg2;
        this.field4103 = arg0;
        this.field4120 = arg6;
        this.field4115 = arg5;
        this.field4114 = arg4;
    }
}
