import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class68 {

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "S")
    public short field838;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "B")
    public byte field835;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "S")
    public short field836;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "B")
    public byte field837;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field831;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Z")
    public boolean field832;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "S")
    public short field829;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[Lko;")
    public static class507[] field833 = null;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[[I")
    public static int[][] field839 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field840 = -1;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method569(int arg0) {
        if (arg0 != 2618) {
            method569(-11);
        }
        field833 = null;
        field839 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field838 = (short) arg4;
        this.field830 = arg0;
        this.field835 = (byte) arg8;
        this.field836 = (short) arg5;
        this.field837 = (byte) arg7;
        this.field831 = arg10;
        this.field832 = arg9;
        this.field829 = (short) arg6;
    }
}
