import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class97 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field1712 = -1;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field1719 = -1;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1711 = 0;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[Lve;")
    public static class278[] field1715 = new class278[2048];

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    public static int[] field1713;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[I")
    public int[] field1717;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[[[B")
    public static byte[][][] field1721;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILag;)V", line = 15)
    public final void method640(int arg0, int arg1, class202 arg2) {
        if (arg0 < 109) {
            this.method640(45, -66, (class202) null);
        }
        field1716++;
        while (true) {
            int var4 = arg2.method1317((byte) -114);
            if (var4 == 0) {
                return;
            }
            this.method642(var4, arg2, arg1, 2048);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 35)
    public static void method641(boolean arg0) {
        if (!arg0) {
            field1711 = 92;
        }
        field1721 = (byte[][][]) null;
        field1713 = null;
        field1715 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILag;II)V", line = 47)
    private final void method642(int arg0, class202 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field1712 = arg1.method1315(arg3 + 12241);
        } else if (arg0 == 2) {
            this.field1717 = new int[arg1.method1317((byte) -72)];
            for (int var5 = 0; var5 < this.field1717.length; var5++) {
                this.field1717[var5] = arg1.method1315(14289);
            }
        } else if (arg0 == 3) {
            this.field1719 = arg1.method1317((byte) -126);
        }
        if (arg3 == 2048) {
            field1723++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)I", line = 86)
    public static final int method643(int arg0, int arg1, int arg2) {
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        int var4 = -7 % ((arg2 - 59) / 56);
        field1718++;
        while (arg0 != 0) {
            int var5 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var5;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 124)
    public static final void method644(byte arg0) {
        class254.field3968 = (byte[][]) null;
        field1714++;
        class80.field1572 = null;
        if (arg0 >= 73) {
            class27.field530 = null;
            class274.field4202 = null;
            class176.field2833 = null;
            class28.field537 = null;
        }
    }
}
