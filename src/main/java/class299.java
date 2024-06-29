import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class299 {

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field5069;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[S")
    public short[] field5059;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[I")
    public int[] field5062;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[S")
    public short[] field5054;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[Lbe;")
    public class283[] field5066;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[B")
    public byte[] field5057;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lbe;")
    public static class283 field5061 = class153.method941(126, "_");

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5056 = 0;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lbe;")
    public static class283 field5065 = class153.method941(125, "(Z");

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field5067 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lbe;B)Lbe;", line = 4)
    public static final class283 method2022(class283[] arg0, byte arg1) {
        if (arg1 < 2) {
            field5065 = (class283) null;
        }
        field5063++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class74.method493(arg0, 0, (byte) 93, arg0.length);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)Z", line = 34)
    public static final boolean method2023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class36.field530[arg0][var8][var9] == -class109.field1838) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class65.field890[arg0][arg1][arg3] + arg5;
            if (!class46.method267(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class46.method267(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class46.method267(var10, var12, var14)) {
                return false;
            } else if (class46.method267(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class196.method1262(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class46.method267(var6 + 1, class65.field890[arg0][arg1][arg3] + arg5, var7 + 1) && class46.method267(var6 + 128 - 1, class65.field890[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class46.method267(var6 + 128 - 1, class65.field890[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class46.method267(var6 + 1, class65.field890[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 98)
    public static void method2024(int arg0) {
        if (arg0 != 21551) {
            method2024(56);
        }
        field5061 = null;
        field5065 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)I", line = 112)
    public final int method2025(byte arg0, int arg1) {
        if (arg0 != -39) {
            this.field5059 = (short[]) null;
        }
        field5060++;
        return this.field5057[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIIIII)V", line = 125)
    public static final void method2026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5058++;
        int var6 = 0;
        int var7 = arg1;
        class114.method742(30197, arg0 - arg5, class97.field1636[arg2], arg0 + arg5, arg3);
        int var8 = arg5 * arg5;
        int var9 = var8 << 1;
        int var10 = arg1 << 1;
        int var11 = arg1 * arg1;
        int var12 = var11 << 1;
        int var13 = (1 - var10) * var8 + var12;
        int var14 = var11 - ((var10 - 1) * var9);
        int var15 = -52 / ((-arg4 - 30) / 33);
        int var16 = ((var6 << 1) + 3) * var12;
        int var17 = ((arg1 << 1) - 3) * var9;
        int var18 = var11 << 2;
        int var19 = (var6 + 1) * var18;
        int var20 = var8 << 2;
        int var21 = (arg1 - 1) * var20;
        while (var7 > 0) {
            var7--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var6++;
                    var19 += var18;
                    var13 += var16;
                    var16 += var18;
                }
            }
            if (var14 < 0) {
                var13 += var16;
                var14 += var19;
                var6++;
                var19 += var18;
                var16 += var18;
            }
            var13 += -var21;
            int var22 = arg2 - var7;
            int var23 = arg2 + var7;
            int var24 = arg0 - var6;
            var21 -= var20;
            var14 += -var17;
            var17 -= var20;
            int var25 = arg0 + var6;
            class114.method742(30197, var24, class97.field1636[var22], var25, arg3);
            class114.method742(30197, var24, class97.field1636[var23], var25, arg3);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 211)
    public static final void method2027(int arg0) {
        field5053++;
        int[] var1 = new int[class72.field1259];
        int var2 = 0;
        for (int var3 = arg0; var3 < class72.field1259; var3++) {
            class304 var4 = class103.method676(var3, -1);
            if (var4.field5141 >= 0 || var4.field5188 >= 0) {
                var1[var2++] = var3;
            }
        }
        class240.field4055 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class240.field4055[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIBII)V", line = 244)
    public static final void method2028(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field5068++;
        int var6 = class44.method263(class247.field4220, arg5, (byte) -53, class217.field3677);
        if (arg3 != 103) {
            field5067 = 99;
        }
        int var7 = class44.method263(class247.field4220, arg2, (byte) -80, class217.field3677);
        int var8 = class44.method263(class166.field2765, arg1, (byte) -98, class269.field4551);
        int var9 = class44.method263(class166.field2765, arg4, (byte) -82, class269.field4551);
        for (int var10 = var6; var10 <= var7; var10++) {
            class114.method742(30197, var8, class97.field1636[var10], var9, arg0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIBI)V", line = 281)
    public static final void method2029(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 8) {
            method2022((class283[]) null, (byte) 0);
        }
        field5064++;
        class69 var4 = class225.method1480((byte) 123, arg1, arg0);
        if (var4 != null && var4.field988 != null) {
            class231 var5 = new class231();
            var5.field3912 = var4;
            var5.field3919 = var4.field988;
            class194.method1253(var5, 21258);
        }
        class175.field3023 = arg1;
        class12.field112 = arg3;
        class143.field2373 = arg0;
        class103.field1760 = true;
        class272.method1834(var4, 0);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V", line = 317)
    public class299(int arg0) {
        this.field5069 = arg0;
        this.field5059 = new short[this.field5069];
        this.field5062 = new int[this.field5069];
        this.field5054 = new short[this.field5069];
        this.field5066 = new class283[this.field5069];
        this.field5057 = new byte[this.field5069];
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Z", line = 331)
    public final boolean method2030(int arg0, int arg1) {
        if (arg0 >= -80) {
            return false;
        } else {
            field5055++;
            return (this.field5057[arg1] & 0x4) != 0;
        }
    }
}
