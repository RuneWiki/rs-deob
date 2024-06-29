import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class177 extends class242 {

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    private int field3072 = 3072;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
    private int field3085 = 2048;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    private int field3086 = 1024;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "Lp;")
    public static class280 field3080 = class18.method140((byte) -119, "blanc:");

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "Lp;")
    public static class280 field3082 = class18.method140((byte) -120, "Sprites geladen)3");

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field3073 = 1;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "[I")
    public static int[] field3083 = new int[128];

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "Ltg;")
    public static class180 field3077;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "Ljava/awt/Image;")
    public static Image field3078;

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field3081;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field4248 = ~arg2.method189((byte) -103) == -2;
                }
            } else {
                this.field3072 = arg2.method193((byte) 77);
            }
        } else {
            this.field3086 = arg2.method193((byte) 77);
        }
        if (arg0 >= -119) {
            this.method111(84);
        }
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)V")
    public static void method1219(int arg0) {
        field3077 = null;
        if (arg0 != 2) {
            method1219(63);
        }
        field3083 = null;
        field3080 = null;
        field3078 = null;
        field3082 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            field3083 = null;
        }
        int[][] var3 = super.field4257.method917(arg1, 1);
        ++field3079;
        if (super.field4257.field2357) {
            int[][] var4 = this.method1648(26484, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class264.field4654 > var11; ++var11) {
                var8[var11] = this.field3086 - -(var5[var11] * this.field3085 >> 12);
                var9[var11] = (var6[var11] * this.field3085 >> 12) + this.field3086;
                var10[var11] = (var7[var11] * this.field3085 >> 12) + this.field3086;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int[] var3 = super.field4251.method1417((byte) 92, arg0);
        int var4 = -88 % ((arg1 - 73) / 41);
        ++field3075;
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(0, arg0, 48);
            for (int var6 = 0; ~var6 > ~class264.field4654; ++var6) {
                var3[var6] = (var5[var6] * this.field3085 >> 12) + this.field3086;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public static final void method1220(boolean arg0) {
        class8.field167.method1481(arg0);
        class120.field2137.method1481(false);
        ++field3074;
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "(I)V")
    public static final void method1221(int arg0) {
        class212.field3654.method1485((byte) -84);
        if (arg0 == 23801) {
            ++field3084;
        }
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        this.field3085 = -this.field3086 + this.field3072;
        ++field3076;
        if (arg0 <= 122) {
            this.field3085 = -30;
        }
    }
}
