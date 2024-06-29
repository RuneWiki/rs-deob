import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class638 {

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public int field9296;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public int field9288;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "B")
    public byte field9297;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public int field9284;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public int field9291;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "S")
    public short field9289;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "B")
    public byte field9292;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public int field9285;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "S")
    public short field9287;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "S")
    public short field9290;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Z")
    public boolean field9295;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lmc;")
    public static class114 field9294 = null;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "F")
    public static float field9293;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method3694(int arg0) {
        if (arg0 < 121) {
            field9293 = 0.93676955F;
        }
        field9294 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
    public static final void method3695(int arg0, boolean arg1) {
        field9286++;
        class314 var2 = class483.method2819(12, arg0, 21303);
        var2.method1962((byte) 0);
        if (!arg1) {
            field9293 = 0.34322804F;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9296 = arg11;
        this.field9288 = arg0;
        this.field9297 = (byte) arg8;
        this.field9284 = arg2;
        this.field9291 = arg1;
        this.field9289 = (short) arg5;
        this.field9292 = (byte) arg7;
        this.field9285 = arg3;
        this.field9287 = (short) arg4;
        this.field9290 = (short) arg6;
        this.field9295 = arg10;
    }

    static {
        new class104("Use", "Benutzen", "Utiliser", "Usar");
    }
}
