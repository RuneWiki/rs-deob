import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class192 extends class243 {

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lvv;")
    public static class313 field2989 = new class313(63, -2);

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Z")
    public static boolean field2991 = true;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[[Z")
    public static boolean[][] field2990 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[[[B")
    public static byte[][][] field2982;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V", line = 9)
    public final void method36(boolean arg0) {
        if (arg0) {
            this.field2979 = -66;
        }
        field2980++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILza;IILvl;Z)V", line = 24)
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        field2986++;
        if (arg0 != 0) {
            field2989 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z", line = 35)
    public final boolean method42(boolean arg0) {
        if (arg0) {
            field2991 = true;
        }
        field2987++;
        return false;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIII)V", line = 52)
    public class192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2985 = arg3;
        this.field2981 = arg1;
        this.field2988 = arg2;
        this.field2983 = arg4;
        this.field2984 = arg5;
        this.field2978 = arg0;
        this.field2979 = arg6;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 70)
    public static void method1290(byte arg0) {
        field2990 = null;
        if (arg0 == 121) {
            field2982 = null;
            field2989 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I")
    public abstract int method274(int arg0);
}
