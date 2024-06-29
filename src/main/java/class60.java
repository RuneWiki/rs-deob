import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class60 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[[Ljava/lang/String;")
    public static String[][] field738 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lqfa;")
    public static class98 field741 = new class98(24, -1);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!bd", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field743++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method511(int arg0, int arg1, int arg2) {
        field739++;
        if (arg0 != 24121) {
            method512(null, (byte) -9);
        }
        return class458.method2722(true, arg1, arg2) & class750.method4164(arg0 ^ 0xFFFFBB4F, arg2, arg1);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lee;B)V", line = 31)
    public static final void method512(class675 arg0, byte arg1) {
        field740++;
        byte[] var2 = new byte[24];
        if (class209.field2757 != null) {
            try {
                class209.field2757.method2581(0L, true);
                class209.field2757.method2582((byte) 25, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg1 < 99) {
            field741 = null;
        }
        arg0.method3748(true, var2, 24, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 77)
    public static void method513(int arg0) {
        field741 = null;
        if (arg0 != 2) {
            method512(null, (byte) -44);
        }
        field738 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V", line = 91)
    public class60(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)V", line = 102)
    public static final void method514(boolean arg0, int arg1) {
        field742++;
        if (class222.field2897 == arg1 || arg0) {
            return;
        }
        if (arg1 == 13) {
            if (class448.field6360 == null) {
                class153.method1033(15341, class209.field2755, class449.field6370, class343.field4791);
            } else {
                class544.method3155(126, class343.field4791);
            }
        }
        if (arg1 != 13 && class615.field8605 != null) {
            class615.field8605.method2844(Integer.MIN_VALUE);
            class615.field8605 = null;
        }
        if (arg1 == 3) {
            class202.method1229(class457.field6447 != class450.field6384, (byte) -128);
        }
        if (arg1 == 7) {
            class542.method3147(-118, class457.field6447 != class258.field3728);
        }
        if (arg1 == 5) {
            if (class448.field6360 == null) {
                class429.method2622(class209.field2755, 125, class449.field6370);
            } else {
                class553.method3202(false);
            }
        } else if (arg1 == 6) {
            if (class448.field6360 == null) {
                class153.method1033(15341, class209.field2755, class449.field6370, class343.field4791);
            } else {
                class544.method3155(126, class343.field4791);
            }
        } else if (arg1 == 9) {
            if (class448.field6360 == null) {
                class153.method1033(15341, class209.field2755, class449.field6370, class343.field4791);
            } else {
                class544.method3155(126, class343.field4791);
            }
        } else if (arg1 == 12) {
            if (class448.field6360 == null) {
                class429.method2622(class209.field2755, 114, class449.field6370);
            } else {
                class553.method3202(arg0);
            }
        }
        if (class456.method2713(class222.field2897, (byte) -117)) {
            class580.field8187.field4496 = 2;
            class211.field2784.field4496 = 2;
            class236.field3172.field4496 = 2;
            class360.field5104.field4496 = 2;
            class48.field567.field4496 = 2;
            class476.field6761.field4496 = 2;
            class119.field1444.field4496 = 2;
        }
        if (class456.method2713(arg1, (byte) -113)) {
            class166.field2281 = 0;
            class164.field2261 = 0;
            class551.field7760 = 1;
            class697.field9607 = 0;
            class179.field2399 = 1;
            class673.method3679((byte) 113, true);
            class580.field8187.field4496 = 1;
            class211.field2784.field4496 = 1;
            class236.field3172.field4496 = 1;
            class360.field5104.field4496 = 1;
            class48.field567.field4496 = 1;
            class476.field6761.field4496 = 1;
            class119.field1444.field4496 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class193.method1197(-126);
        }
        boolean var2 = arg1 == 2 || class333.method2179(arg1, (byte) -56) || class307.method2010(arg1, -8714);
        boolean var3 = class222.field2897 == 2 || class333.method2179(class222.field2897, (byte) 126) || class307.method2010(class222.field2897, -8714);
        if (var2 != var3) {
            if (var2) {
                class118.field1431 = class147.field2116;
                if (class557.field7812.field6515.method3029(false) == 0) {
                    class660.method3618(2, 1);
                } else {
                    class77.method619(class587.field8276, 2, 0, class147.field2116, 1, class557.field7812.field6515.method3029(false), false);
                    class64.method540(-1);
                }
                class25.field349.method3407((byte) 0, false);
            } else {
                class660.method3618(2, 1);
                class25.field349.method3407((byte) 0, true);
            }
        }
        if (class456.method2713(arg1, (byte) -122) || arg1 == 13) {
            class268.field3831.method432();
        }
        class222.field2897 = arg1;
    }
}
