import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 implements class44 {

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Ls;")
    private class108 field208 = new class108();

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    private int field209 = 0;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    private int field216 = 128;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "D")
    private double field218 = 1.0D;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Lk;")
    private class60 field230;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[Lre;")
    private class107[] field199;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field200 = -1;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lwb;")
    public static class130 field203 = class26.method212("Lade Konfiguration )2 ", -32376);

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Lwb;")
    public static class130 field210 = class26.method212("Ung-Ultiger Benutzername", -32376);

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[I")
    public static int[] field213 = new int[128];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lwb;")
    private static class130 field198 = class26.method212("Private chat", -32376);

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lwb;")
    private static class130 field206 = class26.method212("Click to continue", -32376);

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Lwb;")
    public static class130 field222 = field198;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lwb;")
    public static class130 field207 = class26.method212(" )2> @lre@", -32376);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lwb;")
    public static class130 field201 = field206;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static volatile int field220 = 0;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Lwb;")
    public static class130 field225 = class26.method212("Diese Welt ist voll)3", -32376);

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lwb;")
    private static class130 field215 = class26.method212("yellow:", -32376);

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Lwb;")
    public static class130 field217 = field215;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "J")
    public static long field229;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Z")
    public static boolean field223;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[[[B")
    public static byte[][][] field228;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V", line = 12)
    public final void method41(int arg0, int arg1) {
        if (arg0 > -111) {
            this.method48(14, -103);
        }
        for (int var3 = 0; var3 < this.field199.length; var3++) {
            class107 var4 = this.field199[var3];
            if (var4 != null && var4.field2588 != 0 && var4.field2592) {
                var4.method809(arg1);
                var4.field2592 = false;
            }
        }
        field224++;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)Z", line = 49)
    public final boolean method42(byte arg0, int arg1) {
        if (arg0 != 98) {
            this.method50((byte) -13, 31);
        }
        field214++;
        return this.field199[arg1].field2595;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I", line = 60)
    public final int method43(int arg0, int arg1) {
        if (arg1 != -17348) {
            method45(122, -29, 75, -43);
        }
        field227++;
        return this.field199[arg0] == null ? 0 : this.field199[arg0].field2597;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lk;Lk;IDI)V", line = 348)
    public class6(class60 arg0, class60 arg1, int arg2, double arg3, int arg4) {
        this.field218 = arg3;
        this.field221 = arg2;
        this.field230 = arg1;
        this.field216 = arg4;
        this.field209 = this.field221;
        int[] var7 = arg0.method489(0, 0);
        int var8 = var7.length;
        this.field199 = new class107[arg0.method511(3, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class36 var10 = new class36(arg0.method508(var7[var9], 0, 0));
            this.field199[var7[var9]] = new class107(var10);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 102)
    public static void method44(int arg0) {
        field222 = null;
        field225 = null;
        field198 = null;
        if (arg0 != 31239) {
            return;
        }
        field217 = null;
        field201 = null;
        field213 = null;
        field215 = null;
        field203 = null;
        field206 = null;
        field228 = null;
        field207 = null;
        field210 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)Z", line = 129)
    public static final boolean method45(int arg0, int arg1, int arg2, int arg3) {
        field204++;
        int var4 = arg1 >> 14 & 0x7FFF;
        int var5 = class79.field1926.method311(class71.field1818, arg2, arg3, arg1);
        if (var5 == -1) {
            return false;
        } else if (arg0 <= 40) {
            return false;
        } else {
            int var6 = var5 & 0x1F;
            int var7 = var5 >> 6 & 0x3;
            if (var6 == 10 || var6 == 11 || var6 == 22) {
                class109 var8 = class32.method256(6, var4);
                int var9;
                int var10;
                if (var7 == 0 || var7 == 2) {
                    var10 = var8.field2664;
                    var9 = var8.field2647;
                } else {
                    var9 = var8.field2664;
                    var10 = var8.field2647;
                }
                int var11 = var8.field2637;
                if (var7 != 0) {
                    var11 = (var11 << var7 & 0xF) + (var11 >> 4 - var7);
                }
                class18.method147(0, class42.field1179.field2107[0], var10, var9, var11, 2, true, 0, true, arg2, class42.field1179.field2079[0], arg3);
            } else {
                class18.method147(var7, class42.field1179.field2107[0], 0, 0, 0, 2, true, var6 + 1, true, arg2, class42.field1179.field2079[0], arg3);
            }
            class98.field2372 = 0;
            class20.field594 = class35.field988;
            class101.field2426 = 2;
            class85.field2027 = class105.field2558;
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZD)V", line = 194)
    public final void method46(boolean arg0, double arg1) {
        this.field218 = arg1;
        field226++;
        if (!arg0) {
            method44(32);
        }
        this.method47(0);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 207)
    public final void method47(int arg0) {
        field205++;
        for (int var2 = arg0; var2 < this.field199.length; var2++) {
            if (this.field199[var2] != null) {
                this.field199[var2].method807();
            }
        }
        this.field208 = new class108();
        this.field209 = this.field221;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I", line = 257)
    public final int[] method48(int arg0, int arg1) {
        class107 var3 = this.field199[arg1];
        field202++;
        int var4 = -71 / ((-arg0 - 63) / 58);
        if (var3 != null) {
            if (var3.field2593 != null) {
                this.field208.method810(var3, -30206);
                var3.field2592 = true;
                return var3.field2593;
            }
            boolean var5 = var3.method808(this.field218, this.field216, this.field230);
            if (var5) {
                if (this.field209 == 0) {
                    class107 var6 = (class107) this.field208.method817(5);
                    var6.method807();
                } else {
                    this.field209--;
                }
                this.field208.method810(var3, -30206);
                var3.field2592 = true;
                return var3.field2593;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 316)
    public static final void method49(int arg0) {
        class34.field934 = false;
        field212++;
        if (arg0 < 11) {
            field229 = 40L;
        }
        class4.field189 = false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z", line = 328)
    public final boolean method50(byte arg0, int arg1) {
        field219++;
        if (arg0 <= 53) {
            field200 = 124;
        }
        return this.field216 == 64;
    }
}
