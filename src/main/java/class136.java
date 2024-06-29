import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class136 extends class107 {

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "[I")
    public int[] field2256 = new int[1];

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "[I")
    public int[] field2258 = new int[] { -1 };

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Lwc;")
    public static class213 field2257 = null;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "[I")
    public static int[] field2260 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field2261 = 0;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public static final void method986(byte arg0) {
        field2254++;
        if (class24.field364 == 0 || class24.field364 == 5) {
            return;
        }
        try {
            if ((++class125.field2122) > 2000) {
                if (class204.field3415 != null) {
                    class204.field3415.method838(-125);
                    class204.field3415 = null;
                }
                if (class26.field385 >= 1) {
                    class24.field364 = 0;
                    class63.field1033 = -5;
                    return;
                }
                class26.field385++;
                if (class138.field2320 == class133.field2221) {
                    class133.field2221 = class76.field1232;
                } else {
                    class133.field2221 = class138.field2320;
                }
                class125.field2122 = 0;
                class24.field364 = 1;
            }
            if (class24.field364 == 1) {
                class70.field1130 = class25.field376.method1580((byte) 8, class238.field4142, class133.field2221);
                class24.field364 = 2;
            }
            if (class24.field364 == 2) {
                if (class70.field1130.field2504 == 2) {
                    throw new IOException();
                }
                if (class70.field1130.field2504 != 1) {
                    return;
                }
                class204.field3415 = new class114((Socket) class70.field1130.field2505, class25.field376);
                class70.field1130 = null;
                long var1 = class30.field443 = class43.field697.method316(86);
                class95.field1575.field2026 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class95.field1575.method919(-4742, 14);
                class95.field1575.method919(-4742, var3);
                class204.field3415.method840(0, -782, class95.field1575.field2014, 2);
                if (class198.field3300 != null) {
                    class198.field3300.method1215(255);
                }
                if (class37.field571 != null) {
                    class37.field571.method1215(255);
                }
                int var4 = class204.field3415.method839((byte) 101);
                if (class198.field3300 != null) {
                    class198.field3300.method1215(255);
                }
                if (class37.field571 != null) {
                    class37.field571.method1215(255);
                }
                if (var4 != 0) {
                    class63.field1033 = var4;
                    class24.field364 = 0;
                    class204.field3415.method838(-126);
                    class204.field3415 = null;
                    return;
                }
                class24.field364 = 3;
            }
            if (class24.field364 == 3) {
                if (class204.field3415.method837(false) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class204.field3415.method841(0, class97.field1622.field2014, 8, (byte) -101);
                class97.field1622.field2026 = 0;
                class50.field799 = class97.field1622.method868(-121);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class50.field799;
                var5[2] = (int) (class50.field799 >> 32);
                class95.field1575.field2026 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class95.field1575.method919(-4742, 10);
                class95.field1575.method870(var5[0], (byte) 12);
                class95.field1575.method870(var5[1], (byte) 12);
                class95.field1575.method870(var5[2], (byte) 12);
                class95.field1575.method870(var5[3], (byte) 12);
                class95.field1575.method885(class43.field697.method316(70), (byte) -102);
                class95.field1575.method896((byte) 0, class43.field695);
                class95.field1575.method879(class107.field1772, class39.field602, -68);
                class90.field1489.field2026 = 0;
                if (class195.field3249 == 40) {
                    class90.field1489.method919(-4742, 18);
                } else {
                    class90.field1489.method919(-4742, 16);
                }
                class90.field1489.method895(-75, class95.field1575.field2026 + class216.method1483(63, class35.field528) + 151);
                class90.field1489.method870(509, (byte) 12);
                class90.field1489.method919(-4742, class258.field4508);
                class90.field1489.method919(-4742, 0);
                class90.field1489.method919(-4742, class76.method543(-77));
                class90.field1489.method895(-101, class95.field1578);
                class90.field1489.method895(-22, class76.field1230);
                class157.method1119(108, class90.field1489);
                class90.field1489.method896((byte) 0, class35.field528);
                class90.field1489.method870(class5.field40, (byte) 12);
                class90.field1489.method870(class195.method1383(31305), (byte) 12);
                class210.field3498 = true;
                class90.field1489.method870(class39.field614.field1890, (byte) 12);
                class90.field1489.method870(class52.field882.field1890, (byte) 12);
                class90.field1489.method870(class60.field977.field1890, (byte) 12);
                class90.field1489.method870(class111.field1885.field1890, (byte) 12);
                class90.field1489.method870(class176.field2883.field1890, (byte) 12);
                class90.field1489.method870(class143.field2392.field1890, (byte) 12);
                class90.field1489.method870(class149.field2493.field1890, (byte) 12);
                class90.field1489.method870(class51.field807.field1890, (byte) 12);
                class90.field1489.method870(class162.field2651.field1890, (byte) 12);
                class90.field1489.method870(class223.field3933.field1890, (byte) 12);
                class90.field1489.method870(class177.field2901.field1890, (byte) 12);
                class90.field1489.method870(class33.field496.field1890, (byte) 12);
                class90.field1489.method870(class129.field2162.field1890, (byte) 12);
                class90.field1489.method870(class72.field1146.field1890, (byte) 12);
                class90.field1489.method870(class49.field783.field1890, (byte) 12);
                class90.field1489.method870(class160.field2630.field1890, (byte) 12);
                class90.field1489.method870(class44.field710.field1890, (byte) 12);
                class90.field1489.method870(class47.field747.field1890, (byte) 12);
                class90.field1489.method870(class263.field4607.field1890, (byte) 12);
                class90.field1489.method870(class212.field3518.field1890, (byte) 12);
                class90.field1489.method870(class156.field2570.field1890, (byte) 12);
                class90.field1489.method870(class85.field1421.field1890, (byte) 12);
                class90.field1489.method870(class189.field3157.field1890, (byte) 12);
                class90.field1489.method870(class95.field1565.field1890, (byte) 12);
                class90.field1489.method870(class96.field1592.field1890, (byte) 12);
                class90.field1489.method870(class14.field216.field1890, (byte) 12);
                class90.field1489.method870(class216.field3744.field1890, (byte) 12);
                class90.field1489.method920(0, class95.field1575.field2014, class95.field1575.field2026, 7521);
                class204.field3415.method840(0, -782, class90.field1489.field2014, class90.field1489.field2026);
                class95.field1575.method425(4, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class97.field1622.method425(4, var5);
                class24.field364 = 4;
            }
            if (class24.field364 == 4) {
                if (class204.field3415.method837(false) < 1) {
                    return;
                }
                int var7 = class204.field3415.method839((byte) 101);
                if (var7 == 21) {
                    class24.field364 = 7;
                } else if (var7 == 1) {
                    class24.field364 = 5;
                    class63.field1033 = var7;
                    return;
                } else if (var7 == 2) {
                    class24.field364 = 8;
                } else if (var7 == 15) {
                    class63.field1033 = var7;
                    class24.field364 = 0;
                    return;
                } else if (var7 == 23 && class26.field385 < 1) {
                    class26.field385++;
                    class24.field364 = 1;
                    class125.field2122 = 0;
                    class204.field3415.method838(-124);
                    class204.field3415 = null;
                    return;
                } else {
                    class63.field1033 = var7;
                    class24.field364 = 0;
                    class204.field3415.method838(-121);
                    class204.field3415 = null;
                    return;
                }
            }
            if (arg0 > -52) {
                method989(-63);
            }
            if (class24.field364 == 6) {
                class95.field1575.field2026 = 0;
                class95.field1575.method424((byte) 71, 17);
                class204.field3415.method840(0, -782, class95.field1575.field2014, class95.field1575.field2026);
                class24.field364 = 4;
            } else if (class24.field364 != 7) {
                if (class24.field364 == 8) {
                    if (class204.field3415.method837(false) < 11) {
                        return;
                    }
                    class204.field3415.method841(0, class97.field1622.field2014, 11, (byte) -87);
                    class97.field1622.field2026 = 0;
                    class179.field2954 = class97.field1622.method897(122);
                    class192.field3212 = class97.field1622.method897(-81);
                    class241.field4180 = class97.field1622.method897(110);
                    if (class241.field4180 == 1) {
                        try {
                            class40.field636.method295(-12249, class25.field376.field3999);
                        } catch (Throwable var8) {
                        }
                    } else {
                        try {
                            class69.field1118.method295(-12249, class25.field376.field3999);
                        } catch (Throwable var9) {
                        }
                    }
                    class115.field1953 = class97.field1622.method897(108);
                    class213.field3704 = class97.field1622.method897(-94) == 1;
                    class167.field2719 = class97.field1622.method876(false);
                    class122.field2081 = class97.field1622.method897(-111);
                    class35.field516 = class97.field1622.method426(-102);
                    class70.field1128 = class97.field1622.method876(false);
                    class24.field364 = 9;
                }
                if (class24.field364 == 9 && class204.field3415.method837(false) >= class70.field1128) {
                    class97.field1622.field2026 = 0;
                    class204.field3415.method841(0, class97.field1622.field2014, class70.field1128, (byte) -42);
                    class24.field364 = 0;
                    class63.field1033 = 2;
                    class31.method158((byte) 115);
                    class147.field2470 = -1;
                    class35.method174(113, false);
                    class35.field516 = -1;
                }
            } else if (class204.field3415.method837(false) >= 1) {
                class241.field4188 = (class204.field3415.method839((byte) 101) + 3) * 60;
                class63.field1033 = 21;
                class24.field364 = 0;
                class204.field3415.method838(-121);
                class204.field3415 = null;
            }
        } catch (IOException var10) {
            if (class204.field3415 != null) {
                class204.field3415.method838(-124);
                class204.field3415 = null;
            }
            if (class26.field385 >= 1) {
                class24.field364 = 0;
                class63.field1033 = -4;
            } else {
                class24.field364 = 1;
                if (class138.field2320 == class133.field2221) {
                    class133.field2221 = class76.field1232;
                } else {
                    class133.field2221 = class138.field2320;
                }
                class26.field385++;
                class125.field2122 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ldf;I)Lti;")
    public static final class5 method987(class51 arg0, int arg1) {
        field2259++;
        int var2 = 16 % ((-arg1 - 68) / 45);
        for (class5 var3 = (class5) class141.field2367.method1720(true); var3 != null; var3 = (class5) class141.field2367.method1712((byte) 112)) {
            if (var3.field44.method315(false, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V")
    public static final void method988(byte arg0) {
        field2255++;
        class97.field1622.method427(false);
        int var1 = class97.field1622.method428(8, (byte) -119);
        if (arg0 != -60) {
            return;
        }
        if (class218.field3788 > var1) {
            for (int var2 = var1; var2 < class218.field3788; var2++) {
                class16.field238[class44.field712++] = class193.field3242[var2];
            }
        }
        if (class218.field3788 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class218.field3788 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class193.field3242[var3];
            class83 var5 = class34.field512[var4];
            int var6 = class97.field1622.method428(1, (byte) -126);
            if (var6 == 0) {
                class193.field3242[class218.field3788++] = var4;
                var5.field4309 = class179.field2960;
            } else {
                int var7 = class97.field1622.method428(2, (byte) -117);
                if (var7 == 0) {
                    class193.field3242[class218.field3788++] = var4;
                    var5.field4309 = class179.field2960;
                    class215.field3732[class185.field3060++] = var4;
                } else if (var7 == 1) {
                    class193.field3242[class218.field3788++] = var4;
                    var5.field4309 = class179.field2960;
                    int var8 = class97.field1622.method428(3, (byte) -115);
                    var5.method1687(false, var8, (byte) 28);
                    int var9 = class97.field1622.method428(1, (byte) -120);
                    if (var9 == 1) {
                        class215.field3732[class185.field3060++] = var4;
                    }
                } else if (var7 == 2) {
                    class193.field3242[class218.field3788++] = var4;
                    var5.field4309 = class179.field2960;
                    int var10 = class97.field1622.method428(3, (byte) -125);
                    var5.method1687(true, var10, (byte) 28);
                    int var11 = class97.field1622.method428(3, (byte) -125);
                    var5.method1687(true, var11, (byte) 28);
                    int var12 = class97.field1622.method428(1, (byte) -112);
                    if (var12 == 1) {
                        class215.field3732[class185.field3060++] = var4;
                    }
                } else if (var7 == 3) {
                    class16.field238[class44.field712++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public static void method989(int arg0) {
        field2260 = null;
        field2257 = null;
        if (arg0 != 4) {
            method988((byte) -20);
        }
    }
}
