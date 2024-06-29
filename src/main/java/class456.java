import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class456 {

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public int field6422;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public int field6429;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public int field6433;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public int field6423;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public int field6430;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "B")
    public byte field6425;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public int field6418;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Lga;")
    public class404 field6417;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "[[I")
    public static int[][] field6419 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "[I")
    public static int[] field6432 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "Lsj;")
    public static class460 field6431 = new class460("runescape", 0);

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "Llfa;")
    public static class116 field6436;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "Lhp;")
    public class329 field6437;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "Lvia;")
    public class563 field6421;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "Lck;")
    public class642 field6428;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "Lob;")
    public class735 field6434;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "[I")
    public static int[] field6424;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)Ljava/lang/String;", line = 4)
    public static final String method2712(byte arg0) {
        field6420++;
        if (class311.field4321 || class693.field9372 == null) {
            return "";
        } else if (arg0 < 51) {
            return null;
        } else {
            return class693.field9372.field4490;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)V", line = 34)
    public static void method2713(byte arg0) {
        if (arg0 < 101) {
            method2713((byte) -85);
        }
        field6432 = null;
        field6424 = null;
        field6431 = null;
        field6436 = null;
        field6419 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZI)Z", line = 51)
    public static final boolean method2714(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            field6435++;
            return (arg0 & 0x800) != 0 | class183.method1339(-106, arg2, arg0) || class582.method3336(arg0, arg2, (byte) 88);
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)Z", line = 74)
    public final boolean method2715(byte arg0) {
        field6426++;
        if (arg0 >= -12) {
            method2713((byte) 101);
        }
        return this.field6425 == 2 || this.field6425 == 3;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(BIIIIIILga;)V", line = 86)
    public class456(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class404 arg7) {
        this.field6422 = arg2;
        this.field6429 = arg4;
        this.field6433 = arg3;
        this.field6423 = arg5;
        this.field6430 = arg1;
        this.field6425 = arg0;
        this.field6418 = arg6;
        this.field6417 = arg7;
    }
}
