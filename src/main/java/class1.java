import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field14 = 0;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5 = "Please remove ";

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1 = "level: ";

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field10 = "cyan:";

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lcl;")
    public static class114 field7;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lug;")
    public static class253 field11;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "[I")
    public static int[] field6;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)I", line = 5)
    public static final int method1(int arg0, boolean arg1) {
        if (arg1) {
            field8++;
            return arg0 >>> 8;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lvl;B)V", line = 16)
    public final void method2(class6 arg0, byte arg1) {
        field3++;
        if (arg1 != 70) {
            method3((byte) 74, -9, -94);
        }
        while (true) {
            int var3 = arg0.method58(-288140008);
            if (var3 == 0) {
                return;
            }
            this.method6(true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)V", line = 46)
    public static final void method3(byte arg0, int arg1, int arg2) {
        class34 var3 = class91.method656(arg2, -2, 5);
        field13++;
        var3.method307(-19063);
        var3.field500 = arg1;
        if (arg0 != 17) {
            method1(83, true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 65)
    public static final void method4(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class231.field3607[var1] = true;
        }
        field2++;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 79)
    public static void method5(int arg0) {
        field10 = null;
        if (arg0 != 5) {
            field10 = (String) null;
        }
        field5 = null;
        field11 = null;
        field7 = null;
        field6 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLvl;I)V", line = 94)
    private final void method6(boolean arg0, class6 arg1, int arg2) {
        field12++;
        if (arg2 == 5) {
            this.field14 = arg1.method39((byte) 47);
        }
        if (!arg0) {
            field1 = (String) null;
        }
    }
}
