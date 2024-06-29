import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class129 {

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "B")
    private byte field2405;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lr;")
    public static class66 field2401 = class93.method641(43, "document)3cookie=(R");

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lri;")
    public static class116 field2404;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[[[B")
    public static byte[][][] field2408;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method898(boolean arg0) {
        if (!arg0) {
            field2404 = null;
        }
        field2408 = null;
        field2401 = null;
        field2404 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I")
    public final int method899(int arg0) {
        if (arg0 == 7) {
            field2409++;
            return this.field2405 & 0x7;
        } else {
            return -110;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)I")
    public final int method900(int arg0) {
        field2412++;
        if (arg0 == 8) {
            return (this.field2405 & 0x8) == 8 ? 1 : 0;
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
    public static final void method901(int arg0) {
        field2403++;
        if (class20.field277 != null) {
            class20.field277.method1590((byte) 94);
        }
        if (arg0 == 16322 && class31.field461 != null) {
            class31.field461.method1590((byte) 119);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method902(byte arg0) {
        field2414++;
        if (class69.field1400 == 0) {
            return;
        }
        try {
            if (++class47.field858 > 2000) {
                if (class101.field1972 != null) {
                    class101.field1972.method1277(-47);
                    class101.field1972 = null;
                }
                if (class121.field2289 >= 1) {
                    class91.field1750 = -5;
                    class69.field1400 = 0;
                    return;
                }
                class69.field1400 = 1;
                if (class89.field1732 == class111.field2136) {
                    class89.field1732 = class151.field2707;
                } else {
                    class89.field1732 = class111.field2136;
                }
                class47.field858 = 0;
                class121.field2289++;
            }
            if (class69.field1400 == 1) {
                class160.field2881 = class95.field1835.method771(class35.field518, (byte) 113, class89.field1732);
                class69.field1400 = 2;
            }
            if (class69.field1400 == 2) {
                if (class160.field2881.field4066 == 2) {
                    throw new IOException();
                }
                if (class160.field2881.field4066 != 1) {
                    return;
                }
                class101.field1972 = new class196((Socket) class160.field2881.field4069, class95.field1835);
                class160.field2881 = null;
                class101.field1972.method1273(0, (byte) 78, class28.field412.field4335, class28.field412.field4350);
                if (class31.field461 != null) {
                    class31.field461.method1582(false);
                }
                if (class20.field277 != null) {
                    class20.field277.method1582(false);
                }
                int var1 = class101.field1972.method1276(55);
                if (class31.field461 != null) {
                    class31.field461.method1582(false);
                }
                if (class20.field277 != null) {
                    class20.field277.method1582(false);
                }
                if (var1 != 21) {
                    class69.field1400 = 0;
                    class91.field1750 = var1;
                    class101.field1972.method1277(-89);
                    class101.field1972 = null;
                    return;
                }
                class69.field1400 = 3;
            }
            if (arg0 < 5) {
                method901(110);
            }
            if (class69.field1400 == 3) {
                if (class101.field1972.method1280((byte) 102) < 1) {
                    return;
                }
                class132.field2462 = new class66[class101.field1972.method1276(114)];
                class69.field1400 = 4;
            }
            if (class69.field1400 == 4 && class101.field1972.method1280((byte) 102) >= class132.field2462.length * 8) {
                class84.field1627.field4335 = 0;
                class101.field1972.method1274(3, class132.field2462.length * 8, 0, class84.field1627.field4350);
                for (int var2 = 0; var2 < class132.field2462.length; var2++) {
                    class132.field2462[var2] = class87.method616(class84.field1627.method1668(88), -1);
                }
                class91.field1750 = 21;
                class69.field1400 = 0;
                class101.field1972.method1277(-25);
                class101.field1972 = null;
            }
        } catch (IOException var3) {
            if (class101.field1972 != null) {
                class101.field1972.method1277(-119);
                class101.field1972 = null;
            }
            if (class121.field2289 >= 1) {
                class91.field1750 = -4;
                class69.field1400 = 0;
            } else {
                if (class89.field1732 == class111.field2136) {
                    class89.field1732 = class151.field2707;
                } else {
                    class89.field1732 = class111.field2136;
                }
                class69.field1400 = 1;
                class121.field2289++;
                class47.field858 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZ)V")
    public static final void method903(boolean arg0, boolean arg1) {
        field2411++;
        byte[][] var2 = class76.field1503;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class202.field3469[var5] >> 8) * 64 - class3.field39;
            int var12 = (class202.field3469[var5] & 0xFF) * 64 - class34.field512;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                method901(16322);
                class20.method91(var12, var13, var11, arg0, -4, (class155.field2755 - 6) * 8, class157.field2816 * 8 - 48, class193.field3346);
            }
        }
        int var6 = 0;
        if (arg1) {
            field2408 = null;
        }
        while (var6 < var4) {
            int var7 = (class202.field3469[var6] & 0xFF) * 64 - class34.field512;
            byte[] var8 = var2[var6];
            int var9 = (class202.field3469[var6] >> 8) * 64 - class3.field39;
            if (var8 == null && class155.field2755 < 800) {
                method901(16322);
                for (int var10 = 0; var10 < var3; var10++) {
                    class188.method1243(64, -73, 64, var10, var7, var9);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class129() {
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Llh;)V")
    public class129(class249 arg0) {
        this.field2405 = arg0.method1682(3390);
        this.field2402 = arg0.method1674(1355769544);
        this.field2415 = arg0.method1652(-5528);
        this.field2406 = arg0.method1652(-5528);
        this.field2410 = arg0.method1652(-5528);
        this.field2413 = arg0.method1652(-5528);
    }
}
