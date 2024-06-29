import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class236 extends class266 {

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Ljl;")
    public class106 field3891;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "Lma;")
    public static class5 field3897 = class12.method119("; version=1; path=)4; domain=", (byte) 88);

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field3895 = 2;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Z")
    public static volatile boolean field3900 = true;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "[F")
    public static float[] field3899 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field3894 = 0;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field3896 = 0;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3901 = Calendar.getInstance();

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field3904 = 0;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "Lpg;")
    public static class295 field3905;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "Ln;")
    public static class9 field3906;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V", line = 4)
    public static void method1670(byte arg0) {
        field3899 = null;
        field3905 = null;
        int var1 = -102 % ((arg0 + 58) / 53);
        field3906 = null;
        field3901 = null;
        field3897 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)Lma;", line = 21)
    public static final class5 method1671(int arg0, long arg1) {
        if (arg0 >= -53) {
            method1673(-79, 23, 68, -83, -31, 74);
        }
        field3902++;
        return class73.method518(false, arg1, 10, (byte) 43);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)Lud;", line = 35)
    public static final class16 method1672(int arg0, int arg1) {
        field3892++;
        class16 var2 = (class16) class281.field4751.method521((long) arg0, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class2.field17.method1342(72, 4, arg0);
        class16 var4 = new class16();
        if (arg1 != 29813) {
            method1670((byte) 116);
        }
        if (var3 != null) {
            var4.method145(27415, new class221(var3), arg0);
        }
        class281.field4751.method519((byte) -95, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljl;)V", line = 65)
    public class236(class106 arg0) {
        this.field3891 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIII)V", line = 85)
    public static final void method1673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class274.field4680 = arg3;
        class73.field1141 = arg5;
        class170.field2618 = arg2;
        class206.field3280 = arg0;
        field3898++;
        class283.field4797 = arg4;
        if (class206.field3280 >= 100) {
            int var6 = class73.field1141 * 128 + 64;
            int var7 = class170.field2618 * 128 + 64;
            int var8 = class20.method161(var7, var6, 1, class276.field4701) - class274.field4680;
            int var9 = var7 - class303.field5108;
            int var10 = var8 - class27.field437;
            int var11 = var6 - class239.field3970;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class207.field3287 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class114.field1710 = (int) (-325.949D * Math.atan2((double) var11, (double) var9)) & 0x7FF;
            if (class207.field3287 < 128) {
                class207.field3287 = 128;
            }
            if (class207.field3287 > 383) {
                class207.field3287 = 383;
            }
        }
        class270.field4631 = arg1;
    }
}
