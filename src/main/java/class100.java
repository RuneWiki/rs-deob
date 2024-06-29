import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class100 {

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Ler;")
    private class157 field1441 = new class157(64);

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Ler;")
    public class157 field1446 = new class157(2);

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lns;")
    public class438 field1436;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lns;")
    private class438 field1437;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lui;")
    public static class375 field1435 = new class375("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "[[Z")
    public static boolean[][] field1438 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lpg;")
    public static class492 field1442 = new class492(103, 1);

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "[I")
    public static int[] field1444 = new int[32];

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1443;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 7)
    public static void method674(int arg0) {
        field1438 = null;
        field1435 = null;
        if (arg0 <= 119) {
            field1444 = null;
        }
        field1442 = null;
        field1444 = null;
        field1443 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 21)
    public static final void method675(byte arg0) {
        field1440++;
        for (class231 var1 = (class231) class27.field446.method2361(0); var1 != null; var1 = (class231) class27.field446.method2361(0)) {
            class392.method2412(1006, var1);
        }
        int var2;
        int var3;
        if (class96.field1399.method1734(123, class441.field6563)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class430.field6399;
            var3 = class430.field6399;
        }
        client.method454();
        if (arg0 != 65) {
            method675((byte) 71);
        }
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method463();
            client.method460(var4);
            client.method456(var4);
        }
        client.method453();
        client.method470();
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)Ldp;", line = 64)
    public final class334 method676(byte arg0, int arg1) {
        if (arg0 < 27) {
            method675((byte) 18);
        }
        field1447++;
        class157 var3 = this.field1441;
        class334 var4;
        synchronized (this.field1441) {
            var4 = (class334) this.field1441.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1437.method2650(arg1, -74, 33);
        class334 var6 = new class334();
        var6.field5159 = this;
        if (var5 != null) {
            var6.method2145(new class91(var5), (byte) 76);
        }
        class157 var7 = this.field1441;
        synchronized (this.field1441) {
            this.field1441.method1012(-83, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 101)
    public final void method677(int arg0) {
        class157 var2 = this.field1441;
        synchronized (this.field1441) {
            this.field1441.method1022((byte) -34);
        }
        if (arg0 != 10450) {
            return;
        }
        field1448++;
        class157 var3 = this.field1446;
        synchronized (this.field1446) {
            this.field1446.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(BI)V", line = 120)
    public final void method678(byte arg0, int arg1) {
        field1439++;
        class157 var3 = this.field1441;
        synchronized (this.field1441) {
            this.field1441.method1016(arg1, (byte) 125);
        }
        int var4 = 98 / ((-arg0 - 51) / 34);
        class157 var5 = this.field1446;
        synchronized (this.field1446) {
            this.field1446.method1016(arg1, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBIII)V", line = 135)
    public static final void method679(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1434++;
        class377 var5 = class99.method672(arg0, false, 8);
        var5.method2340((byte) 126);
        var5.field5763 = arg3;
        var5.field5762 = arg2;
        var5.field5759 = arg4;
        int var6 = -75 / ((arg1 + 39) / 55);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V", line = 152)
    public final void method680(byte arg0) {
        class157 var2 = this.field1441;
        synchronized (this.field1441) {
            this.field1441.method1015((byte) 98);
        }
        field1432++;
        class157 var3 = this.field1446;
        synchronized (this.field1446) {
            if (arg0 > 15) {
                this.field1446.method1015((byte) 93);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILou;I)J", line = 168)
    public static final long method681(int arg0, int arg1, class196 arg2, int arg3) {
        field1433++;
        if (arg3 != -29243) {
            field1444 = null;
        }
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class130 var10 = class56.field755.method2031(-59, arg2.method50(25707));
        long var11 = (long) (arg2.method63((byte) 63) << 14 | arg1 << 7 | arg0 | arg2.method66(-7234) << 20 | 0x40000000);
        if (var10.field1886 == 0) {
            var11 |= var8;
        }
        if (var10.field1851 == 1) {
            var11 |= var4;
        }
        if (var10.field1909) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method50(arg3 + 54950) << 32;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lgo;ILns;Lns;)V", line = 250)
    public class100(class331 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field1436 = arg3;
        this.field1437 = arg2;
        this.field1437.method2645(1, 33);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)Ljava/lang/String;", line = 217)
    public static final String method682(int arg0, int arg1) {
        field1445++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class29.field456.method2335((byte) -100, class288.field4292) + " (" + var2 + ")</col>";
        } else {
            int var4 = 3 % ((18 - arg1) / 34);
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class282.field4079.method2335((byte) -100, class288.field4292) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }
}
