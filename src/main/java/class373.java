import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class373 {

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Ljava/lang/String;")
    private String field5398 = "null";

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lmga;")
    public static class739 field5391 = new class739(0, 3);

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field5401 = -1;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "C")
    public char field5385;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "C")
    public char field5386;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    private int field5389;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    private int field5402;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lee;")
    public class706 field5396;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lee;")
    private class706 field5399;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)I")
    public final int method2310(int arg0, byte arg1) {
        field5394++;
        if (arg1 <= 116) {
            this.field5402 = 71;
        }
        if (this.field5396 == null) {
            return this.field5402;
        } else {
            class119 var3 = (class119) this.field5396.method3953((long) arg0, 14);
            return var3 == null ? this.field5402 : var3.field1725;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    private final void method2311(byte arg0) {
        this.field5399 = new class706(this.field5396.method3956((byte) 105));
        field5390++;
        if (arg0 > 97) {
            for (class482 var2 = (class482) this.field5396.method3960(0); var2 != null; var2 = (class482) this.field5396.method3955((byte) -109)) {
                class554 var3 = new class554(var2.field6664, (int) var2.field1409);
                this.field5399.method3962(class268.method1747(var2.field6664, 1009120652), var3, -118);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjp;)V")
    public final void method2312(byte arg0, class376 arg1) {
        while (true) {
            int var3 = arg1.method2398(-1372747256);
            if (var3 == 0) {
                if (arg0 <= 92) {
                    return;
                }
                field5387++;
                return;
            }
            this.method2314(4, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method2313(int arg0) {
        if (arg0 != 21746) {
            field5391 = null;
        }
        field5391 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjp;I)V")
    private final void method2314(int arg0, class376 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5386 = class682.method3796((byte) 42, arg1.method2387((byte) 74));
        } else if (arg2 == 2) {
            this.field5385 = class682.method3796((byte) 42, arg1.method2387((byte) 77));
        } else if (arg2 == 3) {
            this.field5398 = arg1.method2379((byte) 85);
        } else if (arg2 == 4) {
            this.field5402 = arg1.method2384(59);
        } else if (arg2 == 5 || arg2 == 6) {
            this.field5389 = arg1.method2359(-1);
            this.field5396 = new class706(class719.method4014(this.field5389, (byte) -100));
            for (int var4 = 0; var4 < this.field5389; var4++) {
                int var5 = arg1.method2384(108);
                class101 var6;
                if (arg2 == 5) {
                    var6 = new class482(arg1.method2379((byte) 85));
                } else {
                    var6 = new class119(arg1.method2384(40));
                }
                this.field5396.method3962((long) var5, var6, -122);
            }
        }
        if (arg0 == 4) {
            field5397++;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method2315(int arg0, int arg1) {
        if (arg0 != 25851) {
            this.method2310(69, (byte) -125);
        }
        field5392++;
        if (this.field5396 == null) {
            return this.field5398;
        } else {
            class482 var3 = (class482) this.field5396.method3953((long) arg1, 14);
            return var3 == null ? this.field5398 : var3.field6664;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Z")
    public final boolean method2316(int arg0, int arg1) {
        field5395++;
        if (this.field5396 == null) {
            return false;
        }
        if (this.field5399 == null) {
            this.method2317((byte) 113);
        }
        class119 var3 = (class119) this.field5399.method3953((long) arg0, arg1 ^ 0xFFFFFFF2);
        if (var3 == null) {
            return false;
        } else {
            return arg1 == -4;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    private final void method2317(byte arg0) {
        field5388++;
        this.field5399 = new class706(this.field5396.method3956((byte) 105));
        if (arg0 != 113) {
            this.method2312((byte) -48, null);
        }
        for (class119 var2 = (class119) this.field5396.method3960(0); var2 != null; var2 = (class119) this.field5396.method3955((byte) 104)) {
            class119 var3 = new class119((int) var2.field1409);
            this.field5399.method3962((long) var2.field1725, var3, -116);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2318(String arg0, int arg1) {
        field5393++;
        if (this.field5396 == null) {
            return false;
        }
        if (arg1 < 120) {
            this.method2318(null, -54);
        }
        if (this.field5399 == null) {
            this.method2311((byte) 99);
        }
        for (class554 var3 = (class554) this.field5399.method3953(class268.method1747(arg0, 1009120652), 14); var3 != null; var3 = (class554) this.field5399.method3958(-15797)) {
            if (var3.field7477.equals(arg0)) {
                return true;
            }
        }
        return false;
    }
}
