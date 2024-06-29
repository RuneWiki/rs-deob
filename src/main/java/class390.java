import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class390 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field5534;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lqt;")
    public static class459 field5530 = new class459(75, 3);

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lqv;")
    public static class316 field5535 = new class316(18, 17);

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lqv;")
    public static class316 field5537 = new class316(61, 10);

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lqt;")
    public static class459 field5538 = new class459(82, -1);

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lhl;")
    public static class375 field5539 = new class375(64);

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field5540 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lah;")
    public static class267 field5532;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lci;")
    public static class320 field5541;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 6)
    public static void method2352(byte arg0) {
        field5538 = null;
        field5530 = null;
        field5537 = null;
        if (arg0 != -63) {
            method2352((byte) 90);
        }
        field5541 = null;
        field5532 = null;
        field5535 = null;
        field5539 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ)Z", line = 23)
    public static final boolean method2353(byte arg0, boolean arg1) {
        field5531++;
        int var2 = 59 / ((arg0 + 21) / 40);
        boolean var3 = class76.field1256.method292();
        if (var3 == arg1) {
            return true;
        }
        if (!arg1) {
            class76.field1256.method241();
        } else if (!class76.field1256.method236()) {
            arg1 = false;
        }
        if (var3 == arg1) {
            return false;
        } else {
            class220.field3371.field2578 = arg1;
            class220.field3371.method1044(1, class280.field4173);
            return true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;", line = 61)
    public final String toString() {
        field5533++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V", line = 69)
    public static final void method2354(byte arg0, int arg1) {
        field5536++;
        if (!class175.method1224(arg1, 7607)) {
            return;
        }
        if (arg0 >= -55) {
            field5540 = -103;
        }
        class198[] var2 = class283.field4217[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class198 var4 = var2[var3];
            if (var4 != null) {
                var4.field2900 = 1;
                var4.field2935 = 0;
                var4.field2975 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V", line = 111)
    public class390(int arg0) {
        this.field5534 = arg0;
    }
}
