import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class29 {

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "Lia;")
    public static class15 field406 = class28.method196("Platebody Shop", false);

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "Lia;")
    public static class15 field407 = class28.method196("Next page", false);

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "Lia;")
    public static class15 field409 = class28.method196("Suchen", false);

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "Lia;")
    public static class15 field415 = class28.method196("75(U", false);

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "Lia;")
    public static class15 field413 = class28.method196("loc)3dat", false);

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Lia;")
    public static class15 field408 = class28.method196("Requesting", false);

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "Lia;")
    public static class15 field417 = class28.method196("null", false);

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "Lia;")
    public static class15 field414 = class28.method196("Potters Wheel", false);

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "Lia;")
    public static class15 field418 = class28.method196("Platelegs Shop", false);

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "Lq;")
    public static class30 field411;

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "Ls;")
    public static class34 field416;

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "[Lv;")
    public static class40[] field412;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)V", line = 19)
    public static void method197(int arg0) {
        field415 = null;
        field414 = null;
        field407 = null;
        field408 = null;
        field412 = null;
        field416 = null;
        field406 = null;
        if (arg0 != 30000) {
            method198((byte) 113, 114, -98);
        }
        field411 = null;
        field417 = null;
        field409 = null;
        field418 = null;
        field413 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(BII)V", line = 40)
    public static final void method198(byte arg0, int arg1, int arg2) {
        class36.field503 = arg2 >> 6;
        class17.field166 = arg1 & 0x3F;
        class2.field16 = arg1 >> 6;
        class18.field180 = arg2 & 0x3F;
        class13.field111 = (class17.field166 << 6) + class18.field180;
        int var3 = 108 / ((arg0 + 6) / 46);
        class20.method149(-117);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(II)[B", line = 68)
    public static final synchronized byte[] method199(int arg0, int arg1) {
        if (arg0 == 100 && class20.field227 > 0) {
            byte[] var2 = class6.field59[--class20.field227];
            class6.field59[class20.field227] = null;
            return var2;
        } else if (arg0 == 5000 && class2.field18 > 0) {
            byte[] var3 = class25.field357[--class2.field18];
            class25.field357[class2.field18] = null;
            return var3;
        } else if (arg0 == 30000 && class18.field184 > 0) {
            byte[] var4 = class5.field44[--class18.field184];
            class5.field44[class18.field184] = null;
            return var4;
        } else if (arg1 == -1) {
            return new byte[arg0];
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 108)
    public static final void method200(Component arg0, byte arg1) {
        arg0.removeKeyListener(class12.field105);
        if (arg1 <= -6) {
            arg0.removeFocusListener(class12.field105);
            class12.field102 = -1;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(II)I", line = 149)
    public static int method201(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
