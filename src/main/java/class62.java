import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class62 extends class398 {

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Z")
    public static volatile boolean field995 = false;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    public static int field1000 = 0;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field1007 = 2;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field997;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V", line = 8)
    public final void method28(int arg0, int arg1, int arg2) {
        ++field1008;
        int var4 = this.field1003 * arg1 >> 12;
        int var5 = this.field996 * arg0 >> 12;
        if (arg2 != 0) {
            this.method28(-62, 30, -17);
        }
        int var6 = this.field1009 * arg1 >> 12;
        int var7 = this.field999 * arg0 >> 12;
        int var8 = this.field998 * arg1 >> 12;
        int var9 = this.field1004 * arg0 >> 12;
        int var10 = this.field994 * arg1 >> 12;
        int var11 = this.field1006 * arg0 >> 12;
        class347.method2239(var7, var4, super.field5863, var10, var8, (byte) 13, var11, var5, var9, var6);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 37)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1004 = arg5;
        this.field1006 = arg7;
        this.field1009 = arg2;
        this.field1003 = arg0;
        this.field994 = arg6;
        this.field999 = arg3;
        this.field996 = arg1;
        this.field998 = arg4;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIB)V", line = 58)
    public final void method23(int arg0, int arg1, byte arg2) {
        ++field1005;
        int var4 = 65 % ((-62 - arg2) / 37);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V", line = 74)
    public static void method477(int arg0) {
        field997 = null;
        if (arg0 != -1) {
            method478(false, false, -65, 10, false);
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)V", line = 90)
    public final void method25(int arg0, int arg1, int arg2) {
        if (arg1 >= -46) {
            this.field1004 = -42;
        }
        ++field1002;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZZIIZ)V", line = 100)
    public static final void method478(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class12.method79(arg3, 255, arg0, 0, arg1, class221.field3299.length + -1, arg2);
        if (arg4) {
            field1007 = -80;
        }
        ++field1001;
        class111.field1802 = 0;
        class225.field3322 = null;
    }
}
