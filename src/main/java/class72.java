import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class72 {

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "B")
    private byte field796;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field790 = " from your friend list first.";

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[[I")
    public static int[][] field795 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field793 = 0;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field802 = null;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lam;")
    public static class286 field794;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lam;")
    public static class286 field797;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Lok;")
    public static class60 field804;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "[I")
    public static int[] field801;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIZII)V")
    public static final void method410(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field808++;
        int var7 = arg0 - arg1;
        int var8 = arg1 + arg3;
        if (arg4) {
            method414((String) null, '\u0004', 66);
        }
        for (int var9 = arg3; var9 < var8; var9++) {
            class296.method1740(arg2, class153.field1932[var9], (byte) 81, arg5, arg6);
        }
        int var10 = arg6 - arg1;
        for (int var11 = arg0; var11 > var7; var11--) {
            class296.method1740(arg2, class153.field1932[var11], (byte) 81, arg5, arg6);
        }
        int var12 = arg1 + arg2;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class153.field1932[var13];
            class296.method1740(arg2, var14, (byte) 81, arg5, var12);
            class296.method1740(var10, var14, (byte) 81, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method411(byte arg0) {
        field802 = null;
        field794 = null;
        field801 = null;
        field804 = null;
        field790 = null;
        field795 = null;
        field797 = null;
        if (arg0 > -12) {
            field794 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
    public final int method412(int arg0) {
        field805++;
        if (arg0 == 1) {
            return (this.field796 & 0x8) == 8 ? 1 : 0;
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
    public final int method413(int arg0) {
        if (arg0 != 7) {
            this.field800 = 64;
        }
        field806++;
        return this.field796 & 0x7;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;CI)I")
    public static final int method414(String arg0, char arg1, int arg2) {
        field799++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = arg2; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIB)V")
    public static final void method415(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -103 % ((-arg4 - 50) / 39);
        if (arg0 > arg2) {
            class296.method1740(arg2, class153.field1932[arg1], (byte) 81, arg3, arg0);
        } else {
            class296.method1740(arg0, class153.field1932[arg1], (byte) 81, arg3, arg2);
        }
        field807++;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class72() {
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ltq;)V")
    public class72(class250 arg0) {
        this.field796 = arg0.method1363((byte) 108);
        this.field803 = arg0.method1374(-2);
        this.field798 = arg0.method1359(255);
        this.field800 = arg0.method1359(255);
        this.field791 = arg0.method1359(255);
        this.field792 = arg0.method1359(255);
    }
}
