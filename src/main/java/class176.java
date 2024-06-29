import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class176 extends class135 {

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lqj;")
    private static class196 field2969 = class80.method502("wave:", -48);

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Lqj;")
    public static class196 field2966 = class80.method502(" )2> ", -48);

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "Lqj;")
    public static class196 field2971 = field2969;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "Lqj;")
    public static class196 field2965 = field2969;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2975 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field2975 = null;
        field2971 = null;
        field2965 = null;
        field2969 = null;
        if (arg0 != 32768) {
            method1149(-25);
        }
        field2966 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLbk;)V")
    private static final void method1147(boolean arg0, class136 arg1) {
        class72.field1041 = class243.method1658(-86, arg1, class244.field4350);
        class44.field517 = new int[256];
        for (int var2 = 0; var2 < 3; ++var2) {
            float var4 = (float) ((class177.field2988[var2] & 16711680) >> 16);
            int var5 = class177.field2988[var2 + 1] >> 16 & 255;
            float var6 = ((float) var5 + -var4) / 64.0F;
            float var7 = (float) ((65280 & class177.field2988[var2]) >> 8);
            int var8 = (65280 & class177.field2988[var2 + 1]) >> 8;
            float var9 = ((float) var8 + -var7) / 64.0F;
            float var10 = (float) (class177.field2988[var2] & 255);
            int var11 = class177.field2988[var2 + 1] & 255;
            float var12 = ((float) var11 + -var10) / 64.0F;
            for (int var13 = 0; var13 < 64; ++var13) {
                class44.field517[var2 * 64 - -var13] = class1.method6((int) var10, class1.method6((int) var4 << 16, (int) var7 << 8));
                var4 += var6;
                var7 += var9;
                var10 += var12;
            }
        }
        if (!arg0) {
            for (int var3 = 192; var3 < 255; ++var3) {
                class44.field517[var3] = class177.field2988[3];
            }
            class199.field3538 = new int[32768];
            class101.field1451 = new int[32768];
            ++field2974;
            class137.method858((class68) null, (byte) 65);
            class46.field553 = new int[32768];
            class168.field2832 = new int[32768];
            class87.field1285 = new class233(128, 254);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class176() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(III)I")
    private final int method1148(int arg0, int arg1, int arg2) {
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        if (arg0 != 16711680) {
            this.method1148(-48, 114, 4);
        }
        ++field2964;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
    public static final int method1149(int arg0) {
        class9.field103 = class120.field1731;
        class159.method1003(-121, false);
        ++field2973;
        class166.method1074(100);
        class158.method995(29288, class9.field103);
        class102.field1477 = new class134();
        class102.field1477.field2081 = 3000;
        class102.field1477.field2085 = 3000;
        if (arg0 != 25052) {
            field2975 = null;
        }
        method1147(false, class196.field3439);
        return 10;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            field2970 = 47;
        }
        ++field2972;
        int[] var3 = super.field1954.method110(arg0, 60);
        if (super.field1954.field244) {
            int var4 = class123.field1756[arg0];
            for (int var5 = 0; class131.field1862 > var5; ++var5) {
                var3[var5] = this.method1148(16711680, var4, class82.field1189[var5]) % 4096;
            }
        }
        return var3;
    }
}
