import jaggl.OpenGL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class364 {

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4921 = new CRC32();

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "B")
    public byte field4919;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "B")
    public byte field4926;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "B")
    public byte field4928;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "B")
    public byte field4929;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "B")
    public byte field4932;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "B")
    public byte field4937;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "B")
    public byte field4942;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "Lbi;")
    public static class449 field4943;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "S")
    public short field4920;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Z")
    public boolean field4917;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Z")
    public boolean field4924;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Z")
    public boolean field4930;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "Z")
    public boolean field4931;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Z")
    public boolean field4933;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "Z")
    public boolean field4936;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Z")
    public boolean field4938;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "Z")
    public boolean field4939;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "Z")
    public boolean field4940;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "Z")
    public boolean field4941;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIZZ)V", line = 15)
    public static final void method2149(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class348.field4782 = arg0;
        class587.field7787 = 0x1 << class348.field4782;
        class16.field256 = class587.field7787 >> 1;
        class502.field6718 = (int) Math.sqrt((double) (class16.field256 * class16.field256 + class16.field256 * class16.field256));
        class621.field8240 = class587.field7787 >> 2;
        class636.field8565 = class587.field7787;
        class657.field8966 = arg2;
        class227.field3196 = arg3;
        field4927 = arg4;
        class705.field9916 = new class24[arg1][class657.field8966][class227.field3196];
        class684.field9625 = new class139[arg1];
        if (arg5) {
            class46.field664 = new int[class657.field8966][class227.field3196];
            class600.field7970 = new byte[class657.field8966][class227.field3196];
            class128.field2144 = new short[class657.field8966][class227.field3196];
            class412.field5656 = new class24[1][class657.field8966][class227.field3196];
            class467.field6283 = new class139[1];
        } else {
            class46.field664 = null;
            class600.field7970 = null;
            class128.field2144 = null;
            class412.field5656 = null;
            class467.field6283 = null;
        }
        if (arg6) {
            class510.field6812 = new long[arg1][arg2][arg3];
            class350.field4791 = new class225[65535];
            class583.field7742 = new boolean[65535];
            class697.field9777 = 0;
        } else {
            class510.field6812 = null;
            class350.field4791 = null;
            class583.field7742 = null;
            class697.field9777 = 0;
        }
        class229.method1427(false);
        class249.field3448 = new class112[1000];
        class90.field1369 = 0;
        class547.field7303 = new class112[1000];
        class8.field188 = 0;
        class137.field2226 = new int[arg1][class657.field8966 + 1][class227.field3196 + 1];
        class677.field9570 = new class641[5000];
        class155.field2440 = 0;
        class516.field6888 = new boolean[field4927 + field4927 + 1][field4927 + field4927 + 1];
        class659.field9356 = new boolean[field4927 + field4927 + 2][field4927 + field4927 + 2];
        class692.field9746 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILno;Ljava/lang/String;)Lm;", line = 73)
    public static final class179 method2150(int arg0, int arg1, class658 arg2, String arg3) {
        field4934++;
        int var4 = OpenGL.glGenProgramARB();
        if (arg0 <= 60) {
            return null;
        }
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramStringARB(arg1, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class263.field3648, 0);
        if (class263.field3648[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class179(arg2, arg1, var4);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIIII)V", line = 102)
    public static final void method2151(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4923++;
        if (arg2 - arg1 >= class600.field7959 && arg1 + arg2 <= class366.field4956 && arg3 - arg1 >= class310.field4279 && (arg1 + arg3) <= class442.field6058) {
            class111.method850(arg1, arg4, arg2, (byte) -52, arg3);
        } else {
            class209.method1343(false, arg2, arg3, arg4, arg1);
        }
        if (!arg0) {
            field4925 = 40;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 128)
    public static void method2152(int arg0) {
        field4921 = null;
        if (arg0 != 1) {
            field4943 = null;
        }
        field4943 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)I", line = 139)
    public static final int method2153(byte arg0, int arg1) {
        field4922++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        if (arg0 > -5) {
            field4927 = -27;
        }
        return arg1 + var2;
    }
}
