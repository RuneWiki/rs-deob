import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class108 extends class28 {

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Lvf;")
    public static class265 field1901 = class87.method582(-46, "<col=ff7000>");

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public abstract void method604(int arg0, int arg1);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
    public abstract void method585(int arg0, int arg1);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
    public static final void method716(int arg0, boolean arg1) {
        field1903++;
        if (arg0 == -1 || !class263.field4594[arg0]) {
            return;
        }
        class245.field4276.method1302((byte) 123, arg0);
        if (class178.field3174[arg0] == null) {
            return;
        }
        boolean var2 = arg1;
        for (int var3 = 0; var3 < class178.field3174[arg0].length; var3++) {
            if (class178.field3174[arg0][var3] != null) {
                if (class178.field3174[arg0][var3].field187 == 2) {
                    var2 = false;
                } else {
                    class178.field3174[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class178.field3174[arg0] = null;
        }
        class263.field4594[arg0] = false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V")
    public final void method717(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 10 % ((-arg3 - 15) / 59);
        field1898++;
        int var7 = this.field1900 << 3;
        int var8 = (arg2 << 4) + (var7 & 0xF);
        int var9 = this.field1907 << 3;
        int var10 = (arg4 << 4) + (var9 & 0xF);
        this.method603(var7, var9, var8, var10, arg0, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(IIIII)V")
    public abstract void method586(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILfl;)V")
    public static final void method718(int arg0, class192 arg1) {
        if (arg0 == -152) {
            class245.field4273 = arg1;
            field1899++;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)V")
    public static final void method719(int arg0, int arg1, int arg2, int arg3) {
        field1897++;
        class178 var4 = class188.method1282(arg3, 9, 261360480);
        var4.method1162(true);
        var4.field3170 = arg2;
        if (arg1 != 0) {
            method720(-125, (class265) null, -72, true, (Color) null);
        }
        var4.field3172 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V")
    public abstract void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(IIII)V")
    public abstract void method600(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILvf;IZLjava/awt/Color;)V")
    public static final void method720(int arg0, class265 arg1, int arg2, boolean arg3, Color arg4) {
        field1905++;
        try {
            Graphics var5 = class125.field2241.getGraphics();
            if (class182.field3242 == null) {
                class182.field3242 = new Font("Helvetica", 1, 13);
                class38.field879 = class125.field2241.getFontMetrics(class182.field3242);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class26.field706, class50.field1053);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class149.field2770 == null) {
                    class149.field2770 = class125.field2241.createImage(304, 34);
                }
                Graphics var6 = class149.field2770.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class182.field3242);
                var6.setColor(Color.white);
                arg1.method1773(22, (304 - arg1.method1764(class38.field879, -98)) / 2, var6, false);
                var5.drawImage(class149.field2770, class26.field706 / 2 - 152, class50.field1053 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class26.field706 / 2 - 152;
                int var8 = class50.field1053 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(var7 + (arg2 * 3) + 2, var8 + 2, 300 - arg2 * 3, 30);
                var5.setFont(class182.field3242);
                var5.setColor(Color.white);
                arg1.method1773(var8 + 22, var7 + (-arg1.method1764(class38.field879, -89) + 304) / 2, var5, false);
            }
            if (class64.field1246 != null) {
                var5.setFont(class182.field3242);
                var5.setColor(Color.white);
                class64.field1246.method1773(class50.field1053 / 2 - 26, class26.field706 / 2 - class64.field1246.method1764(class38.field879, -122) / 2, var5, false);
            }
            if (arg0 != -23741) {
                method718(-112, (class192) null);
            }
        } catch (Exception var10) {
            class125.field2241.repaint();
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)V")
    public abstract void method607(int arg0, int arg1);

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
    public static void method721(int arg0) {
        field1901 = null;
        int var1 = -4 % ((arg0 - 4) / 35);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)V")
    public abstract void method601(int arg0, int arg1, int arg2);
}
