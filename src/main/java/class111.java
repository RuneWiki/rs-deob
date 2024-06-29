import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class111 extends class206 {

    @OriginalMember(owner = "client!el", name = "s", descriptor = "Lwa;")
    public class75 field1893;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lwa;")
    public static class75 field1891 = class66.method560("(U0a )2 non)2existant gosub script)2num: ", false);

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Lwa;")
    public static class75 field1890 = class66.method560("showVideoAd", false);

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Lwa;")
    public static class75 field1894 = class66.method560(")3runescape)3com", false);

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "Lwa;")
    public static class75 field1892 = class66.method560(" loggt sich ein)3", false);

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[Z")
    public static boolean[] field1898 = new boolean[200];

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field1896 = 0;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "Lci;")
    public static class188 field1900;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "Lcb;")
    public static class267 field1899;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V", line = 13)
    public static final void method865(int arg0, int arg1, int arg2) {
        field1901++;
        int var3 = arg2;
        if (arg2 > 25) {
            var3 = 25;
        }
        arg2--;
        int var4 = class263.field4567[arg2];
        int var5 = class2.field10[arg2];
        if (arg0 == 0) {
            class112.field1906++;
            class89.field1470.method87(65280, 153);
            class89.field1470.method518(104, var3 + var3 + 3);
        }
        if (arg0 == 1) {
            class89.field1470.method87(65280, 6);
            class89.field1470.method518(116, var3 + 14 - (-var3 - 3));
            class303.field5187++;
        }
        if (arg0 == 2) {
            class89.field1470.method87(65280, 127);
            class89.field1470.method518(arg1 + 108, var3 + 3 + var3);
            class35.field512++;
        }
        class89.field1470.method529(class163.field2767[82] ? 1 : 0, (byte) 122);
        class89.field1470.method493(var5 + class175.field2939, (byte) 75);
        class91.field1497 = class2.field10[0];
        class158.field2719 = class263.field4567[arg1];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class89.field1470.method490(class263.field4567[arg2] - var4, (byte) -125);
            class89.field1470.method518(108, class2.field10[arg2] - var5);
        }
        class89.field1470.method503(-597878072, class275.field4737 + var4);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)V", line = 80)
    public static final void method866(byte arg0, int arg1) {
        if (arg0 < 76) {
            method867(4);
        }
        class167.field2813 = -1;
        field1897++;
        class215.field3666 = arg1;
        class167.field2813 = -1;
        class3.method15(8887);
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V", line = 108)
    public static void method867(int arg0) {
        field1892 = null;
        field1898 = null;
        if (arg0 != 0) {
            method867(-15);
        }
        field1891 = null;
        field1890 = null;
        field1900 = null;
        field1899 = null;
        field1894 = null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 135)
    public class111() {
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lwa;)V", line = 139)
    public class111(class75 arg0) {
        this.field1893 = arg0;
    }
}
