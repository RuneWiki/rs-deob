import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class302 extends class171 {

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    private int field4964;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    private int field4970;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    private int field4966;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "Luj;")
    public static class175 field4967;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 8)
    public static void method2117(int arg0) {
        if (arg0 == -1669070996) {
            field4967 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IIIIII)V", line = 18)
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4964 = arg1;
        this.field4970 = arg0;
        this.field4966 = arg2;
        this.field4968 = arg3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZI)V", line = 38)
    public final void method236(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field4968 = -3;
        }
        field4963++;
        int var4 = this.field4968 * arg2 >> 12;
        int var5 = this.field4966 * arg0 >> 12;
        int var6 = this.field4970 * arg0 >> 12;
        int var7 = this.field4964 * arg2 >> 12;
        class139.method988(167490192, this.field2672, var4, var7, var5, var6);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIB)V", line = 60)
    public final void method242(int arg0, int arg1, byte arg2) {
        if (arg2 <= -105) {
            field4965++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JIZII)Ljava/lang/String;", line = 70)
    public static final String method2118(long arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4971++;
        char var6 = ',';
        boolean var7 = false;
        if (arg4 != 30149) {
            method2118(105L, -109, false, -23, -7);
        }
        char var8 = '.';
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 < 0L) {
            var7 = true;
            arg0 = -arg0;
        }
        if (arg3 == 0) {
            var8 = ',';
            var6 = '.';
        }
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        if (arg3 == 2) {
            var8 = ' ';
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg0 * 10));
            if (arg0 == 0L) {
                if (var7) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)V", line = 151)
    public final void method244(int arg0, byte arg1, int arg2) {
        if (arg1 > 93) {
            field4969++;
        }
    }
}
