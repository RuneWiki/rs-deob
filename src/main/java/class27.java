import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class27 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "F")
    public float field345 = 1.0F;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "F")
    public float field361 = 0.25F;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "F")
    public float field362 = 1.0F;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lrc;")
    public class346 field355;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "F")
    public float field347;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "F")
    public float field351;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "F")
    public float field353;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Lrc;")
    public static class346 field357;

    static {
        new class206("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field365 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILbt;)V", line = 5)
    public final void method155(int arg0, class32 arg1) {
        this.field362 = (float) (arg1.method201((byte) -112) * 8) / 255.0F;
        field346++;
        this.field361 = (float) (arg1.method201((byte) -125) * 8) / 255.0F;
        this.field345 = (float) (arg1.method201((byte) -125) * 8) / 255.0F;
        if (arg0 != -7125) {
            method159((byte) -96);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILnk;)V", line = 18)
    public static final void method156(int arg0, class464 arg1) {
        if (arg1.field6358 == 5 && arg1.field6402 != -1) {
            class472.method2771(-16777216, class98.field1432, arg1);
        }
        if (arg0 > -124) {
            field357 = null;
        }
        field350++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)Ldg;", line = 31)
    public static final class261 method157(int arg0, byte arg1, int arg2) {
        field354++;
        if (arg1 > -116) {
            return null;
        }
        class261 var3 = new class261();
        var3.field3469 = -1;
        var3.field3472 = arg0 + 1 + 5;
        var3.field3456 = arg2 + 5 + 1;
        var3.field3451 = -1;
        var3.field3454 = new int[var3.field3456][var3.field3472];
        var3.method1469(-108);
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLbh;)Z", line = 52)
    public final boolean method158(byte arg0, class27 arg1) {
        int var3 = 114 / ((arg0 + 82) / 36);
        field348++;
        return this.field358 == arg1.field358 && this.field353 == arg1.field353 && this.field347 == arg1.field347 && this.field351 == arg1.field351 && this.field361 == arg1.field361 && this.field362 == arg1.field362 && this.field345 == arg1.field345 && this.field364 == arg1.field364 && this.field352 == arg1.field352 && this.field355 == arg1.field355;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 124)
    public class27() {
        this.field356 = -60;
        this.field349 = -50;
        this.field364 = class483.field6661;
        this.field352 = 0;
        this.field358 = class425.field5768;
        this.field363 = -50;
        this.field355 = class36.field546;
        this.field347 = 0.69921875F;
        this.field351 = 1.2F;
        this.field353 = 1.1523438F;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lbt;)V", line = 140)
    public class27(class32 arg0) {
        int var2 = arg0.method201((byte) -108);
        if (class488.field6789.field6696 && class453.field6147.method1977() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field358 = class425.field5768;
            } else {
                this.field358 = arg0.method222(1024);
            }
            if ((var2 & 0x2) == 0) {
                this.field353 = 1.1523438F;
            } else {
                this.field353 = (float) arg0.method215((byte) 89) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field347 = 0.69921875F;
            } else {
                this.field347 = (float) arg0.method215((byte) 126) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field351 = 1.2F;
            } else {
                this.field351 = (float) arg0.method215((byte) 113) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method222(1024);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method215((byte) 99);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method215((byte) 103);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method215((byte) 118);
            }
            this.field358 = class425.field5768;
            this.field353 = 1.1523438F;
            this.field351 = 1.2F;
            this.field347 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field356 = -60;
            this.field349 = -50;
            this.field363 = -50;
        } else {
            this.field349 = arg0.method209((byte) 35);
            this.field356 = arg0.method209((byte) 35);
            this.field363 = arg0.method209((byte) 35);
        }
        if ((var2 & 0x20) == 0) {
            this.field364 = class483.field6661;
        } else {
            this.field364 = arg0.method222(1024);
        }
        if ((var2 & 0x40) == 0) {
            this.field352 = 0;
        } else {
            this.field352 = arg0.method215((byte) 116);
        }
        if ((var2 & 0x80) == 0) {
            this.field355 = class36.field546;
        } else {
            this.field355 = class215.method1214(arg0.method215((byte) 114), arg0.method215((byte) 114), 64, arg0.method215((byte) 117), arg0.method215((byte) 102), arg0.method215((byte) 127), arg0.method215((byte) 98));
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 81)
    public static void method159(byte arg0) {
        if (arg0 != -106) {
            field359 = -52;
        }
        field357 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIII)Z", line = 96)
    public static final boolean method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field360++;
        if (arg3 >= (arg5 + arg7) || (arg3 + arg8) <= arg5) {
            return false;
        } else if ((arg0 + arg2) > arg1 && arg2 < arg1 + arg6) {
            if (arg4 != -50) {
                method157(1, (byte) 45, 18);
            }
            return true;
        } else {
            return false;
        }
    }
}
