import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class466 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lns;")
    public static class438 field6795;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 3)
    public static void method2781(int arg0) {
        if (arg0 != -1) {
            method2783(-101);
        }
        field6795 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V", line = 17)
    public static final void method2782() {
        for (int var0 = 0; var0 < class494.field7230; var0++) {
            class153 var1 = class232.field3295[var0];
            class457.method2750(var1);
            class232.field3295[var0] = null;
        }
        class494.field7230 = 0;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V", line = 35)
    public static final void method2783(int arg0) {
        class38.method272(class96.field1399.field5219, (byte) 77);
        field6794++;
        int var1 = (class82.field1105 >> 3) + (class34.field539 >> 10);
        int var2 = (class301.field4447 >> 10) + (class437.field6477 >> 3);
        class195.field2770 = class339.field5365.field2210 = 0;
        class339.field5365.method2097(50, 8, 8);
        byte var3 = 18;
        if (arg0 != -21726) {
            method2784(2, (byte) 102);
        }
        class334.field5157 = new int[var3];
        class215.field2992 = new int[var3][4];
        class270.field3763 = new int[var3];
        class107.field1508 = new byte[var3][];
        class310.field4643 = new byte[var3][];
        class388.field5893 = new byte[var3][];
        class38.field612 = new int[var3];
        class219.field3077 = new byte[var3][];
        class65.field901 = new int[var3];
        class253.field3509 = new int[var3];
        class471.field6894 = new int[var3];
        class287.field4285 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class96.field1403 >> 4)) / 8; var5 <= (((class96.field1403 >> 4) + var1) / 8); var5++) {
            for (int var7 = (var2 - (class485.field7122 >> 4)) / 8; var7 <= (var2 + (class485.field7122 >> 4)) / 8; var7++) {
                int var8 = (var5 << 8) + var7;
                class253.field3509[var4] = var8;
                class471.field6894[var4] = class255.field3538.method2652("m" + var5 + "_" + var7, class41.method323(arg0, -21651));
                class65.field901[var4] = class255.field3538.method2652("l" + var5 + "_" + var7, 109);
                class270.field3763[var4] = class255.field3538.method2652("n" + var5 + "_" + var7, 116);
                class38.field612[var4] = class255.field3538.method2652("um" + var5 + "_" + var7, class41.method323(arg0, -21677));
                class334.field5157[var4] = class255.field3538.method2652("ul" + var5 + "_" + var7, 70);
                if (class270.field3763[var4] == -1) {
                    class471.field6894[var4] = -1;
                    class65.field901[var4] = -1;
                    class38.field612[var4] = -1;
                    class334.field5157[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class270.field3763.length; var6++) {
            class270.field3763[var6] = -1;
            class471.field6894[var6] = -1;
            class65.field901[var6] = -1;
            class38.field612[var6] = -1;
            class334.field5157[var6] = -1;
        }
        class190.method1327((byte) -58, var2, true, false, var1);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)V", line = 116)
    public static final void method2784(int arg0, byte arg1) {
        field6793++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        if (arg1 > -20) {
            field6795 = null;
        }
        class220.field3090 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)J")
    public abstract long method334(byte arg0);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
    public abstract int method337(int arg0, int arg1);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public abstract void method336(int arg0);
}
