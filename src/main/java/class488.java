import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class488 extends class440 {

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "Z")
    private boolean field6932 = true;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    private int field6938 = 4096;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "Ltf;")
    public static class264 field6934 = new class264(8, 4);

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method2833(int arg0, byte arg1) {
        ++field6933;
        if (~arg0 != -19 && arg0 != 20 && arg0 != 12 && ~arg0 != -18 && ~arg0 != -9) {
            if (arg0 != 3 && ~arg0 != -1007) {
                if (arg1 != 110) {
                    method2834((byte) -90);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 26)
    public static final void method2834(byte arg0) {
        class177.field2527.method1409((byte) 119);
        ++field6935;
        class592.field8363.method1409((byte) 119);
        if (arg0 != 74) {
            method2834((byte) 12);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lvg;IIB)V", line = 39)
    public static final void method2835(class49 arg0, int arg1, int arg2, byte arg3) {
        int var4 = -71 % ((arg3 - 39) / 56);
        class294.field4327 = arg1;
        class678.field9586 = arg0;
        ++field6937;
        class331.field4894 = arg2;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 55)
    public class488() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILmo;I)V", line = 59)
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field6936;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field6932 = ~arg1.method3826(false) == -2;
            }
        } else {
            this.field6938 = arg1.method3847((byte) 118);
        }
        if (arg0 != 5) {
            this.field6938 = -119;
        }
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)I", line = 96)
    public static final int method2836(int arg0) {
        ++field6931;
        if (class554.field7847 != null) {
            return 3;
        } else {
            if (arg0 != 3) {
                method2833(-98, (byte) -55);
            }
            return class271.field4088 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[[I", line = 110)
    public final int[][] method763(int arg0, int arg1) {
        ++field6939;
        if (arg0 != -5766) {
            method2833(102, (byte) 100);
        }
        int[][] var3 = super.field6417.method3769(arg1, arg0 + -20669);
        if (super.field6417.field9606) {
            int[] var4 = this.method2611(arg0 ^ -5884, class651.field9116 & arg1 - 1, 0);
            int[] var5 = this.method2611(-50, arg1, 0);
            int[] var6 = this.method2611(-125, arg1 + 1 & class651.field9116, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class549.field7715; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field6938;
                int var12 = (var5[var10 + 1 & class420.field6112] + -var5[var10 + -1 & class420.field6112]) * this.field6938;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var20 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field6932) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)V", line = 193)
    public static void method2837(int arg0) {
        if (arg0 < -77) {
            field6934 = null;
        }
    }
}
