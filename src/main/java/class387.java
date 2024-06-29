import java.awt.Color;
import java.awt.Frame;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class387 {

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field5660;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public int field5651;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public int field5655;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field5650;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "B")
    public byte field5661;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5658 = new CRC32();

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Z")
    public static boolean field5659 = false;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "[Lei;")
    public static class119[] field5666 = new class119[14];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Lwq;")
    public class116 field5665;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Lum;")
    public class367 field5654;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lfh;")
    public class465 field5648;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "Lbs;")
    public class487 field5663;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Ljava/awt/Frame;")
    public static Frame field5662;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lgh;III)V", line = 3)
    public static final void method2368(class388 arg0, int arg1, int arg2, int arg3) {
        if (class233.field3597) {
            class247 var9 = class352.field5194 == -1 ? null : class453.field6727.method460(class352.field5194, -18297);
            if (client.method1371(arg0).method883(65) && (class364.field5326 & 0x20) != 0 && (var9 == null || arg0.method2392(var9.field3809, (byte) 48, class352.field5194) != var9.field3809)) {
                class173.field2791++;
                class274.method1739(class101.field1932, 125, 3, 0L, arg0.field5777, false, class220.field3455, class373.field5465 + " -> " + arg0.field5729, true, arg0.field5688, arg0.field5700);
            }
        } else {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class248.method1609(arg0, 4, var4);
                if (var8 != null) {
                    class424.field6378++;
                    class274.method1739(var8, 98, 1001, (long) (var4 + 1), arg0.field5777, false, class28.method198(arg0, var4, 1), arg0.field5729, true, arg0.field5688, arg0.field5700);
                }
            }
            String var5 = class67.method587(arg0, 120);
            if (var5 != null) {
                class274.method1739(var5, 55, 30, 0L, arg0.field5777, false, arg0.field5816, arg0.field5729, true, arg0.field5688, arg0.field5700);
                class63.field1284++;
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class248.method1609(arg0, 4, var6);
                if (var7 != null) {
                    class274.method1739(var7, 75, 45, (long) (var6 + 1), arg0.field5777, false, class28.method198(arg0, var6, 1), arg0.field5729, true, arg0.field5688, arg0.field5700);
                    class424.field6378++;
                }
            }
            if (client.method1371(arg0).method885(0)) {
                class355.field5229++;
                if (arg0.field5749 == null) {
                    class274.method1739(class42.field578.method1977(class146.field2452, -106), 33, 19, 0L, arg0.field5777, false, -1, "", true, arg0.field5688, arg0.field5700);
                } else {
                    class274.method1739(arg0.field5749, 21, 19, 0L, arg0.field5777, false, -1, "", true, arg0.field5688, arg0.field5700);
                }
            }
        }
        field5649++;
        int var10 = 108 / ((arg1 + 5) / 44);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 80)
    public static final void method2369(int arg0) {
        class376.field5500++;
        field5653++;
        if (arg0 != 0) {
            method2371(-107);
        }
        class459.method2765(class475.field7042, (byte) 87);
        class335.field5062.method1814(class13.method86(3), true);
        class335.field5062.method1865(class71.field1415, 812856296);
        class335.field5062.method1865(class65.field1330, 812856296);
        class335.field5062.method1814(class186.field2990.field2542, true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 100)
    public static final void method2370(byte arg0) {
        if (arg0 > -49) {
            method2372(35, -39, 124, -34, -56, 85, true, -72, 5, -98);
        }
        class179.field2912.method1460(104);
        field5656++;
        class393.field5991.method136((byte) -102);
        if (class229.field3562 != null) {
            class229.field3562.method811(class262.field4007, (byte) -127);
        }
        class418.field6296.method1788(31);
        class262.field4007.setBackground(Color.black);
        class380.field5554 = -1;
        class179.field2912 = class63.method559(class262.field4007, -1);
        class393.field5991 = class479.method2857(class262.field4007, true, false);
        if (class229.field3562 != null) {
            class229.field3562.method810(class262.field4007, -63);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)Z", line = 126)
    public static final boolean method2371(int arg0) {
        field5652++;
        try {
            if (class491.field7200 == 2) {
                if (class420.field6339 == null) {
                    class420.field6339 = class351.method2180(class138.field2322, class224.field3507, class194.field3135);
                    if (class420.field6339 == null) {
                        return false;
                    }
                }
                if (class272.field4124 == null) {
                    class272.field4124 = new class527(class383.field5597, class80.field1588);
                }
                if (class470.field6983.method637(class119.field2095, class420.field6339, 22050, -1, class272.field4124)) {
                    class470.field6983.method657((byte) -95);
                    class470.field6983.method650(15, class503.field7350);
                    class470.field6983.method634(-35, class309.field4690, class420.field6339);
                    class272.field4124 = null;
                    class491.field7200 = 0;
                    class420.field6339 = null;
                    class138.field2322 = null;
                    return true;
                }
            }
            if (arg0 >= -20) {
                method2368(null, -112, -73, -116);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class470.field6983.method654(false);
            class420.field6339 = null;
            class272.field4124 = null;
            class491.field7200 = 0;
            class138.field2322 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIZIII)V", line = 174)
    public static final void method2372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field5647++;
        if (arg8 < 128 || arg0 < 128 || arg8 > (class339.field5099 - 2) * 128 || arg0 > (class484.field7129 * 128 - 256)) {
            class60.field1240[0] = class60.field1240[1] = -1;
            return;
        }
        int var10 = class483.method2899(arg4, arg8, arg0, false) - arg2;
        if (!arg6) {
            field5664 = 13;
        }
        class123.field2143.method834(arg1, 0, 0);
        class262.field4006.method326(class123.field2143);
        class262.field4006.method349(arg8, var10, arg0, class60.field1240);
        class123.field2143.method834(-arg1, 0, 0);
        class262.field4006.method326(class123.field2143);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)Lmv;", line = 203)
    public static final class255 method2373(int arg0) {
        field5646++;
        if (arg0 > -30) {
            method2370((byte) 13);
        }
        return class21.field328 < class35.field533.length ? class35.field533[class21.field328++] : null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIILse;)V", line = 219)
    public static final void method2374(int arg0, int arg1, int arg2, int arg3, class170 arg4) {
        class234 var5 = class455.method2715(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field2764 = (arg1 << class353.field5216) + class421.field6346;
        arg4.field2768 = arg3;
        arg4.field2765 = (arg2 << class353.field5216) + class421.field6346;
        for (class440 var7 = var5.field3607; var7 != null; var7 = var7.field6528) {
            if (var7.field6530.field6072) {
                int var8 = var7.field6530.method8(0);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field2768 += var6;
            arg4.field2767 = true;
        } else if (var5.field3619 != null) {
            arg4.field2768 -= var5.field3619.field4700;
        }
        var5.field3618 = arg4;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V", line = 271)
    public static void method2375(byte arg0) {
        field5658 = null;
        field5662 = null;
        if (arg0 != 37) {
            method2372(-78, -37, 92, -91, -100, -80, true, 29, 14, -83);
        }
        field5666 = null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(BIIIII)V", line = 288)
    public class387(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5660 = arg1;
        this.field5657 = arg2;
        this.field5651 = arg4;
        this.field5655 = arg3;
        this.field5650 = arg5;
        this.field5661 = arg0;
    }
}
