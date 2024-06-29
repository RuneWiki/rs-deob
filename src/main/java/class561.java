import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class561 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lhga;")
    public static class158 field8080 = new class158(44, -1);

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lmea;")
    public static class395 field8082 = new class395();

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!cf", name = "toString", descriptor = "()Ljava/lang/String;", line = 10)
    public final String toString() {
        field8081++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I", line = 19)
    public static final int method3334(int arg0, int arg1, int arg2) {
        field8078++;
        int var3 = arg1 >>> 24;
        int var4 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var5 = arg0 - var3;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 33)
    public static void method3335(int arg0) {
        field8082 = null;
        field8080 = null;
        if (arg0 != -1) {
            method3335(-59);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lie;I)Lku;", line = 48)
    public static final class345 method3336(class6 arg0, int arg1) {
        field8079++;
        int var2 = -41 / ((arg1 - 6) / 44);
        return new class345(arg0.method45(-8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method86(-29), arg0.method86(-42), arg0.method70(-9059));
    }
}
