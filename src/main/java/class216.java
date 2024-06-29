import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class216 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lg;")
    public static class67 field3181 = new class67(64);

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Z")
    public static boolean field3182 = false;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[S")
    public static short[] field3186 = new short[500];

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
    public static int[] field3185 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[F")
    public static float[] field3188 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lph;")
    public static class361 field3184;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[Lo;Z[BB)V", line = 5)
    public static final void method1562(int arg0, int arg1, class96[] arg2, boolean arg3, byte[] arg4, byte arg5) {
        field3183++;
        class190 var6 = new class190(arg4);
        if (arg5 != -127) {
            method1562(-128, 52, (class96[]) null, false, (byte[]) null, (byte) -122);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1332(32767);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1372(-102);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 & 0x3F;
                int var14 = var6.method1319(255);
                int var15 = arg1 + var11;
                int var16 = var14 & 0x3;
                int var17 = var14 >> 2;
                int var18 = arg0 + var13;
                if (var15 > 0 && var18 > 0 && var15 < 103 && var18 < 103) {
                    class96 var19 = null;
                    if (!arg3) {
                        int var20 = var12;
                        if ((class230.field3491[1][var15][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class77.method633(arg3, var7, var12, var19, var18, !arg3, (byte) -114, var15, var12, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 81)
    public static void method1563(int arg0) {
        if (arg0 != 64) {
            method1562(-44, -37, (class96[]) null, false, (byte[]) null, (byte) 18);
        }
        field3188 = null;
        field3186 = null;
        field3181 = null;
        field3185 = null;
        field3184 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 110)
    public static final void method1564(int arg0) {
        field3180++;
        if (class9.field156 == 0) {
            return;
        }
        try {
            if ((++class108.field1566) > 2000) {
                if (class67.field973 != null) {
                    class67.field973.method1555(false);
                    class67.field973 = null;
                }
                if (class54.field795 >= 1) {
                    class121.field1710 = -5;
                    class9.field156 = 0;
                    return;
                }
                class9.field156 = 1;
                class108.field1566 = 0;
                if (class75.field1096 == class62.field913) {
                    class62.field913 = class240.field3574;
                } else {
                    class62.field913 = class75.field1096;
                }
                class54.field795++;
            }
            if (class9.field156 == 1) {
                class22.field340 = class54.field787.method486(class62.field913, (byte) 85, class112.field1624);
                class9.field156 = 2;
            }
            if (class9.field156 == 2) {
                if (class22.field340.field3056 == 2) {
                    throw new IOException();
                }
                if (class22.field340.field3056 != 1) {
                    return;
                }
                class67.field973 = new class215((Socket) class22.field340.field3058, class54.field787);
                class22.field340 = null;
                class67.field973.method1558(5000, class107.field1533.field2718, 0, class107.field1533.field2776);
                if (class119.field1675 != null) {
                    class119.field1675.method535((byte) -92);
                }
                if (class28.field396 != null) {
                    class28.field396.method535((byte) -86);
                }
                int var1 = class67.field973.method1553(arg0 ^ 0x111C);
                if (class119.field1675 != null) {
                    class119.field1675.method535((byte) -128);
                }
                if (class28.field396 != null) {
                    class28.field396.method535((byte) -102);
                }
                if (var1 != 21) {
                    class121.field1710 = var1;
                    class9.field156 = 0;
                    class67.field973.method1555(false);
                    class67.field973 = null;
                    return;
                }
                class9.field156 = 3;
            }
            if (class9.field156 == 3) {
                if (class67.field973.method1554(arg0 ^ 0xFFFFEEE2) < 1) {
                    return;
                }
                class62.field907 = new String[class67.field973.method1553(0)];
                class9.field156 = 4;
            }
            if (class9.field156 == 4) {
                if (class67.field973.method1554(-2) < class62.field907.length * 8) {
                    return;
                }
                class83.field1194.field2776 = 0;
                class67.field973.method1552(class83.field1194.field2718, 0, class62.field907.length * 8, (byte) 33);
                for (int var2 = 0; var2 < class62.field907.length; var2++) {
                    class62.field907[var2] = class286.method2068(class83.field1194.method1311(24263), (byte) 63);
                }
                class121.field1710 = 21;
                class9.field156 = 0;
                class67.field973.method1555(false);
                class67.field973 = null;
                return;
            }
            if (arg0 != 4380) {
                field3181 = (class67) null;
            }
        } catch (IOException var4) {
            if (class67.field973 != null) {
                class67.field973.method1555(false);
                class67.field973 = null;
            }
            if (class54.field795 >= 1) {
                class9.field156 = 0;
                class121.field1710 = -4;
            } else {
                class9.field156 = 1;
                class108.field1566 = 0;
                class54.field795++;
                if (class75.field1096 == class62.field913) {
                    class62.field913 = class240.field3574;
                } else {
                    class62.field913 = class75.field1096;
                }
            }
        }
    }
}
