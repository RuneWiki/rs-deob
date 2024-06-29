import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class154 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Lkh;")
    private class13 field2280 = new class13(64);

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "Lkh;")
    public class13 field2292 = new class13(64);

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Lul;")
    public class406 field2284;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lul;")
    private class406 field2279;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field2291;

    static {
        new class234("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field2289 = 0;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)V", line = 3)
    public final void method1056(int arg0, int arg1, int arg2) {
        this.field2280 = new class13(arg1);
        if (arg2 == 5) {
            field2287++;
            this.field2292 = new class13(arg0);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILjava/lang/Class;)Llq;", line = 16)
    public static final class389 method1057(int arg0, int arg1, int arg2, Class arg3) {
        class138 var4 = client.field3311[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class327 var5 = var4.field2118; var5 != null; var5 = var5.field4922) {
            class389 var6 = var5.field4921;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5836 == arg1 && var6.field5830 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lya;III)V", line = 53)
    public static final void method1058(class38 arg0, int arg1, int arg2, int arg3) {
        class39.field531 = new class358[arg2][arg3];
        class181.field2717 = arg0;
        field2285++;
        if (class470.field6799 != null) {
            class516.field7505 = class165.method1102(class470.field6799[3], class470.field6799[5], class470.field6799[1], class470.field6799[4], class470.field6799[0], class470.field6799[2], 60);
        }
        if (arg1 != 64) {
            field2289 = -99;
        }
        class289.field4359 = new class358();
        class516.method3060((byte) 94);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V", line = 82)
    public final void method1059(int arg0, int arg1) {
        class13 var3 = this.field2280;
        synchronized (this.field2280) {
            this.field2280.method91(arg0 ^ 0x82549BC1, arg1);
        }
        field2291++;
        class13 var4 = this.field2292;
        synchronized (this.field2292) {
            this.field2292.method91(arg0 + 2108384422, arg1);
        }
        if (arg0 != -2108384350) {
            field2289 = 115;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lod;I)[Lrd;", line = 99)
    public static final class224[] method1060(class352 arg0, int arg1) {
        field2290++;
        if (!arg0.method2199(arg1 - 33)) {
            return new class224[0];
        }
        if (arg1 != 34) {
            field2289 = 93;
        }
        class449 var2 = arg0.method2190(5);
        while (var2.field6570 == 0) {
            class434.method2690(10, 10L);
        }
        if (var2.field6570 == 2) {
            return new class224[0];
        }
        int[] var3 = (int[]) var2.field6569;
        class224[] var4 = new class224[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class224 var6 = new class224();
            var4[var5] = var6;
            var6.field3666 = var3[var5 << 2];
            var6.field3668 = var3[(var5 << 2) + 1];
            var6.field3669 = var3[(var5 << 2) + 2];
            var6.field3667 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 141)
    public final void method1061(int arg0) {
        class13 var2 = this.field2280;
        synchronized (this.field2280) {
            if (arg0 <= 38) {
                this.field2280 = null;
            }
            this.field2280.method93((byte) 123);
        }
        field2282++;
        class13 var3 = this.field2292;
        synchronized (this.field2292) {
            this.field2292.method93((byte) 115);
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)Le;", line = 159)
    public final class373 method1062(int arg0, int arg1) {
        if (arg0 < 52) {
            field2286 = 49;
        }
        field2281++;
        class13 var3 = this.field2280;
        class373 var4;
        synchronized (this.field2280) {
            var4 = (class373) this.field2280.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field2279;
        byte[] var6;
        synchronized (this.field2279) {
            var6 = this.field2279.method2536(34, 0, arg1);
        }
        class373 var7 = new class373();
        var7.field5554 = this;
        if (var6 != null) {
            var7.method2335(110, new class217(var6));
        }
        class13 var8 = this.field2280;
        synchronized (this.field2280) {
            this.field2280.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lee;ILul;Lul;)V", line = 218)
    public class154(class480 arg0, int arg1, class406 arg2, class406 arg3) {
        this.field2284 = arg3;
        this.field2279 = arg2;
        this.field2279.method2551(34, -26070);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 200)
    public final void method1063(byte arg0) {
        field2283++;
        class13 var2 = this.field2280;
        synchronized (this.field2280) {
            if (arg0 != -50) {
                return;
            }
            this.field2280.method88(arg0 + 162);
        }
        class13 var3 = this.field2292;
        synchronized (this.field2292) {
            this.field2292.method88(126);
        }
    }
}
