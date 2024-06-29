import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class373 extends class54 {

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "Lrb;")
    public static class283 field5355;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "[I")
    public static int[] field5357;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lhi;")
    public static class45 field5356;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "[B")
    private byte[] field5352;

    static {
        new class157("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field5355 = new class283(51, 8);
        field5357 = new int[1000];
        field5356 = new class45(41, 5);
        field5358 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 3)
    public static final void method2232(int arg0) {
        field5348++;
        if (arg0 != 18898) {
            field5358 = -87;
        }
        class453 var1 = null;
        try {
            class464 var2 = class346.field4985.method1199(-14340, "2", true);
            while (var2.field6699 == 0) {
                class334.method2047(1L, 0);
            }
            if (var2.field6699 == 1) {
                var1 = (class453) var2.field6695;
                byte[] var3 = new byte[(int) var1.method2660((byte) -51)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2657(var4, var3.length - var4, 13, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class410.method2403(new class319(var3), false);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2659(-1);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 52)
    public class373() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)I", line = 55)
    public static int method2233(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIB)V", line = 64)
    public final void method351(int arg0, int arg1, byte arg2) {
        if (arg0 != 264949441) {
            field5357 = null;
        }
        field5354++;
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field5352[var10001] = var4;
        this.field5352[var6] = var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Z", line = 80)
    public static final boolean method2234(int arg0, int arg1, int arg2) {
        if (arg2 != -27219) {
            method2235(70);
        }
        field5353++;
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V", line = 91)
    public static void method2235(int arg0) {
        if (arg0 == 0) {
            field5356 = null;
            field5357 = null;
            field5355 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILdk;)Lkt;", line = 104)
    public static final class61 method2236(int arg0, int arg1, class421 arg2) {
        field5350++;
        byte[] var3 = arg2.method2496(arg1, -12);
        if (var3 == null) {
            return null;
        } else if (arg0 < 75) {
            return null;
        } else {
            return new class61(var3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V", line = 121)
    public static final void method2237(int arg0) {
        field5347++;
        class521.field7643.method3143(true);
        for (class440 var1 = (class440) class391.field5638.method3137(0); var1 != null; var1 = (class440) class391.field5638.method3132(arg0 + 10946)) {
            if (var1.field6337 < 1000) {
                var1.method2791((byte) 112);
                class521.field7643.method3139(0, var1);
            }
        }
        class521.field7643.method3140(class391.field5638, (byte) 0);
        int var2 = -1;
        if (arg0 != -10946) {
            field5356 = null;
        }
        class97 var3 = (class97) class14.field148.method3137(0);
        if (var3 != null) {
            var2 = var3.method777(arg0 ^ 0x2AB3);
        }
        if (!class526.field7677) {
            if (var2 == 0 && (class419.field6074 == 1 && class527.field7690 > 2 || class248.method1485((byte) 49))) {
                var2 = 2;
            }
            if (var2 == 2 && class527.field7690 > 0 && var3 != null) {
                if (class294.field3967 == null && class123.field1909 == 0) {
                    class151.method1094(23053, var3.method778(arg0 ^ 0x3483), var3.method779((byte) -53));
                } else {
                    class202.field2931 = 2;
                }
            }
            if (var2 == 0 && class527.field7690 > 0) {
                class79.method610(256);
            }
            if (class294.field3967 == null && class123.field1909 == 0) {
                class366.field5256 = null;
                class202.field2931 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class113.field1820.method55((byte) -37);
            int var5 = class113.field1820.method62((byte) 74);
            if ((class110.field1797 - 10) > var4 || var4 > (class110.field1797 + class72.field1031 + 10) || var5 < (class27.field371 - 10) || var5 > class334.field4880 + class27.field371 + 10) {
                class140.method985((byte) -96);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class110.field1797;
        int var7 = class27.field371;
        int var8 = class72.field1031;
        int var9 = var3.method778(arg0 + 3199);
        int var10 = var3.method779((byte) 107);
        int var11 = -1;
        for (int var12 = 0; var12 < class527.field7690; var12++) {
            if (class170.field2591) {
                int var17 = var7 - (-(class527.field7690 - var12 - 1) * 16 - 33);
                if (var9 > var6 && var9 < var6 + var8 && var10 > (var17 - 13) && var17 + 4 > var10) {
                    var11 = var12;
                }
            } else {
                int var16 = var7 + ((class527.field7690 + -1 + -var12) * 16) + 31;
                if (var6 < var9 && var9 < (var6 + var8) && var10 > var16 - 13 && (var16 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class58 var14 = new class58(class391.field5638);
            for (class440 var15 = (class440) var14.method379((byte) -128); var15 != null; var15 = (class440) var14.method378(124)) {
                if (var11 == var13) {
                    class304.method1755((byte) 84, var15, var10, var9);
                }
                var13++;
            }
        }
        class140.method985((byte) 0);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V", line = 282)
    public static final void method2238(int arg0, int arg1, int arg2) {
        field5351++;
        if (arg1 != 0) {
            method2236(9, -17, null);
        }
        if (class308.field4192 == class152.field2343) {
            if (!class398.method2357(arg1, arg0, 0, -2, 1, arg2, 0, 1, false)) {
                class398.method2357(0, arg0, 0, -3, 1, arg2, 0, 1, false);
            }
        } else if (!class398.method2357(arg1, arg0, 0, -3, 1, arg2, 0, 1, false)) {
            class398.method2357(0, arg0, 0, -2, 1, arg2, 0, 1, false);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIB)[B", line = 317)
    public final byte[] method2239(int arg0, int arg1, int arg2, byte arg3) {
        this.field5352 = new byte[arg0 * arg2 * arg1 * 2];
        int var5 = -114 % ((22 - arg3) / 63);
        field5349++;
        this.method2431(1709506092, arg2, arg1, arg0);
        return this.field5352;
    }
}
