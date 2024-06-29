import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class502 extends class508 {

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Z")
    public boolean field7382;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "J")
    public long field7388;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "Ljava/lang/String;")
    public String field7375;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "Z")
    public boolean field7387;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public int field7384;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "Ljava/lang/String;")
    public String field7391;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public int field7389;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public int field7376;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public int field7377;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field7381 = 0;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "Leo;")
    public static class423 field7383 = null;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "Leo;")
    public static class423 field7378 = null;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Lpb;")
    public static class296 field7379 = new class296("", 14);

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V", line = 13)
    public static final void method2997(byte arg0) {
        field7380++;
        class38 var1 = null;
        try {
            class277 var2 = class172.field2221.method2629("2", false);
            while (var2.field3542 == 0) {
                class463.method2773(1L, -118);
            }
            if (var2.field3542 == 1) {
                var1 = (class38) var2.field3541;
                class88 var3 = new class88(class451.field6277 * 6 + 3);
                var3.method565(arg0 - 97, 1);
                var3.method609(class451.field6277, -76);
                for (int var4 = 0; var4 < class276.field3537.length; var4++) {
                    if (class346.field4415[var4]) {
                        var3.method609(var4, -50);
                        var3.method572(arg0 - 99, class276.field3537[var4]);
                    }
                }
                var1.method246(var3.field1176, 0, arg0 + 25, var3.field1223);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method243(0);
            }
        } catch (Exception var5) {
        }
        if (arg0 != -24) {
            method2999(null, true, 43);
        }
        class491.field7173 = class173.method1134(true);
        class374.field4865 = false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 69)
    public static final int method2998(String arg0, boolean arg1) {
        field7385++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1) {
            field7379 = null;
        }
        for (int var2 = 0; var2 < class364.field4692; var2++) {
            if (arg0.equalsIgnoreCase(class231.field2996[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([SZI)[S", line = 101)
    public static final short[] method2999(short[] arg0, boolean arg1, int arg2) {
        field7374++;
        short[] var3 = new short[arg2];
        if (arg1) {
            method2998(null, true);
        }
        class526.method3110(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 120)
    public static void method3000(int arg0) {
        field7379 = null;
        if (arg0 <= 65) {
            method2999(null, true, -103);
        }
        field7383 = null;
        field7378 = null;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 143)
    public class502(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field7382 = arg8;
        this.field7390 = arg3;
        this.field7388 = arg5;
        this.field7375 = arg1;
        this.field7387 = arg9;
        this.field7384 = arg4;
        this.field7391 = arg0;
        this.field7389 = arg7;
        this.field7376 = arg2;
        this.field7377 = arg6;
    }
}
