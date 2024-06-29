import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class150 extends class189 {

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "Ltf;")
    public static class264 field2173 = new class264(5, 6);

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "B")
    public byte field2174;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "Lmo;")
    public class695 field2177;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)I")
    public final int method831(int arg0) {
        int var2 = -11 % ((arg0 - -46) / 58);
        ++field2172;
        return this.field2177 == null ? 0 : this.field2177.field9761 * 100 / (this.field2177.field9796.length + -this.field2174);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)[B")
    public final byte[] method833(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field2175;
            if (!super.field2717 && this.field2177.field9761 >= this.field2177.field9796.length - this.field2174) {
                return this.field2177.field9796;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
    public static final String method1062(long arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field2171;
        char var6 = ',';
        if (arg3 != -3258) {
            field2173 = null;
        }
        char var7 = '.';
        if (~arg2 == -1) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg4 < -1) {
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 + -((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (-((int) arg0 * 10) + 48 - -var13));
            if (~arg0 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                ++var12;
                if (~(var12 % 3) == -1) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
    public static void method1063(int arg0) {
        field2173 = null;
        if (arg0 != 551) {
            field2173 = null;
        }
    }

    static {
        new class27("", 76);
    }
}
