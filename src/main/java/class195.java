import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class class195 extends class697 {

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "S")
    public short field3061;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "S")
    public short field3063;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "Lsk;")
    public static class578 field3065 = new class578();

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "Lja;")
    public static class254 field3067 = new class254(6, 0, 4, 2);

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)Z")
    public final boolean method838(byte arg0) {
        if (arg0 < 4) {
            this.method835((class9[]) null, (byte) -83);
        }
        ++field3056;
        return class523.method3071(this.method530(-104), false, super.field9806 >> class30.field940, super.field9804, super.field9815 >> class30.field940);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        ++field3058;
        if (arg1 == -1008) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([Lff;B)I")
    public final int method835(class9[] arg0, byte arg1) {
        if (arg1 < 102) {
            return 117;
        } else {
            ++field3059;
            return this.method3896(super.field9815 >> class30.field940, arg0, 48, super.field9806 >> class30.field940);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)Z")
    public final boolean method836(boolean arg0) {
        if (!arg0) {
            this.method838((byte) -67);
        }
        ++field3064;
        return class224.field3361[(super.field9806 >> class30.field940) + class643.field9239 + -class547.field7768][(super.field9815 >> class30.field940) + class643.field9239 + -class318.field4685];
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)I")
    public static final int method1401(int arg0, int arg1, int arg2, int arg3) {
        ++field3057;
        if (~arg1 == ~arg3) {
            return arg3;
        } else {
            int var4 = -arg0 + 128;
            int var5 = (127 & arg1) * arg0 + (arg3 & 127) * var4 >> 7;
            int var6 = (896 & arg1) * arg0 + (896 & arg3) * var4 >> 7;
            if (arg2 >= -85) {
                method1402(false);
            }
            int var7 = (64512 & arg1) * arg0 + (64512 & arg3) * var4 >> 7;
            return var7 & 64512 | var6 & 896 | var5 & 127;
        }
    }

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        ++field3055;
        if (arg0 >= -15) {
            this.method448(-61);
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(Z)V")
    public static void method1402(boolean arg0) {
        field3065 = null;
        field3067 = null;
        if (arg0) {
            field3066 = -99;
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        if (arg0 > -12) {
            field3062 = 9;
        }
        ++field3060;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IIIIIII)V")
    public class195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3061 = (short) arg6;
        super.field9804 = (byte) arg4;
        super.field9815 = arg2;
        super.field9809 = arg1;
        this.field3063 = (short) arg5;
        super.field9806 = arg0;
        super.field9814 = (byte) arg3;
    }
}
