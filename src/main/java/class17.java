import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class17 extends class35 {

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "Lui;")
    public static class451 field225;

    static {
        new class422("", 73);
        field226 = 0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIII)Z", line = 4)
    public final boolean method173(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            this.field217 = -126;
        }
        field218++;
        return this.field220 == arg1 && this.field221 <= arg3 && arg3 <= this.field227 && this.field230 <= arg0 && this.field232 >= arg0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)Z", line = 19)
    public final boolean method174(int arg0, int arg1, int arg2) {
        if (arg2 >= -10) {
            method179(13);
        }
        field223++;
        return arg1 >= this.field224 && this.field212 >= arg1 && this.field217 <= arg0 && this.field216 >= arg0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lrt;", line = 36)
    public static final class124 method175(int arg0, int arg1) {
        field214++;
        class124[] var2 = class227.method1477(110);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class124 var4 = var2[var3];
            if (var4.field1704 == arg1) {
                return var4;
            }
        }
        if (arg0 != 11332) {
            method178(91, 52, -28, true);
        }
        return null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([IIII)V", line = 64)
    public final void method176(int[] arg0, int arg1, int arg2, int arg3) {
        field219++;
        arg0[0] = arg1;
        arg0[2] = this.field217 - (this.field230 - arg3);
        arg0[1] = this.field224 + arg2 - this.field221;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)Z", line = 74)
    public final boolean method177(int arg0, int arg1, byte arg2) {
        field229++;
        int var4 = -98 % ((-arg2 - 56) / 35);
        return this.field221 <= arg0 && arg0 <= this.field227 && this.field230 <= arg1 && arg1 <= this.field232;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIZ)I", line = 91)
    public static final int method178(int arg0, int arg1, int arg2, boolean arg3) {
        field215++;
        class341 var4 = class271.method1763(arg3, arg0, false);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= arg2 && var4.field5110.length > arg1) {
            return var4.field5110[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V", line = 115)
    public static void method179(int arg0) {
        field225 = null;
        if (arg0 != 65) {
            field231 = -99;
        }
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)V", line = 138)
    public static final void method180(int arg0) {
        field228++;
        if (class170.field2422) {
            return;
        }
        if (arg0 != 2) {
            method175(40, -119);
        }
        class170.field2422 = true;
        if (class337.field5038.field3942) {
            class384.field5682 = (float) ((int) class384.field5682 - 65 & 0xFFFFFF80);
        } else {
            class266.field3955 += (-class266.field3955 - 24.0F) / 2.0F;
        }
        class380.field5645 = true;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[III)V", line = 162)
    public final void method181(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 == -378) {
            field213++;
            arg1[2] = this.field230 + arg0 - this.field217;
            arg1[1] = this.field221 + arg2 - this.field224;
            arg1[0] = this.field220;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(IIIIIIIII)V", line = 180)
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field230 = arg2;
        this.field212 = arg7;
        this.field232 = arg4;
        this.field217 = arg6;
        this.field221 = arg1;
        this.field220 = arg0;
        this.field227 = arg3;
        this.field216 = arg8;
        this.field224 = arg5;
    }
}
