import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class605 {

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "Ltq;")
    private class572 field8559 = new class572(256);

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "Ltq;")
    private class572 field8562 = new class572(256);

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "Ljo;")
    private class303 field8554;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "Ljo;")
    private class303 field8553;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([III)Lwb;")
    public final class298 method3371(int[] arg0, int arg1, int arg2) {
        field8561++;
        if (this.field8554.method1740((byte) 81) == 1) {
            return this.method3376(arg2, 0, arg0, 79);
        }
        if (arg1 != 11605) {
            this.method3371(null, -73, -12);
        }
        if (this.field8554.method1727(-77, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method3376(0, arg2, arg0, 72);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III[I)Lwb;")
    private final class298 method3372(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 != 879022444) {
            this.field8559 = null;
        }
        field8557++;
        int var5 = arg2 ^ (arg0 >>> 12 | (arg0 & 0xA0000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class298 var9 = (class298) this.field8562.method3234((byte) -45, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class34 var10 = class34.method187(this.field8553, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class298 var11 = var10.method186();
            this.field8562.method3235(var7, -1, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field3910.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[I)Lwb;")
    public final class298 method3373(int arg0, int arg1, int[] arg2) {
        field8556++;
        if (this.field8553.method1740((byte) 43) == 1) {
            return this.method3372(0, 879022444, arg0, arg2);
        } else if (arg1 != 22962) {
            return null;
        } else if (this.field8553.method1727(arg1 - 23039, arg0) == 1) {
            return this.method3372(arg0, 879022444, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public static final void method3374(int arg0) {
        field8560++;
        if (class526.field7525 <= arg0) {
            class511.field7325 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class535.field7652.length; var2++) {
            if (class535.field7652[var2].startsWith("--> ")) {
                int var10000 = ~class526.field7525;
                var1++;
                if (var10000 == ~var1) {
                    class511.field7325 = class535.field7652[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)V")
    public static final void method3375(int arg0, int arg1, int arg2) {
        class287 var3 = class97.field1074[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3678 != null) {
            var3.field3678 = null;
        }
        if (var3.field3677 != null) {
            var3.field3677 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[II)Lwb;")
    private final class298 method3376(int arg0, int arg1, int[] arg2, int arg3) {
        field8555++;
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFF3) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class298 var9 = (class298) this.field8562.method3234((byte) -103, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class297 var10 = (class297) this.field8559.method3234((byte) -59, var7);
            if (var10 == null) {
                var10 = class297.method1683(this.field8554, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field8559.method3235(var7, -1, var10);
            }
            class298 var11 = var10.method1690(arg2);
            if (var11 == null) {
                return null;
            }
            if (arg3 <= 65) {
                this.field8559 = null;
            }
            var10.method1519((byte) 121);
            this.field8562.method3235(var7, -1, var11);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lfp;IILfp;IBIIII)V")
    public static final void method3377(class292 arg0, int arg1, int arg2, class292 arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field8558++;
        int var10 = arg3.method1649((byte) 114);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class458 var12 = (class458) class118.field1354.method3690((byte) -73, (long) var10);
        if (var12 == null) {
            class563[] var13 = class563.method3180(class633.field8972, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class453.field6284.method351(var13[0], true);
            class118.field1354.method3683(var12, (byte) 101, (long) var10);
        }
        class250.method1439(arg2, arg4 >> 1, arg0.field4638, arg0.field4641, arg0.field4647, true, 0, arg1, arg0.method1656(true) * 256, arg7 >> 1);
        int var14 = class377.field4913[0] + arg9 - 18;
        int var15 = arg8 / 4 * 18 + var14;
        int var16 = arg6 - (16 - class377.field4913[1]) - 54;
        int var17 = arg8 % 4 * 18 + var16;
        var12.method2612(var15, var17);
        if (arg0 == arg3) {
            class453.field6284.method3556(var17 - 1, (byte) 15, -256, 18, var15 - 1, 18);
        }
        class393 var18 = class253.method1452(4096);
        var18.field5231 = var17 + 16;
        int var19 = 65 / ((arg5 + 41) / 59);
        var18.field5230 = arg3;
        var18.field5233 = var15;
        var18.field5232 = var15 + 16;
        var18.field5237 = var17;
        class415.field5507.method87(96, var18);
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljo;Ljo;)V")
    public class605(class303 arg0, class303 arg1) {
        this.field8554 = arg1;
        this.field8553 = arg0;
    }
}
