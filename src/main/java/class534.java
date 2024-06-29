import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class534 {

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Lqc;")
    private class325 field7898 = new class325(256);

    @OriginalMember(owner = "client!du", name = "l", descriptor = "Ln;")
    private class472 field7909;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "Lkw;")
    private class174 field7905;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[[I")
    public static int[][] field7899;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Z")
    public static boolean field7903;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "Z")
    public static volatile boolean field7901;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Lrk;")
    public static class419 field7907;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field7910;

    static {
        new class487("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field7899 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
        field7903 = false;
        field7901 = true;
        field7907 = new class419();
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 11)
    public final void method3136(int arg0) {
        field7900++;
        this.field7898.method2028(arg0, true);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BLjava/lang/String;)I", line = 19)
    public static final int method3137(byte arg0, String arg1) {
        field7908++;
        if (arg0 <= 101) {
            return -22;
        }
        for (int var2 = 0; var2 < class585.field8691.length; var2++) {
            if (class585.field8691[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V", line = 45)
    public static void method3138(int arg0) {
        field7907 = null;
        if (arg0 != 8) {
            field7907 = null;
        }
        field7899 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZBI)Ljava/lang/String;", line = 72)
    public static final String method3139(boolean arg0, byte arg1, int arg2) {
        int var3 = 55 % ((39 - arg1) / 57);
        field7906++;
        return arg0 && arg2 >= 0 ? class403.method2417(arg2, 11341, 10, arg0) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V", line = 85)
    public final void method3140(int arg0) {
        this.field7898.method2037(true);
        if (arg0 != 2) {
            field7910 = 44;
        }
        field7902++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Lhc;", line = 96)
    public final class391 method3141(int arg0, int arg1) {
        field7904++;
        Object var3 = this.field7898.method2025((long) arg0, 2);
        if (var3 != null) {
            return (class391) var3;
        } else if (this.field7909.method1758((byte) 10, arg0)) {
            class83 var4 = this.field7909.method1762(arg0, (byte) 45);
            if (arg1 != 8) {
                return null;
            }
            int var5 = var4.field964 ? 64 : this.field7905.field2628;
            class391 var7;
            if (var4.field979 && this.field7905.method345()) {
                float[] var6 = this.field7909.method1766(var5, var5, arg0, 0.7F, arg1 - 15686, false);
                var7 = this.field7905.method1107(class411.field5856, var5, var5, var6, arg1 ^ 0xFFFFFF9A, var4.field959 != 0);
            } else {
                int[] var8 = var4.field961 ? this.field7909.method1764(0.7F, var5, arg0, var5, false, arg1 ^ 0x48) : this.field7909.method1759(var5, var5, 0.7F, (byte) 93, arg0, true);
                var7 = this.field7905.method1105(var8, var4.field959 != 0, var5, 6978, var5);
            }
            var7.method563(var4.field967, 103, var4.field976);
            this.field7898.method2029(false, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lkw;Ln;)V", line = 143)
    public class534(class174 arg0, class472 arg1) {
        this.field7909 = arg1;
        this.field7905 = arg0;
    }
}
