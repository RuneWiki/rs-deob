import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class332 {

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[Ljava/lang/String;")
    private String[] field4971;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field4967 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lj;")
    public static class240 field4966 = new class240(2, 4);

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Z")
    public static boolean field4975 = true;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lo;")
    public static class332 field4973 = new class332("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Ldp;")
    public static class319 field4974;

    @OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field4968++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z", line = 50)
    public static final boolean method2034(byte arg0) {
        field4970++;
        if (arg0 > -98) {
            field4967 = 26;
        }
        return class428.field6110 == 0 ? class245.field3510.method1134(-104) : true;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 87)
    public static void method2035(byte arg0) {
        field4966 = null;
        field4974 = null;
        if (arg0 != 99) {
            method2035((byte) 12);
        }
        field4973 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 116)
    public final String method2036(int arg0, byte arg1) {
        if (arg1 == -21) {
            field4965++;
            return this.field4971[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 144)
    public class332(String arg0, String arg1, String arg2, String arg3) {
        this.field4971 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB)B", line = 152)
    public static final byte method2037(int arg0, int arg1, byte arg2) {
        field4972++;
        int var3 = 27 / ((arg2 + 34) / 45);
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 179)
    public static final void method2038(byte arg0) {
        field4969++;
        for (class97 var1 = (class97) class57.field794.method1589(125); var1 != null; var1 = (class97) class57.field794.method1589(-99)) {
            class334.method2047(false, var1);
        }
        if (arg0 > -42) {
            field4967 = -14;
        }
        int var2;
        int var3;
        if (class337.field5038.method2209(class170.field2424, -105)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class314.field4722;
            var3 = class314.field4722;
        }
        client.method2773();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method2775();
            client.method2778(var4);
            client.method2782(var4);
        }
        client.method2784();
        client.method2788();
    }
}
