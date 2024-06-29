import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class327 extends class242 {

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public int field5501;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public int field5493;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field5490 = 100;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Ljf;")
    public static class229 field5491 = class212.method1457((byte) 93, "(U0a )2 via: ");

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Ljf;")
    public static class229 field5496 = class212.method1457((byte) 103, "cross");

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field5494 = 0;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "[S")
    public static short[] field5492;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 9)
    public static void method2196(int arg0) {
        if (arg0 != 2000000) {
            method2198(-109);
        }
        field5491 = null;
        field5496 = null;
        field5492 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V", line = 43)
    public static final void method2197(int arg0, byte arg1) {
        field5497++;
        if (arg1 >= -74) {
            method2198(59);
        }
        if (arg0 == -1 || !class192.method1314(arg0, 119)) {
            return;
        }
        class67[] var2 = class23.field423[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class67 var4 = var2[var3];
            if (var4.field1272 != null) {
                class192 var5 = new class192();
                var5.field3324 = var4.field1272;
                var5.field3327 = var4;
                class122.method863(var5, 2000000, (byte) 5);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 89)
    public static final void method2198(int arg0) {
        field5499++;
        class243.field4299 = -1;
        class288.field4927 = 0;
        class244.field4338 = false;
        class16.field253 = 1;
        class4.field27 = arg0;
        class47.field865 = 0;
        class110.field1940 = 0;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(II)V", line = 109)
    public class327(int arg0, int arg1) {
        this.field5501 = arg0;
        this.field5493 = arg1;
    }
}
