import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class286 extends class170 {

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "Lmr;")
    public class611 field3973 = new class611();

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "Lcaa;")
    public class636 field3983 = new class636();

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "Leg;")
    private class317 field3975;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "Lfw;")
    public static class215 field3978 = new class215();

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "()I", line = 5)
    public final int method1054() {
        field3981++;
        return 0;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZLmd;II[I)V", line = 14)
    private final void method1820(int arg0, boolean arg1, class622 arg2, int arg3, int arg4, int[] arg5) {
        field3976++;
        if (!arg1) {
            this.method1820(-14, true, null, 107, 39, null);
        }
        if ((this.field3975.field4292[arg2.field8833] & 0x4) != 0 && arg2.field8846 < 0) {
            int var7 = this.field3975.field4280[arg2.field8833] / class132.field1821;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field8848) / var7;
                if (var8 > arg3) {
                    arg2.field8848 += arg3 * var7;
                    break;
                }
                arg2.field8855.method1088(arg5, arg4, var8);
                arg2.field8848 += var7 * var8 - 1048576;
                arg4 += var8;
                arg3 -= var8;
                int var9 = class132.field1821 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class149 var11 = arg2.field8855;
                if (this.field3975.field4276[arg2.field8833] == 0) {
                    arg2.field8855 = class149.method1064(arg2.field8857, var11.method1050(), var11.method1045(), var11.method1059());
                } else {
                    arg2.field8855 = class149.method1064(arg2.field8857, var11.method1050(), 0, var11.method1059());
                    this.field3975.method1963(8, arg2, arg2.field8837.field1456[arg2.field8836] < 0);
                    arg2.field8855.method1062(var9, var11.method1045());
                }
                if (arg2.field8837.field1456[arg2.field8836] < 0) {
                    arg2.field8855.method1075(-1);
                }
                var11.method1071(var9);
                var11.method1088(arg5, arg4, arg0 - arg4);
                if (var11.method1074()) {
                    this.field3983.method3657(var11);
                }
            }
        }
        arg2.field8855.method1088(arg5, arg4, arg3);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILmd;)V", line = 78)
    private final void method1821(int arg0, int arg1, class622 arg2) {
        if ((this.field3975.field4292[arg2.field8833] & 0x4) != 0 && arg2.field8846 < 0) {
            int var4 = this.field3975.field4280[arg2.field8833] / class132.field1821;
            int var5 = (var4 + 1048575 - arg2.field8848) / var4;
            arg2.field8848 = arg1 * var4 + arg2.field8848 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3975.field4276[arg2.field8833] == 0) {
                    arg2.field8855 = class149.method1064(arg2.field8857, arg2.field8855.method1050(), arg2.field8855.method1045(), arg2.field8855.method1059());
                } else {
                    arg2.field8855 = class149.method1064(arg2.field8857, arg2.field8855.method1050(), 0, arg2.field8855.method1059());
                    this.field3975.method1963(8, arg2, arg2.field8837.field1456[arg2.field8836] < 0);
                }
                if (arg2.field8837.field1456[arg2.field8836] < 0) {
                    arg2.field8855.method1075(-1);
                }
                arg1 = arg2.field8848 / var4;
            }
        }
        if (arg0 != 2) {
            method1823(-105);
        }
        field3971++;
        arg2.field8855.method1083(arg1);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V", line = 119)
    public final void method1083(int arg0) {
        field3974++;
        this.field3983.method1083(arg0);
        for (class622 var2 = (class622) this.field3973.method3565(-95); var2 != null; var2 = (class622) this.field3973.method3561((byte) 68)) {
            if (!this.field3975.method1957(var2, (byte) 83)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field8845) {
                        this.method1821(2, var3, var2);
                        var2.field8845 -= var3;
                        break;
                    }
                    this.method1821(2, var2.field8845, var2);
                    var3 -= var2.field8845;
                } while (!this.field3975.method1973(121, var2, 0, var3, null));
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "()Los;", line = 155)
    public final class170 method1065() {
        field3982++;
        class622 var1 = (class622) this.field3973.method3565(104);
        if (var1 == null) {
            return null;
        } else if (var1.field8855 == null) {
            return this.method1086();
        } else {
            return var1.field8855;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/awt/Color;IBLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V", line = 177)
    public static final void method1822(Color arg0, int arg1, byte arg2, Color arg3, Color arg4, String arg5) {
        try {
            Graphics var6 = class95.field1383.getGraphics();
            if (class724.field10164 == null) {
                class724.field10164 = new Font("Helvetica", 1, 13);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class390.field5621 == null) {
                    class390.field5621 = class95.field1383.createImage(class68.field1042, class565.field8187);
                }
                Graphics var7 = class390.field5621.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class68.field1042, class565.field8187);
                int var8 = class68.field1042 / 2 - 152;
                int var9 = class565.field8187 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + var8 + 2, var9 - -2, 300 - (arg1 * 3), 30);
                if (arg2 != -50) {
                    field3978 = null;
                }
                var7.setFont(class724.field10164);
                var7.setColor(arg3);
                var7.drawString(arg5, (304 - (arg5.length() * 6)) / 2 + var8, var9 - -22);
                if (class211.field3163 != null) {
                    var7.setFont(class724.field10164);
                    var7.setColor(arg3);
                    var7.drawString(class211.field3163, class68.field1042 / 2 - (class211.field3163.length() * 6 / 2), class565.field8187 / 2 - 26);
                }
                var6.drawImage(class390.field5621, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class68.field1042, class565.field8187);
                int var10 = class68.field1042 / 2 - 152;
                int var11 = class565.field8187 / 2 - 18;
                var6.setColor(arg4);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg0);
                var6.fillRect(var10 + 2, var11 - -2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg1 * 3 + var10 + 2, var11 + 2, 300 - (arg1 * 3), 30);
                var6.setFont(class724.field10164);
                var6.setColor(arg3);
                if (class211.field3163 != null) {
                    var6.setFont(class724.field10164);
                    var6.setColor(arg3);
                    var6.drawString(class211.field3163, class68.field1042 / 2 - (class211.field3163.length() * 6 / 2), class565.field8187 / 2 + -26);
                }
                var6.drawString(arg5, var10 + ((304 - arg5.length() * 6) / 2), var11 - -22);
            }
        } catch (Exception var13) {
            class95.field1383.repaint();
        }
        field3977++;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "()Los;", line = 265)
    public final class170 method1086() {
        field3979++;
        class622 var1;
        do {
            var1 = (class622) this.field3973.method3561((byte) 100);
            if (var1 == null) {
                return null;
            }
        } while (var1.field8855 == null);
        return var1.field8855;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V", line = 290)
    public static void method1823(int arg0) {
        if (arg0 != 22368) {
            field3980 = -35;
        }
        field3978 = null;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Leg;)V", line = 349)
    public class286(class317 arg0) {
        this.field3975 = arg0;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "([III)V", line = 308)
    public final void method1088(int[] arg0, int arg1, int arg2) {
        field3972++;
        this.field3983.method1088(arg0, arg1, arg2);
        for (class622 var4 = (class622) this.field3973.method3565(-101); var4 != null; var4 = (class622) this.field3973.method3561((byte) 118)) {
            if (!this.field3975.method1957(var4, (byte) 114)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field8845 >= var5) {
                        this.method1820(var5 + var6, true, var4, var5, var6, arg0);
                        var4.field8845 -= var5;
                        break;
                    }
                    this.method1820(var5 + var6, true, var4, var4.field8845, var6, arg0);
                    var5 -= var4.field8845;
                    var6 += var4.field8845;
                } while (!this.field3975.method1973(81, var4, var6, var5, arg0));
            }
        }
    }
}
