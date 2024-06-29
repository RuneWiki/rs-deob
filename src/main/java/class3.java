import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 {

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Ls;")
    public static class34 field25 = class9.method35("Holiday Event", 220);

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "I")
    public static int field26 = 0;

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Ls;")
    public static class34 field28 = class9.method35("download", 220);

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "[Lia;")
    public static class18[] field27;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 14)
    public static final void method5(Component arg0, int arg1) {
        arg0.removeMouseListener(class31.field414);
        arg0.removeMouseMotionListener(class31.field414);
        arg0.removeFocusListener(class31.field414);
        class9.field85 = arg1;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IB[B)I", line = 36)
    public static final int method6(int arg0, byte arg1, byte[] arg2) {
        int var3 = -98 % ((33 - arg1) / 59);
        return class28.method187((byte) -126, 0, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IIILda;)[Lba;", line = 44)
    public static final class4[] method7(int arg0, int arg1, int arg2, class8 arg3) {
        if (arg1 > -27) {
            field28 = null;
        }
        return class25.method138(arg3, -119, arg0, arg2) ? class18.method85((byte) 10) : null;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)V", line = 90)
    public static void method8(byte arg0) {
        if (arg0 > -32) {
            method9((byte) 74);
        }
        field27 = null;
        field25 = null;
        field28 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(B)B", line = 119)
    public static final byte method9(byte arg0) {
        int var1 = -38 / ((arg0 - 62) / 41);
        return class16.field138 == null ? 0 : class16.field138[class31.field433];
    }
}
