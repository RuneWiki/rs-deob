import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class321 extends class285 {

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field4975 = 0;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "S")
    public static short field4979 = 256;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field4980 = 0;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Z")
    public static boolean field4974 = false;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 3)
    public class321() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)[[I", line = 10)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 <= 121) {
            field4980 = 117;
        }
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class287.field4599; var7++) {
                this.method2256(-86, var7, arg1);
                int[][] var8 = this.method2053((byte) -75, 0, class50.field714);
                var4[var7] = var8[0][class201.field3271];
                var5[var7] = var8[1][class201.field3271];
                var6[var7] = var8[2][class201.field3271];
            }
        }
        field4981++;
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V", line = 48)
    private final void method2256(int arg0, int arg1, int arg2) {
        field4978++;
        int var4 = class27.field382[arg2];
        int var5 = class48.field669[arg1];
        int var6 = -61 / ((arg0 + 6) / 36);
        float var7 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 - 2048));
        if ((double) var7 >= -3.141592653589793D && (double) var7 <= -2.356194490192345D) {
            class201.field3271 = arg1;
            class50.field714 = arg2;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class201.field3271 = arg2;
            class50.field714 = arg1;
        } else if (-0.7853981633974483D >= (double) var7 && (double) var7 >= -1.5707963267948966D) {
            class201.field3271 = class287.field4599 - arg2;
            class50.field714 = arg1;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class50.field714 = class27.field372 - arg2;
            class201.field3271 = arg1;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class201.field3271 = class287.field4599 - arg1;
            class50.field714 = class27.field372 - arg2;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class201.field3271 = class287.field4599 - arg2;
            class50.field714 = class27.field372 - arg1;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class201.field3271 = arg2;
            class50.field714 = class27.field372 - arg1;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class50.field714 = arg2;
            class201.field3271 = class287.field4599 - arg1;
        }
        class201.field3271 &= class112.field1717;
        class50.field714 &= class32.field432;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLjj;I)V", line = 121)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4572 = arg1.method286((byte) -88) == 1;
        }
        field4982++;
        if (!arg0) {
            field4979 = -105;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)[I", line = 137)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            this.method62((byte) -106, -119);
        }
        field4976++;
        int[] var3 = this.field4573.method1116(112, arg1);
        if (this.field4573.field2420) {
            for (int var4 = 0; var4 < class287.field4599; var4++) {
                this.method2256(-67, var4, arg1);
                int[] var5 = this.method2048(0, (byte) 126, class50.field714);
                var3[var4] = var5[class201.field3271];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V", line = 184)
    public static final void method2257(byte arg0) {
        if (arg0 != -31) {
            field4979 = -46;
        }
        class36.field478.method707(0);
        field4977++;
    }
}
