import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class214 extends class203 {

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "Z")
    public static boolean field2988 = true;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "[Lij;")
    public static class242[] field2979;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)I", line = 11)
    public static final int method1399(byte arg0, int arg1) {
        int var2 = 106 / ((arg0 - 61) / 43);
        field2991++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lpl;Lpl;I)V", line = 21)
    public static final void method1400(class390 arg0, class390 arg1, int arg2) {
        field2977++;
        if (arg1.field5601 != null) {
            arg1.method2467((byte) 88);
        }
        arg1.field5601 = arg0.field5601;
        arg1.field5597 = arg0;
        arg1.field5601.field5597 = arg1;
        if (arg2 < -67) {
            arg1.field5597.field5601 = arg1;
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(B)V", line = 38)
    public final void method674(byte arg0) {
        if (arg0 == -1) {
            field2982++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IBIILrr;Luo;Z)V", line = 55)
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        field2987++;
        if (arg1 != -126) {
            field2976 = -9;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(B)Z", line = 69)
    public final boolean method683(byte arg0) {
        int var2 = -34 / ((47 - arg0) / 47);
        field2983++;
        return false;
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(B)V", line = 82)
    public static void method1401(byte arg0) {
        if (arg0 > -27) {
            field2988 = false;
        }
        field2979 = null;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIIII)V", line = 102)
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2984 = arg6;
        this.field2985 = arg0;
        this.field2980 = arg5;
        this.field2975 = arg1;
        this.field2978 = arg3;
        this.field2989 = arg4;
        this.field2990 = arg2;
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)I")
    public abstract int method1398(int arg0);
}
