import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class184 extends class591 {

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "[I")
    public int[] field2919;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "[I")
    public int[] field2917;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "Leda;")
    public static class116 field2921 = new class116(16, 1);

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "[[[I")
    public static int[][][] field2920;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)I", line = 5)
    public static final int method1321(int arg0, int arg1, int arg2) {
        field2916++;
        int var3 = arg2 >>> 24;
        int var4 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return arg0 == -1192894664 ? ((-16711936 & (arg1 & 0xFF00FF) * var5 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4 : -98;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V", line = 21)
    public static void method1322(byte arg0) {
        field2921 = null;
        field2920 = null;
        if (arg0 >= -16) {
            field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZII)Z", line = 38)
    public static final boolean method1323(boolean arg0, int arg1, int arg2) {
        field2915++;
        if (arg0) {
            field2920 = null;
        }
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(II[I[I)V", line = 49)
    public class184(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2919 = arg3;
        this.field2917 = arg2;
    }
}
