import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class225 extends class172 {

    @OriginalMember(owner = "client!en", name = "z", descriptor = "Lo;")
    public class227 field3696 = new class227();

    @OriginalMember(owner = "client!en", name = "E", descriptor = "Lc;")
    public class318 field3701 = new class318();

    @OriginalMember(owner = "client!en", name = "x", descriptor = "Llh;")
    private class63 field3694;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "Lph;")
    public static class229 field3695 = class266.method1858("scrollbar", 0);

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    public static int field3700 = 0;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "Lo;")
    public static class227 field3687 = new class227();

    @OriginalMember(owner = "client!en", name = "F", descriptor = "Lo;")
    public static class227 field3702 = new class227();

    @OriginalMember(owner = "client!en", name = "G", descriptor = "Lph;")
    public static class229 field3703 = class266.method1858("::wm3", 0);

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field3704 = -1;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "Lsi;")
    public static class66 field3706;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "[[[Lkk;")
    public static class72[][][] field3705;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IILje;)V", line = 4)
    private final void method1562(int arg0, int arg1, class120 arg2) {
        field3689++;
        if ((this.field3694.field920[arg2.field2012] & 0x4) != 0 && arg2.field2018 < 0) {
            int var4 = this.field3694.field918[arg2.field2012] / class255.field4264;
            int var5 = (var4 + 1048575 - arg2.field2009) / var4;
            arg2.field2009 = arg1 * var4 + arg2.field2009 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3694.field900[arg2.field2012] == 0) {
                    arg2.field2002 = class144.method1046(arg2.field2020, arg2.field2002.method1065(), arg2.field2002.method1063(), arg2.field2002.method1036());
                } else {
                    arg2.field2002 = class144.method1046(arg2.field2020, arg2.field2002.method1065(), 0, arg2.field2002.method1036());
                    this.field3694.method444((byte) -45, arg2, arg2.field2007.field2990[arg2.field2003] < 0);
                }
                if (arg2.field2007.field2990[arg2.field2003] < 0) {
                    arg2.field2002.method1050(-1);
                }
                arg1 = arg2.field2009 / var4;
            }
        }
        if (arg0 != -1) {
            this.field3696 = (class227) null;
        }
        arg2.field2002.method439(arg1);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([III)V", line = 44)
    public final void method474(int[] arg0, int arg1, int arg2) {
        field3693++;
        this.field3701.method474(arg0, arg1, arg2);
        for (class120 var4 = (class120) this.field3696.method1580((byte) -39); var4 != null; var4 = (class120) this.field3696.method1579((byte) 28)) {
            if (!this.field3694.method457(var4, (byte) -60)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2011 >= var6) {
                        this.method1565((byte) -2, var6, var5, arg0, var5 + var6, var4);
                        var4.field2011 -= var6;
                        break;
                    }
                    this.method1565((byte) -2, var4.field2011, var5, arg0, var5 + var6, var4);
                    var6 -= var4.field2011;
                    var5 += var4.field2011;
                } while (!this.field3694.method480(var5, true, var6, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 84)
    public static void method1563(byte arg0) {
        field3702 = null;
        field3705 = (class72[][][]) null;
        field3703 = null;
        field3706 = null;
        if (arg0 <= 117) {
            method1564(true, 53, 82);
        }
        field3695 = null;
        field3687 = null;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V", line = 102)
    public final void method439(int arg0) {
        field3691++;
        this.field3701.method439(arg0);
        for (class120 var2 = (class120) this.field3696.method1580((byte) -39); var2 != null; var2 = (class120) this.field3696.method1579((byte) 28)) {
            if (!this.field3694.method457(var2, (byte) 111)) {
                int var3 = arg0;
                do {
                    if (var2.field2011 >= var3) {
                        this.method1562(-1, var3, var2);
                        var2.field2011 -= var3;
                        break;
                    }
                    this.method1562(-1, var2.field2011, var2);
                    var3 -= var2.field2011;
                } while (!this.field3694.method480(0, true, var3, var2, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()La;", line = 138)
    public final class172 method459() {
        field3698++;
        class120 var1;
        do {
            var1 = (class120) this.field3696.method1579((byte) 28);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2002 == null);
        return var1.field2002;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZII)V", line = 158)
    public static final void method1564(boolean arg0, int arg1, int arg2) {
        class105.field1788 = class313.field5311[arg2][arg1].field2268;
        class131.field2129 = class313.field5311[arg2][arg1].field2255;
        class148.field2388 = class313.field5311[arg2][arg1].field2247;
        field3699++;
        class117.method884((float) class105.field1788, (float) class131.field2129, (float) class148.field2388);
        if (arg0) {
            method1567(-28, (class229) null, true, (Color) null, (byte) 72);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BII[IILje;)V", line = 174)
    private final void method1565(byte arg0, int arg1, int arg2, int[] arg3, int arg4, class120 arg5) {
        field3686++;
        if (arg0 != -2) {
            field3702 = (class227) null;
        }
        if ((this.field3694.field920[arg5.field2012] & 0x4) != 0 && arg5.field2018 < 0) {
            int var7 = this.field3694.field918[arg5.field2012] / class255.field4264;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field2009) / var7;
                if (var8 > arg1) {
                    arg5.field2009 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                int var9 = 262144 / var7;
                arg5.field2002.method474(arg3, arg2, var8);
                arg5.field2009 += var7 * var8 - 1048576;
                int var10 = class255.field4264 / 100;
                class144 var11 = arg5.field2002;
                if (var9 < var10) {
                    var10 = var9;
                }
                if (this.field3694.field900[arg5.field2012] == 0) {
                    arg5.field2002 = class144.method1046(arg5.field2020, var11.method1065(), var11.method1063(), var11.method1036());
                } else {
                    arg5.field2002 = class144.method1046(arg5.field2020, var11.method1065(), 0, var11.method1036());
                    this.field3694.method444((byte) -56, arg5, arg5.field2007.field2990[arg5.field2003] < 0);
                    arg5.field2002.method1033(var10, var11.method1063());
                }
                arg2 += var8;
                if (arg5.field2007.field2990[arg5.field2003] < 0) {
                    arg5.field2002.method1050(-1);
                }
                var11.method1030(var10);
                var11.method474(arg3, arg2, arg4 - arg2);
                if (var11.method1043()) {
                    this.field3701.method2152(var11);
                }
            }
        }
        arg5.field2002.method474(arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()La;", line = 238)
    public final class172 method463() {
        field3690++;
        class120 var1 = (class120) this.field3696.method1580((byte) -39);
        if (var1 == null) {
            return null;
        } else if (var1.field2002 == null) {
            return this.method459();
        } else {
            return var1.field2002;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()I", line = 259)
    public final int method451() {
        field3692++;
        return 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILri;)Lri;", line = 286)
    public static final class301 method1566(int arg0, class301 arg1) {
        if (arg0 >= -112) {
            field3704 = -104;
        }
        field3697++;
        class301 var2 = client.method2172(arg1);
        if (var2 == null) {
            var2 = arg1.field5028;
        }
        return var2;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Llh;)V", line = 384)
    public class225(class63 arg0) {
        this.field3694 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILph;ZLjava/awt/Color;B)V", line = 314)
    public static final void method1567(int arg0, class229 arg1, boolean arg2, Color arg3, byte arg4) {
        try {
            Graphics var5 = class214.field3526.getGraphics();
            if (class115.field1955 == null) {
                class115.field1955 = new Font("Helvetica", 1, 13);
                class228.field3744 = class214.field3526.getFontMetrics(class115.field1955);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class273.field4567, class266.field4484);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class259.field4312 == null) {
                    class259.field4312 = class214.field3526.createImage(304, 34);
                }
                Graphics var6 = class259.field4312.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                if (arg4 < 12) {
                    method1564(false, 81, -100);
                }
                var6.setFont(class115.field1955);
                var6.setColor(Color.white);
                arg1.method1603((304 - arg1.method1645(class228.field3744, -26)) / 2, 0, 22, var6);
                var5.drawImage(class259.field4312, class273.field4567 / 2 - 152, class266.field4484 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class266.field4484 / 2 - 18;
                int var9 = class273.field4567 / 2 - 152;
                var5.setColor(arg3);
                var5.drawRect(var9, var8, 303, 33);
                var5.fillRect(var9 + 2, var8 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var8 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class115.field1955);
                var5.setColor(Color.white);
                arg1.method1603((304 - arg1.method1645(class228.field3744, -70)) / 2 + var9, 0, var8 + 22, var5);
            }
            if (class239.field3947 != null) {
                var5.setFont(class115.field1955);
                var5.setColor(Color.white);
                class239.field3947.method1603(class273.field4567 / 2 - (class239.field3947.method1645(class228.field3744, -15) / 2), 0, class266.field4484 / 2 - 26, var5);
            }
        } catch (Exception var12) {
            class214.field3526.repaint();
        }
        field3688++;
    }
}
