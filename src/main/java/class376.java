import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class376 extends class658 {

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "I")
    private int field5389 = 0;

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "I")
    public static int field5391 = -50;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "[[S")
    private static short[][] field5393 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fga", name = "s", descriptor = "[[S")
    private static short[][] field5394 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!fga", name = "l", descriptor = "[[S")
    private static short[][] field5387 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "[[[S")
    public static short[][][] field5390 = new short[][][] { field5394, field5387, field5393 };

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!fga", name = "t", descriptor = "[Lmia;")
    public static class684[] field5395;

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
    public static void method2352(int arg0) {
        field5393 = null;
        field5387 = null;
        field5395 = null;
        field5390 = null;
        field5394 = null;
        if (arg0 != 939) {
            method2352(37);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "([BI)Ljava/lang/String;")
    public static final String method2353(byte[] arg0, int arg1) {
        if (arg1 != -21568) {
            method2353((byte[]) null, -84);
        }
        ++field5392;
        return class116.method845(arg0.length, 0, arg0, arg1 + -7424);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZ)V")
    public final void method939(int arg0, boolean arg1) {
        ++field5388;
        int var3 = super.field9284.field2228.method1744(class456.field6378, super.field9281.method749(), (byte) 113) + super.field9284.field2222;
        if (arg0 != 7998) {
            method2353((byte[]) null, 53);
        }
        int var4 = super.field9284.field2221.method59(0, class565.field7983, super.field9281.method736()) - -super.field9284.field2227;
        super.field9281.method2024((float) (var3 - -(super.field9281.method749() / 2)), (float) (super.field9281.method736() / 2 + var4), 4096, this.field5389);
        this.field5389 += ((class229) super.field9284).field3452;
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lae;Lvj;)V")
    public class376(class283 arg0, class229 arg1) {
        super(arg0, arg1);
    }
}
