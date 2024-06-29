import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class539 {

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "Ljava/lang/String;")
    private String field7012 = "null";

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "Z")
    public static volatile boolean field7014 = true;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "C")
    public char field7001;

    @OriginalMember(owner = "client!nea", name = "p", descriptor = "C")
    public char field7016;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    private int field7007;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!nea", name = "o", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "Lbc;")
    private class9 field7005;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "Lbc;")
    public class9 field7013;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)I")
    public final int method2858(int arg0, int arg1) {
        field7015++;
        if (this.field7013 == null) {
            return this.field7007;
        }
        if (arg0 != 14285) {
            this.method2864((byte) 83);
        }
        class195 var3 = (class195) this.field7013.method39((long) arg1, arg0 + 17465);
        return var3 == null ? this.field7007 : var3.field2546;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lfd;B)V")
    public final void method2859(class418 arg0, byte arg1) {
        if (arg1 != 4) {
            this.method2864((byte) 87);
        }
        while (true) {
            int var3 = arg0.method2396(-128);
            if (var3 == 0) {
                field7009++;
                return;
            }
            this.method2861(arg1 ^ 0xFFFFFFFA, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method2860(int arg0, int arg1) {
        field7010++;
        if (this.field7013 == null) {
            return this.field7012;
        }
        class181 var3 = (class181) this.field7013.method39((long) arg0, 31750);
        if (var3 == null) {
            return this.field7012;
        } else {
            if (arg1 != -4639) {
                this.field7007 = -101;
            }
            return var3.field2232;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILfd;)V")
    private final void method2861(int arg0, int arg1, class418 arg2) {
        field7006++;
        if (~arg1 == arg0) {
            this.field7001 = class103.method778(12270, arg2.method2387((byte) 104));
        } else if (arg1 == 2) {
            this.field7016 = class103.method778(12270, arg2.method2387((byte) -27));
        } else if (arg1 == 3) {
            this.field7012 = arg2.method2394(arg0 ^ 0xFFFFFFFA);
        } else if (arg1 == 4) {
            this.field7007 = arg2.method2355(104);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method2393(-30727);
            this.field7013 = new class9(class426.method2447(var4, 250));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2355(57);
                class424 var7;
                if (arg1 == 5) {
                    var7 = new class181(arg2.method2394(4));
                } else {
                    var7 = new class195(arg2.method2355(37));
                }
                this.field7013.method38(var7, -113, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
    private final void method2862(int arg0) {
        this.field7005 = new class9(this.field7013.method47(-1));
        field7011++;
        class181 var2 = (class181) this.field7013.method42((byte) 101);
        if (arg0 != 5) {
            this.field7012 = null;
        }
        while (var2 != null) {
            class317 var3 = new class317(var2.field2232, (int) var2.field5499);
            this.field7005.method38(var3, -12, class183.method1229(var2.field2232, 2));
            var2 = (class181) this.field7013.method40(false);
        }
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(II)Z")
    public final boolean method2863(int arg0, int arg1) {
        field7008++;
        if (this.field7013 == null) {
            return false;
        } else if (arg1 == 5) {
            if (this.field7005 == null) {
                this.method2864((byte) -76);
            }
            class195 var3 = (class195) this.field7005.method39((long) arg0, arg1 ^ 0x7C03);
            return var3 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V")
    private final void method2864(byte arg0) {
        this.field7005 = new class9(this.field7013.method47(-1));
        field7002++;
        for (class195 var2 = (class195) this.field7013.method42((byte) 88); var2 != null; var2 = (class195) this.field7013.method40(false)) {
            class195 var3 = new class195((int) var2.field5499);
            this.field7005.method38(var3, 3, (long) var2.field2546);
        }
        if (arg0 > -71) {
            this.method2859(null, (byte) -53);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2865(byte arg0, String arg1) {
        field7004++;
        if (this.field7013 == null) {
            return false;
        }
        if (this.field7005 == null) {
            this.method2862(5);
        }
        for (class317 var3 = (class317) this.field7005.method39(class183.method1229(arg1, 2), 31750); var3 != null; var3 = (class317) this.field7005.method46(0)) {
            if (var3.field4111.equals(arg1)) {
                return true;
            }
        }
        if (arg0 < 48) {
            this.method2858(-76, -22);
        }
        return false;
    }
}
