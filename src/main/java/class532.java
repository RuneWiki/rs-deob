import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class532 {

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "B")
    public byte field7826 = 0;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "B")
    public byte field7834;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "B")
    public byte field7842;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "S")
    public short field7837;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "S")
    public short field7819;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "[I")
    public static int[] field7821 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field7816 = 0;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "[I")
    public static int[] field7843;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "B")
    public byte field7818;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "B")
    public byte field7832;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "B")
    public byte field7840;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "B")
    public byte field7841;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Liq;")
    public class151 field7825;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "Lin;")
    public class167 field7838;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "Loa;")
    public class168 field7822;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "Loa;")
    public class168 field7830;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "Luc;")
    public class201 field7828;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "Lvk;")
    public class334 field7836;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "Lwr;")
    public class532 field7829;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "Lbp;")
    public class63 field7833;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "Lbp;")
    public class63 field7835;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "S")
    public short field7839;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "Z")
    public boolean field7817;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Z")
    public boolean field7827;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "Z")
    public boolean field7831;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method3154(int arg0) {
        field7843 = null;
        field7821 = null;
        if (arg0 > -72) {
            method3154(-125);
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(III)V")
    public class532(int arg0, int arg1, int arg2) {
        this.field7842 = this.field7834 = (byte) arg0;
        this.field7837 = (short) arg1;
        this.field7819 = (short) arg2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method3155(String arg0, int arg1, int arg2, String arg3) {
        class61.field899 = arg1;
        class225.field3176 = 2;
        if (arg2 <= -71) {
            field7820++;
            class508.method3012(arg0, -16759, arg3);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public final void method3156(int arg0) {
        field7824++;
        while (this.field7828 != null) {
            class201 var2 = this.field7828.field2918;
            this.field7828.method1307((byte) 83);
            this.field7828 = var2;
        }
        if (arg0 == 2) {
            this.field7826 = 0;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lza;B)V")
    public static final void method3157(class295 arg0, byte arg1) {
        field7823++;
        if (class279.field3799.method3146((byte) -10) == 0) {
            return;
        }
        if (arg1 <= 34) {
            method3154(-100);
        }
        if (class195.field2849 == 0) {
            for (class332 var2 = (class332) class279.field3799.method3137(0); var2 != null; var2 = (class332) class279.field3799.method3132(0)) {
                class534.field7872.method3086(arg0, var2.field4520, false, var2.field4511, arg0, var2.field4514, false, var2.field4512, var2.field4513, -76, class347.field4988, var2.field4518 ? class81.field1158.field7015 : null);
                var2.method2791((byte) 112);
            }
            class157.method1127(1508614222);
            return;
        }
        if (class433.field6273 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class433.field6273 = class295.method1715(0, 0, var3, class239.field3307, class346.field4985, (byte) 53);
            class200.field2913 = class433.field6273.method529(class130.method938(class454.field6637, 0, class300.field4107, (byte) 32), class396.method2347(class509.field7453, class454.field6637, 0), true);
        }
        for (class332 var4 = (class332) class279.field3799.method3137(0); var4 != null; var4 = (class332) class279.field3799.method3132(0)) {
            class534.field7872.method3086(arg0, var4.field4520, false, var4.field4511, class433.field6273, var4.field4514, false, var4.field4512, var4.field4513, -95, class200.field2913, var4.field4518 ? class81.field1158.field7015 : null);
            var4.method2791((byte) 112);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILdc;)I")
    public static final int method3158(int arg0, class16 arg1) {
        field7815++;
        if (arg1.field220 == 0) {
            return 0;
        }
        if (arg1.field202 != -1) {
            class16 var2 = null;
            if (arg1.field202 < 32768) {
                class326 var3 = (class326) class281.field3826.method1592((byte) -25, (long) arg1.field202);
                if (var3 != null) {
                    var2 = var3.field4455;
                }
            } else if (arg1.field202 >= 32768) {
                var2 = class45.field642[arg1.field202 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field6284 - var2.field6284;
                int var5 = arg1.field6287 - var2.field6287;
                if (var4 != 0 || var5 != 0) {
                    arg1.method110((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, (byte) -122);
                }
            }
        }
        if (arg0 != -5501) {
            return 8;
        }
        if ((arg1 instanceof class487)) {
            class487 var9 = (class487) arg1;
            if (var9.field7003 != -1 && (var9.field265 == 0 || var9.field266 > 0)) {
                var9.method110(var9.field7003, (byte) -90);
                var9.field7003 = -1;
            }
        } else if (arg1 instanceof class209) {
            class209 var6 = (class209) arg1;
            if (var6.field2979 != -1 && (var6.field265 == 0 || var6.field266 > 0)) {
                int var7 = var6.field6284 - ((var6.field2979 - class110.field1775 - class110.field1775) * 64);
                int var8 = var6.field6287 - ((var6.field2983 - class399.field5727 - class399.field5727) * 64);
                if (var7 != 0 || var8 != 0) {
                    var6.method110((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, (byte) -93);
                }
                var6.field2979 = -1;
            }
        }
        return arg1.method112((byte) 119);
    }

    static {
        new class157("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field7843 = new int[] { 1, 2, 4, 8 };
    }
}
