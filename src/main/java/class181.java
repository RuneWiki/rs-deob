import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class181 extends InputStream {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[Z")
    public static boolean[] field2475 = new boolean[100];

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
    public static boolean field2479 = false;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[I")
    public static int[] field2483 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)V")
    public static final void method1219(byte arg0, int arg1, int arg2) {
        int var3 = class334.field4729 * arg2 >> 8;
        field2480++;
        if (arg0 != -52) {
            method1221(-98);
        }
        if (arg1 == -1 && !class215.field3045) {
            class422.method2665((byte) -40);
        } else if (arg1 != -1 && (class328.field4657 != arg1 || !class246.method1673((byte) 61)) && var3 != 0 && !class215.field3045) {
            class433.method2719(arg1, 2, class393.field5553, false, 0, var3, true);
        }
        class328.field4657 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "read", descriptor = "()I")
    public final int read() {
        field2477++;
        class150.method907(30000L, (byte) -32);
        return -1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static final void method1220(int arg0) {
        class305.field4288.method644(((float) class23.field289 * 0.1F + 0.7F) * class244.field3456);
        if (arg0 != -1) {
            method1219((byte) -41, 23, 30);
        }
        field2478++;
        class305.field4288.method640(field2481, class42.field519, class419.field5992, (float) class223.field3134, (float) class85.field969, (float) class439.field6281);
        class305.field4288.method688(class382.field5353);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method1221(int arg0) {
        if (class324.field4619 < arg0) {
            class324.field4619 = 0;
            class113.field1395 = -1;
            class401.field5727 = -1;
        }
        field2476++;
        if (class324.field4619 > class308.field4359) {
            class113.field1395 = -1;
            class401.field5727 = -1;
            class324.field4619 = class308.field4359;
        }
        if (class419.field5993 < 0) {
            class419.field5993 = 0;
            class401.field5727 = -1;
            class113.field1395 = -1;
        }
        if (class419.field5993 > class308.field4364) {
            class113.field1395 = -1;
            class419.field5993 = class308.field4364;
            class401.field5727 = -1;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lor;")
    public static final class383 method1222(int arg0, int arg1) {
        field2482++;
        class383 var2 = (class383) class230.field3251.method1625((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class405.field5847.method2431((byte) 89, 4, arg0);
        class383 var4 = new class383();
        if (var3 != null) {
            var4.method2460(-119, new class236(var3), arg0);
        }
        var4.method2461(false, arg0);
        if (arg1 == 15610) {
            class230.field3251.method1622((byte) 13, var4, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field2483 = null;
        field2475 = null;
        if (arg0 != 110) {
            method1220(47);
        }
    }
}
