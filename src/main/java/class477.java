import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class477 extends class189 {

    @OriginalMember(owner = "client!lia", name = "r", descriptor = "I")
    public int field6772;

    @OriginalMember(owner = "client!lia", name = "m", descriptor = "I")
    public int field6767;

    @OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
    public static int field6769 = 0;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!lia", name = "n", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!lia", name = "p", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!lia", name = "q", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!lia", name = "s", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!lia", name = "t", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method2850(int arg0, int arg1) {
        field6773++;
        if (arg0 >= -24) {
            return false;
        } else {
            return (this.field6767 >> arg1 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IZIIIIIIII)V", line = 19)
    public static final void method2851(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 == arg9 && arg6 == arg7 && arg2 == arg3 && arg4 == arg5) {
            class99.method723(arg9, arg2, true, arg0, arg4, arg6);
        } else {
            int var10 = arg9;
            int var11 = arg6;
            int var12 = arg9 * 3;
            int var13 = arg6 * 3;
            int var14 = arg8 * 3;
            int var15 = arg7 * 3;
            int var16 = arg3 * 3;
            int var17 = arg5 * 3;
            int var18 = arg2 + var14 - (arg9 + var16);
            int var19 = arg4 - var17 - (-var15 + arg6);
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 - (var15 - (var13 - var15));
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg9;
                int var34 = (var28 + var30 + var32 >> 12) + arg6;
                class99.method723(var10, var33, true, arg0, var34, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg1) {
            field6771 = 12;
        }
        field6766++;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)I", line = 94)
    public final int method2852(int arg0) {
        field6765++;
        if (arg0 != -1) {
            field6769 = 86;
        }
        return this.field6767 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)Z", line = 108)
    public final boolean method2853(int arg0) {
        if (arg0 < 24) {
            this.method2857(-120);
        }
        field6768++;
        return ((this.field6767 & 0x5D38F5) >> 22) != 0;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 120)
    public static final void method2854(int arg0, int arg1, int arg2, Class arg3) {
        class165 var4 = class553.field7776[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class356 var5 = var4.field2270; var5 != null; var5 = var5.field5066) {
            class524 var6 = var5.field5067;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field7415 == arg1 && var6.field7418 == arg2) {
                class52.method326(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)I", line = 147)
    public final int method2855(boolean arg0) {
        if (arg0) {
            return -104;
        } else {
            field6770++;
            return class590.method3339(-10391, this.field6767);
        }
    }

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)Z", line = 159)
    public final boolean method2856(int arg0) {
        if (arg0 != 9162) {
            this.field6767 = -95;
        }
        field6764++;
        return (this.field6767 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "(I)Z", line = 178)
    public final boolean method2857(int arg0) {
        field6774++;
        if (arg0 > -111) {
            field6771 = 126;
        }
        return (this.field6767 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(II)V", line = 189)
    public class477(int arg0, int arg1) {
        this.field6772 = arg1;
        this.field6767 = arg0;
    }
}
