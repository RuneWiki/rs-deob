import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class235 extends class279 {

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    private int field3911;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Ltl;")
    public static class59 field3899 = class85.method639("mapfunction", 9588);

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Ltl;")
    public static class59 field3900 = class85.method639("Wordpack geladen)3", 9588);

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Ltl;")
    public static class59 field3898 = class85.method639("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 9588);

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "Loj;")
    public static class260 field3908;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBII)V", line = 5)
    public static final void method1650(int arg0, byte arg1, int arg2, int arg3) {
        field3903++;
        if (arg1 >= -34) {
            method1650(10, (byte) 29, -38, 123);
        }
        class186 var4 = class67.method561(32, arg2, 9);
        var4.method1380(3293);
        var4.field3123 = arg0;
        var4.field3117 = arg3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 22)
    public static final Class method1651(byte arg0, String arg1) throws ClassNotFoundException {
        field3905++;
        if (arg0 > -74) {
            method1654((byte) -48);
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 90)
    private class235(int arg0) {
        super(0, true);
        this.field3911 = 4096;
        this.field3911 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lme;I)V", line = 107)
    public static final void method1652(class295 arg0, int arg1) {
        class222.field3598 = arg0;
        if (arg1 == 6469) {
            field3910++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 118)
    public class235() {
        this(4096);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)[I", line = 123)
    public final int[] method44(boolean arg0, int arg1) {
        field3902++;
        if (arg0) {
            method1653(67);
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            class63.method522(var3, 0, class56.field835, this.field3911);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V", line = 148)
    public static void method1653(int arg0) {
        int var1 = -90 % ((arg0 - 48) / 34);
        field3900 = null;
        field3899 = null;
        field3898 = null;
        field3908 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILs;)V", line = 166)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field3907++;
        if (arg0 < -125 && arg1 == 0) {
            this.field3911 = (arg2.method1221(75) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V", line = 192)
    public static final void method1654(byte arg0) {
        class101.field1646 = 0;
        class21.field285 = 0;
        class94.field1462 = -1;
        class90.field1408 = 1;
        class276.field4753 = -3;
        field3909++;
        int var1 = 34 % ((arg0 - 10) / 34);
        class189.field3161 = 0;
        class44.field685 = false;
    }
}
