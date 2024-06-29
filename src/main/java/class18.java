import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class18 extends class45 {

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public int field514 = 1000;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "Lkd;")
    public static class73 field510 = class126.method1070((byte) -66, "k");

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "Lkd;")
    public static class73 field512 = class126.method1070((byte) -66, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field517 = -1;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "Lkd;")
    public static class73 field515 = class126.method1070((byte) -66, "Welt");

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field513 = 0;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Ljb;")
    public static class64 field508 = new class64(64);

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static volatile int field523 = 0;

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "Lkd;")
    public static class73 field526 = class126.method1070((byte) -66, "<col=ff7000>");

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public static int field528 = -1;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "Lkd;")
    public static class73 field525 = class126.method1070((byte) -66, "null");

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "Lkd;")
    private static class73 field524 = class126.method1070((byte) -66, "Add ignore");

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public static int field529 = 1;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "Lkd;")
    public static class73 field527 = field524;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "[Lkd;")
    public static class73[] field530 = new class73[100];

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field519;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
    public static int[] field520;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIII)V")
    public void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field511++;
        class91 var10 = this.method90(11800);
        if (var10 != null) {
            this.field514 = var10.field514;
            var10.method149(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Lna;")
    public class91 method90(int arg0) {
        if (arg0 == 11800) {
            field521++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII[Lge;IIII[BI)V")
    public static final void method150(byte arg0, int arg1, int arg2, class47[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        if (arg0 > -84) {
            method150((byte) 89, -71, 37, null, -36, 55, 32, 30, null, 6);
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg6 + var15 > 0 && arg6 + var15 < 103) {
                    arg3[arg5].field1249[arg2 + var10][arg6 + var15] = class149.method1189(arg3[arg5].field1249[arg2 + var10][arg6 + var15], -16777217);
                }
            }
        }
        field509++;
        class114 var11 = new class114(arg8);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg1 == var12 && arg4 <= var13 && var13 < arg4 + 8 && var14 >= arg9 && var14 < arg9 + 8) {
                        class66.method546(0, 0, var11, arg2 + class9.method88(arg7, var13 & 0x7, -1, var14 & 0x7), arg5, class137.method1124(arg7, var13 & 0x7, (byte) -77, var14 & 0x7) + arg6, arg7, (byte) 4);
                    } else {
                        class66.method546(0, 0, var11, -1, 0, -1, 0, (byte) 4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public static void method151(int arg0) {
        int var1 = 20 / ((-arg0 - 39) / 62);
        field530 = null;
        field510 = null;
        field508 = null;
        field519 = null;
        field520 = null;
        field524 = null;
        field526 = null;
        field527 = null;
        field515 = null;
        field512 = null;
        field525 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BIIII)V")
    public static final void method152(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field518++;
        if (arg0 != 114) {
            return;
        }
        class2 var5 = (class2) class70.field1768.method1099(94, (long) arg4);
        if (var5 == null) {
            var5 = new class2();
            class70.field1768.method1093((byte) -60, var5, (long) arg4);
        }
        if (var5.field141.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field141.length; var8++) {
                var7[var8] = var5.field141[var8];
                var6[var8] = var5.field151[var8];
            }
            for (int var9 = var5.field141.length; var9 < arg1; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field151 = var6;
            var5.field141 = var7;
        }
        var5.field141[arg1] = arg3;
        var5.field151[arg1] = arg2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lmf;B)V")
    public static final void method153(class89 arg0, byte arg1) {
        field516++;
        arg0.field2291 = false;
        if (arg1 >= -96) {
            return;
        }
        if (arg0.field2245 != -1) {
            class36 var2 = class94.method782(-24669, arg0.field2245);
            if (var2 == null || var2.field976 == null) {
                arg0.field2245 = -1;
            } else {
                arg0.field2267++;
                if (var2.field976.length > arg0.field2282 && var2.field968[arg0.field2282] < arg0.field2267) {
                    arg0.field2282++;
                    arg0.field2267 = 1;
                    class82.method697(arg0.field2277, var2, (byte) -93, arg0.field2264, arg0.field2282);
                }
                if (arg0.field2282 >= var2.field976.length) {
                    arg0.field2267 = 0;
                    arg0.field2282 = 0;
                    class82.method697(arg0.field2277, var2, (byte) -60, arg0.field2264, arg0.field2282);
                }
            }
        }
        if (arg0.field2301 != -1 && arg0.field2243 <= class49.field1308) {
            if (arg0.field2262 < 0) {
                arg0.field2262 = 0;
            }
            int var3 = class72.method603(arg0.field2301, -1).field3104;
            if (var3 == -1) {
                arg0.field2301 = -1;
            } else {
                class36 var4 = class94.method782(-24669, var3);
                if (var4 == null || var4.field976 == null) {
                    arg0.field2301 = -1;
                } else {
                    arg0.field2275++;
                    if (var4.field976.length > arg0.field2262 && var4.field968[arg0.field2262] < arg0.field2275) {
                        arg0.field2262++;
                        arg0.field2275 = 1;
                        class82.method697(arg0.field2277, var4, (byte) -104, arg0.field2264, arg0.field2262);
                    }
                    if (arg0.field2262 >= var4.field976.length && (arg0.field2262 < 0 || arg0.field2262 >= var4.field976.length)) {
                        arg0.field2301 = -1;
                    }
                }
            }
        }
        if (arg0.field2284 != -1 && arg0.field2241 <= 1) {
            class36 var5 = class94.method782(-24669, arg0.field2284);
            if (var5.field972 == 1 && arg0.field2228 > 0 && arg0.field2238 <= class49.field1308 && class49.field1308 > arg0.field2257) {
                arg0.field2241 = 1;
                return;
            }
        }
        if (arg0.field2284 != -1 && arg0.field2241 == 0) {
            class36 var6 = class94.method782(-24669, arg0.field2284);
            if (var6 == null || var6.field976 == null) {
                arg0.field2284 = -1;
            } else {
                arg0.field2296++;
                if (var6.field976.length > arg0.field2232 && arg0.field2296 > var6.field968[arg0.field2232]) {
                    arg0.field2232++;
                    arg0.field2296 = 1;
                    class82.method697(arg0.field2277, var6, (byte) -39, arg0.field2264, arg0.field2232);
                }
                if (var6.field976.length <= arg0.field2232) {
                    arg0.field2274++;
                    arg0.field2232 -= var6.field992;
                    if (var6.field986 <= arg0.field2274) {
                        arg0.field2284 = -1;
                    } else if (arg0.field2232 >= 0 && var6.field976.length > arg0.field2232) {
                        class82.method697(arg0.field2277, var6, (byte) -82, arg0.field2264, arg0.field2232);
                    } else {
                        arg0.field2284 = -1;
                    }
                }
                arg0.field2291 = var6.field975;
            }
        }
        if (arg0.field2241 > 0) {
            arg0.field2241--;
        }
    }
}
