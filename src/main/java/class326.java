import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class326 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lbt;")
    public static class363 field4793 = new class363(128);

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4800 = new String[100];

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field4804 = 1;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public int field4789;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public int field4806;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lhk;")
    public class209 field4790;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
    public int[] field4787;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
    public int[] field4788;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public int[] field4791;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[I")
    public int[] field4797;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "[I")
    public int[] field4802;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "[I")
    public int[] field4803;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "[Lhk;")
    public class209[] field4792;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[[I")
    public int[][] field4795;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[[I")
    public int[][] field4801;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BB)V", line = 10)
    private final void method2127(byte[] arg0, byte arg1) {
        field4796++;
        class256 var3 = new class256(class31.method308((byte) 54, arg0));
        int var4 = var3.method1738((byte) 104);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4789 = var3.method1746(20972);
        } else {
            this.field4789 = 0;
        }
        int var5 = var3.method1738((byte) 98);
        this.field4806 = var3.method1767(1930493576);
        int var6 = 0;
        this.field4787 = new int[this.field4806];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field4806; var8++) {
            this.field4787[var8] = var6 += var3.method1767(1930493576);
            if (var7 < this.field4787[var8]) {
                var7 = this.field4787[var8];
            }
        }
        this.field4794 = var7 + 1;
        this.field4788 = new int[this.field4794];
        this.field4802 = new int[this.field4794];
        this.field4797 = new int[this.field4794];
        this.field4795 = new int[this.field4794][];
        this.field4791 = new int[this.field4794];
        if (var5 != 0) {
            this.field4803 = new int[this.field4794];
            for (int var9 = 0; var9 < this.field4794; var9++) {
                this.field4803[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4806; var10++) {
                this.field4803[this.field4787[var10]] = var3.method1746(20972);
            }
            this.field4790 = new class209(this.field4803);
        }
        for (int var11 = 0; var11 < this.field4806; var11++) {
            this.field4797[this.field4787[var11]] = var3.method1746(20972);
        }
        for (int var12 = 0; var12 < this.field4806; var12++) {
            this.field4788[this.field4787[var12]] = var3.method1746(20972);
        }
        int var13 = -29 % ((-arg1 - 64) / 62);
        for (int var14 = 0; var14 < this.field4806; var14++) {
            this.field4802[this.field4787[var14]] = var3.method1767(1930493576);
        }
        for (int var15 = 0; var15 < this.field4806; var15++) {
            int var22 = this.field4787[var15];
            int var23 = this.field4802[var22];
            int var24 = 0;
            this.field4795[var22] = new int[var23];
            int var25 = -1;
            for (int var26 = 0; var26 < var23; var26++) {
                int var27 = this.field4795[var22][var26] = var24 += var3.method1767(1930493576);
                if (var25 < var27) {
                    var25 = var27;
                }
            }
            this.field4791[var22] = var25 + 1;
            if (var25 + 1 == var23) {
                this.field4795[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4792 = new class209[var7 + 1];
        this.field4801 = new int[var7 + 1][];
        for (int var16 = 0; var16 < this.field4806; var16++) {
            int var17 = this.field4787[var16];
            int var18 = this.field4802[var17];
            this.field4801[var17] = new int[this.field4791[var17]];
            for (int var19 = 0; var19 < this.field4791[var17]; var19++) {
                this.field4801[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field4795[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field4795[var17][var20];
                }
                this.field4801[var17][var21] = var3.method1746(20972);
            }
            this.field4792[var17] = new class209(this.field4801[var17]);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 187)
    public static void method2128(boolean arg0) {
        field4800 = null;
        field4793 = null;
        if (arg0) {
            method2131(-5, -66, -81, 6, -81, -63);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V", line = 199)
    public static final void method2129(boolean arg0, int arg1) {
        field4805++;
        class125 var2 = class56.method428(arg1, 8, -3636);
        if (arg0) {
            var2.method847(101);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(FZIIIIIII)[[I", line = 224)
    public static final int[][] method2130(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4798++;
        int[][] var9 = new int[arg2][arg7];
        class227 var10 = new class227();
        var10.field3413 = arg4;
        if (arg8 != 3072) {
            return null;
        }
        var10.field3404 = arg3;
        var10.field3397 = (int) (arg0 * 4096.0F);
        var10.field3411 = arg1;
        var10.field3405 = arg6;
        var10.method363(0);
        class131.method879(false, arg2, arg7);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method1552((byte) -1, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V", line = 260)
    public static final void method2131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class308.field4554 = arg0;
        class15.field238 = arg5;
        class93.field1159 = arg1;
        class32.field444 = arg4;
        class359.field5225 = arg2;
        if (arg3 != 16383) {
            method2128(true);
        }
        field4799++;
        if (class359.field5225 >= 100) {
            int var6 = class93.field1159 * 128 + 64;
            int var7 = class32.field444 * 128 + 64;
            int var8 = class133.method889(class423.field6117, var6, var7, false) - class308.field4554;
            int var9 = var6 - class298.field4343;
            int var10 = var8 - class164.field2171;
            int var11 = var7 - class345.field5077;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class103.field1341 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class136.field1867 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class86.field1067 = 0;
            if (class103.field1341 < 1024) {
                class103.field1341 = 1024;
            }
            if (class103.field1341 > 3072) {
                class103.field1341 = 3072;
            }
        }
        class28.field402 = 2;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([BI)V", line = 305)
    public class326(byte[] arg0, int arg1) {
        this.field4786 = class356.method2272(arg0.length, (byte) 57, arg0);
        if (this.field4786 != arg1) {
            throw new RuntimeException();
        }
        this.method2127(arg0, (byte) -126);
    }
}
