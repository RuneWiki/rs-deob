import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class212 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[Lma;")
    public static class5[] field3378 = new class5[100];

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Ltj;")
    public static class73 field3377 = new class73(64);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)Z", line = 9)
    public static final boolean method1403(int arg0, int arg1, boolean arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class185 var3 = class77.method536(arg0, 114);
        field3374++;
        return arg2 ? false : var3.method1222(arg1, (byte) -22);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)J", line = 31)
    public static final synchronized long method1404(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 > -84) {
            field3378 = (class5[]) null;
        }
        if (class167.field2539 > var1) {
            class127.field1914 += class167.field2539 - var1;
        }
        class167.field2539 = var1;
        field3379++;
        return class127.field1914 + var1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)Lma;", line = 60)
    public static final class5 method1405(String arg0, int arg1) {
        field3375++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class5 var4 = new class5();
        var4.field72 = 0;
        var4.field57 = var2;
        for (int var5 = arg1; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field72++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 92)
    public static final void method1406(int arg0) {
        field3376++;
        class249.method1741(5, (byte) -25);
        class204.method1357(arg0 - 116, 5);
        class230.method1643(7765, 5);
        class214.method1410(5, 52);
        class43.method302(arg0 ^ 0x42, 5);
        class126.method841(5, (byte) 12);
        class257.method1788(5, -7409);
        class250.method1743(5, arg0 + 9);
        class89.method583(5, (byte) 100);
        class126.method837(5, arg0 ^ 0x73);
        class1.method2(-20543, 5);
        class136.method888(20507, 50);
        class20.method162(-102, 5);
        class242.method1704(5, Integer.MAX_VALUE);
        class84.field1288.method517(false, 5);
        if (arg0 != -9) {
            method1407((byte) -123);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 118)
    public static void method1407(byte arg0) {
        if (arg0 <= 50) {
            field3377 = (class73) null;
        }
        field3377 = null;
        field3378 = null;
    }
}
