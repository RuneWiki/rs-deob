import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class303 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lrh;")
    public class129 field4819;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4821 = "wave:";

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field4812 = 0;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Z")
    public static boolean field4823 = false;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field4822 = 0;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lnj;")
    public static class215 field4813;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public static final void method2033(int arg0, int arg1) {
        field4824++;
        if (arg1 == -1) {
            return;
        }
        if (arg0 != -3) {
            method2033(116, -119);
        }
        if (!class190.method1322(arg1, (byte) 97)) {
            return;
        }
        class231[] var2 = class68.field1018[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class231 var4 = var2[var3];
            if (var4.field3698 != null) {
                class122 var5 = new class122();
                var5.field1755 = var4.field3698;
                var5.field1752 = var4;
                class211.method1461(2000000, var5, arg0 + 3);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method2034(int arg0) {
        Container var1;
        if (class123.field1771 != null) {
            var1 = class123.field1771;
        } else if (class73.field1086 == null) {
            var1 = class95.field1425.field3832;
        } else {
            var1 = class73.field1086;
        }
        class14.field210 = var1.getSize().width;
        field4811++;
        class278.field4556 = var1.getSize().height;
        if (class73.field1086 == var1) {
            Insets var2 = class73.field1086.getInsets();
            class14.field210 -= var2.right + var2.left;
            class278.field4556 -= var2.top + var2.bottom;
        }
        if (~class49.method298((byte) 103) <= arg0) {
            class152.field2272 = 0;
            class152.field2274 = 0;
            class112.field1626 = class14.field210;
            class126.field1814 = class278.field4556;
        } else {
            class112.field1626 = 765;
            class152.field2274 = 0;
            class152.field2272 = (class14.field210 - 765) / 2;
            class126.field1814 = 503;
        }
        class304.field4831.setSize(class112.field1626, class126.field1814);
        if (class73.field1086 == var1) {
            Insets var3 = class73.field1086.getInsets();
            class304.field4831.setLocation(var3.left + class152.field2272, var3.top - -class152.field2274);
        } else {
            class304.field4831.setLocation(class152.field2272, class152.field2274);
        }
        if (class238.field3824 != -1) {
            class287.method1960(true, (byte) 45);
        }
        class40.method235((byte) 24);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4825++;
        int var8 = class196.method1369(class60.field882, arg5, true, class115.field1678);
        int var9 = class196.method1369(class60.field882, arg7, true, class115.field1678);
        int var10 = class196.method1369(class187.field2938, arg0, true, class56.field816);
        int var11 = class196.method1369(class187.field2938, arg1, true, class56.field816);
        int var12 = class196.method1369(class60.field882, arg5 + arg6, true, class115.field1678);
        int var13 = class196.method1369(class60.field882, arg7 - arg6, true, class115.field1678);
        int var14 = var8;
        if (arg4 != -23693) {
            field4812 = -78;
        }
        while (var14 < var12) {
            class16.method97(-7, class78.field1180[var14], var11, arg3, var10);
            var14++;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class16.method97(arg4 + 23686, class78.field1180[var15], var11, arg3, var10);
        }
        int var16 = class196.method1369(class187.field2938, arg0 + arg6, true, class56.field816);
        int var17 = class196.method1369(class187.field2938, arg1 - arg6, true, class56.field816);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class78.field1180[var18];
            class16.method97(-7, var19, var16, arg3, var10);
            class16.method97(-7, var19, var17, arg2, var16);
            class16.method97(-7, var19, var11, arg3, var17);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V")
    public static final void method2036(int arg0, int arg1) {
        class50.field636.method1514(arg0, (byte) -55);
        field4818++;
        if (arg1 != -3) {
            field4822 = -40;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method2037(byte arg0) {
        field4821 = null;
        if (arg0 >= -53) {
            field4822 = 36;
        }
        field4813 = null;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(II)V")
    public class303(int arg0, int arg1) {
        this.field4819 = class313.method2099(arg0, 30085);
        this.field4814 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lrh;I)V")
    public class303(class129 arg0, int arg1) {
        this.field4819 = arg0;
        this.field4814 = arg1;
    }
}
