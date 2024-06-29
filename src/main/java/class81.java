import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class81 {

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public int field1255 = -1;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lbf;")
    public static class209 field1253 = new class209(8);

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lma;")
    public static class5 field1265 = class12.method119("null", (byte) 68);

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
    public static int[] field1266 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lni;")
    public static class202 field1264;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lma;")
    public static class5 field1257;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field1263;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 5)
    public static void method552(byte arg0) {
        field1257 = null;
        field1264 = null;
        field1266 = null;
        if (arg0 > -55) {
            field1253 = (class209) null;
        }
        field1265 = null;
        field1253 = null;
        field1263 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)I", line = 25)
    public static final int method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1261++;
        int var7 = arg0 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg2;
            arg2 = var8;
        }
        if (arg6 != 25353) {
            method553(-126, -12, 60, 113, -89, 125, -38);
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg1 - arg4;
        } else {
            return 7 - arg5 - (arg2 + -1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZB)V", line = 66)
    public static final void method554(boolean arg0, byte arg1) {
        field1262++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class161.field2465;
            var3 = 1;
        } else {
            var2 = class288.field4877;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class177.method1155((byte) 96);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class172.field2643[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 14 & 0x3FF;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = (var7 & 0x3FFF) >> 3;
                            int var12 = (var9 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class294.field4958.length; var13++) {
                                if (class294.field4958[var13] == var12 && var2[var13] != null) {
                                    class111.method738(var4, var6 * 8, var2[var13], var10, (var9 & 0x7) * 8, class242.field4031, var5 * 8, 5101, (var11 & 0x7) * 8, var8, arg0);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 84) {
            field1253 = (class209) null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BILjava/util/Random;)I", line = 184)
    public static final int method555(byte arg0, int arg1, Random arg2) {
        if (arg0 != -57) {
            field1265 = (class5) null;
        }
        field1256++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class206.method1361(20079, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class249.method1738(var4, -24788, arg1);
        }
    }
}
