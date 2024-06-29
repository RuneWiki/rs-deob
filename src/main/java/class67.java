import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class67 extends class51 {

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Liu;")
    public static class390 field993 = new class390(16, 6);

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
    public static int[] field1008 = new int[2];

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lhe;")
    public static class239 field1004;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
    public final void method115(int arg0, int arg1, int arg2) {
        ++field1006;
        if (arg1 != 17091) {
            method468(112);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CB)Z")
    public static final boolean method467(char arg0, byte arg1) {
        ++field1007;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class456.method2659(115, arg0)) {
            return true;
        } else {
            int var2 = 50 % ((-63 - arg1) / 47);
            char[] var3 = class7.field132;
            for (int var4 = 0; var3.length > var4; ++var4) {
                char var8 = var3[var4];
                if (~arg0 == ~var8) {
                    return true;
                }
            }
            char[] var5 = class359.field5337;
            for (int var6 = 0; var5.length > var6; ++var6) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method468(int arg0) {
        if (arg0 != 41546988) {
            method468(70);
        }
        field1004 = null;
        field993 = null;
        field1008 = null;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field997 = arg7;
        this.field1005 = arg4;
        this.field1001 = arg5;
        this.field1000 = arg3;
        this.field994 = arg1;
        this.field998 = arg6;
        this.field1002 = arg2;
        this.field996 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)V")
    public final void method116(int arg0, int arg1, int arg2) {
        if (arg0 < 41) {
            this.field997 = 87;
        }
        ++field992;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
    public final void method117(int arg0, int arg1, int arg2) {
        ++field995;
        if (arg1 >= -104) {
            this.field1000 = -117;
        }
        int var4 = this.field996 * arg2 >> 12;
        int var5 = this.field994 * arg0 >> 12;
        int var6 = this.field1002 * arg2 >> 12;
        int var7 = this.field1000 * arg0 >> 12;
        int var8 = this.field1005 * arg2 >> 12;
        int var9 = this.field1001 * arg0 >> 12;
        int var10 = this.field998 * arg2 >> 12;
        int var11 = this.field997 * arg0 >> 12;
        class239.method1455(var8, var5, var11, var6, 14852, var9, var4, var10, super.field759, var7);
    }
}
