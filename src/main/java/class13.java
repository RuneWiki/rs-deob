import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class13 {

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "[I")
    public static int[] field198 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field203 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method66(int arg0) {
        if (arg0 != 126) {
            field198 = null;
        }
        field198 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
    public static final int method67(int arg0, int arg1, int arg2) {
        if (arg0 != -13465) {
            method67(64, 101, 63);
        }
        field202++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
