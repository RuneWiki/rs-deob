import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Ljd;")
    public static class85 field447 = class221.method1499("(U0a )2 non)2existant gosub script)2num: ", (byte) 106);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Ljd;")
    public static class85 field452 = null;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
    public static int[] field448 = new int[1000];

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field450 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lmf;")
    public static class10 field457;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lfg;")
    public static class12 field449;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
    public static int[] field443;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
    public static int[] field453;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Z")
    public static final boolean method204(byte arg0) {
        if (arg0 < 100) {
            return true;
        }
        field446++;
        try {
            return class233.method1561(false);
        } catch (IOException var4) {
            class49.method332((byte) 30);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class181.field3100 + "," + class186.field3197 + "," + class56.field977 + " - " + class85.field1593 + "," + (class244.field4172 + class22.field308.field1043[0]) + "," + (class22.field308.field1066[0] + class213.field3742) + " - ";
            for (int var3 = 0; class85.field1593 > var3 && var3 < 50; var3++) {
                var2 = var2 + class189.field3249.field4238[var3] + ",";
            }
            class201.method1379(var5, var2, 2552);
            class171.method1143((byte) -115);
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lfg;")
    public static final class12 method205(int arg0) {
        field456++;
        int var1 = field443[0] * class244.field4165[0];
        int[] var2 = new int[var1];
        byte[] var3 = class178.field3060[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class2.field20[class135.method899(var3[var4], 255)];
        }
        class266 var5 = new class266(class251.field4331, class229.field3961, class246.field4200[0], class121.field2134[0], field443[arg0], class244.field4165[0], var2);
        class47.method322(-29493);
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method206(int arg0) {
        class146.method958((byte) -102);
        field444++;
        System.gc();
        if (arg0 != -24263) {
            method206(-12);
        }
        class169.method1136(true, 25);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static void method207(int arg0) {
        field447 = null;
        field443 = null;
        field453 = null;
        field452 = null;
        int var1 = 79 % (arg0 / 57);
        field449 = null;
        field457 = null;
        field448 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILjd;)V")
    public static final void method208(int arg0, int arg1, class85 arg2) {
        field445++;
        class171 var3 = class85.method579(3, 0, arg1);
        if (arg0 != 1000) {
            method208(-75, -120, (class85) null);
        }
        var3.method1140(-28981);
        var3.field2952 = arg2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lge;ILge;)V")
    public static final void method209(class68 arg0, int arg1, class68 arg2) {
        class226.field3931 = arg2;
        if (arg1 == -27188) {
            field455++;
            class205.field3588 = arg0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILik;I)Ljd;")
    public static final class85 method210(int arg0, class247 arg1, int arg2) {
        field442++;
        try {
            int var3 = -41 / ((arg2 + 15) / 34);
            class85 var4 = new class85();
            var4.field1538 = arg1.method1710(2006);
            if (var4.field1538 > arg0) {
                var4.field1538 = arg0;
            }
            var4.field1548 = new byte[var4.field1538];
            arg1.field4224 += class82.field1502.method129(arg1.field4224, 0, (byte) 77, var4.field1538, var4.field1548, arg1.field4238);
            return var4;
        } catch (Exception var5) {
            return class268.field4770;
        }
    }
}
