import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class227 extends class23 {

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    private int field4177 = 1024;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    private int field4182 = 2048;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    private int field4174 = 3072;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static volatile int field4185 = -1;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Ldc;")
    private static class37 field4175 = class185.method1233((byte) 86, "wave:");

    @OriginalMember(owner = "client!v", name = "L", descriptor = "Ldc;")
    public static class37 field4173 = field4175;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Ldc;")
    public static class37 field4181 = class185.method1233((byte) 86, "gleiten:");

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Ldc;")
    public static class37 field4176 = field4175;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Ldc;")
    public static class37 field4186 = class185.method1233((byte) 86, "(U(Y");

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4180;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field4178;
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (super.field398.field4303) {
            int[][] var4 = this.method159(0, (byte) -59, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            for (int var11 = 0; ~class199.field3705 < ~var11; ++var11) {
                var7[var11] = (var5[var11] * this.field4182 >> 12) + this.field4177;
                var8[var11] = this.field4177 - -(var10[var11] * this.field4182 >> 12);
                var9[var11] = (var6[var11] * this.field4182 >> 12) + this.field4177;
            }
        }
        if (arg1 != 9) {
            this.method57(46, -76);
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field407 = arg0.method215(arg2 ^ -1797813792) == 1;
                }
            } else {
                this.field4174 = arg0.method230((byte) -125);
            }
        } else {
            this.field4177 = arg0.method230((byte) -119);
        }
        ++field4183;
        if (arg2 != 1000) {
            field4173 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        this.field4182 = this.field4174 - this.field4177;
        ++field4179;
        if (arg0 != -21746) {
            field4180 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            field4173 = null;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -127);
        ++field4184;
        if (super.field405.field4114) {
            int[] var4 = this.method162(arg1, 0, (byte) 18);
            for (int var5 = 0; var5 < class199.field3705; ++var5) {
                var3[var5] = (var4[var5] * this.field4182 >> 12) + this.field4177;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
    public static void method1480(int arg0) {
        field4173 = null;
        field4175 = null;
        field4180 = null;
        field4186 = null;
        field4181 = null;
        if (arg0 != -9947) {
            field4176 = null;
        }
        field4176 = null;
    }
}
