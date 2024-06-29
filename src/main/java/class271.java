import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class271 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Ljk;")
    private class449 field3413 = new class449(256);

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lug;")
    private class395 field3418;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lga;")
    private class278 field3419;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "Lqn;")
    public static class47 field3421;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lob;")
    public static class520 field3417;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 5)
    public final void method1604(int arg0) {
        field3414++;
        this.field3413.method2648(false, 5);
        if (arg0 < 0) {
            method1609(-9);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 16)
    public final void method1605(int arg0) {
        field3416++;
        if (arg0 != 6408) {
            this.method1604(-120);
        }
        this.field3413.method2642(0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lml;", line = 30)
    public final class265 method1606(int arg0, int arg1) {
        field3411++;
        Object var3 = this.field3413.method2647(-115, (long) arg0);
        if (var3 != null) {
            return (class265) var3;
        } else if (this.field3419.method1638(arg1 ^ 0x1979, arg0)) {
            class139 var4 = this.field3419.method1642(arg0, arg1 ^ 0x1970);
            if (arg1 != 6408) {
                this.method1606(-48, 103);
            }
            int var5 = var4.field1773 ? 64 : this.field3418.field5495;
            class265 var7;
            if (var4.field1780 && this.field3418.method304()) {
                float[] var6 = this.field3419.method1639(false, false, var5, var5, arg0, 0.7F);
                var7 = new class265(this.field3418, 3553, 34842, var5, var5, var4.field1787 != 0, var6, 6408);
            } else {
                int[] var8;
                short var9;
                if (var4.field1783 && class422.method2479(-83, var4.field1794)) {
                    var8 = this.field3419.method1641(false, 13724, var5, 0.7F, var5, arg0);
                    var9 = 6407;
                } else {
                    var9 = 6408;
                    var8 = this.field3419.method1640(var5, 0.7F, var5, (byte) -24, false, arg0);
                }
                var7 = new class265(this.field3418, 3553, var9, var5, var5, var4.field1787 != 0, var8, false);
            }
            var7.method1578(var4.field1784, 0, var4.field1778);
            this.field3413.method2635((long) arg0, -26591, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBIIIII)V", line = 81)
    public static final void method1607(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3412++;
        if (arg2 >= -48) {
            method1608((byte) 13, null);
        }
        int var8 = arg1 + arg6;
        int var9 = arg5 - arg6;
        for (int var10 = arg1; var10 < var8; var10++) {
            class184.method1160(class387.field5088[var10], -7, arg0, arg3, arg4);
        }
        int var11 = arg3 - arg6;
        int var12 = arg4 + arg6;
        for (int var13 = arg5; var13 > var9; var13--) {
            class184.method1160(class387.field5088[var13], -7, arg0, arg3, arg4);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class387.field5088[var14];
            class184.method1160(var15, -7, arg0, var12, arg4);
            class184.method1160(var15, -7, arg7, var11, var12);
            class184.method1160(var15, -7, arg0, arg3, var11);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B[B)[B", line = 127)
    public static final byte[] method1608(byte arg0, byte[] arg1) {
        field3415++;
        class463 var2 = new class463(arg1);
        if (arg0 > -94) {
            return null;
        }
        int var3 = var2.method2737(false);
        int var4 = var2.method2727(-76);
        if (var4 < 0 || !(class83.field1047 == 0 || class83.field1047 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2735(var5, var4, 0, -447463096);
            return var5;
        } else {
            int var6 = var2.method2727(-115);
            if (var6 < 0 || !(class83.field1047 == 0 || var6 <= class83.field1047)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class258.method1553(var7, var6, arg1, var4, 9);
            } else {
                class356.field4585.method2926(var2, var7, 116);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 182)
    public static final void method1609(int arg0) {
        if (arg0 != -487) {
            method1608((byte) 4, null);
        }
        field3420++;
        if (class113.field1505.length() == 0) {
            return;
        }
        class306.method1794("--> " + class113.field1505, -1);
        class211.method1307(-31081, class113.field1505, false);
        class97.field1187 = 0;
        class113.field1505 = "";
        class232.field2965 = 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 204)
    public static void method1610(byte arg0) {
        field3417 = null;
        field3421 = null;
        if (arg0 != 15) {
            method1610((byte) 126);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lug;Lga;)V", line = 220)
    public class271(class395 arg0, class278 arg1) {
        this.field3418 = arg0;
        this.field3419 = arg1;
    }
}
