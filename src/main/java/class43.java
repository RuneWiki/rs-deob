import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class43 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    public static int[] field654 = new int[3];

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
    public static int[] field658 = new int[2];

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lfq;")
    public static class141 field655 = new class141(13, 0, 1, 0);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I", line = 3)
    public static final int method361(int arg0, int arg1, int arg2) {
        if (arg1 != -19585) {
            return 56;
        }
        field656++;
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        double var5 = Math.log((double) arg2) / Math.log(2.0D);
        double var7 = (var3 - var5) * Math.random() + var5;
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method362(int arg0) {
        field657++;
        return arg0 == 13 ? class692.field9816 == this | class573.field8010 == this : true;
    }

    @OriginalMember(owner = "client!k", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field660++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 43)
    public static void method363(byte arg0) {
        field655 = null;
        if (arg0 <= 116) {
            field655 = null;
        }
        field658 = null;
        field654 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)Lmw;", line = 62)
    public static final class457 method364(byte arg0) {
        field659++;
        try {
            return new class308();
        } catch (Throwable var2) {
            try {
                return arg0 == 9 ? (class457) Class.forName("gp").getDeclaredConstructor().newInstance() : null;
            } catch (Throwable var1) {
                return new class330();
            }
        }
    }
}
