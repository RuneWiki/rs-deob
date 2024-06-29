import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class115 {

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "Lao;")
    public static class191 field1505;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "Lho;")
    public static class103 field1506;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1510;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "F")
    public static float field1507;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "[[S")
    public static short[][] field1509;

    static {
        new class305("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field1505 = new class191(13, 6);
        field1506 = new class103(33, 8);
        field1510 = new String[100];
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILza;)V", line = 9)
    public static final void method691(int arg0, class287 arg1) {
        field1501++;
        int var2 = class451.field6723;
        int var3 = class155.field2026;
        int var4 = class366.field4993;
        int var5 = class425.field6180 - 3;
        byte var6 = 20;
        if (class65.field753 == null || class380.field5512 == null) {
            if (class282.field3733.method2133(0, class443.field6455) && class282.field3733.method2133(0, class347.field4631)) {
                class65.field753 = arg1.method1236(class491.method2969(class282.field3733, class443.field6455, 0), true);
                class491 var7 = class491.method2969(class282.field3733, class347.field4631, 0);
                class380.field5512 = arg1.method1236(var7, true);
                var7.method2967();
                class95.field1144 = arg1.method1236(var7, true);
            } else {
                arg1.method1153(var2, var3, var4, var6, 255 - class364.field4972 << 24 | class394.field5691, 1);
            }
        }
        if (class65.field753 != null && class380.field5512 != null) {
            int var8 = (var4 - (class380.field5512.method150() * 2)) / class65.field753.method150();
            for (int var9 = 0; var9 < var8; var9++) {
                class65.field753.method144(class380.field5512.method150() + var2 + var9 * class65.field753.method150(), var3);
            }
            class380.field5512.method144(var2, var3);
            class95.field1144.method144(var2 + var4 - class95.field1144.method150(), var3);
        }
        class79.field976.method1878(-1, var3 + 14, class246.field3233.method1823(class374.field5072, (byte) -88), class502.field7327 | 0xFF000000, var2 + 3, (byte) -5);
        arg1.method1153(var2, var3 + var6, var4, var5 - var6, class394.field5691 | -class364.field4972 + 255 << 24, 1);
        int var10 = class148.field1951.method349((byte) -89);
        int var11 = class148.field1951.method347(-113);
        int var12 = 0;
        for (class36 var13 = (class36) class69.field806.method970(12); var13 != null; var13 = (class36) class69.field806.method976((byte) 17)) {
            int var30 = var3 + var6 - (-13 - (-var12 + class391.field5656 + -1) * 16);
            if (var2 < var10 && (var2 + var4) > var10 && (var30 - 13) < var11 && var11 < (var30 + 4) && var13.field365) {
                arg1.method1153(var2, var30 - 12, var4, 16, class53.field620 | 255 - class50.field579 << 24, 1);
            }
            var12++;
        }
        if (arg0 != 31111) {
            method695(-34, -108);
        }
        if ((class174.field2239 == null || class522.field7672 == null || class117.field1535 == null) && class282.field3733.method2133(0, class374.field5073) && class282.field3733.method2133(0, class463.field6902) && class282.field3733.method2133(0, class510.field7422)) {
            class491 var14 = class491.method2969(class282.field3733, class463.field6902, 0);
            class522.field7672 = arg1.method1236(var14, true);
            var14.method2967();
            class34.field343 = arg1.method1236(var14, true);
            class174.field2239 = arg1.method1236(class491.method2969(class282.field3733, class374.field5073, 0), true);
            class491 var15 = class491.method2969(class282.field3733, class510.field7422, 0);
            class117.field1535 = arg1.method1236(var15, true);
            var15.method2967();
            class507.field7347 = arg1.method1236(var15, true);
        }
        if (class174.field2239 != null && class522.field7672 != null && class117.field1535 != null) {
            int var16 = (var4 - (class117.field1535.method150() * 2)) / class174.field2239.method150();
            for (int var17 = 0; var17 < var16; var17++) {
                class174.field2239.method144(var2 + class117.field1535.method150() + class174.field2239.method150() * var17, var3 + var5 + -class174.field2239.method146());
            }
            int var18 = (var5 - (var6 + class117.field1535.method146())) / class522.field7672.method146();
            for (int var19 = 0; var19 < var18; var19++) {
                class522.field7672.method144(var2, var3 + var6 + (class522.field7672.method146() * var19));
                class34.field343.method144(var2 + var4 - class34.field343.method150(), var3 + var6 + var19 * class522.field7672.method146());
            }
            class117.field1535.method144(var2, var3 + var5 - class117.field1535.method146());
            class507.field7347.method144(var2 + var4 - class117.field1535.method150(), var3 + (var5 - class117.field1535.method146()));
        }
        int var20 = 0;
        for (class36 var21 = (class36) class69.field806.method970(12); var21 != null; var21 = (class36) class69.field806.method976((byte) -122)) {
            int var22 = (class391.field5656 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class502.field7327 | 0xFF000000;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > (var22 - 13) && var11 < var22 + 4 && var21.field365) {
                var23 = class531.field7822 | 0xFF000000;
            }
            int[] var24 = null;
            if (class75.method436(var21.field361, -97)) {
                var24 = class237.field3158.method236(-18315, (int) var21.field367).field2636;
            } else if (var21.field364 != -1) {
                var24 = class237.field3158.method236(-18315, var21.field364).field2636;
            } else if (class497.method2990(var21.field361, -63)) {
                class22 var25 = class339.field4484[(int) var21.field367];
                if (var25 != null) {
                    class212 var26 = var25.field220;
                    if (var26.field2903 != null) {
                        var26 = var26.method1350(class52.field606, -1);
                    }
                    if (var26 != null) {
                        var24 = var26.field2912;
                    }
                }
            } else if (class195.method1115(-14, var21.field361)) {
                Object var27 = null;
                class70 var28;
                if (var21.field361 == 1002) {
                    var28 = class123.field1593.method2920((int) var21.field367, arg0 - 11892);
                } else {
                    var28 = class123.field1593.method2920((int) (var21.field367 >>> 32 & 0x7FFFFFFFL), 19219);
                }
                if (var28.field848 != null) {
                    var28 = var28.method403(-1, class52.field606);
                }
                if (var28 != null) {
                    var24 = var28.field879;
                }
            }
            String var29 = class496.method2988((byte) 124, var21);
            if (var24 != null) {
                var29 = var29 + class91.method507((byte) 27, var24);
            }
            class79.field976.method1882(class512.field7462, var2 + 3, 0, var22, var29, class125.field1615, (byte) 118, var23);
            var20++;
            if (var21.field363) {
                class483.field7124.method144(class121.field1570.method1066(arg0 ^ 0x79C7, var29) + var2 + 5, var22 + -12);
            }
        }
        class339.method1974(class366.field4993, class155.field2026, class451.field6723, class425.field6180, (byte) 32);
    }

    @OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;", line = 206)
    public final String toString() {
        field1503++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILfo;)I", line = 215)
    public static final int method692(int arg0, class361 arg1) {
        field1504++;
        int var2 = 0;
        if (arg1.method2133(arg0 - 15938, class114.field1495)) {
            var2++;
        }
        if (arg1.method2133(arg0 - 15938, class330.field4385)) {
            var2++;
        }
        if (arg1.method2133(arg0 - 15938, class35.field352)) {
            var2++;
        }
        if (arg1.method2133(arg0 ^ arg0, class470.field6978)) {
            var2++;
        }
        if (arg1.method2133(arg0 ^ 0x3E42, class279.field3699)) {
            var2++;
        }
        if (arg1.method2133(0, class5.field55)) {
            var2++;
        }
        if (arg1.method2133(0, class454.field6791)) {
            var2++;
        }
        if (arg1.method2133(0, class138.field1849)) {
            var2++;
        }
        if (arg1.method2133(0, class273.field3645)) {
            var2++;
        }
        if (arg1.method2133(arg0 ^ 0x3E42, class285.field3754)) {
            var2++;
        }
        if (arg1.method2133(0, class125.field1620)) {
            var2++;
        }
        if (arg1.method2133(0, class90.field1083)) {
            var2++;
        }
        if (arg1.method2133(0, class7.field93)) {
            var2++;
        }
        if (arg1.method2133(0, class367.field5011)) {
            var2++;
        }
        if (arg1.method2133(0, class291.field3849)) {
            var2++;
        }
        if (arg1.method2133(0, class48.field532)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)V", line = 282)
    public static final void method693(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field1502++;
        class178.field2308 = -1;
        if (arg0 == 37) {
            class416.field5996 = 3.0F;
        } else if (arg0 == 50) {
            class416.field5996 = 4.0F;
        } else if (arg0 == 75) {
            class416.field5996 = 6.0F;
        } else if (arg0 == 100) {
            class416.field5996 = 8.0F;
        } else if (arg0 == 200) {
            class416.field5996 = 16.0F;
        }
        class178.field2308 = -1;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 316)
    public static void method694(int arg0) {
        field1506 = null;
        if (arg0 != 0) {
            field1507 = -2.2502806F;
        }
        field1509 = null;
        field1505 = null;
        field1510 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)Lew;", line = 330)
    public static final class342 method695(int arg0, int arg1) {
        field1499++;
        class342 var2 = (class342) class476.field7043.method3032(arg1 - 20420, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class35.field351.method2130(0, arg0, -115);
        class342 var4 = new class342();
        if (var3 != null) {
            var4.method1994(-125, new class396(var3));
        }
        var4.method1990(arg1 ^ 0xFFFFCFDC);
        if (arg1 != 24009) {
            method692(-59, null);
        }
        class476.field7043.method3046((long) arg0, var4, 1);
        return var4;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZIZLdn;)V", line = 358)
    public static final void method696(boolean arg0, int arg1, boolean arg2, class360 arg3) {
        field1500++;
        if (arg1 <= 47) {
            field1506 = null;
        }
        int var4 = arg3.field4886;
        int var5 = (int) arg3.field6348;
        arg3.method2674(true);
        if (arg2) {
            class319.method1896(var4, 67);
        }
        class445.method2752(true, var4);
        class450 var6 = class406.method2490((byte) -116, var5);
        if (var6 != null) {
            class413.method2521(var6, false);
        }
        class495.method2985((byte) -127);
        if (!arg0 && class168.field2174 != -1) {
            class63.method379(1, class168.field2174, true);
        }
        class74 var7 = new class74(class152.field1989);
        for (class360 var8 = (class360) var7.method434(-118); var8 != null; var8 = (class360) var7.method432(-259)) {
            if (!var8.method2673(-97)) {
                var8 = (class360) var7.method434(-87);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4888 == 3) {
                int var9 = (int) var8.field6348;
                if (var9 >>> 16 == var4) {
                    method696(arg0, 125, true, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V", line = 422)
    public class115(int arg0, int arg1) {
    }
}
