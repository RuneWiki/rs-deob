import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class198 {

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "[S")
    public short[] field3139;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field3131;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[S")
    public short[] field3137;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "[B")
    public byte[] field3143;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
    public int[] field3144;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Z")
    public static boolean field3130 = false;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3132 = 0;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3140 = -1;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lea;")
    public static class204 field3138 = new class204();

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Z", line = 5)
    public final boolean method1437(int arg0, byte arg1) {
        field3141++;
        if (arg1 <= 48) {
            return true;
        } else {
            return (this.field3143[arg0] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)I", line = 16)
    public final int method1438(int arg0, byte arg1) {
        field3142++;
        if (arg1 != 81) {
            field3140 = -59;
        }
        return this.field3143[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lnb;I)V", line = 45)
    public static final void method1439(class315 arg0, int arg1) {
        short var2 = 256;
        field3133++;
        for (int var3 = arg1; var3 < class309.field4867.length; var3++) {
            class309.field4867[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class309.field4867[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var2 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class302.field4756[var9] = (class309.field4867[var9 - 1] + class309.field4867[var9 + 1] - (-class309.field4867[var9 - 128] + -class309.field4867[var9 + 128])) / 4;
                }
            }
            int[] var10 = class309.field4867;
            class309.field4867 = class302.field4756;
            class302.field4756 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field4256; var12++) {
            for (int var13 = 0; var13 < arg0.field4264; var13++) {
                if (arg0.field4925[var11++] != 0) {
                    int var14 = var13 + arg0.field4262 + 16;
                    int var15 = var12 + arg0.field4267 + 16;
                    int var16 = (var15 << 7) + var14;
                    class309.field4867[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 140)
    public static void method1440(byte arg0) {
        int var1 = 49 % ((arg0 + 66) / 52);
        field3138 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILdg;Ldg;IIIIJ)V", line = 148)
    public static final void method1441(int arg0, int arg1, int arg2, int arg3, class320 arg4, class320 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class114 var12 = new class114();
        var12.field1865 = arg10;
        var12.field1867 = arg1 * 128 + 64;
        var12.field1868 = arg2 * 128 + 64;
        var12.field1858 = arg3;
        var12.field1863 = arg4;
        var12.field1860 = arg5;
        var12.field1870 = arg6;
        var12.field1859 = arg7;
        var12.field1872 = arg8;
        var12.field1864 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class60.field946[var13][arg1][arg2] == null) {
                class60.field946[var13][arg1][arg2] = new class272(var13, arg1, arg2);
            }
        }
        class60.field946[arg0][arg1][arg2].field4219 = var12;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Z", line = 177)
    public final boolean method1442(int arg0, int arg1) {
        field3134++;
        if (arg0 <= 3) {
            this.method1437(84, (byte) 7);
        }
        return (this.field3143[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Z", line = 192)
    public final boolean method1443(boolean arg0, int arg1) {
        field3135++;
        if (!arg0) {
            this.method1437(8, (byte) 30);
        }
        return (this.field3143[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V", line = 207)
    public class198(int arg0) {
        this.field3136 = arg0;
        this.field3139 = new short[this.field3136];
        this.field3131 = new String[this.field3136];
        this.field3137 = new short[this.field3136];
        this.field3143 = new byte[this.field3136];
        this.field3144 = new int[this.field3136];
    }
}
