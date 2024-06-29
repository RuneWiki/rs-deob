import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class45 extends class9 {

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "[C")
    private static char[] field378 = new char[64];

    @OriginalMember(owner = "client!aea", name = "I", descriptor = "[F")
    public static float[] field385;

    @OriginalMember(owner = "client!aea", name = "G", descriptor = "[F")
    public static float[] field383;

    @OriginalMember(owner = "client!aea", name = "L", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!aea", name = "M", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!aea", name = "E", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!aea", name = "H", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!aea", name = "J", descriptor = "Ljava/lang/String;")
    public String field386;

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "[C")
    public char[] field379;

    @OriginalMember(owner = "client!aea", name = "K", descriptor = "[C")
    public char[] field387;

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "[I")
    public int[] field380;

    @OriginalMember(owner = "client!aea", name = "D", descriptor = "[I")
    public int[] field381;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IILos;)V")
    private final void method235(int arg0, int arg1, class374 arg2) {
        if (arg0 == 1) {
            this.field386 = arg2.method2133(false);
        } else if (arg0 == 2) {
            int var7 = arg2.method2129(-106);
            this.field379 = new char[var7];
            this.field380 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field380[var8] = arg2.method2136(false);
                byte var9 = arg2.method2124(-122);
                this.field379[var8] = var9 == 0 ? 0 : class67.method376((byte) -68, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method2129(-78);
            this.field387 = new char[var4];
            this.field381 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field381[var5] = arg2.method2136(false);
                byte var6 = arg2.method2124(102);
                this.field387[var5] = var6 == 0 ? 0 : class67.method376((byte) -46, var6);
            }
        }
        if (arg1 == 15719) {
            field374++;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IC)I")
    public final int method236(int arg0, char arg1) {
        field375++;
        int var3 = 98 / ((arg0 + 42) / 46);
        if (this.field380 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field380.length; var4++) {
            if (this.field379[var4] == arg1) {
                return this.field380[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)V")
    public static final void method237(boolean arg0) {
        if (!arg0) {
            method237(true);
        }
        if (class127.method724(-8)) {
            if (class330.field4302 == null) {
                class542.method3162(111);
            }
            class328.field4281 = 0;
            class279.field3666 = true;
            try {
                class646.field9399 = class216.field2633.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        field377++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILos;)V")
    public final void method238(int arg0, class374 arg1) {
        field376++;
        while (true) {
            int var3 = arg1.method2129(-78);
            if (var3 == 0) {
                if (arg0 == -19212) {
                    return;
                } else {
                    this.field379 = null;
                    return;
                }
            }
            this.method235(var3, 15719, arg1);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
    public final void method239(byte arg0) {
        if (this.field381 != null) {
            for (int var2 = 0; var2 < this.field381.length; var2++) {
                this.field381[var2] = class42.method223(this.field381[var2], 32768);
            }
        }
        field384++;
        if (this.field380 != null) {
            for (int var3 = 0; var3 < this.field380.length; var3++) {
                this.field380[var3] = class42.method223(this.field380[var3], 32768);
            }
        }
        if (arg0 >= -20) {
            this.field381 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(CB)I")
    public final int method240(char arg0, byte arg1) {
        field382++;
        if (this.field381 == null) {
            return -1;
        }
        if (arg1 < 98) {
            this.method236(98, (char) 65534);
        }
        for (int var3 = 0; var3 < this.field381.length; var3++) {
            if (this.field387[var3] == arg0) {
                return this.field381[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)V")
    public static void method241(int arg0) {
        field378 = null;
        if (arg0 != 45) {
            field378 = null;
        }
        field385 = null;
        field383 = null;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field378[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field378[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field378[var2] = (char) (var2 + 48 - 52);
        }
        field378[63] = '-';
        field378[62] = '*';
        field385 = new float[16384];
        field383 = new float[16384];
        field388 = -1;
        double var3 = 3.834951969714103E-4D;
        for (int var5 = 0; var5 < 16384; var5++) {
            field383[var5] = (float) Math.sin((double) var5 * var3);
            field385[var5] = (float) Math.cos((double) var5 * var3);
        }
        field389 = -1;
    }
}
