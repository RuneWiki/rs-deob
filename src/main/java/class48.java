import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class48 extends class401 {

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "Llga;")
    public static class663 field566 = new class663(4);

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Z")
    public static boolean field578 = true;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "Len;")
    public static class290 field579 = new class290("", 13);

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "[I")
    public static int[] field568;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
    public static final String[] method383(String arg0, int arg1, char arg2) {
        field569++;
        int var3 = class693.method3899(arg2, (byte) 109, arg0);
        String[] var4 = new String[arg1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIII)V")
    public static final void method384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field565++;
        for (int var5 = 0; var5 < class84.field1247; var5++) {
            Rectangle var6 = class596.field8331[var5];
            if ((var6.x + var6.width) > arg3 && var6.x < arg3 + arg4 && arg0 < var6.y + var6.height && var6.y < (arg0 + arg2)) {
                class130.field1872[var5] = true;
            }
        }
        if (arg1 != 1) {
            method385((byte) 15);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method385(byte arg0) {
        field579 = null;
        field566 = null;
        field568 = null;
        int var1 = 5 % ((arg0 + 42) / 39);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZILsea;ILjba;BI)V")
    public static final void method386(boolean arg0, int arg1, class648 arg2, int arg3, class364 arg4, byte arg5, int arg6) {
        int var7 = 15 / ((arg5 - 14) / 53);
        class56.method471(arg1, arg3, arg6, arg0, -1, arg2);
        field560++;
        class123.field1688 = arg4;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIBI)Z")
    public final boolean method387(int arg0, int arg1, byte arg2, int arg3) {
        field558++;
        int var5 = 66 % ((-arg2 - 22) / 59);
        return this.field577 == arg3 && this.field559 <= arg1 && arg1 <= this.field567 && arg0 >= this.field576 && arg0 <= this.field564;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z")
    public final boolean method388(int arg0, int arg1, int arg2) {
        if (arg0 != 8159) {
            this.field567 = 0;
        }
        field572++;
        return arg1 >= this.field557 && this.field563 >= arg1 && arg2 >= this.field575 && this.field574 >= arg2;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BII)Z")
    public final boolean method389(byte arg0, int arg1, int arg2) {
        field570++;
        if (arg0 >= -36) {
            this.field557 = 112;
        }
        return this.field559 <= arg2 && arg2 <= this.field567 && this.field576 <= arg1 && arg1 <= this.field564;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([IBII)V")
    public final void method390(int[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 68) {
            method386(false, 116, null, -13, null, (byte) -44, 94);
        }
        arg0[1] = this.field557 + arg3 - this.field559;
        arg0[2] = arg2 + this.field575 - this.field576;
        field571++;
        arg0[0] = 0;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field557 = arg5;
        this.field576 = arg2;
        this.field567 = arg3;
        this.field559 = arg1;
        this.field563 = arg7;
        this.field577 = arg0;
        this.field574 = arg8;
        this.field575 = arg6;
        this.field564 = arg4;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V")
    public static final void method391() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class494.field6736.length; var1++) {
                if (class494.field6736[var1].method1138()) {
                    class160.field2319[var1] = class494.field6736[var1].method1137();
                } else {
                    synchronized (class494.field6736[var1]) {
                        class494.field6736[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class494.field6736[class494.field6736.length - 1].method1136();
                class32.method306(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class494.field6736.length - 1; var4++) {
                        if (!class494.field6736[var4].method1138()) {
                            synchronized (class494.field6736[var4]) {
                                class494.field6736[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class494.field6736.length - 2; var6++) {
                            class494.field6736[var6].method1136();
                        }
                        class32.method306(2);
                        while (!class494.field6736[0].method1138()) {
                            synchronized (class494.field6736[0]) {
                                class494.field6736[0].notify();
                            }
                            try {
                                class519.method2960(-106, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class494.field6736[0].method1136();
                        return;
                    }
                    try {
                        class519.method2960(107, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class519.method2960(115, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[III)V")
    public final void method392(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = arg0 + this.field559 - this.field557;
        if (arg2 != 32119) {
            method385((byte) -17);
        }
        arg1[2] = this.field576 + arg3 - this.field575;
        arg1[0] = this.field577;
        field573++;
    }
}
