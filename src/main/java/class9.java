import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class9 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[I")
    private int[] field112 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Z")
    public boolean field106 = false;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public int field121 = -1;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field107 = "Discard";

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field114 = 0;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field124 = -1;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[I")
    public static int[] field104 = new int[4096];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[I")
    private int[] field105;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[S")
    private short[] field109;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "[S")
    private short[] field117;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "[S")
    private short[] field122;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "[S")
    private short[] field128;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "[[[Lnb;")
    public static class129[][][] field127;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Z")
    public final boolean method48(boolean arg0) {
        field118++;
        if (arg0) {
            this.field105 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field112[var3] != -1 && !class271.field4342.method912(false, 0, this.field112[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILig;)V")
    public final void method49(int arg0, class136 arg1) {
        field110++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1012(4);
            if (var3 == 0) {
                return;
            }
            this.method56(arg1, var3, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)Z")
    public static final boolean method50(boolean arg0) {
        field113++;
        if (arg0) {
            field107 = null;
        }
        return class201.field3274;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method51(byte arg0) {
        int var1 = 103 % ((arg0 - 55) / 33);
        field107 = null;
        field104 = null;
        field127 = null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Luj;")
    public final class264 method52(byte arg0) {
        field123++;
        if (this.field105 == null) {
            return null;
        }
        class264[] var2 = new class264[this.field105.length];
        if (arg0 != 6) {
            this.method48(false);
        }
        for (int var3 = 0; var3 < this.field105.length; var3++) {
            var2[var3] = class264.method1779(class271.field4342, this.field105[var3], 0);
        }
        class264 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class264(var2, var2.length);
        }
        if (this.field122 != null) {
            for (int var5 = 0; var5 < this.field122.length; var5++) {
                var4.method1803(this.field122[var5], this.field117[var5]);
            }
        }
        if (this.field109 != null) {
            for (int var6 = 0; var6 < this.field109.length; var6++) {
                var4.method1799(this.field109[var6], this.field128[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBLsb;)Lcb;")
    public static final class33 method53(int arg0, byte arg1, class124 arg2) {
        byte[] var3 = arg2.method897(false, arg0);
        field115++;
        if (var3 == null) {
            return null;
        } else if (arg1 == 54) {
            return new class33(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method54(int arg0) {
        class184.field3034.method1156(arg0 - 137);
        field108++;
        if (arg0 == 70) {
            class273.field4354.method1156(arg0 - 180);
            class110.field1691.method1156(-70);
            class248.field3963.method1156(-61);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Z")
    public final boolean method55(int arg0) {
        field119++;
        if (this.field105 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field105.length; var3++) {
            if (!class271.field4342.method912(false, 0, this.field105[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lig;IB)V")
    private final void method56(class136 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field121 = arg0.method1012(4);
        } else if (arg1 == 2) {
            int var4 = arg0.method1012(arg2 ^ 0xFFFFFFD5);
            this.field105 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field105[var5] = arg0.method996(65280);
            }
        } else if (arg1 == 3) {
            this.field106 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1012(arg2 ^ 0xFFFFFFD5);
            this.field117 = new short[var6];
            this.field122 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field122[var7] = (short) arg0.method996(65280);
                this.field117[var7] = (short) arg0.method996(65280);
            }
        } else if (arg1 == 41) {
            int var8 = arg0.method1012(arg2 + 51);
            this.field128 = new short[var8];
            this.field109 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field109[var9] = (short) arg0.method996(65280);
                this.field128[var9] = (short) arg0.method996(65280);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field112[arg1 - 60] = arg0.method996(65280);
        }
        if (arg2 != -47) {
            field124 = -55;
        }
        field125++;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Luj;")
    public final class264 method57(int arg0) {
        field116++;
        class264[] var2 = new class264[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field112[var4] != -1) {
                var2[var3++] = class264.method1779(class271.field4342, this.field112[var4], 0);
            }
        }
        if (arg0 != 4096) {
            this.field121 = -12;
        }
        class264 var5 = new class264(var2, var3);
        if (this.field122 != null) {
            for (int var6 = 0; var6 < this.field122.length; var6++) {
                var5.method1803(this.field122[var6], this.field117[var6]);
            }
        }
        if (this.field109 != null) {
            for (int var7 = 0; var7 < this.field109.length; var7++) {
                var5.method1799(this.field109[var7], this.field128[var7]);
            }
        }
        return var5;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field104[var0] = class209.method1395(500, var0);
        }
    }
}
