import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class566 {

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    private int field8301 = 0;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "[J")
    private long[] field8303 = new long[8];

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "[J")
    private long[] field8310 = new long[8];

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "[J")
    private long[] field8311 = new long[8];

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "[J")
    private long[] field8305 = new long[8];

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "[B")
    private byte[] field8302 = new byte[32];

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    private int field8313 = 0;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "[B")
    private byte[] field8307 = new byte[64];

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "[J")
    private long[] field8312 = new long[8];

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "Lcu;")
    public static class185 field8317;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "Lcea;")
    private static class180 field8318;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "[I")
    public static int[] field8320;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "Ldn;")
    public static class438 field8314;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILsa;)V")
    public static final void method3297(int arg0, class174 arg1) {
        class128.field1574[arg0] = arg1;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method3298(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field8306++;
        if ((class330.field4304[0][arg0][arg4] & 0x2) != 0) {
            return true;
        } else if ((class330.field4304[arg1][arg0][arg4] & 0x10) != 0) {
            return false;
        } else if (arg2 == class251.method1426(arg1, arg4, 5296, arg0)) {
            return true;
        } else {
            if (arg3 != -121) {
                field8320 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([BZI)V")
    public final void method3299(byte[] arg0, boolean arg1, int arg2) {
        field8304++;
        this.field8307[this.field8313] = (byte) class42.method223(this.field8307[this.field8313], 0x80 >>> class288.method1624(this.field8301, 7));
        this.field8313++;
        if (this.field8313 > 32) {
            while (true) {
                if (this.field8313 >= 64) {
                    this.method3301(-9);
                    this.field8313 = 0;
                    break;
                }
                this.field8307[this.field8313++] = 0;
            }
        }
        while (this.field8313 < 32) {
            this.field8307[this.field8313++] = 0;
        }
        class345.method1932(this.field8302, 0, this.field8307, 32, 32);
        if (arg1) {
            field8320 = null;
        }
        this.method3301(-9);
        int var4 = 0;
        int var5 = arg2;
        while (var4 < 8) {
            long var6 = this.field8312[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([BBJ)V")
    public final void method3300(byte[] arg0, byte arg1, long arg2) {
        field8316++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field8301 & 0x7;
        long var8 = arg2;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field8302[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field8302[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg2 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field8307[this.field8313] = (byte) class42.method223(this.field8307[this.field8313], var15 >>> var7);
            this.field8313++;
            this.field8301 += 8 - var7;
            if (this.field8301 == 512) {
                this.method3301(-9);
                this.field8301 = this.field8313 = 0;
            }
            this.field8307[this.field8313] = (byte) class288.method1624(255, var15 << 8 - var7);
            this.field8301 += var7;
            var5++;
            arg2 -= 8L;
        }
        int var12;
        if (arg2 > 0L) {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field8307[this.field8313] = (byte) class42.method223(this.field8307[this.field8313], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (arg1 >= -99) {
            this.field8302 = null;
        }
        if ((long) var7 + arg2 < 8L) {
            this.field8301 = (int) ((long) this.field8301 + arg2);
            return;
        }
        this.field8301 += 8 - var7;
        long var13 = arg2 - (long) (8 - var7);
        this.field8313++;
        if (this.field8301 == 512) {
            this.method3301(-9);
            this.field8301 = this.field8313 = 0;
        }
        this.field8307[this.field8313] = (byte) class288.method1624(255, var12 << 8 - var7);
        this.field8301 += (int) var13;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    private final void method3301(int arg0) {
        field8319++;
        if (arg0 != -9) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field8311[var2] = class463.method2691(class463.method2691(class84.method495(255L, (long) this.field8307[var3 + 6]) << 8, class463.method2691(class463.method2691(class463.method2691(class463.method2691(class84.method495((long) this.field8307[var3 + 2], 255L) << 40, class463.method2691(class84.method495((long) this.field8307[var3 + 1], 255L) << 48, (long) this.field8307[var3] << 56)), class84.method495(0xFFL << 32, (long) this.field8307[var3 + 3] << 32)), class84.method495((long) this.field8307[var3 + 4], 255L) << 24), class84.method495((long) this.field8307[var3 + 5], 255L) << 16)), class84.method495((long) this.field8307[var3 + 7], 255L));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field8310[var4] = class463.method2691(this.field8311[var4], this.field8303[var4] = this.field8312[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field8305[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field8305[var7] = class463.method2691(this.field8305[var7], class204.field2445[var13][class288.method1624(255, (int) (this.field8303[class288.method1624(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field8303[var8] = this.field8305[var8];
            }
            this.field8303[0] = class463.method2691(this.field8303[0], class204.field2446[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field8305[var9] = this.field8303[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field8305[var9] = class463.method2691(this.field8305[var9], class204.field2445[var11][class288.method1624(255, (int) (this.field8310[class288.method1624(var9 - var11, 7)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field8310[var10] = this.field8305[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field8312[var6] = class463.method2691(this.field8312[var6], class463.method2691(this.field8311[var6], this.field8310[var6]));
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V")
    public static void method3302(int arg0) {
        field8314 = null;
        field8318 = null;
        field8320 = null;
        if (arg0 <= -10) {
            field8317 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3303(String arg0, int arg1) {
        field8308++;
        if (arg0 == null) {
            return;
        }
        if (!(class389.field5147 < 100 || class556.field8169) || class389.field5147 >= 200) {
            class435.method2514(class216.field2627.method987(class31.field247, 22), true);
            return;
        }
        String var2 = class78.method453((byte) 97, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class389.field5147; var3++) {
            String var7 = class78.method453((byte) 97, class436.field5911[var3]);
            if (var7 != null && var7.equals(var2)) {
                class435.method2514(arg0 + class603.field8709.method987(class31.field247, 22), true);
                return;
            }
            if (class283.field3716[var3] != null) {
                String var8 = class78.method453((byte) 97, class283.field3716[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class435.method2514(arg0 + class603.field8709.method987(class31.field247, 22), true);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class426.field5481; var4++) {
            String var5 = class78.method453((byte) 97, class615.field8914[var4]);
            if (var5 != null && var5.equals(var2)) {
                class435.method2514(field8318.method987(class31.field247, 22) + arg0 + class387.field5111.method987(class31.field247, 22), true);
                return;
            }
            if (class586.field8506[var4] != null) {
                String var6 = class78.method453((byte) 97, class586.field8506[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class435.method2514(field8318.method987(class31.field247, 22) + arg0 + class387.field5111.method987(class31.field247, 22), true);
                    return;
                }
            }
        }
        if (class78.method453((byte) 97, class103.field1265.field8023).equals(var2)) {
            class435.method2514(class114.field1417.method987(class31.field247, 22), true);
            return;
        }
        class418.method2378(17984, class525.field7354);
        class307.field3903++;
        class136.field1663.method2093(class88.method528((byte) -61, arg0), -128);
        if (arg1 > 25) {
            class136.field1663.method2106(-113, arg0);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)Z")
    public static final boolean method3304(int arg0, int arg1, int arg2) {
        field8309++;
        int var3 = 22 % ((arg2 + 85) / 38);
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
    public final void method3305(int arg0) {
        field8315++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field8302[var2] = 0;
        }
        this.field8307[0] = 0;
        this.field8301 = this.field8313 = 0;
        if (arg0 >= -96) {
            this.field8303 = null;
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field8312[var3] = 0L;
        }
    }

    static {
        new class180("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field8317 = new class185(5, 4);
        field8318 = new class180("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        field8320 = new int[] { 16, 32, 64, 128 };
    }
}
