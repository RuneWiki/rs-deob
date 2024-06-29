import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class class631 {

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "F")
    public static float field8710 = 0.0F;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "[I")
    public static int[] field8712 = new int[2];

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "Lkg;")
    public static class275 field8713 = new class275(0, 6);

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "Lkg;")
    public static class275 field8714 = new class275(26, 6);

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "Lhg;")
    public static class693 field8715 = new class693(41, -1);

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "Lhg;")
    public static class693 field8716 = new class693(40, 2);

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    public static int field8717 = 0;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field8707;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public abstract void method594(int arg0);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lpda;)V")
    public abstract void method604(class631 arg0);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V")
    public abstract void method596(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III[I)V")
    public abstract void method606(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)V")
    public abstract void method601(int arg0);

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
    public abstract void method590(int arg0);

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)V")
    public static void method3543(int arg0) {
        if (arg0 != -13187) {
            field8717 = 8;
        }
        field8707 = null;
        field8712 = null;
        field8715 = null;
        field8714 = null;
        field8713 = null;
        field8716 = null;
    }

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "(I)V")
    public abstract void method598(int arg0);

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(III)V")
    public abstract void method600(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "()Lpda;")
    public abstract class631 method611();

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(III[I)V")
    public abstract void method599(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "()V")
    public abstract void method595();

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([I)V")
    public abstract void method597(int[] arg0);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIII)V")
    public abstract void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZB)Z")
    public static final boolean method3544(boolean arg0, byte arg1) {
        field8711++;
        int var2 = 39 % ((arg1 + 32) / 35);
        boolean var3 = class386.field4930.method442();
        if (var3 == arg0) {
            return true;
        }
        if (!arg0) {
            class386.field4930.method466();
        } else if (!class386.field4930.method476()) {
            arg0 = false;
        }
        if (arg0 == var3) {
            return false;
        } else {
            class748.field10451.method4150(class748.field10451.field10416, arg0 ? 1 : 0, -5);
            class472.method2688(-127);
            return true;
        }
    }

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "(I)V")
    public abstract void method610(int arg0);

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(III[I)V")
    public abstract void method593(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "(I)V")
    public abstract void method608(int arg0);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIII)I")
    public static final int method3545(int arg0, int arg1, int arg2, int arg3) {
        field8708++;
        if (class553.field7719 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class73.field1041;
        int var7 = arg0 - class73.field1042;
        for (class344 var8 = (class344) class73.field1026.method3672(arg1); var8 != null; var8 = (class344) class73.field1026.method3662(arg1)) {
            if (var8.field4349 == arg2) {
                int var9 = var8.field4353;
                int var10 = var8.field4347;
                int var11 = class73.field1042 + var10 | class73.field1041 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }
}
