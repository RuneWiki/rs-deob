import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 extends class30 {

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[J")
    private long[] field3039 = new long[10];

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lkd;")
    public static class73 field3027 = class126.method1070((byte) -66, "mapmarker");

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lkd;")
    public static class73 field3037 = class126.method1070((byte) -66, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lkd;")
    public static class73 field3041 = class126.method1070((byte) -66, "leuchten1:");

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Lkd;")
    private static class73 field3050 = class126.method1070((byte) -66, "Friends");

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lkd;")
    private static class73 field3052 = class126.method1070((byte) -66, "glow3:");

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "[Z")
    public static boolean[] field3051 = new boolean[5];

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "[I")
    public static int[] field3053 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Lkd;")
    public static class73 field3046 = field3050;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lkd;")
    public static class73 field3033 = field3052;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field3054 = -1;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lkd;")
    public static class73 field3036 = class126.method1070((byte) -66, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lkd;")
    private static class73 field3034 = class126.method1070((byte) -66, "Loading friend list");

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lkd;")
    public static class73 field3059 = class126.method1070((byte) -66, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Lkd;")
    public static class73 field3048 = field3034;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "Lkd;")
    public static class73 field3044 = field3052;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    private int field3047;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    private int field3058;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "J")
    private long field3049;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Loe;")
    public static class102 field3026;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Z")
    public static boolean field3035;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "[I")
    public static int[] field3031;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[I")
    public static int[] field3056;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "[I")
    public static int[] field3057;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILkd;Lq;Lkd;ZI)V")
    public static final void method1026(int arg0, class73 arg1, class111 arg2, class73 arg3, boolean arg4, int arg5) {
        int var6 = -41 / ((arg5 + 6) / 57);
        field3043++;
        int var7 = arg2.method905(arg3, (byte) -72);
        int var8 = arg2.method902(0, var7, arg1);
        class41.method310(var8, arg4, -93, var7, arg0, arg2);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
    public final int method248(int arg0, int arg1, int arg2) {
        field3029++;
        int var4 = this.field3058;
        int var5 = -46 / ((-arg2 - 35) / 35);
        this.field3058 = 300;
        int var6 = this.field3028;
        this.field3028 = 1;
        this.field3049 = class146.method1168(-123);
        if (this.field3039[this.field3047] == 0L) {
            this.field3028 = var6;
            this.field3058 = var4;
        } else if (this.field3049 > this.field3039[this.field3047]) {
            this.field3058 = (int) ((long) (arg1 * 2560) / (this.field3049 - this.field3039[this.field3047]));
        }
        if (this.field3058 < 25) {
            this.field3058 = 25;
        }
        if (this.field3058 > 256) {
            this.field3058 = 256;
            this.field3028 = (int) ((long) arg1 - (this.field3049 - this.field3039[this.field3047]) / 10L);
        }
        if (this.field3028 > arg1) {
            this.field3028 = arg1;
        }
        this.field3039[this.field3047] = this.field3049;
        this.field3047 = (this.field3047 + 1) % 10;
        if (this.field3028 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field3039[var7] != 0L) {
                    this.field3039[var7] -= -((long) this.field3028);
                }
            }
        }
        int var8 = 0;
        if (this.field3028 < arg0) {
            this.field3028 = arg0;
        }
        class112.method913(1, (long) this.field3028);
        while (this.field3038 < 256) {
            this.field3038 += this.field3058;
            var8++;
        }
        this.field3038 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lkd;Lq;Lkd;I)Lde;")
    public static final class27 method1027(class73 arg0, class111 arg1, class73 arg2, int arg3) {
        int var4 = arg1.method905(arg2, (byte) -72);
        field3030++;
        int var5 = arg1.method902(arg3 + arg3, var4, arg0);
        return class49.method395(var4, var5, arg1, 106);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static final void method1028(int arg0) {
        if (arg0 != 255) {
            method1029(12);
        }
        class76.field1944 = new class61();
        field3040++;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public final void method247(int arg0) {
        field3042++;
        if (arg0 <= 38) {
            return;
        }
        this.field3038 = 0;
        this.field3028 = 1;
        this.field3058 = 256;
        this.field3049 = class146.method1168(-115);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3039[var2] = this.field3049;
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public static void method1029(int arg0) {
        field3053 = null;
        field3026 = null;
        field3034 = null;
        field3050 = null;
        field3046 = null;
        field3057 = null;
        if (arg0 != -13972) {
            field3035 = true;
        }
        field3037 = null;
        field3027 = null;
        field3031 = null;
        field3052 = null;
        field3056 = null;
        field3051 = null;
        field3044 = null;
        field3036 = null;
        field3048 = null;
        field3059 = null;
        field3033 = null;
        field3041 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public final void method246(int arg0) {
        field3045++;
        int var2 = 0;
        if (arg0 == 8670) {
            while (var2 < 10) {
                this.field3039[var2] = 0L;
                var2++;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class119() {
        this.method247(47);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1030(byte arg0, Component arg1) {
        field3055++;
        if (arg0 <= 42) {
            method1029(-96);
        }
        arg1.removeMouseListener(class71.field1795);
        arg1.removeMouseMotionListener(class71.field1795);
        arg1.removeFocusListener(class71.field1795);
    }
}
