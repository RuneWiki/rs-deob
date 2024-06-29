import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class232 extends OutputStream {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[B")
    public static byte[] field3389 = new byte[2048];

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Z")
    public static boolean field3388 = false;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1628(int arg0) {
        field3386++;
        class361.field4976 = 0;
        int var1 = (class262.field3781.field4537 >> 7) + class279.field4012;
        int var2 = (class262.field3781.field4530 >> 7) + class189.field2810;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class361.field4976 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class361.field4976 = 1;
        }
        if (arg0 == -1 && class361.field4976 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class361.field4976 = 0;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 30)
    public static final void method1629(int arg0) {
        field3390++;
        class38.field477 = 0;
        class437.field6218 = -1;
        if (arg0 != 3053) {
            method1628(-100);
        }
        class307.field4348 = -1;
        class89.field1266 = -1;
    }

    @OriginalMember(owner = "client!tg", name = "write", descriptor = "(I)V", line = 46)
    public final void write(int arg0) throws IOException {
        field3387++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 54)
    public static void method1630(boolean arg0) {
        if (!arg0) {
            field3389 = null;
        }
        field3389 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 64)
    public static final void method1631(String arg0, int arg1, byte arg2) {
        class164.field2387++;
        class336.method2111(class290.field4114, 109);
        field3391++;
        class311.field4403.method1180((byte) -110, class345.method2147(arg0, (byte) 110) + 1);
        class311.field4403.method1184((byte) -53, arg0);
        int var3 = 41 % ((arg2 - 44) / 56);
        class311.field4403.method1180((byte) -110, arg1);
    }
}
