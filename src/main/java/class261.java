import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class261 {

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field4161 = 0;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Ln;")
    public static class298 field4154;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lkb;")
    public static class39 field4158;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method1866(byte arg0, int arg1) {
        field4162++;
        class202.field3301.method1625(arg1, (byte) 112);
        class3.field21.method1625(arg1, (byte) 80);
        if (arg0 < 108) {
            method1870(124);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 21)
    public static final void method1867(Component arg0, boolean arg1) {
        if (arg1) {
            arg0.addMouseListener(class334.field5188);
            field4157++;
            arg0.addMouseMotionListener(class334.field5188);
            arg0.addFocusListener(class334.field5188);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLok;)Z", line = 40)
    public static final boolean method1868(boolean arg0, class160 arg1) {
        if (!arg0) {
            field4158 = (class39) null;
        }
        field4156++;
        if (arg1.field2487 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2487.length; var2++) {
            int var3 = class241.method1708(48, arg1, var2);
            int var4 = arg1.field2490[var2];
            if (arg1.field2487[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field2487[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field2487[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 97)
    public static final void method1869(int arg0) {
        field4155++;
        if (class7.field85) {
            return;
        }
        class7.field85 = true;
        if (arg0 != 191) {
            method1867((Component) null, false);
        }
        if (class325.field5079) {
            class312.field4862 = (float) ((int) class312.field4862 + 191 & 0xFFFFFF80);
        } else {
            class144.field2156 += (24.0F - class144.field2156) / 2.0F;
        }
        client.field4231 = true;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 124)
    public static void method1870(int arg0) {
        if (arg0 < 53) {
            field4161 = -58;
        }
        field4158 = null;
        field4154 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lrg;", line = 135)
    public static final class104 method1871(int arg0, int arg1) {
        field4160++;
        if (arg1 != -19836) {
            method1866((byte) -63, 7);
        }
        class104 var2 = (class104) client.field4218.method1619((long) arg0, 53);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class121.field1841.method250(true, arg0, 0);
        class104 var4 = new class104(var3);
        var4.method992(class256.field4061, (int[]) null);
        client.field4218.method1621((long) arg0, arg1 ^ 0x4D04, var4);
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V", line = 158)
    public static final void method1872(int arg0) {
        if (arg0 != 18227) {
            field4154 = (class298) null;
        }
        class101.field1543.method1623(1);
        class182.field2939.method1623(arg0 ^ 0x4732);
        field4159++;
    }
}
