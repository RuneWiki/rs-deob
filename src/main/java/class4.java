import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public abstract class class4 {

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Lna;")
    public static class26 field37 = class33.method219("details)3dat", 114);

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "I")
    public static int field43 = -1;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "Lna;")
    public static class26 field42 = class33.method219("Mining Shop", 106);

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "Lna;")
    public static class26 field38 = class33.method219("u_pass", 102);

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "Lna;")
    public static class26 field46 = class33.method219(" )2 ", 108);

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "Lna;")
    public static class26 field39 = class33.method219("Mace Shop", 121);

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "Lna;")
    public static class26 field44 = class33.method219("Enter place name to find", 77);

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "Lna;")
    public static class26 field49 = class33.method219("", 127);

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "Lna;")
    public static class26 field40 = class33.method219("Fishing Shop", 99);

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "Laa;")
    public static class1 field48;

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field41;

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "[I")
    public int[] field50;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IILp;I)[Lq;", line = 18)
    public static final class31[] method26(int arg0, int arg1, class29 arg2, int arg3) {
        if (class33.method222(114, arg1, arg0, arg2)) {
            if (arg3 != 1855480230) {
                method30(-93, 47, 80);
            }
            return class38.method244(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)V", line = 33)
    public static void method27(byte arg0) {
        field42 = null;
        if (arg0 != 89) {
            field47 = -101;
        }
        field44 = null;
        field38 = null;
        field39 = null;
        field49 = null;
        field46 = null;
        field48 = null;
        field37 = null;
        field40 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(B)V", line = 62)
    public final void method28(byte arg0) {
        class13.method66(this.field50, this.field51, this.field36);
        if (arg0 < 24) {
            method26(-72, -34, null, -82);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z)V", line = 88)
    public static final void method29(boolean arg0) {
        class39 var1 = class6.field64;
        synchronized (class6.field64) {
            if (arg0) {
                method26(-117, 13, null, -53);
            }
            class5.field57 = class8.field82;
            class28.field424 = class38.field502;
            class2.field11 = class5.field62;
            class2.field24 = class21.field227;
            class15.field157 = class18.field169;
            class20.field215 = class12.field126;
            class21.field227 = 0;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III)V", line = 147)
    public static final void method30(int arg0, int arg1, int arg2) {
        class12.field119 = arg2 & arg0;
        class5.field53 = arg2 >> 6;
        class8.field77 = arg1 >> 6;
        class3.field28 = arg1 & 0x3F;
        class6.field65 = (class12.field119 << 6) + class3.field28;
        class34.method226((byte) -76);
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "()V", line = 161)
    protected class4() {
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Ljava/awt/Component;BII)V")
    public abstract void method25(Component arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method31(int arg0, int arg1, int arg2, Graphics arg3);
}
