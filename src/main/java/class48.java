import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class48 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lke;")
    public static class65 field1244 = class1.method17("Bitte versuchen Sie)1", -111);

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[[B")
    public static byte[][] field1254 = new byte[50][];

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[Lke;")
    public static class65[] field1256 = new class65[100];

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lke;")
    public static class65 field1262 = class1.method17("invback", -128);

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lke;")
    public static class65 field1261 = class1.method17("@gre@", -127);

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lke;")
    private static class65 field1264 = class1.method17("Please try using a different world)3", -114);

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lke;")
    public static class65 field1258 = field1264;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lke;")
    public static class65 field1248 = field1264;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lke;")
    public static class65 field1250 = field1264;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lke;")
    public static class65 field1251 = field1264;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lke;")
    public static class65 field1249 = field1264;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lke;")
    public static class65 field1253 = field1264;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Lke;")
    private static class65 field1265 = class1.method17("Attack", -118);

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lke;")
    public static class65 field1259 = field1265;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Lkb;")
    public static class61 field1246;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZI)Z", line = 17)
    public static final boolean method398(int arg0, int arg1, boolean arg2, int arg3) {
        field1247++;
        int var4 = class89.field2377.method608(class19.field462, arg1, arg3, arg0);
        int var5 = arg0 >> 14 & 0x7FFF;
        if (var4 == -1) {
            return false;
        }
        if (arg2) {
            method401(false);
        }
        int var6 = var4 >> 6 & 0x3;
        int var7 = var4 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class19 var8 = class54.method435(32247, var5);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field415;
                var10 = var8.field432;
            } else {
                var9 = var8.field432;
                var10 = var8.field415;
            }
            int var11 = var8.field419;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class24.method196(var11, var9, 0, arg3, 2, var10, (byte) -112, class32.field833.field1105[0], arg1, true, 0, class32.field833.field1097[0]);
        } else {
            class24.method196(0, 0, var6, arg3, 2, 0, (byte) -112, class32.field833.field1105[0], arg1, true, var7 + 1, class32.field833.field1097[0]);
        }
        class130.field3135 = class115.field2901;
        class51.field1294 = 2;
        class60.field1618 = 0;
        class66.field1773 = class1.field42;
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 79)
    public static void method399(int arg0) {
        field1254 = null;
        field1251 = null;
        field1253 = null;
        field1244 = null;
        field1256 = null;
        field1258 = null;
        field1250 = null;
        field1265 = null;
        field1246 = null;
        if (arg0 != 0) {
            return;
        }
        field1262 = null;
        field1249 = null;
        field1261 = null;
        field1264 = null;
        field1248 = null;
        field1259 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljb;IIIB)V", line = 123)
    public static final void method400(class55 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1252++;
        if (class125.field3040 >= 400) {
            return;
        }
        if (arg0.field1403 != null) {
            arg0 = arg0.method443(arg4 ^ 0xFFFFFFEB);
        }
        if (arg0 == null || !arg0.field1423) {
            return;
        }
        class65 var5 = arg0.field1425;
        if (arg0.field1436 != 0) {
            var5 = class21.method172(-125, new class65[] { var5, class54.method432(class32.field833.field2856, arg0.field1436, -1), class20.field490, class51.field1306, class39.method320(arg0.field1436, (byte) -36), class44.field1170 });
        }
        if (client.field382 == 1) {
            class97.method812(arg2, class88.field2351, -128, class21.method172(arg4 - 99, new class65[] { class101.field2634, class83.field2197, var5 }), 37, arg3, arg1);
            class131.field3190++;
        } else if (class101.field2635 != 1) {
            class9.field159++;
            class65[] var6 = arg0.field1420;
            if (class33.field849) {
                var6 = class13.method75(arg4 + 26, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method546((byte) 103, field1259)) {
                        class39.field1020++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 52;
                        }
                        if (var7 == 1) {
                            var8 = 35;
                        }
                        if (var7 == 2) {
                            var8 = 13;
                        }
                        if (var7 == 3) {
                            var8 = 40;
                        }
                        if (var7 == 4) {
                            var8 = 34;
                        }
                        class97.method812(arg2, var6[var7], -125, class21.method172(arg4 - 105, new class65[] { class50.field1267, var5 }), var8, arg3, arg1);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method546((byte) 103, field1259)) {
                        class6.field124++;
                        short var10 = 0;
                        if (arg0.field1436 > class32.field833.field2856) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 52;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 35;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 13;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 40;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 34;
                        }
                        class97.method812(arg2, var6[var9], -122, class21.method172(-107, new class65[] { class50.field1267, var5 }), var11, arg3, arg1);
                    }
                }
            }
            class97.method812(arg2, class128.field3088, arg4 ^ 0x6C, class21.method172(-50, new class65[] { class50.field1267, var5 }), 1005, arg3, arg1);
        } else if ((class46.field1213 & 0x2) == 2) {
            class99.field2563++;
            class97.method812(arg2, class28.field749, -124, class21.method172(arg4 - 51, new class65[] { class51.field1286, class83.field2197, var5 }), 42, arg3, arg1);
        }
        if (arg4 != -21) {
            method400(null, -68, -49, 30, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 271)
    public static final void method401(boolean arg0) {
        class77.field2059.method834(5875);
        field1263++;
        if (!arg0) {
            field1251 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BB)[B", line = 320)
    public static final byte[] method402(byte[] arg0, byte arg1) {
        field1257++;
        class39 var2 = new class39(arg0);
        int var3 = var2.method334(117);
        int var4 = var2.method329(144752608);
        if (var4 < 0 || class6.field112 != 0 && class6.field112 < var4) {
            throw new RuntimeException();
        }
        if (arg1 >= -86) {
            field1244 = null;
        }
        if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method338(var8, 0, var4, -121);
            return var8;
        }
        int var5 = var2.method329(144752608);
        if (var5 < 0 || class6.field112 != 0 && class6.field112 < var5) {
            throw new RuntimeException();
        }
        byte[] var6 = new byte[var5];
        if (var3 == 1) {
            class40.method359(var6, var5, arg0, var4, 9);
        } else {
            try {
                DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                var7.readFully(var6);
                var7.close();
            } catch (IOException var9) {
            }
        }
        return var6;
    }
}
