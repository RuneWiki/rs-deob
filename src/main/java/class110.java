import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class110 extends class266 {

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "F")
    private float field1481 = 0.0F;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "Ldb;")
    private class292 field1483;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "Luj;")
    public static class349 field1482 = new class349();

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1492 = "";

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "Lpj;")
    public static class132 field1493;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lmh;III)V", line = 6)
    public static final void method821(class577 arg0, int arg1, int arg2, int arg3) {
        long var4 = class185.field2716[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field7757 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field7752[arg0.field7757++] = class324.field4793[var8 - 1].field7053;
            var6 += 16L;
        }
        for (int var9 = arg0.field7757; var9 < 4; ++var9) {
            arg0.field7752[var9] = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V", line = 36)
    public static void method822(int arg0) {
        field1493 = null;
        field1482 = null;
        field1492 = null;
        int var1 = 11 / ((71 - arg0) / 47);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([BZ)Lxa;", line = 49)
    public static final class461 method823(byte[] arg0, boolean arg1) {
        ++field1489;
        try {
            Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var3 = new MediaTracker(class258.field3685);
            var3.addImage(var2, 0);
            var3.waitForAll();
            int var4 = var2.getWidth(class258.field3685);
            int var5 = var2.getHeight(class258.field3685);
            int[] var6 = new int[var4 * var5];
            if (!arg1) {
                field1493 = null;
            }
            PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
            var7.grabPixels();
            return class630.field8790.method452(var6, 0, var4, var4, var5);
        } catch (InterruptedException var8) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lgj;Ldb;)V", line = 164)
    public class110(class580 arg0, class292 arg1) {
        super(arg0);
        this.field1483 = arg1;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(III)V", line = 82)
    public final void method156(int arg0, int arg1, int arg2) {
        ++field1486;
        super.field3785.method3220(1, -23809);
        if ((arg1 & 128) == 0) {
            if (~(arg0 & 1) != -2) {
                if (!this.field1483.field4397) {
                    super.field3785.method3232(false, this.field1483.field4393[0]);
                } else {
                    super.field3785.method3232(false, this.field1483.field4390);
                }
            } else if (!this.field1483.field4397) {
                int var4 = super.field3785.field8003 % 4000 * 16 / 4000;
                super.field3785.method3232(false, this.field1483.field4393[var4]);
            } else {
                this.field1481 = (float) (super.field3785.field8003 % 4000) / 4000.0F;
                super.field3785.method3232(false, this.field1483.field4390);
            }
        } else {
            super.field3785.method3232(false, (class467) null);
        }
        super.field3785.method3220(arg2, -23809);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V", line = 123)
    public final void method155(boolean arg0) {
        super.field3785.method3220(1, -23809);
        ++field1488;
        super.field3785.method3193(class137.field1929, class137.field1929, 0);
        super.field3785.method3177(0, 106, class558.field7530);
        super.field3785.method3235(class558.field7530, -12912, 0);
        super.field3785.method333(1, (byte) 83);
        super.field3785.method3232(arg0, (class467) null);
        super.field3785.method3220(0, -23809);
        super.field3785.method3235(class558.field7530, -12912, 0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V", line = 138)
    public final void method145(byte arg0) {
        if (arg0 <= 65) {
            field1492 = null;
        }
        if (super.field3785.method3179((byte) 40) == 0) {
            class367 var2 = super.field3785.method3171(-19068);
            super.field3785.method3220(1, -23809);
            class367 var3 = super.field3785.method3204(112);
            var3.method1298(var2);
            var3.method2157(0.125F, -23619, 1.0F, 0.125F);
            var3.method2148(26921, this.field1481, 0.0F, 0.0F);
            super.field3785.method3201(-17, class591.field8233);
            super.field3785.method3220(0, -23809);
        }
        ++field1484;
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(II)I", line = 173)
    public static final int method824(int arg0, int arg1) {
        ++field1480;
        return arg1 <= 54 ? 61 : (arg0 & 261578) >> 11;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lek;IB)V", line = 186)
    public final void method150(class467 arg0, int arg1, byte arg2) {
        ++field1490;
        if (arg2 <= -56) {
            super.field3785.method3232(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)Z", line = 198)
    public final boolean method154(int arg0) {
        if (arg0 < 101) {
            field1482 = null;
        }
        ++field1491;
        return this.field1483.method1832(95);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IZ)V", line = 214)
    public final void method144(int arg0, boolean arg1) {
        if (arg0 != 1) {
            this.method154(-119);
        }
        ++field1485;
        super.field3785.method3193(class137.field1929, class24.field325, 0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)V", line = 226)
    public final void method148(int arg0, boolean arg1) {
        ++field1487;
        super.field3785.method3220(1, -23809);
        super.field3785.method3193(client.field3838, class24.field325, arg0);
        super.field3785.method316(false, class558.field7530, true, 0, false);
        super.field3785.method3235(class85.field1174, arg0 ^ -12912, 0);
        super.field3785.method333(0, (byte) 92);
        super.field3785.method3220(arg0, -23809);
        super.field3785.method3248((byte) -119, -16777216);
        super.field3785.method3235(class22.field305, -12912, 0);
        this.method145((byte) 110);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZLfaa;I)I", line = 244)
    public static final int method825(boolean arg0, class140 arg1, int arg2) {
        if (!arg0) {
            method825(false, (class140) null, 18);
        }
        ++field1494;
        if (!client.method1655(arg1).method2847((byte) -37, arg2) && arg1.field1957 == null) {
            return -1;
        } else {
            return arg1.field1976 != null && arg2 < arg1.field1976.length ? arg1.field1976[arg2] : -1;
        }
    }
}
