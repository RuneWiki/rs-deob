import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class364 {

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Llj;")
    private class59 field5172 = new class59();

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    private int field5169;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    private int field5157;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "Lcb;")
    private class78 field5170;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2192(int arg0) {
        if (arg0 != 1) {
            method2193(-23, null, -77, null, 58);
        }
        class530.field7357 = class352.method2134(8, 0.4F, 8, 35, true, 4096, 4, 2048);
        field5165++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I[II[Ljava/lang/Object;I)V", line = 23)
    public static final void method2193(int arg0, int[] arg1, int arg2, Object[] arg3, int arg4) {
        field5171++;
        if (arg2 != -10055 || arg4 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg0;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var7;
        Object var8 = arg3[var5];
        arg3[var5] = arg3[arg4];
        arg3[arg4] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg0; var10 < arg4; var10++) {
            if (arg1[var10] < (var9 & var10) + var7) {
                int var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                Object var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg1[arg4] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg4] = arg3[var6];
        arg3[var6] = var8;
        method2193(arg0, arg1, -10055, arg3, var6 - 1);
        method2193(var6 + 1, arg1, -10055, arg3, arg4);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lvp;ILjava/lang/Object;)V", line = 79)
    public final void method2194(class110 arg0, int arg1, Object arg2) {
        field5168++;
        this.method2201((byte) 79, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLida;)V", line = 90)
    private final void method2195(boolean arg0, class134 arg1) {
        if (arg0) {
            this.method2194(null, 7, null);
        }
        if (arg1 != null) {
            arg1.method911(-52);
            arg1.method2619(true);
            this.field5157 += arg1.field2159;
        }
        field5163++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V", line = 112)
    public final void method2196(int arg0, int arg1) {
        if (arg1 != 8) {
            this.method2200(24);
        }
        field5161++;
        if (class574.field8169 == null) {
            return;
        }
        for (class134 var3 = (class134) this.field5172.method475(-58); var3 != null; var3 = (class134) this.field5172.method480(arg1 - 110)) {
            if (var3.method1031((byte) -99)) {
                if (var3.method1029(arg1 + 2) == null) {
                    var3.method911(-52);
                    var3.method2619(true);
                    this.field5157 += var3.field2159;
                }
            } else if (++var3.field6471 > (long) arg0) {
                class134 var4 = class574.field8169.method271(var3, 0);
                this.field5170.method737(var3.field1798, (byte) 92, var4);
                class322.method2006(var3, var4, (byte) 32);
                var3.method911(-52);
                var3.method2619(true);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)I", line = 161)
    public final int method2197(int arg0) {
        if (arg0 >= -86) {
            this.method2195(true, null);
        }
        field5159++;
        return this.field5157;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 173)
    public final void method2198(byte arg0) {
        field5166++;
        int var2 = -14 / ((arg0 - 46) / 55);
        for (class134 var3 = (class134) this.field5172.method475(-56); var3 != null; var3 = (class134) this.field5172.method480(-89)) {
            if (var3.method1031((byte) -99)) {
                var3.method911(-52);
                var3.method2619(true);
                this.field5157 += var3.field2159;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lvp;I)V", line = 201)
    private final void method2199(class110 arg0, int arg1) {
        field5158++;
        long var3 = arg0.method825(6584);
        class134 var5 = (class134) this.field5170.method740(arg1 - 1, var3);
        if (arg1 != 1) {
            this.field5170 = null;
        }
        while (var5 != null) {
            if (var5.field2157.method827(arg0, true)) {
                this.method2195(false, var5);
                return;
            }
            var5 = (class134) this.field5170.method741(-1);
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 227)
    public final void method2200(int arg0) {
        if (arg0 > 52) {
            this.field5172.method478(0);
            field5167++;
            this.field5170.method739(2048);
            this.field5157 = this.field5169;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLjava/lang/Object;ILvp;)V", line = 242)
    private final void method2201(byte arg0, Object arg1, int arg2, class110 arg3) {
        field5162++;
        if (arg2 > this.field5169) {
            throw new IllegalStateException("s>cs");
        }
        this.method2199(arg3, 1);
        this.field5157 -= arg2;
        while (this.field5157 < 0) {
            class134 var6 = (class134) this.field5172.method472(true);
            this.method2195(false, var6);
        }
        class600 var5 = new class600(arg3, arg1, arg2);
        this.field5170.method737(arg3.method825(6584), (byte) 92, var5);
        if (arg0 == 79) {
            this.field5172.method477(var5, false);
            var5.field6471 = 0L;
        }
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)I", line = 271)
    public final int method2202(int arg0) {
        field5160++;
        if (arg0 != 2) {
            this.field5170 = null;
        }
        return this.field5169;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLvp;)Ljava/lang/Object;", line = 284)
    public final Object method2203(byte arg0, class110 arg1) {
        field5164++;
        long var3 = arg1.method825(6584);
        if (arg0 > -7) {
            this.field5170 = null;
        }
        for (class134 var5 = (class134) this.field5170.method740(0, var3); var5 != null; var5 = (class134) this.field5170.method741(-1)) {
            if (var5.field2157.method827(arg1, true)) {
                Object var6 = var5.method1029(10);
                if (var6 != null) {
                    if (var5.method1031((byte) -99)) {
                        class600 var7 = new class600(arg1, var6, var5.field2159);
                        this.field5170.method737(var5.field1798, (byte) 92, var7);
                        this.field5172.method477(var7, false);
                        var7.field6471 = 0L;
                        var5.method911(-52);
                        var5.method2619(true);
                    } else {
                        this.field5172.method477(var5, false);
                        var5.field6471 = 0L;
                    }
                    return var6;
                }
                var5.method911(-52);
                var5.method2619(true);
                this.field5157 += var5.field2159;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V", line = 341)
    public class364(int arg0) {
        this.field5169 = arg0;
        this.field5157 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5170 = new class78(var2);
    }
}
