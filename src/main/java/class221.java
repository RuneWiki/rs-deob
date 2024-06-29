import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class221 {

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "B")
    private byte field4098;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field4091 = 0;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field4087 = 0;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lvd;")
    public static class222 field4093 = class212.method1357("overlay2)3dat", 10731);

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field4104 = -1;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[B")
    public static byte[] field4084 = new byte[520];

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lvd;")
    public static class222 field4100 = class212.method1357("runes", 10731);

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field4099 = 4;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Lvd;")
    public static class222 field4101 = class212.method1357("<)4col>", 10731);

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[[Loh;")
    public static class156[][] field4107 = new class156[field4099][500];

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Lvd;")
    public static class222 field4097 = class212.method1357("Regeln versto-8en hat)3", 10731);

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "[I")
    public static int[] field4105 = new int[field4099];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[[S")
    public static short[][] field4089;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
    public final int method1399(byte arg0) {
        field4085++;
        if (arg0 != 80) {
            method1405(null, (byte) 79);
        }
        return this.field4098 & 0x7;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static void method1400(boolean arg0) {
        field4089 = null;
        field4105 = null;
        field4097 = null;
        field4101 = null;
        field4107 = null;
        field4084 = null;
        field4093 = null;
        field4100 = null;
        if (!arg0) {
            method1402(null, 69);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)I")
    public final int method1401(boolean arg0) {
        field4106++;
        if (arg0) {
            this.method1399((byte) -93);
        }
        return (this.field4098 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lab;I)V")
    public static final void method1402(class3 arg0, int arg1) {
        field4096++;
        class78.field1511 = arg0;
        if (arg1 != 1068912125) {
            method1405(null, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class221() {
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lka;)V")
    public class221(class109 arg0) {
        this.field4098 = arg0.method661(255);
        this.field4092 = arg0.method675(2);
        this.field4090 = arg0.method710(28908);
        this.field4086 = arg0.method710(28908);
        this.field4082 = arg0.method710(28908);
        this.field4081 = arg0.method710(28908);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static final void method1403(int arg0) {
        field4088++;
        int var1 = class217.field4034;
        int var2 = class222.field4140;
        int var3 = class34.field735;
        int var4 = class192.field3543;
        int var5 = 6116423;
        class53.method399(var1, var2, var4, var3, var5);
        class53.method399(var1 + 1, var2 + 1, var4 - 2, 16, 0);
        class53.method401(arg0 + var1, var2 + 18, var4 - 2, var3 - 19, 0);
        class138.field2664.method881(class175.field3282, var1 + 3, var2 + 14, var5, -1);
        int var6 = class137.field2651;
        int var7 = class94.field1769;
        for (int var8 = 0; var8 < class172.field3227; var8++) {
            int var9 = (class172.field3227 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < var1 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class138.field2664.method881(client.method276((byte) 88, var8), var1 + 3, var9, var10, 0);
        }
        class222.method1437(class217.field4034, class34.field735, class222.field4140, class192.field3543, (byte) -103);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILka;)Ltg;")
    public static final class205 method1404(int arg0, class109 arg1) {
        arg1.method662((byte) -83);
        field4094++;
        int var2 = arg1.method662((byte) -124);
        class205 var3 = class21.method203(var2, -1);
        var3.field3814 = arg1.method662((byte) -86);
        int var4 = arg1.method662((byte) -83);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method662((byte) -124);
            var3.method2(arg1, (byte) -12, var6);
        }
        var3.method64(false);
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lba;B)I")
    public static final int method1405(class13 arg0, byte arg1) {
        field4095++;
        class139 var2 = (class139) class217.field4032.method1520(((long) arg0.field269 << 32) + (long) arg0.field264, 25);
        if (arg1 >= -68) {
            method1402(null, -1);
        }
        return var2 == null ? arg0.field373 : var2.field2687;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1406(int arg0, byte arg1) {
        if (arg1 > -61) {
            field4087 = 99;
        }
        field4083++;
        return (arg0 >> 29 & 0x1) != 0;
    }
}
