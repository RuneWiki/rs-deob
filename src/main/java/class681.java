import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class681 {

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lhm;")
    private class208 field9266 = new class208(64);

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lhm;")
    public class208 field9277 = new class208(50);

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Lhm;")
    public class208 field9279 = new class208(5);

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lpfa;")
    private class275 field9268;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Lpfa;")
    public class275 field9270;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Z")
    public boolean field9272;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lbs;")
    public class643 field9267;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
    public static int[] field9274 = new int[13];

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lju;")
    public static class115 field9273 = new class115();

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "[I")
    public static int[] field9278 = new int[256];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field9280;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method3759(byte arg0) {
        field9273 = null;
        field9278 = null;
        field9274 = null;
        if (arg0 < 1) {
            field9273 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lmv;")
    public static final class348 method3760(Canvas arg0, byte arg1) {
        field9263++;
        try {
            Class var2 = Class.forName("hw");
            class348 var3 = (class348) var2.getDeclaredConstructor().newInstance();
            if (arg1 >= -75) {
                field9274 = null;
            }
            var3.method796(arg0, (byte) 46);
            return var3;
        } catch (Throwable var5) {
            class134 var4 = new class134();
            var4.method796(arg0, (byte) 46);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
    public final void method3761(byte arg0, int arg1) {
        field9265++;
        class208 var3 = this.field9266;
        synchronized (this.field9266) {
            this.field9266.method1222(14564, arg1);
        }
        class208 var4 = this.field9277;
        synchronized (this.field9277) {
            int var5 = -24 % ((-arg0 - 27) / 39);
            this.field9277.method1222(14564, arg1);
        }
        class208 var6 = this.field9279;
        synchronized (this.field9279) {
            this.field9279.method1222(14564, arg1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static final void method3762(byte arg0) {
        field9264++;
        if (class303.field3848 == 0) {
            return;
        }
        int var1 = -127 / ((arg0 + 29) / 45);
        try {
            if (++class398.field5059 > 2000) {
                if (class335.field4139 != null) {
                    class335.field4139.method2511((byte) 126);
                    class335.field4139 = null;
                }
                if (class478.field5958 >= 2) {
                    class389.field4992 = -5;
                    class303.field3848 = 0;
                    return;
                }
                class194.field2293.method1410(35714);
                class303.field3848 = 1;
                class478.field5958++;
                class398.field5059 = 0;
            }
            if (class303.field3848 == 1) {
                class169.field1983 = class194.field2293.method1409(class386.field4955, -122);
                class303.field3848 = 2;
            }
            if (class303.field3848 == 2) {
                if (class169.field1983.field2546 == 2) {
                    throw new IOException();
                }
                if (class169.field1983.field2546 != 1) {
                    return;
                }
                class335.field4139 = class149.method932(7500, -7656, (Socket) class169.field1983.field2547);
                class169.field1983 = null;
                class605.method3355(98);
                class303.field3848 = 4;
            }
            if (class303.field3848 == 4) {
                if (!class335.field4139.method2514(-1, 1)) {
                    return;
                }
                class335.field4139.method2513((byte) -107, 1, 0, class222.field2585.field7318);
                int var2 = class222.field2585.field7318[0] & 0xFF;
                if (var2 != 21) {
                    class389.field4992 = var2;
                    class303.field3848 = 0;
                    class335.field4139.method2511((byte) -66);
                    class335.field4139 = null;
                    return;
                }
                class303.field3848 = 5;
            }
            if (class303.field3848 == 5) {
                if (!class335.field4139.method2514(-1, 1)) {
                    return;
                }
                class335.field4139.method2513((byte) -116, 1, 0, class222.field2585.field7318);
                class303.field3848 = 6;
                class416.field5330 = new String[class222.field2585.field7318[0] & 0xFF];
            }
            if (class303.field3848 == 6 && class335.field4139.method2514(-1, class416.field5330.length * 8)) {
                class222.field2585.field7313 = 0;
                class335.field4139.method2513((byte) -127, class416.field5330.length * 8, 0, class222.field2585.field7318);
                for (int var3 = 0; var3 < class416.field5330.length; var3++) {
                    class416.field5330[var3] = class182.method1086(class222.field2585.method3046(false), -30150);
                }
                class303.field3848 = 0;
                class389.field4992 = 21;
                class335.field4139.method2511((byte) 111);
                class335.field4139 = null;
            }
        } catch (IOException var4) {
            if (class335.field4139 != null) {
                class335.field4139.method2511((byte) 97);
                class335.field4139 = null;
            }
            if (class478.field5958 < 2) {
                class194.field2293.method1410(35714);
                class478.field5958++;
                class398.field5059 = 0;
                class303.field3848 = 1;
            } else {
                class389.field4992 = -4;
                class303.field3848 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lql;")
    public final class689 method3763(int arg0, int arg1) {
        field9261++;
        class208 var3 = this.field9266;
        class689 var4;
        synchronized (this.field9266) {
            var4 = (class689) this.field9266.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field9268;
        byte[] var6;
        synchronized (this.field9268) {
            var6 = this.field9268.method1659(118, class470.method2559((byte) 126, arg0), class467.method2547((byte) -115, arg0));
        }
        class689 var7 = new class689();
        var7.field9536 = arg0;
        var7.field9508 = this;
        if (var6 != null) {
            var7.method3811(new class572(var6), -1);
        }
        var7.method3818((byte) -119);
        class208 var8 = this.field9266;
        synchronized (this.field9266) {
            if (arg1 != -2) {
                this.method3763(-105, 83);
            }
            this.field9266.method1230((byte) 81, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V")
    public final void method3764(byte arg0, boolean arg1) {
        field9275++;
        if (this.field9272 == arg1) {
            return;
        }
        if (arg0 != -18) {
            this.method3761((byte) 80, 123);
        }
        this.field9272 = arg1;
        this.method3767((byte) 59);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method3765(int arg0) {
        field9262++;
        class208 var2 = this.field9277;
        synchronized (this.field9277) {
            this.field9277.method1218(110);
        }
        class208 var3 = this.field9279;
        synchronized (this.field9279) {
            this.field9279.method1218(arg0 + 2123);
            if (arg0 != -2001) {
                this.field9277 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z")
    public static final boolean method3766(int arg0) {
        field9260++;
        class263 var1 = class345.field4438.field4121.field3319;
        if (var1 == null || class345.field4438.field4121 == var1) {
            return false;
        }
        class501 var2 = (class501) var1;
        if (arg0 == -5) {
            if (var2.field6242 >= 2000) {
                var2.field6242 -= 2000;
            }
            return var2.field6242 == 1002;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
    public final void method3767(byte arg0) {
        class208 var2 = this.field9266;
        synchronized (this.field9266) {
            this.field9266.method1218(117);
        }
        field9269++;
        class208 var3 = this.field9277;
        synchronized (this.field9277) {
            this.field9277.method1218(106);
        }
        int var4 = -46 / ((-arg0 - 4) / 43);
        class208 var5 = this.field9279;
        synchronized (this.field9279) {
            this.field9279.method1218(120);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
    public final void method3768(int arg0, byte arg1) {
        field9271++;
        if (arg1 >= -84) {
            this.field9266 = null;
        }
        this.field9280 = arg0;
        class208 var3 = this.field9277;
        synchronized (this.field9277) {
            this.field9277.method1218(97);
        }
        class208 var4 = this.field9279;
        synchronized (this.field9279) {
            this.field9279.method1218(113);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public final void method3769(int arg0) {
        field9276++;
        class208 var2 = this.field9266;
        synchronized (this.field9266) {
            this.field9266.method1224(false);
        }
        int var3 = -8 % ((22 - arg0) / 62);
        class208 var4 = this.field9277;
        synchronized (this.field9277) {
            this.field9277.method1224(false);
        }
        class208 var5 = this.field9279;
        synchronized (this.field9279) {
            this.field9279.method1224(false);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lbs;IZLpfa;Lpfa;)V")
    public class681(class643 arg0, int arg1, boolean arg2, class275 arg3, class275 arg4) {
        this.field9268 = arg3;
        this.field9270 = arg4;
        this.field9272 = arg2;
        this.field9267 = arg0;
        if (this.field9268 != null) {
            int var6 = this.field9268.method1642(-83) - 1;
            this.field9268.method1655(var6, (byte) -82);
        }
    }
}
