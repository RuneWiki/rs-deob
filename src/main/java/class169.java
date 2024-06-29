import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class169 extends class297 {

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    private int field2725 = 4096;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "Z")
    private boolean field2726 = true;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "[I")
    public static int[] field2720 = new int[32];

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V", line = 4)
    public static final void method1261(int arg0) {
        field2728++;
        if (arg0 != -1 || class78.field1222) {
            return;
        }
        class78.field1222 = true;
        class6.field134 = true;
        if (class126.field2018) {
            class86.field1388 = (float) ((int) class86.field1388 - 17 & 0xFFFFFFF0);
        } else {
            class104.field1712 += (-class104.field1712 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILaj;I)V", line = 31)
    public static final void method1262(int arg0, class1 arg1, int arg2) {
        field2727++;
        if (arg0 != 24858 || class63.field928 == null) {
            return;
        }
        try {
            class63.field928.method430(0L, (byte) 106);
            class63.field928.method427((byte) 127, 24, arg1.field34, arg2);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILaj;)V", line = 64)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field2725 = arg2.method56(19612);
        } else if (arg0 == 1) {
            this.field2726 = arg2.method15((byte) -106) == 1;
        }
        if (arg1 != 255) {
            method1264(-119);
        }
        field2724++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Z", line = 93)
    public static final boolean method1263(int arg0, int arg1) {
        class141.field2275 = true;
        field2721++;
        class303.field4834 = arg1 + 1 & arg0;
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 127)
    public class169() {
        super(1, false);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2720[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)V", line = 118)
    public static void method1264(int arg0) {
        if (arg0 < -127) {
            field2720 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[[I", line = 133)
    public final int[][] method172(int arg0, byte arg1) {
        if (arg1 != 63) {
            field2723 = 36;
        }
        field2722++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[] var4 = this.method2109(class175.field2801 & arg0 - 1, (byte) 104, 0);
            int[] var5 = this.method2109(arg0, (byte) 29, 0);
            int[] var6 = this.method2109(class175.field2801 & arg0 + 1, (byte) 42, 0);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            for (int var10 = 0; var10 < class31.field491; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2725;
                int var12 = (var5[var10 + 1 & class257.field3813] - var5[var10 - 1 & class257.field3813]) * this.field2725;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                }
                if (this.field2726) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var9[var10] = var19;
                var8[var10] = var20;
                var7[var10] = var18;
            }
        }
        return var3;
    }
}
