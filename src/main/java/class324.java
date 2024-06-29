import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class324 extends class41 {

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field5031 = 2;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lja;")
    public static class64 field5030;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "[I")
    public static int[] field5033;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[[[I")
    public static int[][][] field5027;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z", line = 5)
    public static final boolean method2212(int arg0) {
        field5032++;
        class128 var1 = class302.field4752;
        synchronized (class302.field4752) {
            if (class61.field954 == class157.field2496) {
                return false;
            }
            class86.field1308 = class77.field1182[class61.field954];
            class123.field1969 = class118.field1902[class61.field954];
            class61.field954 = class61.field954 + 1 & 0x7F;
            if (arg0 != 16) {
                method2215((byte) 4);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)Lag;", line = 26)
    public static final class114 method2213(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class114 var4 = var3.field4219;
            var3.field4219 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lhn;", line = 43)
    public static final class33 method2214(int arg0, int arg1) {
        field5028++;
        class33 var2 = (class33) class159.field2506.method1830((long) arg1, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class64.field1049.method467(arg1, 83, 16);
        class33 var4 = new class33();
        if (arg0 > -5) {
            return (class33) null;
        }
        if (var3 != null) {
            var4.method228(new class101(var3), (byte) 60);
        }
        class159.field2506.method1831((long) arg1, var4, -13897);
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 75)
    public static void method2215(byte arg0) {
        if (arg0 >= -82) {
            field5031 = -67;
        }
        field5030 = null;
        field5033 = null;
        field5027 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)Lqc;", line = 91)
    public static final class4 method2216(int arg0) {
        field5034++;
        if (arg0 != 0) {
            method2214(25, -39);
        }
        class4 var1 = (class4) class60.field941.method1612(false);
        if (var1 != null) {
            var1.method1701(arg0 - 113);
            var1.method571(7);
            return var1;
        }
        class4 var2;
        do {
            var2 = (class4) class162.field2545.method1612(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method8((byte) -74) > class154.method1172((byte) 119)) {
                return null;
            }
            var2.method1701(arg0 ^ 0xFFFFFF81);
            var2.method571(7);
        } while ((var2.field1191 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
