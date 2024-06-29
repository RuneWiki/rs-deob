import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 {

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Ljd;")
    private static class86 field508 = class122.method868("Loaded fonts", true);

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljd;")
    public static class86 field507 = field508;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lbj;")
    public static class151 field509;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method147(int arg0, int arg1) {
        field505++;
        if (arg0 == arg1 && class46.field1021 > 0) {
            byte[] var2 = class235.field4255[--class46.field1021];
            class235.field4255[class46.field1021] = null;
            return var2;
        } else if (arg1 == 5000 && class73.field1471 > 0) {
            byte[] var3 = class179.field3237[--class73.field1471];
            class179.field3237[class73.field1471] = null;
            return var3;
        } else if (arg1 == 30000 && class260.field4655 > 0) {
            byte[] var4 = class58.field1176[--class260.field4655];
            class58.field1176[class260.field4655] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)V")
    public static final void method148(int arg0, int arg1) {
        if (arg1 != -251) {
            field508 = null;
        }
        class51.field1074 = -1;
        class274.field4814 = arg0;
        field510++;
        class152.field2875 = -1;
        class188.method1293(119);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method149(boolean arg0) {
        field507 = null;
        if (!arg0) {
            method149(false);
        }
        field508 = null;
        field509 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method150(byte arg0) {
        int var1 = 0;
        int var2 = -53 / ((-arg0 - 70) / 43);
        while (var1 < class164.field3083) {
            int var3 = class271.field4762[var1];
            class170 var4 = class233.field4217[var3];
            int var5 = class168.field3102.method1408((byte) -125);
            if ((var5 & 0x40) != 0) {
                var4.field743 = class168.field3102.method1413(-11011);
                if (var4.field743 == 65535) {
                    var4.field743 = -1;
                }
            }
            if ((var5 & 0x1) != 0) {
                int var6 = class168.field3102.method1389((byte) 37);
                int var7 = class168.field3102.method1431((byte) 95);
                var4.method236(class236.field4265, false, var7, var6);
            }
            if ((var5 & 0x20) != 0) {
                var4.field711 = class168.field3102.method1383(96);
                var4.field732 = class168.field3102.method1401(2080652896);
            }
            if ((var5 & 0x4) != 0) {
                var4.field725 = class168.field3102.method1376((byte) 24);
                var4.field714 = 100;
            }
            if ((var5 & 0x10) != 0) {
                int var8 = class168.field3102.method1431((byte) 120);
                int var9 = class168.field3102.method1408((byte) -45);
                var4.method236(class236.field4265, false, var9, var8);
                var4.field681 = class236.field4265 + 300;
                var4.field737 = class168.field3102.method1431((byte) 35);
            }
            if ((var5 & 0x8) != 0) {
                var4.field690 = class168.field3102.method1413(-11011);
                int var10 = class168.field3102.method1386(-4603);
                var4.field691 = 0;
                var4.field722 = var10 >> 16;
                if (var4.field690 == 65535) {
                    var4.field690 = -1;
                }
                var4.field713 = 0;
                var4.field741 = class236.field4265 + (var10 & 0xFFFF);
                if (class236.field4265 < var4.field741) {
                    var4.field691 = -1;
                }
                if (var4.field690 != -1 && class236.field4265 == var4.field741) {
                    int var11 = class219.method1547(var4.field690, -123).field2466;
                    if (var11 != -1) {
                        class122 var12 = class133.method952(var11, 127);
                        if (var12 != null && var12.field2361 != null) {
                            class168.method1212(var4.field676, 0, false, var12, 1928670186, var4.field685);
                        }
                    }
                }
            }
            if ((var5 & 0x80) != 0) {
                if (var4.field3130.method89(-1)) {
                    class54.method401((byte) 117, var4);
                }
                var4.field3130 = class178.method1251(class168.field3102.method1383(112), (byte) -68);
                var4.method246(var4.field3130.field333, -1);
                var4.field739 = var4.field3130.field388;
                var4.field729 = var4.field3130.field345;
                var4.field730 = var4.field3130.field376;
                var4.field718 = var4.field3130.field335;
                var4.field688 = var4.field3130.field328;
                var4.field750 = var4.field3130.field369;
                var4.field692 = var4.field3130.field370;
                var4.field675 = var4.field3130.field351;
                if (var4.field3130.method89(-1)) {
                    class14.method105((class117) null, var4.field705[0], 0, (class224) null, class180.field3244, false, var4, var4.field707[0]);
                }
            }
            if ((var5 & 0x2) != 0) {
                int var13 = class168.field3102.method1401(2080652896);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class168.field3102.method1389((byte) 66);
                class64.method455(var13, var14, 0, var4);
            }
            var1++;
        }
        field506++;
    }
}
