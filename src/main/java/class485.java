import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class485 {

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Lhn;")
    private class509 field7140 = new class509(64);

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Lhn;")
    private class509 field7143 = new class509(100);

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Lfo;")
    private class361 field7137;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field7142 = 13156520;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI)V")
    public static final void method2949(boolean arg0, int arg1) {
        if (arg1 != 3) {
            field7142 = -111;
        }
        while (class334.field4414.method76(false, class132.field1742) >= 15) {
            int var2 = class334.field4414.method80(15, 255);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class339.field4484[var2] == null) {
                class339.field4484[var2] = new class22();
                class339.field4484[var2].field1211 = var2;
                var3 = true;
            }
            class22 var4 = class339.field4484[var2];
            class337.field4465[class401.field5813++] = var2;
            var4.field1229 = class532.field7836;
            if (var4.field220 != null && var4.field220.method1357(true)) {
                class355.method2083((byte) -116, var4);
            }
            var4.method124(true, class87.field1032.method1670((byte) -46, class334.field4414.method80(14, 255)));
            int var5 = class334.field4414.method80(2, 255);
            int var6 = class334.field4414.method80(1, 255);
            int var7 = class334.field4414.method80(3, 255) + 4 << 11 & 0x3C6A;
            int var8 = class334.field4414.method80(1, 255);
            if (var8 == 1) {
                class298.field3923[class275.field3658++] = var2;
            }
            int var9;
            if (arg0) {
                var9 = class334.field4414.method80(8, arg1 + 252);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = class334.field4414.method80(5, arg1 ^ 0xFC);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10;
            if (arg0) {
                var10 = class334.field4414.method80(8, 255);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = class334.field4414.method80(5, arg1 + 252);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            var4.method550((byte) 15, var4.field220.field2904);
            var4.field1200 = var4.field220.field2860 << 3;
            if (var4.field1200 == 0) {
                var4.method553(0, 96);
            } else if (var3) {
                var4.method553(var7, 80);
            }
            var4.method125(var4.method546(arg1 + 24270), var6 == 1, 0, class96.field1170.field1251[0] + var9, var5, class96.field1170.field1249[0] + var10);
            if (var4.field220.method1357(true)) {
                class471.method2875(var4.field3695, 0, (byte) -66, var4.field1251[0], null, var4, var4.field1249[0], null);
            }
        }
        field7136++;
        class334.field4414.method79(false);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
    public final void method2950(byte arg0) {
        class509 var2 = this.field7140;
        synchronized (this.field7140) {
            this.field7140.method3045(48);
        }
        field7141++;
        if (arg0 <= -100) {
            class509 var3 = this.field7143;
            synchronized (this.field7143) {
                this.field7143.method3045(48);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)Loj;")
    public final class260 method2951(int arg0, int arg1) {
        field7135++;
        class509 var3 = this.field7140;
        class260 var4;
        synchronized (this.field7140) {
            var4 = (class260) this.field7140.method3032(3589, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field7137;
        byte[] var6;
        synchronized (this.field7137) {
            var6 = this.field7137.method2130(class424.method2616(arg0, -48), class76.method441((byte) -94, arg0), -60);
            if (arg1 != -13765) {
                method2949(false, -87);
            }
        }
        class260 var7 = new class260();
        var7.field3468 = arg0;
        var7.field3479 = this;
        if (var6 != null) {
            var7.method1602(new class396(var6), (byte) 116);
        }
        var7.method1605(0);
        class509 var8 = this.field7140;
        synchronized (this.field7140) {
            this.field7140.method3046((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2952(String arg0, byte arg1) {
        field7134++;
        if (arg1 <= 43) {
            method2949(true, -85);
        }
        if (!arg0.equals("")) {
            class259.field3456++;
            class492.method2979(class106.field1430, 81);
            class106.field1443.method2449((byte) 115, class424.method2613(1, arg0));
            class106.field1443.method2415(arg0, 21742);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)Lcc;")
    public final class516 method2953(int arg0, int arg1) {
        field7138++;
        class509 var3 = this.field7143;
        class516 var4;
        synchronized (this.field7143) {
            var4 = (class516) this.field7143.method3032(3589, (long) arg1);
            if (arg0 != 15) {
                this.field7140 = null;
            }
            if (var4 == null) {
                var4 = new class516(arg1);
                this.field7143.method3046((long) arg1, var4, 1);
            }
        }
        synchronized (var4) {
            return var4.method3074(1) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public final void method2954(int arg0) {
        if (arg0 != 8) {
            return;
        }
        field7139++;
        class509 var2 = this.field7140;
        synchronized (this.field7140) {
            this.field7140.method3034((byte) 108);
        }
        class509 var3 = this.field7143;
        synchronized (this.field7143) {
            this.field7143.method3034((byte) 114);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(ZI)V")
    public final void method2955(boolean arg0, int arg1) {
        class509 var3 = this.field7140;
        synchronized (this.field7140) {
            this.field7140.method3036(arg1, (byte) -96);
        }
        field7133++;
        class509 var4 = this.field7143;
        synchronized (this.field7143) {
            this.field7143.method3036(arg1, (byte) -69);
        }
        if (!arg0) {
            this.method2951(68, -56);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ld;ILfo;Lfo;Lfo;)V")
    public class485(class104 arg0, int arg1, class361 arg2, class361 arg3, class361 arg4) {
        this.field7137 = arg2;
        if (this.field7137 != null) {
            int var6 = this.field7137.method2138(-1) - 1;
            this.field7137.method2136(-22, var6);
        }
        class210.method1337((byte) 114, arg4, arg3);
    }
}
