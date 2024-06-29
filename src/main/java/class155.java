import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class155 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Lcb;")
    public static class318 field1919 = new class318(73, 3);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lpq;")
    public static class159 field1922;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method1028(int arg0) {
        if (arg0 != -7174) {
            field1919 = null;
        }
        field1922 = null;
        field1919 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBLpea;II)Lmm;")
    public static final class459 method1029(int arg0, int arg1, byte arg2, class641 arg3, int arg4, int arg5) {
        field1925++;
        int var6 = 6 % ((arg2 - 7) / 43);
        if (!arg3.field8965 && (!class144.method986(arg5, (byte) -104) || !class144.method986(arg0, (byte) -115))) {
            return arg3.field8993 ? new class459(arg3, 34037, arg1, arg4, arg5, arg0, true) : new class459(arg3, arg1, arg4, arg5, arg0, class306.method1837((byte) -119, arg5), class306.method1837((byte) -115, arg0), true);
        } else {
            return new class459(arg3, 3553, arg1, arg4, arg5, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B[B)V")
    public static final void method1030(byte arg0, byte[] arg1) {
        if (arg0 > -110) {
            method1031(89);
        }
        new class138(arg1);
        field1924++;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static final void method1031(int arg0) {
        field1923++;
        if (class571.field7908 != null) {
            class571.field7908.method3595((byte) -15);
        }
        if (class304.field4096 != null) {
            class304.field4096.method3595((byte) -15);
        }
        if (arg0 > -29) {
            field1919 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lqe;I)V")
    public static final void method1032(class122 arg0, int arg1) {
        arg0.method745(8);
        field1921++;
        int var2 = class224.field2907;
        class519 var3 = class596.field8164 = class292.field3912[var2] = new class519();
        var3.field463 = var2;
        int var4 = arg0.method752(0, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFCEFA) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field526[0] = var6 - class253.field3490;
        var3.field3929 = (var3.field526[0] << 9) + (var3.method241(-25747) << 8);
        var3.field516[0] = var7 - class186.field2280;
        var3.field3917 = (var3.field516[0] << 9) + (var3.method241(-25747) << 8);
        class432.field5993 = var3.field3925 = var5;
        if (class186.field2281[var2] != null) {
            var3.method2959(arg1 ^ 0x2F, class186.field2281[var2]);
        }
        class654.field9256 = 0;
        class123.field1595[class654.field9256++] = var2;
        class268.field3675[var2] = 0;
        class9.field81 = 0;
        for (int var8 = arg1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method752(0, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class124 var13 = class142.field1807[var8] = new class124();
                var13.field1599 = (var10 << 28) + (var11 << 14) + var12;
                var13.field1600 = -1;
                var13.field1598 = false;
                var13.field1602 = 0;
                class547.field7486[class9.field81++] = var8;
                class268.field3675[var8] = 0;
            }
        }
        arg0.method751(-97);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ldga;I)V")
    public static final void method1033(class138 arg0, int arg1) {
        field1920++;
        byte[] var2 = new byte[24];
        if (class80.field1011 != null) {
            try {
                class80.field1011.method1291((byte) -110, 0L);
                class80.field1011.method1294(-118, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg1 != 28380) {
            field1922 = null;
        }
        arg0.method955(24, 0, 29986, var2);
    }
}
