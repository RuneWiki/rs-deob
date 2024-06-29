import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class1 {

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lqc;")
    public static class99 field10 = new class99(50);

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lqc;")
    public static class99 field14 = new class99(64);

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "B")
    public static byte field11;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lkm;")
    public static class133 field5;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "[S")
    public static short[] field2;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;", line = 6)
    public static final String[] method1(String[] arg0, boolean arg1) {
        if (!arg1) {
            method2((String) null, (byte) 76);
        }
        String[] var2 = new String[5];
        field13++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 37)
    public static final int method2(String arg0, byte arg1) {
        int var2 = 0;
        int var3 = arg0.length();
        field4++;
        if (arg1 > -107) {
            return -13;
        } else {
            for (int var4 = 0; var4 < var3; var4++) {
                var2 = (var2 << 5) + class65.method441(arg0.charAt(var4), -32024) - var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 59)
    public static final void method3(byte arg0) {
        class61.method411();
        class336.field5060 = -1;
        field1++;
        class256.field3699 = null;
        class173.method1212((byte) -105);
        class75.field1031.method363(arg0 - 113);
        class257.field3785 = new class44();
        ((class204) class184.field2543).method1450((byte) 126);
        class49.method308();
        class147.field2036 = 0;
        class147.field2037 = new class270[255];
        class267.method1829();
        class322.method2248();
        class112.method826(arg0 ^ 0x6242);
        class176.method1219(-28376, false);
        class317.method2221(14513);
        if (arg0 != 62) {
            method3((byte) -25);
        }
        class96.method706(24680);
        for (int var1 = 0; var1 < 2048; var1++) {
            class241 var2 = class169.field2306[var1];
            if (var2 != null) {
                var2.field3717 = null;
            }
        }
        if (class67.field908) {
            class322.method2259(104, 104);
            class247.method1694(arg0 + 26, class204.field2911);
            class265.method1804();
        }
        class310.method2128((byte) 10, class204.field2948, class256.field3708);
        class64.method429(-30362, class204.field2948);
        class249.field3576 = null;
        class294.field4371 = null;
        class61.field809 = null;
        class213.field3076 = null;
        class163.field2241 = null;
        if (class148.field2051 == 5) {
            class123.method885(class204.field2948, 2);
        }
        if (class148.field2051 == 10) {
            class257.method1764(false, -14413);
        }
        if (class148.field2051 == 30) {
            class189.method1325(1, 25);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 129)
    public static void method4(int arg0) {
        if (arg0 != 0) {
            method2((String) null, (byte) -108);
        }
        field10 = null;
        field5 = null;
        field14 = null;
        field2 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 148)
    public static final void method5(int arg0, Component arg1) {
        arg1.addMouseListener(class186.field2565);
        arg1.addMouseMotionListener(class186.field2565);
        field12++;
        arg1.addFocusListener(class186.field2565);
        if (arg0 != -1) {
            field2 = (short[]) null;
        }
    }
}
