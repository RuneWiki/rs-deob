import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class205 {

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "J")
    public static long field3526 = 0L;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Lve;")
    public static class255 field3528 = class87.method607(108, "welle2:");

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "J")
    public static long field3519 = 0L;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1485(int arg0) {
        class277.field4764++;
        if (arg0 != -1) {
            method1485(-63);
        }
        field3522++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLve;)V", line = 27)
    public static final void method1486(byte arg0, class255 arg1) {
        if (arg0 != -50) {
            method1490((byte) 26);
        }
        class274.method1922((byte) -60);
        class284.method2021(arg1, (byte) 122);
        field3516++;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 64)
    public static void method1487(int arg0) {
        if (arg0 != -1) {
            field3528 = (class255) null;
        }
        field3528 = null;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 76)
    public class205() {
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 93)
    public static final void method1488(int arg0) {
        if (arg0 != 65535) {
            field3519 = -58L;
        }
        for (int var1 = 0; var1 < class118.field1985; var1++) {
            int var2 = class10.field145[var1];
            class186 var3 = class82.field1334[var2];
            int var4 = class160.field2692.method481(arg0 ^ 0xFFFF);
            if ((var4 & 0x20) != 0) {
                var3.field5137 = class160.field2692.method426((byte) -23);
                if (var3.field5137 == 65535) {
                    var3.field5137 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class160.field2692.method431((byte) 88);
                int var6 = class160.field2692.method481(0);
                var3.method2098(var6, var5, (byte) -40, class277.field4768);
            }
            if ((var4 & 0x2) != 0) {
                var3.field5161 = class160.field2692.method476((byte) 72);
                var3.field5159 = class160.field2692.method426((byte) -23);
            }
            if ((var4 & 0x4) != 0) {
                var3.field5132 = class160.field2692.method479(-1);
                var3.field5168 = 100;
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class160.field2692.method476((byte) 72);
                int var8 = class160.field2692.method482(6205);
                if (var7 == 65535) {
                    var7 = -1;
                }
                class111.method848(var7, arg0 - 65516, var3, var8);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field2996.method1630(99)) {
                    class56.method350(var3, arg0 - 97379);
                }
                var3.field2996 = class143.method1068(-127, class160.field2692.method439(-32768));
                var3.method2102(70, var3.field2996.field3933);
                var3.field5148 = var3.field2996.field3920;
                var3.field5167 = var3.field2996.field3883;
                var3.field5121 = var3.field2996.field3928;
                var3.field5120 = var3.field2996.field3903;
                var3.field5118 = var3.field2996.field3937;
                var3.field5146 = var3.field2996.field3942;
                var3.field5113 = var3.field2996.field3897;
                var3.field5138 = var3.field2996.field3881;
                if (var3.field2996.method1630(-97)) {
                    class196.method1405(var3.field5125[0], (byte) 89, (class145) null, client.field4039, (class242) null, 0, var3.field5154[0], var3);
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field5164 = class160.field2692.method423(255);
                int var9 = class160.field2692.method464(-16777216);
                var3.field5152 = (var9 & 0xFFFF) + class277.field4768;
                var3.field5165 = 0;
                var3.field5128 = var9 >> 16;
                var3.field5151 = 0;
                if (var3.field5164 == 65535) {
                    var3.field5164 = -1;
                }
                if (var3.field5152 > class277.field4768) {
                    var3.field5165 = -1;
                }
                if (var3.field5164 != -1 && class277.field4768 == var3.field5152) {
                    int var10 = class232.method1611(var3.field5164, (byte) -128).field1420;
                    if (var10 != -1) {
                        class271 var11 = class181.method1269(83, var10);
                        if (var11 != null && var11.field4667 != null) {
                            class232.method1609(false, var3.field5130, 0, var11, var3.field5173, 26694);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                int var12 = class160.field2692.method473(-16350);
                int var13 = class160.field2692.method431((byte) 122);
                var3.method2098(var13, var12, (byte) 87, class277.field4768);
                var3.field5141 = class277.field4768 + 300;
                var3.field5119 = class160.field2692.method482(6205);
            }
        }
        field3523++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V", line = 236)
    public static final void method1489(int arg0, byte arg1) {
        field3527++;
        if (class225.method1570((byte) -96, arg0)) {
            class174.method1231((byte) -108, class297.field5087[arg0], -1);
            if (arg1 <= 71) {
                method1490((byte) -10);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lgi;)V", line = 248)
    public class205(class205 arg0) {
        this.field3517 = arg0.field3517;
        this.field3518 = arg0.field3518;
        this.field3520 = arg0.field3520;
        this.field3524 = arg0.field3524;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 260)
    public static final void method1490(byte arg0) {
        field3521++;
        if (arg0 < 53) {
            method1487(112);
        }
        class130.field2144.method553(-87);
    }
}
