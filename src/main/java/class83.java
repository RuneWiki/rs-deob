import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class83 implements class188 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Llp;")
    private class272 field1205 = new class272(128);

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    public int[] field1208 = new int[class431.field6567.field307];

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[I")
    private int[] field1219 = new int[class431.field6567.field307];

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[[Z")
    public static boolean[][] field1207 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lps;")
    public static class63 field1209 = new class63();

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lau;")
    public static class527 field1218;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 3)
    public final void method566(int arg0, int arg1, int arg2) {
        field1216++;
        this.field1219[arg0] = arg2;
        if (arg1 != -10092) {
            this.method571(-120, 42);
        }
        class187 var4 = (class187) this.field1205.method1747((long) arg0, false);
        if (var4 == null) {
            class187 var5 = new class187(4611686018427387905L);
            this.field1205.method1751((long) arg0, -114, var5);
        } else if (var4.field2513 != 4611686018427387905L) {
            var4.field2513 = class58.method427((byte) -19) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V", line = 34)
    public final void method567(int arg0, int arg1, int arg2) {
        field1215++;
        class324 var4 = class102.field1481.method200(arg1, true);
        int var5 = var4.field4687;
        int var6 = var4.field4685;
        int var7 = var4.field4683;
        int var8 = class208.field2881[var7 - var6];
        if (arg0 < arg2 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method568(var5, arg2 ^ 0x80, ~var9 & this.field1208[var5] | arg0 << var6 & var9);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(III)V", line = 59)
    public final void method568(int arg0, int arg1, int arg2) {
        this.field1208[arg0] = arg2;
        field1212++;
        class187 var4 = (class187) this.field1205.method1747((long) arg0, false);
        if (arg1 != 128) {
            return;
        }
        if (var4 == null) {
            class187 var5 = new class187(class58.method427((byte) -19) + 500L);
            this.field1205.method1751((long) arg0, -125, var5);
        } else {
            var4.field2513 = class58.method427((byte) -19) + 500L;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 83)
    public final void method569(int arg0) {
        int var2 = 0;
        int var3 = 5 % ((arg0 - 6) / 35);
        while (class431.field6567.field307 > var2) {
            class174 var4 = class431.field6567.method189(var2, 16);
            if (var4 != null && var4.field2334 == 0) {
                this.field1219[var2] = 0;
                this.field1208[var2] = 0;
            }
            var2++;
        }
        field1214++;
        this.field1205 = new class272(128);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 112)
    public static void method570(byte arg0) {
        field1218 = null;
        field1209 = null;
        field1207 = null;
        int var1 = -57 % ((39 - arg0) / 55);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I", line = 124)
    public final int method571(int arg0, int arg1) {
        field1206++;
        class324 var3 = class102.field1481.method200(arg0, true);
        int var4 = var3.field4687;
        int var5 = var3.field4685;
        int var6 = var3.field4683;
        int var7 = class208.field2881[var6 - var5];
        if (arg1 != -7128) {
            this.method568(-70, -90, 91);
        }
        return this.field1208[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZI)V", line = 145)
    public final void method572(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method572(73, false, 86);
        }
        field1217++;
        class324 var4 = class102.field1481.method200(arg2, arg1);
        int var5 = var4.field4687;
        int var6 = var4.field4685;
        int var7 = var4.field4683;
        int var8 = class208.field2881[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method566(var5, -10092, this.field1219[var5] & ~var9 | arg0 << var6 & var9);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)I", line = 175)
    public final int method573(boolean arg0, int arg1) {
        field1210++;
        long var3 = class58.method427((byte) -19);
        for (class187 var5 = arg0 ? (class187) this.field1205.method1743(false) : (class187) this.field1205.method1742(-30); var5 != null; var5 = (class187) this.field1205.method1742(113)) {
            if ((var5.field2513 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field2513 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field35;
                    this.field1208[var6] = this.field1219[var6];
                    var5.method25(-13489);
                    return var6;
                }
                var5.method25(-13489);
            }
        }
        if (arg1 > -91) {
            field1209 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)I", line = 216)
    public final int method574(int arg0, byte arg1) {
        field1213++;
        if (arg1 != -124) {
            this.method567(-120, 14, -66);
        }
        return this.field1208[arg0];
    }
}
