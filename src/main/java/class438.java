import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class438 implements class209 {

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lwd;")
    private class275 field6141;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lni;")
    private class522 field6135;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lufa;")
    private class680 field6137;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6140;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public final void method184(byte arg0) {
        field6138++;
        if (arg0 == -43) {
            this.field6137 = class79.method594(this.field6141.field3676, this.field6135, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
    public final boolean method183(int arg0) {
        field6136++;
        if (arg0 != 14017) {
            this.field6135 = null;
        }
        return this.field6135.method2882(-77, this.field6141.field3676);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Z")
    public static final boolean method2478(int arg0, int arg1, int arg2) {
        if (arg0 != 24578) {
            method2478(-22, 97, 98);
        }
        field6133++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static void method2479(int arg0) {
        if (arg0 != 7681) {
            method2478(-63, 99, -33);
        }
        field6140 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lil;I)I")
    public static final int method2480(class7 arg0, int arg1) {
        field6134++;
        if (arg1 != 0) {
            method2480(null, 3);
        }
        if (class365.field4838 == arg0) {
            return 7681;
        } else if (class199.field2365 == arg0) {
            return 8448;
        } else if (class94.field1233 == arg0) {
            return 34165;
        } else if (class669.field9307 == arg0) {
            return 260;
        } else if (class308.field4182 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZB)V")
    public final void method182(boolean arg0, byte arg1) {
        if (arg0) {
            int var3 = class546.field7710 > class751.field10419 ? class546.field7710 : class751.field10419;
            int var4 = class396.field5620 >= class512.field6932 ? class396.field5620 : class512.field6932;
            int var5 = this.field6137.method666();
            int var6 = this.field6137.method663();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var8 = var4 * var5 / var6;
                var10 = 0;
                var9 = var4;
                var7 = (var3 - var8) / 2;
            }
            this.field6137.method3855(var7, var10, var8, var9);
        }
        if (arg1 < -81) {
            field6132++;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lni;Lwd;)V")
    public class438(class522 arg0, class275 arg1) {
        this.field6141 = arg1;
        this.field6135 = arg0;
    }
}
