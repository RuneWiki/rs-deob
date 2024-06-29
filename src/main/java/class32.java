import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 extends class227 {

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "Ljc;")
    public static class305 field321 = new class305("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "Ljc;")
    public static class305 field328 = new class305("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    public static int field332 = 1403;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "[I")
    public static int[] field330 = new int[13];

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "Lfo;")
    public static class361 field333;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field331;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "[[Z")
    public static boolean[][] field327;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field323;
        int[][] var3 = super.field3059.method28((byte) 103, arg0);
        if (!arg1) {
            field333 = null;
        }
        if (super.field3059.field57) {
            int[][] var4 = this.method1460(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class446.field6486 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field322;
        if (arg1 != 487215116) {
            field330 = null;
        }
        if (arg2 == 0) {
            super.field3066 = arg0.method2388((byte) -117) == 1;
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(III)I")
    public static final int method179(int arg0, int arg1, int arg2) {
        ++field325;
        int var3 = 1;
        while (arg0 > 1) {
            if (~(1 & arg0) != -1) {
                var3 = arg1 * var3;
            }
            arg0 >>= 1;
            arg1 *= arg1;
        }
        if (~arg0 == -2) {
            return arg1 * var3;
        } else {
            if (arg2 != -13664) {
                method182(-77);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(IB)V")
    public static final void method180(int arg0, byte arg1) {
        ++field326;
        class247.field3258 = arg0;
        class509 var2 = class415.field5946;
        synchronized (class415.field5946) {
            class415.field5946.method3045(48);
        }
        if (arg1 <= -34) {
            class509 var3 = class528.field7748;
            synchronized (class528.field7748) {
                class528.field7748.method3045(48);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "(I)V")
    public static void method181(int arg0) {
        field328 = null;
        field330 = null;
        int var1 = 117 % ((arg0 - -76) / 45);
        field333 = null;
        field331 = null;
        field321 = null;
        field327 = null;
    }

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "(I)V")
    public static final void method182(int arg0) {
        if (class169.field2189 == null || class143.field1906 == null) {
            class169.field2189 = new int[256];
            class143.field1906 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class169.field2189[var1] = (int) (4096.0D * Math.sin(var2));
                class143.field1906[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        ++field324;
        if (arg0 <= 105) {
            method179(101, 74, 97);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field329;
        if (arg0 != 15811) {
            this.method112(-109, false);
        }
        int[] var3 = super.field3068.method1970(arg1, (byte) 32);
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1, -120, 0);
            for (int var5 = 0; class446.field6486 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }
}
