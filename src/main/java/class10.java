import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class10 {

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lqu;")
    public static class219 field102 = new class219(5, 4);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lmn;")
    public static class162 field106;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLtq;)V")
    public static final void method64(boolean arg0, class276 arg1) {
        arg1.method1860((byte) -120);
        field111++;
        int var2 = class528.field7772;
        class350 var3 = class358.field5565 = class264.field4276[var2] = new class350();
        var3.field847 = var2;
        int var4 = arg1.method1852(111, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFC0A4) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field894[0] = var6 - class453.field7018;
        var3.field6417 = (var3.field894[0] << 7) + (var3.method415(-4) << 6);
        var3.field899[0] = var7 - class126.field1718;
        var3.field6410 = (var3.field899[0] << 7) + (var3.method415(-4) << 6);
        class201.field3057 = var3.field6419 = var5;
        if (class456.field7044[var2] != null) {
            var3.method2312(class456.field7044[var2], (byte) 115);
        }
        class234.field3861 = 0;
        class21.field245[class234.field3861++] = var2;
        class310.field4853[var2] = 0;
        class242.field3931 = 0;
        if (!arg0) {
            method67(113);
        }
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1852(120, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF42) >> 8;
                int var12 = var9 & 0xFF;
                class34 var13 = class460.field7103[var8] = new class34();
                var13.field346 = -1;
                var13.field349 = 0;
                var13.field348 = (var10 << 28) + (var11 << 14) + var12;
                var13.field345 = false;
                class260.field4199[class242.field3931++] = var8;
                class310.field4853[var8] = 0;
            }
        }
        arg1.method1854((byte) 96);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method65(boolean arg0) {
        field102 = null;
        if (arg0) {
            method67(-102);
        }
        field106 = null;
    }

    @OriginalMember(owner = "client!cg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field110++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILl;ILza;BI)V")
    public static final void method66(int arg0, int arg1, class199 arg2, int arg3, class497 arg4, byte arg5, int arg6) {
        if (class213.field3643 < 100) {
            class330.method2209(arg4, arg2, 64);
        }
        field109++;
        arg4.method1307(arg3, arg6, arg0 + arg3, arg6 - -arg1);
        if (class213.field3643 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg3;
            int var9 = arg6 + (arg1 / 2) - var7 - 18;
            arg4.method1260(arg3, arg6, arg0, arg1, -16777216, 0);
            arg4.method1284(var8 - 152, var9, 304, 34, class425.field6441[class293.field4626].getRGB(), 0);
            arg4.method1260(var8 - 150, var9 - -2, class213.field3643 * 3, 30, class243.field3944[class293.field4626].getRGB(), 0);
            class289.field4571.method2006(class50.field633.method1583(92, class12.field131), var8, var9 + var7, class387.field5908[class293.field4626].getRGB(), true, -1);
            return;
        }
        int var10 = class201.field3060 - ((int) ((float) arg0 / class194.field2877));
        int var11 = (int) ((float) arg1 / class194.field2877) + class297.field4679;
        if (arg5 != 98) {
            return;
        }
        int var12 = (int) ((float) arg0 / class194.field2877) + class201.field3060;
        class291.field4595 = class297.field4679 - ((int) ((float) arg1 / class194.field2877));
        class325.field5109 = (int) ((float) (arg1 * 2) / class194.field2877);
        int var13 = class297.field4679 - ((int) ((float) arg1 / class194.field2877));
        class331.field5189 = (int) ((float) (arg0 * 2) / class194.field2877);
        class336.field5254 = class201.field3060 - (int) ((float) arg0 / class194.field2877);
        class194.method1224(class194.field2883 + var10, class194.field2900 + var11, var12 + class194.field2883, var13 - -class194.field2900, arg3, arg6, arg0 + arg3, arg1 + arg6 - -1);
        class194.method1216(arg4);
        class317 var14 = class194.method1219(arg4);
        class1.method2((byte) -107, arg4, 0, var14, 0);
        if (class52.field707 > 0) {
            class388.field5920--;
            if (class388.field5920 == 0) {
                class388.field5920 = 20;
                class52.field707--;
            }
        }
        if (!class150.field2014) {
            return;
        }
        int var15 = arg3 + arg0 - 5;
        int var16 = arg1 + arg6 - 8;
        class128.field1741.method2005(16776960, (byte) 25, var15, -1, var16, "Fps:" + class305.field4800);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class128.field1741.method2005(var19, (byte) 25, var15, -1, var20, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method67(int arg0) {
        field104++;
        if (arg0 != 2) {
            return null;
        }
        String var1 = "www";
        if (class209.field3228 == class180.field2622) {
            var1 = "www-wtrc";
        } else if (class209.field3228 == class193.field2858) {
            var1 = "www-wtqa";
        } else if (class257.field4151 == class209.field3228) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class77.field1153 != null) {
            var2 = "/p=" + class77.field1153;
        }
        return "http://" + var1 + "." + class516.field7674.field3877 + ".com/l=" + class12.field131 + "/a=" + class348.field5403 + var2 + "/";
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIII)V")
    public class10(int arg0, int arg1, int arg2, int arg3) {
        this.field108 = arg2;
        this.field105 = arg3;
        this.field107 = arg0;
        this.field112 = arg1;
    }
}
