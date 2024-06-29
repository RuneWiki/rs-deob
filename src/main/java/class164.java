import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class164 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Ltja;")
    public static class288 field2218 = new class288(11, 4);

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[[I")
    public static int[][] field2222 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Ljw;")
    public static class581 field2223 = new class581(97, 3);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1186(byte arg0) {
        class504.field6974.method3959(0);
        field2214++;
        if (arg0 > 30) {
            class516.field7054.method3959(0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method1187(boolean arg0) {
        class523.field7171.method1555((byte) -3);
        if (!arg0) {
            field2218 = null;
        }
        field2219++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)V", line = 32)
    public static final void method1188(byte arg0, String arg1) {
        if (class257.field3837 == null) {
            class158.method1163(true);
        }
        field2220++;
        class260.field3869.setTime(new Date(class302.method1910(0)));
        int var2 = class260.field3869.get(11);
        int var3 = class260.field3869.get(12);
        int var4 = class260.field3869.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class46.method355(arg1, 0, '\n');
        if (arg0 > -102) {
            field2223 = null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class332.field4784; var8 > 0; var8--) {
                class257.field3837[var8] = class257.field3837[var8 - 1];
            }
            class257.field3837[0] = var5 + ": " + var6[var7];
            if (class784.field10800 != null) {
                try {
                    class784.field10800.write(class196.method1344((byte) 125, class257.field3837[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if (class257.field3837.length - 1 > class332.field4784) {
                if (class700.field9809 > 0) {
                    class700.field9809++;
                }
                class332.field4784++;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V", line = 96)
    public static void method1189(byte arg0) {
        field2222 = null;
        field2218 = null;
        if (arg0 >= 101) {
            field2223 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "toString", descriptor = "()Ljava/lang/String;", line = 111)
    public final String toString() {
        field2217++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z", line = 121)
    public static final boolean method1190(int arg0) {
        field2216++;
        if (class295.method1877(46, "jaclib")) {
            if (arg0 != -2500) {
                field2222 = null;
            }
            return class295.method1877(125, "hw3d");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 138)
    public class164(String arg0, String arg1, String arg2, int arg3) {
        this.field2215 = arg3;
    }
}
