import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class102 extends class64 {

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "Lsg;")
    public static class169 field1869 = class165.method1060("<img=0>", 1536);

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "Lsg;")
    public static class169 field1872 = class165.method1060("(Z", 1536);

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(BI)Lkc;")
    public static final class93 method595(byte arg0, int arg1) {
        ++field1870;
        class93 var2 = (class93) class116.field2144.method1206((long) arg1, -24742);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class13.field313.method552(arg1, 16, 0);
            if (arg0 < 7) {
                method595((byte) -66, -81);
            }
            class93 var4 = new class93();
            if (var3 != null) {
                var4.method543(new class127(var3), -1);
            }
            class116.field2144.method1208((long) arg1, 94, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method596(byte arg0) {
        field1872 = null;
        field1869 = null;
        int var1 = -68 % ((-43 - arg0) / 56);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        int[] var3 = super.field1192.method19((byte) 126, arg0);
        ++field1873;
        if (arg1 != 19) {
            method596((byte) 98);
        }
        if (super.field1192.field75) {
            for (int var4 = 0; ~var4 > ~class147.field2715; ++var4) {
                var3[var4] = class185.field3607[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/Color;Lsg;I)V")
    public static final void method597(int arg0, Color arg1, class169 arg2, int arg3) {
        ++field1874;
        try {
            Graphics var4 = class1.field4.getGraphics();
            if (class125.field2284 == null) {
                class125.field2284 = new Font("Helvetica", 1, 13);
                class193.field3808 = class1.field4.getFontMetrics(class125.field2284);
            }
            if (class180.field3513) {
                class180.field3513 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class135.field2519, class9.field246);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class125.field2293 == null) {
                    class125.field2293 = class1.field4.createImage(304, 34);
                }
                Graphics var5 = class125.field2293.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, arg3, -(arg0 * 3) + 300, 30);
                var5.setFont(class125.field2284);
                var5.setColor(Color.white);
                arg2.method1114((-arg2.method1122(class193.field3808, (byte) 50) + 304) / 2, var5, 18898, 22);
                var4.drawImage(class125.field2293, class135.field2519 / 2 + -152, class9.field246 / 2 + -18, (ImageObserver) null);
            } catch (Exception var8) {
                int var6 = class135.field2519 / 2 + -152;
                int var7 = class9.field246 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 + 2, -(arg0 * 3) + 300, 30);
                var4.setFont(class125.field2284);
                var4.setColor(Color.white);
                arg2.method1114(var6 - -((304 + -arg2.method1122(class193.field3808, (byte) 50)) / 2), var4, 18898, var7 + 22);
            }
        } catch (Exception var9) {
            class1.field4.repaint();
        }
    }
}
