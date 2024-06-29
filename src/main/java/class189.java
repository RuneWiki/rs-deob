import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class189 {

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[I")
    private int[] field3613;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lai;")
    private static class10 field3606 = class44.method278("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 118);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lai;")
    public static class10 field3607 = class44.method278("headicons_pk", -24);

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lai;")
    public static class10 field3608 = class44.method278("Geben Sie Ihren Benutzernamen", -119);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Z")
    public static boolean field3603 = false;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lai;")
    public static class10 field3610 = class44.method278("event_opbase", -127);

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Lai;")
    public static class10 field3614 = class44.method278("Diese Betatest)2Welt ist nur f-Ur eingeladene", -68);

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[[S")
    public static short[][] field3617 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lai;")
    public static class10 field3609 = class44.method278("swe", -34);

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field3616 = 0;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lai;")
    public static class10 field3611 = field3606;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[[B")
    public static byte[][] field3615;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method1209(byte arg0) {
        field3607 = null;
        if (arg0 >= -74) {
            return;
        }
        field3606 = null;
        field3617 = null;
        field3610 = null;
        field3611 = null;
        field3608 = null;
        field3609 = null;
        field3614 = null;
        field3615 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lai;I)Z")
    public static final boolean method1210(class10 arg0, int arg1) {
        field3605++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != -1) {
            method1210(null, 51);
        }
        for (int var2 = 0; var2 < class78.field1375; var2++) {
            if (arg0.method70((byte) 119, class11.field178[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)I")
    public final int method1211(byte arg0, int arg1) {
        field3604++;
        if (arg0 != -111) {
            field3612 = -24;
        }
        int var3 = (this.field3613.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3613[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3613[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([I)V")
    public class189(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field3613 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3613[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3613[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3613[var5 + var5] = arg0[var4];
            this.field3613[var5 + var5 + 1] = var4++;
        }
    }
}
