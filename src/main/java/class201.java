import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class201 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field3461 = -1;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private int field3472 = 0;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lvb;")
    private class247 field3460 = new class247();

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
    public boolean field3477 = false;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    private int field3466;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[[[I")
    private int[][][] field3464;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[Lle;")
    private class47[] field3465;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Leb;")
    public static class40 field3467 = null;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lsc;")
    public static class181 field3468 = class149.method967(255, "http:)4)4");

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lsc;")
    public static class181 field3462 = class149.method967(255, "(Z");

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lsc;")
    public static class181 field3463 = class149.method967(255, " x ");

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lvf;I)Lvi;")
    public static final class77 method1351(class230 arg0, int arg1) {
        field3473++;
        return arg1 == 2 ? new class77(arg0.method1515(93), arg0.method1515(arg1 ^ 0xFFFFFF9A), arg0.method1515(9), arg0.method1515(2), arg0.method1508(true), arg0.method1516((byte) 82)) : null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[[I")
    public final int[][] method1352(int arg0, int arg1) {
        if (arg1 > -105) {
            method1351((class230) null, 107);
        }
        field3470++;
        if (this.field3476 == this.field3466) {
            this.field3477 = this.field3465[arg0] == null;
            this.field3465[arg0] = class206.field3547;
            return this.field3464[arg0];
        } else if (this.field3466 == 1) {
            this.field3477 = this.field3461 != arg0;
            this.field3461 = arg0;
            return this.field3464[0];
        } else {
            class47 var3 = this.field3465[arg0];
            if (var3 == null) {
                this.field3477 = true;
                if (this.field3472 >= this.field3466) {
                    class47 var4 = (class47) this.field3460.method1685(-231);
                    var3 = new class47(arg0, var4.field741);
                    this.field3465[var4.field733] = null;
                    var4.method290((byte) -48);
                } else {
                    var3 = new class47(arg0, this.field3472);
                    this.field3472++;
                }
                this.field3465[arg0] = var3;
            } else {
                this.field3477 = false;
            }
            this.field3460.method1693(-1, var3);
            return this.field3464[var3.field741];
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public final void method1353(byte arg0) {
        field3471++;
        for (int var2 = 0; var2 < this.field3466; var2++) {
            this.field3464[var2][0] = null;
            this.field3464[var2][1] = null;
            this.field3464[var2][2] = null;
            this.field3464[var2] = null;
        }
        int var3 = 15 / ((8 - arg0) / 44);
        this.field3465 = null;
        this.field3464 = null;
        this.field3460.method1682(123);
        this.field3460 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method1354(int arg0) {
        field3462 = null;
        field3463 = null;
        field3468 = null;
        if (arg0 != 0) {
            field3468 = null;
        }
        field3467 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method1355(boolean arg0) {
        field3474++;
        if (arg0) {
            return null;
        } else if (this.field3476 == this.field3466) {
            for (int var2 = 0; var2 < this.field3466; var2++) {
                this.field3465[var2] = class206.field3547;
            }
            return this.field3464;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIIIIIZIIII)Z")
    public static final boolean method1356(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field3469++;
        if (class258.field4507.field2619 == 2) {
            return class145.method943(arg8, arg5, arg9, arg2, arg11, arg0, arg7, arg3, arg10, arg1 ^ 0x36, arg4, arg6);
        } else if (class258.field4507.field2619 > 2) {
            return class159.method1067(arg5, arg3, arg0, arg2, arg7, class258.field4507.field2619, arg4, arg6, arg9, arg8, arg11, 4, arg10);
        } else {
            if (arg1 != 119) {
                field3462 = null;
            }
            return class187.method1298(arg11, arg8, arg7, arg5, arg6, arg4, arg2, arg3, arg1 ^ 0x76, arg10, arg9, arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(III)V")
    public class201(int arg0, int arg1, int arg2) {
        this.field3466 = arg0;
        this.field3464 = new int[this.field3466][3][arg2];
        this.field3476 = arg1;
        this.field3465 = new class47[this.field3476];
    }
}
