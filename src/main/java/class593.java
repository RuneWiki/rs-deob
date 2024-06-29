import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class593 extends OutputStream {

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)Z")
    public static final boolean method3190(int arg0, int arg1, int arg2) {
        field7515++;
        if (arg0 != 6151) {
            method3190(-92, 42, 94);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vv", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field7517++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public static final void method3191(int arg0) {
        class634.field8064 = null;
        class152.field1926 = null;
        if (arg0 <= 114) {
            return;
        }
        class88.field1220 = null;
        class177.field2324 = null;
        class225.field3058 = null;
        class394.field5191 = null;
        field7514++;
        class790.field10812 = null;
        class362.field4402 = null;
        class399.field5278 = null;
        class207.field2858 = null;
        class226.field3060 = null;
        class595.field7562 = null;
        class585.field7406 = null;
        class544.field6816 = null;
        class668.field8688 = null;
        class235.field3205 = null;
        class662.field8639 = null;
        class689.field8854 = null;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3192(int arg0, String arg1) {
        field7516++;
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        int var4 = 24 % ((-arg0 - 29) / 35);
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var5 = arg1.indexOf(" ", "directlogin ".length());
            if (var5 >= 0) {
                int var6 = arg1.length();
                arg1 = arg1.substring(0, var5) + " ";
                for (int var7 = var5 + 1; var7 < var6; var7++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }
}
