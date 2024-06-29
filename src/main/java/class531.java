import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class531 {

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public int field7483;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public int field7492;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field7496;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "B")
    public byte field7489;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    private int field7481;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Lwi;")
    private static class465[] field7476 = new class465[8];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public static int[] field7482 = new int[1];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field7475 = 2;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field7477;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field7478;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field7479;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field7480;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public int field7485;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public int field7488;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public int field7490;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public int field7491;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public int field7495;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lde;")
    public class531 field7484;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lkba;ZZ)V")
    public static final void method3094(class105 arg0, boolean arg1, boolean arg2) {
        arg0.field1263 = arg2;
        if (!class661.field9049) {
            class210.method1292(arg0, field7476);
        } else if (arg1) {
            class668.field9078[class668.field9078.length - 1].method2269(-1, arg0);
        } else {
            int var3 = class505.method2990(arg0.field1253);
            int var4 = class248.field3305[2] * arg0.method750((byte) 14) / arg0.field1260;
            int var5 = class505.method2990(arg0.field1253 - var4);
            int var6 = class505.method2990(arg0.field1253 + var4);
            if (var5 == var6) {
                class668.field9078[var3].method2269(-1, arg0);
            } else if (var6 - var5 == 1) {
                class668.field9078[class470.field6674 + var5].method2269(-1, arg0);
            } else {
                class668.field9078[class668.field9078.length - 1].method2269(-1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)Lde;")
    public final class531 method3095(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            this.field7492 = 125;
        }
        field7494++;
        return new class531(this.field7481, arg0, arg2, arg3, this.field7489);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLee;)Lwfa;")
    public static final class196 method3096(boolean arg0, class675 arg1) {
        field7486++;
        int var2 = arg1.method3757((byte) -65);
        class3 var3 = class759.method4211(-11911)[arg1.method3750((byte) 35)];
        class120 var4 = class720.method4047(25992)[arg1.method3750((byte) 35)];
        int var5 = arg1.method3706((byte) 117);
        if (arg0) {
            method3099(-28, true, null, 71, -42, 45, -102, -120);
        }
        int var6 = arg1.method3706((byte) 48);
        return new class196(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static void method3097(boolean arg0) {
        if (arg0) {
            field7482 = null;
            field7476 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Lef;")
    public final class487 method3098(int arg0) {
        if (arg0 != 24844) {
            method3099(-83, true, null, -7, -75, -104, 70, -39);
        }
        field7487++;
        return class488.method2915(this.field7481, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLjava/lang/String;IIIII)V")
    public static final void method3099(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7493++;
        class596 var8 = new class596();
        var8.field8377 = arg6;
        var8.field8382 = arg5;
        var8.field8378 = arg0;
        var8.field8380 = arg3;
        var8.field8375 = arg7;
        if (!arg1) {
            var8.field8379 = class740.field10285 + arg4;
            var8.field8381 = arg2;
            class251.field3369.method2307(0, var8);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIB)V")
    public class531(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field7483 = arg3;
        this.field7492 = arg1;
        this.field7496 = arg2;
        this.field7489 = arg4;
        this.field7481 = arg0;
    }
}
