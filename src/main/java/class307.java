import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class307 {

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field4888 = 0;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field4890 = 1;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4891;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([BILia;)V", line = 6)
    public final void method1955(byte[] arg0, int arg1, class23 arg2) {
        field4887++;
        if (arg2.field302[arg2.field301] != 31 || arg2.field302[arg2.field301 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4891 == null) {
            this.field4891 = new Inflater(true);
        }
        try {
            this.field4891.setInput(arg2.field302, arg2.field301 + 10, -arg2.field301 + -8 - (10 - arg2.field302.length));
            this.field4891.inflate(arg0);
        } catch (Exception var4) {
            this.field4891.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 >= 100) {
            this.field4891.reset();
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZIZIIIJILjava/lang/String;Ljava/lang/String;)V", line = 45)
    public static final void method1956(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, long arg7, int arg8, String arg9, String arg10) {
        field4889++;
        if (!class387.field5967 && class480.field7080 < 500) {
            int var12 = arg2 == arg4 ? class102.field1688 : arg4;
            class162 var13 = new class162(arg9, arg10, var12, arg0, arg5, arg7, arg8, arg6, arg1, arg3);
            class108.field1934.method2541(0, var13);
            class480.field7080++;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V", line = 64)
    public class307() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(III)V", line = 70)
    private class307(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 83)
    public static final void method1957(int arg0) {
        field4886++;
        if (class493.field7193.toLowerCase().indexOf("microsoft") == -1) {
            class55.field882[47] = 73;
            if (class493.field7210 == null) {
                class55.field882[192] = 58;
                class55.field882[222] = 59;
            } else {
                class55.field882[222] = 58;
                class55.field882[192] = 28;
                class55.field882[520] = 59;
            }
            class55.field882[92] = 74;
            class55.field882[61] = 27;
            class55.field882[44] = 71;
            class55.field882[91] = 42;
            class55.field882[45] = 26;
            class55.field882[59] = 57;
            class55.field882[46] = 72;
            class55.field882[93] = 43;
        } else {
            class55.field882[189] = 26;
            class55.field882[222] = 59;
            class55.field882[219] = 42;
            class55.field882[191] = 73;
            class55.field882[187] = 27;
            class55.field882[188] = 71;
            class55.field882[190] = 72;
            class55.field882[192] = 58;
            class55.field882[223] = 28;
            class55.field882[221] = 43;
            class55.field882[186] = 57;
            class55.field882[220] = 74;
        }
        if (arg0 != 4619) {
            method1957(122);
        }
    }
}
