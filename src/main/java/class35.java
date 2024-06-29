import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class35 extends class292 {

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "S")
    public static short field564 = 32767;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Ljava/lang/String;")
    public static String field559 = "red:";

    @OriginalMember(owner = "client!va", name = "X", descriptor = "[I")
    public static int[] field571 = new int[14];

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field572 = -2;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "Lta;")
    public static class262 field565 = new class262(16);

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "Luf;")
    public static class176 field555;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "Luf;")
    public static class176 field568;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Lwa;")
    public static class265 field552;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "Ljava/lang/String;")
    public String field558;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Ljava/lang/String;")
    public static String field561;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "[C")
    public char[] field562;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "[C")
    public char[] field566;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "[I")
    public int[] field556;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "[I")
    public static int[] field560;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "[I")
    public int[] field563;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "[[[B")
    public static byte[][][] field575;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lf;B)V")
    public final void method272(class37 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method333((byte) -59);
            if (var3 == 0) {
                field567++;
                if (arg1 >= -22) {
                    field555 = null;
                    return;
                }
                return;
            }
            this.method274(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZC)I")
    public final int method273(boolean arg0, char arg1) {
        field574++;
        if (this.field563 == null) {
            return -1;
        }
        if (arg0) {
            this.method272((class37) null, (byte) 89);
        }
        for (int var3 = 0; var3 < this.field563.length; var3++) {
            if (this.field566[var3] == arg1) {
                return this.field563[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILf;)V")
    private final void method274(int arg0, int arg1, class37 arg2) {
        if (arg1 == 1) {
            this.field558 = arg2.method331(16312);
        } else if (arg1 == 2) {
            int var4 = arg2.method333((byte) -59);
            this.field566 = new char[var4];
            this.field563 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field563[var5] = arg2.method293(-11);
                byte var6 = arg2.method322((byte) 97);
                this.field566[var5] = var6 == 0 ? 0 : class11.method121(63, var6);
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method333((byte) -59);
            this.field562 = new char[var7];
            this.field556 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field556[var8] = arg2.method293(-41);
                byte var9 = arg2.method322((byte) 71);
                this.field562[var8] = var9 == 0 ? 0 : class11.method121(63, var9);
            }
        }
        if (arg0 != 0) {
            this.method278((byte) -51, 'L');
        }
        field553++;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public static void method275(int arg0) {
        int var1 = 98 % ((arg0 + 46) / 54);
        field571 = null;
        field565 = null;
        field568 = null;
        field575 = null;
        field559 = null;
        field555 = null;
        field552 = null;
        field560 = null;
        field561 = null;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public final void method276(int arg0) {
        field569++;
        if (this.field556 != null) {
            for (int var2 = 0; var2 < this.field556.length; var2++) {
                this.field556[var2] = class115.method840(this.field556[var2], 32768);
            }
        }
        if (this.field563 != null) {
            for (int var3 = 0; var3 < this.field563.length; var3++) {
                this.field563[var3] = class115.method840(this.field563[var3], 32768);
            }
        }
        if (arg0 != 32768) {
            this.field563 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public static final void method277(byte arg0) {
        class273.field4305 = 0;
        field554++;
        int var1 = (class261.field4058.field4176 >> 7) + class118.field1828;
        int var2 = (class261.field4058.field4123 >> 7) + class129.field2008;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class273.field4305 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class273.field4305 = 1;
        }
        if (class273.field4305 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class273.field4305 = 0;
        }
        if (arg0 != -7) {
            field560 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BC)I")
    public final int method278(byte arg0, char arg1) {
        if (arg0 != 109) {
            method277((byte) 43);
        }
        field557++;
        if (this.field556 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field556.length; var3++) {
            if (this.field562[var3] == arg1) {
                return this.field556[var3];
            }
        }
        return -1;
    }
}
