import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class243 extends class326 {

    @OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
    private int field3232 = 0;

    @OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
    private int field3234 = 4096;

    @OriginalMember(owner = "client!fu", name = "P", descriptor = "Ldn;")
    public static class329 field3233 = new class329("stellardawn", 1);

    @OriginalMember(owner = "client!fu", name = "W", descriptor = "[I")
    public static int[] field3240 = new int[32];

    @OriginalMember(owner = "client!fu", name = "V", descriptor = "Z")
    public static boolean field3239 = false;

    @OriginalMember(owner = "client!fu", name = "X", descriptor = "Lh;")
    public static class434 field3241 = new class434(17, 2);

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!fu", name = "R", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!fu", name = "S", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!fu", name = "T", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!fu", name = "U", descriptor = "[[B")
    public static byte[][] field3238;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILbt;I)V", line = 3)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field3234 = arg1.method215((byte) 98);
            }
        } else {
            this.field3232 = arg1.method215((byte) 120);
        }
        ++field3236;
        if (arg2 > -3) {
            method1358((byte) 33);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)I", line = 41)
    public static final int method1357(int arg0, int arg1, int arg2, int arg3) {
        ++field3235;
        int var4 = arg1 / arg0;
        int var5 = arg1 & arg0 + -1;
        int var6 = arg3 / arg0;
        int var7 = arg3 & arg0 - 1;
        int var8 = class335.method1911(var6, var4, (byte) -51);
        int var9 = class335.method1911(var6, var4 + 1, (byte) -59);
        int var10 = class335.method1911(arg2 + var6, var4, (byte) 72);
        int var11 = class335.method1911(var6 + 1, var4 + 1, (byte) 67);
        int var12 = class172.method1001(var5, var8, (byte) 41, arg0, var9);
        int var13 = class172.method1001(var5, var10, (byte) 41, arg0, var11);
        return class172.method1001(var7, var12, (byte) 41, arg0, var13);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V", line = 129)
    public class243() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BI)[I", line = 77)
    public final int[] method30(byte arg0, int arg1) {
        ++field3231;
        int[] var3 = super.field4344.method130(arg1, 97);
        if (arg0 >= -6) {
            this.field3232 = 5;
        }
        if (super.field4344.field286) {
            int[] var4 = this.method1824(0, false, arg1);
            for (int var5 = 0; var5 < class181.field2495; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field3232 && ~var6 >= ~this.field3234 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V", line = 117)
    public static void method1358(byte arg0) {
        field3241 = null;
        field3238 = null;
        field3240 = null;
        field3233 = null;
        int var1 = -69 % ((arg0 - -3) / 54);
    }
}
