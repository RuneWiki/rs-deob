import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class44 extends class573 {

    @OriginalMember(owner = "client!kaa", name = "I", descriptor = "I")
    private int field1091 = 4096;

    @OriginalMember(owner = "client!kaa", name = "J", descriptor = "Z")
    private boolean field1092 = true;

    @OriginalMember(owner = "client!kaa", name = "L", descriptor = "Llk;")
    public static class545 field1094 = null;

    @OriginalMember(owner = "client!kaa", name = "P", descriptor = "[Z")
    public static boolean[] field1098 = new boolean[200];

    @OriginalMember(owner = "client!kaa", name = "O", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!kaa", name = "Q", descriptor = "Z")
    public static boolean field1099 = false;

    @OriginalMember(owner = "client!kaa", name = "S", descriptor = "Lqfa;")
    public static class85 field1101 = new class85(44, 2);

    @OriginalMember(owner = "client!kaa", name = "K", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!kaa", name = "M", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!kaa", name = "N", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!kaa", name = "R", descriptor = "I")
    public static int field1100;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kaa", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field1102;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field1100;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field1092 = ~arg0.method732(-559537960) == -2;
            }
        } else {
            this.field1091 = arg0.method723((byte) -25);
        }
        if (arg2 != 3) {
            method572(4);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        if (arg0 > -116) {
            field1101 = null;
        }
        ++field1095;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[] var4 = this.method3292(0, 0, arg1 + -1 & class189.field3019);
            int[] var5 = this.method3292(0, 0, arg1);
            int[] var6 = this.method3292(0, 0, arg1 - -1 & class189.field3019);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class540.field7555 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1091;
                int var12 = (var5[class591.field8492 & var10 + 1] - var5[var10 + -1 & class591.field8492]) * this.field1091;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - (-var16 - 4096)) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field1092) {
                    var18 = 2048 - -(var18 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "()V")
    public class44() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)V")
    public static final void method571(boolean arg0) {
        class413.field5975 = class576.field8369;
        class78.field1569 = 0;
        ++field1096;
        class695.field9792 = 0;
        class389.field5685 = 0;
        class611.field8891 = new class185[2000];
        class649.field9365 = new class185[1000];
        if (arg0) {
            class50.field1185 = false;
            class536.field7510 = class576.field8369;
            class85.field1610 = new int[class148.field2557][class520.field7369 + 1][class107.field1852 + 1];
            class237.field3522 = new class185[500];
            class254.field3771 = 0;
            class177.field2890 = new class185[500];
            if (class521.field7381 instanceof class18) {
                class337.field5036 = false;
            } else {
                class337.field5036 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "(I)V")
    public static void method572(int arg0) {
        field1098 = null;
        if (arg0 == 2048) {
            field1094 = null;
            field1101 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "(I)V")
    public static final void method573(int arg0) {
        if (arg0 <= 55) {
            field1098 = null;
        }
        ++field1093;
        if (class604.field8775.field771) {
            class681.field9649 = 96;
        } else {
            try {
                Method var1 = (field1102 != null ? field1102 : (field1102 = method574("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class681.field9649 = 1 + (int) (var3 / 1048576L);
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method574(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
