import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class263 {

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    private int field4171 = -1;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    private int field4176 = 0;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Lgj;")
    private class257 field4178 = new class257();

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "Z")
    public boolean field4179 = false;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    private int field4169;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[Ltd;")
    private class267[] field4164;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[[[I")
    private int[][][] field4177;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field4175 = 0;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4174 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field4170 = 0;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lpj;")
    public static class205 field4168;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 4)
    public static void method1863(int arg0) {
        field4168 = null;
        if (arg0 > -87) {
            field4170 = 57;
        }
        field4174 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lnk;BLnk;)V", line = 15)
    public static final void method1864(class16 arg0, byte arg1, class16 arg2) {
        field4172++;
        class25.field292 = arg0;
        class139.field2090 = arg2;
        class139.field2090.method110(false, 34);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class60.field708 = var4 + var6;
        class91.field1203 = var5 + var6;
        class13.field135 = var3 + var6;
        if (arg1 != 73) {
            method1863(-67);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)V", line = 43)
    public static final void method1865(int arg0, byte arg1) {
        class291.field4582.method387(arg0, false);
        field4173++;
        if (arg1 < 59) {
            method1869(-109, 1, 34, -128, (byte) 118, -84, 3, -123);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[[I", line = 62)
    public final int[][] method1866(int arg0, int arg1) {
        if (arg1 != 0) {
            method1869(68, 39, -85, 116, (byte) -118, -116, -9, 83);
        }
        field4180++;
        if (this.field4169 == this.field4166) {
            this.field4179 = this.field4164[arg0] == null;
            this.field4164[arg0] = class13.field132;
            return this.field4177[arg0];
        } else if (this.field4169 == 1) {
            this.field4179 = this.field4171 != arg0;
            this.field4171 = arg0;
            return this.field4177[0];
        } else {
            class267 var3 = this.field4164[arg0];
            if (var3 == null) {
                this.field4179 = true;
                if (this.field4169 <= this.field4176) {
                    class267 var4 = (class267) this.field4178.method1816((byte) 125);
                    var3 = new class267(arg0, var4.field4203);
                    this.field4164[var4.field4197] = null;
                    var4.method1290(arg1 ^ 0xFFFFFFD0);
                } else {
                    var3 = new class267(arg0, this.field4176);
                    this.field4176++;
                }
                this.field4164[arg0] = var3;
            } else {
                this.field4179 = false;
            }
            this.field4178.method1810(0, var3);
            return this.field4177[var3.field4203];
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 129)
    public final void method1867(int arg0) {
        for (int var2 = 0; var2 < this.field4169; var2++) {
            this.field4177[var2][0] = null;
            this.field4177[var2][1] = null;
            this.field4177[var2][2] = null;
            this.field4177[var2] = (int[][]) null;
        }
        if (arg0 != -1) {
            field4168 = (class205) null;
        }
        this.field4164 = null;
        field4165++;
        this.field4177 = (int[][][]) null;
        this.field4178.method1811((byte) -30);
        this.field4178 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)[[[I", line = 153)
    public final int[][][] method1868(byte arg0) {
        field4181++;
        if (this.field4169 != this.field4166) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4169; var2++) {
            this.field4164[var2] = class13.field132;
        }
        int var3 = -61 / ((1 - arg0) / 51);
        return this.field4177;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(III)V", line = 373)
    public class263(int arg0, int arg1, int arg2) {
        this.field4166 = arg1;
        this.field4169 = arg0;
        this.field4164 = new class267[this.field4166];
        this.field4177 = new int[this.field4169][3][arg2];
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIBIII)V", line = 182)
    public static final void method1869(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4167++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = arg6 - arg0;
        int var11 = arg5 - arg0;
        int var12 = 0;
        int var13 = arg5 * arg5;
        int var14 = var11 * var11;
        int var15 = arg6 * arg6;
        int var16 = var10 * var10;
        int var17 = var15 << 1;
        int var18 = var16 << 1;
        int var19 = var14 << 1;
        int var20 = var11 << 1;
        int var21 = var13 << 1;
        int var22 = arg5 << 1;
        int var23 = (1 - var22) * var15 + var21;
        int var24 = var13 - ((var22 - 1) * var17);
        int var25 = (1 - var20) * var16 + var19;
        int var26 = var14 - ((var20 - 1) * var18);
        int var27 = var15 << 2;
        if (arg4 >= -33) {
            return;
        }
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var14 << 2;
        int var31 = (var22 - 3) * var17;
        int var32 = var28;
        int var33 = var19 * 3;
        int var34 = var21 * 3;
        int var35 = (var20 - 3) * var18;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var11 - 1) * var29;
        int[] var39 = class347.field5501[arg3];
        class278.method1986(arg1 - arg6, var39, arg2, arg1 - var10, (byte) -106);
        class278.method1986(arg1 - var10, var39, arg7, arg1 + var10, (byte) -86);
        class278.method1986(arg1 + var10, var39, arg2, arg1 + arg6, (byte) 120);
        while (var9 > 0) {
            boolean var40 = var9 <= var11;
            var9--;
            int var41 = arg3 + var9;
            int var42 = arg3 - var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var12++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var37 += var30;
                    var25 += var33;
                    var33 += var30;
                    var12++;
                }
                var25 += -var38;
                var26 += -var35;
                var38 -= var29;
                var35 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var34;
                    var24 += var32;
                    var34 += var28;
                    var32 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var34;
                var8++;
                var34 += var28;
                var24 += var32;
                var32 += var28;
            }
            int var43 = arg1 + var8;
            var23 += -var36;
            var36 -= var27;
            var24 += -var31;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 - var12;
                int var46 = arg1 + var12;
                class278.method1986(var44, class347.field5501[var42], arg2, var45, (byte) -124);
                class278.method1986(var45, class347.field5501[var42], arg7, var46, (byte) -125);
                class278.method1986(var46, class347.field5501[var42], arg2, var43, (byte) 29);
                class278.method1986(var44, class347.field5501[var41], arg2, var45, (byte) -114);
                class278.method1986(var45, class347.field5501[var41], arg7, var46, (byte) -127);
                class278.method1986(var46, class347.field5501[var41], arg2, var43, (byte) 63);
            } else {
                class278.method1986(var44, class347.field5501[var42], arg2, var43, (byte) 60);
                class278.method1986(var44, class347.field5501[var41], arg2, var43, (byte) 42);
            }
            var31 -= var27;
        }
    }
}
