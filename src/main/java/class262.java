import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class262 {

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[I")
    private int[] field4633;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Loa;")
    public static class99 field4627 = class221.method1463(2844, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Loa;")
    public static class99 field4628 = class221.method1463(2844, "null");

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lwk;")
    public static class273 field4629 = new class273(64);

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Loa;")
    public static class99 field4635 = class221.method1463(2844, "ondulation2:");

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Loa;")
    private static class99 field4637 = class221.method1463(2844, "Connecting to update server");

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Loa;")
    public static class99 field4639 = field4637;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field4636 = 127;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Loa;")
    public static class99 field4638 = class221.method1463(2844, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ltg;[Lvd;[Lde;[Lde;[Lde;[Lde;B)V")
    public static final void method1752(class182 arg0, class4[] arg1, class109[] arg2, class109[] arg3, class109[] arg4, class109[] arg5, byte arg6) {
        class237.field4094 = arg4;
        field4634++;
        class164.field2880 = arg2;
        class229.field3954 = arg0;
        class194.field3406 = arg5;
        class88.field1528 = arg3;
        if (arg6 > -15) {
            field4628 = null;
        }
        class102.field1737 = arg1;
        class218.field3796 = new boolean[class102.field1737.length];
        class168.field3005.method534(1);
        int var7 = class229.field3954.method1245(class290.field5083, false);
        int[] var8 = class229.field3954.method1252(true, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class168.field3005.method536(class63.method421(116, new class261(class229.field3954.method1242(var8[var9], var7, 6801))), (byte) -45);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I")
    public static final int method1753(int arg0) {
        field4631++;
        int var1 = 12 % ((arg0 + 51) / 33);
        return class108.field1957;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
    public final int method1754(int arg0, int arg1) {
        if (arg1 <= 55) {
            return -51;
        }
        field4630++;
        int var3 = (this.field4633.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4633[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4633[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZII)V")
    public static final void method1755(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        int var3 = arg1--;
        int var4 = class222.field3860[arg1];
        int var5 = class33.field598[arg1];
        if (var3 > 25) {
            var3 = 25;
        }
        if (arg2 == 0) {
            class40.field685++;
            class131.field2277.method966((byte) 49, 184);
            class131.field2277.method1691(var3 + var3 + 3, (byte) 53);
        }
        if (arg2 == 1) {
            class131.field2277.method966((byte) 49, 250);
            class131.field2277.method1691(var3 + var3 + 14 + 3, (byte) 53);
            class232.field3997++;
        }
        if (arg2 == 2) {
            class158.field2821++;
            class131.field2277.method966((byte) 49, 225);
            class131.field2277.method1691(var3 + var3 + 3, (byte) 53);
        }
        class131.field2277.method1697(class280.field4910 + var4, -127);
        field4626++;
        class131.field2277.method1745(class215.field3731 + var5, (byte) 5);
        class131.field2277.method1719(class51.field839[82] ? 1 : 0, true);
        class118.field2096 = class33.field598[0];
        class18.field195 = class222.field3860[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class131.field2277.method1719(class222.field3860[arg1] - var4, true);
            class131.field2277.method1719(class33.field598[arg1] - var5, true);
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([I)V")
    public class262(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4633 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4633[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4633[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field4633[var5 + var5] = arg0[var4];
            this.field4633[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method1756(int arg0) {
        field4639 = null;
        field4627 = null;
        if (arg0 != 250) {
            method1755(false, 26, 84);
        }
        field4635 = null;
        field4628 = null;
        field4638 = null;
        field4637 = null;
        field4629 = null;
    }
}
