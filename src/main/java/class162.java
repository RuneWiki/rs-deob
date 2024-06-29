import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class162 extends class51 {

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "Lea;")
    public static class38 field3369 = class9.method46((byte) 110, "jlv");

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field3370 = 0;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "Lea;")
    public static class38 field3367 = class9.method46((byte) 112, "Hidden)2");

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public static int field3376 = 0;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "[[[B")
    public static byte[][][] field3371;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBI)I")
    public static final int method1162(int arg0, byte arg1, int arg2) {
        ++field3375;
        int var3 = 0;
        while (~arg2 < -1) {
            --arg2;
            var3 = arg0 & 1 | var3 << 1;
            arg0 >>>= 1;
        }
        return arg1 != 85 ? 30 : var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3374;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int[][] var4 = this.method377(0, arg1, (byte) -120);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class86.field2008; ++var11) {
                var7[var11] = 4096 - var6[var11];
                var10[var11] = -var5[var11] + 4096;
                var9[var11] = -var8[var11] + 4096;
            }
        }
        if (arg0 <= 111) {
            field3370 = 16;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public static final void method1163(byte arg0) {
        ++field3366;
        int var1 = -93 % ((10 - arg0) / 63);
        Object var2 = class83.field1970;
        synchronized (class83.field1970) {
            if (class139.field2892 != 0) {
                class139.field2892 = 1;
                try {
                    class83.field1970.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field3368;
        if (arg0 > -125) {
            return null;
        } else {
            int[] var3 = super.field1312.method827(arg1, true);
            if (super.field1312.field2271) {
                int[] var4 = this.method376(arg1, 0, -81);
                for (int var5 = 0; class86.field2008 > var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static void method1164(byte arg0) {
        if (arg0 != -57) {
            method1164((byte) 3);
        }
        field3369 = null;
        field3371 = null;
        field3367 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field3372;
        if (arg2) {
            if (arg1 == 0) {
                super.field1289 = ~arg0.method509(122) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class162() {
        super(1, false);
    }
}
