import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class189 {

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Ljf;")
    private class60 field3165 = new class60();

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    private int field3160;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lhc;")
    private class212 field3166;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Ldf;")
    public static class51 field3171 = class46.method233("::gc", 100);

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field3173 = 1;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lhc;")
    public static class212 field3158 = new class212(16);

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "Ldf;")
    public static class51 field3177 = class46.method233("blinken2:", 100);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lu;")
    public static class111 field3162;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lja;")
    public static class55 field3157;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public final void method1348(int arg0, int arg1) {
        field3176++;
        if (class62.field1007 != null) {
            for (class74 var3 = (class74) this.field3165.method405((byte) 61); var3 != null; var3 = (class74) this.field3165.method397(0)) {
                if (var3.method477(false)) {
                    if (var3.method476(true) == null) {
                        var3.method764((byte) -36);
                        var3.method134(-109);
                        this.field3160++;
                    }
                } else if (++var3.field374 > (long) arg1) {
                    class74 var4 = class62.field1007.method743(var3, -27270);
                    this.field3166.method1447(75, var3.field1760, var4);
                    class21.method107(var3, true, var4);
                    var3.method764((byte) -42);
                    var3.method134(75);
                }
            }
        }
        if (arg0 != 0) {
            field3171 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method1349(byte arg0) {
        field3177 = null;
        field3162 = null;
        if (arg0 != -67) {
            field3173 = -113;
        }
        field3157 = null;
        field3158 = null;
        field3171 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public final void method1350(byte arg0) {
        this.field3165.method396((byte) -68);
        if (arg0 <= 107) {
            field3157 = null;
        }
        this.field3166.method1448(0);
        this.field3160 = this.field3169;
        field3174++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
    public final void method1351(Object arg0, int arg1, long arg2) {
        field3170++;
        this.method1354(arg2, (byte) 58);
        if (this.field3160 == 0) {
            class74 var5 = (class74) this.field3165.method395(-129);
            var5.method764((byte) -14);
            var5.method134(arg1 ^ 0x38);
        } else {
            this.field3160--;
        }
        class154 var6 = new class154(arg0);
        this.field3166.method1447(arg1 + 49, arg2, var6);
        this.field3165.method404(var6, false);
        if (arg1 != 2) {
            this.field3160 = -24;
        }
        var6.field374 = 0L;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZI)V")
    public static final void method1352(int arg0, boolean arg1, int arg2) {
        field3167++;
        if (class39.field616 < 2 && class175.field2871 == 0 && !class93.field1532) {
            return;
        }
        if (arg1) {
            field3171 = null;
        }
        class51 var3;
        if (class175.field2871 == 1 && class39.field616 < 2) {
            var3 = class20.method104(39, new class51[] { class183.field3031, class118.field1979, class181.field2990, class201.field3363 });
        } else if (class93.field1532 && class39.field616 < 2) {
            var3 = class20.method104(-97, new class51[] { class261.field4562, class118.field1979, class22.field336, class201.field3363 });
        } else {
            var3 = class168.method1170(class39.field616 - 1, -3889);
        }
        if (class39.field616 > 2) {
            var3 = class20.method104(-115, new class51[] { var3, class82.field1379, class51.method311(class39.field616 - 2, 10), class134.field2240 });
        }
        int var4 = class239.field4161.method1324(var3, arg2 + 4, arg0 + 15, 16777215, 0, class147.field2466, class191.field3202);
        class2.method6(arg0, arg2 + 4, 0, class239.field4161.method1317(var3) + var4, 15);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final void method1353(int arg0) {
        field3159++;
        for (class74 var2 = (class74) this.field3165.method405((byte) 112); var2 != null; var2 = (class74) this.field3165.method397(0)) {
            if (var2.method477(false)) {
                var2.method764((byte) -79);
                var2.method134(58);
                this.field3160++;
            }
        }
        if (arg0 > -82) {
            field3163 = 52;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(JB)V")
    public final void method1354(long arg0, byte arg1) {
        if (arg1 != 58) {
            return;
        }
        class74 var4 = (class74) this.field3166.method1453(arg0, 1);
        if (var4 != null) {
            var4.method764((byte) -22);
            var4.method134(-49);
            this.field3160++;
        }
        field3164++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public static final void method1355(int arg0, boolean arg1) {
        for (class93 var2 = (class93) class209.field3485.method1720(true); var2 != null; var2 = (class93) class209.field3485.method1712((byte) 112)) {
            if (var2.field1552 != null) {
                class166.field2709.method488(var2.field1552);
                var2.field1552 = null;
            }
            if (var2.field1537 != null) {
                class166.field2709.method488(var2.field1537);
                var2.field1537 = null;
            }
            var2.method764((byte) -77);
        }
        field3172++;
        if (arg0 != 20302) {
            method1356(-57, 94, true, -65, -22);
        }
        if (!arg1) {
            return;
        }
        for (class93 var3 = (class93) class179.field2958.method1720(true); var3 != null; var3 = (class93) class179.field2958.method1712((byte) 112)) {
            if (var3.field1552 != null) {
                class166.field2709.method488(var3.field1552);
                var3.field1552 = null;
            }
            var3.method764((byte) -105);
        }
        for (class93 var4 = (class93) class36.field556.method1451(-23); var4 != null; var4 = (class93) class36.field556.method1449(-1)) {
            if (var4.field1552 != null) {
                class166.field2709.method488(var4.field1552);
                var4.field1552 = null;
            }
            var4.method764((byte) -51);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZII)V")
    public static final void method1356(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            field3163 = 91;
        }
        if (class28.field408 <= arg0 && class115.field1954 >= arg0) {
            int var5 = class149.method1074(113, class175.field2867, class36.field542, arg3);
            int var6 = class149.method1074(-99, class175.field2867, class36.field542, arg4);
            class195.method1381(arg0, arg1, var6, var5, -111);
        }
        field3175++;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I)V")
    public class189(int arg0) {
        this.field3160 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3169 = arg0;
        this.field3166 = new class212(var2);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method1357(byte arg0, long arg1) {
        class74 var4 = (class74) this.field3166.method1453(arg1, 1);
        field3161++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method476(true);
        if (var5 == null) {
            var4.method764((byte) -64);
            var4.method134(57);
            this.field3160++;
            return null;
        }
        int var6 = 2 / ((-arg0 - 9) / 63);
        if (var4.method477(false)) {
            class154 var7 = new class154(var5);
            this.field3166.method1447(-103, var4.field1760, var7);
            this.field3165.method404(var7, false);
            var7.field374 = 0L;
            var4.method764((byte) -44);
            var4.method134(-125);
        } else {
            this.field3165.method404(var4, false);
            var4.field374 = 0L;
        }
        return var5;
    }
}
