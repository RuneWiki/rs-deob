import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class68 extends class633 {

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "Lgca;")
    public static class227 field920 = new class227();

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "Z")
    public static boolean field926 = false;

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "Llh;")
    public static class487 field925 = new class487(19, -1);

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "Lsp;")
    public class589 field927;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "[B")
    public byte[] field923;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)I")
    public final int method569(byte arg0) {
        ++field921;
        int var2 = -17 % ((arg0 - -67) / 49);
        return super.field8762 ? 0 : 100;
    }

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "(I)V")
    public static void method570(int arg0) {
        field920 = null;
        if (arg0 != 0) {
            field920 = null;
        }
        field925 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)Z")
    public static final boolean method571(int arg0, int arg1, int arg2) {
        ++field919;
        if (!class541.field7327) {
            return false;
        } else {
            int var3 = arg2 >> 16;
            int var4 = arg2 & 65535;
            if (arg1 != 5) {
                method571(-74, 72, -13);
            }
            if (class167.field2439[var3] != null && class167.field2439[var3][var4] != null) {
                class78 var5 = class167.field2439[var3][var4];
                if (~arg0 == 0 && var5.field1075 == 0) {
                    for (class499 var6 = (class499) class588.field8265.method1436(28964); var6 != null; var6 = (class499) class588.field8265.method1443((byte) 6)) {
                        if (~var6.field6780 == -46 || var6.field6780 == 1011 || var6.field6780 == 2 || var6.field6780 == 5 || var6.field6780 == 20) {
                            for (class78 var7 = class582.method3319((byte) -100, var6.field6783); var7 != null; var7 = class474.method2673((byte) -123, var7)) {
                                if (~var5.field1129 == ~var7.field1129) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class499 var8 = (class499) class588.field8265.method1436(28964); var8 != null; var8 = (class499) class588.field8265.method1443((byte) 6)) {
                        if (var8.field6775 == arg0 && ~var5.field1129 == ~var8.field6783 && (~var8.field6780 == -46 || var8.field6780 == 1011 || var8.field6780 == 2 || ~var8.field6780 == -6 || var8.field6780 == 20)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)[B")
    public final byte[] method572(int arg0) {
        ++field918;
        if (super.field8762) {
            throw new RuntimeException();
        } else {
            return arg0 < 103 ? null : this.field923;
        }
    }
}
