import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class99 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[S")
    public static short[] field1604 = new short[] { 16, 13, 4, 18, 45, 30, 58, 46 };

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1608 = -1;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1606 = 1;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1613 = "Checking for updates - ";

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field1612 = 0;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field1611 = 5063219;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Ljc;")
    public static class323 field1605;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V", line = 5)
    public static final void method853(int arg0, int arg1) {
        class30 var2 = method857((byte) 82, arg1, arg0);
        var2.method276(0);
        field1610++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)V", line = 14)
    public static final void method854(int arg0, boolean arg1) {
        field1609++;
        if (class324.field5153 == arg1) {
            return;
        }
        class324.field5153 = arg1;
        class324.method2251(false);
        if (arg0 != -7790) {
            method860((byte) 88, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 37)
    public static void method856(int arg0) {
        if (arg0 != 30) {
            method857((byte) -70, -35, -32);
        }
        field1604 = null;
        field1605 = null;
        field1613 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)Lna;", line = 57)
    public static final class30 method857(byte arg0, int arg1, int arg2) {
        class30 var3 = (class30) class4.field54.method732((long) arg2 << 32 | (long) arg1, true);
        int var4 = -116 % ((36 - arg0) / 38);
        if (var3 == null) {
            var3 = new class30(arg2, arg1);
            class4.field54.method725(var3.field5062, var3, 1);
        }
        field1614++;
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BB)C", line = 96)
    public static final char method860(byte arg0, byte arg1) {
        field1607++;
        if (arg0 != 29) {
            return 'w';
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class56.field865[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method855(Component arg0, byte arg1);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)I")
    public abstract int method858(byte arg0);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method859(Component arg0, byte arg1);
}
