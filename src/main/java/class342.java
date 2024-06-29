import java.awt.event.ActionEvent;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class342 {

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Z")
    public boolean field5120 = false;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public int field5125 = 0;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public int field5116 = 0;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Z")
    public static boolean field5117 = true;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static volatile int field5119 = -1;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "[S")
    public static short[] field5118 = new short[] { 19, 48, 5, 2, 11, 9, 15, 34 };

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field5127 = 0;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "[[I")
    public static int[][] field5126 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lhb;")
    public class305 field5115;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lin;")
    public static class344 field5129;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5122;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lin;II)V", line = 5)
    public static final void method2357(class344[] arg0, int arg1, int arg2) {
        field5123++;
        for (int var3 = arg1; var3 < arg0.length; var3++) {
            class344 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field5316 == 0) {
                    if (var4.field5248 != null) {
                        method2357(var4.field5248, 0, arg2);
                    }
                    class48 var5 = (class48) class211.field3056.method111(-104, (long) var4.field5206);
                    if (var5 != null) {
                        class52.method358(arg2, var5.field595, 18248);
                    }
                }
                if (arg2 == 0 && var4.field5347 != null) {
                    class171 var6 = new class171();
                    var6.field2333 = var4.field5347;
                    var6.field2341 = var4;
                    class314.method2145(-46, var6);
                }
                if (arg2 == 1 && var4.field5292 != null) {
                    if (var4.field5275 >= 0) {
                        class344 var7 = class151.method1101(-87, var4.field5206);
                        if (var7 == null || var7.field5248 == null || var7.field5248.length <= var4.field5275 || var7.field5248[var4.field5275] != var4) {
                            continue;
                        }
                    }
                    class171 var8 = new class171();
                    var8.field2333 = var4.field5292;
                    var8.field2341 = var4;
                    class314.method2145(-30, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 70)
    public static final void method2358(int arg0) {
        field5124++;
        while (class157.field2165.method2234((byte) -104, class199.field2833) >= 11) {
            int var1 = class157.field2165.method2242(11, -14970);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class169.field2306[var1] == null) {
                var2 = true;
                class169.field2306[var1] = new class241();
                if (class74.field1023[var1] != null) {
                    class169.field2306[var1].method1644(class74.field1023[var1], -29162);
                }
            }
            class4.field35[class292.field4352++] = var1;
            class241 var3 = class169.field2306[var1];
            var3.field3697 = class329.field4966;
            int var4 = class6.field52[class157.field2165.method2242(3, arg0 + 493)];
            if (var2) {
                var3.field3666 = var3.field3746 = var4;
            }
            int var5 = class157.field2165.method2242(1, -14970);
            if (var5 == 1) {
                class270.field4027[class252.field3614++] = var1;
            }
            int var6 = class157.field2165.method2242(1, -14970);
            int var7 = class157.field2165.method2242(5, -14970);
            int var8 = class157.field2165.method2242(5, -14970);
            if (var8 > 15) {
                var8 -= 32;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method1645(class173.field2356.field3706[0] + var7, class173.field2356.field3768[0] + var8, var6 == 1, -88);
        }
        if (arg0 != -15463) {
            method2359((byte) 60);
        }
        class157.field2165.method2233(8);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 137)
    public static void method2359(byte arg0) {
        field5129 = null;
        if (arg0 <= -87) {
            field5118 = null;
            field5126 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/Object;Lwa;I)V", line = 164)
    public static final void method2360(Object arg0, class80 arg1, int arg2) {
        field5128++;
        if (arg1.field1158 == null) {
            return;
        }
        for (int var3 = arg2; var3 < 50 && arg1.field1158.peekEvent() != null; var3++) {
            class186.method1304(10, 1L);
        }
        if (arg0 != null) {
            arg1.field1158.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
