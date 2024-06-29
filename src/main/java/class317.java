import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class317 extends class55 {

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    private int field4268;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    private int field4265;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    private int field4275;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    private int field4267;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    private int field4277;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public int field4270;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Lea;")
    public static class547 field4271 = new class547(121, -1);

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lfc;")
    public static class262 field4276 = new class262(8);

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method1892(int arg0) {
        field4271 = null;
        field4276 = null;
        if (arg0 != 1) {
            method1895(true, true, 19, true, 86);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)Z")
    public final boolean method1893(int arg0, int arg1, int arg2, int arg3) {
        field4260++;
        if (arg1 < 104) {
            this.field4277 = 122;
        }
        return this.field4268 == arg3 && arg2 >= this.field4265 && arg2 <= this.field4277 && arg0 >= this.field4275 && arg0 <= this.field4267;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Z")
    public final boolean method1894(int arg0, byte arg1, int arg2) {
        if (arg1 <= 32) {
            this.field4277 = 89;
        }
        field4266++;
        return this.field4262 <= arg0 && arg0 <= this.field4261 && this.field4270 <= arg2 && this.field4273 >= arg2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZIZI)I")
    public static final int method1895(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field4272++;
        class369 var5 = class190.method1059(arg2, arg0, 6);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field5172.length; var7++) {
            if (var5.field5172[var7] >= 0 && class761.field10628.field10364 > var5.field5172[var7]) {
                class697 var8 = class761.field10628.method4169(var5.field5172[var7], (byte) -121);
                int var9 = var8.method3939(arg4, (byte) -128, class482.field6654.method296((byte) 31, arg4).field1718);
                if (arg1) {
                    var6 += var5.field5171[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (!arg3) {
            method1892(-10);
        }
        return var6;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III[I)V")
    public final void method1896(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = arg2 + this.field4265 - this.field4262;
        arg3[arg1] = this.field4268;
        field4264++;
        arg3[2] = arg0 + this.field4275 - this.field4270;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Z")
    public final boolean method1897(int arg0, int arg1, int arg2) {
        if (arg0 > -94) {
            this.method1897(104, -50, -22);
        }
        field4274++;
        return arg1 >= this.field4265 && arg1 <= this.field4277 && this.field4275 <= arg2 && this.field4267 >= arg2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILni;I)Llv;")
    public static final class446 method1898(int arg0, int arg1, class522 arg2, int arg3) {
        field4263++;
        byte[] var4 = arg2.method2885(arg0, arg3, false);
        if (arg1 != -9252) {
            field4276 = null;
        }
        return var4 == null ? null : new class446(var4);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4268 = arg0;
        this.field4265 = arg1;
        this.field4273 = arg8;
        this.field4275 = arg2;
        this.field4267 = arg4;
        this.field4262 = arg5;
        this.field4277 = arg3;
        this.field4261 = arg7;
        this.field4270 = arg6;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(III[I)V")
    public final void method1899(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = 0;
        arg3[2] = this.field4270 + arg0 - this.field4275;
        arg3[1] = -this.field4265 - (-this.field4262 - arg1);
        field4269++;
        if (arg2 <= 43) {
            this.field4268 = 27;
        }
    }
}
