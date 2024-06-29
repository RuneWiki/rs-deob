import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class365 {

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "B")
    public byte field5099;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public int field5101;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "B")
    public byte field5107;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public int field5098;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "Z")
    public boolean field5102;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "S")
    public short field5103;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "S")
    public short field5105;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "S")
    public short field5104;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public int field5094;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "Lvt;")
    public static class344 field5100 = new class344("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "F")
    public static float field5106;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg4;
            arg4 = var7;
        }
        field5096++;
        if (arg3 <= 64) {
            field5106 = 1.1704477F;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg5;
        } else {
            return 8 - arg1 - arg4;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static void method2249(byte arg0) {
        if (arg0 != 42) {
            field5106 = 1.212307F;
        }
        field5100 = null;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field5099 = (byte) arg8;
        this.field5101 = arg3;
        this.field5107 = (byte) arg7;
        this.field5098 = arg1;
        this.field5102 = arg10;
        this.field5103 = (short) arg4;
        this.field5105 = (short) arg6;
        this.field5095 = arg11;
        this.field5104 = (short) arg5;
        this.field5094 = arg0;
        this.field5097 = arg2;
    }
}
