import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class195 extends class202 {

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field3116 = 0;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field3122 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "[C")
    public static char[] field3119 = new char[128];

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "Lpj;")
    public static class249 field3123;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "[[[B")
    public static byte[][][] field3115;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILqh;)V")
    public static final void method1327(int arg0, class201 arg1) {
        field3118++;
        class43.field790 = arg1.method1373(96, "titlebg");
        if (arg0 > -101) {
            method1328(-80, true);
        }
        class24.field402 = arg1.method1373(-87, "logo");
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
    public static final void method1328(int arg0, boolean arg1) {
        field3120++;
        if (arg0 <= -40 && arg1 != class201.field3208) {
            class201.field3208 = arg1;
            class109.method798((byte) -93);
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    public static void method1329(int arg0) {
        if (arg0 < 105) {
            field3116 = -27;
        }
        field3119 = null;
        field3123 = null;
        field3115 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lf;IZ)V")
    public static final void method1330(class36 arg0, int arg1, boolean arg2) {
        field3121++;
        int var3 = arg0.field602 == 0 ? arg0.field676 : arg0.field602;
        int var4 = arg0.field674 == 0 ? arg0.field642 : arg0.field674;
        class259.method1765(var3, arg2, var4, arg0.field648, arg1 ^ 0xBE28C70A, class136.field2250[arg0.field648 >> 16]);
        if (arg0.field658 != null) {
            class259.method1765(var3, arg2, var4, arg0.field648, arg1 ^ 0xBE28C71B, arg0.field658);
        }
        if (arg1 != -1104623792) {
            field3115 = null;
        }
        class258 var5 = (class258) class128.field2062.method1400((long) arg0.field648, true);
        if (var5 != null) {
            class190.method1299(var3, var4, arg1 + 1104623792, var5.field4100, arg2);
        }
    }
}
