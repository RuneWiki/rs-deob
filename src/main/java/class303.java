import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class303 extends InputStream {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Z")
    public static boolean field4330 = false;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "[I")
    public static int[] field4335 = new int[13];

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lra;")
    public static class57 field4332;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "Lra;")
    public static class57 field4336;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 14)
    public static void method1907(int arg0) {
        if (arg0 == -3) {
            field4335 = null;
            field4336 = null;
            field4332 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)I", line = 26)
    public static final int method1908(int arg0) {
        field4331++;
        if (arg0 != 22838) {
            field4330 = false;
        }
        return class109.field1254;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V", line = 41)
    public static final void method1909(int arg0) {
        field4334++;
        if (arg0 < 126) {
            return;
        }
        for (class423 var1 = (class423) class334.field4906.method1124(-1); var1 != null; var1 = (class423) class334.field4906.method1119(false)) {
            class227 var2 = var1.field6076;
            if (class410.field5931 != var2.field1308 || var2.field3091) {
                var1.method2290((byte) 98);
                var2.method1461(-107);
            } else if (class221.field3033 >= var2.field3104) {
                var2.method1459(class245.field3329, -119);
                if (var2.field3091) {
                    var1.method2290((byte) 98);
                } else {
                    class310.method1947(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)Lik;", line = 77)
    public static final class115 method1910(boolean arg0, int arg1) {
        field4333++;
        if (arg0) {
            method1911(-112);
        }
        if (arg1 == 0) {
            return new class351();
        } else if (arg1 == 1) {
            return new class150();
        } else if (arg1 == 2) {
            return new class94();
        } else if (arg1 == 3) {
            return new class6();
        } else if (arg1 == 4) {
            return new class448();
        } else if (arg1 == 5) {
            return new class114();
        } else if (arg1 == 6) {
            return new class366();
        } else if (arg1 == 7) {
            return new class96();
        } else if (arg1 == 8) {
            return new class117();
        } else if (arg1 == 9) {
            return new class223();
        } else if (arg1 == 10) {
            return new class21();
        } else if (arg1 == 11) {
            return new class218();
        } else if (arg1 == 12) {
            return new class440();
        } else if (arg1 == 13) {
            return new class146();
        } else if (arg1 == 14) {
            return new class98();
        } else if (arg1 == 15) {
            return new class122();
        } else if (arg1 == 16) {
            return new class406();
        } else if (arg1 == 17) {
            return new class369();
        } else if (arg1 == 18) {
            return new class355();
        } else if (arg1 == 19) {
            return new class55();
        } else if (arg1 == 20) {
            return new class356();
        } else if (arg1 == 21) {
            return new class275();
        } else if (arg1 == 22) {
            return new class42();
        } else if (arg1 == 23) {
            return new class420();
        } else if (arg1 == 24) {
            return new class217();
        } else if (arg1 == 25) {
            return new class103();
        } else if (arg1 == 26) {
            return new class224();
        } else if (arg1 == 27) {
            return new class419();
        } else if (arg1 == 28) {
            return new class109();
        } else if (arg1 == 29) {
            return new class54();
        } else if (arg1 == 30) {
            return new class427();
        } else if (arg1 == 31) {
            return new class231();
        } else if (arg1 == 32) {
            return new class56();
        } else if (arg1 == 33) {
            return new class342();
        } else if (arg1 == 34) {
            return new class186();
        } else if (arg1 == 35) {
            return new class279();
        } else if (arg1 == 36) {
            return new class170();
        } else if (arg1 == 37) {
            return new class85();
        } else if (arg1 == 38) {
            return new class388();
        } else if (arg1 == 39) {
            return new class297();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "read", descriptor = "()I", line = 399)
    public final int read() {
        field4338++;
        class278.method1757(30000L, 0);
        return -1;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)V", line = 409)
    public static final void method1911(int arg0) {
        field4337++;
        class56.method322();
        for (int var1 = 0; var1 < 4; var1++) {
            class54.field613[var1].method240((byte) -103);
        }
        class418.method2599((byte) 118);
        class308.method1926((byte) 82);
        System.gc();
        if (arg0 <= 62) {
            method1911(59);
        }
    }
}
