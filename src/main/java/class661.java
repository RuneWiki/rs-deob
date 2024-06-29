import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class661 {

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    private int field9275 = 0;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public int field9270;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "[Lgga;")
    public class333[] field9273;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field9266 = 0;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lsb;")
    public static class305 field9271 = new class305(63, 16);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "J")
    private long field9259;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lgga;")
    private class333 field9264;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Lgga;")
    private class333 field9276;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public static final void method3666(int arg0, int arg1, int arg2) {
        field9269++;
        if (arg0 != -29573) {
            return;
        }
        class390 var3 = class266.field3308[arg2][arg1];
        if (var3 != null) {
            class93.field950 = var3.field5286;
            class368.field5043 = var3.field5284;
            class119.field1327 = var3.field5275;
        }
        class540.method3039((byte) -77);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final void method3667(int arg0) {
        for (int var2 = 0; var2 < this.field9270; var2++) {
            class333 var3 = this.field9273[var2];
            while (true) {
                class333 var4 = var3.field4181;
                if (var3 == var4) {
                    break;
                }
                var4.method1922(99);
            }
        }
        field9258++;
        this.field9276 = null;
        if (arg0 == 5488) {
            this.field9264 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)I")
    public final int method3668(boolean arg0) {
        field9261++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field9270; var3++) {
            class333 var4 = this.field9273[var3];
            for (class333 var5 = var4.field4181; var5 != var4; var5 = var5.field4181) {
                var2++;
            }
        }
        if (arg0) {
            this.method3667(47);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JI)Lgga;")
    public final class333 method3669(long arg0, int arg1) {
        this.field9259 = arg0;
        field9272++;
        class333 var4 = this.field9273[(int) (arg0 & (long) (this.field9270 + arg1))];
        for (this.field9264 = var4.field4181; this.field9264 != var4; this.field9264 = this.field9264.field4181) {
            if (this.field9264.field4176 == arg0) {
                class333 var5 = this.field9264;
                this.field9264 = this.field9264.field4181;
                return var5;
            }
        }
        this.field9264 = null;
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method3670(int arg0) {
        field9271 = null;
        if (arg0 != 0) {
            method3676(-10, -103, 24);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLgga;J)V")
    public final void method3671(boolean arg0, class333 arg1, long arg2) {
        if (arg0) {
            this.field9264 = null;
        }
        field9267++;
        if (arg1.field4174 != null) {
            arg1.method1922(83);
        }
        class333 var5 = this.field9273[(int) (arg2 & (long) (this.field9270 - 1))];
        arg1.field4174 = var5.field4174;
        arg1.field4181 = var5;
        arg1.field4174.field4181 = arg1;
        arg1.field4181.field4174 = arg1;
        arg1.field4176 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Lgga;")
    public final class333 method3672(int arg0) {
        field9263++;
        if (this.field9275 > 0 && this.field9273[this.field9275 - 1] != this.field9276) {
            class333 var2 = this.field9276;
            this.field9276 = var2.field4181;
            return var2;
        } else if (arg0 == -1) {
            while (this.field9275 < this.field9270) {
                class333 var3 = this.field9273[this.field9275++].field4181;
                if (this.field9273[this.field9275 - 1] != var3) {
                    this.field9276 = var3.field4181;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lgga;")
    public final class333 method3673(byte arg0) {
        field9265++;
        if (this.field9264 == null) {
            return null;
        } else if (arg0 <= 94) {
            return null;
        } else {
            class333 var2 = this.field9273[(int) ((long) (this.field9270 - 1) & this.field9259)];
            while (this.field9264 != var2) {
                if (this.field9264.field4176 == this.field9259) {
                    class333 var3 = this.field9264;
                    this.field9264 = this.field9264.field4181;
                    return var3;
                }
                this.field9264 = this.field9264.field4181;
            }
            this.field9264 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)Lgga;")
    public final class333 method3674(int arg0) {
        this.field9275 = 0;
        int var2 = -105 % ((80 - arg0) / 45);
        field9260++;
        return this.method3672(-1);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([Lgga;B)I")
    public final int method3675(class333[] arg0, byte arg1) {
        field9268++;
        if (arg1 != 114) {
            this.field9270 = -115;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field9270; var4++) {
            class333 var5 = this.field9273[var4];
            for (class333 var6 = var5.field4181; var6 != var5; var6 = var6.field4181) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)I")
    public static final int method3676(int arg0, int arg1, int arg2) {
        field9262++;
        if (arg2 == 1 || arg2 == 3) {
            return class341.field4303[arg0 & 0x3];
        } else if (arg1 == 2870) {
            return class403.field5399[arg0 & 0x3];
        } else {
            return -10;
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)I")
    public final int method3677(int arg0) {
        if (arg0 != 0) {
            this.field9264 = null;
        }
        field9274++;
        return this.field9270;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
    public class661(int arg0) {
        this.field9270 = arg0;
        this.field9273 = new class333[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class333 var3 = this.field9273[var2] = new class333();
            var3.field4174 = var3;
            var3.field4181 = var3;
        }
    }
}
