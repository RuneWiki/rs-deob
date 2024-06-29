import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class97 extends class261 {

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field1890 = -1;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Z")
    public boolean field1891 = false;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field1889;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Z")
    public static boolean field1896;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "[I")
    public static int[] field1892;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "[S")
    public static short[] field1886;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method863(int arg0) {
        field1892 = null;
        field1889 = null;
        if (arg0 == 0) {
            field1886 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[IILda;[I)Lpd;")
    public static final class171 method864(int arg0, int arg1, int[] arg2, int arg3, class44 arg4, int[] arg5) {
        field1885++;
        byte[] var6 = new byte[arg0 * arg3];
        int var7 = 0;
        if (arg1 != -1) {
            method863(-102);
        }
        while (arg3 > var7) {
            int var8 = arg0 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class171(arg4, arg0, arg3, var6);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
    public class97(int arg0) {
        this.field1890 = arg0;
    }
}
