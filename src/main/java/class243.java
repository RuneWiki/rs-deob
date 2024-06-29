import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class243 {

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public int field3308 = -1;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Z")
    public boolean field3304 = false;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public int field3314 = 64;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Z")
    public boolean field3305 = false;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public int field3313 = 2;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public int field3312 = 1;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public int field3315 = 64;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field3307 = 0;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lac;BI)V", line = 5)
    public final void method1505(class501 arg0, byte arg1, int arg2) {
        int var4 = 43 / ((arg1 - 28) / 49);
        field3309++;
        while (true) {
            int var5 = arg0.method2874((byte) -75);
            if (var5 == 0) {
                return;
            }
            this.method1507(arg0, 1, arg2, var5);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V", line = 26)
    public static final void method1506(int arg0, int arg1) {
        class54 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class37 var4 = class497.field6766[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class643.field8878; var5++) {
                    for (int var6 = 0; var6 < class335.field4511; var6++) {
                        var2 = var4.method324(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class588.field8259;
                            int var8 = var5 << class588.field8259;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class37 var10 = class497.field6766[var9];
                                if (var10 != null) {
                                    int var11 = var4.method332(var5, 1, var6) - var10.method332(var5, 1, var6);
                                    int var12 = var4.method332(var5, 1, var6 + 1) - var10.method332(var5, 1, var6 + 1);
                                    int var13 = var4.method332(var5 + 1, 1, var6 + 1) - var10.method332(var5 + 1, 1, var6 + 1);
                                    int var14 = var4.method332(var5 + 1, 1, var6) - var10.method332(var5 + 1, 1, var6);
                                    var10.method330(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lac;III)V", line = 97)
    private final void method1507(class501 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3308 = arg0.method2845(-1);
            if (this.field3308 == 65535) {
                this.field3308 = -1;
            }
        } else if (arg3 == 2) {
            this.field3314 = arg0.method2845(-1) + 1;
            this.field3315 = arg0.method2845(arg1 - 2) + 1;
        } else if (arg3 == 3) {
            arg0.method2863(arg1 + 105);
        } else if (arg3 == 4) {
            this.field3313 = arg0.method2874((byte) -75);
        } else if (arg3 == 5) {
            this.field3312 = arg0.method2874((byte) -75);
        } else if (arg3 == 6) {
            this.field3304 = true;
        } else if (arg3 == 7) {
            this.field3305 = true;
        }
        field3310++;
        if (arg1 != 1) {
            this.method1507(null, -14, 53, 8);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V", line = 176)
    public static final void method1508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3311++;
        float var5 = (float) class510.field7013 / (float) class510.field7009;
        int var6 = arg1;
        int var7 = arg0;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg2 - (arg0 - var7) / 2;
        int var9 = arg4 - (arg1 - var6) / arg3;
        class266.field3598 = class510.field7009 * var9 / var6;
        class670.field9403 = class510.field7013 - (class510.field7013 * var8 / var7);
        class255.field3490 = -1;
        class14.field152 = -1;
        class560.method3127((byte) 106);
    }
}
