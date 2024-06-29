import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class379 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public int field5605 = 0;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public int field5616 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Laj;")
    private class287 field5607 = new class287(64);

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "Lwb;")
    private class303 field5617 = null;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Lom;")
    private class344 field5615;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Lom;")
    private class344 field5613;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field5609 = -1;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field5612 = 100;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Lrm;")
    public static class379 field5606;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Z")
    public static boolean field5611;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(CI)C")
    public static final char method2367(char arg0, int arg1) {
        field5614++;
        if (arg1 != 19848) {
            field5611 = false;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(JILja;[I)Ljava/lang/String;")
    public final String method2368(long arg0, int arg1, class254 arg2, int[] arg3) {
        field5608++;
        if (this.field5617 != null) {
            String var6 = this.field5617.method877(arg0, -76, arg3, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg1 != -12821) {
            method2370(false);
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)Lvg;")
    public final class49 method2369(int arg0, byte arg1) {
        if (arg1 != -62) {
            return null;
        }
        field5610++;
        class49 var3 = (class49) this.field5607.method1900((long) arg0, -93);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field5615.method2216(1, arg0 & 0x7FFF, true);
        } else {
            var4 = this.field5613.method2216(1, arg0, true);
        }
        class49 var5 = new class49();
        var5.field1168 = this;
        if (var4 != null) {
            var5.method609(new class61(var4), -74);
        }
        if (arg0 >= 32768) {
            var5.method606(0);
        }
        this.field5607.method1904(var5, (long) arg0, -1);
        return var5;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
    public static void method2370(boolean arg0) {
        field5606 = null;
        if (!arg0) {
            method2371(27, null);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILan;)I")
    public static final int method2371(int arg0, class22 arg1) {
        field5604++;
        class334 var2 = arg1.field880;
        if (arg0 != -161) {
            method2367('b', 95);
        }
        if (var2.field4984 != null) {
            var2 = var2.method2150(class113.field2038, -32224);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4949;
        class658 var4 = arg1.method3465(0);
        if (arg1.field8748) {
            var3 = var2.field4942;
        } else if (arg1.field8766 == var4.field9467 || arg1.field8766 == var4.field9472 || arg1.field8766 == var4.field9474 || arg1.field8766 == var4.field9484) {
            var3 = var2.field4973;
        } else if (arg1.field8766 == var4.field9454 || arg1.field8766 == var4.field9480 || arg1.field8766 == var4.field9462 || arg1.field8766 == var4.field9451) {
            var3 = var2.field4958;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(ILom;Lom;Lwb;)V")
    public class379(int arg0, class344 arg1, class344 arg2, class303 arg3) {
        this.field5615 = arg2;
        this.field5613 = arg1;
        this.field5617 = arg3;
        if (this.field5613 != null) {
            this.field5605 = this.field5613.method2236(1, 0);
        }
        if (this.field5615 != null) {
            this.field5616 = this.field5615.method2236(1, 0);
        }
    }
}
