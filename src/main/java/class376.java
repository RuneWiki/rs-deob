import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class376 {

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "[I")
    public static int[] field5186 = new int[16384];

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "[I")
    public static int[] field5188 = new int[16384];

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "Lok;")
    public static class266 field5192;

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "Lcfa;")
    public static class179 field5193;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
    public static void method2327(int arg0) {
        field5193 = null;
        if (arg0 == 16384) {
            field5192 = null;
            field5186 = null;
            field5188 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([BZ)V")
    public static final synchronized void method2328(byte[] arg0, boolean arg1) {
        field5191++;
        if (arg1) {
            field5188 = null;
        }
        if (arg0.length == 100 && class92.field1035 < 1000) {
            class661.field9212[class92.field1035++] = arg0;
        } else if (arg0.length == 5000 && class418.field5722 < 250) {
            class646.field9022[class418.field5722++] = arg0;
        } else if (arg0.length == 30000 && class41.field541 < 50) {
            class260.field3824[class41.field541++] = arg0;
        } else if (class600.field8417 != null) {
            for (int var2 = 0; var2 < class759.field10482.length; var2++) {
                if (class759.field10482[var2] == arg0.length && class600.field8417[var2].length > class40.field518[var2]) {
                    class600.field8417[var2][class40.field518[var2]++] = arg0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
    public static final void method2329(int arg0) {
        field5190++;
        if (arg0 != 0 || !class586.method3421((byte) 124)) {
            return;
        }
        if (class353.field4964 == null) {
            class333.method2121(arg0 + 500);
        }
        class119.field1835 = true;
        class184.field2827 = 0;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method2330(int arg0, int arg1) {
        int var2 = 127 % ((44 - arg0) / 34);
        field5189++;
        if (arg1 == 100 && class92.field1035 > 0) {
            byte[] var3 = class661.field9212[--class92.field1035];
            class661.field9212[class92.field1035] = null;
            return var3;
        } else if (arg1 == 5000 && class418.field5722 > 0) {
            byte[] var4 = class646.field9022[--class418.field5722];
            class646.field9022[class418.field5722] = null;
            return var4;
        } else if (arg1 == 30000 && class41.field541 > 0) {
            byte[] var5 = class260.field3824[--class41.field541];
            class260.field3824[class41.field541] = null;
            return var5;
        } else {
            if (class600.field8417 != null) {
                for (int var6 = 0; var6 < class759.field10482.length; var6++) {
                    if (class759.field10482[var6] == arg1 && class40.field518[var6] > 0) {
                        byte[] var7 = class600.field8417[var6][--class40.field518[var6]];
                        class600.field8417[var6][class40.field518[var6]] = null;
                        return var7;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V")
    public static final void method2331(byte arg0) {
        class459.field6419 = "";
        class189.field2920 = 0L;
        class449.field6142 = -1;
        field5187++;
        if (arg0 != 59) {
            field5192 = null;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5186[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field5188[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field5192 = new class266();
        field5193 = new class179();
    }
}
