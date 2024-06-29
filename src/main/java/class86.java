import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class86 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Loc;")
    private static class99 field2144 = class48.method402((byte) -104, "Create a free account");

    @OriginalMember(owner = "client!m", name = "g", descriptor = "[I")
    public static int[] field2147 = new int[2000];

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[Lee;")
    public static class34[] field2143 = new class34[4];

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2146 = 0;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Loc;")
    public static class99 field2152 = class48.method402((byte) -104, "http:)4)4");

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
    public static boolean field2145 = false;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Loc;")
    public static class99 field2156 = field2144;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2151 = 0;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[I")
    public static int[] field2141 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Z")
    public static boolean field2154 = false;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Loc;")
    public static class99 field2153 = class48.method402((byte) -104, "hitmarks");

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "[I")
    public static int[] field2160;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "[Ljc;")
    public static class64[] field2159;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[[B")
    public static byte[][] field2142;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lpc;III)Ljc;")
    public static final class64 method734(class105 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 8784) {
            method738(null, (byte) -7);
        }
        field2150++;
        return class95.method782(arg1, (byte) -99, arg0, arg2) ? class83.method712((byte) -87) : null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Lee;II[BIIIIII)V")
    public static final void method735(class34[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2158++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg9 + var16 > 0 && arg9 + var16 < 103) {
                    arg0[arg8].field820[arg5 + var10][arg9 + var16] = class17.method171(arg0[arg8].field820[arg5 + var10][arg9 + var16], -16777217);
                }
            }
        }
        class57 var11 = new class57(arg3);
        int var12 = -94 % ((arg2 + 42) / 46);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg6 == var13 && var14 >= arg4 && var14 < arg4 + 8 && arg1 <= var15 && var15 < arg1 + 8) {
                        class93.method772(var11, 0, arg9 + class149.method1207(arg7, var15 & 0x7, var14 & 0x7, -46), (byte) -90, class136.method1131(var15 & 0x7, arg7, (byte) 101, var14 & 0x7) + arg5, arg8, arg7, 0);
                    } else {
                        class93.method772(var11, 0, -1, (byte) -116, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method736(int arg0) {
        field2156 = null;
        field2152 = null;
        field2160 = null;
        field2153 = null;
        field2147 = null;
        field2142 = null;
        if (arg0 != 0) {
            field2146 = 101;
        }
        field2144 = null;
        field2143 = null;
        field2141 = null;
        field2159 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
    public static final void method737(int arg0, boolean arg1) {
        field2148++;
        if (arg0 <= 101) {
            field2151 = -16;
        }
        if (class43.field1058.field1205 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && class43.field1058.field1205.peekEvent() != null; var2++) {
            class57.method509(-127, 1L);
        }
        if (arg1) {
            class43.field1058.field1205.postEvent(new ActionEvent(class5.field99, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lta;B)V")
    public static final void method738(class127 arg0, byte arg1) {
        field2155++;
        if (arg0.field3114 == 0) {
            return;
        }
        if (arg0.field3129 != -1 && arg0.field3129 < 32768) {
            class149 var2 = class149.field3691[arg0.field3129];
            if (var2 != null) {
                int var3 = arg0.field3115 - var2.field3115;
                int var4 = arg0.field3077 - var2.field3077;
                if (var3 != 0 || var4 != 0) {
                    arg0.field3064 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field3129 >= 32768) {
            int var5 = arg0.field3129 - 32768;
            if (class94.field2292 == var5) {
                var5 = 2047;
            }
            class126 var6 = class59.field1571[var5];
            if (var6 != null) {
                int var7 = arg0.field3115 - var6.field3115;
                int var8 = arg0.field3077 - var6.field3077;
                if (var7 != 0 || var8 != 0) {
                    arg0.field3064 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field3131 != 0 || arg0.field3071 != 0) && (arg0.field3070 == 0 || arg0.field3118 > 0)) {
            int var9 = arg0.field3115 - (arg0.field3131 - class67.field1712 - class67.field1712) * 64;
            int var10 = arg0.field3077 - (arg0.field3071 - class5.field120 - class5.field120) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field3064 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field3071 = 0;
            arg0.field3131 = 0;
        }
        if (arg1 > -21) {
            method735(null, -110, -122, null, -75, 67, -120, -73, -36, -68);
        }
        int var11 = arg0.field3064 - arg0.field3107 & 0x7FF;
        if (var11 == 0) {
            arg0.field3069 = 0;
            return;
        }
        arg0.field3069++;
        if (var11 <= 1024) {
            boolean var12 = true;
            arg0.field3107 += arg0.field3114;
            if (var11 < arg0.field3114 || var11 > 2048 - arg0.field3114) {
                arg0.field3107 = arg0.field3064;
                var12 = false;
            }
            if (arg0.field3126 == arg0.field3092 && (arg0.field3069 > 25 || var12)) {
                if (arg0.field3099 == -1) {
                    arg0.field3092 = arg0.field3109;
                } else {
                    arg0.field3092 = arg0.field3099;
                }
            }
        } else {
            arg0.field3107 -= arg0.field3114;
            boolean var13 = true;
            if (arg0.field3114 > var11 || var11 > 2048 - arg0.field3114) {
                var13 = false;
                arg0.field3107 = arg0.field3064;
            }
            if (arg0.field3126 == arg0.field3092 && (arg0.field3069 > 25 || var13)) {
                if (arg0.field3090 == -1) {
                    arg0.field3092 = arg0.field3109;
                } else {
                    arg0.field3092 = arg0.field3090;
                }
            }
        }
        arg0.field3107 &= 0x7FF;
    }
}
