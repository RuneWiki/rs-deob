import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class50 extends class25 {

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "J")
    public static long field799 = 0L;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "B")
    public static byte field804 = 0;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Lu;")
    public static class111 field795;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "Lfd;")
    public static class114 field796;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Ldf;")
    public class51 field793;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "Llc;")
    public static class80 field800;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "[I")
    public int[] field798;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "[I")
    public int[] field803;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "[Lhc;")
    public class212[] field801;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "[Lg;")
    public static class254[] field797;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "[Ldf;")
    public class51[] field789;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
    public static void method264(byte arg0) {
        field797 = null;
        field800 = null;
        field795 = null;
        field796 = null;
        if (arg0 != 90) {
            method267((class121) null, 53);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILfi;)V")
    public static final void method265(int arg0, class103 arg1) {
        field788++;
        int var2 = 113 % ((7 - arg0) / 39);
        class93 var3 = (class93) class36.field556.method1453(arg1.field1711.method316(97), 1);
        if (var3 == null) {
            class230.method1589((class83) null, 0, arg1.field4343[0], arg1, (byte) -119, class257.field4496, (class108) null, arg1.field4336[0]);
        } else {
            var3.method701((byte) 89);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
    public static final void method266(int arg0, int arg1, int arg2) {
        class82.field1389 = true;
        class19.field271 = arg0;
        class22.field316 = arg1;
        class8.field85 = arg2;
        class247.field4320 = -1;
        class116.field1962 = -1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Llb;I)V")
    public static final void method267(class121 arg0, int arg1) {
        field792++;
        if (arg1 != -30708) {
            field796 = null;
        }
        while (true) {
            while (arg0.field2026 < arg0.field2014.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method897(-37) == 1) {
                    var2 = arg0.method897(122);
                    var4 = arg0.method897(-102);
                    var3 = true;
                }
                int var5 = arg0.method897(-46);
                int var6 = arg0.method897(-115);
                int var7 = var5 * 64 - class107.field1764;
                int var8 = class46.field736 + class85.field1433 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class5.field38 > (var7 + 63) && class85.field1433 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && var11 < (var2 * 8 + 8) && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method897(-55);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method897(107);
                                        if (class214.field3709[var9][var10] == null) {
                                            class214.field3709[var9][var10] = new byte[4096];
                                        }
                                        class214.field3709[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method876(false);
                                        if (class262.field4574[var9][var10] == null) {
                                            class262.field4574[var9][var10] = new short[4096];
                                        }
                                        class262.field4574[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg0.method897(-121) & 0xFF) << 16) + ((arg0.method897(-102) & 0xFF) << 8) + (arg0.method897(arg1 + 30820) & 0xFF);
                                        if (class79.field1266[var9][var10] == null) {
                                            class79.field1266[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class108 var17 = class41.method210(var16, (byte) 75);
                                        if (var17.field1796 != null) {
                                            var17 = var17.method784((byte) -108);
                                            if (var17 == null || var17.field1826 == -1) {
                                                continue;
                                            }
                                        }
                                        class79.field1266[var9][var10][(63 - var12 << 6) + var11] = var17.field1799 + 1;
                                        class76 var18 = new class76();
                                        var18.field1225 = var8;
                                        var18.field1231 = var17.field1826;
                                        var18.field1228 = var7;
                                        class114.field1920.method1709(-95, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg0.method897(120);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field2026++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field2026 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field2026 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
