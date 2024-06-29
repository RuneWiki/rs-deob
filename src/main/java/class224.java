import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class224 {

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Lco;")
    private class210 field3114 = new class210(16);

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Lg;")
    private class470 field3113;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Z")
    public static boolean field3100 = false;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field3102 = 255;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field3107 = -2;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "[I")
    public static int[] field3111 = new int[32];

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field3108 = -1;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lpn;")
    public static class72 field3106 = new class72(67, -1);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lre;")
    public static class388 field3110;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lgj;")
    public static class405 field3105;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lee;", line = 8)
    public final class478 method1233(int arg0, int arg1) {
        field3112++;
        if (arg0 > -28) {
            field3105 = null;
        }
        class210 var3 = this.field3114;
        class478 var4;
        synchronized (this.field3114) {
            var4 = (class478) this.field3114.method1163((byte) 123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3113.method2768(-20472, arg1, 30);
        class478 var6 = new class478();
        if (var5 != null) {
            var6.method2830(-29475, new class179(var5));
        }
        class210 var7 = this.field3114;
        synchronized (this.field3114) {
            this.field3114.method1172((long) arg1, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 50)
    public final void method1234(byte arg0) {
        field3104++;
        class210 var2 = this.field3114;
        synchronized (this.field3114) {
            if (arg0 != -16) {
                this.field3113 = null;
            }
            this.field3114.method1169(arg0 ^ 0xFFFFFBC4);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILeg;Loj;IIB)V", line = 67)
    public static final void method1235(int arg0, int arg1, class394 arg2, class280 arg3, int arg4, int arg5, byte arg6) {
        field3103++;
        if (class403.field5733 < 100) {
            class326.method1982(arg6 ^ 0x33, arg3, arg2);
        }
        arg3.method1351(arg5, arg0, arg5 + arg1, arg0 - -arg4);
        if (class403.field5733 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg5;
            int var9 = arg4 / 2 + arg0 - var7 - 18;
            arg3.method1483(arg5, arg0, arg1, arg4, -16777216, 0);
            arg3.method1459(var8 - 152, var9, 304, 34, class343.field4907[class24.field318].getRGB(), 0);
            arg3.method1483(var8 - 150, var9 - -2, class403.field5733 * 3, 30, class22.field299[class24.field318].getRGB(), 0);
            class101.field1230.method1124(class368.field5256[class24.field318].getRGB(), -1, (byte) 29, var7 + var9, var8, class357.field5160.method205((byte) 99, class68.field849));
            return;
        }
        int var10 = class486.field6898 - ((int) ((float) arg1 / class429.field6195));
        int var11 = class17.field218 + ((int) ((float) arg4 / class429.field6195));
        int var12 = class486.field6898 + ((int) ((float) arg1 / class429.field6195));
        class83.field1013 = class17.field218 - ((int) ((float) arg4 / class429.field6195));
        if (arg6 != 48) {
            method1235(96, 83, (class394) null, (class280) null, -91, 96, (byte) 38);
        }
        class247.field3481 = (int) ((float) (arg1 * 2) / class429.field6195);
        class158.field1892 = (int) ((float) (arg4 * 2) / class429.field6195);
        class344.field4924 = class486.field6898 - ((int) ((float) arg1 / class429.field6195));
        int var13 = class17.field218 - ((int) ((float) arg4 / class429.field6195));
        class429.method2564(class429.field6205 + var10, class429.field6210 + var11, class429.field6205 + var12, var13 - -class429.field6210, arg5, arg0, arg1 + arg5, arg0 - -arg4 + 1);
        class429.method2553(arg3);
        class166 var14 = class429.method2562(arg3);
        class281.method1767(52, 0, arg3, 0, var14);
        if (class401.field5720 > 0) {
            class413.field5878--;
            if (class413.field5878 == 0) {
                class401.field5720--;
                class413.field5878 = 20;
            }
        }
        if (!class327.field4709) {
            return;
        }
        int var15 = arg5 + arg1 - 5;
        int var16 = arg0 + arg4 - 8;
        class273.field3875.method1125("Fps:" + class354.field5086, var15, -1, 16776960, var16, (byte) -83);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class273.field3875.method1125("Mem:" + var18 + "k", var15, -1, var19, var20, (byte) -83);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 149)
    public final void method1236(int arg0) {
        class210 var2 = this.field3114;
        synchronized (this.field3114) {
            this.field3114.method1165((byte) 118);
            if (arg0 != -8586) {
                this.field3113 = null;
            }
        }
        field3109++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 163)
    public static void method1237(int arg0) {
        field3111 = null;
        field3105 = null;
        if (arg0 != -1) {
            method1235(101, 116, (class394) null, (class280) null, 65, 31, (byte) -110);
        }
        field3110 = null;
        field3106 = null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V", line = 176)
    public final void method1238(int arg0, int arg1) {
        field3101++;
        class210 var3 = this.field3114;
        synchronized (this.field3114) {
            this.field3114.method1166(arg1, (byte) -52);
            if (arg0 != 150) {
                field3102 = 84;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lci;ILg;)V", line = 205)
    public class224(class421 arg0, int arg1, class470 arg2) {
        this.field3113 = arg2;
        this.field3113.method2755(-124, 30);
    }
}
