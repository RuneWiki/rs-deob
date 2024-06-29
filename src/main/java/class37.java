import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class37 extends class16 {

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    private int field490 = 4096;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    private int field491 = 4096;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
    private int field499 = 4096;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "Ljava/lang/String;")
    public static String field494 = "Loading textures - ";

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field497 = 0;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field500 = " ";

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "Lkb;")
    public static class39 field496;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "[Lgj;")
    public static class245[] field495;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)[[I", line = 16)
    public final int[][] method54(int arg0, byte arg1) {
        int[][] var3 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[][] var4 = this.method111(0, (byte) 122, arg0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class276.field4376; var11++) {
                int var12 = var5[var11];
                int var13 = var9[var11];
                int var14 = var8[var11];
                if (var12 == var14 && var13 == var14) {
                    var6[var11] = this.field490 * var12 >> 12;
                    var10[var11] = this.field491 * var14 >> 12;
                    var7[var11] = this.field499 * var13 >> 12;
                } else {
                    var6[var11] = this.field490;
                    var10[var11] = this.field491;
                    var7[var11] = this.field499;
                }
            }
        }
        int var15 = -113 / ((40 - arg1) / 41);
        field492++;
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)V", line = 75)
    public static void method235(byte arg0) {
        field500 = null;
        field496 = null;
        field494 = null;
        field495 = null;
        if (arg0 > -35) {
            method237(false, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 184)
    public class37() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)Lv;", line = 94)
    public static final class80 method236(int arg0, int arg1) {
        if (arg1 != 20254) {
            field500 = (String) null;
        }
        field498++;
        class80 var2 = (class80) class35.field474.method1619((long) arg0, arg1 - 20210);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class28.field415.method250(true, class233.method1673(arg0, 0), class13.method76((byte) 90, arg0));
        class80 var4 = new class80();
        var4.field1221 = arg0;
        if (var3 != null) {
            var4.method595(new class192(var3), 122);
        }
        var4.method587(45);
        class35.field474.method1621((long) arg0, -97, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZB)Z", line = 120)
    public static final boolean method237(boolean arg0, byte arg1) {
        field493++;
        if (arg1 >= -86) {
            return false;
        }
        boolean var2 = class199.method1454();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class199.method1450();
        } else if (!class199.method1451() || !class199.method1453() || !class199.method1460()) {
            arg0 = false;
        }
        class263.field4174 = arg0;
        class255.method1794(150, class264.field4183);
        if (arg0 == var2) {
            return false;
        } else {
            ((class270) class25.field365).method1926(125);
            return true;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lok;", line = 162)
    public static final class160 method238(byte arg0, int arg1) {
        field488++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        int var4 = 8 / ((arg0 + 33) / 44);
        if (class21.field309[var2] == null || class21.field309[var2][var3] == null) {
            boolean var5 = class204.method1498((byte) -106, var2);
            if (!var5) {
                return null;
            }
        }
        return class21.field309[var2][var3];
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLim;I)V", line = 190)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field489++;
        if (arg2 == 0) {
            this.field490 = arg1.method1396(-126);
        } else if (arg2 == 1) {
            this.field491 = arg1.method1396(-97);
        } else if (arg2 == 2) {
            this.field499 = arg1.method1396(-48);
        }
        if (arg0 != -7) {
            field497 = -42;
        }
    }
}
