import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class777 {

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    private int field10718 = -1;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field10710 = new String[0];

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
    private boolean field10719 = false;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    private int field10726;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Z")
    public static boolean field10722 = false;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Ljo;")
    public static class351 field10717 = new class351(40, -1);

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lrh;")
    public static class275 field10724 = new class275(7, 0, 1, 1);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10709;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field10712;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field10713;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field10714;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field10715;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field10716;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field10720;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field10721;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field10723;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Lua;")
    public static class692 field10725;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)[Ljava/lang/String;")
    public final String[] method4268(byte arg0) {
        field10711++;
        int var2 = 23 / ((arg0 - 5) / 58);
        String[] var3 = new String[this.field10718 + 1];
        class42.method291(this.field10710, 0, var3, 0, this.field10718 + 1);
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method4269(String arg0, int arg1) {
        field10709++;
        this.method4275(this.field10718 + 1, false, arg0);
        if (arg1 != -21156) {
            field10720 = 73;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
    private final void method4270(int arg0, int arg1) {
        field10723++;
        String[] var3 = new String[this.method4276(arg1, 124)];
        class42.method291(this.field10710, 0, var3, 0, this.field10710.length);
        this.field10710 = var3;
        if (arg0 >= -84) {
            this.field10718 = -82;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BII[BIIIII)V")
    public static final void method4271(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field10712++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        if (arg7 != 0) {
            field10720 = -73;
        }
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg3[var10001] += arg0[arg6++];
                int var14 = arg1++;
                arg3[var14] += arg0[arg6++];
                int var15 = arg1++;
                arg3[var15] += arg0[arg6++];
                int var16 = arg1++;
                arg3[var16] += arg0[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg3[var10001] += arg0[arg6++];
            }
            arg6 += arg4;
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method4272(boolean arg0) {
        field10724 = null;
        if (arg0) {
            field10717 = null;
        }
        field10725 = null;
        field10717 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Z")
    public static final boolean method4273(int arg0, int arg1, int arg2) {
        field10715++;
        if (arg1 != 0) {
            field10722 = false;
        }
        if (class541.method3118(arg2, arg1 ^ 0xFFFFF410, arg0)) {
            return class233.method1607(arg0, 11, arg2) | (arg2 & 0x9000) != 0 | class671.method3804(arg2, -1, arg0) ? true : (arg0 & 0x37) == 0 & (class714.method4041(arg0, (byte) 118, arg2) | (arg2 & 0x2000) != 0 | class271.method1764((byte) 68, arg2, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10714++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field10718; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field10710[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public static final void method4274(boolean arg0) {
        field10713++;
        class678 var1 = class630.method3597(29636, 15, 0L);
        var1.method3836((byte) -121);
        if (arg0) {
            field10720 = -26;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZLjava/lang/String;)V")
    private final void method4275(int arg0, boolean arg1, String arg2) {
        field10721++;
        if (this.field10718 < arg0) {
            this.field10718 = arg0;
        }
        if (this.field10710.length <= arg0) {
            this.method4270(-106, arg0);
        }
        this.field10710[arg0] = arg2;
        if (arg1) {
            this.method4268((byte) 84);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)I")
    private final int method4276(int arg0, int arg1) {
        field10716++;
        int var3 = -82 % ((arg1 - 29) / 54);
        int var4 = this.field10710.length;
        while (arg0 >= var4) {
            if (!this.field10719) {
                var4 += this.field10726;
            } else if (var4 == 0) {
                var4 = 1;
            } else {
                var4 = this.field10726 * var4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IZ)V")
    public class777(int arg0, boolean arg1) {
        this.field10726 = arg0;
        this.field10719 = arg1;
    }
}
