import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class426 extends class381 {

    @OriginalMember(owner = "client!jw", name = "t", descriptor = "Z")
    public boolean field6232;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "Ljava/lang/String;")
    public String field6222;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public int field6223;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "Z")
    public boolean field6221;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public int field6227;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "Ljava/lang/String;")
    public String field6225;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
    public int field6226;

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!jw", name = "s", descriptor = "J")
    public long field6231;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "[I")
    public static int[] field6229 = new int[2];

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "[I")
    public static int[] field6224 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "Liba;")
    public static class211 field6220 = new class211(46, -1);

    @OriginalMember(owner = "client!jw", name = "u", descriptor = "I")
    public static int field6233 = -1;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
    public static void method2565(int arg0) {
        field6224 = null;
        if (arg0 == 46) {
            field6229 = null;
            field6220 = null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class426(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field6232 = arg8;
        this.field6222 = arg0;
        this.field6223 = arg3;
        this.field6221 = arg9;
        this.field6227 = arg4;
        this.field6225 = arg1;
        this.field6226 = arg7;
        this.field6230 = arg6;
        this.field6231 = arg5;
        this.field6228 = arg2;
    }
}
