import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class408 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lo;")
    public class393 field6108 = new class393();

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
    public static int[] field6111 = new int[50];

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
    public static boolean field6114 = false;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "[Z")
    public static boolean[] field6122 = new boolean[5];

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lo;")
    private class393 field6117;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Lo;")
    public final class393 method2647(byte arg0) {
        field6116++;
        class393 var2 = this.field6108.field5895;
        if (this.field6108 == var2) {
            return null;
        }
        var2.method2574((byte) 125);
        if (arg0 != 93) {
            method2655('A', -42);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lo;")
    public final class393 method2648(int arg0) {
        field6120++;
        if (arg0 != -5525) {
            return null;
        }
        class393 var2 = this.field6117;
        if (this.field6108 == var2) {
            this.field6117 = null;
            return null;
        } else {
            this.field6117 = var2.field5898;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lo;")
    public final class393 method2649(int arg0) {
        field6118++;
        class393 var2 = this.field6108.field5895;
        if (this.field6108 == var2) {
            this.field6117 = null;
            return null;
        } else {
            this.field6117 = var2.field5895;
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static void method2650(int arg0) {
        field6111 = null;
        if (arg0 != 0) {
            method2655('>', -57);
        }
        field6122 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILmi;)V")
    public final void method2651(int arg0, class408 arg1) {
        field6109++;
        this.method2653(arg1, this.field6108.field5895, 121);
        int var3 = 4 % ((arg0 - 58) / 46);
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)I")
    public final int method2652(int arg0) {
        field6119++;
        int var2 = 0;
        class393 var3 = this.field6108.field5895;
        int var4 = -32 / ((arg0 + 23) / 55);
        while (this.field6108 != var3) {
            var2++;
            var3 = var3.field5895;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lmi;Lo;I)V")
    private final void method2653(class408 arg0, class393 arg1, int arg2) {
        field6115++;
        class393 var4 = this.field6108.field5898;
        this.field6108.field5898 = arg1.field5898;
        arg1.field5898.field5895 = this.field6108;
        if (arg2 <= 115) {
            field6111 = null;
        }
        if (this.field6108 != arg1) {
            arg1.field5898 = arg0.field6108.field5898;
            arg1.field5898.field5895 = arg1;
            arg0.field6108.field5898 = var4;
            var4.field5895 = arg0.field6108;
        }
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
    public final void method2654(int arg0) {
        field6125++;
        if (arg0 != 0) {
            this.method2656(-74);
        }
        while (true) {
            class393 var2 = this.field6108.field5895;
            if (this.field6108 == var2) {
                this.field6117 = null;
                return;
            }
            var2.method2574((byte) 123);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(CI)Z")
    public static final boolean method2655(char arg0, int arg1) {
        field6121++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class312.method1946(arg0, 18768)) {
            return true;
        } else {
            char[] var2 = class275.field4036;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class252.field3661;
            for (int var5 = arg1; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)Lo;")
    public final class393 method2656(int arg0) {
        field6110++;
        if (arg0 != 0) {
            return null;
        }
        class393 var2 = this.field6117;
        if (this.field6108 == var2) {
            this.field6117 = null;
            return null;
        } else {
            this.field6117 = var2.field5895;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)Z")
    public final boolean method2657(int arg0) {
        field6112++;
        int var2 = 97 % ((arg0 - 72) / 48);
        return this.field6108.field5895 == this.field6108;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class408() {
        this.field6108.field5898 = this.field6108;
        this.field6108.field5895 = this.field6108;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lo;I)V")
    public final void method2658(class393 arg0, int arg1) {
        field6107++;
        if (arg1 != 0) {
            field6111 = null;
        }
        if (arg0.field5898 != null) {
            arg0.method2574((byte) 126);
        }
        arg0.field5898 = this.field6108;
        arg0.field5895 = this.field6108.field5895;
        arg0.field5898.field5895 = arg0;
        arg0.field5895.field5898 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)Lo;")
    public final class393 method2659(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field6113++;
        class393 var2 = this.field6108.field5898;
        if (this.field6108 == var2) {
            this.field6117 = null;
            return null;
        } else {
            this.field6117 = var2.field5898;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLo;)V")
    public final void method2660(byte arg0, class393 arg1) {
        if (arg1.field5898 != null) {
            arg1.method2574((byte) 123);
        }
        if (arg0 > -119) {
            return;
        }
        field6124++;
        arg1.field5895 = this.field6108;
        arg1.field5898 = this.field6108.field5898;
        arg1.field5898.field5895 = arg1;
        arg1.field5895.field5898 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V")
    public static final void method2661(int arg0) {
        field6123++;
        int var1 = arg0;
        for (int var2 = 0; var2 < class324.field4652; var2++) {
            for (int var3 = 0; var3 < class336.field4964; var3++) {
                if (class214.method1348(var1, true, class343.field5032, -27508, var3, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
