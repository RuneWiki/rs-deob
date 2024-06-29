import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class497 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
    public boolean field6224;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[[I")
    public static int[][] field6221 = new int[128][128];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lii;")
    public class519 field6220;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lii;")
    public class519 field6226;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
    public boolean field6223;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method2709(int arg0) {
        if (arg0 < 57) {
            field6221 = null;
        }
        field6221 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
    public static final int method2710(int arg0, int arg1, int arg2) {
        field6218++;
        int var3 = (arg0 & arg2) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static final void method2711(byte arg0) {
        if (arg0 < -79) {
            field6222++;
            class71.field919.method418(class16.field161, class611.field8310.field8700 ? class618.field8379 + 256 << 2 : -1, 0);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Z)V")
    public class497(boolean arg0) {
        this.field6224 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Z")
    public final boolean method2712(int arg0) {
        field6225++;
        if (arg0 == 2) {
            return this.field6223 && !this.field6224;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public final void method2713(int arg0) {
        field6219++;
        if (this.field6226 != null) {
            this.field6226.method60(5634);
        }
        if (arg0 == -1) {
            this.field6223 = false;
        }
    }
}
