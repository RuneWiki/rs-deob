import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class235 {

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    private int field4097 = 0;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[Lcj;")
    public class69[] field4086;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
    public static int[] field4084 = new int[25];

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[I")
    public static int[] field4083 = new int[32];

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lha;")
    public static class46 field4091 = class271.method1828("m", -46);

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lha;")
    public static class46 field4098;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "J")
    private long field4095;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lcj;")
    private class69 field4089;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lcj;")
    private class69 field4096;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[[B")
    public static byte[][] field4082;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Lcj;")
    public final class69 method1591(int arg0) {
        if (arg0 < 48) {
            this.method1593((byte) 98);
        }
        field4080++;
        if (this.field4097 > 0 && this.field4086[this.field4097 - 1] != this.field4096) {
            class69 var2 = this.field4096;
            this.field4096 = var2.field1200;
            return var2;
        }
        while (this.field4081 > this.field4097) {
            class69 var3 = this.field4086[this.field4097++].field1200;
            if (this.field4086[this.field4097 - 1] != var3) {
                this.field4096 = var3.field1200;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Lcj;")
    public final class69 method1592(boolean arg0) {
        field4090++;
        this.field4097 = 0;
        return arg0 ? null : this.method1591(127);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lcj;")
    public final class69 method1593(byte arg0) {
        field4085++;
        if (this.field4089 == null) {
            return null;
        }
        class69 var2 = this.field4086[(int) ((long) (this.field4081 - 1) & this.field4095)];
        while (this.field4089 != var2) {
            if (this.field4089.field1195 == this.field4095) {
                class69 var4 = this.field4089;
                this.field4089 = this.field4089.field1200;
                return var4;
            }
            this.field4089 = this.field4089.field1200;
        }
        int var3 = -32 / ((49 - arg0) / 57);
        this.field4089 = null;
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public static void method1594(boolean arg0) {
        if (arg0) {
            field4082 = null;
        }
        field4082 = null;
        field4091 = null;
        field4084 = null;
        field4098 = null;
        field4083 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    public static int method1595(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
    public final int method1596(int arg0) {
        field4087++;
        return arg0 == -20860 ? this.field4081 : 96;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JBLcj;)V")
    public final void method1597(long arg0, byte arg1, class69 arg2) {
        field4088++;
        if (arg1 != -126) {
            return;
        }
        if (arg2.field1197 != null) {
            arg2.method501(0);
        }
        class69 var5 = this.field4086[(int) (arg0 & (long) (this.field4081 - 1))];
        arg2.field1195 = arg0;
        arg2.field1197 = var5.field1197;
        arg2.field1200 = var5;
        arg2.field1197.field1200 = arg2;
        arg2.field1200.field1197 = arg2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILha;)V")
    public static final void method1598(int arg0, int arg1, class46 arg2) {
        field4093++;
        class146 var3 = class6.method22((byte) 16, arg0, arg1);
        var3.method1088(11102);
        var3.field2642 = arg2;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public final void method1599(int arg0) {
        for (int var2 = 0; var2 < this.field4081; var2++) {
            class69 var3 = this.field4086[var2];
            while (true) {
                class69 var4 = var3.field1200;
                if (var3 == var4) {
                    break;
                }
                var4.method501(arg0 ^ 0x19);
            }
        }
        if (arg0 != 25) {
            field4084 = null;
        }
        this.field4089 = null;
        this.field4096 = null;
        field4079++;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)I")
    public final int method1600(boolean arg0) {
        int var2 = 0;
        field4094++;
        if (arg0) {
            this.method1601(107, -94L);
        }
        for (int var3 = 0; var3 < this.field4081; var3++) {
            class69 var4 = this.field4086[var3];
            for (class69 var5 = var4.field1200; var5 != var4; var5 = var5.field1200) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Lcj;")
    public final class69 method1601(int arg0, long arg1) {
        this.field4095 = arg1;
        field4092++;
        int var4 = -46 / ((arg0 + 16) / 38);
        class69 var5 = this.field4086[(int) ((long) (this.field4081 - 1) & arg1)];
        for (this.field4089 = var5.field1200; this.field4089 != var5; this.field4089 = this.field4089.field1200) {
            if (this.field4089.field1195 == arg1) {
                class69 var6 = this.field4089;
                this.field4089 = this.field4089.field1200;
                return var6;
            }
        }
        this.field4089 = null;
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
    public class235(int arg0) {
        this.field4086 = new class69[arg0];
        this.field4081 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class69 var3 = this.field4086[var2] = new class69();
            var3.field1197 = var3;
            var3.field1200 = var3;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4083[var1] = var0 - 1;
            var0 += var0;
        }
        field4098 = null;
    }
}
