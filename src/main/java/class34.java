import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class34 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field742 = 1;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field746 = -1;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lrd;")
    public static class173 field745 = class133.method843("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 30);

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lrd;")
    public static class173 field748 = class133.method843("nicht hergestellt werden)3", 12);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field739 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lrd;")
    public static class173 field750 = class133.method843("<col=ffffff>", 80);

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field741 = 1;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lbc;")
    public static class14 field749;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lra;")
    public static class170 field738;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[I")
    public static int[] field751;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method266(int arg0) {
        field751 = null;
        field738 = null;
        if (arg0 == 33) {
            field748 = null;
            field745 = null;
            field750 = null;
            field749 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
    public static final boolean method267(int arg0, int arg1) {
        if (arg1 != -14712) {
            field745 = null;
        }
        field747++;
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)J")
    public static final long method268(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        return var3 == null || var3.field1954 == null ? 0L : var3.field1954.field487;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILbc;)V")
    public static final void method269(int arg0, class14 arg1) {
        field740++;
        if (arg0 != 16024) {
            method266(68);
        }
        class153.field2887 = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method270(Object arg0, boolean arg1, int arg2) {
        field744++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class198.method1315(18576, var3) : var3;
        } else {
            if (arg2 > -48) {
                field739 = 106;
            }
            if (!(arg0 instanceof class94)) {
                throw new IllegalArgumentException();
            }
            class94 var4 = (class94) arg0;
            return var4.method594(true);
        }
    }
}
