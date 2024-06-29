import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class336 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field4723;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 14)
    public class336(String arg0, String arg1, String arg2, int arg3) {
        this.field4723 = arg3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI)V", line = 29)
    public static final void method2133(byte[] arg0, int arg1) {
        field4724++;
        class494 var2 = new class494(arg0);
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method2964((byte) 81);
                if (var4 == 0) {
                    int var6 = 29 % ((arg1 + 41) / 46);
                    if (var3) {
                        return;
                    }
                    if (class743.field10308 == null) {
                        class367.field5105 = 4;
                        class165.field2603 = new int[4];
                        class743.field10308 = new int[4];
                    }
                    for (int var7 = 0; var7 < class743.field10308.length; var7++) {
                        class743.field10308[var7] = 0;
                        class165.field2603[var7] = var7 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class743.field10308 == null) {
                        class367.field5105 = 4;
                        class165.field2603 = new int[4];
                        class743.field10308 = new int[4];
                    }
                    var3 = true;
                    for (int var5 = 0; var5 < class743.field10308.length; var5++) {
                        class743.field10308[var5] = var2.method2988(-3);
                        class165.field2603[var5] = var2.method2988(-3);
                    }
                } else if (var4 == 2) {
                    class445.field6071 = var2.method2998(true);
                } else if (var4 == 3) {
                    class367.field5105 = var2.method2964((byte) 83);
                    class165.field2603 = new int[class367.field5105];
                    class743.field10308 = new int[class367.field5105];
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;", line = 110)
    public final String toString() {
        field4722++;
        throw new IllegalStateException();
    }
}
