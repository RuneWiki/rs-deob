import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class194 {

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    private int field2596 = 0;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Lefa;")
    private class322 field2603;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
    public static int[] field2602 = new int[3];

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public static int field2608 = 1;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "[I")
    public static int[] field2599 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2605 = new String[5];

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Liba;")
    public static class211 field2600 = new class211(35, 6);

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "Ldu;")
    private class381 field2604;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Z")
    public static boolean field2597;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Ldu;")
    public final class381 method1257(byte arg0) {
        field2606++;
        if (this.field2596 > 0 && this.field2603.field4693[this.field2596 - 1] != this.field2604) {
            class381 var2 = this.field2604;
            this.field2604 = var2.field5737;
            return var2;
        }
        while (this.field2596 < this.field2603.field4685) {
            class381 var4 = this.field2603.field4693[this.field2596++].field5737;
            if (this.field2603.field4693[this.field2596 - 1] != var4) {
                this.field2604 = var4.field5737;
                return var4;
            }
        }
        int var3 = -40 % ((69 - arg0) / 35);
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
    public static void method1258(byte arg0) {
        field2599 = null;
        if (arg0 == -41) {
            field2602 = null;
            field2605 = null;
            field2600 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
    public static final int method1259(int arg0) {
        int var1 = -115 / ((arg0 - 12) / 61);
        field2601++;
        return class199.field2714.method3309(255);
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
    public class194() {
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Ldu;")
    public final class381 method1260(int arg0) {
        if (arg0 < 13) {
            return null;
        } else {
            this.field2596 = 0;
            field2607++;
            return this.method1257((byte) 126);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lefa;)V")
    public class194(class322 arg0) {
        this.field2603 = arg0;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Lps;")
    public static final class5 method1261(int arg0, int arg1, int arg2) {
        field2598++;
        class5 var3 = class705.method3944(arg0, (byte) 119);
        if (arg2 != 6) {
            method1258((byte) 83);
        }
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field109 == null || var3.field109.length <= arg1) {
            return null;
        } else {
            return var3.field109[arg1];
        }
    }
}
