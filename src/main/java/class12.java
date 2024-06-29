import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class12 extends class132 {

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[Lba;")
    public class12[] field215;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Z")
    public boolean field211;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
    public static int[] field220 = new int[1000];

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Ltg;")
    public static class184 field227 = class135.method812("<br>(X100(U(Y", 3);

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Ltg;")
    public static class184 field225 = class135.method812("Keine Antwort vom Server)3", 3);

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Ltg;")
    public static class184 field228 = class135.method812("::errortest", 3);

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Ltg;")
    public static class184 field231 = null;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Llc;")
    public class108 field232;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lvb;")
    public static class197 field213;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Laa;")
    public class2 field224;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Ljava/awt/Image;")
    public static Image field222;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)I")
    public int method73(int arg0) {
        field235++;
        if (arg0 != -1) {
            this.method76(29, -63, -84);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public final void method74(int arg0) {
        field217++;
        if (this.field211) {
            this.field224.method11(127);
            this.field224 = null;
        } else {
            this.field232.method676(false);
            this.field232 = null;
        }
        if (arg0 != -23224) {
            field219 = 60;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V")
    public static final void method75(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1684 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)[I")
    public int[] method62(int arg0, byte arg1) {
        if (arg1 == 17) {
            field210++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(III)[[I")
    public final int[][] method76(int arg0, int arg1, int arg2) {
        if (arg1 != 6218) {
            this.method82(114);
        }
        field230++;
        if (this.field215[arg2].field211) {
            int[] var4 = this.field215[arg2].method62(arg0, (byte) 17);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field215[arg2].method80(arg0, -112);
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(III)[I")
    public final int[] method77(int arg0, int arg1, int arg2) {
        if (arg2 > -119) {
            field222 = null;
        }
        field209++;
        return this.field215[arg0].field211 ? this.field215[arg0].method62(arg1, (byte) 17) : this.field215[arg0].method80(arg1, -114)[0];
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public void method78(byte arg0) {
        if (arg0 == 57) {
            field223++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Ltg;")
    public static final class184 method79(int arg0, int arg1) {
        field229++;
        if (arg0 < 999999999) {
            return class170.method1060(arg0, -105);
        } else {
            if (arg1 != 4006) {
                field233 = 18;
            }
            return class26.field475;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lka;IZ)V")
    public void method59(class97 arg0, int arg1, boolean arg2) {
        field214++;
        if (arg2) {
            this.method74(-112);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[[I")
    public int[][] method80(int arg0, int arg1) {
        int var3 = -10 % ((arg1 + 58) / 34);
        field212++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)V")
    public final void method81(int arg0, byte arg1, int arg2) {
        field218++;
        int var4 = this.field221 == 255 ? arg0 : this.field221;
        if (arg1 > -108) {
            return;
        }
        if (this.field211) {
            this.field224 = new class2(var4, arg0, arg2);
        } else {
            this.field232 = new class108(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I")
    public int method82(int arg0) {
        if (arg0 != 17849) {
            this.method80(43, 7);
        }
        field236++;
        return -1;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IZ)V")
    public class12(int arg0, boolean arg1) {
        this.field215 = new class12[arg0];
        this.field211 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public static void method83(int arg0) {
        field220 = null;
        field231 = null;
        field225 = null;
        field228 = null;
        field222 = null;
        field213 = null;
        if (arg0 != -1) {
            field231 = null;
        }
        field227 = null;
    }
}
