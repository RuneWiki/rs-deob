import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class211 {

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public int field3035 = 0;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public int field3034 = 2048;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public int field3037 = 0;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public int field3042 = 2048;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Luv;")
    public static class2 field3033 = new class2(68, 14);

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Z")
    public static boolean field3036;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[[I")
    public static int[][] field3041;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static void method1360(byte arg0) {
        if (arg0 != 56) {
            field3033 = null;
        }
        field3033 = null;
        field3041 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILgk;Z)V")
    private final void method1361(int arg0, class468 arg1, boolean arg2) {
        if (!arg2) {
            this.field3042 = -80;
        }
        field3040++;
        if (arg0 == 1) {
            this.field3037 = arg1.method2765(114);
        } else if (arg0 == 2) {
            this.field3034 = arg1.method2727((byte) 43);
        } else if (arg0 == 3) {
            this.field3042 = arg1.method2727((byte) 43);
        } else if (arg0 == 4) {
            this.field3035 = arg1.method2745(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V")
    public static final void method1362(int arg0, int arg1, int arg2) {
        class306 var3 = class236.field3305[arg0][arg1][arg2];
        if (var3 != null && var3.field4577 != null) {
            var3.field4577 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLgo;Z)V")
    public static final void method1363(boolean arg0, class310 arg1, boolean arg2) {
        field3039++;
        if (arg0) {
            return;
        }
        int var3 = arg1.field4637 == 0 ? arg1.field4661 : arg1.field4637;
        int var4 = arg1.field4749 == 0 ? arg1.field4736 : arg1.field4749;
        class378.method2232(arg2, class174.field2549[arg1.field4643 >> 16], -1, var3, arg1.field4643, var4);
        if (arg1.field4788 != null) {
            class378.method2232(arg2, arg1.field4788, -1, var3, arg1.field4643, var4);
        }
        class313 var5 = (class313) class312.field4840.method3059(103, (long) arg1.field4643);
        if (var5 != null) {
            class152.method1097(-1, var4, arg2, var5.field4852, var3);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lgk;B)V")
    public final void method1364(class468 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2765(87);
            if (var3 == 0) {
                field3038++;
                int var4 = -56 / ((-arg1 - 1) / 59);
                return;
            }
            this.method1361(var3, arg0, true);
        }
    }
}
