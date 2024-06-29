import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class745 extends class571 {

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
    public static int field10317 = 0;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public static int field10318 = -2;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "Lpca;")
    public class745 field10320;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "Lpca;")
    public class745 field10327;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "[Lje;")
    public static class421[] field10328;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lvn;B)V", line = 4)
    public static final void method4148(class330 arg0, byte arg1) {
        field10321++;
        int var2 = arg0.field4629 - class192.field2961;
        if (arg1 != -69) {
            return;
        }
        int var3 = arg0.field4586 * 512 + (arg0.method2102(true) * 256);
        int var4 = arg0.field4591 * 512 + arg0.method2102(true) * 256;
        arg0.field5746 += (var4 - arg0.field5746) / var2;
        arg0.field4676 = 0;
        arg0.field5742 += (var3 - arg0.field5742) / var2;
        if (arg0.field4594 == 0) {
            arg0.method2099(8192, arg1 ^ 0xFFFFFFAE);
        }
        if (arg0.field4594 == 1) {
            arg0.method2099(12288, 57);
        }
        if (arg0.field4594 == 2) {
            arg0.method2099(0, arg1 - 54);
        }
        if (arg0.field4594 == 3) {
            arg0.method2099(4096, -119);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 36)
    public static final void method4149(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class228.field3494 = arg0;
        class652.field9112 = arg1;
        class712.field9883 = class652.field9112 > 1 && class228.field3494.method477();
        class645.field9018 = arg2;
        class109.field1611 = 0x1 << class645.field9018;
        class556.field7931 = class109.field1611 >> 1;
        Math.sqrt((double) (class556.field7931 * class556.field7931 + class556.field7931 * class556.field7931));
        class562.field7990 = arg3;
        class81.field902 = arg4;
        class48.field615 = arg5;
        class259.field3820 = arg6;
        class94.field1071 = class261.method1696(122);
        class207.method1434((byte) 116);
        class385.field5312 = new class46[arg3][class81.field902][class48.field615];
        class411.field5572 = new class294[arg3];
        if (arg7) {
            class392.field5398 = new int[class81.field902][class48.field615];
            class190.field2943 = new byte[class81.field902][class48.field615];
            class721.field9985 = new short[class81.field902][class48.field615];
            class356.field5006 = new class46[1][class81.field902][class48.field615];
            class774.field10642 = new class294[1];
        } else {
            class392.field5398 = null;
            class190.field2943 = null;
            class721.field9985 = null;
            class356.field5006 = null;
            class774.field10642 = null;
        }
        if (arg8) {
            class143.field2105 = new long[arg3][arg4][arg5];
            class603.field8444 = new class456[65535];
            class204.field3176 = new boolean[65535];
            class97.field1103 = 0;
        } else {
            class143.field2105 = null;
            class603.field8444 = null;
            class204.field3176 = null;
            class97.field1103 = 0;
        }
        class33.method273(false);
        field10328 = new class421[2];
        class338.field4733 = new class421[2];
        class695.field9711 = new class421[2];
        class216.field3344 = new class421[10000];
        class536.field7716 = 0;
        class586.field8280 = new class421[5000];
        class215.field3321 = 0;
        class184.field2830 = new class672[5000];
        class309.field4423 = 0;
        class735.field10157 = new boolean[class259.field3820 + class259.field3820 + 1][class259.field3820 + class259.field3820 + 1];
        class281.field4084 = new boolean[class259.field3820 + class259.field3820 + 2][class259.field3820 + class259.field3820 + 2];
        class103.field1193 = new int[class259.field3820 + class259.field3820 + 2];
        class510.field7211 = class510.field7212;
        if (class712.field9883) {
            class631.field8875 = new boolean[arg3][class259.field3820 + class259.field3820 + 1][class259.field3820 + class259.field3820 + 1];
            class760.field10485 = new boolean[arg3][][];
            if (class16.field297 != null) {
                class591.method3439();
            }
            class16.field297 = new class770[class652.field9112];
            class228.field3494.method497(class16.field297.length + 1);
            class228.field3494.method519(0);
            for (int var9 = 0; var9 < class16.field297.length; var9++) {
                class16.field297[var9] = new class770(var9 + 1, class228.field3494);
                (new Thread(class16.field297[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class652.field9112 == 2) {
                var10 = 4;
                class270.field3919 = 2;
            } else if (class652.field9112 == 3) {
                var10 = 6;
                class270.field3919 = 3;
            } else {
                var10 = 8;
                class270.field3919 = 4;
            }
            class747.field10352 = new class49[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class747.field10352[var11] = new class49(class12.field222[class652.field9112 - 2][var11]);
            }
        } else {
            class270.field3919 = 1;
        }
        class189.field2915 = new int[class270.field3919 - 1];
        class606.field8480 = new int[class270.field3919 - 1];
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V", line = 166)
    public final void method4150(byte arg0) {
        field10325++;
        if (this.field10327 == null) {
            return;
        }
        int var2 = 12 % ((arg0 + 47) / 36);
        this.field10327.field10320 = this.field10320;
        this.field10320.field10327 = this.field10327;
        this.field10320 = null;
        this.field10327 = null;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ltd;Ljava/lang/Object;I)V", line = 182)
    public static final void method4151(class477 arg0, Object arg1, int arg2) {
        field10323++;
        if (arg2 != 3) {
            field10328 = null;
        }
        if (arg0.field6684 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field6684.peekEvent() != null; var3++) {
            class107.method828(1L, (byte) 69);
        }
        try {
            if (arg1 != null) {
                arg0.field6684.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 210)
    public static void method4152(int arg0) {
        if (arg0 <= 33) {
            field10317 = 49;
        }
        field10328 = null;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V", line = 226)
    public static final void method4153(String arg0, String arg1, int arg2, int arg3) {
        field10322++;
        if (arg0.length() > 320 || !class401.method2473((byte) 116)) {
            return;
        }
        class376.method2331((byte) 59);
        class694.field9678 = arg1;
        class691.field9661 = arg0;
        if (arg3 != 0) {
            method4155(-24, -24, 95);
        }
        class55.field709 = arg2;
        class225.method1539(false, 6);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILtea;)V", line = 247)
    public static final void method4154(int arg0, class250 arg1) {
        field10324++;
        class166.field2626 = arg1;
        int var2 = -118 / ((arg0 + 21) / 61);
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(III)Z", line = 258)
    public static final boolean method4155(int arg0, int arg1, int arg2) {
        field10319++;
        if (arg2 != 0) {
            field10317 = 3;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)I", line = 270)
    public static final int method4156(byte arg0) {
        if (arg0 != 115) {
            field10328 = null;
        }
        field10326++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class519.field7328.field6674 && !class519.field7328.field6692) {
            var1 = true;
            if (class716.field9938.field249 < 512 && class716.field9938.field249 != 0) {
                var1 = false;
            }
            if (class477.field6690.startsWith("win")) {
                var3 = true;
                var2 = true;
            } else {
                var2 = true;
            }
        }
        if (class784.field10767) {
            var3 = false;
        }
        if (class690.field9654) {
            var2 = false;
        }
        if (class367.field5101) {
            var1 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class651.method3730(123);
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        if (var1) {
            try {
                var4 = class400.method2464(2, 14170, 1000);
            } catch (Exception var15) {
            }
        }
        if (var3) {
            try {
                var6 = class400.method2464(3, arg0 ^ 0x3729, 1000);
                if (class21.field353.field10098.method1588(-86) == 3) {
                    class491 var7 = class37.field491.method553();
                    long var8 = var7.field6967 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field6964;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class400.method2464(1, 14170, 1000);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class651.method3730(arg0 ^ 0xD);
        }
        int var11 = (int) ((float) var6 * 1.1F);
        int var12 = (int) ((float) var5 * 1.1F);
        if (var4 > var11 && var12 < var4) {
            return class154.method1060(var4, arg0 ^ 0x21);
        } else if (var12 < var11) {
            return class33.method275(9627, 3, var11);
        } else {
            return class33.method275(arg0 ^ 0x25E8, 1, var12);
        }
    }
}
