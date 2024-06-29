import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class283 extends class26 {

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field4029 = 0;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4031 = "white:";

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4036 = " from your ignore list first.";

    @OriginalMember(owner = "client!l", name = "A", descriptor = "[Lwl;")
    public static class13[] field4039 = new class13[29];

    @OriginalMember(owner = "client!l", name = "t", descriptor = "B")
    public byte field4032;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lfh;")
    public static class140 field4033;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lob;")
    public static class160 field4035;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Ljava/lang/String;")
    public String field4037;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Ljava/lang/String;")
    public String field4038;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[[Z")
    public static boolean[][] field4030;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIILvc;IZJ)Z", line = 5)
    public static final boolean method1925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class260 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class74.field978 == class161.field2296;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class66.field847 || var16 >= class300.field4413) {
                    return false;
                }
                class119 var17 = class345.field5367[arg0][var15][var16];
                if (var17 != null && var17.field1563 >= 5) {
                    return false;
                }
            }
        }
        class294 var18 = new class294();
        var18.field4289 = arg11;
        var18.field4278 = arg0;
        var18.field4280 = arg5;
        var18.field4288 = arg6;
        var18.field4282 = arg7;
        var18.field4275 = arg8;
        var18.field4272 = arg9;
        var18.field4283 = arg1;
        var18.field4287 = arg2;
        var18.field4285 = arg1 + arg3 - 1;
        var18.field4276 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class345.field5367[var22][var19][var20] == null) {
                        class345.field5367[var22][var19][var20] = new class119(var22, var19, var20);
                    }
                }
                class119 var23 = class345.field5367[arg0][var19][var20];
                var23.field1549[var23.field1563] = var18;
                var23.field1568[var23.field1563] = var21;
                var23.field1560 |= var21;
                var23.field1563++;
                if (var13 && class143.field1992[var19][var20] != 0) {
                    var14 = class143.field1992[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class143.field1992[var24][var25] == 0) {
                        class143.field1992[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class75.field987[class20.field229++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBI)Lwf;", line = 123)
    public static final class333 method1926(int arg0, byte arg1, int arg2) {
        field4034++;
        class333 var3 = class89.method644(arg1 - 40, arg0);
        if (arg1 != 82) {
            field4035 = (class160) null;
        }
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field5187 == null || arg2 >= var3.field5187.length) {
            return null;
        } else {
            return var3.field5187[arg2];
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZI)I", line = 161)
    public static final int method1927(int arg0, boolean arg1, int arg2) {
        field4040++;
        int var3 = 0;
        if (arg1) {
            method1928(-75);
        }
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 187)
    public static void method1928(int arg0) {
        field4033 = null;
        field4030 = (boolean[][]) null;
        if (arg0 != -31470) {
            method1926(-57, (byte) 85, 16);
        }
        field4035 = null;
        field4031 = null;
        field4036 = null;
        field4039 = null;
    }
}
