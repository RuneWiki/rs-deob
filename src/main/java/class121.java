import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class121 {

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "J")
    private long field1762 = -1L;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "Ltm;")
    private class412 field1769 = new class412();

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "[I")
    public static int[] field1768 = new int[2];

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Ljw;")
    public static class581 field1760 = new class581(72, 6);

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1770 = -1;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "J")
    private long field1761;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljp;I)V")
    private final void method993(class376 arg0, int arg1) {
        if (arg1 != -9441) {
            method994((byte) -88);
        }
        field1766++;
        this.field1761 = arg0.method2366(true);
        this.field1762 = arg0.method2366(true);
        for (int var3 = arg0.method2398(-1372747256); var3 != 0; var3 = arg0.method2398(arg1 ^ 0x51D25117)) {
            class775 var4;
            if (var3 == 1) {
                var4 = new class641();
            } else if (var3 == 4) {
                var4 = new class507();
            } else if (var3 == 3) {
                var4 = new class604();
            } else if (var3 == 2) {
                var4 = new class560();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var4.method2934(3, arg0);
            this.field1769.method2545(arg1 + 9313, var4);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method994(byte arg0) {
        field1768 = null;
        int var1 = 127 % ((arg0 - 18) / 32);
        field1760 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)I")
    public static final int method995(int arg0) {
        field1763++;
        if (class451.field6280 == 0) {
            class273.field4027.method1774(new class77("jaclib"), (byte) -110);
            if (class273.field4027.method1777((byte) -74).method269((byte) 117) != 100) {
                return 1;
            }
            if (!((class77) class273.field4027.method1777((byte) -59)).method669(-102)) {
                class627.field8774.method1935(31);
            }
            class451.field6280 = 1;
        }
        if (class451.field6280 == 1) {
            class752.field10417 = class273.method1773(1);
            class273.field4021.method1774(new class38(class162.field2210), (byte) -83);
            class273.field4029.method1774(new class77("jaggl"), (byte) -78);
            class273.field4033.method1774(new class77("jagdx"), (byte) -87);
            class273.field4034.method1774(new class77("jagmisc"), (byte) -95);
            class273.field4035.method1774(new class77("sw3d"), (byte) -90);
            class273.field4036.method1774(new class77("hw3d"), (byte) -105);
            class273.field4037.method1774(new class77("jagtheora"), (byte) -62);
            class273.field4038.method1774(new class38(class482.field6667), (byte) -86);
            class273.field4039.method1774(new class38(class16.field241), (byte) -121);
            class273.field4040.method1774(new class38(class637.field8871), (byte) -107);
            class273.field4041.method1774(new class38(class281.field4150), (byte) -109);
            class273.field4042.method1774(new class38(class473.field6529), (byte) -104);
            class273.field4043.method1774(new class38(class108.field1492), (byte) -59);
            class273.field4044.method1774(new class38(class262.field3891), (byte) -116);
            class273.field4045.method1774(new class38(class33.field530), (byte) -112);
            class273.field4046.method1774(new class38(class598.field8141), (byte) -97);
            class273.field4047.method1774(new class38(class554.field7478), (byte) -118);
            class273.field4048.method1774(new class38(class461.field6394), (byte) -67);
            class273.field4049.method1774(new class38(class583.field7790), (byte) -107);
            class273.field4050.method1774(new class38(class219.field2911), (byte) -108);
            class273.field4051.method1774(new class38(class138.field2009), (byte) -109);
            class273.field4052.method1774(new class653(class586.field7805, "huffman"), (byte) -88);
            class273.field4053.method1774(new class38(class415.field5964), (byte) -81);
            class273.field4054.method1774(new class38(class383.field5606), (byte) -124);
            class273.field4055.method1774(new class38(class781.field10716), (byte) -74);
            class273.field4056.method1774(new class447(class466.field6466, "details"), (byte) -69);
            for (int var1 = 0; var1 < class752.field10417.length; var1++) {
                if (class752.field10417[var1].method1777((byte) -128) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class273[] var3 = class752.field10417;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class273 var5 = var3[var4];
                int var6 = var5.method1776(97);
                int var7 = var5.method1777((byte) -93).method269((byte) -70);
                var2 += var6 * var7 / 100;
            }
            class451.field6280 = 2;
            class357.field5231 = var2;
        }
        if (class752.field10417 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class273[] var11 = class752.field10417;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class273 var17 = var11[var12];
            int var18 = var17.method1776(-114);
            int var19 = var17.method1777((byte) -82).method269((byte) -103);
            if (var19 < 100) {
                var10 = false;
            }
            var8 += var18;
            var9 += var18 * var19 / 100;
        }
        if (var10) {
            if (!((class77) class273.field4034.method1777((byte) -60)).method669(-55)) {
                class627.field8774.method1929(97);
            }
            if (!((class77) class273.field4037.method1777((byte) -128)).method669(-62)) {
                class99.field1387 = class627.field8774.method1922(-1);
            }
            class752.field10417 = null;
        }
        int var13 = 20 % ((arg0 - 13) / 49);
        int var14 = var9 - class357.field5231;
        int var15 = var8 - class357.field5231;
        int var16 = var15 <= 0 ? 100 : var14 * 100 / var15;
        if (!var10 && var16 > 99) {
            var16 = 99;
        }
        return var16;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lor;BZII)V")
    public static final void method996(class668 arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field1764++;
        int var5 = arg0.field9282;
        if (arg1 >= -100) {
            method995(-2);
        }
        if (arg0.field9228 == 0) {
            arg0.field9282 = arg0.field9223;
        } else if (arg0.field9228 == 1) {
            arg0.field9282 = arg4 - arg0.field9223;
        } else if (arg0.field9228 == 2) {
            arg0.field9282 = arg0.field9223 * arg4 >> 14;
        }
        int var6 = arg0.field9297;
        if (arg0.field9286 == 0) {
            arg0.field9297 = arg0.field9270;
        } else if (arg0.field9286 == 1) {
            arg0.field9297 = arg3 - arg0.field9270;
        } else if (arg0.field9286 == 2) {
            arg0.field9297 = arg0.field9270 * arg3 >> 14;
        }
        if (arg0.field9228 == 4) {
            arg0.field9282 = arg0.field9366 * arg0.field9297 / arg0.field9219;
        }
        if (arg0.field9286 == 4) {
            arg0.field9297 = arg0.field9282 * arg0.field9219 / arg0.field9366;
        }
        if (class688.field9683 && (client.method2022(arg0).field1521 != 0 || arg0.field9353 == 0)) {
            if (arg0.field9297 < 5 && arg0.field9282 < 5) {
                arg0.field9297 = 5;
                arg0.field9282 = 5;
            } else {
                if (arg0.field9297 <= 0) {
                    arg0.field9297 = 5;
                }
                if (arg0.field9282 <= 0) {
                    arg0.field9282 = 5;
                }
            }
        }
        if (class630.field8816 == arg0.field9271) {
            class249.field3687 = arg0;
        }
        if (arg2 && arg0.field9350 != null && arg0.field9282 != var5 || arg0.field9297 != var6) {
            class12 var7 = new class12();
            var7.field190 = arg0;
            var7.field186 = arg0.field9350;
            class374.field5403.method2545(-127, var7);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLhka;)V")
    public final void method997(byte arg0, class56 arg1) {
        field1767++;
        if (this.field1761 != arg1.field1409 || this.field1762 != arg1.field787) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg1.field1409 + " updateNum:" + arg1.field787 + " delta.clanHash:" + this.field1761 + " updateNum:" + this.field1762);
        }
        int var3 = -120 % ((45 - arg0) / 39);
        for (class775 var4 = (class775) this.field1769.method2551((byte) -108); var4 != null; var4 = (class775) this.field1769.method2542(-112)) {
            var4.method2935((byte) -116, arg1);
        }
        arg1.field787++;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljp;)V")
    public class121(class376 arg0) {
        this.method993(arg0, -9441);
    }
}
