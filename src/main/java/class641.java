import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class641 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Z")
    private boolean field8913 = false;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field8915 = 0;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public int field8923 = 0;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field8924 = 100;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Lki;")
    public static class364 field8919 = new class364();

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lnj;")
    public static class415 field8928 = new class415(2, 3);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field8908;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field8909;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public int field8912;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    private int field8916;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public int field8917;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public int field8918;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public int field8920;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public int field8922;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public int field8925;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public int field8926;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "J")
    public long field8927;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILfd;)V")
    public final void method3532(int arg0, class418 arg1) {
        while (true) {
            int var3 = arg1.method2396(73);
            if (var3 == 0) {
                if (arg0 >= -67) {
                    this.field8925 = 33;
                }
                field8914++;
                return;
            }
            this.method3534(var3, -39, arg1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method3533(boolean arg0) {
        field8919 = null;
        if (arg0) {
            field8910 = 54;
        }
        field8928 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILfd;)V")
    private final void method3534(int arg0, int arg1, class418 arg2) {
        if (arg0 == 1) {
            this.field8916 = arg2.method2393(-30727);
        } else if (arg0 == 2) {
            arg2.method2396(127);
        } else if (arg0 == 3) {
            this.field8912 = arg2.method2355(70);
            this.field8908 = arg2.method2355(120);
            this.field8925 = arg2.method2355(65);
        } else if (arg0 == 4) {
            this.field8922 = arg2.method2396(-103);
            this.field8918 = arg2.method2355(84);
        } else if (arg0 == 6) {
            this.field8909 = arg2.method2396(-115);
        } else if (arg0 == 8) {
            this.field8923 = 1;
        } else if (arg0 == 9) {
            this.field8915 = 1;
        } else if (arg0 == 10) {
            this.field8913 = true;
        }
        if (arg1 > -16) {
            method3533(false);
        }
        field8911++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public final void method3535(int arg0) {
        field8921++;
        this.field8917 = class237.field3196[this.field8916 << 3];
        this.field8920 = (int) Math.sqrt((double) (this.field8925 * this.field8925 + this.field8912 * this.field8912 + this.field8908 * this.field8908));
        if (this.field8918 == 0) {
            this.field8918 = 1;
        }
        if (this.field8922 == 0) {
            this.field8927 = 2147483647L;
        } else if (this.field8922 == 1) {
            this.field8927 = (this.field8920 * 8 / this.field8918);
            this.field8927 *= this.field8927;
        } else if (this.field8922 == 2) {
            this.field8927 = (this.field8920 * 8 / this.field8918);
        }
        if (arg0 != 8) {
            this.method3534(-63, -94, null);
        }
        if (this.field8913) {
            this.field8920 *= -1;
        }
    }
}
