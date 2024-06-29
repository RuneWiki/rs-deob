import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class74 {

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "B")
    public byte field956 = 0;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "S")
    public short field960;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "S")
    public short field966;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "B")
    public byte field958;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "B")
    public byte field961;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "S")
    public static short field979 = 256;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field955 = -1;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "B")
    public byte field959;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "B")
    public byte field964;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "B")
    public byte field974;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "B")
    public byte field978;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "Lp;")
    public class120 field975;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "Lp;")
    public class120 field977;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "Ljl;")
    public class147 field968;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "Lqo;")
    public class16 field969;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Lrm;")
    public class235 field957;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "Lkq;")
    public class353 field970;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "Lfl;")
    public class441 field967;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "Lfl;")
    public class441 field976;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lls;")
    public class74 field963;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "S")
    public short field971;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "Z")
    public boolean field962;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "Z")
    public boolean field972;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "Z")
    public boolean field973;

    static {
        new class349("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(III)V", line = 7)
    public class74(int arg0, int arg1, int arg2) {
        this.field960 = (short) arg2;
        this.field966 = (short) arg1;
        this.field961 = this.field958 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ltj;III)Lne;", line = 22)
    public static final class173 method445(class108 arg0, int arg1, int arg2, int arg3) {
        field965++;
        class130 var4 = new class130(arg0.method643(arg3, arg1, true));
        if (arg2 != 256) {
            field955 = -25;
        }
        class173 var5 = new class173(arg1, var4.method843(arg2 - 345), var4.method843(arg2 ^ 0xFFFFFEAC), var4.method815(true), var4.method815(true), var4.method837(true) == 1, var4.method837(true), var4.method837(true));
        int var6 = var4.method837(true);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field2440.method2756(47, new class260(var4.method837(true), var4.method798(false), var4.method798(false), var4.method798(false), var4.method798(false), var4.method798(false), var4.method798(false), var4.method798(false), var4.method798(false)));
        }
        var5.method1234((byte) -118);
        return var5;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)I", line = 69)
    public static final int method446(boolean arg0, int arg1) {
        field980++;
        long var2 = class18.method107(-16145);
        if (arg1 != 0) {
            return 118;
        }
        for (class312 var4 = arg0 ? (class312) class419.field6014.method1383(arg1 ^ 0x67) : (class312) class419.field6014.method1378((byte) 98); var4 != null; var4 = (class312) class419.field6014.method1378((byte) 98)) {
            if (var2 > (var4.field4612 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4612 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field6070;
                    class150.field2254[var5] = class169.field2397[var5];
                    var4.method2660((byte) 112);
                    return var5;
                }
                var4.method2660((byte) 121);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V", line = 109)
    public final void method447(byte arg0) {
        field954++;
        while (this.field970 != null) {
            class353 var2 = this.field970.field5127;
            this.field970.method2311(0);
            this.field970 = var2;
        }
        this.field956 = 0;
        if (arg0 <= 27) {
            method445((class108) null, -114, -40, 88);
        }
    }
}
