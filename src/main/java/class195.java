import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class195 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lnj;")
    private class162 field2776 = new class162(64);

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lmg;")
    private class101 field2777;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lmg;")
    private class101 field2779;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[I")
    public static int[] field2782 = new int[2];

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "F")
    public static float field2783;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lba;III[Z)Z", line = 7)
    public static final boolean method1212(class263 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class89.field1302 != class211.field2950) {
            int var6 = class385.field5608[arg1].method361(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class142 var8 = class385.field5608[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method361(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method355(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method352(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)I", line = 46)
    public static final int method1213(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 20810) {
            field2782 = null;
        }
        field2781++;
        if ((class267.field3700[arg3][arg0][arg2] & 0x8) == 0) {
            return arg3 <= 0 || (class267.field3700[1][arg0][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 66)
    public static void method1214(boolean arg0) {
        field2782 = null;
        if (!arg0) {
            method1214(false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z", line = 77)
    public static final boolean method1215(int arg0, int arg1, int arg2) {
        field2774++;
        int var3 = 29 % ((arg2 + 26) / 58);
        return (arg0 & 0x70000) != 0 | class317.method1850(arg0, arg1, 0) || class211.method1306(arg0, 32, arg1);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILmg;Lmg;)V", line = 107)
    public class195(int arg0, class101 arg1, class101 arg2) {
        this.field2777 = arg2;
        this.field2779 = arg1;
        if (this.field2779 != null) {
            this.field2779.method753(0, -98);
        }
        if (this.field2777 != null) {
            this.field2777.method753(0, -106);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)Lfo;", line = 130)
    public final class358 method1216(int arg0, boolean arg1) {
        field2778++;
        class358 var3 = (class358) this.field2776.method1073((long) arg0, false);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field2779.method727(arg0, 0, -94);
        } else {
            var4 = this.field2777.method727(arg0 & 0x7FFF, 0, 50);
        }
        class358 var5 = new class358();
        if (var4 != null) {
            var5.method2146(new class391(var4), -128);
        }
        if (arg0 >= 32768) {
            var5.method2143(-100);
        }
        this.field2776.method1072((long) arg0, var5, arg1);
        return var5;
    }
}
