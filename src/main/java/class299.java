import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class299 {

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "Lmq;")
    private class472 field4028 = new class472(64);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Ljn;")
    private class668 field4021;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lwo;")
    public static class690 field4025 = new class690(38, 12);

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "Lsq;")
    public static class161 field4031 = new class161(5, 1);

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Ljk;")
    public static class585 field4034 = new class585(3, 4);

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "[I")
    public static int[] field4035 = new int[6];

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "[Z")
    public static boolean[] field4032;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V", line = 5)
    public final void method1774(boolean arg0) {
        field4030++;
        class472 var2 = this.field4028;
        synchronized (this.field4028) {
            if (arg0) {
                this.field4028.method2776(false);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)Z", line = 18)
    public static final boolean method1775(boolean arg0, int arg1) {
        if (!arg0) {
            method1777(74, 57, true, true);
        }
        field4029++;
        for (class377 var2 = (class377) class34.field679.method1132((byte) -107); var2 != null; var2 = (class377) class34.field679.method1134(8446)) {
            if (class660.method3740((byte) 123, var2.field5062) && (long) arg1 == var2.field5064) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 41)
    public static void method1776(byte arg0) {
        int var1 = -39 / ((arg0 - 30) / 51);
        field4032 = null;
        field4031 = null;
        field4035 = null;
        field4034 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZZ)Ljn;", line = 63)
    public static final class668 method1777(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg3) {
            return null;
        }
        field4023++;
        class171 var4 = null;
        if (class662.field9390 != null) {
            var4 = new class171(arg0, class662.field9390, class466.field6498[arg0], 1000000);
        }
        class335.field4448[arg0] = class394.field5565.method2692(class504.field7034, -29210, arg0, var4);
        class335.field4448[arg0].method1306((byte) 1);
        return new class668(class335.field4448[arg0], arg2, arg1);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Lgr;", line = 85)
    public final class401 method1778(int arg0, int arg1) {
        field4022++;
        class472 var3 = this.field4028;
        class401 var4;
        synchronized (this.field4028) {
            var4 = (class401) this.field4028.method2766(-125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field4021;
        byte[] var6;
        synchronized (this.field4021) {
            var6 = this.field4021.method3800(arg0, arg1, (byte) -92);
        }
        class401 var7 = new class401();
        if (var6 != null) {
            var7.method2424(new class389(var6), 107);
        }
        var7.method2423(arg1 ^ 0x22);
        class472 var8 = this.field4028;
        synchronized (this.field4028) {
            this.field4028.method2772(var7, true, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V", line = 114)
    public final void method1779(byte arg0, int arg1) {
        class472 var3 = this.field4028;
        synchronized (this.field4028) {
            this.field4028.method2777(arg1, 107);
            if (arg0 != 94) {
                method1783(-126, -33, 48);
            }
        }
        field4026++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lip;Ljk;I)Leba;", line = 128)
    public static final class543 method1780(class656 arg0, class585 arg1, int arg2) {
        field4027++;
        class543 var3 = class527.method3106(0);
        var3.field7875 = arg1;
        var3.field7878 = arg1.field8491;
        if (var3.field7878 == -1) {
            var3.field7872 = new class5(260);
        } else if (var3.field7878 == -2) {
            var3.field7872 = new class5(10000);
        } else if (var3.field7878 <= 18) {
            var3.field7872 = new class5(20);
        } else if (var3.field7878 > 98) {
            var3.field7872 = new class5(260);
        } else {
            var3.field7872 = new class5(100);
        }
        var3.field7872.method29(false, arg0);
        var3.field7872.method35(var3.field7875.method3395(21811), 2);
        var3.field7874 = 0;
        return arg2 <= 33 ? null : var3;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Color;ILjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;)V", line = 163)
    public static final void method1781(Color arg0, int arg1, String arg2, int arg3, Color arg4, Color arg5) {
        try {
            Graphics var6 = class646.field9190.getGraphics();
            if (class675.field9683 == null) {
                class675.field9683 = new Font("Helvetica", 1, 13);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class228.field2955 == null) {
                    class228.field2955 = class646.field9190.createImage(class467.field6533, class300.field4038);
                }
                Graphics var7 = class228.field2955.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class467.field6533, class300.field4038);
                int var8 = class467.field6533 / 2 - 152;
                int var9 = class300.field4038 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 - -1, 301, 31);
                var7.fillRect(arg1 + var8 + (arg3 * 3), var9 + 2, 300 - arg3 * 3, 30);
                var7.setFont(class675.field9683);
                var7.setColor(arg4);
                var7.drawString(arg2, (304 - arg2.length() * 6) / 2 + var8, var9 + 22);
                if (class364.field4903 != null) {
                    var7.setFont(class675.field9683);
                    var7.setColor(arg4);
                    var7.drawString(class364.field4903, class467.field6533 / 2 - class364.field4903.length() * 6 / 2, class300.field4038 / 2 + -26);
                }
                var6.drawImage(class228.field2955, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class467.field6533, class300.field4038);
                int var10 = class467.field6533 / 2 - 152;
                int var11 = class300.field4038 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg0);
                var6.fillRect(var10 + 2, var11 + 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg3 * 3 + var10 + 2, var11 + 2, 300 - (arg3 * 3), 30);
                var6.setFont(class675.field9683);
                var6.setColor(arg4);
                if (class364.field4903 != null) {
                    var6.setFont(class675.field9683);
                    var6.setColor(arg4);
                    var6.drawString(class364.field4903, class467.field6533 / 2 - class364.field4903.length() * 6 / 2, class300.field4038 / 2 - 26);
                }
                var6.drawString(arg2, (304 - (arg2.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class646.field9190.repaint();
        }
        field4033++;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V", line = 251)
    public final void method1782(byte arg0) {
        field4024++;
        if (arg0 < 87) {
            method1777(21, 114, true, true);
        }
        class472 var2 = this.field4028;
        synchronized (this.field4028) {
            this.field4028.method2778((byte) 119);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)V", line = 265)
    public static final void method1783(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        if (var3 != null) {
            class328.method1909(var3.field6221);
            if (var3.field6221 != null) {
                var3.field6221 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 286)
    public class299(class90 arg0, int arg1, class668 arg2) {
        this.field4021 = arg2;
        if (this.field4021 != null) {
            this.field4021.method3805(35, false);
        }
    }
}
