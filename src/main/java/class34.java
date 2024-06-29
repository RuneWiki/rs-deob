import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class34 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field678 = 0;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lqd;")
    public static class40 field676 = class147.method1106("hitbar_default", (byte) -125);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "S")
    public static short field673 = 1;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 7)
    public static final void method292(int arg0, int arg1) {
        field674++;
        if (class135.field2294 == arg1 && arg1 != 0) {
            class66 var2 = class250.field4132[arg1];
            var2.method94(class292.field4878);
        }
        if (arg0 != 17530) {
            method292(122, -39);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lce;ZLw;Lce;I)V", line = 25)
    public static final void method293(class239 arg0, boolean arg1, class262 arg2, class239 arg3, int arg4) {
        class72.field1279 = arg1;
        if (arg4 < 76) {
            return;
        }
        class162.field2699 = arg3;
        field672++;
        class206.field3291 = arg0;
        int var5 = class206.field3291.method1660(-22800) - 1;
        class288.field4835 = class206.field3291.method1664(var5, (byte) 30) + var5 * 256;
        class209.field3345 = arg2;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lqd;B)I", line = 43)
    public static final int method294(class40 arg0, byte arg1) {
        if (arg1 < 7) {
            method297(-119, (class213) null, -104, -90, true, -105, -48);
        }
        field682++;
        return arg0.method350(true) + 1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Z", line = 54)
    public final boolean method295(int arg0) {
        if (arg0 < 73) {
            return false;
        } else {
            field679++;
            return (this.field684 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)Z", line = 65)
    public final boolean method296(byte arg0) {
        field675++;
        if (arg0 == -86) {
            return (this.field684 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILrb;IIZII)V", line = 87)
    public static final void method297(int arg0, class213 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            field676 = (class40) null;
        }
        field677++;
        int var7 = arg0 * arg0 + arg3 * arg3;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg1.field3502 / 2, arg1.field3565 / 2);
        if (var7 <= var8 * var8) {
            class78.method585(class149.field2502[arg5], 65534, arg1, arg6, arg2, arg0, arg3);
            return;
        }
        var8 -= 10;
        int var9 = class309.field5191 + class108.field1893 & 0x7FF;
        int var10 = class203.field3208[var9];
        int var11 = var10 * 256 / (class33.field662 + 256);
        int var12 = class203.field3216[var9];
        int var13 = var12 * 256 / (class33.field662 + 256);
        int var14 = arg0 * var13 - arg3 * var11 >> 16;
        int var15 = arg0 * var11 + arg3 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class21.field350) {
            ((class100) class166.field2747[arg5]).method759(240, 240, (arg1.field3502 / 2 + arg2 + var18) * 16, (arg1.field3565 / 2 + arg6 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class99) class166.field2747[arg5]).method731(arg2 + (arg1.field3502 / 2) + var18 - 10, arg1.field3565 / 2 + arg6 + -var19 + -10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([BIII)Lqd;", line = 141)
    public static final class40 method298(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -22277) {
            method297(-4, (class213) null, -33, 7, true, 106, -39);
        }
        class40 var4 = new class40();
        var4.field745 = new byte[arg2];
        var4.field766 = 0;
        for (int var5 = arg3; var5 < (arg2 + arg3); var5++) {
            if (arg0[var5] != 0) {
                var4.field745[var4.field766++] = arg0[var5];
            }
        }
        field683++;
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Z", line = 167)
    public final boolean method299(boolean arg0) {
        field680++;
        if (!arg0) {
            method292(104, 59);
        }
        return (this.field684 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 178)
    public static void method300(int arg0) {
        if (arg0 <= -17) {
            field676 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)Z", line = 199)
    public final boolean method301(int arg0) {
        if (arg0 != 4096) {
            this.method296((byte) -54);
        }
        field686++;
        return (this.field684 & 0x2) != 0;
    }
}
