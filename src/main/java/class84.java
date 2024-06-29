import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class84 extends class155 {

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "[I")
    public static int[] field1517 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qf", name = "jb", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!qf", name = "kb", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!qf", name = "lb", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!qf", name = "mb", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!qf", name = "nb", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!qf", name = "pb", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!qf", name = "qb", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!qf", name = "ib", descriptor = "Lvh;")
    public static class108 field1518;

    @OriginalMember(owner = "client!qf", name = "ob", descriptor = "Lcj;")
    public static class74 field1524;

    @OriginalMember(owner = "client!qf", name = "rb", descriptor = "[S")
    public static short[] field1527;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(II)V")
    public static final void method549(int arg0, int arg1) {
        class55 var2 = class62.method395(arg0, arg1, (byte) -66);
        ++field1525;
        var2.method341((byte) 62);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        int[][] var3 = super.field4418.method835((byte) 111, arg0);
        if (super.field4418.field2164 && this.method1063((byte) -58)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field2596 * super.field2596;
            for (int var8 = 0; ~var8 > ~class53.field929; ++var8) {
                int var9 = super.field2607[var7 - -(var8 % super.field2605)];
                var6[var8] = class113.method791(var9, 255) << 4;
                var5[var8] = class113.method791(65280, var9) >> 4;
                var4[var8] = class113.method791(16711680, var9) >> 12;
            }
        }
        if (arg1 != -1) {
            field1527 = null;
        }
        ++field1523;
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method550(int arg0, int arg1, int arg2, String[] arg3) {
        ++field1521;
        if (~arg1 == -1) {
            return "";
        } else if (arg0 == arg1) {
            String var4 = arg3[arg2];
            return var4 != null ? var4.toString() : "null";
        } else {
            int var5 = 0;
            int var6 = arg1 + arg2;
            for (int var7 = arg2; var7 < var6; ++var7) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var5 += 4;
                } else {
                    var5 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var5);
            for (int var9 = arg2; var9 < var6; ++var9) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)V")
    public static final void method551(int arg0) {
        class82.field1502.method58(0);
        if (arg0 > -118) {
            field1517 = null;
        }
        class142.field2449.method58(0);
        class276.field4422.method58(0);
        ++field1522;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
    public static void method552(byte arg0) {
        field1524 = null;
        field1527 = null;
        if (arg0 != -8) {
            method551(121);
        }
        field1518 = null;
        field1517 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BILvh;I)Lda;")
    public static final class197 method553(byte arg0, int arg1, class108 arg2, int arg3) {
        if (arg0 != -75) {
            return null;
        } else {
            ++field1520;
            return !class127.method876(arg3, arg2, arg1, -8635) ? null : class12.method76(255);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(III)I")
    public static final int method554(int arg0, int arg1, int arg2) {
        ++field1519;
        int var3 = 0;
        if (arg2 < 35) {
            method550(-52, -28, 107, (String[]) null);
        }
        while (arg1 > 0) {
            var3 = 1 & arg0 | var3 << 1;
            arg0 >>>= 1;
            --arg1;
        }
        return var3;
    }
}
