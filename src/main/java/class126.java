import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class126 extends class455 {

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "B")
    public byte field1723 = 5;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "Lfp;")
    public static class342 field1734;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "Z")
    public boolean field1728;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)V")
    public static void method895(byte arg0) {
        field1734 = null;
        if (arg0 != 5) {
            field1731 = -99;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)V")
    public static final void method896(boolean arg0) {
        field1732++;
        if (class444.field6399) {
            return;
        }
        class444.field6399 = true;
        class495.field6971 += (-class495.field6971 - 24.0F) / 2.0F;
        if (!arg0) {
            class7.field61 = true;
        }
    }
}
