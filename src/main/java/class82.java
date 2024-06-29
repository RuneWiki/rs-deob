import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class82 extends class70 {

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field1423 = 1;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Loe;")
    public static class146 field1415 = new class146(new byte[5000]);

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lpg;")
    public static class226 field1426;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Len;")
    public static class49 field1425;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V", line = 4)
    public static void method605(byte arg0) {
        if (arg0 != 50) {
            field1425 = (class49) null;
        }
        field1415 = null;
        field1425 = null;
        field1426 = null;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 16)
    public static final void method606(int arg0) {
        class292.field4735.method889((byte) 68);
        field1418++;
        int var1 = 73 / ((53 - arg0) / 62);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLek;)V", line = 29)
    public static final void method607(byte arg0, class206 arg1) {
        class348.field5570 = arg1;
        if (arg0 != -13) {
            method610(4, -121L);
        }
        field1419++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIIIILhb;I)Lhb;", line = 40)
    public static final class42 method608(byte arg0, int arg1, int arg2, int arg3, int arg4, class42 arg5, int arg6) {
        field1417++;
        long var7 = (long) arg6;
        class42 var9 = (class42) class223.field3691.method893(var7, 103);
        if (var9 == null) {
            class48 var10 = class48.method401(class107.field1946, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method424(64, 768, -50, -10, -50);
            class223.field3691.method888(var7, var9, 36);
        }
        if (arg0 != 105) {
            return (class42) null;
        }
        int var11 = arg5.method356();
        int var12 = arg5.method339();
        int var13 = arg5.method346();
        int var14 = arg5.method350();
        class42 var15 = var9.method355(true, true, true);
        if (arg4 != 0) {
            var15.method345(arg4);
        }
        if (class241.field4016) {
            class294 var18 = (class294) var15;
            if (class21.method189((byte) -77, arg2 + var13, arg1 + var11, class276.field4506) != arg3 || class21.method189((byte) -65, arg2 + var14, arg1 + var12, class276.field4506) != arg3) {
                for (int var19 = 0; var19 < var18.field4792; var19++) {
                    var18.field4759[var19] += class21.method189((byte) 120, var18.field4762[var19] + arg2, var18.field4753[var19] + arg1, class276.field4506) - arg3;
                }
                var18.field4781.field4169 = false;
                var18.field4763.field4608 = false;
            }
        } else {
            class95 var16 = (class95) var15;
            if (arg3 != class21.method189((byte) 46, arg2 + var13, arg1 + var11, class276.field4506) || class21.method189((byte) 113, arg2 + var14, arg1 + var12, class276.field4506) != arg3) {
                for (int var17 = 0; var17 < var16.field1689; var17++) {
                    var16.field1677[var17] += class21.method189((byte) -99, var16.field1688[var17] + arg2, var16.field1698[var17] - -arg1, class276.field4506) - arg3;
                }
                var16.field1670 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V", line = 122)
    public static final void method609(byte arg0, int arg1) {
        field1424++;
        if (arg0 <= -20) {
            class199 var2 = class173.method1231(false, 10, arg1);
            var2.method1358(-1);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 135)
    public static final String method610(int arg0, long arg1) {
        field1416++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class158.field2670[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            if (arg0 != -23159) {
                method605((byte) -48);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V", line = 192)
    public class82(int arg0, int arg1) {
        this.field1422 = arg1;
        this.field1421 = arg0;
    }
}
