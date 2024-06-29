import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class494 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Z")
    public boolean field7197 = false;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[[I")
    public static int[][] field7194 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field7196 = 1337;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public int field7198;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public int field7199;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lns;")
    public class277 field7207;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Z")
    public static boolean field7205;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZLqa;I)Lf;")
    public final class528 method2944(int arg0, boolean arg1, class162 arg2, int arg3) {
        field7203++;
        long var5 = (long) (arg3 << 16 | this.field7198 | (arg1 ? 262144 : 0) | arg2.field2452 << 19);
        if (arg0 >= -126) {
            this.field7198 = 72;
        }
        class528 var7 = (class528) this.field7207.field4006.method2339(-86, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field7207.field4002.method682(0, this.field7198)) {
            class158 var8 = class158.method1134(this.field7207.field4002, this.field7198, 0);
            if (var8 != null) {
                var8.field2389 = var8.field2392 = var8.field2387 = var8.field2385 = 0;
                if (arg1) {
                    var8.method1140();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method1131();
                }
            }
            class528 var10 = arg2.method517(var8, true);
            if (var10 != null) {
                this.field7207.field4006.method2342(var5, var10, -95);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)Lmd;")
    public static final class379 method2945(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7201++;
        int var7 = -105 / ((arg6 + 40) / 50);
        long var8 = (long) arg3 * 32147369L ^ (long) arg0 * 67481L ^ (long) arg5 * 97549L ^ (long) arg1 * 475427L ^ (long) arg2 * 986053L ^ (long) arg4 * 76724863L;
        class379 var10 = (class379) class20.field293.method2339(-115, var8);
        if (var10 == null) {
            class379 var11 = class14.field242.method432(arg0, arg5, arg1, arg2, arg3, arg4);
            class20.field293.method2342(var8, var11, 123);
            return var11;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIC)I")
    public static final int method2946(int arg0, int arg1, char arg2) {
        field7200++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if ((char) arg1 == arg2 && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lti;I)V")
    public final void method2947(class303 arg0, int arg1) {
        field7206++;
        while (true) {
            int var3 = arg0.method1918((byte) 124);
            if (var3 == 0) {
                if (arg1 < 77) {
                    this.method2950(-23, null, 107);
                    return;
                } else {
                    return;
                }
            }
            this.method2950(57, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method2948(int arg0) {
        if (arg0 != -2) {
            field7205 = false;
        }
        field7194 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Z")
    public final boolean method2949(int arg0) {
        field7195++;
        return arg0 == 0 ? this.field7207.field4002.method682(0, this.field7198) : false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILti;I)V")
    private final void method2950(int arg0, class303 arg1, int arg2) {
        if (arg2 == 1) {
            this.field7198 = arg1.method1868(0);
        } else if (arg2 == 2) {
            this.field7199 = arg1.method1866(false);
        } else if (arg2 == 3) {
            this.field7197 = true;
        } else if (arg2 == 4) {
            this.field7198 = -1;
        }
        int var4 = 26 % ((10 - arg0) / 33);
        field7204++;
    }

    static {
        new class180("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
