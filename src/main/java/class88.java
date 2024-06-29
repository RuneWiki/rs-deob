import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class88 extends class138 {

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Ljava/util/Random;")
    public static Random field1341 = new Random();

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "[I")
    public static int[] field1350 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    public static int field1354 = 99;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "Lck;")
    public static class119 field1352 = class298.method1987((byte) 4, "springdale");

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "[S")
    public static short[] field1355 = new short[500];

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLuc;I)V", line = 15)
    public static final void method594(boolean arg0, class253 arg1, int arg2) {
        if (class233.field3760 != null) {
            try {
                class233.field3760.method1629(-92);
            } catch (Exception var11) {
            }
            class233.field3760 = null;
        }
        field1331++;
        class233.field3760 = arg1;
        class244.method1595(arg0, true);
        class96.field1477 = null;
        class207.field3305 = null;
        class139.field2227.field44 = 0;
        class261.field4173 = 0;
        while (true) {
            class117 var4 = (class117) class93.field1431.method1325(-127);
            if (var4 == null) {
                while (true) {
                    class117 var5 = (class117) class260.field4153.method1325(-60);
                    if (var5 == null) {
                        if (arg2 != 2047) {
                            field1354 = -59;
                        }
                        if (class241.field3871 != 0) {
                            try {
                                class3 var6 = new class3(4);
                                var6.method32(4, (byte) -99);
                                var6.method32(class241.field3871, (byte) -99);
                                var6.method40(0, -90);
                                class233.field3760.method1630(0, 4, (byte) -70, var6.field101);
                            } catch (IOException var10) {
                                try {
                                    class233.field3760.method1629(arg2 - 2122);
                                } catch (Exception var9) {
                                }
                                class233.field3760 = null;
                                class215.field3426++;
                            }
                        }
                        class207.field3297 = 0;
                        class204.field3236 = class110.method707((byte) 93);
                        return;
                    }
                    class265.field4328.method590((byte) -3, var5);
                    class261.field4177.method1326(var5.field1218, (byte) -114, var5);
                    class46.field666++;
                    class230.field3727--;
                }
            }
            class209.field3332.method1326(var4.field1218, (byte) -113, var4);
            class156.field2483--;
            class196.field3139++;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BII)I", line = 103)
    public static final int method595(int arg0, byte[] arg1, int arg2, int arg3) {
        field1337++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = class78.field1198[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (arg0 != 40) {
            method597(-73, 53);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V", line = 127)
    public static final void method596(int arg0) {
        field1332++;
        if (class270.field4462 > 0) {
            class283.method1885(65);
            return;
        }
        class204.method1289(111, 40);
        class191.field3018 = class44.field660;
        class44.field660 = null;
        if (arg0 != -24060) {
            method598(16, -117);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Lck;", line = 147)
    public static final class119 method597(int arg0, int arg1) {
        if (arg1 != 1361938307) {
            method595(26, (byte[]) null, 35, 100);
        }
        field1348++;
        return class170.method1074(new class119[] { class234.method1506(arg0 >> 24 & 0xFF, (byte) -79), class56.field894, class234.method1506((arg0 & 0xFFFA17) >> 16, (byte) -79), class56.field894, class234.method1506(arg0 >> 8 & 0xFF, (byte) -79), class56.field894, class234.method1506(arg0 & 0xFF, (byte) -79) }, -116);
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(II)V", line = 170)
    public static final void method598(int arg0, int arg1) {
        class266.field4359.method491(-126, arg0);
        class126.field1940.method491(-22, arg0);
        if (arg1 == -21732) {
            field1342++;
            class285.field4708.method491(-43, arg0);
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 185)
    public static final void method599(int arg0) {
        if (arg0 != -18513) {
            return;
        }
        for (int var1 = 0; var1 < class157.field2499; var1++) {
            int var2 = class23.field348[var1];
            class163 var3 = class70.field1103[var2];
            if (var3 != null) {
                class257.method1650(var3.field2575.field796, var3, (byte) 118);
            }
        }
        field1338++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BIIII)V", line = 238)
    public final void method600(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1339++;
        int var6 = this.field1346 << 3;
        int var7 = this.field1344 << 3;
        if (arg0 > -89) {
            this.method143(53, -42);
        }
        int var8 = (arg4 << 4) + (var6 & 0xF);
        int var9 = (arg3 << 4) + (var7 & 0xF);
        this.method144(var6, var7, var8, var9, arg1, arg2);
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(II)V", line = 254)
    public static final void method601(int arg0, int arg1) {
        int var2 = 12 % ((arg1 - 50) / 40);
        class176.field2809.method491(-33, arg0);
        field1333++;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 263)
    public static void method602(int arg0) {
        field1350 = null;
        if (arg0 != 1361938307) {
            field1355 = (short[]) null;
        }
        field1341 = null;
        field1355 = null;
        field1352 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
    public abstract void method338(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public abstract void method143(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIII)V")
    public abstract void method332(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
    public abstract void method138(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public abstract void method145(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)V")
    public abstract void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V")
    public abstract void method139(int arg0, int arg1);
}
