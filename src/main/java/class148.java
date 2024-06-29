import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class148 extends class182 {

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public int field2708 = 0;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "Lkh;")
    public static class117 field2705 = class224.method1450((byte) -112, "T");

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "[I")
    public static int[] field2704 = new int[1000];

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "[Z")
    public static boolean[] field2706 = new boolean[200];

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lah;B)Z")
    public static final boolean method1060(class9 arg0, byte arg1) {
        field2701++;
        if (class103.field1882) {
            if (class187.method1269(arg0, (byte) 16) != 0) {
                return false;
            }
            if (arg0.field225 == 0) {
                return false;
            }
        }
        int var2 = 63 % ((-arg1 - 34) / 47);
        return arg0.field290;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)V")
    public static void method1061(byte arg0) {
        field2705 = null;
        field2704 = null;
        if (arg0 > -23) {
            field2706 = null;
        }
        field2706 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnc;I)V")
    public final void method1062(class145 arg0, int arg1) {
        field2699++;
        while (true) {
            int var3 = arg0.method998(125);
            if (var3 == 0) {
                if (arg1 == 26161) {
                    return;
                } else {
                    field2704 = null;
                    return;
                }
            }
            this.method1064(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)Lud;")
    public static final class223 method1063(int arg0, byte arg1) {
        class223 var2 = (class223) class28.field688.method506(1, (long) arg0);
        field2702++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field580.method104(-40, arg0, 0);
        if (var3 == null) {
            return null;
        }
        class223 var4 = new class223();
        class145 var5 = new class145(var3);
        var5.field2643 = var5.field2613.length - 2;
        int var6 = var5.method1049((byte) 94);
        int var7 = var5.field2613.length - var6 - 2 - 12;
        var5.field2643 = var7;
        int var8 = var5.method1018(-1068451600);
        var4.field4026 = var5.method1049((byte) 108);
        var4.field4027 = var5.method1049((byte) 118);
        var4.field4034 = var5.method1049((byte) 102);
        var4.field4032 = var5.method1049((byte) 119);
        int var9 = var5.method998(112);
        if (var9 > 0) {
            var4.field4017 = new class62[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1049((byte) 105);
                class62 var12 = new class62(class68.method479(var11, 74));
                var4.field4017[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1018(-1068451600);
                    int var14 = var5.method1018(-1068451600);
                    var12.method461((long) var13, (byte) -14, new class123(var14));
                }
            }
        }
        int var15 = 0;
        var5.field2643 = 0;
        var4.field4022 = var5.method1030(-128);
        var4.field4016 = new int[var8];
        var4.field4033 = new int[var8];
        var4.field4030 = new class117[var8];
        if (arg1 != 50) {
            method1060(null, (byte) 45);
        }
        while (var7 > var5.field2643) {
            int var16 = var5.method1049((byte) 99);
            if (var16 == 3) {
                var4.field4030[var15] = var5.method1038(arg1 - 36);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4016[var15] = var5.method998(arg1 + 54);
            } else {
                var4.field4016[var15] = var5.method1018(arg1 - 1068451650);
            }
            var4.field4033[var15++] = var16;
        }
        class28.field688.method497((long) arg0, var4, -118);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILnc;Z)V")
    private final void method1064(int arg0, class145 arg1, boolean arg2) {
        field2700++;
        if (arg0 == 2) {
            this.field2708 = arg1.method1049((byte) 106);
        }
        if (arg2) {
            method1063(-75, (byte) 102);
        }
    }
}
