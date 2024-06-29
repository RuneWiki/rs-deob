import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class219 extends class283 {

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Lna;")
    public static class26 field3496 = class69.method505("(U5", (byte) -121);

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3497 = 0;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "Lse;")
    public static class12 field3504;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I", line = 9)
    public final int[] method8(int arg0, byte arg1) {
        int[] var3 = this.field4733.method664(-16409, arg0);
        field3503++;
        if (this.field4733.field1406) {
            int[] var4 = this.method1990(0, arg0, 32755);
            for (int var5 = 0; var5 < class101.field1632; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        int var6 = 59 % ((30 - arg1) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 36)
    public class219() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)I", line = 44)
    public static final int method1475(int arg0) {
        if (arg0 != 16859) {
            field3504 = (class12) null;
        }
        field3500++;
        return class225.field3564 && class78.field1183[81] && class126.field1955 > 2 ? class85.field1404[class126.field1955 - 2] : class85.field1404[class126.field1955 - 1];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILwa;Z)V", line = 59)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg2) {
            field3499++;
            if (arg0 == 0) {
                this.field4715 = arg1.method642((byte) -80) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I", line = 80)
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 != -1) {
            return (int[][]) ((int[][]) null);
        }
        field3498++;
        int[][] var3 = this.field4719.method2182((byte) -128, arg1);
        if (this.field4719.field5381) {
            int[][] var4 = this.method1994(arg1, 0, (byte) -51);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class101.field1632; var11++) {
                var8[var11] = 4096 - var6[var11];
                var9[var11] = 4096 - var7[var11];
                var10[var11] = 4096 - var5[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IB)Lbc;", line = 130)
    public static final class118 method1476(int arg0, byte arg1) {
        field3501++;
        class118 var2 = (class118) class46.field732.method28((long) arg0, 1400);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class5.field70.method1889(0, (byte) -122, arg0);
        } else {
            var3 = class246.field4032.method1889(0, (byte) -122, arg0 & 0x7FFF);
        }
        class118 var4 = new class118();
        if (var3 != null) {
            var4.method818(new class82(var3), (byte) 116);
        }
        if (arg1 != -54) {
            method1477(19);
        }
        if (arg0 >= 32768) {
            var4.method813(-85);
        }
        class46.field732.method33(var4, (long) arg0, (byte) 40);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V", line = 168)
    public static void method1477(int arg0) {
        field3496 = null;
        if (arg0 != 2) {
            field3497 = -53;
        }
        field3504 = null;
    }
}
