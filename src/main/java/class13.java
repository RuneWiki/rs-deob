import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class13 extends class310 {

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    private int field139 = 4096;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field146 = 0;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "[J")
    public static long[] field144 = new long[500];

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Lth;")
    public static class57 field135;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 4)
    public class13() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(B)V", line = 13)
    public static final void method70(byte arg0) {
        class165.field2617.method2326(-4);
        class261.field4394.method2326(-4);
        field137++;
        if (arg0 != 120) {
            field135 = (class57) null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V", line = 25)
    public static void method71(int arg0) {
        if (arg0 != -218291280) {
            method71(26);
        }
        field144 = null;
        field135 = null;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(II)V", line = 38)
    public static final void method72(int arg0, int arg1) {
        field138++;
        if (arg1 != -1) {
            method76((class250[]) null, 117, (byte) -94);
        }
        class321 var2 = class46.method370(12, (byte) -106, arg0);
        var2.method2261(-129);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[IB[I)V", line = 51)
    public static final void method73(int arg0, int arg1, int[] arg2, byte arg3, int[] arg4) {
        if (arg1 < arg0) {
            int var5 = (arg1 + arg0) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg1; var9 < arg0; var9++) {
                if (var7 + (var9 & 0x1) < arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method73(var6 - 1, arg1, arg2, (byte) 124, arg4);
            method73(arg0, var6 + 1, arg2, (byte) -13, arg4);
        }
        field140++;
        int var12 = -65 % ((arg3 - 79) / 42);
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(II)Lwf;", line = 106)
    public static final class250 method74(int arg0, int arg1) {
        field136++;
        if (arg0 > -7) {
            return (class250) null;
        }
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class163.field2587[var3] == null || class163.field2587[var3][var2] == null) {
            boolean var4 = class278.method2058(var3, (byte) 4);
            if (!var4) {
                return null;
            }
        }
        return class163.field2587[var3][var2];
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lqm;II)V", line = 134)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            method72(8, 62);
        }
        if (arg2 == 0) {
            this.field139 = arg0.method1765(true);
        }
        field145++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lwf;IB)V", line = 153)
    public static final void method76(class250[] arg0, int arg1, byte arg2) {
        field142++;
        if (arg2 != 19) {
            field135 = (class57) null;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class250 var4 = arg0[var3];
            if (var4 != null && var4.field4086 == arg1 && (!var4.field4205 || !client.method362(var4))) {
                if (var4.field4078 == 0) {
                    if (!var4.field4205 && client.method362(var4) && class36.field551 != var4) {
                        continue;
                    }
                    method76(arg0, var4.field4167, (byte) 19);
                    if (var4.field4171 != null) {
                        method76(var4.field4171, var4.field4167, (byte) 19);
                    }
                    class259 var5 = (class259) class226.field3723.method1268(arg2 ^ 0xFFFFFFD6, (long) var4.field4167);
                    if (var5 != null) {
                        class65.method563(var5.field4358, arg2 + 109);
                    }
                }
                if (var4.field4078 == 6) {
                    if (var4.field4063 != -1 || var4.field4104 != -1) {
                        boolean var6 = class243.method1848((byte) 97, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4104;
                        } else {
                            var7 = var4.field4063;
                        }
                        if (var7 != -1) {
                            class43 var8 = class198.method1524(var7, 74);
                            if (var8 != null) {
                                var4.field4114 += class272.field4516;
                                while (var8.field651[var4.field4116] < var4.field4114) {
                                    var4.field4114 -= var8.field651[var4.field4116];
                                    var4.field4116++;
                                    if (var4.field4116 >= var8.field677.length) {
                                        var4.field4116 -= var8.field661;
                                        if (var4.field4116 < 0 || var4.field4116 >= var8.field677.length) {
                                            var4.field4116 = 0;
                                        }
                                    }
                                    var4.field4135 = var4.field4116 + 1;
                                    if (var8.field677.length <= var4.field4135) {
                                        var4.field4135 -= var8.field661;
                                        if (var4.field4135 < 0 || var4.field4135 >= var8.field677.length) {
                                            var4.field4135 = -1;
                                        }
                                    }
                                    class205.method1568(var4, (byte) 126);
                                }
                            }
                        }
                    }
                    if (var4.field4186 != 0 && !var4.field4205) {
                        int var9 = var4.field4186 << 16 >> 16;
                        int var10 = class272.field4516 * var9;
                        int var11 = var4.field4186 >> 16;
                        int var12 = class272.field4516 * var11;
                        var4.field4139 = var4.field4139 + var10 & 0x7FF;
                        var4.field4084 = var4.field4084 + var12 & 0x7FF;
                        class205.method1568(var4, (byte) 118);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[I", line = 280)
    public final int[] method77(int arg0, int arg1) {
        field141++;
        int[] var3 = this.field4950.method930(arg0, arg1 + 13093);
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, class113.field1861 & arg0 - 1, (byte) 74);
            int[] var5 = this.method2200(0, arg0, (byte) 74);
            int[] var6 = this.method2200(0, arg0 + 1 & class113.field1861, (byte) 74);
            for (int var7 = 0; var7 < class261.field4405; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field139;
                int var9 = (var5[class98.field1628 & var7 + 1] - var5[var7 - 1 & class98.field1628]) * this.field139;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + var12 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg1 != -13093) {
            field135 = (class57) null;
        }
        return var3;
    }
}
