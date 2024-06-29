import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class71 extends class645 implements class245 {

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "Lgr;")
    public static class530 field1080 = new class530(14, 8);

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "Lmfa;")
    public static class407 field1084 = new class407(1);

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 3)
    public static final String method622(byte arg0, long arg1) {
        ++field1082;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg1; ~var4 != -1L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class274.field3872[(int) (-(arg1 * 37L) + var7)]);
                }
                if (arg0 != 29) {
                    method622((byte) 86, -60L);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lmba;IZ[[I)V", line = 42)
    public class71(class643 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class482.field6922, class674.field9590, arg1 * 6 * arg1, arg2);
        super.field9272.method264(this, -2);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method3720(9728), arg1, arg1, 0, class397.method2411(6145, super.field9283), super.field9272.field9253, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                this.method3721(arg1, var6 + 34069, arg1, -112, arg3[var6]);
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;ZZII)V", line = 77)
    public static final void method623(String arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class403.method2447(arg1, arg4, (String) null, arg0, (byte) -53, arg3, arg2);
        ++field1081;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V", line = 85)
    public static void method624(int arg0) {
        if (arg0 == 0) {
            field1080 = null;
            field1084 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(II)Z", line = 99)
    public static final boolean method625(int arg0, int arg1) {
        if (arg1 != 0) {
            return true;
        } else {
            ++field1083;
            return ~arg0 == -2 || arg0 == 3 || ~arg0 == -6;
        }
    }
}
