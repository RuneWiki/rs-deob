import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class529 extends Exception {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field7711 = 0;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field7710 = 0;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "F")
    public static float field7717;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lr;")
    public static class167 field7721;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lpt;")
    public static class491 field7718;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[J")
    public static long[] field7712;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[Loaa;")
    public static class263[] field7714;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 5)
    public static final void method3200(String arg0, int arg1) {
        if (arg1 >= -84) {
            return;
        }
        if (class589.field8381 == null) {
            class700.method3953(-121);
        }
        field7713++;
        class275.field4418.setTime(new Date(class112.method1033(-11752)));
        int var2 = class275.field4418.get(11);
        int var3 = class275.field4418.get(12);
        int var4 = class275.field4418.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class698.method3944('\n', arg0, -4);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class706.field9990; var8 > 0; var8--) {
                class589.field8381[var8] = class589.field8381[var8 - 1];
            }
            class589.field8381[0] = var5 + ": " + var6[var7];
            if (class267.field4340 != null) {
                try {
                    class267.field4340.write(class24.method411(-123, class589.field8381[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if ((class589.field8381.length - 1) > class706.field9990) {
                class706.field9990++;
                if (class106.field1729 > 0) {
                    class106.field1729++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(DI)V", line = 69)
    public static final void method3201(double arg0, int arg1) {
        field7716++;
        if (class474.field7021 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class340.field5515[var3] = var4 <= 255 ? var4 : 255;
            }
            class474.field7021 = arg0;
        }
        if (arg1 != -8076) {
            field7721 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILol;)V", line = 97)
    public static final void method3202(int arg0, int arg1, class260 arg2) {
        field7709++;
        int var3 = -1;
        int var4 = arg0;
        if (arg2.field4203 > class562.field8084) {
            class153.method1264(arg2, 125);
        } else if (arg2.field4151 >= class562.field8084) {
            class685.method3897(arg2, arg0 ^ 0x100);
        } else {
            class267.method1893((byte) -124, false, arg2);
            var4 = class575.field8199;
            var3 = class167.field2808;
        }
        if (arg2.field9696 < 512 || arg2.field9705 < 512 || arg2.field9696 >= (class275.field4426 - 1) * 512 || (class417.field6374 - 1) * 512 <= arg2.field9705) {
            arg2.field4151 = 0;
            var3 = -1;
            arg2.field4170 = -1;
            arg2.field4220 = -1;
            var4 = 0;
            arg2.field4215 = -1;
            arg2.field4203 = 0;
            arg2.field4174 = null;
            arg2.field9696 = arg2.field4264[0] * 512 + arg2.method1841(20744) * 256;
            arg2.field9705 = arg2.field4265[0] * 512 + (arg2.method1841(arg0 + 20744) * 256);
            arg2.method1837(-121);
        }
        if (class567.field8141 == arg2 && (arg2.field9696 < 6144 || arg2.field9705 < 6144 || arg2.field9696 >= (class275.field4426 - 12) * 512 || (class417.field6374 - 12) * 512 <= arg2.field9705)) {
            var3 = -1;
            arg2.field4215 = -1;
            arg2.field4170 = -1;
            arg2.field4220 = -1;
            arg2.field4151 = 0;
            var4 = 0;
            arg2.field4203 = 0;
            arg2.field4174 = null;
            arg2.field9696 = arg2.field4264[0] * 512 + (arg2.method1841(20744) * 256);
            arg2.field9705 = arg2.field4265[0] * 512 + (arg2.method1841(20744) * 256);
            arg2.method1837(-121);
        }
        int var5 = class189.method1521(arg2, arg0 - 32768);
        class524.method3160((byte) -124, arg2);
        class266.method1886(var3, arg2, var4, -75, var5);
        class271.method1918(var3, -18546, arg2);
        class476.method2958(arg2, (byte) -100);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V", line = 173)
    public static void method3203(boolean arg0) {
        if (arg0) {
            field7712 = null;
            field7714 = null;
            field7721 = null;
            field7718 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)Z", line = 187)
    public static final boolean method3204(int arg0, int arg1, byte arg2) {
        field7719++;
        if (arg2 == 120) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lpca;III)V", line = 199)
    public static final void method3205(class665 arg0, int arg1, int arg2, int arg3) {
        field7720++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field9285 != null) {
            class438 var4 = new class438();
            var4.field6684 = arg0.field9285;
            var4.field6677 = arg0;
            class142.method1201(var4);
        }
        class250.field4003 = arg0.field9339;
        class517.field7498 = arg0.field9380;
        class558.field8067 = arg0.field9340;
        class219.field3577 = arg0.field9354;
        class198.field3243 = arg0.field9400;
        class340.field5505 = arg3;
        class73.field918 = arg1;
        class145.field2450 = true;
        if (arg2 != -256) {
            field7711 = 52;
        }
        class362.method2415(-123, arg0);
    }
}
