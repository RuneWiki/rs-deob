import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class566 extends class328 {

    @OriginalMember(owner = "client!vs", name = "H", descriptor = "I")
    private int field8094 = 32768;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "Liu;")
    public static class517 field8092 = new class517(96, 19);

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!vs", name = "I", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!vs", name = "J", descriptor = "Lgp;")
    public static class561 field8096;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "Ljava/awt/Image;")
    public static Image field8088;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method4(int arg0, int arg1) {
        ++field8091;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = 9 % ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(1, arg0, (byte) 119);
            int[] var6 = this.method2042(2, arg0, (byte) 119);
            for (int var7 = 0; var7 < class449.field6539; ++var7) {
                int var8 = (4091 & var5[var7]) >> 4;
                int var9 = var6[var7] * this.field8094 >> 12;
                int var10 = class38.field514[var8] * var9 >> 12;
                int var11 = class306.field4403[var8] * var9 >> 12;
                int var12 = class108.field1799 & (var10 >> 12) + var7;
                int var13 = arg0 - -(var11 >> 12) & class589.field8379;
                int[] var14 = this.method2042(0, var13, (byte) 119);
                var3[var7] = var14[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BILco;)V", line = 52)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field8093;
        if (arg0 < 75) {
            field8088 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field4728 = arg2.method1738(255) == 1;
            }
        } else {
            this.field8094 = arg2.method1745(32132) << 4;
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V", line = 88)
    public class566() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)[[I", line = 92)
    public final int[][] method7(int arg0, int arg1) {
        ++field8089;
        int var3 = 95 % ((46 - arg1) / 54);
        int[][] var4 = super.field4725.method1886((byte) -84, arg0);
        if (super.field4725.field4371) {
            int[] var5 = this.method2042(1, arg0, (byte) 119);
            int[] var6 = this.method2042(2, arg0, (byte) 119);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; class449.field6539 > var10; ++var10) {
                int var11 = (1046233 & var5[var10] * 255) >> 12;
                int var12 = var6[var10] * this.field8094 >> 12;
                int var13 = class38.field514[var11] * var12 >> 12;
                int var14 = class306.field4403[var11] * var12 >> 12;
                int var15 = var10 - -(var13 >> 12) & class108.field1799;
                int var16 = class589.field8379 & arg0 - -(var14 >> 12);
                int[][] var17 = this.method2040(0, var16, 0);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "(I)V", line = 149)
    public static final void method3218(int arg0) {
        ++field8090;
        if (class64.field893 != 8) {
            if (class64.field893 != 4 && ~class64.field893 != -6) {
                if (class64.field893 == 11) {
                    class307.method1904(true, 2);
                }
            } else {
                class307.method1904(true, 2);
            }
        } else {
            class307.method1904(true, 4);
        }
        int var1 = -22 % ((44 - arg0) / 40);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 176)
    public final void method2(int arg0) {
        if (arg0 > -97) {
            field8096 = null;
        }
        ++field8095;
        class83.method761(true);
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)V", line = 187)
    public static void method3219(byte arg0) {
        field8096 = null;
        field8088 = null;
        if (arg0 >= -109) {
            field8092 = null;
        }
        field8092 = null;
    }
}
