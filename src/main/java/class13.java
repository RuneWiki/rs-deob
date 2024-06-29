import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends InputStream {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Z")
    public static boolean field200 = false;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Liu;")
    public static class390 field203;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method98(int arg0) {
        if (arg0 == 0) {
            field203 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "read", descriptor = "()I")
    public final int read() {
        field202++;
        class322.method1935(true, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIIIILhe;)V")
    public static final void method99(boolean arg0, int arg1, int arg2, int arg3, int arg4, class239 arg5) {
        class376.field5626 = arg4;
        field204++;
        class409.field6002 = 10000;
        class181.field2593 = arg5;
        class25.field424 = arg0;
        if (arg3 == 10083) {
            class378.field5658 = 1;
            class8.field139 = arg1;
            class55.field857 = arg2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lis;III)V")
    public static final void method100(class330 arg0, int arg1, int arg2, int arg3) {
        long var4 = class310.field4512[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field4795 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field4791[arg0.field4795++] = class76.field1084[var8 - 1].field5595;
            var6 += 16L;
        }
        for (int var9 = arg0.field4795; var9 < 4; var9++) {
            arg0.field4791[var9] = null;
        }
    }
}
