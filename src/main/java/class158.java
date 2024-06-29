import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class158 {

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public int field2343 = 0;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public int field2350 = 0;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "Z")
    private boolean field2354 = false;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "Lada;")
    public static class144 field2349 = new class144(34, -2);

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "Lbu;")
    public static class19 field2358;

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "[I")
    public static int[] field2359;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    private int field2355;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    public int field2356;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "J")
    public long field2345;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public final void method1134(int arg0) {
        field2339++;
        if (arg0 != -21011) {
            method1136(-119);
        }
        this.field2353 = class589.field8735[this.field2355 << 3];
        this.field2351 = (int) Math.sqrt((double) (this.field2341 * this.field2341 + (this.field2344 * this.field2344 + (this.field2348 * this.field2348))));
        if (this.field2346 == 0) {
            this.field2346 = 1;
        }
        if (this.field2356 == 0) {
            this.field2345 = 2147483647L;
        } else if (this.field2356 == 1) {
            this.field2345 = (this.field2351 * 8 / this.field2346);
            this.field2345 *= this.field2345;
        } else if (this.field2356 == 2) {
            this.field2345 = (this.field2351 * 8 / this.field2346);
        }
        if (this.field2354) {
            this.field2351 *= -1;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lgw;II)V")
    private final void method1135(class148 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2355 = arg0.method1045(true);
        } else if (arg1 == 2) {
            arg0.method1032((byte) -33);
        } else if (arg1 == 3) {
            this.field2344 = arg0.method1026(arg2 ^ 0x36ACC302);
            this.field2348 = arg0.method1026(-917302120);
            this.field2341 = arg0.method1026(-917302120);
        } else if (arg1 == 4) {
            this.field2356 = arg0.method1032((byte) -33);
            this.field2346 = arg0.method1026(-917302120);
        } else if (arg1 == 6) {
            this.field2342 = arg0.method1032((byte) -33);
        } else if (arg1 == 8) {
            this.field2350 = 1;
        } else if (arg1 == 9) {
            this.field2343 = 1;
        } else if (arg1 == 10) {
            this.field2354 = true;
        }
        field2347++;
        if (arg2 != -10342) {
            this.field2345 = -16L;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
    public static void method1136(int arg0) {
        field2358 = null;
        field2359 = null;
        if (arg0 != 1) {
            method1136(-96);
        }
        field2349 = null;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
    public static final void method1137(int arg0, int arg1) {
        field2352++;
        class221 var2 = class65.method413(arg0, arg1, (byte) 106);
        var2.method1432(0);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILgw;)V")
    public final void method1138(int arg0, class148 arg1) {
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                field2340++;
                if (arg0 != 8) {
                    method1136(125);
                    return;
                }
                return;
            }
            this.method1135(arg1, var3, -10342);
        }
    }

    static {
        new class572("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field2358 = new class19();
        field2359 = new int[25];
    }
}
