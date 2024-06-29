import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class149 extends class86 {

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Ljava/lang/String;")
    public String field1930;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lts;")
    public static class356 field1928 = null;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Liu;")
    public static class390 field1931 = new class390(28, 7);

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field1932 = new String[100];

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "[Lqg;")
    public static class307[] field1929;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method918(int arg0) {
        field1927++;
        class224.method1386(-25688);
        class298.field4343 = null;
        class442.field6449 = null;
        class99.field1353 = null;
        if (arg0 < 1) {
            field1932 = null;
        }
        class188.field2681 = null;
        class93.field1256 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class149() {
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public static void method919(int arg0) {
        field1928 = null;
        field1929 = null;
        field1932 = null;
        field1931 = null;
        if (arg0 != -26799) {
            method920(12, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class149(String arg0) {
        this.field1930 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
    public static final void method920(int arg0, byte arg1) {
        field1933++;
        if (!class322.method1928(arg0, 7387)) {
            return;
        }
        class356[] var2 = class181.field2591[arg0];
        if (arg1 > -111) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class356 var4 = var2[var3];
            if (var4 != null) {
                var4.field5224 = 0;
                var4.field5217 = 1;
                var4.field5221 = 0;
            }
        }
    }
}
