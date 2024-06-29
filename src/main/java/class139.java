import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class139 {

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1796;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "B")
    public byte field1785;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "B")
    public byte field1787;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "B")
    public byte field1788;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "B")
    public byte field1789;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "B")
    public byte field1790;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "B")
    public byte field1791;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "B")
    public byte field1794;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "S")
    public short field1795;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Z")
    public boolean field1773;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Z")
    public boolean field1775;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Z")
    public boolean field1777;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Z")
    public boolean field1778;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Z")
    public boolean field1779;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Z")
    public boolean field1780;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Z")
    public boolean field1783;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Z")
    public boolean field1784;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "Z")
    public boolean field1793;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Z")
    public static final boolean method944(int arg0, int arg1, int arg2) {
        field1792++;
        if (arg2 <= 98) {
            return true;
        } else {
            return (arg0 & 0x22) != 0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
    public static final int method945(byte arg0) {
        int var1 = 122 / ((-arg0 - 86) / 32);
        field1776++;
        return 16;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method946(int arg0) {
        int var1 = 122 / ((arg0 - 35) / 45);
        field1774++;
        if (class347.field4463 != null) {
            class347.field4463.method75((byte) 47);
        }
        if (class407.field5820 != null) {
            class407.field5820.method75((byte) -31);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public static void method947(boolean arg0) {
        field1796 = null;
        if (arg0) {
            method946(91);
        }
    }

    static {
        new class335("Ok", "Okay", "OK", "Ok");
        field1796 = "";
    }
}
