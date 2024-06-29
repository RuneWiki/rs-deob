import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class364 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field5519 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lig;")
    public static class206 field5518 = new class206(55, -2);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method2021();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class364 method2020();

    @OriginalMember(owner = "client!q", name = "R", descriptor = "(III[I)V")
    public abstract void method2003(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "ra", descriptor = "(I)V")
    public abstract void method2011(int arg0);

    @OriginalMember(owner = "client!q", name = "S", descriptor = "(I)V")
    public abstract void method2007(int arg0);

    @OriginalMember(owner = "client!q", name = "G", descriptor = "(III)V")
    public abstract void method2006(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public abstract void method2023(int arg0);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public abstract void method2017(int arg0);

    @OriginalMember(owner = "client!q", name = "O", descriptor = "([I)V")
    public abstract void method2016(int[] arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method2018(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "P", descriptor = "(I)V")
    public abstract void method2002(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method2344(byte arg0) {
        field5518 = null;
        if (arg0 < 54) {
            method2345(59);
        }
    }

    @OriginalMember(owner = "client!q", name = "GA", descriptor = "(III)V")
    public abstract void method2014(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "pa", descriptor = "(IIIIII)V")
    public abstract void method2019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static final void method2345(int arg0) {
        field5520++;
        if (arg0 < 66) {
            method2345(93);
        }
        if (class360.field5099 == 0) {
            return;
        }
        try {
            if (++class572.field8266 > 2000) {
                if (class170.field2077 != null) {
                    class170.field2077.method1841(127);
                    class170.field2077 = null;
                }
                if (class489.field7134 >= 2) {
                    class523.field7601 = -5;
                    class360.field5099 = 0;
                    return;
                }
                class606.field8861.method797((byte) -78);
                class489.field7134++;
                class360.field5099 = 1;
                class572.field8266 = 0;
            }
            if (class360.field5099 == 1) {
                class506.field7340 = class606.field8861.method798(32, class20.field197);
                class360.field5099 = 2;
            }
            if (class360.field5099 == 2) {
                if (class506.field7340.field2138 == 2) {
                    throw new IOException();
                }
                if (class506.field7340.field2138 != 1) {
                    return;
                }
                class170.field2077 = class232.method1492(5000, (Socket) class506.field7340.field2140, 65535);
                class506.field7340 = null;
                class170.field2077.method1840(0, class468.field6960.field2610, class468.field6960.field2622, 0);
                class360.field5099 = 4;
            }
            if (class360.field5099 == 4) {
                if (!class170.field2077.method1846(3139, 1)) {
                    return;
                }
                class170.field2077.method1843(0, 1, class46.field498.field2622, 1);
                int var1 = class46.field498.field2622[0] & 0xFF;
                if (var1 != 21) {
                    class523.field7601 = var1;
                    class360.field5099 = 0;
                    class170.field2077.method1841(126);
                    class170.field2077 = null;
                    return;
                }
                class360.field5099 = 5;
            }
            if (class360.field5099 == 5) {
                if (!class170.field2077.method1846(3139, 1)) {
                    return;
                }
                class170.field2077.method1843(0, 1, class46.field498.field2622, 1);
                class168.field2050 = new String[class46.field498.field2622[0] & 0xFF];
                class360.field5099 = 6;
            }
            if (class360.field5099 == 6 && class170.field2077.method1846(3139, class168.field2050.length * 8)) {
                class46.field498.field2610 = 0;
                class170.field2077.method1843(0, 1, class46.field498.field2622, class168.field2050.length * 8);
                for (int var2 = 0; var2 < class168.field2050.length; var2++) {
                    class168.field2050[var2] = class113.method697((byte) -24, class46.field498.method1184(122));
                }
                class523.field7601 = 21;
                class360.field5099 = 0;
                class170.field2077.method1841(127);
                class170.field2077 = null;
            }
        } catch (IOException var3) {
            if (class170.field2077 != null) {
                class170.field2077.method1841(-81);
                class170.field2077 = null;
            }
            if (class489.field7134 < 2) {
                class606.field8861.method797((byte) -78);
                class572.field8266 = 0;
                class489.field7134++;
                class360.field5099 = 1;
            } else {
                class523.field7601 = -4;
                class360.field5099 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(Lq;)V")
    public abstract void method2004(class364 arg0);
}
