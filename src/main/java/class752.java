import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class752 {

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public int field10490;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    private int field10485;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "[[I")
    public static int[][] field10492 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public static int field10491 = 0;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field10484;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field10488;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V", line = 6)
    public static void method4212(int arg0) {
        if (arg0 >= 112) {
            field10492 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IZ)V", line = 17)
    public static final void method4213(int arg0, boolean arg1) {
        field10484++;
        if (class490.field6655.length() == 0) {
            return;
        }
        class710.method3991("--> " + class490.field6655, (byte) 126);
        class195.method1331(false, false, arg1, class490.field6655);
        class88.field1078 = 0;
        if (arg0 != 1354797057) {
            method4213(56, false);
        }
        class490.field6655 = "";
        class66.field824 = 0;
    }

    @OriginalMember(owner = "client!hda", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field10489++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)I", line = 45)
    public final int method4214(byte arg0) {
        if (arg0 > -13) {
            return 48;
        } else {
            field10488++;
            return this.field10485;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V", line = 57)
    public static final void method4215(int arg0, int arg1) {
        field10487++;
        class694.field9658 = arg1;
        class65 var2 = class66.field825;
        synchronized (class66.field825) {
            if (arg0 <= 114) {
                return;
            }
            class66.field825.method561((byte) -78);
        }
        class65 var3 = class600.field7880;
        synchronized (class600.field7880) {
            class600.field7880.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lha;II)V", line = 85)
    public static final void method4216(class59 arg0, int arg1, int arg2) {
        field10486++;
        if (!class499.field6715 || !class557.field7336) {
            class218.field3145 = 0;
            return;
        }
        if (class190.field2868) {
            class5.field122 = class92.field1115.method783(24111);
        }
        class324.field4600 = 0;
        class589.field7689 = 0;
        class166.field2577 = 0;
        int[] var3 = arg0.method469();
        class646.field8583 = (int) ((float) var3[2] / 3.0F);
        class228.field3255 = (int) ((float) var3[3] / 3.0F);
        arg0.method510(class520.field6937);
        if ((int) ((float) class520.field6937[0] / 3.0F) != class758.field10556 || (int) ((float) class520.field6937[1] / 3.0F) != class721.field10044) {
            class758.field10556 = (int) ((float) class520.field6937[0] / 3.0F);
            class721.field10044 = (int) ((float) class520.field6937[1] / 3.0F);
            class718.field9913 = class758.field10556 >> 1;
            class253.field3481 = new int[class758.field10556 * class721.field10044];
            class130.field2134 = class721.field10044 >> 1;
        }
        class200.field3011 = arg0.method474();
        class218.field3145 = 0;
        for (int var4 = arg2; var4 < class356.field4995; var4++) {
            class640.method3504(class332.field4730[var4], arg1, true, arg0);
        }
        for (int var5 = 0; var5 < class691.field9633; var5++) {
            class640.method3504(class550.field7257[var5], arg1, true, arg0);
        }
        for (int var6 = 0; var6 < class383.field5368; var6++) {
            class640.method3504(class247.field3434[var6], arg1, true, arg0);
        }
        class462.field6335 = 0;
        if (class218.field3145 > 0) {
            int var7 = class253.field3481.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var9 < var8) {
                class253.field3481[var9++] = Integer.MAX_VALUE;
                class253.field3481[var9++] = Integer.MAX_VALUE;
                class253.field3481[var9++] = Integer.MAX_VALUE;
                class253.field3481[var9++] = Integer.MAX_VALUE;
                class253.field3481[var9++] = Integer.MAX_VALUE;
                class253.field3481[var9++] = Integer.MAX_VALUE;
                class253.field3481[var9++] = Integer.MAX_VALUE;
                class253.field3481[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class253.field3481[var9++] = Integer.MAX_VALUE;
            }
            class159.field2398 = 1;
            for (int var10 = 0; var10 < class218.field3145; var10++) {
                class177 var11 = class44.field575[var10];
                class532.method2967(var11.field2667[1], var11.field2676[1], var11.field2662[0], -13221, var11.field2676[0], var11.field2676[3], var11.field2662[3], var11.field2662[1], var11.field2667[0], var11.field2667[3]);
                class532.method2967(var11.field2667[2], var11.field2676[2], var11.field2662[1], -13221, var11.field2676[1], var11.field2676[3], var11.field2662[3], var11.field2662[2], var11.field2667[1], var11.field2667[3]);
            }
            class159.field2398 = 2;
        }
        if (class190.field2868) {
            class412.field5721 = class92.field1115.method783(24111) - class5.field122;
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(II)V", line = 185)
    public class752(int arg0, int arg1) {
        this.field10490 = arg1;
        this.field10485 = arg0;
    }
}
