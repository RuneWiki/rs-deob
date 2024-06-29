import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class301 {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4111 = "Loading...";

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Loo;")
    public static class383 field4107;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4106;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILtq;[B)V", line = 4)
    public final void method1779(int arg0, class250 arg1, byte[] arg2) {
        field4108++;
        if (arg1.field3406[arg1.field3389] != 31 || arg1.field3406[arg1.field3389 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4106 == null) {
            this.field4106 = new Inflater(true);
        }
        try {
            this.field4106.setInput(arg1.field3406, arg1.field3389 + 10, -8 - (arg1.field3389 - (arg1.field3406.length + -10)));
            this.field4106.inflate(arg2);
        } catch (Exception var4) {
            this.field4106.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 != -26241) {
            method1783((byte) 61);
        }
        this.field4106.reset();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V", line = 29)
    public static final void method1780(int arg0, byte arg1) {
        field4105++;
        if (arg0 == -1 || !class289.field3940[arg0]) {
            return;
        }
        class131.field1693.method1674(arg0, 1574);
        if (class235.field3227[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class235.field3227[arg0].length; var3++) {
            if (class235.field3227[arg0][var3] != null) {
                if (class235.field3227[arg0][var3].field2492 == 2) {
                    var2 = false;
                } else {
                    class235.field3227[arg0][var3] = null;
                }
            }
        }
        if (arg1 == -59) {
            if (var2) {
                class235.field3227[arg0] = null;
            }
            class289.field3940[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 78)
    public class301() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 81)
    public static final int method1781(int arg0, String arg1, int arg2) {
        field4109++;
        return arg2 == -9 ? class297.method1743(arg1, 124, true, arg0) : -63;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 100)
    public static void method1782(int arg0) {
        int var1 = -81 % ((1 - arg0) / 47);
        field4111 = null;
        field4107 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 113)
    public static final void method1783(byte arg0) {
        if (arg0 >= -58) {
            field4111 = null;
        }
        field4110++;
        class69.field722.method613(true);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(III)V", line = 127)
    private class301(int arg0, int arg1, int arg2) {
    }
}
