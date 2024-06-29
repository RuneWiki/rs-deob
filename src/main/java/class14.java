import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "B")
    public byte field288;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Z")
    public static boolean field276 = false;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lqca;")
    public class118 field279;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "Lds;")
    public class14 field282;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Las;")
    public static class155 field273;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "Lkv;")
    public class272 field284;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lhe;")
    public class374 field278;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lhe;")
    public class374 field283;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Lim;")
    public class573 field277;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "Lim;")
    public class573 field290;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "Ltl;")
    public class621 field289;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lpda;")
    public static class631 field271;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "S")
    public short field280;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "S")
    public short field281;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "S")
    public short field285;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "S")
    public short field286;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V", line = 4)
    public final void method100(boolean arg0) {
        field275++;
        while (this.field289 != null) {
            class621 var2 = this.field289.field8560;
            this.field289.method3491((byte) -67);
            this.field289 = var2;
        }
        if (arg0) {
            method101(-28);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 23)
    public static void method101(int arg0) {
        field273 = null;
        field271 = null;
        int var1 = 39 / ((arg0 + 16) / 60);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V", line = 36)
    public static final void method102(boolean arg0) {
        if (class684.field9529 != null) {
            class684.field9529.method3648(false);
        }
        field287++;
        if (class317.field4106 != null) {
            class317.field4106.method3648(!arg0);
        }
        if (!arg0) {
            method102(false);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZI)Z", line = 55)
    public static final boolean method103(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method101(38);
        }
        field274++;
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V", line = 66)
    public class14(int arg0) {
        this.field288 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)I", line = 95)
    public static final int method104(int arg0, int arg1, int arg2) {
        field270++;
        int var3 = class648.method3634(arg2 - 1, (byte) 92, arg0 - 1) + (class648.method3634(arg2 - 1, (byte) -106, arg0 + 1) + class648.method3634(arg2 + 1, (byte) -79, arg0 - 1) + class648.method3634(arg2 + 1, (byte) 112, arg0 + 1));
        int var4 = class648.method3634(arg2, (byte) -71, arg0 - 1) + class648.method3634(arg2, (byte) -117, arg0 + 1) + (class648.method3634(arg1 + arg2, (byte) -83, arg0) - -class648.method3634(arg2 + 1, (byte) -70, arg0));
        int var5 = class648.method3634(arg2, (byte) -91, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
