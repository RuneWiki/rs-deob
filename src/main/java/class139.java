import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class139 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[I")
    public static int[] field2081 = new int[6];

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method981(int arg0) {
        field2083++;
        class177.field2654++;
        class274.method1602(14, class426.field6198);
        if (arg0 > -111) {
            field2081 = null;
        }
        class17.field275.method1891(false, 0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method982(char arg0, byte arg1, String arg2) {
        field2086++;
        int var3 = class527.method3120(arg2, 119, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        if (arg1 != 10) {
            return null;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method983(byte arg0) {
        field2084++;
        if (class341.field4939) {
            return;
        }
        class161.method1136(class134.field2046, 6141);
        if (arg0 > -105) {
            field2081 = null;
        }
        if (class239.field3306 != null) {
            class161.method1136(class239.field3306, 6141);
        }
        class341.field4939 = true;
    }

    @OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2085++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        this.field2082 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static void method984(byte arg0) {
        if (arg0 > -75) {
            field2081 = null;
        }
        field2081 = null;
    }
}
