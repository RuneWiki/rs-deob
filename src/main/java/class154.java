import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class154 {

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public int field2646 = -1;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[I")
    private int[] field2640 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Z")
    public boolean field2653 = false;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field2652 = -1;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2637 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2634 = 3353893;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2644 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Le;")
    public static class191 field2654 = class54.method368("settings=", 2047);

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Lwa;")
    public static class226 field2655;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    private int[] field2632;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[I")
    public static int[] field2642;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[S")
    private short[] field2633;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[S")
    private short[] field2638;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[S")
    private short[] field2639;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[S")
    private short[] field2647;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)Z")
    public final boolean method1041(boolean arg0) {
        field2649++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0) {
            method1042(true);
        }
        while (var3 < 5) {
            if (this.field2640[var3] != -1 && !class271.field4782.method801(0, this.field2640[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V")
    public static void method1042(boolean arg0) {
        field2644 = null;
        field2654 = null;
        field2655 = null;
        field2642 = null;
        if (!arg0) {
            method1047((class121) null, (byte) -69, 25);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Laf;BII)V")
    public static final void method1043(class156 arg0, byte arg1, int arg2, int arg3) {
        if (arg0.field3019 == arg2 && arg2 != -1) {
            class248 var4 = class67.method445((byte) -61, arg2);
            int var5 = var4.field4407;
            if (var5 == 1) {
                arg0.field3016 = arg3;
                arg0.field2957 = 0;
                arg0.field2958 = 0;
                arg0.field3020 = 0;
                class252.method1750((byte) -8, arg0.field3003, arg0.field2972, var4, false, arg0.field2958);
            }
            if (var5 == 2) {
                arg0.field2957 = 0;
            }
        } else if (arg2 == -1 || arg0.field3019 == -1 || class67.method445((byte) -61, arg2).field4405 >= class67.method445((byte) -61, arg0.field3019).field4405) {
            arg0.field3019 = arg2;
            arg0.field3020 = 0;
            arg0.field2957 = 0;
            arg0.field3010 = arg0.field2961;
            arg0.field2958 = 0;
            arg0.field3016 = arg3;
            if (arg0.field3019 != -1) {
                class252.method1750((byte) -8, arg0.field3003, arg0.field2972, class67.method445((byte) -61, arg0.field3019), false, arg0.field2958);
            }
        }
        field2636++;
        if (arg1 != -119) {
            field2652 = 21;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Lsf;")
    public final class187 method1044(byte arg0) {
        field2650++;
        if (this.field2632 == null) {
            return null;
        }
        if (arg0 >= -3) {
            method1043((class156) null, (byte) -33, 52, 64);
        }
        class187[] var2 = new class187[this.field2632.length];
        for (int var3 = 0; var3 < this.field2632.length; var3++) {
            var2[var3] = class187.method1270(class271.field4782, this.field2632[var3], 0);
        }
        class187 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class187(var2, var2.length);
        }
        if (this.field2647 != null) {
            for (int var5 = 0; var5 < this.field2647.length; var5++) {
                var4.method1283(this.field2647[var5], this.field2633[var5]);
            }
        }
        if (this.field2639 != null) {
            for (int var6 = 0; var6 < this.field2639.length; var6++) {
                var4.method1290(this.field2639[var6], this.field2638[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILji;I)V")
    private final void method1045(int arg0, class225 arg1, int arg2) {
        if (arg2 != 0) {
            this.method1050((byte) -59);
        }
        field2643++;
        if (arg0 == 1) {
            this.field2646 = arg1.method1580(arg2 - 110);
        } else if (arg0 == 2) {
            int var8 = arg1.method1580(-20);
            this.field2632 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2632[var9] = arg1.method1593(true);
            }
        } else if (arg0 == 3) {
            this.field2653 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1580(-42);
            this.field2647 = new short[var6];
            this.field2633 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2647[var7] = (short) arg1.method1593(true);
                this.field2633[var7] = (short) arg1.method1593(true);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1580(-30);
            this.field2638 = new short[var4];
            this.field2639 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2639[var5] = (short) arg1.method1593(true);
                this.field2638[var5] = (short) arg1.method1593(true);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2640[arg0 - 60] = arg1.method1593(true);
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Lsf;")
    public final class187 method1046(int arg0) {
        field2641++;
        class187[] var2 = new class187[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2640[var4] != -1) {
                var2[var3++] = class187.method1270(class271.field4782, this.field2640[var4], 0);
            }
        }
        class187 var5 = new class187(var2, var3);
        int var6 = 127 % ((arg0 + 6) / 60);
        if (this.field2647 != null) {
            for (int var7 = 0; var7 < this.field2647.length; var7++) {
                var5.method1283(this.field2647[var7], this.field2633[var7]);
            }
        }
        if (this.field2639 != null) {
            for (int var8 = 0; var8 < this.field2639.length; var8++) {
                var5.method1290(this.field2639[var8], this.field2638[var8]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lng;BI)Lvk;")
    public static final class131 method1047(class121 arg0, byte arg1, int arg2) {
        byte[] var3 = arg0.method804(arg2, (byte) 124);
        field2645++;
        if (var3 == null) {
            return null;
        } else {
            if (arg1 > -16) {
                method1047((class121) null, (byte) -125, 97);
            }
            return new class131(var3);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(Z)V")
    public static final void method1048(boolean arg0) {
        field2635++;
        if (arg0) {
            method1043((class156) null, (byte) 54, 18, 72);
        }
        class118.field1940.method613(0);
        class252.field4471.method23(true);
        class200.field3577.method23(true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLji;)V")
    public final void method1049(byte arg0, class225 arg1) {
        if (arg0 != -18) {
            field2642 = null;
        }
        while (true) {
            int var3 = arg1.method1580(-14);
            if (var3 == 0) {
                field2648++;
                return;
            }
            this.method1045(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Z")
    public final boolean method1050(byte arg0) {
        field2651++;
        if (this.field2632 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -124) {
            return false;
        }
        for (int var3 = 0; var3 < this.field2632.length; var3++) {
            if (!class271.field4782.method801(0, this.field2632[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }
}
