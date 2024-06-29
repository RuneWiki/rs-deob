import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class199 extends class23 {

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    private int field3707 = 4096;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "Z")
    private boolean field3706 = true;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "Ldc;")
    public static class37 field3711 = class185.method1233((byte) 86, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field3712 = 100;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "Lsg;")
    public static class203 field3713 = new class203();

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "[I")
    public static int[] field3704;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "[I")
    public static int[] field3708;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
    public static void method1316(boolean arg0) {
        field3713 = null;
        field3708 = null;
        field3704 = null;
        if (!arg0) {
            field3711 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
    public static final void method1317(byte arg0, int arg1) {
        class168.field3206 = -1;
        class20.field338 = arg1;
        class168.field3206 = -1;
        class133.method924(15);
        ++field3703;
        if (arg0 > -38) {
            method1316(false);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field3710;
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (arg1 != 9) {
            field3702 = 95;
        }
        if (super.field398.field4303) {
            int[] var4 = this.method162(arg0 + -1 & class5.field44, 0, (byte) 18);
            int[] var5 = this.method162(arg0, 0, (byte) 18);
            int[] var6 = this.method162(class5.field44 & arg0 + 1, 0, (byte) 18);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~field3705 < ~var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field3707;
                int var12 = (var5[class215.field4008 & var10 - -1] - var5[class215.field4008 & var10 - 1]) * this.field3707;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                } else {
                    var20 = 0;
                    var18 = 0;
                    var19 = 0;
                }
                if (this.field3706) {
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field3709;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field3706 = arg0.method215(arg2 ^ -1797813792) == 1;
            }
        } else {
            this.field3707 = arg0.method230((byte) -119);
        }
        if (arg2 != 1000) {
            this.method40((class28) null, 93, -59);
        }
    }
}
