import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class237 {

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    private int field4108 = 0;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[Lhk;")
    public class125[] field4091;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public int field4104;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Loa;")
    public static class99 field4098 = class221.method1463(2844, "details");

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Loa;")
    private static class99 field4095 = class221.method1463(2844, "Unable to find ");

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Loa;")
    public static class99 field4097 = field4095;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lwk;")
    public static class273 field4100 = new class273(50);

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "[I")
    public static int[] field4105 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "[I")
    public static int[] field4107 = new int[5];

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "Loa;")
    public static class99 field4110 = class221.method1463(2844, "gelb:");

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[I")
    public static int[] field4109 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "J")
    private long field4099;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lhk;")
    private class125 field4090;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lhk;")
    private class125 field4106;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[Lde;")
    public static class109[] field4094;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BJLhk;)V")
    public final void method1544(byte arg0, long arg1, class125 arg2) {
        field4088++;
        int var5 = 33 % ((arg0 - 18) / 51);
        if (arg2.field2192 != null) {
            arg2.method828((byte) -80);
        }
        class125 var6 = this.field4091[(int) ((long) (this.field4104 - 1) & arg1)];
        arg2.field2184 = var6;
        arg2.field2192 = var6.field2192;
        arg2.field2192.field2184 = arg2;
        arg2.field2187 = arg1;
        arg2.field2184.field2192 = arg2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
    public final int method1545(int arg0) {
        field4092++;
        int var2 = 0;
        if (arg0 < 88) {
            method1546(-89);
        }
        for (int var3 = 0; var3 < this.field4104; var3++) {
            class125 var4 = this.field4091[var3];
            class125 var5 = var4.field2184;
            while (var4 != var5) {
                var5 = var5.field2184;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method1546(int arg0) {
        field4097 = null;
        field4098 = null;
        field4110 = null;
        if (arg0 >= -110) {
            method1546(-30);
        }
        field4095 = null;
        field4109 = null;
        field4105 = null;
        field4107 = null;
        field4094 = null;
        field4100 = null;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Lhk;")
    public final class125 method1547(int arg0) {
        field4089++;
        if (this.field4090 == null) {
            return null;
        }
        class125 var2 = this.field4091[(int) (this.field4099 & (long) (this.field4104 - 1))];
        if (arg0 != 8021) {
            return null;
        }
        while (this.field4090 != var2) {
            if (this.field4090.field2187 == this.field4099) {
                class125 var3 = this.field4090;
                this.field4090 = this.field4090.field2184;
                return var3;
            }
            this.field4090 = this.field4090.field2184;
        }
        this.field4090 = null;
        return null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1548(byte arg0) {
        for (class80 var1 = (class80) class93.field1568.method529(10); var1 != null; var1 = (class80) class93.field1568.method533(-50)) {
            if (var1.field1404) {
                var1.method554(-30438);
            }
        }
        field4087++;
        if (arg0 != 26) {
            return;
        }
        for (class80 var2 = (class80) class111.field2002.method529(arg0 - 16); var2 != null; var2 = (class80) class111.field2002.method533(106)) {
            if (var2.field1404) {
                var2.method554(-30438);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Lhk;")
    public final class125 method1549(int arg0) {
        if (arg0 < 67) {
            this.field4104 = 30;
        }
        field4101++;
        if (this.field4108 > 0 && this.field4091[this.field4108 - 1] != this.field4106) {
            class125 var2 = this.field4106;
            this.field4106 = var2.field2184;
            return var2;
        }
        while (this.field4104 > this.field4108) {
            class125 var3 = this.field4091[this.field4108++].field2184;
            if (this.field4091[this.field4108 - 1] != var3) {
                this.field4106 = var3.field2184;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZJ)Lhk;")
    public final class125 method1550(boolean arg0, long arg1) {
        this.field4099 = arg1;
        field4086++;
        if (!arg0) {
            return null;
        }
        class125 var4 = this.field4091[(int) ((long) (this.field4104 - 1) & arg1)];
        for (this.field4090 = var4.field2184; this.field4090 != var4; this.field4090 = this.field4090.field2184) {
            if (this.field4090.field2187 == arg1) {
                class125 var5 = this.field4090;
                this.field4090 = this.field4090.field2184;
                return var5;
            }
        }
        this.field4090 = null;
        return null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public final void method1551(byte arg0) {
        for (int var2 = 0; var2 < this.field4104; var2++) {
            class125 var3 = this.field4091[var2];
            while (true) {
                class125 var4 = var3.field2184;
                if (var3 == var4) {
                    break;
                }
                var4.method828((byte) -88);
            }
        }
        if (arg0 != 14) {
            this.field4104 = -23;
        }
        this.field4106 = null;
        this.field4090 = null;
        field4096++;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Lhk;")
    public final class125 method1552(int arg0) {
        this.field4108 = 0;
        if (arg0 < 81) {
            this.method1553((byte) 65);
        }
        field4102++;
        return this.method1549(90);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I")
    public final int method1553(byte arg0) {
        if (arg0 == -127) {
            field4093++;
            return this.field4104;
        } else {
            return -101;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I)V")
    public class237(int arg0) {
        this.field4091 = new class125[arg0];
        this.field4104 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class125 var3 = this.field4091[var2] = new class125();
            var3.field2184 = var3;
            var3.field2192 = var3;
        }
    }
}
