import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class246 extends class438 {

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "[I")
    public static int[] field3468 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "[I")
    public static int[] field3472 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    public static int field3467 = 0;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Ljava/lang/String;")
    public String field3465;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BIIIII)V", line = 4)
    public static final void method1600(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3469++;
        int var6 = class294.method1789(arg4, (byte) -5, class42.field543, class143.field2090);
        int var7 = class294.method1789(arg2, (byte) -5, class42.field543, class143.field2090);
        int var8 = class294.method1789(arg3, (byte) -5, class430.field6003, class80.field1119);
        int var9 = class294.method1789(arg1, (byte) -5, class430.field6003, class80.field1119);
        if (arg0 > 58) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class149.method1112(arg5, var9, 8, var8, class83.field1157[var10]);
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V", line = 36)
    public static final void method1601(int arg0, int arg1, int arg2, int arg3) {
        field3476++;
        String var4 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & arg2) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class60.method480(true, 0, var4);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 47)
    public static final String method1602(byte arg0, int arg1) {
        field3466++;
        if (arg0 != 70) {
            field3468 = null;
        }
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class255.field3553.method2313((byte) -79, class106.field1492) + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class90.field1257.method2313((byte) -78, class106.field1492) + "</col>";
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V", line = 65)
    public static void method1603(int arg0) {
        if (arg0 >= -108) {
            method1600((byte) 58, 10, 31, 69, -46, 39);
        }
        field3472 = null;
        field3468 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lvg;III)V", line = 76)
    public static final void method1604(class108 arg0, int arg1, int arg2, int arg3) {
        field3475++;
        int var4 = -86 % ((arg1 - 5) / 38);
        class165 var5 = arg0.method831((byte) 57, class354.field4765);
        if (var5 == null) {
            return;
        }
        class354.field4765.method227(arg2, arg3, arg0.field1568 + arg2, arg0.field1577 + arg3);
        if (class63.field852 < 3) {
            class405.field5613.method620((float) arg0.field1568 / 2.0F + (float) arg2, (float) arg0.field1577 / 2.0F + (float) arg3, 4096, ((int) (-class332.field4483) & 0x3FFF) << 2, var5, arg2, arg3);
        } else {
            class354.field4765.method214(-16777216, var5, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIZIZII)V", line = 105)
    public static final void method1605(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            return;
        }
        if (arg3 < arg6) {
            int var7 = (arg3 + arg6) / 2;
            int var8 = arg3;
            class277 var9 = class85.field1193[var7];
            class85.field1193[var7] = class85.field1193[arg6];
            class85.field1193[arg6] = var9;
            for (int var10 = arg3; var10 < arg6; var10++) {
                if (class217.method1440(class85.field1193[var10], arg5, (byte) 33, arg2, arg1, var9, arg4) <= 0) {
                    class277 var11 = class85.field1193[var10];
                    class85.field1193[var10] = class85.field1193[var8];
                    class85.field1193[var8++] = var11;
                }
            }
            class85.field1193[arg6] = class85.field1193[var8];
            class85.field1193[var8] = var9;
            method1605(0, arg1, arg2, arg3, arg4, arg5, var8 - 1);
            method1605(0, arg1, arg2, var8 + 1, arg4, arg5, arg6);
        }
        field3471++;
    }
}
