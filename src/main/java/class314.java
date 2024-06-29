import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class314 extends class16 {

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    private int field4884 = 0;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    private int field4887 = 1;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
    private int field4893 = 0;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4886 = "Loaded input handler";

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
    public static int field4889 = -1;

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "[Z")
    public static boolean[] field4894 = new boolean[100];

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "Lpm;")
    public static class111 field4896 = new class111(64);

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "Lug;")
    public static class321 field4897;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "Lkb;")
    public static class39 field4898;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(ZI)[I", line = 6)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            this.method55((byte) 36);
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        field4885++;
        if (this.field207.field4024) {
            int var4 = class130.field1921[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class276.field4376; var6++) {
                int var7 = class27.field396[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field4884 == 0) {
                    var9 = (var7 - var4) * this.field4887;
                } else {
                    int var10 = var8 * var8 + (var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4887 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field4893 == 0) {
                    var12 = class34.field454[(var12 & 0xFF3) >> 4] + 4096 >> 1;
                } else if (this.field4893 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 73)
    public class314() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V", line = 91)
    public final void method55(byte arg0) {
        class103.method723(false);
        field4890++;
        if (arg0 != 0) {
            method2183((byte) -106, 75, (class149) null, 68, -105);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 103)
    public static final void method2182() {
        for (int var0 = 0; var0 < class281.field4422; var0++) {
            class271 var1 = class240.field3822[var0];
            class245.method1739(var1);
            class240.field3822[var0] = null;
        }
        class281.field4422 = 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILch;II)V", line = 121)
    public static final void method2183(byte arg0, int arg1, class149 arg2, int arg3, int arg4) {
        field4888++;
        if (arg0 != 26) {
            return;
        }
        for (class197 var5 = (class197) class114.field1709.method1807((byte) 95); var5 != null; var5 = (class197) class114.field1709.method1808(18051)) {
            if (var5.field3238 == arg1 && (arg4 * 128) == var5.field3226 && (arg3 * 128) == var5.field3225 && var5.field3237.field2299 == arg2.field2299) {
                if (var5.field3232 != null) {
                    class107.field1622.method739(var5.field3232);
                    var5.field3232 = null;
                }
                if (var5.field3223 != null) {
                    class107.field1622.method739(var5.field3223);
                    var5.field3223 = null;
                }
                var5.method465((byte) -122);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)V", line = 161)
    public static void method2184(byte arg0) {
        field4894 = null;
        field4886 = null;
        field4897 = null;
        field4898 = null;
        field4896 = null;
        if (arg0 >= -87) {
            method2182();
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)Lpl;", line = 185)
    public static final class206 method2185(byte arg0, int arg1) {
        field4892++;
        class206 var2 = (class206) class98.field1495.method1619((long) arg1, arg0 + 164);
        if (arg0 != -54) {
            method2183((byte) 122, 93, (class149) null, -62, -72);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field337.method250(true, 32, arg1);
        class206 var4 = new class206();
        if (var3 != null) {
            var4.method1506(new class192(var3), arg0 + 160);
        }
        var4.method1505(-31);
        class98.field1495.method1621((long) arg1, 25, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLim;I)V", line = 213)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            return;
        }
        field4895++;
        if (arg2 == 0) {
            this.field4884 = arg1.method1399(-1172389784);
        } else if (arg2 == 1) {
            this.field4893 = arg1.method1399(-1172389784);
        } else if (arg2 == 3) {
            this.field4887 = arg1.method1399(-1172389784);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 257)
    public static final void method2186(String arg0, int arg1, Throwable arg2) {
        field4891++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class224.method1639(arg2, (byte) -108);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class255.method1797(var3, -110);
            String var4 = class341.method2350((byte) -30, ":", var3, "%3a");
            String var5 = class341.method2350((byte) 68, "@", var4, "%40");
            String var6 = class341.method2350((byte) -21, "&", var5, "%26");
            String var7 = class341.method2350((byte) 118, "#", var6, "%23");
            if (class238.field3759.field68 == null) {
                return;
            }
            class217 var8 = class238.field3759.method36(true, new URL(class238.field3759.field68.getCodeBase(), "clienterror.ws?c=" + class16.field193 + "&u=" + class140.field2085 + "&v1=" + class6.field72 + "&v2=" + class6.field61 + "&e=" + var7));
            while (var8.field3488 == 0) {
                class20.method128(0, 1L);
            }
            if (arg1 < 112) {
                return;
            }
            if (var8.field3488 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3490;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}
