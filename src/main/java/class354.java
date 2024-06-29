import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class354 {

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "Ljp;")
    private class236 field4787 = new class236(64);

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Lpc;")
    private class473 field4780;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field4782 = 0;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "Ljk;")
    public static class446 field4786;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(JIII)V", line = 14)
    public static final void method2067(long arg0, int arg1, int arg2, int arg3) {
        field4788++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = (int) arg0 >> 20 & 0x3;
        if (arg2 != -18534) {
            return;
        }
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class279.method1654(var5, arg2 ^ 0x4865, 0, arg1, 0, 0, true, arg3, var6);
            return;
        }
        class1 var8 = class402.field5388.method1994(-17294, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field16;
            var9 = var8.field82;
        } else {
            var9 = var8.field16;
            var10 = var8.field82;
        }
        int var11 = var8.field38;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class279.method1654(0, arg2 ^ 0x4865, var9, arg1, var11, var10, true, arg3, 0);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)Ldf;", line = 62)
    public static final class274 method2068(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        }
        field4784++;
        if (arg1 == 0) {
            if ((double) class6.field164 == 3.0D) {
                return class96.field1460;
            }
            if ((double) class6.field164 == 4.0D) {
                return class270.field3543;
            }
            if ((double) class6.field164 == 6.0D) {
                return class23.field415;
            }
            if ((double) class6.field164 >= 8.0D) {
                return class140.field2038;
            }
        } else if (arg1 == 1) {
            if ((double) class6.field164 == 3.0D) {
                return class23.field415;
            }
            if ((double) class6.field164 == 4.0D) {
                return class140.field2038;
            }
            if ((double) class6.field164 == 6.0D) {
                return class403.field5558;
            }
            if ((double) class6.field164 >= 8.0D) {
                return class233.field3138;
            }
        } else if (arg1 == 2) {
            if ((double) class6.field164 == 3.0D) {
                return class403.field5558;
            }
            if ((double) class6.field164 == 4.0D) {
                return class233.field3138;
            }
            if ((double) class6.field164 == 6.0D) {
                return class217.field2934;
            }
            if ((double) class6.field164 >= 8.0D) {
                return class189.field2663;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lpc;Lpc;Z)V", line = 133)
    public static final void method2069(class473 arg0, class473 arg1, boolean arg2) {
        field4781++;
        if (!arg2) {
            method2067(-61L, -19, -41, 20);
        }
        class59.field920 = arg0;
        class326.field4288 = arg1;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 145)
    public static void method2070(byte arg0) {
        if (arg0 < 115) {
            field4786 = null;
        }
        field4786 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lsm;", line = 155)
    public final class185 method2071(int arg0, int arg1) {
        field4779++;
        class236 var3 = this.field4787;
        class185 var4;
        synchronized (this.field4787) {
            var4 = (class185) this.field4787.method1456((long) arg1, 121);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4780.method2708(arg0, arg1, (byte) 54);
        class185 var6 = new class185();
        if (var5 != null) {
            var6.method1205(13185, new class379(var5));
        }
        class236 var7 = this.field4787;
        synchronized (this.field4787) {
            this.field4787.method1462(var6, (long) arg1, -92);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)V", line = 179)
    public static final void method2072(byte arg0, int arg1) {
        if (arg0 != 44) {
            field4786 = null;
        }
        field4785++;
        class253 var2 = class332.method1911(arg1, (byte) -13, 12);
        var2.method1523((byte) -124);
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lrb;ILpc;)V", line = 196)
    public class354(class234 arg0, int arg1, class473 arg2) {
        this.field4780 = arg2;
        this.field4780.method2710(5, (byte) -118);
    }
}
