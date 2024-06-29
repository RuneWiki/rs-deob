import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class246 extends class226 {

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Ljd;")
    public static class86 field4380 = class122.method868("W-=hlen Sie eine Option", true);

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "[Ljd;")
    public static class86[] field4374 = new class86[1000];

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "[I")
    public static int[] field4375 = new int[50];

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "B")
    public byte field4381;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Lqk;")
    public class200 field4373;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "Lre;")
    public static class212 field4376;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
    public static void method1669(byte arg0) {
        field4380 = null;
        field4376 = null;
        field4375 = null;
        field4374 = null;
        int var1 = 36 % ((-41 - arg0) / 61);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)I")
    public final int method202(byte arg0) {
        int var2 = -92 % ((arg0 - 1) / 43);
        ++field4379;
        return this.field4373 == null ? 0 : this.field4373.field3565 * 100 / (this.field4373.field3547.length + -this.field4381);
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
    public static final void method1670(byte arg0) {
        ++field4378;
        class263.field4665.method702((byte) -88);
        if (arg0 < 96) {
            field4375 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    public static final void method1671(int arg0) {
        ++field4384;
        if (arg0 != 1000) {
            method1670((byte) -50);
        }
        class81.field1592.method702((byte) -88);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)[B")
    public final byte[] method199(byte arg0) {
        ++field4382;
        if (arg0 != 36) {
            return null;
        } else if (!super.field4099 && ~this.field4373.field3565 <= ~(this.field4373.field3547.length + -this.field4381)) {
            return this.field4373.field3547;
        } else {
            throw new RuntimeException();
        }
    }
}
