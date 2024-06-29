import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class339 extends class45 {

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "[I")
    public static int[] field4559 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Lwo;")
    public static class445 field4565 = new class445();

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "[I")
    public static int[] field4568 = new int[8];

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "J")
    public long field4564;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "Luq;")
    public class339 field4562;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Luq;")
    public class339 field4567;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1979(int arg0, long arg1) {
        field4563++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = arg0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class257.field3367[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public static void method1980(int arg0) {
        field4568 = null;
        field4565 = null;
        field4559 = null;
        if (arg0 < 9) {
            method1983(false, 47, -6);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1981(int arg0, byte[] arg1) {
        field4560++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class2.method9(arg1, arg0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public final void method1982(byte arg0) {
        field4570++;
        if (arg0 != -24) {
            method1980(-88);
        }
        if (this.field4562 != null) {
            this.field4562.field4567 = this.field4567;
            this.field4567.field4562 = this.field4562;
            this.field4567 = null;
            this.field4562 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1983(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field4566++;
            return (arg1 & 0x22) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Z")
    public final boolean method1984(int arg0) {
        if (arg0 != 0) {
            this.field4562 = null;
        }
        field4561++;
        return this.field4562 != null;
    }
}
