import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class743 {

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10375 = 100;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Lso;")
    public static class468 field10377 = new class468(1, 7);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field10374;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "Lhu;")
    public static class131 field10379;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "Loh;")
    public static class404 field10380;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Ljava/lang/String;", line = 8)
    public static final String method4135(int arg0) {
        field10376++;
        String var1 = "www";
        if (class58.field592 == class237.field2829) {
            var1 = "www-wtrc";
        } else if (class672.field9534 == class237.field2829) {
            var1 = "www-wtqa";
        } else if (class465.field6661 == class237.field2829) {
            var1 = "www-wtwip";
        }
        if (arg0 >= -44) {
            method4135(-108);
        }
        String var2 = "";
        if (class608.field8638 != null) {
            var2 = "/p=" + class608.field8638;
        }
        return "http://" + var1 + "." + class99.field1034.field3758 + ".com/l=" + class489.field6978 + "/a=" + class519.field7378 + var2 + "/";
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V", line = 38)
    public static void method4136(boolean arg0) {
        field10377 = null;
        field10379 = null;
        if (arg0) {
            field10380 = null;
        }
        field10380 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([BIZ)I", line = 53)
    public static final int method4137(byte[] arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field10379 = null;
        }
        field10374++;
        return class263.method1589(arg1, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([SI)[S", line = 64)
    public static final short[] method4138(short[] arg0, int arg1) {
        field10378++;
        if (arg1 < 53) {
            field10380 = null;
        }
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class143.method895(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }
}
