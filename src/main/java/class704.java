import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class704 extends class396 {

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    private int field9815;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    private int field9813;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    private int field9819;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    private int field9822;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "[I")
    public static int[] field9818 = new int[1];

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field9812 = 0;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lgj;")
    public static class660 field9814;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)V")
    public final void method1583(int arg0, int arg1, int arg2) {
        if (arg1 != 126) {
            method3986(62, (class494) null);
        }
        ++field9821;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method3984(byte arg0) {
        if (arg0 == 102) {
            field9818 = null;
            field9814 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public final void method1584(int arg0, int arg1, int arg2) {
        ++field9816;
        int var4 = this.field9815 * arg1 >> 12;
        int var5 = this.field9822 * arg1 >> 12;
        int var6 = this.field9813 * arg0 >> 12;
        if (arg2 != -1791337721) {
            this.method1583(-61, 20, 44);
        }
        int var7 = this.field9819 * arg0 >> 12;
        class418.method2539(super.field5448, var4, (byte) 74, var5, var7, var6);
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(III)Lcja;")
    public static final class46 method3985(int arg0, int arg1, int arg2) {
        if (class767.field10562[arg0][arg1][arg2] == null) {
            boolean var3 = class767.field10562[0][arg1][arg2] != null && class767.field10562[0][arg1][arg2].field583 != null;
            if (var3 && arg0 >= class562.field7990 - 1) {
                return null;
            }
            class442.method2638(arg0, arg1, arg2);
        }
        return class767.field10562[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIII)V")
    public class704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field9815 = arg0;
        this.field9813 = arg1;
        this.field9819 = arg3;
        this.field9822 = arg2;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
    public final void method1580(int arg0, int arg1, int arg2) {
        ++field9820;
        if (arg1 >= -5) {
            field9818 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILso;)Lht;")
    public static final class606 method3986(int arg0, class494 arg1) {
        ++field9817;
        class253 var2 = class68.method576(arg1, 115);
        if (arg0 != 0) {
            method3985(84, 20, 64);
        }
        int var3 = arg1.method2988(-3);
        return new class606(var2.field9843, var2.field9845, var2.field9838, var2.field9832, var2.field9833, var2.field9837, var2.field9834, var2.field9840, var2.field9835, var2.field3728, var2.field3721, var2.field3726, var2.field3724, var2.field3720, var2.field3725, var3);
    }
}
