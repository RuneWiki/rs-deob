import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class283 extends class13 {

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "Lce;")
    private static class126 field4705 = class206.method1445(-7923, "Walk here");

    @OriginalMember(owner = "client!fk", name = "ob", descriptor = "I")
    public static int field4715 = 1;

    @OriginalMember(owner = "client!fk", name = "pb", descriptor = "I")
    public static int field4716 = 64;

    @OriginalMember(owner = "client!fk", name = "nb", descriptor = "Lce;")
    public static class126 field4714 = field4705;

    @OriginalMember(owner = "client!fk", name = "fb", descriptor = "B")
    public byte field4706;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!fk", name = "hb", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!fk", name = "ib", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!fk", name = "lb", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!fk", name = "mb", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!fk", name = "qb", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!fk", name = "gb", descriptor = "Lbb;")
    public class134 field4707;

    @OriginalMember(owner = "client!fk", name = "kb", descriptor = "Lcc;")
    public static class313 field4711;

    @OriginalMember(owner = "client!fk", name = "jb", descriptor = "[[[I")
    public static int[][][] field4710;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method1890(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4717++;
        if (class29.field412 == 1) {
            class70.field1152[class296.field4933 / 100].method1333(class17.field239 - 8, class238.field4015 + -8);
        }
        if (class29.field412 == 2) {
            class70.field1152[class296.field4933 / 100 + 4].method1333(class17.field239 - 8, class238.field4015 + -8);
        }
        int var5 = 121 / ((arg2 - 5) / 34);
        class24.method117(-1);
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V", line = 28)
    public static final void method1891(int arg0) {
        class186.field3225 = null;
        class241.field4063 = null;
        field4704++;
        if (arg0 != 0) {
            method1892((byte) 51);
        }
        class41.field652 = null;
        class131.field2244 = null;
        class78.field1271 = null;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)I", line = 75)
    public final int method78(int arg0) {
        field4712++;
        if (arg0 != 0) {
            method1890(91, -126, 38, -16, 36);
        }
        return this.field4707 == null ? 0 : this.field4707.field2299 * 100 / (this.field4707.field2282.length - this.field4706);
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(B)V", line = 94)
    public static void method1892(byte arg0) {
        field4711 = null;
        field4710 = (int[][][]) null;
        field4705 = null;
        field4714 = null;
        int var1 = 67 % ((52 - arg0) / 56);
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V", line = 108)
    public static final void method1893(int arg0) {
        for (int var1 = arg0; var1 < class206.field3528; var1++) {
            int var2 = class139.field2526[var1];
            class301 var3 = class85.field1352[var2];
            int var4 = class227.field3834.method948(-121);
            if ((var4 & 0x80) != 0) {
                var4 += class227.field3834.method948(-124) << 8;
            }
            class160.method1174(-23138, var2, var4, var3);
        }
        field4702++;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)[B", line = 133)
    public final byte[] method77(int arg0) {
        field4708++;
        if (arg0 >= -115) {
            method1893(-93);
        }
        if (this.field176 || this.field4707.field2282.length - this.field4706 > this.field4707.field2299) {
            throw new RuntimeException();
        }
        return this.field4707.field2282;
    }
}
