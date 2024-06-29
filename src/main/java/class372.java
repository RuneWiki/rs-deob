import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public abstract class class372 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public int field5325;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public int field5327;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field5330;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[I")
    public static int[] field5326;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[Lnn;")
    public static class249[] field5331;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Z", line = 7)
    public final boolean method2246(boolean arg0) {
        if (arg0) {
            field5323++;
            return (this.field5327 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2247(int arg0) {
        if (arg0 == -24102) {
            field5329++;
            class41.field502.method236(arg0 ^ 0xFFFFA1D9);
            class388.field5549.method2864(551432450);
            class183.field2358.method2864(551432450);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 31)
    public static void method2248(int arg0) {
        field5326 = null;
        if (arg0 < -22) {
            field5331 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V", line = 49)
    public static final void method2249(int arg0, int arg1) {
        field5328++;
        class218.field3070.method1166(arg0, (byte) -52);
        class481.field6801.method1166(arg0, (byte) -52);
        class463.field6522.method1166(arg0, (byte) -52);
        class280.field4077.method1166(arg0, (byte) -52);
        class218.field3073.method1166(arg0, (byte) -52);
        if (arg1 != 0) {
            method2247(-7);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z", line = 64)
    public final boolean method2250(int arg0) {
        if (arg0 != 4) {
            this.field5327 = 23;
        }
        field5322++;
        return (this.field5327 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z", line = 79)
    public final boolean method2251(byte arg0) {
        field5321++;
        int var2 = 111 / (-arg0 / 44);
        return (this.field5327 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Z", line = 89)
    public final boolean method2252(int arg0) {
        field5320++;
        if (arg0 == 1) {
            return (this.field5327 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
