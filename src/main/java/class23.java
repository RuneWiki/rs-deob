import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class23 {

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "[Lj;")
    private class18[] field242;

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Lna;")
    public static class26 field237 = class33.method219("Mini)2Game", 94);

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Lna;")
    public static class26 field236 = class33.method219("Windmill", 120);

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "[[B")
    public static byte[][] field241 = new byte[1000][];

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Z")
    public static boolean field244 = false;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Lha;")
    public static class15 field240 = new class15();

    @OriginalMember(owner = "mapview!m", name = "m", descriptor = "Lna;")
    public static class26 field248 = class33.method219("Grand Exchange", 109);

    @OriginalMember(owner = "mapview!m", name = "o", descriptor = "Lna;")
    public static class26 field250 = class33.method219("Food Shop", 104);

    @OriginalMember(owner = "mapview!m", name = "n", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "J")
    private long field243;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Lj;")
    private class18 field239;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "Lta;")
    public static class38 field245;

    @OriginalMember(owner = "mapview!m", name = "l", descriptor = "Ljava/awt/Image;")
    public static Image field247;

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "[[[I")
    public static int[][][] field246;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)B", line = 9)
    public static final byte method122(int arg0) {
        if (arg0 == 24960) {
            return class2.field22 == null ? 0 : class2.field22[class6.field65];
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)Lj;", line = 34)
    public final class18 method123(int arg0) {
        if (this.field239 == null) {
            return null;
        }
        if (arg0 != 11845) {
            this.field243 = -8L;
        }
        class18 var2 = this.field242[(int) (this.field243 & (long) (this.field238 - 1))];
        while (this.field239 != var2) {
            if (this.field239.field167 == this.field243) {
                class18 var3 = this.field239;
                this.field239 = this.field239.field170;
                return var3;
            }
            this.field239 = this.field239.field170;
        }
        this.field239 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Lj;JI)V", line = 89)
    public final void method124(class18 arg0, long arg1, int arg2) {
        if (arg0.field174 != null) {
            arg0.method96((byte) -119);
        }
        class18 var5 = this.field242[(int) ((long) (this.field238 - arg2) & arg1)];
        arg0.field170 = var5;
        arg0.field167 = arg1;
        arg0.field174 = var5.field174;
        arg0.field174.field170 = arg0;
        arg0.field170.field174 = arg0;
    }

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(I)V", line = 110)
    public static void method125(int arg0) {
        field246 = null;
        field245 = null;
        field240 = null;
        field247 = null;
        field248 = null;
        field236 = null;
        field250 = null;
        if (arg0 != 0) {
            field245 = null;
        }
        field241 = null;
        field237 = null;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(BJ)Lj;", line = 159)
    public final class18 method126(byte arg0, long arg1) {
        this.field243 = arg1;
        class18 var4 = this.field242[(int) ((long) (this.field238 - 1) & arg1)];
        for (this.field239 = var4.field170; this.field239 != var4; this.field239 = this.field239.field170) {
            if (this.field239.field167 == arg1) {
                class18 var5 = this.field239;
                this.field239 = this.field239.field170;
                return var5;
            }
        }
        this.field239 = null;
        if (arg0 == -109) {
            return null;
        } else {
            return (class18) null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "(I)V", line = 186)
    public class23(int arg0) {
        this.field242 = new class18[arg0];
        this.field238 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class18 var3 = this.field242[var2] = new class18();
            var3.field174 = var3;
            var3.field170 = var3;
        }
    }
}
