import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class475 {

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    private int field6611;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    private int field6623;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    private int field6621;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    private int field6617;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    private int field6614;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    private int field6612;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    private int field6615;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    private int field6620;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    private int field6609;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    private int field6613;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "F")
    public static float field6610 = 1024.0F;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "Lqt;")
    public static class399 field6619;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Z")
    public static final boolean method2734(int arg0, int arg1) {
        int var2 = -65 / ((62 - arg0) / 32);
        field6608++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBII)Z")
    public final boolean method2735(int arg0, byte arg1, int arg2, int arg3) {
        field6618++;
        if (this.field6620 > arg0 || this.field6614 < arg0) {
            return false;
        } else if (this.field6612 > arg3 || this.field6615 < arg3) {
            return false;
        } else if (this.field6609 <= arg2 && this.field6613 >= arg2) {
            if (arg1 >= -124) {
                method2739();
            }
            int var5 = arg0 - this.field6611;
            int var6 = arg2 - this.field6623;
            return var5 * var5 + (var6 * var6) < this.field6621;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method2736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field6621 = arg5 * arg5;
        this.field6623 = arg4;
        field6622++;
        this.field6611 = arg3;
        this.field6617 = arg8;
        this.field6620 = this.field6611 + arg9;
        this.field6614 = this.field6611 + arg0;
        if (arg7 == 102) {
            this.field6613 = this.field6623 + arg2;
            this.field6612 = this.field6617 + arg6;
            this.field6615 = this.field6617 + arg1;
            this.field6609 = this.field6623 + arg10;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2737(int arg0, String arg1) {
        field6616++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        if (arg0 > -18) {
            method2737(21, null);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && var4 + 2 < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + '\n' - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 - 55;
                }
                char var9 = arg1.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - 48;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var10 + 10 - (97 - var9);
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 + '\n' - 65;
                }
                if (var11 != 0 && class68.method380((byte) var11, -97)) {
                    var2.append(class55.method322((byte) var11, (byte) 88));
                }
                var4 += 2;
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static void method2738(int arg0) {
        field6619 = null;
        if (arg0 != 2) {
            field6610 = 0.4449906F;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "()V")
    public static final void method2739() {
        for (int var0 = 0; var0 < class595.field8212.length; var0++) {
            class595.field8212[var0].method3530();
        }
        class595.field8212 = null;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field6611 = arg0;
        this.field6623 = arg2;
        this.field6621 = arg3 * arg3;
        this.field6617 = arg1;
        this.field6614 = this.field6611 + arg5;
        this.field6612 = this.field6617 + arg6;
        this.field6615 = this.field6617 + arg7;
        this.field6620 = this.field6611 + arg4;
        this.field6609 = this.field6623 + arg8;
        this.field6613 = this.field6623 + arg9;
    }
}
