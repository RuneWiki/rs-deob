import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class538 {

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public int field7565;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3105(int arg0) {
        field7563++;
        if (arg0 != -853219866) {
            method3106(null, null, 41, false);
        }
        class391.field5552 = null;
    }

    @OriginalMember(owner = "client!gq", name = "toString", descriptor = "()Ljava/lang/String;", line = 17)
    public final String toString() {
        field7564++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([BLjava/lang/String;IZ)I", line = 25)
    public static final int method3106(byte[] arg0, String arg1, int arg2, boolean arg3) {
        field7562++;
        int var4 = arg2;
        int var5 = arg1.length();
        if (!arg3) {
            method3105(69);
        }
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class583.method3384((byte) 97, arg1.charAt(var6));
            int var8 = (var6 + 1) >= var5 ? -1 : class583.method3384((byte) 97, arg1.charAt(var6 + 1));
            int var9 = var5 > (var6 + 2) ? class583.method3384((byte) 97, arg1.charAt(var6 + 2)) : -1;
            int var10 = (var6 + 3) >= var5 ? -1 : class583.method3384((byte) 97, arg1.charAt(var6 + 3));
            arg0[arg2++] = (byte) class281.method1904(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class281.method1904(var9 >>> 2, class111.method773(240, var8 << 4));
            if (var10 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class281.method1904(class111.method773(3, var9) << 6, var10);
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(I)V", line = 68)
    public class538(int arg0) {
        this.field7565 = arg0;
    }
}
