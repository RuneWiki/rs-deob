import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class119 {

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1841 = 0;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1843 = "shake:";

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1835 = -1;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "Z")
    public static boolean field1850 = false;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[B")
    public byte[] field1847;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "[B")
    public byte[] field1848;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
    public static int[] field1834;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
    public static final boolean method853(int arg0, int arg1, int arg2) {
        field1845++;
        if (!class64.field1025) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class261.field4006[var3] == null || class261.field4006[var3][var4] == null) {
            return false;
        }
        class188 var5 = class261.field4006[var3][var4];
        if (arg2 == -1 && var5.field2937 == 0) {
            for (int var6 = 0; var6 < class220.field3450; var6++) {
                if (class80.field1341[var6] == 5 || class80.field1341[var6] == 1001 || class80.field1341[var6] == 13 || class80.field1341[var6] == 6 || class80.field1341[var6] == 30) {
                    for (class188 var7 = class5.method57((byte) -124, class290.field4570[var6]); var7 != null; var7 = class102.method781(683162224, var7)) {
                        if (var5.field2977 == var7.field2977) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class220.field3450; var8++) {
                if (class211.field3279[var8] == arg2 && class290.field4570[var8] == var5.field2977 && (class80.field1341[var8] == 5 || class80.field1341[var8] == 1001 || class80.field1341[var8] == 13 || class80.field1341[var8] == 6 || class80.field1341[var8] == 30)) {
                    return true;
                }
            }
        }
        if (arg0 > -120) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method854(int arg0) {
        field1846++;
        if (class191.field3038 || class238.field3689 == 2) {
            return;
        }
        try {
            if (arg0 != -2736) {
                method857(-115, 47, (byte) -7, 101, 25, -33, (class73) null);
            }
            class138.method959("tbrefresh", (byte) -85, class272.field4303);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method855(byte arg0) {
        field1834 = null;
        field1843 = null;
        if (arg0 < 117) {
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Luf;Z)V")
    public static final void method856(class176 arg0, boolean arg1) {
        class217.field3413 = class6.method76(arg0, class283.field4474, 0);
        field1842++;
        class252.field3878 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class112.field1762[var2] & 0xFF0000) >> 16);
            int var5 = (class112.field1762[var2 + 1] & 0xFF0000) >> 16;
            float var6 = (float) ((class112.field1762[var2] & 0xFF00) >> 8);
            int var7 = (class112.field1762[var2 + 1] & 0xFF00) >> 8;
            float var8 = ((float) var7 - var6) / 64.0F;
            float var9 = ((float) var5 - var4) / 64.0F;
            int var10 = class112.field1762[var2 + 1] & 0xFF;
            float var11 = (float) (class112.field1762[var2] & 0xFF);
            float var12 = ((float) var10 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class252.field3878[var2 * 64 + var13] = class115.method840(class115.method840((int) var6 << 8, (int) var4 << 16), (int) var11);
                var6 += var8;
                var11 += var12;
                var4 += var9;
            }
        }
        if (!arg1) {
            return;
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class252.field3878[var3] = class112.field1762[3];
        }
        class161.field2470 = new int[32768];
        class65.field1028 = new int[32768];
        class32.method258(103, (class168) null);
        class87.field1427 = new int[32768];
        class130.field2024 = new int[32768];
        class149.field2310 = new class49(128, 254);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIBIIILtd;)Z")
    public static final boolean method857(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class73 arg6) {
        field1836++;
        class159 var7 = class94.method734(arg2 ^ 0x5C42, arg6.field1215);
        if (var7.field2438 == -1) {
            return true;
        }
        int var9;
        if (arg6.field1223) {
            int var8 = arg6.field1225 + arg4;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class168 var10 = var7.method1077(-123, var9, arg6.field1198);
        if (var10 == null) {
            return false;
        }
        int var11 = arg6.field1232;
        if (arg2 != 102) {
            return true;
        }
        int var12 = arg6.field1227;
        if ((var9 & 0x1) == 1) {
            var12 = arg6.field1232;
            var11 = arg6.field1227;
        }
        int var13 = var10.field2674;
        int var14 = var10.field2669;
        if (var7.field2436) {
            var14 = var11 * 4;
            var13 = var12 * 4;
        }
        if (var7.field2441 == 0) {
            var10.method1116((arg5 * 4) + 48, (-arg0 + -var12 + 104) * 4 + 48, var14, var13);
        } else {
            var10.method1121((arg5 * 4) + 48, 48 - -((-arg0 + 104 + -var12) * 4), var14, var13, var7.field2441);
        }
        return true;
    }
}
