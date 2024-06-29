import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class189 {

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "[S")
    public static short[] field3295 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lub;")
    public static class88 field3288 = new class88();

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lpj;")
    public static class237 field3300 = class33.method353("<br>(X", 108);

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lpj;")
    public static class237 field3298 = class33.method353("scape main", 102);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lpe;")
    public class235 field3291;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[I")
    public int[] field3299;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static final void method1281(boolean arg0) {
        field3296++;
        if (class65.field1296 == null) {
            return;
        }
        if (class138.field2386 < 10) {
            if (!class147.field2615.method1649(class65.field1296.field3857, 0) || !class147.field2615.method1649(class238.method1626(new class237[] { class65.field1296.field3857, class51.field1078 }, -113), 0)) {
                class138.field2386 = class270.field4618.method1632(class65.field1296.field3857, 113) / 10;
                return;
            }
            class164.method1152(0);
            class138.field2386 = 10;
        }
        if (class138.field2386 == 10) {
            class169.field2966 = 8.0F;
            class95.field1697 = 8.0F;
            class202.field3466 = class65.field1296.field3843 >> 6 << 6;
            class148.field2629 = (class65.field1296.field3850 >> 6 << 6) + 64 - class202.field3466;
            class17.field296 = class65.field1296.field3853 >> 6 << 6;
            int var1 = class235.field4087 + (class229.field3911.field3710 >> 7) - class202.field3466;
            class115.field2017 = (class65.field1296.field3849 >> 6 << 6) + 64 - class17.field296;
            int var2 = class17.field296 + class115.field2017 - (class229.field3911.field3700 >> 7) - class27.field494 - 1;
            int var3 = var1 + ((int) (Math.random() * 10.0D) - 5);
            int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
            if (var3 >= 0 && var3 < class148.field2629 && var4 >= 0 && var4 < class115.field2017) {
                class215.field3681 = var3;
                class22.field405 = var4;
            } else {
                class215.field3681 = class65.field1296.field3866 * 64 - class202.field3466;
                class22.field405 = class17.field296 + class115.field2017 - class65.field1296.field3862 * 64 - 1;
            }
            class208.method1393((byte) 25);
            int var5 = class148.field2629 >> 6;
            class110.field1932 = new int[class215.field3718 + 1];
            int var6 = class3.field36 >> 1;
            int var7 = class238.field4170 >> 2 << 10;
            int var8 = class115.field2017 >> 6;
            class144.field2603 = new int[var5][var8][];
            class149.field2647 = new byte[var5][var8][];
            class79.field1479 = new byte[var5][var8][];
            class131.field2311 = new short[var5][var8][];
            class97.field1718 = new byte[var5][var8][];
            class261.field4470 = new int[var5][var8][];
            class21.field391 = new byte[var5][var8][];
            class205.field3502 = new byte[var5][var8][];
            class73.method578((byte) 40, var7, var6);
            class138.field2386 = 20;
        } else if (class138.field2386 == 20) {
            class87.method663(!arg0, new class32(class147.field2615.method1661(-27527, class65.field1296.field3857, class125.field2197)));
            class138.field2386 = 30;
            class128.method912(true, (byte) -121);
            class135.method936(arg0);
        } else if (class138.field2386 == 30) {
            class62.method525(new class32(class147.field2615.method1661(-27527, class65.field1296.field3857, class77.field1451)), 63);
            class138.field2386 = 40;
            class135.method936(true);
        } else if (class138.field2386 == 40) {
            class174.method1204((byte) 37, new class32(class147.field2615.method1661(-27527, class65.field1296.field3857, class191.field3326)));
            class138.field2386 = 50;
            class135.method936(true);
        } else if (class138.field2386 == 50) {
            class10.method113(new class32(class147.field2615.method1661(-27527, class65.field1296.field3857, client.field2717)), (byte) -75);
            class138.field2386 = 60;
            class128.method912(true, (byte) -121);
            class135.method936(true);
        } else if (class138.field2386 == 60) {
            class77.field1449 = class25.method230(class147.field2615, 44, class238.method1626(new class237[] { class65.field1296.field3857, class51.field1078 }, -92));
            class138.field2386 = 70;
            class135.method936(true);
        } else if (class138.field2386 == 70) {
            class17.field302 = new class86(11, true, class20.field379);
            class138.field2386 = 73;
            class128.method912(true, (byte) -122);
            class135.method936(true);
        } else if (class138.field2386 == 73) {
            class100.field1777 = new class86(12, true, class20.field379);
            class138.field2386 = 76;
            class128.method912(true, (byte) 54);
            class135.method936(true);
        } else if (class138.field2386 == 76) {
            class196.field3415 = new class86(14, true, class20.field379);
            class138.field2386 = 79;
            class128.method912(true, (byte) -114);
            class135.method936(arg0);
        } else if (class138.field2386 == 79) {
            class247.field4305 = new class86(17, true, class20.field379);
            class138.field2386 = 82;
            class128.method912(true, (byte) 62);
            class135.method936(true);
        } else if (class138.field2386 == 82) {
            class11.field199 = new class86(19, true, class20.field379);
            class138.field2386 = 85;
            class128.method912(true, (byte) -110);
            class135.method936(true);
        } else if (class138.field2386 == 85) {
            class163.field2907 = new class86(22, true, class20.field379);
            class138.field2386 = 88;
            class128.method912(true, (byte) -121);
            class135.method936(true);
        } else if (class138.field2386 == 88) {
            class151.field2684 = new class86(26, true, class20.field379);
            class138.field2386 = 91;
            class128.method912(true, (byte) 20);
            class135.method936(true);
        } else {
            class128.field2251 = new class86(30, true, class20.field379);
            class138.field2386 = 100;
            class128.method912(true, (byte) 108);
            class135.method936(arg0);
            class51.field1085 = -1;
            class180.field3167 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V")
    public static void method1282(boolean arg0) {
        field3288 = null;
        if (arg0) {
            method1285((byte) 111);
        }
        field3300 = null;
        field3295 = null;
        field3298 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lpj;")
    public static final class237 method1283(int arg0, int arg1) {
        field3297++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        } else if (arg0 == -74) {
            class237 var2 = new class237();
            var2.field4114 = 1;
            var2.field4151 = new byte[1];
            var2.field4151[0] = (byte) arg1;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method1284(Object arg0, boolean arg1, int arg2) {
        field3292++;
        if (arg2 != -29207) {
            field3298 = null;
        }
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class10.method112(var3, -1) : var3;
        } else if (arg0 instanceof class73) {
            class73 var4 = (class73) arg0;
            return var4.method577(127);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static final void method1285(byte arg0) {
        if (class12.field210 < 128) {
            class12.field210 = 128;
        }
        if (class12.field210 > 383) {
            class12.field210 = 383;
        }
        field3294++;
        class257.field4417 &= 0x7FF;
        if (arg0 > -113) {
            method1284((Object) null, false, 70);
        }
        int var1 = class164.field2921 >> 7;
        int var2 = class31.field616 >> 7;
        int var3 = class23.method216(-29, class31.field616, class164.field2921, class274.field4798);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class274.field4798;
                    if (var7 < 3 && (class73.field1410[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class99.field1773[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class162.field2890 < var9) {
            class162.field2890 += (var9 - class162.field2890) / 24;
        } else if (class162.field2890 > var9) {
            class162.field2890 += (var9 - class162.field2890) / 80;
        }
    }
}
