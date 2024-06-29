import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class7 extends class332 {

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field92 = -1;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public int field97 = 0;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field93 = 3353893;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "[[I")
    public static int[][] field99 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Llb;")
    public static class224 field96 = new class224(16);

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "[B")
    public static byte[] field108;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "[I")
    public static int[] field100;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "[[Lgj;")
    public static class245[][] field105;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V", line = 12)
    public static final void method22(boolean arg0) {
        if (class184.field2662 != null) {
            class287 var1 = class184.field2662;
            synchronized (class184.field2662) {
                class184.field2662 = null;
            }
        }
        field104++;
        if (arg0) {
            field93 = -10;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILcc;IIIIIB)V", line = 36)
    public static final void method23(int arg0, class263 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field94++;
        int var8 = arg3 * arg3 + arg5 * arg5;
        if (var8 > arg6) {
            return;
        }
        int var9 = Math.min(arg1.field3989 / 2, arg1.field4096 / 2);
        if (arg7 != -79) {
            return;
        }
        if (var9 * var9 >= var8) {
            class321.method2235(arg1, arg5, 2, class239.field3589[arg2], arg0, arg4, arg3);
            return;
        }
        int var10 = (int) class280.field4344 + class227.field3248 & 0x7FF;
        var9 -= 10;
        int var11 = class215.field3017[var10];
        int var12 = var11 * 256 / (class196.field2807 + 256);
        int var13 = class215.field3024[var10];
        int var14 = var13 * 256 / (class196.field2807 + 256);
        int var15 = arg3 * var14 + (arg5 * var12) >> 16;
        int var16 = arg3 * var12 - (arg5 * var14) >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class250.field3787) {
            ((class202) class255.field3888[arg2]).method1387(240, 240, (arg1.field3989 / 2 + var19 + arg4) * 16, (arg1.field4096 / 2 + arg0 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class189) class255.field3888[arg2]).method1304(arg4 + (arg1.field3989 / 2) + var19 - 10, arg1.field4096 / 2 + -var20 + -10 + arg0, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V", line = 92)
    public static final void method24(int arg0, int arg1) {
        field106++;
        class222.field3146.method1236(-495037017, arg0);
        class231.field3368.method1236(arg1 - 495044202, arg0);
        if (arg1 != 7185) {
            field107 = 6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 104)
    public static void method25(byte arg0) {
        if (arg0 >= -14) {
            field99 = (int[][]) ((int[][]) null);
        }
        field96 = null;
        field108 = null;
        field100 = null;
        field99 = (int[][]) null;
        field105 = (class245[][]) null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V", line = 144)
    public static final void method26(int arg0, int arg1) {
        if (arg0 > -18) {
            return;
        }
        class286 var2 = (class286) class229.field3337.method1537((long) arg1, -22708);
        field98++;
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4498.length; var3++) {
                var2.field4498[var3] = -1;
                var2.field4502[var3] = 0;
            }
        }
    }
}
