import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class338 {

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field4474 = 0;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    private int field4479 = -1;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lsr;")
    private class167 field4470 = new class167();

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Z")
    public boolean field4480 = false;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    private int field4473;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[[I")
    private int[][] field4469;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[Lfp;")
    private class214[] field4477;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    public static int[] field4471 = new int[3];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lwq;")
    public static class115 field4468 = new class115(7, 4);

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "F")
    public static float field4481;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field4482;

    static {
        new class305("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 4)
    public static void method1967(byte arg0) {
        field4468 = null;
        field4471 = null;
        if (arg0 <= 80) {
            method1969((byte) 46);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lza;Lot;III)V", line = 17)
    public static final void method1968(class287 arg0, class419 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class515.field7487) {
            class498 var5 = class186.field2421[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field7268 != null && var5.field7268.method41((byte) -62)) {
                arg1.method40(-29, 0, 0, true, class166.field2152, var5.field7268, arg0);
            }
        }
        if (arg4 < class515.field7487) {
            class498 var6 = class186.field2421[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field7268 != null && var6.field7268.method41((byte) -62)) {
                arg1.method40(120, class166.field2152, 0, true, 0, var6.field7268, arg0);
            }
        }
        if (arg3 < class515.field7487 && arg4 < class114.field1494) {
            class498 var7 = class186.field2421[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field7268 != null && var7.field7268.method41((byte) -62)) {
                arg1.method40(126, class166.field2152, 0, true, class166.field2152, var7.field7268, arg0);
            }
        }
        if (arg3 < class515.field7487 && arg4 > 0) {
            class498 var8 = class186.field2421[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field7268 != null && var8.field7268.method41((byte) -62)) {
                arg1.method40(-113, -class166.field2152, 0, true, class166.field2152, var8.field7268, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 66)
    public static final void method1969(byte arg0) {
        field4478++;
        if (class458.method2817(arg0 + 239, class527.field7734) || class270.method1644((byte) -89, class527.field7734)) {
            class75.method440(5000, class139.field1857 >> 10, (byte) -29, class238.field3171 >> 10);
        } else {
            int var1 = class96.field1170.field1249[0] >> 3;
            int var2 = class96.field1170.field1251[0] >> 3;
            if (var1 >= 0 && var1 < class308.field4128 >> 3 && var2 >= 0 && (class426.field6200 >> 3) > var2) {
                class75.method440(5000, var2, (byte) -29, var1);
            } else {
                class75.method440(0, class426.field6200 >> 4, (byte) -29, class308.field4128 >> 4);
            }
        }
        class183.method1061(arg0 ^ 0xFFFFABCB);
        if (arg0 != -114) {
            field4471 = null;
        }
        class337.method1963((byte) 92);
        class510.method3049(-84);
        class127.method767(-101);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)[I", line = 95)
    public final int[] method1970(int arg0, byte arg1) {
        if (arg1 < 11) {
            this.field4473 = 5;
        }
        field4472++;
        if (this.field4476 == this.field4473) {
            this.field4480 = this.field4477[arg0] == null;
            this.field4477[arg0] = class377.field5305;
            return this.field4469[arg0];
        } else if (this.field4473 == 1) {
            this.field4480 = this.field4479 != arg0;
            this.field4479 = arg0;
            return this.field4469[0];
        } else {
            class214 var3 = this.field4477[arg0];
            if (var3 == null) {
                this.field4480 = true;
                if (this.field4473 <= this.field4474) {
                    class214 var4 = (class214) this.field4470.method981(-120);
                    var3 = new class214(arg0, var4.field2926);
                    this.field4477[var4.field2922] = null;
                    var4.method2674(true);
                } else {
                    var3 = new class214(arg0, this.field4474);
                    this.field4474++;
                }
                this.field4477[arg0] = var3;
            } else {
                this.field4480 = false;
            }
            this.field4470.method971(12, var3);
            return this.field4469[var3.field2926];
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 172)
    public final void method1971(int arg0) {
        field4482++;
        for (int var2 = 0; var2 < this.field4473; var2++) {
            this.field4469[var2] = null;
        }
        if (arg0 < 60) {
            this.field4473 = -56;
        }
        this.field4477 = null;
        this.field4469 = null;
        this.field4470.method984(false);
        this.field4470 = null;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V", line = 271)
    public class338(int arg0, int arg1, int arg2) {
        this.field4473 = arg0;
        this.field4476 = arg1;
        this.field4469 = new int[this.field4473][arg2];
        this.field4477 = new class214[this.field4476];
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lii;III)V", line = 197)
    public static final void method1972(class390 arg0, int arg1, int arg2, int arg3) {
        long var4 = class35.field354[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field5643 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field5642[arg0.field5643++] = class124.field1608[var8 - 1].field4510;
            var6 += 16L;
        }
        for (int var9 = arg0.field5643; var9 < 4; var9++) {
            arg0.field5642[var9] = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)[[I", line = 238)
    public final int[][] method1973(int arg0) {
        field4475++;
        if (this.field4476 != this.field4473) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 > -84) {
            return null;
        } else {
            for (int var2 = 0; var2 < this.field4473; var2++) {
                this.field4477[var2] = class377.field5305;
            }
            return this.field4469;
        }
    }
}
