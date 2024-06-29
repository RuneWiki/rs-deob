import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class130 {

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Lhd;")
    public static class595 field1767 = new class595();

    @OriginalMember(owner = "client!um", name = "d", descriptor = "F")
    public static float field1770;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IJ)I", line = 4)
    public final int method828(int arg0, long arg1) {
        field1769++;
        long var4 = this.method756((byte) 117);
        if (arg0 != 35140984) {
            method829(-93, false);
        }
        if (var4 > 0L) {
            class740.method4124(var4, 88);
        }
        return this.method754(arg1, 255);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 25)
    public static final String method829(int arg0, boolean arg1) {
        if (arg1) {
            method829(103, true);
        }
        field1768++;
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V", line = 38)
    public static void method830(byte arg0) {
        field1767 = null;
        if (arg0 != -19) {
            method830((byte) 52);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public abstract void method757(int arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)J")
    public abstract long method756(byte arg0);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(JI)I")
    public abstract int method754(long arg0, int arg1);

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)J")
    public abstract long method755(int arg0);
}
