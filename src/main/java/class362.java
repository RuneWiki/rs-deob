import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class362 extends class109 implements class193 {

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "Z")
    private boolean field5012;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "B")
    private byte field5007;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "Z")
    private boolean field5020;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "S")
    private short field5013;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "Z")
    private boolean field5015;

    @OriginalMember(owner = "client!iq", name = "ab", descriptor = "B")
    private byte field5033;

    @OriginalMember(owner = "client!iq", name = "bb", descriptor = "Z")
    private boolean field5034;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "Lmj;")
    private class394 field5008;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "Lmc;")
    private class69 field5021;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field5014 = 0;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "[[I")
    public static int[][] field5005 = new int[128][128];

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!iq", name = "V", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!iq", name = "Y", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!iq", name = "Z", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!iq", name = "cb", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!iq", name = "db", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "Lnq;")
    public static class268 field5004;

    @OriginalMember(owner = "client!iq", name = "W", descriptor = "[Lri;")
    public static class59[] field5029;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lko;Ljava/lang/String;IB)Laa;")
    public static final class283 method2325(class294 arg0, String arg1, int arg2, byte arg3) {
        ++field5011;
        if (arg2 == 0) {
            return arg0.method1905(0, arg1);
        } else if (~arg2 == -2) {
            try {
                class262.method1716(new Object[] { (new URL(arg0.field4121.getCodeBase(), arg1)).toString() }, "openjs", arg0.field4121, -83);
                class283 var4 = new class283();
                var4.field3998 = 1;
                return var4;
            } catch (Throwable var10) {
                class283 var5 = new class283();
                var5.field3998 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg0.field4121.getAppletContext().showDocument(new URL(arg0.field4121.getCodeBase(), arg1), "_blank");
                class283 var6 = new class283();
                var6.field3998 = 1;
                return var6;
            } catch (Exception var11) {
                class283 var7 = new class283();
                var7.field3998 = 2;
                return var7;
            }
        } else if (~arg2 == -4) {
            try {
                class262.method1715("loggedout", arg0.field4121, (byte) -112);
            } catch (Throwable var13) {
            }
            try {
                arg0.field4121.getAppletContext().showDocument(new URL(arg0.field4121.getCodeBase(), arg1), "_top");
                class283 var8 = new class283();
                var8.field3998 = 1;
                return var8;
            } catch (Exception var12) {
                class283 var9 = new class283();
                var9.field3998 = 2;
                return var9;
            }
        } else if (arg3 <= 124) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Luo;Lgm;IIIIZIZ)V")
    public class362(class345 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field882, arg1.field875);
        this.field5012 = ~arg1.field922 != -1 && !arg6;
        this.field5007 = (byte) arg2;
        this.field5020 = arg6;
        super.field1568 = (short) arg3;
        this.field5013 = (short) arg1.field916;
        this.field5015 = arg8;
        super.field1576 = (short) arg5;
        this.field5033 = (byte) arg7;
        this.field5034 = arg0.method125() && arg1.field939 && !this.field5020 && ~class327.field4508 != -1;
        int var10 = 1024;
        if (this.field5015) {
            var10 |= 32768;
        }
        class33 var11 = this.method2327((byte) -36, this.field5034, arg0, var10);
        if (var11 != null) {
            this.field5008 = var11.field516;
            this.field5021 = var11.field520;
            if (this.field5015) {
                this.field5008 = this.field5008.method1430((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)V")
    public static void method2326(byte arg0) {
        field5029 = null;
        if (arg0 == -60) {
            field5005 = null;
            field5004 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILuo;I)Lmj;")
    public final class394 method685(int arg0, class345 arg1, int arg2) {
        ++field5036;
        if (arg2 != -9380) {
            method2325((class294) null, (String) null, 71, (byte) -71);
        }
        return this.method2329(arg1, arg0, false);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Luo;I)V")
    public final void method677(class345 arg0, int arg1) {
        if (arg1 >= 33) {
            ++field5032;
            Object var3 = null;
            class69 var5;
            if (this.field5021 == null && this.field5034) {
                class33 var4 = this.method2327((byte) 127, true, arg0, 131072);
                var5 = var4 != null ? var4.field520 : null;
            } else {
                var5 = this.field5021;
                this.field5021 = null;
            }
            if (var5 != null) {
                class91.method648(var5, this.field5007, super.field1568, super.field1576, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZLuo;I)Lvg;")
    private final class33 method2327(byte arg0, boolean arg1, class345 arg2, int arg3) {
        ++field5031;
        class64 var5 = class375.method2395((byte) 37, this.field5013 & 65535);
        int var6 = -61 % ((80 - arg0) / 44);
        class242 var7;
        class242 var8;
        if (this.field5020) {
            var7 = class214.field2979[this.field5007];
            var8 = class418.field5939[0];
        } else {
            if (~this.field5007 <= -4) {
                var8 = null;
            } else {
                var8 = class418.field5939[this.field5007 + 1];
            }
            var7 = class418.field5939[this.field5007];
        }
        return var5.method497(arg2, this.field5033, super.field1568, 22, var7, (byte) -11, super.field1573, var8, super.field1576, arg1, arg3);
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)V")
    public final void method674(byte arg0) {
        ++field5030;
        this.field5015 = false;
        if (this.field5008 != null) {
            this.field5008.method1453(this.field5008.method1424() & -32769);
        }
        if (arg0 != -1) {
            method2328(53);
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)Z")
    public final boolean method691(byte arg0) {
        if (arg0 != -72) {
            return true;
        } else {
            ++field5024;
            return this.field5034;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBIILrr;Luo;Z)V")
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg4 instanceof class362) {
            class362 var8 = (class362) arg4;
            if (this.field5008 != null && var8.field5008 != null) {
                this.field5008.method1454(var8.field5008, arg3, arg2, arg0, arg6);
            }
        }
        if (arg1 == -126) {
            ++field5027;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
    public final void method680(int arg0) {
        if (this.field5008 != null) {
            this.field5008.method1467();
        }
        ++field5019;
        if (arg0 != -24686) {
            this.method680(118);
        }
    }

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V")
    public static final void method2328(int arg0) {
        class404.method2531(26878, class432.field6109);
        ++field5028;
        ++class388.field5573;
        if (class280.field3921 && class292.field4095) {
            int var1 = class239.field3410.method1071((byte) -12);
            int var2 = class239.field3410.method1068((byte) 86);
            int var3 = var1 - class243.field3451;
            int var4 = var2 - class73.field1048;
            if (~class432.field6109.field6310 > ~class388.field5573) {
                int var5 = -class17.field311 + var3;
                int var6 = -class39.field557 + var4;
                if (class432.field6109.field6364 < var5 || ~(-class432.field6109.field6364) < ~var5 || var6 > class432.field6109.field6364 || ~(-class432.field6109.field6364) < ~var6) {
                    class5.field92 = true;
                }
            }
            if (~class326.field4459 < ~var3) {
                var3 = class326.field4459;
            }
            if (~(class326.field4459 + client.field2275.field6342) > ~(class432.field6109.field6342 + var3)) {
                var3 = class326.field4459 + client.field2275.field6342 + -class432.field6109.field6342;
            }
            if (~var4 > ~class373.field5242) {
                var4 = class373.field5242;
            }
            if (class432.field6109.field6447 + var4 > class373.field5242 + client.field2275.field6447) {
                var4 = -class432.field6109.field6447 + class373.field5242 - -client.field2275.field6447;
            }
            int var7 = var3 - (class326.field4459 - client.field2275.field6444);
            int var8 = -class373.field5242 + var4 - -client.field2275.field6344;
            if (class432.field6109.field6449 != null && class5.field92) {
                class7 var9 = new class7();
                var9.field95 = class432.field6109;
                var9.field94 = var7;
                var9.field97 = class432.field6109.field6449;
                var9.field99 = var8;
                class177.method1168(var9);
            }
            if (arg0 <= -55) {
                if (!class239.field3410.method1067(5)) {
                    if (class5.field92) {
                        if (class432.field6109.field6416 != null) {
                            class7 var10 = new class7();
                            var10.field96 = class1.field9;
                            var10.field94 = var7;
                            var10.field97 = class432.field6109.field6416;
                            var10.field99 = var8;
                            var10.field95 = class432.field6109;
                            class177.method1168(var10);
                        }
                        if (class1.field9 != null && client.method1100(class432.field6109) != null) {
                            class12.method218(90, class1.field9, class432.field6109);
                        }
                    } else if ((class382.field5456 == 1 || class54.method448(-29170)) && class90.field1260 > 2) {
                        class146.method996(class73.field1048 + class39.field557, (byte) -46, 2, class243.field3451 + class17.field311);
                    } else if (class427.method2697(-1)) {
                        class146.method996(class73.field1048 + class39.field557, (byte) -78, 0, class243.field3451 - -class17.field311);
                    }
                    class432.field6109 = null;
                }
            }
        } else {
            if (class388.field5573 > 1) {
                class432.field6109 = null;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Luo;IZ)Lmj;")
    private final class394 method2329(class345 arg0, int arg1, boolean arg2) {
        ++field5023;
        if (this.field5008 != null && arg0.method139(this.field5008.method1424(), arg1) == 0) {
            return this.field5008;
        } else {
            class33 var4 = this.method2327((byte) 124, arg2, arg0, arg1);
            return var4 == null ? null : var4.field516;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILuo;)V")
    public final void method676(int arg0, class345 arg1) {
        ++field5016;
        if (arg0 > -58) {
            this.method685(-79, (class345) null, 90);
        }
        Object var3 = null;
        class69 var5;
        if (this.field5021 == null && this.field5034) {
            class33 var4 = this.method2327((byte) -46, true, arg1, 131072);
            var5 = var4 == null ? null : var4.field520;
        } else {
            var5 = this.field5021;
            this.field5021 = null;
        }
        if (var5 != null) {
            class423.method2681(var5, this.field5007, super.field1568, super.field1576, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I")
    public final int method689(byte arg0) {
        ++field5010;
        return arg0 != -83 ? -31 : 65535 & this.field5013;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)I")
    public final int method684(int arg0) {
        if (arg0 != -13726) {
            return -75;
        } else {
            ++field5017;
            return 22;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLuo;)Laj;")
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field5006;
        if (this.field5008 == null) {
            return null;
        } else {
            if (!arg0) {
                this.method685(73, (class345) null, 11);
            }
            class417 var3 = arg1.method84();
            var3.method702(super.field1568, super.field1573, super.field1576);
            class170 var4 = null;
            if (this.field5012) {
                var4 = class175.method1152((byte) 72, 1);
            }
            this.field5008.method1416(var3, var4 != null ? var4.field2333[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IILuo;I)Z")
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        if (arg1 != -20759) {
            this.method689((byte) 24);
        }
        ++field5009;
        class394 var5 = this.method2329(arg2, 65536, false);
        if (var5 != null) {
            class417 var6 = arg2.method84();
            var6.method702(super.field1568, super.field1573, super.field1576);
            return var5.method1465(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
    public final int method672(int arg0) {
        if (arg0 != 17011) {
            this.method674((byte) 11);
        }
        ++field5018;
        return this.field5033;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Luo;I)V")
    public final void method678(class345 arg0, int arg1) {
        if (arg1 == -22948) {
            ++field5025;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)Z")
    public final boolean method683(byte arg0) {
        ++field5026;
        int var2 = -110 / ((47 - arg0) / 47);
        return this.field5015;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBI)V")
    public static final void method2330(int arg0, byte arg1, int arg2) {
        if (arg1 > -111) {
            method2328(-49);
        }
        ++field5035;
        class239 var3 = class436.method2740(13, arg0, -323285792);
        var3.method1622(88);
        var3.field3399 = arg2;
    }
}
