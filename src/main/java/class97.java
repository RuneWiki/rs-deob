import java.io.IOException;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class97 extends class243 {

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    public static int field1703 = 0;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "Luh;")
    public static class198 field1701 = new class198();

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "Lrb;")
    public static class254 field1704 = new class254(30);

    @OriginalMember(owner = "client!lf", name = "kb", descriptor = "Lnativeadvert/browsercontrol;")
    public static browsercontrol field1706 = null;

    @OriginalMember(owner = "client!lf", name = "lb", descriptor = "[S")
    public static short[] field1707 = new short[] { 44, 19, 23, 57, 34, 6, 43, 13 };

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    private int field1696;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    private int field1698;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "Lnh;")
    public static class57 field1705;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V")
    private final void method599(int arg0, int arg1) {
        this.field1698 = (arg0 & 65280) >> 4;
        ++field1699;
        this.field1694 = arg0 >> 12 & 4080;
        if (arg1 != 1924654380) {
            method601(-42);
        }
        this.field1696 = arg0 << 4 & 4080;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class97() {
        this(0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        int[][] var3 = super.field4213.method1406(arg1, 0);
        ++field1700;
        if (arg0 != 230) {
            method602(-17, -66, -126, -95, 47);
        }
        if (super.field4213.field3771) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class212.field3586; ++var7) {
                var5[var7] = this.field1694;
                var4[var7] = this.field1698;
                var6[var7] = this.field1696;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
    private class97(int arg0) {
        super(0, false);
        this.method599(arg0, 1924654380);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lth;ZB)V")
    public static final void method600(class239 arg0, boolean arg1, byte arg2) {
        ++field1695;
        if (!arg1) {
            class125.field2242 = 3;
            class26.method133(512, true);
            class77.field1358 = true;
            class13.field251 = true;
            class248.field4311 = 127;
            class254.field4463 = true;
            class31.field492 = true;
            class221.field3753 = 2;
            class70.field1234 = true;
            class14.field274 = 0;
            class186.field3168 = true;
            client.field1450 = true;
            class128.field2262 = true;
            class179.field3072 = 255;
            class95.field1645 = true;
            class173.field2899 = 0;
            class141.field2430 = 0;
            class193.field3294 = 127;
            class220.field3721 = true;
            class137 var3 = null;
            class71.field1256 = true;
            try {
                class74 var4 = arg0.method1598((byte) 44, "runescape");
                while (~var4.field1302 == -1) {
                    class171.method1088(89, 1L);
                }
                if (~var4.field1302 == -2) {
                    var3 = (class137) var4.field1299;
                    byte[] var5 = new byte[(int) var3.method857(105)];
                    int var7;
                    for (int var6 = 0; ~var6 > ~var5.length; var6 += var7) {
                        var7 = var3.method858(var5.length + -var6, var6, var5, -1);
                        if (var7 == -1) {
                            throw new IOException("EOF");
                        }
                    }
                    class57.method351(-2, new class226(var5));
                }
            } catch (Exception var9) {
            }
            try {
                if (var3 != null) {
                    var3.method856((byte) -122);
                }
            } catch (Exception var8) {
            }
        } else {
            class125.field2242 = 3;
            class26.method133(512, false);
            class193.field3294 = 127;
            class179.field3072 = 255;
            class128.field2262 = false;
            client.field1450 = false;
            class141.field2430 = 0;
            class31.field492 = false;
            class14.field274 = 0;
            class13.field251 = false;
            class186.field3168 = false;
            class77.field1358 = false;
            class173.field2899 = 0;
            class71.field1256 = false;
            class70.field1234 = false;
            class254.field4463 = false;
            class95.field1645 = false;
            class248.field4311 = 127;
            class220.field3721 = false;
            class221.field3753 = 0;
            class190.method1206(arg0, 787032834);
        }
        if (arg2 < 25) {
            method602(-97, -17, 106, -100, 73);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            this.method599(arg0.method1444(171285352), 1924654380);
        }
        if (arg1) {
            method601(-64);
        }
        ++field1697;
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public static void method601(int arg0) {
        field1707 = null;
        field1704 = null;
        field1701 = null;
        field1706 = null;
        int var1 = -113 % ((32 - arg0) / 38);
        field1705 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public static final void method602(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class174.field2910 = -1;
        class184.field3136 = class45.field753 * arg3 / arg2;
        class242.field4205 = class249.field4322 * arg4 / arg0;
        ++field1702;
        class109.field2045 = -1;
        if (arg1 == 127) {
            class103.method629((byte) -72);
        }
    }
}
