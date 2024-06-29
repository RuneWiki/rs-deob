import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class45 extends class354 {

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "J")
    public static long field644 = -1L;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "[I")
    public static int[] field648 = new int[13];

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lnj;II)V", line = 3)
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field643;
        if (arg2 != 1638) {
            this.method270((byte) -120, 97);
        }
        if (arg1 == 0) {
            super.field5466 = arg0.method1087(false) == 1;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ)Z", line = 21)
    public static final boolean method352(int arg0, boolean arg1) {
        ++field645;
        boolean var2 = class400.field6090.method823();
        int var3 = 32 % ((arg0 - 42) / 48);
        if (arg1 != var2) {
            if (arg1) {
                if (!class400.field6090.method771()) {
                    arg1 = false;
                }
            } else {
                class400.field6090.method845();
            }
            if (!var2 == arg1) {
                class203.field2716.field1149 = arg1;
                class203.field2716.method20(class312.field4572, 1);
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 57)
    public class45() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "(I)V", line = 63)
    public static void method353(int arg0) {
        field648 = null;
        if (arg0 != 4096) {
            method355(120, 31, -10, 91, false, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)[[I", line = 73)
    public final int[][] method354(int arg0, byte arg1) {
        ++field647;
        int var3 = -23 / ((arg1 - 48) / 60);
        int[][] var4 = super.field5474.method2414((byte) -105, arg0);
        if (super.field5474.field5870) {
            int[][] var5 = this.method2274((byte) 84, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class531.field7814 > var12; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var10[var12] = 4096 - var7[var12];
                var11[var12] = 4096 - var8[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(BI)[I", line = 118)
    public final int[] method270(byte arg0, int arg1) {
        ++field642;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (arg0 >= -74) {
            field648 = null;
        }
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 98, 0, arg1);
            for (int var5 = 0; var5 < class531.field7814; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIZB)V", line = 154)
    public static final void method355(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        ++field646;
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg3);
        class94 var8 = (class94) class294.field4294.method1747(var6, false);
        if (arg5 >= 16) {
            if (var8 == null) {
                var8 = new class94();
                class294.field4294.method1751(var6, -91, var8);
            }
            if (~var8.field1373.length >= ~arg2) {
                int[] var9 = new int[arg2 + 1];
                int[] var10 = new int[arg2 + 1];
                for (int var11 = 0; var8.field1373.length > var11; ++var11) {
                    var9[var11] = var8.field1373[var11];
                    var10[var11] = var8.field1377[var11];
                }
                for (int var12 = var8.field1373.length; ~var12 > ~arg2; ++var12) {
                    var9[var12] = -1;
                    var10[var12] = 0;
                }
                var8.field1373 = var9;
                var8.field1377 = var10;
            }
            var8.field1373[arg2] = arg0;
            var8.field1377[arg2] = arg1;
        }
    }
}
