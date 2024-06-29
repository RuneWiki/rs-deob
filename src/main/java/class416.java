import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class416 {

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Leda;")
    private class14 field6107 = new class14(128);

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "Leda;")
    public class14 field6121 = new class14(64);

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "Lla;")
    public class422 field6115;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "Lla;")
    private class422 field6119;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field6108 = 0;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field6106 = 0;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "F")
    public static float field6111;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Lwha;")
    public static class340 field6114;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "Lkca;")
    public static class756 field6122;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Lre;", line = 3)
    public final class277 method2550(int arg0, int arg1) {
        field6110++;
        class14 var3 = this.field6107;
        class277 var4;
        synchronized (this.field6107) {
            var4 = (class277) this.field6107.method80((byte) -76, (long) arg0);
            int var5 = -56 / ((48 - arg1) / 59);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var6 = this.field6119;
        byte[] var7;
        synchronized (this.field6119) {
            var7 = this.field6119.method2624(0, 36, arg0);
        }
        class277 var8 = new class277();
        var8.field4206 = this;
        var8.field4251 = arg0;
        if (var7 != null) {
            var8.method1809((byte) 62, new class301(var7));
        }
        var8.method1810((byte) 49);
        class14 var9 = this.field6107;
        synchronized (this.field6107) {
            this.field6107.method67((long) arg0, var8, -6772);
            return var8;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 35)
    public static void method2551(int arg0) {
        field6114 = null;
        field6122 = null;
        if (arg0 != 22976) {
            field6108 = 33;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V", line = 50)
    public final void method2552(int arg0, int arg1) {
        field6117++;
        class14 var3 = this.field6107;
        synchronized (this.field6107) {
            this.field6107.method68(-16878, arg1);
        }
        class14 var4 = this.field6121;
        synchronized (this.field6121) {
            this.field6121.method68(arg0 - 16878, arg1);
        }
        if (arg0 != 0) {
            method2559(-102, (byte) -89, 78, -39, 14, -94, -50);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([BI)V", line = 67)
    public static final void method2553(byte[] arg0, int arg1) {
        field6112++;
        if (arg1 != -8942) {
            return;
        }
        class301 var2 = new class301(arg0);
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method1987(arg1 + 8897);
                if (var4 == 0) {
                    if (var3) {
                        return;
                    }
                    if (class75.field1109 == null) {
                        class75.field1109 = new int[4];
                        class54.field852 = 4;
                        class455.field6628 = new int[4];
                    }
                    for (int var5 = 0; var5 < class75.field1109.length; var5++) {
                        class75.field1109[var5] = 0;
                        class455.field6628[var5] = var5 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class75.field1109 == null) {
                        class455.field6628 = new int[4];
                        class54.field852 = 4;
                        class75.field1109 = new int[4];
                    }
                    for (int var6 = 0; var6 < class75.field1109.length; var6++) {
                        class75.field1109[var6] = var2.method1977((byte) 3);
                        class455.field6628[var6] = var2.method1977((byte) 110);
                    }
                    var3 = true;
                } else if (var4 == 2) {
                    class430.field6288 = var2.method1989((byte) -37);
                } else if (var4 == 3) {
                    class54.field852 = var2.method1987(-74);
                    class75.field1109 = new int[class54.field852];
                    class455.field6628 = new int[class54.field852];
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V", line = 153)
    public final void method2554(byte arg0) {
        if (arg0 != 34) {
            this.method2557(-91, 123, 50);
        }
        field6120++;
        class14 var2 = this.field6107;
        synchronized (this.field6107) {
            this.field6107.method71((byte) 44);
        }
        class14 var3 = this.field6121;
        synchronized (this.field6121) {
            this.field6121.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)Z", line = 169)
    public static final boolean method2555(int arg0, byte arg1) {
        if (arg1 == 78) {
            field6109++;
            return arg0 == 2 || arg0 == 3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 180)
    public final void method2556(int arg0) {
        field6105++;
        class14 var2 = this.field6107;
        synchronized (this.field6107) {
            this.field6107.method76(121);
        }
        if (arg0 > -110) {
            method2553(null, -85);
        }
        class14 var3 = this.field6121;
        synchronized (this.field6121) {
            this.field6121.method76(-110);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)V", line = 207)
    public final void method2557(int arg0, int arg1, int arg2) {
        this.field6107 = new class14(arg2);
        field6113++;
        this.field6121 = new class14(arg0);
        if (arg1 != 36) {
            method2551(55);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BIFII[BFIFFIIFLifa;)V", line = 226)
    public static final void method2558(byte arg0, int arg1, float arg2, int arg3, int arg4, byte[] arg5, float arg6, int arg7, float arg8, float arg9, int arg10, int arg11, float arg12, class411 arg13) {
        field6118++;
        int var14 = arg3 * arg7;
        float[] var15 = new float[var14];
        if (arg0 <= 70) {
            field6104 = 60;
        }
        for (int var16 = 0; var16 < arg1; var16++) {
            arg13.method2530(arg2 / (float) arg3, arg9 * 127.0F, 0, arg7, var15, arg11, arg12 / (float) arg7, arg3, arg10, arg6 / (float) arg11, -88);
            int var19 = arg4;
            arg6 *= 2.0F;
            arg12 *= 2.0F;
            arg9 = arg8 * arg9;
            arg2 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg5[var19] = (byte) ((int) ((float) arg5[var19] + var15[var20]));
                var19++;
            }
        }
        int var17 = arg4;
        for (int var18 = 0; var18 < var14; var18++) {
            arg5[var17] = (byte) (arg5[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lcr;ILla;Lla;)V", line = 303)
    public class416(class292 arg0, int arg1, class422 arg2, class422 arg3) {
        this.field6115 = arg3;
        this.field6119 = arg2;
        this.field6119.method2615(0, 36);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBIIIII)V", line = 287)
    public static final void method2559(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 - arg6 >= class184.field3102 && class657.field9347 >= (arg5 + arg6) && class76.field1126 <= (arg0 - arg6) && (arg0 + arg6) <= class461.field6699) {
            class83.method737(arg6, arg0, false, arg4, arg2, arg3, arg5);
        } else {
            class521.method3105(arg3, arg0, arg4, arg2, arg5, arg6, 30758);
        }
        if (arg1 > -111) {
            method2559(96, (byte) -38, -107, 30, 86, -85, -98);
        }
        field6116++;
    }
}
