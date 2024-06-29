import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class152 extends class68 {

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "Z")
    public boolean field2781;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "[Lpa;")
    public class152[] field2791;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lce;")
    public static class126 field2793 = class206.method1445(-7923, "loginscreen");

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field2786 = -1;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Lvh;")
    public static class147 field2788;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "La;")
    public class266 field2776;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Ljk;")
    public static class273 field2770;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lkc;")
    public class50 field2775;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I", line = 5)
    public int method1127(int arg0) {
        field2790++;
        if (arg0 != -1) {
            field2793 = (class126) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V", line = 18)
    public static final void method1128(int arg0, int arg1) {
        field2774++;
        if (class13.method75(arg0, (byte) -88)) {
            class33.method186(-1, class291.field4825[arg0], (byte) 114);
            if (arg1 >= -86) {
                field2788 = (class147) null;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V", line = 32)
    public void method2(byte arg0) {
        field2783++;
        int var2 = -81 / ((arg0 - 2) / 37);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIBI)V", line = 42)
    public static final void method1129(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class245 var5 = class139.method1022(10, (byte) -124, arg1);
        var5.method1683(0);
        var5.field4154 = arg0;
        field2779++;
        if (arg3 == 48) {
            var5.field4157 = arg2;
            var5.field4153 = arg4;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Lk;", line = 58)
    public static final class240 method1130(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field61; var4++) {
            class240 var5 = var3.field54[var4];
            if ((var5.field4045 >> 29 & 0x3L) == 2L && var5.field4041 == arg1 && var5.field4046 == arg2) {
                class190.method1358(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 85)
    public static void method1131(int arg0) {
        if (arg0 < -10) {
            field2793 = null;
            field2770 = null;
            field2788 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V", line = 106)
    public void method544(int arg0) {
        field2785++;
        if (arg0 != 0) {
            method1129(-77, 89, 8, (byte) -114, 65);
        }
        if (this.field2781) {
            this.field2776.method1798(false);
            this.field2776 = null;
        } else {
            this.field2775.method317(1);
            this.field2775 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)I", line = 135)
    public int method547(int arg0) {
        field2768++;
        return arg0 < 72 ? 82 : -1;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)[I", line = 148)
    public final int[] method1132(int arg0, int arg1, int arg2) {
        field2773++;
        int var4 = 5 / ((-arg1 - 12) / 41);
        return this.field2791[arg2].field2781 ? this.field2791[arg2].method6(true, arg0) : this.field2791[arg2].method26(0, arg0)[0];
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)[[I", line = 173)
    public int[][] method26(int arg0, int arg1) {
        field2789++;
        if (arg0 != 0) {
            this.method1132(61, -63, -78);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILbb;)V", line = 195)
    public void method5(int arg0, int arg1, class134 arg2) {
        field2792++;
        if (arg0 != 8) {
            this.field2775 = (class50) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZ)[[I", line = 206)
    public final int[][] method1133(int arg0, int arg1, boolean arg2) {
        field2777++;
        if (!arg2) {
            this.field2775 = (class50) null;
        }
        if (this.field2791[arg1].field2781) {
            int[] var4 = this.field2791[arg1].method6(true, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2791[arg1].method26(0, arg0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)[I", line = 240)
    public int[] method6(boolean arg0, int arg1) {
        if (!arg0) {
            field2788 = (class147) null;
        }
        field2772++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IZ)V", line = 267)
    public class152(int arg0, boolean arg1) {
        this.field2781 = arg1;
        this.field2791 = new class152[arg0];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIZI)V", line = 294)
    public static final void method1134(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class143.field2598 = 0L;
        field2784++;
        int var5 = class45.method282(arg4 ^ 0xFFFFFF87);
        if (arg1 == 3 || var5 == 3) {
            arg3 = true;
        }
        boolean var6 = false;
        if (var5 > 0 != arg4 > ~arg1) {
            var6 = true;
        }
        if (class147.field2715.startsWith("mac") && arg1 > 0) {
            arg3 = true;
        }
        if (arg3 && arg1 > 0) {
            var6 = true;
        }
        class160.method1182(var5, arg2, arg4 ^ 0xFFFFB2C4, var6, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)V", line = 320)
    public final void method1135(byte arg0, int arg1, int arg2) {
        field2787++;
        int var4 = this.field2771 == 255 ? arg1 : this.field2771;
        if (this.field2781) {
            this.field2776 = new class266(var4, arg1, arg2);
        } else {
            this.field2775 = new class50(var4, arg1, arg2);
        }
        if (arg0 != -56) {
            field2780 = -37;
        }
    }
}
