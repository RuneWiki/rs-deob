import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class389 {

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Ltl;")
    private class400 field5724 = new class400(64);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lui;")
    private class451 field5718;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Z")
    public static boolean field5719;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[I")
    public static int[] field5720;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Z")
    public static boolean field5717;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Z")
    public static volatile boolean field5722;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field5721;

    static {
        new class332("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field5719 = false;
        field5720 = new int[14];
        field5723 = -50;
        field5717 = false;
        field5725 = -60;
        field5722 = true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V", line = 10)
    public static void method2345(boolean arg0) {
        field5720 = null;
        if (arg0) {
            method2345(false);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lwp;", line = 27)
    public final class306 method2346(int arg0, int arg1) {
        field5721++;
        class400 var3 = this.field5724;
        class306 var4;
        synchronized (this.field5724) {
            var4 = (class306) this.field5724.method2393(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5718.method2691(arg0, arg1, arg1 ^ 0x5);
        class306 var6 = new class306();
        if (var5 != null) {
            var6.method1905(new class446(var5), false);
        }
        class400 var7 = this.field5724;
        synchronized (this.field5724) {
            this.field5724.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lug;)V", line = 68)
    public static final void method2347(class305 arg0) {
        for (int var1 = arg0.field4542; var1 <= arg0.field4541; var1++) {
            for (int var2 = arg0.field4547; var2 <= arg0.field4552; var2++) {
                class337 var3 = class170.field2427[arg0.field4545][var1][var2];
                if (var3 != null) {
                    class448 var4 = var3.field5054;
                    class448 var5 = null;
                    while (var4 != null) {
                        if (var4.field6343 == arg0) {
                            if (var5 == null) {
                                var3.field5054 = var4.field6340;
                            } else {
                                var5.field6340 = var4.field6340;
                            }
                            var4.method2647(false);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field6340;
                    }
                    var3.field5065 = 0;
                    for (class448 var6 = var3.field5054; var6 != null; var6 = var6.field6340) {
                        var3.field5065 = (byte) (var3.field5065 | var6.field6345);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 131)
    public class389(class430 arg0, int arg1, class451 arg2) {
        this.field5718 = arg2;
        this.field5718.method2662(5, (byte) -7);
    }
}
