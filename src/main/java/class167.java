import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class167 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lrc;")
    public static class155 field3441 = new class155(30);

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lea;")
    public static class38 field3445 = class9.method46((byte) 122, "0(U");

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3446 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lk;")
    public static class89[] field3447;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static final void method1188(int arg0) {
        if (arg0 != 2) {
            return;
        }
        if (class52.field1339 != null) {
            class52.field1339.method444(101);
        }
        if (class202.field3991 != null) {
            class202.field3991.method444(arg0 ^ 0x60);
        }
        field3444++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)V")
    public static final void method1189(long arg0, int arg1) {
        field3442++;
        if (arg0 == 0L || arg1 != 122) {
            return;
        }
        for (int var3 = 0; var3 < class22.field468; var3++) {
            if (class166.field3430[var3] == arg0) {
                class22.field468--;
                for (int var4 = var3; var4 < class22.field468; var4++) {
                    class161.field3357[var4] = class161.field3357[var4 + 1];
                    class22.field471[var4] = class22.field471[var4 + 1];
                    class166.field3430[var4] = class166.field3430[var4 + 1];
                    class178.field3600[var4] = class178.field3600[var4 + 1];
                }
                class181.field3653 = class192.field3796;
                class102.field2301++;
                class111.field2483.method169(arg1 - 1494101239, 122);
                class111.field2483.method480(arg0, (byte) -128);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static void method1190(int arg0) {
        field3447 = null;
        field3441 = null;
        if (arg0 <= 45) {
            field3447 = null;
        }
        field3445 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lea;Ljava/awt/Color;II)V")
    public static final void method1191(class38 arg0, Color arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class51.field1313.getGraphics();
            if (class205.field4044 == null) {
                class205.field4044 = new Font("Helvetica", 1, 13);
                class202.field3984 = class51.field1313.getFontMetrics(class205.field4044);
            }
            if (class11.field235) {
                class11.field235 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class172.field3528, class117.field2554);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class42.field922 == null) {
                    class42.field922 = class51.field1313.createImage(304, 34);
                }
                Graphics var5 = class42.field922.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, arg2, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class205.field4044);
                var5.setColor(Color.white);
                arg0.method284(var5, arg2 + 47, (-arg0.method278(class202.field3984, 123) + 304) / 2, 22);
                var4.drawImage(class42.field922, class172.field3528 / 2 - 152, class117.field2554 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class172.field3528 / 2 - 152;
                int var7 = class117.field2554 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 - -1, 301, 31);
                var4.fillRect(var6 + arg3 * 3 + 2, var7 - -2, 300 - arg3 * 3, 30);
                var4.setFont(class205.field4044);
                var4.setColor(Color.white);
                arg0.method284(var4, arg2 + 47, (-arg0.method278(class202.field3984, 113) + 304) / 2 + var6, var7 + 22);
            }
        } catch (Exception var9) {
            class51.field1313.repaint();
        }
        field3440++;
    }
}
