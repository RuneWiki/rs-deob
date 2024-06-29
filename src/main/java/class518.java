import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class518 {

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Lkh;")
    private class13 field7537 = new class13(128);

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "Lkh;")
    public class13 field7541 = new class13(64);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Lul;")
    private class406 field7533;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Lul;")
    public class406 field7536;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Lri;")
    public static class75 field7543 = new class75(14, 1);

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "Lri;")
    public static class75 field7546 = new class75(15, 4);

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "Lri;")
    public static class75 field7547 = new class75(16, -2);

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "Lri;")
    public static class75 field7548 = new class75(17, 0);

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "Lri;")
    public static class75 field7549 = new class75(18, -2);

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Lri;")
    public static class75 field7550 = new class75(19, -2);

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "Lri;")
    public static class75 field7551 = new class75(20, 6);

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "Lri;")
    public static class75 field7552 = new class75(21, 9);

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "Lri;")
    public static class75 field7553 = new class75(22, -2);

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Lri;")
    public static class75 field7554 = new class75(23, 4);

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "Lri;")
    public static class75 field7555 = new class75(24, -1);

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "Lri;")
    public static class75 field7556 = new class75(25, -2);

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "[Lri;")
    private static class75[] field7557 = new class75[32];

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "Lhn;")
    public static class509 field7558;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field7545;

    static {
        class75[] var0 = class248.method1676((byte) 94);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field7557[var0[var1].field1077] = var0[var1];
        }
        field7558 = new class509(13, 0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3068(byte arg0) {
        class262.method1747(20556, class116.field1752);
        field7538++;
        if (arg0 > -110) {
            return;
        }
        class223.field3661++;
        if (class483.field6957 && class139.field2127) {
            int var1 = class184.field2800.method542(false);
            int var2 = class184.field2800.method543(true);
            int var3 = var2 - class419.field6264;
            int var4 = var1 - class447.field6554;
            if (var4 < class81.field1178) {
                var4 = class81.field1178;
            }
            if (class81.field1178 + class472.field6819.field1642 < var4 - -class116.field1752.field1642) {
                var4 = class81.field1178 + class472.field6819.field1642 - class116.field1752.field1642;
            }
            if (class18.field235 > var3) {
                var3 = class18.field235;
            }
            if (class116.field1752.field1627 + var3 > class18.field235 + class472.field6819.field1627) {
                var3 = class18.field235 + class472.field6819.field1627 - class116.field1752.field1627;
            }
            int var5 = class472.field6819.field1628 + var4 - class81.field1178;
            int var6 = var3 + class472.field6819.field1735 - class18.field235;
            if (class184.field2800.method1397(1013964455)) {
                if (class116.field1752.field1677 < class223.field3661) {
                    int var8 = var4 - class291.field4428;
                    int var9 = var3 - class506.field7389;
                    if (class116.field1752.field1637 < var8 || var8 < (-class116.field1752.field1637) || var9 > class116.field1752.field1637 || var9 < -class116.field1752.field1637) {
                        class10.field138 = true;
                    }
                }
                if (class116.field1752.field1711 != null && class10.field138) {
                    class405 var10 = new class405();
                    var10.field5994 = var5;
                    var10.field6008 = class116.field1752.field1711;
                    var10.field6007 = var6;
                    var10.field6004 = class116.field1752;
                    class192.method1356(var10);
                }
            } else {
                if (class10.field138) {
                    class329.method2090(-1);
                    if (class116.field1752.field1724 != null) {
                        class405 var7 = new class405();
                        var7.field6004 = class116.field1752;
                        var7.field6007 = var6;
                        var7.field6008 = class116.field1752.field1724;
                        var7.field5994 = var5;
                        var7.field5996 = class313.field4712;
                        class192.method1356(var7);
                    }
                    if (class313.field4712 != null && client.method1384(class116.field1752) != null) {
                        class346.method2159(class313.field4712, 14, class116.field1752);
                    }
                } else if ((class154.field2289 == 1 || class2.method5(-2001)) && class382.field5752 > 2) {
                    class119.method895(23145, class447.field6554 + class291.field4428, class419.field6264 - -class506.field7389);
                } else if (class431.method2676(118)) {
                    class119.method895(23145, class447.field6554 + class291.field4428, class506.field7389 + class419.field6264);
                }
                class116.field1752 = null;
            }
        } else if (class223.field3661 > 1) {
            class116.field1752 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lql;I)Z", line = 124)
    public static final boolean method3069(class519 arg0, int arg1) {
        field7534++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field7573) {
            return false;
        } else if (!arg0.method3082(class7.field82, -127)) {
            return false;
        } else if (class327.field4919.method2585((byte) 114, (long) arg0.field7586) != null) {
            return false;
        } else if (class490.field7042.method2585((byte) 114, (long) arg0.field7562) == null) {
            return arg1 == -17557 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I", line = 153)
    public static final int method3070(int arg0, int arg1) {
        field7545++;
        if (arg0 != -19764) {
            method3068((byte) -85);
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Lql;", line = 173)
    public final class519 method3071(int arg0, int arg1) {
        field7544++;
        class13 var3 = this.field7537;
        class519 var4;
        synchronized (this.field7537) {
            var4 = (class519) this.field7537.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 >= -104) {
            field7558 = null;
        }
        class406 var5 = this.field7533;
        byte[] var6;
        synchronized (this.field7533) {
            var6 = this.field7533.method2536(36, 0, arg1);
        }
        class519 var7 = new class519();
        var7.field7559 = this;
        var7.field7586 = arg1;
        if (var6 != null) {
            var7.method3087(0, new class217(var6));
        }
        var7.method3077((byte) 112);
        class13 var8 = this.field7537;
        synchronized (this.field7537) {
            this.field7537.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)V", line = 208)
    public final void method3072(boolean arg0, int arg1, int arg2) {
        field7540++;
        this.field7537 = new class13(arg2);
        if (arg0) {
            method3068((byte) -85);
        }
        this.field7541 = new class13(arg1);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 220)
    public final void method3073(int arg0) {
        field7535++;
        class13 var2 = this.field7537;
        synchronized (this.field7537) {
            this.field7537.method88(109);
        }
        if (arg0 != 4) {
            field7556 = null;
        }
        class13 var3 = this.field7541;
        synchronized (this.field7541) {
            this.field7541.method88(87);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 237)
    public static void method3074(int arg0) {
        if (arg0 != -2) {
            method3068((byte) 118);
        }
        field7548 = null;
        field7555 = null;
        field7551 = null;
        field7547 = null;
        field7549 = null;
        field7553 = null;
        field7543 = null;
        field7552 = null;
        field7550 = null;
        field7558 = null;
        field7557 = null;
        field7554 = null;
        field7556 = null;
        field7546 = null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lee;ILul;Lul;)V", line = 308)
    public class518(class480 arg0, int arg1, class406 arg2, class406 arg3) {
        this.field7533 = arg2;
        this.field7536 = arg3;
        this.field7533.method2551(36, -26070);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(II)V", line = 267)
    public final void method3075(int arg0, int arg1) {
        class13 var3 = this.field7537;
        synchronized (this.field7537) {
            this.field7537.method91(24, arg0);
        }
        if (arg1 != -16302) {
            field7553 = null;
        }
        field7542++;
        class13 var4 = this.field7541;
        synchronized (this.field7541) {
            this.field7541.method91(arg1 + 16346, arg0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 291)
    public final void method3076(byte arg0) {
        field7539++;
        class13 var2 = this.field7537;
        synchronized (this.field7537) {
            this.field7537.method93((byte) 80);
        }
        int var3 = 55 % ((-arg0 - 66) / 32);
        class13 var4 = this.field7541;
        synchronized (this.field7541) {
            this.field7541.method93((byte) 90);
        }
    }
}
