import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class421 extends class187 {

    @OriginalMember(owner = "client!mba", name = "A", descriptor = "I")
    public static int field6075 = -1;

    @OriginalMember(owner = "client!mba", name = "G", descriptor = "B")
    public byte field6077;

    @OriginalMember(owner = "client!mba", name = "D", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!mba", name = "K", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!mba", name = "M", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!mba", name = "N", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!mba", name = "O", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!mba", name = "L", descriptor = "Lcea;")
    public class215 field6081;

    @OriginalMember(owner = "client!mba", name = "H", descriptor = "Z")
    public static boolean field6078;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "(I)[B", line = 4)
    public final byte[] method680(int arg0) {
        ++field6082;
        if (arg0 != 16) {
            return null;
        } else if (!super.field2808 && this.field6081.field3109 >= this.field6081.field3066.length + -this.field6077) {
            return this.field6081.field3066;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "(I)V", line = 23)
    public static final void method2584(int arg0) {
        for (class7 var1 = (class7) class581.field7954.method1469(0); var1 != null; var1 = (class7) class581.field7954.method1467(0)) {
            if (var1.field47.method1904((byte) -125)) {
                class624.method3561((byte) 70, var1.field52);
            } else {
                var1.field47.method4064((byte) -91);
                try {
                    var1.field47.method1911(-2);
                } catch (Exception var6) {
                    class444.method2672("TV: " + var1.field52, var6, 15004);
                    class624.method3561((byte) 15, var1.field52);
                }
                if (!var1.field62 && !var1.field60) {
                    class689 var3 = var1.field47.method1906(0);
                    if (var3 != null) {
                        class30 var4 = var3.method3850(-61);
                        if (var4 != null) {
                            var4.method405(-17708, var1.field61);
                            class326.field4510.method1324(var4);
                            var1.field62 = true;
                        }
                    }
                }
            }
        }
        int var5 = 48 % ((-17 - arg0) / 63);
        ++field6076;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 80)
    public static final String method2585(long arg0, int arg1) {
        class227.field3294.setTime(new Date(arg0));
        ++field6083;
        int var3 = class227.field3294.get(7);
        int var4 = class227.field3294.get(5);
        if (arg1 <= 53) {
            field6078 = false;
        }
        int var5 = class227.field3294.get(2);
        int var6 = class227.field3294.get(1);
        int var7 = class227.field3294.get(11);
        int var8 = class227.field3294.get(12);
        int var9 = class227.field3294.get(13);
        return class675.field9194[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class234.field3392[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "(I)I", line = 109)
    public final int method678(int arg0) {
        if (arg0 != 16) {
            this.field6077 = -4;
        }
        ++field6080;
        return this.field6081 == null ? 0 : this.field6081.field3109 * 100 / (this.field6081.field3066.length + -this.field6077);
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)Z", line = 129)
    public static final boolean method2586(int arg0, int arg1, int arg2) {
        if (arg2 <= 75) {
            field6078 = false;
        }
        ++field6079;
        return (arg0 & 16) != 0;
    }
}
