import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class61 {

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[I")
    public static int[] field852 = new int[2500];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Ln;")
    public static class178 field853;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjj;)I", line = 7)
    public static final int method409(int arg0, class80 arg1) {
        field850++;
        if (arg0 != 0) {
            field852 = (int[]) null;
        }
        class298 var2 = arg1.field1178;
        if (var2.field4588 != null) {
            var2 = var2.method1956(113);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4602;
        class309 var4 = arg1.method280(-88);
        if (arg1.field474 == var4.field4876) {
            var3 = var2.field4578;
        } else if (arg1.field474 == var4.field4872 || arg1.field474 == var4.field4864 || arg1.field474 == var4.field4867 || arg1.field474 == var4.field4858) {
            var3 = var2.field4624;
        } else if (arg1.field474 == var4.field4855 || arg1.field474 == var4.field4862 || arg1.field474 == var4.field4890 || arg1.field474 == var4.field4882) {
            var3 = var2.field4603;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLjh;)Ljh;", line = 47)
    public static final class207 method410(boolean arg0, class207 arg1) {
        field849++;
        class207 var2 = client.method892(arg1);
        if (var2 == null) {
            var2 = arg1.field3236;
        }
        if (!arg0) {
            method409(-41, (class80) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 68)
    public static void method411(int arg0) {
        int var1 = 71 / ((arg0 - 47) / 58);
        field853 = null;
        field852 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lnd;", line = 86)
    public static final class64 method412(int arg0, int arg1) {
        field851++;
        class64 var2 = (class64) class59.field830.method355((long) arg1, 6487);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class17.field188.method2103(0, 5, arg1);
        class64 var4 = new class64();
        int var5 = 25 / ((arg0 - 38) / 37);
        if (var3 != null) {
            var4.method460((byte) -102, new class303(var3));
        }
        class59.field830.method350((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V", line = 110)
    public static final void method413(int arg0, int arg1) {
        class172.field2619.method1287(arg0, -54);
        class47.field662.method1287(arg0, arg1 ^ 0x7B);
        field848++;
        if (arg1 != 2) {
            field853 = (class178) null;
        }
    }
}
