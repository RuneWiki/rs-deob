import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class320 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public int field4901 = 2;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Z")
    public boolean field4902 = false;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public int field4908 = 64;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field4899 = -1;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field4898 = 64;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public int field4909 = 1;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Z")
    public boolean field4900 = false;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
    public static int[] field4896 = new int[2048];

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "J")
    public static long field4906 = 0L;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lpg;")
    public static class492 field4904 = new class492(42, 2);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field4912 = -1;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4913 = null;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILtl;BI)V")
    private final void method2071(int arg0, class91 arg1, byte arg2, int arg3) {
        field4911++;
        if (arg3 == 1) {
            this.field4899 = arg1.method631(10494);
            if (this.field4899 == 65535) {
                this.field4899 = -1;
            }
        } else if (arg3 == 2) {
            this.field4898 = arg1.method631(10494) + 1;
            this.field4908 = arg1.method631(10494) + 1;
        } else if (arg3 == 3) {
            arg1.method619((byte) -23);
        } else if (arg3 == 4) {
            this.field4901 = arg1.method618((byte) 100);
        } else if (arg3 == 5) {
            this.field4909 = arg1.method618((byte) 100);
        } else if (arg3 == 6) {
            this.field4900 = true;
        } else if (arg3 == 7) {
            this.field4902 = true;
        }
        if (arg2 < 122) {
            this.method2071(-124, null, (byte) 122, -88);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z")
    public static final boolean method2072(int arg0, int arg1) {
        field4905++;
        if (arg1 == -6466) {
            return arg0 >= 4 && arg0 <= 8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method2073(int arg0) {
        field4904 = null;
        field4913 = null;
        if (arg0 != 24041) {
            field4913 = null;
        }
        field4896 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I")
    public static final int method2074(int arg0) {
        field4907++;
        if (class260.field3628 != null) {
            return 3;
        } else if (arg0 == -32190) {
            return class166.field2420 ? 2 : 1;
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltl;II)V")
    public final void method2075(class91 arg0, int arg1, int arg2) {
        field4903++;
        while (true) {
            int var4 = arg0.method618((byte) 100);
            if (var4 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    this.field4901 = -62;
                    return;
                }
            }
            this.method2071(arg2, arg0, (byte) 125, var4);
        }
    }
}
