import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class515 {

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "F")
    public float field7358 = 1.0F;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "F")
    public float field7364 = 1.0F;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "F")
    public float field7369 = 0.25F;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "F")
    public float field7365;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "F")
    public float field7360;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public int field7373;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public int field7367;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "F")
    public float field7368;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public int field7371;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public int field7370;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "Ldga;")
    public class190 field7374;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public int field7361;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "Lpr;")
    public static class407 field7366 = new class407(77, 4);

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "[[I")
    public static int[][] field7375 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Lqo;")
    public static class21 field7362;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 7)
    public static void method2944(int arg0) {
        field7362 = null;
        field7366 = null;
        field7375 = null;
        if (arg0 != 11) {
            field7357 = 81;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 77)
    public class515() {
        this.field7365 = 1.1523438F;
        this.field7360 = 1.2F;
        this.field7373 = -60;
        this.field7367 = class629.field8943;
        this.field7368 = 0.69921875F;
        this.field7371 = 0;
        this.field7370 = -50;
        this.field7359 = class126.field1422;
        this.field7374 = class205.field2503;
        this.field7361 = -50;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Liaa;)V", line = 93)
    public class515(class452 arg0) {
        int var2 = arg0.method2541(57);
        if (class601.field8530.method1320(26, class150.field1711) && class14.field135.method352() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field7359 = class126.field1422;
            } else {
                this.field7359 = arg0.method2575((byte) -48);
            }
            if ((var2 & 0x2) == 0) {
                this.field7365 = 1.1523438F;
            } else {
                this.field7365 = (float) arg0.method2574(-1758460248) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field7368 = 0.69921875F;
            } else {
                this.field7368 = (float) arg0.method2574(-1758460248) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field7360 = 1.2F;
            } else {
                this.field7360 = (float) arg0.method2574(-1758460248) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2575((byte) -48);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2574(-1758460248);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2574(-1758460248);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2574(-1758460248);
            }
            this.field7368 = 0.69921875F;
            this.field7365 = 1.1523438F;
            this.field7359 = class126.field1422;
            this.field7360 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field7370 = -50;
            this.field7373 = -60;
            this.field7361 = -50;
        } else {
            this.field7361 = arg0.method2549((byte) 32);
            this.field7373 = arg0.method2549((byte) 32);
            this.field7370 = arg0.method2549((byte) 32);
        }
        if ((var2 & 0x20) == 0) {
            this.field7367 = class629.field8943;
        } else {
            this.field7367 = arg0.method2575((byte) -48);
        }
        if ((var2 & 0x40) == 0) {
            this.field7371 = 0;
        } else {
            this.field7371 = arg0.method2574(-1758460248);
        }
        if ((var2 & 0x80) == 0) {
            this.field7374 = class205.field2503;
        } else {
            int var3 = arg0.method2574(-1758460248);
            int var4 = arg0.method2574(-1758460248);
            int var5 = arg0.method2574(-1758460248);
            int var6 = arg0.method2574(-1758460248);
            int var7 = arg0.method2574(-1758460248);
            int var8 = arg0.method2574(-1758460248);
            this.field7374 = class110.method683(var5, var6, var7, var3, var8, var4, (byte) 30);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Liaa;I)V", line = 37)
    public final void method2945(class452 arg0, int arg1) {
        this.field7364 = (float) (arg0.method2541(121) * 8) / 255.0F;
        field7363++;
        this.field7369 = (float) (arg0.method2541(91) * 8) / 255.0F;
        this.field7358 = (float) (arg0.method2541(arg1 + 74) * 8) / 255.0F;
        if (arg1 != 12) {
            this.method2946(null, 93);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lwm;I)Z", line = 52)
    public final boolean method2946(class515 arg0, int arg1) {
        if (arg1 != 12) {
            method2944(-66);
        }
        field7372++;
        return this.field7359 == arg0.field7359 && this.field7365 == arg0.field7365 && this.field7368 == arg0.field7368 && this.field7360 == arg0.field7360 && this.field7369 == arg0.field7369 && this.field7364 == arg0.field7364 && this.field7358 == arg0.field7358 && this.field7367 == arg0.field7367 && this.field7371 == arg0.field7371 && this.field7374 == arg0.field7374;
    }
}
