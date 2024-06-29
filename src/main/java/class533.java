import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class533 {

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Z")
    public static boolean field7629 = false;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lkfa;")
    public static class549 field7621 = new class549(20, 8);

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field7631 = 2;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field7624;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field7626;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field7627;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ljo;")
    public static class303 field7623;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 6)
    public static void method3032(int arg0) {
        field7623 = null;
        if (arg0 == -22121) {
            field7621 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Z", line = 26)
    public final boolean method3033(int arg0) {
        field7620++;
        int var2 = -96 / ((-arg0 - 45) / 47);
        return (this.field7626 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILnq;[[B)V", line = 36)
    public static final void method3034(int arg0, class420 arg1, byte[][] arg2) {
        field7625++;
        if (arg0 != 1592347480) {
            return;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field6373; var4++) {
            class73.method470((byte) 84);
            for (int var5 = 0; var5 < (class399.field5338 >> 3); var5++) {
                for (int var6 = 0; var6 < class349.field4567 >> 3; var6++) {
                    int var7 = class4.field30[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3B0BBF4) >> 24;
                        if (!arg1.field6377 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class287.field3696.length; var13++) {
                                if (class287.field3696[var13] == var12 && arg2[var13] != null) {
                                    class452 var14 = new class452(arg2[var13]);
                                    arg1.method2595(var9, var8, var10, class475.field6919, var5 * 8, 3, var4, var14, var6 * 8, var11);
                                    arg1.method2274(var3[0] == -1 ? var3 : null, var6 * 8, class453.field6284, var10, var14, var8, var4, var11, arg0 ^ 0xA116B4B7, var5 * 8, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class309.field4008 = class196.field2366.method547(var3[1], class246.field3174, var3[3], (byte) -105, var3[0], var3[2]);
            class554.field7898 = var3[4];
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Z", line = 124)
    public final boolean method3035(int arg0) {
        if (arg0 == 0) {
            field7630++;
            return (this.field7626 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z", line = 140)
    public final boolean method3036(byte arg0) {
        if (arg0 != 16) {
            this.method3035(-50);
        }
        field7628++;
        return (this.field7626 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)Z", line = 152)
    public final boolean method3037(int arg0) {
        if (arg0 == -1) {
            field7632++;
            return (this.field7626 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lw;III[Z)V", line = 173)
    public static final void method3038(class269 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class628.field8912 == class591.field8415) {
            return;
        }
        int var5 = class275.field3477[arg1].method242(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class137 var7 = class275.field3477[var6];
                if (var7 != null) {
                    var7.method247(arg0, arg2, var5 - var7.method242(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
