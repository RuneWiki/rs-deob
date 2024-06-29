import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public abstract class class19 {

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "Ll;")
    public static class22 field183 = class33.method229("Mini)2Game", -63);

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "I")
    public static int field186 = 0;

    @OriginalMember(owner = "mapview!ja", name = "i", descriptor = "Ll;")
    public static class22 field188 = class33.method229("mapscene", -117);

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "Ll;")
    public static class22 field182 = class33.method229("Next page", -125);

    @OriginalMember(owner = "mapview!ja", name = "l", descriptor = "Ll;")
    public static class22 field191 = class33.method229("Enter place name to find", -107);

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "mapview!ja", name = "m", descriptor = "Ll;")
    public static class22 field192 = class33.method229("null", -60);

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "Lga;")
    public static class14 field180 = null;

    @OriginalMember(owner = "mapview!ja", name = "o", descriptor = "Ll;")
    public static class22 field194 = class33.method229("Platebody Shop", -60);

    @OriginalMember(owner = "mapview!ja", name = "p", descriptor = "Ll;")
    public static class22 field195 = class33.method229("Spice Shop", -76);

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "mapview!ja", name = "r", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field185;

    @OriginalMember(owner = "mapview!ja", name = "n", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field193;

    @OriginalMember(owner = "mapview!ja", name = "j", descriptor = "[I")
    public int[] field189;

    @OriginalMember(owner = "mapview!ja", name = "q", descriptor = "[I")
    public static int[] field196;

    @OriginalMember(owner = "mapview!ja", name = "k", descriptor = "[Lb;")
    public static class3[] field190;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I)V", line = 15)
    public static void method113(int arg0) {
        field193 = null;
        field195 = null;
        field183 = null;
        field196 = null;
        field191 = null;
        field192 = null;
        if (arg0 == 0) {
            field188 = null;
            field182 = null;
            field190 = null;
            field194 = null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Ll;ILea;Ll;)Lf;", line = 54)
    public static final class11 method114(class22 arg0, int arg1, class10 arg2, class22 arg3) {
        if (arg1 != 0) {
            method115(null, null);
        }
        int var4 = arg2.method41(true, arg3);
        int var5 = arg2.method50(var4, (byte) 114, arg0);
        return class8.method37(arg2, var4, (byte) -73, var5);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lka;", line = 73)
    public static final class21 method115(Throwable arg0, String arg1) {
        class21 var2;
        if (arg0 instanceof class21) {
            var2 = (class21) arg0;
            var2.field205 = var2.field205 + ' ' + arg1;
        } else {
            var2 = new class21(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(ILjava/awt/Component;II)Lja;", line = 89)
    public static final class19 method116(int arg0, Component arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            method115(null, null);
        }
        try {
            Class var4 = Class.forName("oa");
            class19 var5 = (class19) var4.getDeclaredConstructor().newInstance();
            var5.method117((byte) -74, arg0, arg1, arg2);
            return var5;
        } catch (Throwable var8) {
            class37 var7 = new class37();
            var7.method117((byte) -27, arg0, arg1, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "()V", line = 115)
    protected class19() {
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(I)V", line = 125)
    public final void method118(int arg0) {
        if (arg0 != 0) {
            method115(null, null);
        }
        class31.method222(this.field189, this.field184, this.field187);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II)I", line = 135)
    public static int method119(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
    public abstract void method112(byte arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public abstract void method117(byte arg0, int arg1, Component arg2, int arg3);
}
