import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class53 {

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "Ljf;")
    public static class640 field744 = new class640(9, 8);

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "[I")
    public static int[] field749;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 3)
    public static final String method357(String arg0, int arg1) {
        field745++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class59.method390(arg0.charAt(var2), (byte) -111)) {
            var2++;
        }
        while (var3 > var2 && class59.method390(arg0.charAt(var3 - 1), (byte) -87)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < arg1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class7.method30(var7, (byte) 31)) {
                char var8 = class478.method2829((byte) 5, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 56)
    public static void method358(int arg0) {
        field744 = null;
        field749 = null;
        if (arg0 != 1) {
            field749 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "toString", descriptor = "()Ljava/lang/String;", line = 69)
    public final String toString() {
        field748++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(I)V", line = 77)
    public class53(int arg0) {
        this.field746 = arg0;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I", line = 85)
    public static final int method359(int arg0) {
        field747++;
        if ((double) class531.field7438 == 3.0D) {
            return 37;
        } else if ((double) class531.field7438 == 4.0D) {
            return 50;
        } else if (arg0 != 200) {
            return -121;
        } else if ((double) class531.field7438 == 6.0D) {
            return 75;
        } else if ((double) class531.field7438 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
