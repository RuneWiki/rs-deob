import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class120 {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2159 = -1;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field2162 = -1;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2165 = new CRC32();

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
    public static int[] field2168 = new int[50];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILwa;)V")
    public static final void method724(int arg0, class229 arg1) {
        byte[] var2 = new byte[24];
        field2166++;
        if (class42.field864 != null) {
            try {
                class42.field864.method1081((byte) -121, 0L);
                int var3 = 0;
                class42.field864.method1075(-79, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1468(24, var2, 0, (byte) -60);
        if (arg0 != -30891) {
            method732(true);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILoc;)V")
    public static final void method725(int arg0, class151 arg1) {
        try {
            class229.field4068.getAppletContext().showDocument(arg1.method966(class229.field4068.getCodeBase(), 71), "_blank");
        } catch (Exception var3) {
        }
        field2158++;
        int var2 = 39 / ((-arg0 - 24) / 40);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method726(int arg0) {
        field2168 = null;
        if (arg0 == 65535) {
            field2165 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
    public static final void method727(int arg0, int arg1) {
        field2156++;
        if (arg1 == 128) {
            class110 var2 = (class110) class166.field3032.method1538((long) arg0, (byte) 127);
            if (var2 != null) {
                var2.method636(89);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILwg;JZ)V")
    public static final void method728(int arg0, int arg1, int arg2, int arg3, class235 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class73 var8 = new class73();
        var8.field1423 = arg4;
        var8.field1425 = arg1 * 128 + 64;
        var8.field1427 = arg2 * 128 + 64;
        var8.field1424 = arg3;
        var8.field1421 = arg5;
        if (class95.field1776[arg0][arg1][arg2] == null) {
            class95.field1776[arg0][arg1][arg2] = new class72(arg0, arg1, arg2);
        }
        class95.field1776[arg0][arg1][arg2].field1400 = var8;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lni;ZB)V")
    public static final void method729(class147 arg0, boolean arg1, byte arg2) {
        field2163++;
        int var3 = arg0.field2631;
        int var4 = (int) arg0.field1881;
        arg0.method636(121);
        if (arg2 < 51) {
            field2159 = -30;
        }
        if (arg1) {
            class48.method343(var3, 0);
        }
        method731(var3, -1521517264);
        class232 var5 = class175.method1115(-22192, var4);
        if (var5 != null) {
            class27.method208(true, var5);
        }
        class117.field2108 = 0;
        class225.field3917 = false;
        class5.method31(class224.field3908, class222.field3856, -9529, class55.field1109, class79.field1522);
        if (class31.field652 != -1) {
            class142.method917(class31.field652, 1, 255);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILnd;IIBZ)V")
    public static final void method730(int arg0, int arg1, class142 arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        field2157++;
        long var7 = (long) ((arg1 << 16) + arg4);
        class188 var9 = (class188) class36.field750.method1538(var7, (byte) 127);
        if (var9 != null) {
            return;
        }
        class188 var10 = (class188) class104.field1864.method1538(var7, (byte) 127);
        if (var10 != null) {
            return;
        }
        class188 var11 = (class188) class20.field426.method1538(var7, (byte) 127);
        if (var11 == null) {
            if (!arg6) {
                class188 var12 = (class188) class109.field1923.method1538(var7, (byte) 127);
                if (var12 != null) {
                    return;
                }
            }
            class188 var13 = new class188();
            var13.field3340 = arg2;
            if (arg3 <= -90) {
                var13.field3341 = arg5;
                var13.field3333 = arg0;
                if (arg6) {
                    class36.field750.method1536((byte) 94, var13, var7);
                    class232.field4227++;
                } else {
                    class53.field1079.method330(91, var13);
                    class20.field426.method1536((byte) -61, var13, var7);
                    class232.field4263++;
                }
            }
        } else if (arg6) {
            var11.method1129((byte) -2);
            class36.field750.method1536((byte) 83, var11, var7);
            class232.field4263--;
            class232.field4227++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
    private static final void method731(int arg0, int arg1) {
        field2155++;
        if (arg1 != -1521517264) {
            return;
        }
        for (class170 var2 = (class170) class93.field1729.method1534(20912); var2 != null; var2 = (class170) class93.field1729.method1535(0)) {
            if ((var2.field1881 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method636(122);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static final void method732(boolean arg0) {
        field2160++;
        if (arg0) {
            method729(null, false, (byte) 84);
        }
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
    }
}
