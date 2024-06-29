import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class82 {

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1022 = "";

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lhc;")
    public class293 field1027;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Ldh;")
    public class82 field1024;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I", line = 4)
    public static final int method459(int arg0, int arg1) {
        field1023++;
        int var2 = 114 % ((arg1 + 46) / 60);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 15)
    public static final void method460(byte arg0) {
        field1028++;
        class348.field5096.method29(-1);
        if (arg0 < 113) {
            return;
        }
        class592.field8107.method274(-4);
        class167.field2083.method2061(false);
        class249.field3351.setBackground(Color.black);
        class228.field2982 = -1;
        class348.field5096 = class462.method2617(class249.field3351, true);
        class592.field8107 = class628.method3429(true, class249.field3351, (byte) -10);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 32)
    public final void method461(int arg0) {
        field1019++;
        if (class672.field9529 >= 500) {
            return;
        }
        this.field1027 = null;
        this.field1025 = 0;
        this.field1024 = class40.field530;
        if (arg0 != -19611) {
            this.method461(49);
        }
        class40.field530 = this;
        class672.field9529++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ldga;B)Lcg;", line = 55)
    public static final class314 method462(class138 arg0, byte arg1) {
        field1020++;
        int var2 = arg0.method943(-75);
        if (arg1 <= 78) {
            field1022 = null;
        }
        return new class314(var2);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;Lta;IZ)V", line = 68)
    public static final void method463(String arg0, class301 arg1, int arg2, boolean arg3) {
        field1026++;
        byte var4 = 4;
        if (arg2 < 33) {
            method464(-23);
        }
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class278.field3769.method3308(250, arg0, null, 0);
        int var8 = class278.field3769.method3314(arg0, null, false, 250) * 13;
        class9.field103.method1926(var5 - var4, -var4 + var6, var4 + var4 + var7, var8 - (-var4 + -var4), -16777216, 0);
        class9.field103.method1975(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg1.method1817(null, 1, var8, var7, arg0, (byte) -61, 0, 1, 0, null, null, var5, 0, -1, -1, var6);
        class87.method490(var4 + var8 + var4, var6 - var4, var5 - var4, var4 + var7 + var4, -29041);
        if (arg3) {
            try {
                class9.field103.method805();
            } catch (class352 var9) {
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 100)
    public static void method464(int arg0) {
        if (arg0 != -32472) {
            field1022 = null;
        }
        field1022 = null;
    }
}
