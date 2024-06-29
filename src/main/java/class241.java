import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public abstract class class241 extends class176 {

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public int field3354 = 127;

    @OriginalMember(owner = "client!oaa", name = "D", descriptor = "Z")
    public boolean field3361 = false;

    @OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
    public int field3366 = 0;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    public int field3356 = 3;

    @OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
    public int field3362 = 127;

    @OriginalMember(owner = "client!oaa", name = "M", descriptor = "Z")
    public boolean field3370 = true;

    @OriginalMember(owner = "client!oaa", name = "O", descriptor = "I")
    public int field3372 = 127;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    public int field3355 = 0;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "Z")
    public boolean field3358 = true;

    @OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
    public int field3360 = 0;

    @OriginalMember(owner = "client!oaa", name = "J", descriptor = "Z")
    public boolean field3367 = true;

    @OriginalMember(owner = "client!oaa", name = "K", descriptor = "I")
    public int field3368 = 2;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "Z")
    public boolean field3357 = true;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "Z")
    public boolean field3345 = true;

    @OriginalMember(owner = "client!oaa", name = "S", descriptor = "Z")
    public boolean field3376 = true;

    @OriginalMember(owner = "client!oaa", name = "R", descriptor = "Z")
    public boolean field3375 = true;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "Z")
    public boolean field3351 = false;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "Z")
    public boolean field3346 = true;

    @OriginalMember(owner = "client!oaa", name = "N", descriptor = "I")
    public int field3371 = 2;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    public int field3350 = 3;

    @OriginalMember(owner = "client!oaa", name = "Q", descriptor = "Z")
    public boolean field3374 = true;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
    public int field3359 = 2;

    @OriginalMember(owner = "client!oaa", name = "V", descriptor = "I")
    public int field3379 = 0;

    @OriginalMember(owner = "client!oaa", name = "W", descriptor = "Z")
    public boolean field3380 = false;

    @OriginalMember(owner = "client!oaa", name = "H", descriptor = "Z")
    public boolean field3365 = true;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public int field3348 = 1;

    @OriginalMember(owner = "client!oaa", name = "P", descriptor = "I")
    public int field3373 = 2;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "Z")
    public boolean field3364 = true;

    @OriginalMember(owner = "client!oaa", name = "U", descriptor = "I")
    public int field3378 = 0;

    @OriginalMember(owner = "client!oaa", name = "X", descriptor = "I")
    public int field3381 = 0;

    @OriginalMember(owner = "client!oaa", name = "Y", descriptor = "I")
    public int field3382 = 0;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "Z")
    public boolean field3344 = true;

    @OriginalMember(owner = "client!oaa", name = "ab", descriptor = "Lfj;")
    public static class564 field3384;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!oaa", name = "T", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!oaa", name = "Z", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!oaa", name = "bb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "Z")
    public boolean field3347;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "Z")
    public boolean field3349;

    @OriginalMember(owner = "client!oaa", name = "L", descriptor = "Z")
    public boolean field3369;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)Z")
    public final boolean method1502(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method1507(3, (byte) -46);
        }
        field3352++;
        return class202.method1226(arg1 ^ 0x40, arg0) ? this.field3347 : this.field3349;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZLdaa;)V")
    public final void method1503(boolean arg0, class11 arg1) {
        if (!arg0) {
            this.field3381 = -114;
        }
        field3385++;
        arg1.method108((byte) -128, 18);
        arg1.method108((byte) -128, this.field3350);
        arg1.method108((byte) -128, this.field3370 ? 1 : 0);
        arg1.method108((byte) -128, this.field3345 ? 1 : 0);
        arg1.method108((byte) -128, this.field3367 ? 1 : 0);
        arg1.method108((byte) -128, this.field3375 ? 1 : 0);
        arg1.method108((byte) -128, 0);
        arg1.method108((byte) -128, this.field3358 ? 1 : 0);
        arg1.method108((byte) -128, this.field3376 ? 1 : 0);
        arg1.method108((byte) -128, this.field3365 ? 1 : 0);
        arg1.method108((byte) -128, this.field3371);
        arg1.method108((byte) -128, this.field3381);
        arg1.method108((byte) -128, this.field3347 ? 1 : 0);
        arg1.method108((byte) -128, this.field3349 ? 1 : 0);
        arg1.method108((byte) -128, this.field3357 ? 1 : 0);
        arg1.method108((byte) -128, this.field3346 ? 1 : 0);
        arg1.method108((byte) -128, this.field3366);
        arg1.method108((byte) -128, this.field3364 ? 1 : 0);
        arg1.method108((byte) -128, this.field3372);
        arg1.method108((byte) -128, this.field3362);
        arg1.method108((byte) -128, this.field3354);
        arg1.method84(this.field3379, (byte) -127);
        arg1.method84(this.field3355, (byte) -118);
        arg1.method108((byte) -128, class633.method3677((byte) -89));
        arg1.method117(108, this.field3382);
        arg1.method108((byte) -128, this.field3359);
        arg1.method108((byte) -128, this.field3380 ? 1 : 0);
        arg1.method108((byte) -128, this.field3369 ? 1 : 0);
        arg1.method108((byte) -128, this.field3378);
        arg1.method108((byte) -128, this.field3351 ? 1 : 0);
        arg1.method108((byte) -128, this.field3344 ? 1 : 0);
        arg1.method108((byte) -128, this.field3348);
        arg1.method108((byte) -128, this.field3374 ? 1 : 0);
        arg1.method108((byte) -128, this.field3368);
        arg1.method108((byte) -128, this.field3373);
        arg1.method108((byte) -128, this.field3361 ? 1 : 0);
        arg1.method108((byte) -128, this.field3356);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lbea;I)V")
    public static final void method1504(class188 arg0, int arg1) {
        if (arg1 != -19588) {
            method1504(null, -23);
        }
        field3377++;
        class421 var2 = (class421) class480.field6765.method1242(0, (long) arg0.field607);
        if (var2 == null) {
            return;
        }
        if (var2.field5904 != null) {
            class204.field2869.method2731(var2.field5904);
            var2.field5904 = null;
        }
        var2.method1117(0);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
    public static void method1505(int arg0) {
        if (arg0 != 0) {
            method1504(null, -119);
        }
        field3384 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(III)V")
    public final void method1506(int arg0, int arg1, int arg2) {
        field3353++;
        if (class202.method1226(65, arg1)) {
            this.field3371 = arg2;
        } else {
            this.field3381 = arg2;
        }
        int var4 = -99 / ((arg0 + 28) / 34);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IB)I")
    public final int method1507(int arg0, byte arg1) {
        field3363++;
        if (arg1 < 26) {
            return -82;
        } else if (class202.method1226(65, arg0)) {
            return this.field3371;
        } else {
            return this.field3381;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZII)V")
    public final void method1508(boolean arg0, int arg1, int arg2) {
        field3383++;
        if (arg2 > -53) {
            this.field3362 = 72;
        }
        if (class202.method1226(65, arg1)) {
            this.field3347 = arg0;
        } else {
            this.field3349 = arg0;
        }
    }

    static {
        new class104("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        new class104("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field3384 = new class564();
    }
}
