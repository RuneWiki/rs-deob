import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class122 extends class139 {

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field1779 = 0;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Lh;")
    public static class278 field1776;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "Ljava/lang/String;")
    public String field1790;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "[I")
    public int[] field1781;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "[I")
    public int[] field1791;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "[Lnj;")
    public class144[] field1780;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1778;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "[[[B")
    public static byte[][][] field1784;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLbe;)I")
    public static final int method889(byte arg0, class29 arg1) {
        field1777++;
        if (arg0 != -34) {
            return 36;
        }
        int var2 = arg1.field349;
        class235 var3 = arg1.method917((byte) 119);
        if (arg1.field1966 == var3.field3760) {
            var2 = arg1.field356;
        } else if (arg1.field1966 == var3.field3783 || arg1.field1966 == var3.field3785 || arg1.field1966 == var3.field3793 || arg1.field1966 == var3.field3789) {
            var2 = arg1.field354;
        } else if (arg1.field1966 == var3.field3759 || arg1.field1966 == var3.field3767 || arg1.field1966 == var3.field3774 || arg1.field1966 == var3.field3770) {
            var2 = arg1.field365;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
    public static void method890(int arg0) {
        field1784 = null;
        if (arg0 >= -83) {
            method891(-126, (byte) 123);
        }
        field1776 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Lqi;")
    public static final class131 method891(int arg0, byte arg1) {
        field1782++;
        if (arg1 >= -120) {
            field1776 = null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class113.field1631[var2] == null || class113.field1631[var2][var3] == null) {
            boolean var4 = class184.method1364(var2, (byte) 78);
            if (!var4) {
                return null;
            }
        }
        return class113.field1631[var2][var3];
    }
}
