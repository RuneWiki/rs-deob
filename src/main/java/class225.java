import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class225 extends class170 {

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "Lqk;")
    public static class207 field4101 = class24.method212(255, "<col=ff7000>");

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field4098 = 0;

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
    public static int field4107 = 0;

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "Lqk;")
    private static class207 field4108 = class24.method212(255, "green:");

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "Lqk;")
    public static class207 field4096 = field4108;

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "Lqk;")
    public static class207 field4106 = field4108;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "Lfi;")
    public static class109 field4099;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            field4101 = null;
        }
        ++field4095;
        int[] var3 = super.field3001.method1538(107, arg1);
        if (super.field3001.field3835) {
            int var4 = class282.field4964[arg1];
            for (int var5 = 0; ~var5 > ~class88.field1595; ++var5) {
                var3[var5] = this.method1590((byte) -108, var4, class68.field1211[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class225() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
    public static void method1587(byte arg0) {
        field4099 = null;
        field4108 = null;
        field4106 = null;
        if (arg0 <= 112) {
            method1587((byte) 85);
        }
        field4101 = null;
        field4096 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILjava/awt/Color;ZLqk;)V")
    public static final void method1588(int arg0, int arg1, Color arg2, boolean arg3, class207 arg4) {
        try {
            Graphics var5 = class112.field1949.getGraphics();
            if (class126.field2186 == null) {
                class126.field2186 = new Font("Helvetica", 1, 13);
                class117.field2033 = class112.field1949.getFontMetrics(class126.field2186);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class31.field625, class244.field4428);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class133.field2305 == null) {
                    class133.field2305 = class112.field1949.createImage(304, 34);
                }
                Graphics var6 = class133.field2305.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + 300, 30);
                var6.setFont(class126.field2186);
                var6.setColor(Color.white);
                arg4.method1452(var6, (304 - arg4.method1440(class117.field2033, 2866)) / 2, 22, 23681);
                if (arg1 < 76) {
                    return;
                }
                var5.drawImage(class133.field2305, class31.field625 / 2 + -152, class244.field4428 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class31.field625 / 2 + -152;
                int var8 = class244.field4428 / 2 + -18;
                var5.setColor(arg2);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var7 + 2, var8 + 2, -(arg0 * 3) + 300, 30);
                var5.setFont(class126.field2186);
                var5.setColor(Color.white);
                arg4.method1452(var5, var7 - -((304 + -arg4.method1440(class117.field2033, 2866)) / 2), var8 + 22, 23681);
            }
            if (class44.field868 != null) {
                var5.setFont(class126.field2186);
                var5.setColor(Color.white);
                class44.field868.method1452(var5, class31.field625 / 2 + -(class44.field868.method1440(class117.field2033, 2866) / 2), class244.field4428 / 2 + -26, 23681);
            }
        } catch (Exception var10) {
            class112.field1949.repaint();
        }
        ++field4102;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
    public static final int method1589(int arg0, int arg1) {
        ++field4105;
        int var2 = 2 / ((63 - arg0) / 61);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BII)I")
    private final int method1590(byte arg0, int arg1, int arg2) {
        int var4 = arg1 * 57 + arg2;
        if (arg0 >= -102) {
            field4108 = null;
        }
        int var5 = var4 << 1 ^ var4;
        ++field4103;
        return 4096 - ((var5 * 15731 * var5 + 789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1591(int arg0, byte[] arg1) {
        ++field4097;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class274.method1857(arg1, 0, var3, 0, var2);
        if (arg0 >= -61) {
            field4106 = null;
        }
        return var3;
    }
}
