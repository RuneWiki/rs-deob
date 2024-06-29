import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class23 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "S")
    public short field320;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Z")
    public boolean field322;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "S")
    public short field303;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "B")
    public byte field315;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "S")
    public short field311;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lnea;")
    public static class664 field310 = new class664(74, 6);

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field316 = 999999;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[C")
    public static char[] field314 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field319 = -1;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field321 = 0;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lpu;")
    public static class522 field318;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[I")
    public static int[] field317;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZII)Z", line = 14)
    public static final boolean method279(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method280(71);
        }
        field312++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 34)
    public static void method280(int arg0) {
        field310 = null;
        field318 = null;
        if (arg0 != 117) {
            method279(true, 119, 34);
        }
        field317 = null;
        field314 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(CB)Z", line = 60)
    public static final boolean method281(char arg0, byte arg1) {
        int var2 = 100 / ((arg1 - 72) / 40);
        field306++;
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 79)
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field302 = arg3;
        this.field320 = (short) arg6;
        this.field322 = arg10;
        this.field309 = arg11;
        this.field303 = (short) arg5;
        this.field307 = arg2;
        this.field315 = (byte) arg8;
        this.field311 = (short) arg4;
        this.field305 = arg0;
        this.field304 = arg1;
    }
}
