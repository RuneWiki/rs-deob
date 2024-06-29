import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field629 = 50;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lrd;")
    public static class114 field637 = class84.method656("Ausw-=hlen", (byte) 126);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lrd;")
    private static class114 field624 = class84.method656("Hidden", (byte) 121);

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lrd;")
    private static class114 field631 = class84.method656("Loading ignore list", (byte) 117);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lrd;")
    public static class114 field625 = field631;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lrd;")
    public static class114 field641 = class84.method656("Lade Eingabe)2Steuerungsprogramm)3)3)3", (byte) 114);

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
    public static int[] field632 = new int[25];

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lrd;")
    private static class114 field634 = class84.method656("Username: ", (byte) 122);

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lrd;")
    public static class114 field635 = field624;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lrd;")
    public static class114 field633 = field634;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[Lia;")
    public static class57[] field626 = new class57[50];

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lrd;")
    public static class114 field638 = class84.method656("Ein kostenloses Spielkonto erstellen)3", (byte) 121);

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lpb;")
    public static class100 field642;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lke;")
    public static class73 field636;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
    public static int[] field630;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(J)V")
    public void method226(long arg0) {
        field640++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method227(byte arg0) {
        field637 = null;
        field630 = null;
        field631 = null;
        field626 = null;
        field636 = null;
        field635 = null;
        field624 = null;
        field641 = null;
        if (arg0 != 4) {
            method227((byte) -32);
        }
        field625 = null;
        field633 = null;
        field632 = null;
        field642 = null;
        field634 = null;
        field638 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V")
    public static final synchronized void method228(int[] arg0, int arg1) {
        int var2 = arg1;
        if (class106.field2447) {
            var2 = arg1 << 1;
        }
        int var3 = 0;
        var2 -= 7;
        while (var3 < var2) {
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
        }
        var2 += 7;
        while (var3 < var2) {
            arg0[var3++] = 0;
        }
        class77.field1760 -= arg1;
        if (class127.field3050 != null && class77.field1760 <= 0) {
            class77.field1760 += class52.field1106 >> 4;
            class69.method549(-15, class127.field3050);
            class135.method1108(class127.field3050, class127.field3050.method17(), 89);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label114: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class83 var10 = null;
                        class83 var11 = class104.field2416[var7];
                        label108: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label108;
                                }
                                class27 var12 = var11.field1855;
                                if (var12 == null || var12.field548 <= var8) {
                                    var11.field1858 = true;
                                    int var13 = var11.method21();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field548 += var13;
                                    }
                                    if (var4 >= class24.field461) {
                                        break label114;
                                    }
                                    class83 var14 = var11.method42();
                                    if (var14 != null) {
                                        int var15 = var11.field1856;
                                        while (var14 != null) {
                                            class135.method1108(var14, var15 * var14.method17() >> 8, 105);
                                            var14 = var11.method32();
                                        }
                                    }
                                    class83 var16 = var11.field1857;
                                    var11.field1857 = null;
                                    if (var10 == null) {
                                        class104.field2416[var7] = var16;
                                    } else {
                                        var10.field1857 = var16;
                                    }
                                    if (var16 == null) {
                                        class132.field3183[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1857;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class83 var18 = class104.field2416[var17];
                class104.field2416[var17] = class132.field3183[var17] = null;
                while (var18 != null) {
                    class83 var19 = var18.field1857;
                    var18.field1857 = null;
                    var18 = var19;
                }
            }
        }
        if (class77.field1760 < 0) {
            class77.field1760 = 0;
        }
        if (class127.field3050 != null) {
            class127.field3050.method37(arg0, 0, arg1);
        }
        class88.method666(arg1, (byte) 102);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
    public void method229() {
        field643++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
    public static final synchronized void method230(int arg0, int arg1) {
        class77.field1760 -= arg0;
        field639++;
        if (arg1 > class77.field1760) {
            class77.field1760 = 0;
        }
        if (class127.field3050 != null) {
            class127.field3050.method27(arg0);
        }
        class88.method666(arg0, (byte) 109);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILmc;)V")
    public static final synchronized void method231(int arg0, class83 arg1) {
        if (arg0 != 0) {
            field635 = null;
        }
        field628++;
        class127.field3050 = arg1;
    }
}
