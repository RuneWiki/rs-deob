import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class208 extends class320 {

    @OriginalMember(owner = "client!en", name = "m", descriptor = "Z")
    public boolean field3002;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "Ljava/lang/String;")
    public String field3007;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "Ljava/lang/String;")
    public String field3008;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "Z")
    public boolean field3004;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public int field3013;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "J")
    public long field3012;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "[F")
    public static float[] field3011 = new float[4];

    @OriginalMember(owner = "client!en", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field3014 = new String[200];

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "[Lkr;")
    public static class524[] field3006;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 15)
    public static void method1407(int arg0) {
        field3011 = null;
        int var1 = 6 % ((-arg0 - 63) / 58);
        field3014 = null;
        field3006 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method1408(int arg0, int arg1, int arg2) {
        if (arg0 != 4) {
            method1407(102);
        }
        field3010++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 43)
    public class208(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field3002 = arg8;
        this.field3005 = arg3;
        this.field3007 = arg1;
        this.field3008 = arg0;
        this.field3003 = arg6;
        this.field3004 = arg9;
        this.field3009 = arg4;
        this.field3001 = arg7;
        this.field3013 = arg2;
        this.field3012 = arg5;
    }
}
