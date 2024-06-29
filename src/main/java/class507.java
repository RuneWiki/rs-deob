import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class507 extends class466 {

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field7088 = new String[100];

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
    public static int field7090 = 0;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "Lan;")
    public static class21 field7092;

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
    public class507() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
    public static final void method2935(int arg0) {
        class489.field6847 = 0;
        ++field7087;
        boolean var1 = class343.field4627.method96(false) == 1;
        int var2 = class343.field4627.method93((byte) 80);
        if (arg0 == -419201343) {
            int var3 = class343.field4627.method93((byte) 112);
            int var4 = class343.field4627.method110((byte) 89);
            class222.method1424(-105);
            class562.method3206(var4, true);
            int var5 = (class403.field5730 - class343.field4627.field165) / 16;
            class619.field8864 = new int[var5][4];
            for (int var6 = 0; var6 < var5; ++var6) {
                for (int var10 = 0; var10 < 4; ++var10) {
                    class619.field8864[var6][var10] = class343.field4627.method119(arg0 + 419201270);
                }
            }
            class183.field2585 = new int[var5];
            class219.field3132 = new byte[var5][];
            class356.field4799 = new int[var5];
            class94.field1452 = new byte[var5][];
            class324.field4371 = new byte[var5][];
            class261.field3629 = null;
            class14.field198 = new int[var5];
            class525.field7381 = null;
            class493.field6909 = new byte[var5][];
            class270.field3765 = new int[var5];
            class633.field9252 = new int[var5];
            int var7 = 0;
            for (int var8 = (-(class32.field513 >> 4) + var3) / 8; (var3 - -(class32.field513 >> 4)) / 8 >= var8; ++var8) {
                for (int var9 = (-(class611.field8786 >> 4) + var2) / 8; ~var9 >= ~(((class611.field8786 >> 4) + var2) / 8); ++var9) {
                    class183.field2585[var7] = (var8 << 8) - -var9;
                    class356.field4799[var7] = class23.field346.method252((byte) -106, "m" + var8 + "_" + var9);
                    class14.field198[var7] = class23.field346.method252((byte) -121, "l" + var8 + "_" + var9);
                    class633.field9252[var7] = class23.field346.method252((byte) 40, "um" + var8 + "_" + var9);
                    class270.field3765[var7] = class23.field346.method252((byte) -95, "ul" + var8 + "_" + var9);
                    ++var7;
                }
            }
            class228.method1451(var2, 10, var3, 28221, var1);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
    public static void method2936(byte arg0) {
        int var1 = -32 % ((-13 - arg0) / 44);
        field7092 = null;
        field7088 = null;
    }

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "(III)I")
    private final int method2937(int arg0, int arg1, int arg2) {
        ++field7091;
        int var4 = arg1 * 57 + arg2;
        if (arg0 != -10913) {
            return -19;
        } else {
            int var5 = var4 << 1 ^ var4;
            return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field7089;
        if (arg1 != 0) {
            field7092 = null;
        }
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (super.field6557.field1163) {
            int var4 = class63.field1085[arg0];
            for (int var5 = 0; class312.field4207 > var5; ++var5) {
                var3[var5] = this.method2937(-10913, var4, class431.field6129[var5]) % 4096;
            }
        }
        return var3;
    }
}
