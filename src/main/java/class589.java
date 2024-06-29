import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class589 extends class263 {

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public int field7916 = 0;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public int field7908 = -1;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
    public static int[] field7905 = new int[6];

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "J")
    public static long field7919 = -1L;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public int field7902;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public int field7903;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public int field7904;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public int field7906;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public int field7909;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public int field7910;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public int field7912;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public int field7913;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public int field7915;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public int field7918;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "Lhg;")
    public static class647 field7907;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "[[I")
    public static int[][] field7901;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILoa;IILws;)V")
    public static final void method3269(int arg0, class650 arg1, int arg2, int arg3, class333 arg4) {
        class74.field986.method1913((byte) 47);
        field7911++;
        if (class52.field659) {
            return;
        }
        if (arg0 != 6) {
            method3269(-59, null, -14, 18, null);
        }
        for (class79 var5 = (class79) arg4.method1909(true); var5 != null; var5 = (class79) arg4.method1916((byte) 94)) {
            class663 var6 = class604.field8104.method93(var5.field1034, (byte) 120);
            if (class151.method939(arg0 - 6, var6)) {
                boolean var7 = class453.method2488(var5, var6, arg3, (byte) 71, arg2, arg1);
                if (var7) {
                    class348.method2007(arg0 ^ 0x4F, var5, var6, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLoa;BI)Lta;")
    public static final class201 method3270(boolean arg0, class650 arg1, byte arg2, int arg3) {
        field7917++;
        class462 var4 = class164.method999(arg3, 12173, arg1, arg0);
        if (arg2 < 118) {
            field7907 = null;
        }
        return var4 == null ? null : var4.field5753;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method3271(int arg0) {
        field7905 = null;
        if (arg0 == -4138) {
            field7901 = null;
            field7907 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILvw;B)V")
    public static final void method3272(int arg0, class284 arg1, byte arg2) {
        field7914++;
        if (class698.field9679) {
            arg0 = 0;
            class698.field9679 = false;
        }
        if (class203.field2362 == null || !class203.field2362.method1710(true, arg1)) {
            class203.field2362 = arg1;
            class122.field1485 = class321.method1854(-99);
            class290.field3671 = arg0;
            class213.field2502 = arg0;
            if (class213.field2502 == 0) {
                class675.method3742(90);
            } else {
                class398.field5056 = class17.field180;
                class364.field4661 = class383.field4926;
                class93.field1188 = class16.field161;
                class427.field5398 = class618.field8379;
                class437.field5503 = class226.field2919;
                class337.field4165 = class667.field9052;
                class345.field4391 = class293.field3730;
                class132.field1599 = class447.field5614;
                class371.field4789 = class109.field1359;
                class33.field518 = class195.field2301;
            }
        }
        if (arg2 > -20) {
            field7919 = -56L;
        }
    }
}
