import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 extends class128 {

    @OriginalMember(owner = "client!d", name = "P", descriptor = "[Lfe;")
    public class41[] field536 = new class41[5];

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public int field546 = 0;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "[I")
    public int[] field552 = new int[5];

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lid;")
    public static class60 field518 = class11.method72("Das ist eine Mitglieder)2Welt(Q", (byte) -86);

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Lid;")
    public static class60 field521 = class11.method72(":duelreq:", (byte) 117);

    @OriginalMember(owner = "client!d", name = "B", descriptor = "[I")
    public static int[] field523 = new int[32];

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Lwd;")
    public static class157 field519 = new class157(5000);

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "Z")
    public static boolean field548 = false;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "Lid;")
    public static class60 field549 = class11.method72("Standort", (byte) -23);

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Lod;")
    public class101 field538;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lqa;")
    public class112 field539;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "Lrf;")
    public class124 field529;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "Ld;")
    public class22 field535;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Lhe;")
    public class54 field525;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "Lae;")
    public static class6 field551;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "Lmf;")
    public class89 field530;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "Lne;")
    public class95 field543;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "Z")
    public boolean field526;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "Z")
    public boolean field532;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "Z")
    public boolean field542;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "[[[B")
    public static byte[][][] field520;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)Z")
    public static final boolean method178(byte arg0) {
        if (arg0 <= 90) {
            return true;
        }
        field516++;
        class145 var1 = class133.field3041;
        synchronized (class133.field3041) {
            if (class89.field2204 == class1.field34) {
                return false;
            } else {
                class136.field3095 = class51.field1297[class1.field34];
                class152.field3414 = class135.field3066[class1.field34];
                class1.field34 = class1.field34 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public static void method179(int arg0) {
        if (arg0 != -20116) {
            return;
        }
        field549 = null;
        field523 = null;
        field520 = null;
        field518 = null;
        field551 = null;
        field521 = null;
        field519 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILie;)Z")
    public static final boolean method180(int arg0, int arg1, class61 arg2) {
        field517++;
        if (arg1 > -71) {
            field551 = null;
        }
        byte[] var3 = arg2.method471(22944, arg0);
        if (var3 == null) {
            return false;
        } else {
            class13.method84(-127, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
    public class22(int arg0, int arg1, int arg2) {
        this.field540 = this.field547 = arg0;
        this.field534 = arg1;
        this.field537 = arg2;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B[Lfd;I)V")
    public static final void method181(byte arg0, class40[] arg1, int arg2) {
        int var3 = 0;
        if (arg0 >= -41) {
            return;
        }
        while (arg1.length > var3) {
            class40 var4 = arg1[var3];
            if (var4 != null && var4.field1028 == arg2 && (!var4.field977 || !class45.method351(var4, 23154))) {
                label97: {
                    if (var4.field938 == 0) {
                        if (!var4.field977 && class45.method351(var4, 23154) && class67.field1637 != var4) {
                            break label97;
                        }
                        method181((byte) -123, arg1, var4.field1008);
                        if (var4.field1052 != null) {
                            method181((byte) -94, var4.field1052, var4.field1008);
                        }
                        class81 var5 = (class81) class39.field929.method716((byte) 86, (long) var4.field1008);
                        if (var5 != null) {
                            class42.method331(var5.field2012, (byte) 118);
                        }
                    }
                    if (var4.field938 == 6) {
                        if (var4.field939 != -1 || var4.field1023 != -1) {
                            boolean var6 = class38.method299((byte) -104, var4);
                            int var7;
                            if (var6) {
                                var7 = var4.field1023;
                            } else {
                                var7 = var4.field939;
                            }
                            if (var7 != -1) {
                                class46 var8 = class44.method344(var7, (byte) -94);
                                var4.field1013 += class75.field1802;
                                while (var4.field1013 > var8.field1196[var4.field1067]) {
                                    var4.field1013 -= var8.field1196[var4.field1067];
                                    var4.field1067++;
                                    if (var8.field1218.length <= var4.field1067) {
                                        var4.field1067 -= var8.field1209;
                                        if (var4.field1067 < 0 || var8.field1218.length <= var4.field1067) {
                                            var4.field1067 = 0;
                                        }
                                    }
                                    class12.method79(-30833, var4);
                                }
                            }
                        }
                        if (var4.field985 != 0 && !var4.field977) {
                            int var9 = var4.field985 >> 16;
                            int var10 = var4.field985 << 16 >> 16;
                            int var11 = class75.field1802 * var9;
                            int var12 = class75.field1802 * var10;
                            var4.field952 = var4.field952 + var11 & 0x7FF;
                            var4.field980 = var4.field980 + var12 & 0x7FF;
                            class12.method79(-30833, var4);
                        }
                    }
                }
            }
            var3++;
        }
        field522++;
    }
}
