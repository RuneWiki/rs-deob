import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public abstract class class21 {

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Ld;")
    public static class7 field202 = class37.method242("download", 1333943984);

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "I")
    public static int field212 = 0;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Ld;")
    public static class7 field206 = class37.method242("world", 1333943984);

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "I")
    public static volatile int field211 = 0;

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "Ld;")
    public static class7 field207 = class37.method242("Combat Training", 1333943984);

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Ld;")
    public static class7 field209 = class37.method242("Loading )3)3)3", 1333943984);

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Ld;")
    public static class7 field208 = class37.method242("Apothecary", 1333943984);

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "[Z")
    public static boolean[] field205 = new boolean[112];

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "Ld;")
    public static class7 field213 = class37.method242("Loading ", 1333943984);

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field210;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "[I")
    public int[] field200;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "[[Lr;")
    public static class32[][] field203;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ILba;II)Ln;", line = 10)
    public static final class26 method141(int arg0, class4 arg1, int arg2, int arg3) {
        if (class29.method210(121, arg3, arg1, arg0)) {
            if (arg2 != -23610) {
                field211 = 75;
            }
            return class2.method21((byte) 102);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 25)
    public static final void method142(byte arg0, Component arg1) {
        arg1.removeKeyListener(class8.field94);
        if (arg0 < 66) {
            method143(-10);
        }
        arg1.removeFocusListener(class8.field94);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)B", line = 48)
    public static final byte method143(int arg0) {
        if (arg0 == 0) {
            return class2.field21 == null ? 0 : class2.field21[class16.field166];
        } else {
            return -17;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)V", line = 69)
    public static void method144(int arg0) {
        if (arg0 != 2853) {
            field209 = null;
        }
        field208 = null;
        field203 = null;
        field206 = null;
        field207 = null;
        field209 = null;
        field202 = null;
        field213 = null;
        field205 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I[BII)I", line = 87)
    public static final int method145(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < 118) {
            method143(75);
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class4.field46[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "(I)V", line = 109)
    public final void method146(int arg0) {
        class17.method124(this.field200, this.field201, this.field204);
        if (arg0 != 0) {
            field206 = null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "(I)V", line = 120)
    public static final void method147(int arg0) {
        int var1 = -13 % ((-arg0 - 13) / 60);
        if (class36.field494 != null) {
            class22 var2 = class36.field494;
            synchronized (class36.field494) {
                class36.field494 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(II)I", line = 141)
    public static int method148(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "()V", line = 153)
    protected class21() {
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public abstract void method114(int arg0, int arg1, byte arg2, Component arg3);

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public abstract void method115(byte arg0, Graphics arg1, int arg2, int arg3);
}
