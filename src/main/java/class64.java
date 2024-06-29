import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class64 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "J")
    public static long field696 = 0L;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lea;")
    public static class547 field703 = new class547(8, 6);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        if (arg0 != 9811) {
            this.method492((byte) -66);
        }
        field699++;
        return (this.field695 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method490(byte arg0) {
        field703 = null;
        if (arg0 != 116) {
            field696 = 16L;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Z")
    public final boolean method491(byte arg0) {
        field701++;
        if (arg0 <= 119) {
            method490((byte) -66);
        }
        return (this.field695 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Z")
    public final boolean method492(byte arg0) {
        if (arg0 <= 42) {
            this.method492((byte) 70);
        }
        field702++;
        return (this.field695 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
    public final boolean method493(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field698++;
            return (this.field695 & 0x1) != 0;
        }
    }
}
