import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class40 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[I")
    public static int[] field468 = null;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "B")
    public byte field473;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lhd;")
    public static class346 field464;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lgga;")
    public static class513 field467;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lot;")
    public static class746 field466;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Ljava/lang/String;")
    public String field470;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[B")
    public static byte[] field471;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 6)
    public static void method297(byte arg0) {
        if (arg0 != -14) {
            return;
        }
        field466 = null;
        field467 = null;
        field464 = null;
        field471 = null;
        field468 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Z", line = 21)
    public static final boolean method298(byte arg0) {
        field472++;
        class588 var1 = (class588) class351.field4967.method3731((byte) -72);
        if (arg0 >= -108) {
            method297((byte) 89);
        }
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field8446; var2++) {
            if (var1.field8444[var2] != null && var1.field8444[var2].field10365 == 0) {
                return false;
            }
            if (var1.field8448[var2] != null && var1.field8448[var2].field10365 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIZ)V", line = 64)
    public static final void method299(int arg0, int arg1, int arg2, boolean arg3) {
        class336.field4782 = new byte[arg2][arg1][arg0];
        field463++;
        if (arg3) {
            method300((byte) -108, 108, -49);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)Z", line = 81)
    public static final boolean method300(byte arg0, int arg1, int arg2) {
        if (arg0 == -71) {
            field465++;
            return (arg2 & 0xC580) != 0;
        } else {
            return false;
        }
    }
}
