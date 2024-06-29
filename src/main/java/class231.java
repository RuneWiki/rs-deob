import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class231 {

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Z")
    public boolean field2984;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "B")
    public byte field2987;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "S")
    public short field2986;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "B")
    public byte field2992;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "S")
    public short field2997;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "S")
    public short field2990;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2996;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Loi;")
    public static class169 field2995;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1472(int arg0) {
        field2996 = null;
        field2995 = null;
        if (arg0 != 0) {
            field2995 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2991 = arg3;
        this.field2984 = arg10;
        this.field2987 = (byte) arg8;
        this.field2986 = (short) arg6;
        this.field2989 = arg2;
        this.field2985 = arg0;
        this.field2992 = (byte) arg7;
        this.field2997 = (short) arg5;
        this.field2990 = (short) arg4;
        this.field2993 = arg1;
        this.field2988 = arg11;
    }

    static {
        new class169(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field2996 = new String[200];
        field2995 = new class169("cyan:", "blaugrün:", "cyan:", "cyan:");
    }
}
