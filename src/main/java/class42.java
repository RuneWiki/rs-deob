import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class42 extends class71 {

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "J")
    public long field524;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field520 = -1;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "[I")
    public static int[] field522 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
    public static int[] field523 = new int[3];

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[F")
    public static float[] field525 = new float[16];

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 4)
    public static void method233(boolean arg0) {
        field522 = null;
        field523 = null;
        if (!arg0) {
            method235(13, 62);
        }
        field525 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 16)
    public static final void method234(boolean arg0, String arg1, int arg2) {
        String var3 = arg1.toLowerCase();
        field526++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class145.field2038.field2391 : class145.field2038.field2396) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class192 var11 = class145.field2038.method1107(true, var8);
            if (var11.field2616 && var11.method1189(42).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class602.field8142 = null;
                    class619.field8309 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class232.field3271 = 0;
        class619.field8309 = var5;
        class602.field8142 = var4;
        String[] var9 = new String[class619.field8309];
        for (int var10 = 0; var10 < class619.field8309; var10++) {
            var9[var10] = class145.field2038.method1107(true, var4[var10]).method1189(39);
        }
        if (arg2 > -53) {
            method234(false, null, 62);
        }
        class450.method2758((byte) -98, class602.field8142, var9);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V", line = 88)
    public static final void method235(int arg0, int arg1) {
        field521++;
        if (arg1 != 16383) {
            return;
        }
        class675.field9369 = arg0;
        class690 var2 = class684.field9509;
        synchronized (class684.field9509) {
            class684.field9509.method3906(-122);
        }
        class690 var3 = class301.field4258;
        synchronized (class301.field4258) {
            class301.field4258.method3906(-128);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 118)
    public class42() {
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(J)V", line = 125)
    public class42(long arg0) {
        this.field524 = arg0;
    }
}
