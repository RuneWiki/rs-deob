import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class239 implements class237 {

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "Ltq;")
    private class572 field3019 = new class572(128);

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "[I")
    public int[] field3020 = new int[class692.field9748.field4738];

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "[I")
    private int[] field3015 = new int[class692.field9748.field4738];

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "[C")
    private static char[] field3013 = new char[64];

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "Lkfa;")
    public static class549 field3022;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "Lclient;")
    public static client field3025;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lep;IZI)V")
    public static final void method1375(class382 arg0, int arg1, boolean arg2, int arg3) {
        field3023++;
        if (!arg2) {
            field3013 = null;
        }
        class213 var4 = arg0.method2091((byte) -83, class453.field6284);
        if (var4 == null) {
            return;
        }
        class453.field6284.method314(arg3, arg1, arg0.field5035 + arg3, arg1 - -arg0.field4958);
        if (class550.field7847 >= 3) {
            class453.field6284.method328(-16777216, var4, arg3, arg1);
        } else {
            class319.field4132.method2613((float) arg0.field5035 / 2.0F + (float) arg3, (float) arg0.field4958 / 2.0F + (float) arg1, 4096, ((int) (-class90.field1041) & 0x3FFF) << 2, var4, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field3025 = null;
        if (arg0 > -64) {
            field3022 = null;
        }
        field3022 = null;
        field3013 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIB)V")
    public final void method1377(int arg0, int arg1, byte arg2) {
        field3018++;
        this.field3020[arg1] = arg0;
        class577 var4 = (class577) this.field3019.method3234((byte) -64, (long) arg1);
        if (var4 == null) {
            class577 var5 = new class577(class641.method3604(false) + 500L);
            this.field3019.method3235((long) arg1, -1, var5);
        } else {
            var4.field8239 = class641.method3604(false) + 500L;
        }
        if (arg2 < 71) {
            this.field3020 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BII)V")
    public final void method1378(byte arg0, int arg1, int arg2) {
        field3017++;
        class607 var4 = class470.field6566.method1699((byte) -54, arg2);
        int var5 = var4.field8575;
        int var6 = var4.field8577;
        int var7 = var4.field8574;
        int var8 = 116 % ((-arg0 - 35) / 41);
        int var9 = class446.field6134[var7 - var6];
        if (arg1 < 0 || arg1 > var9) {
            arg1 = 0;
        }
        int var10 = var9 << var6;
        this.method1377(var10 & arg1 << var6 | ~var10 & this.field3020[var5], var5, (byte) 119);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
    public final void method1379(int arg0, int arg1, int arg2) {
        if (arg0 != 21017) {
            this.method1379(-6, 2, 53);
        }
        this.field3015[arg2] = arg1;
        field3012++;
        class577 var4 = (class577) this.field3019.method3234((byte) -80, (long) arg2);
        if (var4 == null) {
            class577 var5 = new class577(4611686018427387905L);
            this.field3019.method3235((long) arg2, -1, var5);
        } else if (var4.field8239 != 4611686018427387905L) {
            var4.field8239 = class641.method3604(false) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V")
    public final void method1380(boolean arg0) {
        field3021++;
        for (int var2 = 0; var2 < class692.field9748.field4738; var2++) {
            class405 var3 = class692.field9748.method1996(16, var2);
            if (var3 != null && var3.field5404 == 0) {
                this.field3015[var2] = 0;
                this.field3020[var2] = 0;
            }
        }
        if (arg0) {
            this.method1378((byte) 19, -69, 22);
        }
        this.field3019 = new class572(128);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IB)I")
    public final int method1372(int arg0, byte arg1) {
        field3024++;
        class607 var3 = class470.field6566.method1699((byte) -54, arg0);
        if (arg1 >= -28) {
            return -84;
        }
        int var4 = var3.field8575;
        int var5 = var3.field8577;
        int var6 = var3.field8574;
        int var7 = class446.field6134[var6 - var5];
        return var7 & this.field3020[var4] >> var5;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZB)I")
    public final int method1381(boolean arg0, byte arg1) {
        if (arg1 > -121) {
            return -71;
        }
        field3014++;
        long var3 = class641.method3604(false);
        for (class577 var5 = arg0 ? (class577) this.field3019.method3232(-1) : (class577) this.field3019.method3236(-27646); var5 != null; var5 = (class577) this.field3019.method3236(-27646)) {
            if (var3 > (var5.field8239 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field8239 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field3405;
                    this.field3020[var6] = this.field3015[var6];
                    var5.method1519((byte) 121);
                    return var6;
                }
                var5.method1519((byte) 121);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)I")
    public final int method1371(int arg0, int arg1) {
        field3016++;
        return arg1 == -13366 ? this.field3020[arg0] : -53;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)V")
    public final void method1382(int arg0, int arg1, int arg2) {
        field3011++;
        class607 var4 = class470.field6566.method1699((byte) -54, arg1);
        int var5 = var4.field8575;
        if (arg2 > -121) {
            method1376(-76);
        }
        int var6 = var4.field8577;
        int var7 = var4.field8574;
        int var8 = class446.field6134[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1379(21017, var9 & arg0 << var6 | this.field3015[var5] & ~var9, var5);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3013[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3013[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3013[var2] = (char) (var2 + 48 - 52);
        }
        field3013[63] = '/';
        field3013[62] = '+';
        field3022 = new class549(55, -1);
    }
}
