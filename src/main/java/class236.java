import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class236 extends class279 {

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    private int field3912 = 8192;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    private int field3914 = 0;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    private int field3932 = 2048;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    private int field3921 = 4096;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    private int field3930 = 12288;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    private int field3933 = 0;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    private int field3913 = 2048;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field3917 = 1;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field3918 = 0;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "Ltl;")
    public static class59 field3929 = class85.method639("", 9588);

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field3922 = 0;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Lsi;")
    public static class306 field3916 = new class306();

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "[I")
    public static int[] field3925;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "[Loj;")
    public static class260[] field3915;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;III)Lda;", line = 9)
    public static final class179 method1655(Component arg0, int arg1, int arg2, int arg3) {
        field3919++;
        try {
            Class var4 = Class.forName("bk");
            class179 var5 = (class179) var4.getDeclaredConstructor().newInstance();
            if (arg2 != -2049) {
                method1655((Component) null, -16, 45, -117);
            }
            var5.method355(arg1, arg0, arg3, 105);
            return var5;
        } catch (Throwable var8) {
            class73 var7 = new class73();
            var7.method355(arg1, arg0, arg3, 97);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)[I", line = 35)
    public final int[] method44(boolean arg0, int arg1) {
        field3931++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            field3918 = -48;
        }
        if (this.field4781.field354) {
            int var4 = class71.field1104[arg1] - 2048;
            for (int var5 = 0; var5 < class56.field835; var5++) {
                int var6 = class31.field430[var5] - 2048;
                int var7 = this.field3932 + var6;
                int var8 = this.field3933 + var4;
                int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                int var10 = this.field3914 + var6;
                int var11 = var9 > 2048 ? var9 - 4096 : var9;
                int var12 = var7 < -2048 ? var7 + 4096 : var7;
                int var13 = var10 < -2048 ? var10 + 4096 : var10;
                int var14 = var13 > 2048 ? var13 - 4096 : var13;
                int var15 = var4 + this.field3913;
                int var16 = var12 <= 2048 ? var12 : var12 - 4096;
                int var17 = var15 >= -2048 ? var15 : var15 + 4096;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = this.method1658(var16, var11, (byte) 116) || this.method1657(61, var18, var14) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 225)
    public class236() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILs;)V", line = 114)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field3932 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field3933 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field3914 = arg2.method1214(-18254);
        } else if (arg1 == 3) {
            this.field3913 = arg2.method1214(-18254);
        } else if (arg1 == 4) {
            this.field3930 = arg2.method1214(-18254);
        } else if (arg1 == 5) {
            this.field3921 = arg2.method1214(-18254);
        } else if (arg1 == 6) {
            this.field3912 = arg2.method1214(-18254);
        }
        if (arg0 > -125) {
            this.field3912 = 14;
        }
        field3927++;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V", line = 175)
    public static void method1656(int arg0) {
        field3915 = null;
        field3929 = null;
        field3916 = null;
        if (arg0 < -45) {
            field3925 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 189)
    public final void method319(byte arg0) {
        field3926++;
        if (arg0 < -9) {
            class162.method1155(0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)Z", line = 210)
    private final boolean method1657(int arg0, int arg1, int arg2) {
        int var4 = (arg1 + arg2) * this.field3930 >> 12;
        field3920++;
        int var5 = 52 / ((arg0 + 37) / 37);
        int var6 = class243.field4064[var4 * 255 >> 12 & 0xFF];
        int var7 = (var6 << 12) / this.field3930;
        int var8 = (var7 << 12) / this.field3912;
        int var9 = this.field3921 * var8 >> 12;
        return arg1 - arg2 < var9 && (-var9) < (arg1 - arg2);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IIB)Z", line = 234)
    private final boolean method1658(int arg0, int arg1, byte arg2) {
        field3924++;
        if (arg2 < 104) {
            return false;
        }
        int var4 = (arg1 - arg0) * this.field3930 >> 12;
        int var5 = class243.field4064[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3930;
        int var7 = (var6 << 12) / this.field3912;
        int var8 = this.field3921 * var7 >> 12;
        return (arg0 + arg1) < var8 && (arg0 + arg1) > (-var8);
    }
}
