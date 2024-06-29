import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class310 extends class285 {

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    private int field4829 = 409;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "[I")
    private int[] field4828 = new int[3];

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    private int field4830 = 4096;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    private int field4836 = 4096;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    private int field4835 = 4096;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "S")
    public static short field4839 = 256;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "Z")
    public static boolean field4838 = false;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Lha;")
    public static class328 field4832;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "[[Lrc;")
    public static class206[][] field4840;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "[[[Lkb;")
    public static class204[][][] field4833;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(ZI)I", line = 4)
    public static final int method2187(boolean arg0, int arg1) {
        if (!arg0) {
            method2190(-39);
        }
        field4834++;
        return (arg1 & 0x3FB29) >> 11;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 16)
    public class310() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLjj;I)V", line = 20)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            field4839 = 37;
        }
        if (arg2 == 0) {
            this.field4829 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field4830 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field4836 = arg1.method271(21081);
        } else if (arg2 == 3) {
            this.field4835 = arg1.method271(21081);
        } else if (arg2 == 4) {
            int var5 = arg1.method273(-867673064);
            this.field4828[2] = client.method767(var5, 255) >> 12;
            this.field4828[1] = client.method767(var5, 65280) >> 4;
            this.field4828[0] = client.method767(267386880, var5 << 4);
        }
        field4844++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)Ltk;", line = 85)
    public static final class268 method2188(int arg0, boolean arg1) {
        class268 var2 = (class268) class77.field1077.method755((long) arg0, arg1);
        field4842++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class252.field4025.method1287(arg0, 1, -1);
        } else {
            var3 = class304.field4759.method1287(arg0 & 0x7FFF, 1, -1);
        }
        class268 var4 = new class268();
        if (var3 != null) {
            var4.method1903(1, new class44(var3));
        }
        if (arg0 >= 32768) {
            var4.method1902((byte) -23);
        }
        class77.field1077.method750(var4, (long) arg0, -18339);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "(I)V", line = 135)
    public static void method2189(int arg0) {
        field4833 = (class204[][][]) null;
        field4832 = null;
        field4840 = (class206[][]) null;
        if (arg0 != -27115) {
            field4838 = true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)[[I", line = 150)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 < 121) {
            this.field4835 = 92;
        }
        field4831++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[][] var4 = this.method2053((byte) -42, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class287.field4599; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field4828[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 <= this.field4829) {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field4828[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field4829) {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field4828[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field4829) {
                            var8[var11] = this.field4835 * var12 >> 12;
                            var10[var11] = this.field4836 * var14 >> 12;
                            var9[var11] = this.field4830 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        }
                    } else {
                        var8[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var7[var11];
                    }
                } else {
                    var8[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var7[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "(I)V", line = 249)
    public static final void method2190(int arg0) {
        int var1 = -64 / ((78 - arg0) / 40);
        field4827++;
        if (class303.field4756) {
            return;
        }
        class303.field4756 = true;
        class33.field444 = true;
        if (class57.field803) {
            class97.field1386 = (float) ((int) class97.field1386 + 47 & 0xFFFFFFF0);
        } else {
            class201.field3276 += (12.0F - class201.field3276) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V", line = 272)
    public static final void method2191(int arg0, int arg1) {
        if (arg1 != -2922) {
            method2187(true, -22);
        }
        class344 var2 = class110.method759(4, arg0, false);
        field4837++;
        var2.method2384(-27354);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V", line = 298)
    public static final void method2192(int arg0, int arg1) {
        class33.field449.method708(arg1, true);
        field4843++;
        if (arg0 != -7635) {
            field4833 = (class204[][][]) ((class204[][][]) null);
        }
    }
}
