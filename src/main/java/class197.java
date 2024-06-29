import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class197 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lhp;")
    private class277 field2659 = new class277(64);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lkea;")
    private class203 field2656;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lkca;")
    public static class73 field2658 = new class73(12, 11);

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lfj;")
    public static class572 field2665 = new class572("", 17);

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field2669 = -1;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Lea;")
    public static class474 field2670 = new class474("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "[I")
    public static int[] field2671 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lraa;")
    public static class528 field2667;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lmn;")
    public final class310 method1252(int arg0, int arg1) {
        field2661++;
        class277 var3 = this.field2659;
        class310 var4;
        synchronized (this.field2659) {
            var4 = (class310) this.field2659.method1801(arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field2656;
        byte[] var6;
        synchronized (this.field2656) {
            var6 = this.field2656.method1286(class440.method2739(arg0, (byte) -48), class69.method464(arg1 + 114, arg0), (byte) -49);
        }
        class310 var7 = new class310();
        if (var6 != null) {
            var7.method2056(new class194(var6), (byte) -127);
        }
        class277 var8 = this.field2659;
        synchronized (this.field2659) {
            this.field2659.method1808((long) arg0, var7, (byte) -72);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method1253(int arg0) {
        field2668++;
        class277 var2 = this.field2659;
        synchronized (this.field2659) {
            this.field2659.method1805(arg0 + 122);
            if (arg0 != 2) {
                field2658 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ltq;I)[Lng;")
    public static final class290[] method1254(class545 arg0, int arg1) {
        if (arg1 < 62) {
            method1256(2, -85, 44);
        }
        field2657++;
        if (!arg0.method3165(true)) {
            return new class290[0];
        }
        class175 var2 = arg0.method3164((byte) 104);
        while (var2.field2138 == 0) {
            class646.method3696(1, 10L);
        }
        if (var2.field2138 == 2) {
            return new class290[0];
        }
        int[] var3 = (int[]) var2.field2140;
        class290[] var4 = new class290[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class290 var6 = new class290();
            var4[var5] = var6;
            var6.field4011 = var3[var5 << 2];
            var6.field4013 = var3[(var5 << 2) + 1];
            var6.field4015 = var3[(var5 << 2) + 2];
            var6.field4008 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public final void method1255(int arg0) {
        field2666++;
        if (arg0 != 2025882146) {
            this.field2656 = null;
        }
        class277 var2 = this.field2659;
        synchronized (this.field2659) {
            this.field2659.method1810(false);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
    public static final boolean method1256(int arg0, int arg1, int arg2) {
        field2663++;
        if (arg1 != 7496) {
            field2665 = null;
        }
        return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
    public final void method1257(byte arg0, int arg1) {
        field2660++;
        class277 var3 = this.field2659;
        synchronized (this.field2659) {
            int var4 = -51 % ((arg0 + 44) / 54);
            this.field2659.method1811((byte) 115, arg1);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIB)V")
    public static final void method1258(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        for (class588 var5 = (class588) class278.field3884.method719(false); var5 != null; var5 = (class588) class278.field3884.method716(14)) {
            class272.method1780(arg2, true, arg0, arg3, arg1, var5);
        }
        field2664++;
        for (class588 var6 = (class588) class407.field6140.method719(false); var6 != null; var6 = (class588) class407.field6140.method716(14)) {
            byte var11 = 1;
            class154 var12 = var6.field8440.method1158((byte) -128);
            if (var6.field8440.field2432) {
                var11 = 0;
            } else if (var6.field8440.field2434 == var12.field1905 || var6.field8440.field2434 == var12.field1881 || var6.field8440.field2434 == var12.field1896 || var6.field8440.field2434 == var12.field1910) {
                var11 = 2;
            } else if (var6.field8440.field2434 == var12.field1886 || var6.field8440.field2434 == var12.field1876 || var6.field8440.field2434 == var12.field1872 || var6.field8440.field2434 == var12.field1888) {
                var11 = 3;
            }
            if (var6.field8446 != var11) {
                int var13 = class46.method245(var6.field8440, 34);
                class566 var14 = var6.field8440.field864;
                if (var14.field8121 != null) {
                    var14 = var14.method3287(110, class23.field243);
                }
                if (var14 == null || var13 == -1) {
                    var6.field8436 = -1;
                    var6.field8461 = false;
                } else if (var6.field8436 != var13 || var6.field8461 != var14.field8087) {
                    if (var6.field8455 != null) {
                        class44.field469.method934(var6.field8455);
                        var6.field8455 = null;
                    }
                    var6.field8461 = var14.field8087;
                    var6.field8447 = null;
                    var6.field8436 = var13;
                    var6.field8443 = null;
                }
                var6.field8446 = var11;
            }
            var6.field8462 = var6.field8440.field1764;
            var6.field8444 = var6.field8440.field1764 + (var6.field8440.method1153(true) << 8);
            var6.field8452 = var6.field8440.field1768;
            var6.field8463 = var6.field8440.field1768 + (var6.field8440.method1153(true) << 8);
            class272.method1780(arg2, true, arg0, arg3, arg1, var6);
        }
        if (arg4 <= 42) {
            field2669 = -58;
        }
        for (class588 var7 = (class588) class281.field3922.method523(-115); var7 != null; var7 = (class588) class281.field3922.method530(12714)) {
            byte var8 = 1;
            class154 var9 = var7.field8442.method1158((byte) -127);
            if (var7.field8442.field2432) {
                var8 = 0;
            } else if (var7.field8442.field2434 == var9.field1905 || var7.field8442.field2434 == var9.field1881 || var7.field8442.field2434 == var9.field1896 || var7.field8442.field2434 == var9.field1910) {
                var8 = 2;
            } else if (var7.field8442.field2434 == var9.field1886 || var7.field8442.field2434 == var9.field1876 || var7.field8442.field2434 == var9.field1872 || var7.field8442.field2434 == var9.field1888) {
                var8 = 3;
            }
            if (var7.field8446 != var8) {
                int var10 = class78.method511((byte) 3, var7.field8442);
                if (var7.field8436 != var10 || var7.field8461 != var7.field8442.field9438) {
                    if (var7.field8455 != null) {
                        class44.field469.method934(var7.field8455);
                        var7.field8455 = null;
                    }
                    var7.field8443 = null;
                    var7.field8461 = var7.field8442.field9438;
                    var7.field8436 = var10;
                    var7.field8447 = null;
                }
                var7.field8446 = var8;
            }
            var7.field8462 = var7.field8442.field1764;
            var7.field8444 = var7.field8442.field1764 + (var7.field8442.method1153(true) << 8);
            var7.field8452 = var7.field8442.field1768;
            var7.field8463 = var7.field8442.field1768 + (var7.field8442.method1153(true) << 8);
            class272.method1780(arg2, true, arg0, arg3, arg1, var7);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
    public final void method1259(int arg0, int arg1) {
        field2662++;
        class277 var3 = this.field2659;
        synchronized (this.field2659) {
            this.field2659.method1810(false);
            this.field2659 = new class277(arg0);
            if (arg1 != 1808421224) {
                this.method1252(20, 7);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public static void method1260(int arg0) {
        if (arg0 != 467425826) {
            return;
        }
        field2667 = null;
        field2670 = null;
        field2658 = null;
        field2671 = null;
        field2665 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lcda;ILkea;)V")
    public class197(class149 arg0, int arg1, class203 arg2) {
        this.field2656 = arg2;
        if (this.field2656 != null) {
            int var4 = this.field2656.method1282(-84) - 1;
            this.field2656.method1309(1675886592, var4);
        }
    }
}
