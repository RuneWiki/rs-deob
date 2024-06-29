import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class106 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field2063 = 0;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public int field2078 = 0;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lsd;")
    public static class166 field2073 = class135.method935(" x ", 0);

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field2071 = 1;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field2065 = 0;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lsc;")
    public static class165 field2075 = new class165();

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lre;")
    public static class158 field2072;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Led;")
    public class42 field2068;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Led;")
    public class42 field2076;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Lha;")
    public static class65 field2080;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method788(byte arg0) {
        field2072 = null;
        field2080 = null;
        field2075 = null;
        int var1 = -2 / ((-arg0 - 15) / 62);
        field2073 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII[Lpf;I[BII)V")
    public static final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, class141[] arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg6 + var15 > 0 && arg6 + var15 < 103) {
                    arg5[arg3].field2748[arg4 + var10][arg6 + var15] = class22.method151(arg5[arg3].field2748[arg4 + var10][arg6 + var15], -16777217);
                }
            }
        }
        field2069++;
        class53 var11 = new class53(arg7);
        if (arg1 > -2) {
            return;
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 == var12 && var13 >= arg9 && var13 < arg9 + 8 && var14 >= arg2 && arg2 + 8 > var14) {
                        class113.method826(0, arg8, 0, var11, class204.method1342(var14 & 0x7, arg8, -87, var13 & 0x7) + arg6, class129.method912(var13 & 0x7, arg8, var14 & 0x7, (byte) -91) + arg4, arg3, 106);
                    } else {
                        class113.method826(0, 0, 0, var11, -1, -1, 0, 63);
                    }
                }
            }
        }
    }
}
