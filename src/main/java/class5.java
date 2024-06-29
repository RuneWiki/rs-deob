import java.awt.Component;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 {

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "Lu;")
    public static class38 field27 = class9.method45(-41, "Quest Start");

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "Lu;")
    public static class38 field30 = class9.method45(-41, " map");

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "Lu;")
    public static class38 field25 = class9.method45(-41, "Water Source");

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "Lu;")
    public static class38 field32 = class9.method45(-41, "100(U");

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "Lu;")
    public static class38 field35 = class9.method45(-41, "Short)2cut");

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "J")
    public static long field23;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "J")
    public long field29;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Lc;")
    public class5 field24;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "Lc;")
    public class5 field26;

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field28;

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "[B")
    public static byte[] field33;

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "[I")
    public static int[] field36;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIBLw;)Z", line = 12)
    public static final boolean method12(int arg0, int arg1, byte arg2, class41 arg3) {
        byte[] var4 = arg3.method256(arg0, true, arg1);
        if (var4 == null) {
            return false;
        }
        if (arg2 > -83) {
            field28 = null;
        }
        class40.method253(0, var4);
        return true;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(B)V", line = 28)
    public final void method13(byte arg0) {
        if (this.field26 == null) {
            return;
        }
        int var2 = -46 % ((arg0 - 62) / 45);
        this.field26.field24 = this.field24;
        this.field24.field26 = this.field26;
        this.field24 = null;
        this.field26 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(B)V", line = 45)
    public static void method14(byte arg0) {
        field30 = null;
        field28 = null;
        field35 = null;
        field27 = null;
        field36 = null;
        field32 = null;
        if (arg0 == -46) {
            field33 = null;
            field25 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 94)
    public static final void method15(byte arg0, Component arg1) {
        if (arg0 < -76) {
            arg1.removeMouseListener(class18.field164);
            arg1.removeMouseMotionListener(class18.field164);
            arg1.removeFocusListener(class18.field164);
            class26.field324 = 0;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)B", line = 114)
    public static final byte method16(int arg0) {
        if (arg0 == 0) {
            return class12.field116 == null ? 0 : class12.field116[class14.field139];
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z)B", line = 138)
    public static final byte method17(boolean arg0) {
        if (arg0) {
            field32 = null;
        }
        return field33 == null ? 0 : field33[class14.field139];
    }
}
