import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class141 extends class181 {

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "Lli;")
    public static class185 field2639 = class245.method1649(":", -38);

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "[[I")
    public static int[][] field2642 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "Lli;")
    public static class185 field2643 = class245.method1649(")2", -7);

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Z")
    public static boolean field2647 = false;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "Ldl;")
    private class31 field2641;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2636;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "[I")
    public static int[] field2640;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lli;IB)Lli;")
    public final class185 method1009(class185 arg0, int arg1, byte arg2) {
        field2645++;
        if (this.field2641 == null) {
            return arg0;
        }
        if (arg2 < 116) {
            this.method1010(-12, -31, -32);
        }
        class229 var4 = (class229) this.field2641.method195(91, (long) arg1);
        return var4 == null ? arg0 : var4.field4169;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I")
    public final int method1010(int arg0, int arg1, int arg2) {
        field2637++;
        if (this.field2641 == null) {
            return arg0;
        } else if (arg2 == -3691) {
            class13 var4 = (class13) this.field2641.method195(85, (long) arg1);
            return var4 == null ? arg0 : var4.field226;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(Z)V")
    public static void method1011(boolean arg0) {
        if (arg0) {
            method1011(false);
        }
        field2643 = null;
        field2640 = null;
        field2639 = null;
        field2636 = null;
        field2642 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljd;B)V")
    public final void method1012(class118 arg0, byte arg1) {
        field2644++;
        if (arg1 != 47) {
            return;
        }
        while (true) {
            int var3 = arg0.method867(false);
            if (var3 == 0) {
                return;
            }
            this.method1013(7, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILjd;)V")
    private final void method1013(int arg0, int arg1, class118 arg2) {
        if (arg0 != 7) {
            method1011(false);
        }
        field2646++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg2.method867(false);
        if (this.field2641 == null) {
            int var5 = class82.method540(false, var4);
            this.field2641 = new class31(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method867(false) == 1;
            int var8 = arg2.method873((byte) -108);
            class73 var9;
            if (var7) {
                var9 = new class229(arg2.method865(9199));
            } else {
                var9 = new class13(arg2.method875((byte) 25));
            }
            this.field2641.method190(var9, (byte) -106, (long) var8);
        }
    }
}
