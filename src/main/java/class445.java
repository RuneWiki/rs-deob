import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class445 {

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "[[F")
    public float[][] field6608;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "[I")
    public int[] field6609;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[I")
    public int[] field6611;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
    public int[] field6606;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "J")
    public static long field6607 = -1L;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lqe;")
    public static class469 field6612 = new class469(94, -1);

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field6615 = -1;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field6614 = new Hashtable();

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method2755(int arg0) {
        if (arg0 != 18304) {
            field6607 = 91L;
        }
        field6612 = null;
        field6614 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIILd;BLha;)V")
    public static final void method2756(int arg0, int arg1, int arg2, int arg3, class151 arg4, byte arg5, class60 arg6) {
        field6610++;
        if (class735.field10311 < 100) {
            class89.method719(arg5 + 10, arg6, arg4);
        }
        arg6.method476(arg3, arg2, arg3 + arg1, arg0 + arg2);
        if (class735.field10311 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg3;
            arg6.method516(arg3, arg2, arg1, arg0, -16777216, 0);
            int var9 = arg0 / 2 + (arg2 - 18) - var7;
            arg6.method525(var8 - 152, var9, 304, 34, class742.field10410[class73.field1026].getRGB(), 0);
            arg6.method516(var8 - 150, var9 + 2, class735.field10311 * 3, 30, class13.field178[class73.field1026].getRGB(), 0);
            class298.field4225.method544(var8, class430.field6388.method2679(class650.field9160, arg5 ^ 0xFFFFFFD1), -1, (byte) -42, var7 + var9, class384.field5807[class73.field1026].getRGB());
            return;
        }
        int var10 = class633.field8862 - ((int) ((float) arg1 / class84.field1178));
        int var11 = client.field4272 + ((int) ((float) arg0 / class84.field1178));
        if (arg5 != -120) {
            field6615 = -128;
        }
        int var12 = (int) ((float) arg1 / class84.field1178) + class633.field8862;
        class218.field3215 = class633.field8862 - ((int) ((float) arg1 / class84.field1178));
        class678.field9432 = (int) ((float) (arg1 * 2) / class84.field1178);
        class255.field3664 = client.field4272 - ((int) ((float) arg0 / class84.field1178));
        class751.field10497 = (int) ((float) (arg0 * 2) / class84.field1178);
        int var13 = client.field4272 - ((int) ((float) arg0 / class84.field1178));
        class84.method687(class84.field1201 + var10, class84.field1190 + var11, class84.field1201 + var12, class84.field1190 + var13, arg3, arg2, arg3 + arg1, arg2 + 1 + arg0);
        class84.method683(arg6);
        class164 var14 = class84.method688(arg6);
        class248.method1646(0, arg6, arg5 ^ 0xFFFFFF89, var14, 0);
        if (class712.field10051 > 0) {
            class439.field6501--;
            if (class439.field6501 == 0) {
                class439.field6501 = 20;
                class712.field10051--;
            }
        }
        if (!class475.field6906) {
            return;
        }
        int var15 = arg1 + arg3 - 5;
        int var16 = arg0 + arg2 - 8;
        class358.field5201.method545(var15, "Fps:" + class195.field2953, -1, 16776960, var16, (byte) 114);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class358.field5201.method545(var15, "Mem:" + var18 + "k", -1, var19, var20, (byte) 123);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
    public static final void method2757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 16) {
            return;
        }
        field6613++;
        if (arg3 != 8 && arg3 != 16) {
            class186 var5 = class80.field1136[arg1][arg4][arg2];
            if (var5 != null) {
                if (arg3 == 1) {
                    var5.field2833 = 0;
                } else if (arg3 == 2) {
                    var5.field2837 = 0;
                }
            }
            class490.method2933(16776960);
            return;
        }
        for (int var6 = 0; var6 < class233.field3398; var6++) {
            class417 var7 = class315.field4461[var6];
            if (var7.field6241 == arg3 && var7.field6243 == arg4 && var7.field6248 == arg2 || var7.field6252 == arg4 && var7.field6248 == arg2) {
                if (class233.field3398 != var6) {
                    class319.method2017(class315.field4461, var6 + 1, class315.field4461, var6, class315.field4461.length - var6 - 1);
                }
                class233.field3398--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)I")
    public static final int method2758(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg3 != 7) {
            method2758(39, -77, 41, 100);
        }
        field6605++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([I[I[I[[F)V")
    public class445(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field6608 = arg3;
        this.field6609 = arg2;
        this.field6611 = arg0;
        this.field6606 = arg1;
    }
}
