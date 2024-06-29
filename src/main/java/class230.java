import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class230 {

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lkf;")
    private class225 field4000;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lfc;")
    private class226 field3999;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lne;")
    private class238 field4005;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Ljf;")
    public static class229 field3992 = class212.method1457((byte) 113, "");

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "[I")
    public static int[] field4004 = new int[2000];

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
    public static int[] field3996 = new int[32];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lkh;")
    private class14 field4003;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[Lai;")
    private class126[] field3991;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1656(int arg0) {
        class171.field2972.method1398(124);
        field3993++;
        int var1 = class171.field2972.method1396(8, -126);
        if (var1 < class126.field2238) {
            for (int var2 = var1; var2 < class126.field2238; var2++) {
                class274.field4698[class267.field4575++] = class283.field4858[var2];
            }
        }
        if (class126.field2238 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class126.field2238 = 0;
        int var3 = 0;
        if (arg0 != 882213409) {
            field3994 = 74;
        }
        while (var1 > var3) {
            int var4 = class283.field4858[var3];
            class331 var5 = class331.field5637[var4];
            int var6 = class171.field2972.method1396(1, 30);
            if (var6 == 0) {
                class283.field4858[class126.field2238++] = var4;
                var5.field1962 = class199.field3475;
            } else {
                int var7 = class171.field2972.method1396(2, -16);
                if (var7 == 0) {
                    class283.field4858[class126.field2238++] = var4;
                    var5.field1962 = class199.field3475;
                    class201.field3529[class100.field1762++] = var4;
                } else if (var7 == 1) {
                    class283.field4858[class126.field2238++] = var4;
                    var5.field1962 = class199.field3475;
                    int var8 = class171.field2972.method1396(3, 81);
                    var5.method791(false, (byte) -103, var8);
                    int var9 = class171.field2972.method1396(1, 68);
                    if (var9 == 1) {
                        class201.field3529[class100.field1762++] = var4;
                    }
                } else if (var7 == 2) {
                    class283.field4858[class126.field2238++] = var4;
                    var5.field1962 = class199.field3475;
                    int var10 = class171.field2972.method1396(3, 109);
                    var5.method791(true, (byte) -103, var10);
                    int var11 = class171.field2972.method1396(3, -127);
                    var5.method791(true, (byte) -103, var11);
                    int var12 = class171.field2972.method1396(1, -127);
                    if (var12 == 1) {
                        class201.field3529[class100.field1762++] = var4;
                    }
                } else if (var7 == 3) {
                    class274.field4698[class267.field4575++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z", line = 127)
    public final boolean method1657(int arg0) {
        field4002++;
        if (this.field4003 != null) {
            return true;
        }
        if (arg0 != -24554) {
            this.field3991 = (class126[]) null;
        }
        if (this.field4005 == null) {
            if (this.field3999.method1575(arg0 + 24606)) {
                return false;
            }
            this.field4005 = this.field3999.method1563((byte) 0, true, 255, (byte) -104, 255);
        }
        if (this.field4005.field4499) {
            return false;
        } else {
            this.field4003 = new class14(this.field4005.method339((byte) -128));
            this.field3991 = new class126[(this.field4003.field174.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lvj;BLvj;I)Lai;", line = 156)
    public final class126 method1658(class107 arg0, byte arg1, class107 arg2, int arg3) {
        if (arg1 == -32) {
            field3998++;
            return this.method1659(arg0, arg2, true, arg3, true);
        } else {
            return (class126) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lvj;Lvj;ZIZ)Lai;", line = 167)
    private final class126 method1659(class107 arg0, class107 arg1, boolean arg2, int arg3, boolean arg4) {
        field3997++;
        if (this.field4003 == null) {
            throw new RuntimeException();
        }
        this.field4003.field195 = arg3 * 8 + 5;
        if (this.field4003.field195 >= this.field4003.field174.length) {
            throw new RuntimeException();
        } else if (this.field3991[arg3] == null) {
            if (!arg4) {
                method1663(-7, 56);
            }
            int var6 = this.field4003.method128((byte) 4);
            int var7 = this.field4003.method128((byte) 4);
            class126 var8 = new class126(arg3, arg1, arg0, this.field3999, this.field4000, var6, var7, arg2);
            this.field3991[arg3] = var8;
            return var8;
        } else {
            return this.field3991[arg3];
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 206)
    public final void method1660(int arg0) {
        field3990++;
        if (this.field3991 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3991.length; var2++) {
            if (this.field3991[var2] != null) {
                this.field3991[var2].method891(false);
            }
        }
        for (int var3 = arg0; var3 < this.field3991.length; var3++) {
            if (this.field3991[var3] != null) {
                this.field3991[var3].method893(55);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 242)
    public static void method1661(int arg0) {
        field3996 = null;
        field4004 = null;
        if (arg0 <= -62) {
            field3992 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZIIII)V", line = 263)
    public static final void method1662(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4;
        field3995++;
        int var7 = arg0 * arg0;
        int var8 = 0;
        int var9 = arg4 * arg4;
        int var10 = arg4 << 1;
        int var11 = var9 << 1;
        int var12 = var7 << 1;
        int var13 = (1 - var10) * var7 + var11;
        int var14 = var7 << 2;
        int var15 = var9 - ((var10 - 1) * var12);
        int var16 = var9 << 2;
        if (!arg1) {
            return;
        }
        int var17 = ((arg4 << 1) - 3) * var12;
        int var18 = (var8 + 1) * var16;
        int var19 = ((var8 << 1) + 3) * var11;
        if (class56.field991 <= arg5 && arg5 <= class142.field2458) {
            int var20 = class129.method909(class149.field2578, 0, arg0 + arg3, class327.field5490);
            int var21 = class129.method909(class149.field2578, 0, arg3 - arg0, class327.field5490);
            class34.method306(var21, class173.field3021[arg5], (byte) 111, var20, arg2);
        }
        int var22 = (arg4 - 1) * var14;
        while (var6 > 0) {
            var6--;
            int var23 = arg5 + var6;
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var18;
                    var18 += var16;
                    var13 += var19;
                    var8++;
                    var19 += var16;
                }
            }
            if (var15 < 0) {
                var8++;
                var13 += var19;
                var15 += var18;
                var18 += var16;
                var19 += var16;
            }
            int var24 = arg5 - var6;
            if (class56.field991 <= var23 && class142.field2458 >= var24) {
                int var25 = class129.method909(class149.field2578, 0, arg3 + var8, class327.field5490);
                int var26 = class129.method909(class149.field2578, 0, arg3 - var8, class327.field5490);
                if (class56.field991 <= var24) {
                    class34.method306(var26, class173.field3021[var24], (byte) 124, var25, arg2);
                }
                if (var23 <= class142.field2458) {
                    class34.method306(var26, class173.field3021[var23], (byte) 122, var25, arg2);
                }
            }
            var15 += -var17;
            var17 -= var14;
            var13 += -var22;
            var22 -= var14;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z", line = 360)
    public static final boolean method1663(int arg0, int arg1) {
        field4001++;
        if (arg0 == 6449) {
            return ((arg1 & 0x1ABEB2B8) >> 28) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lfc;Lkf;)V", line = 383)
    public class230(class226 arg0, class225 arg1) {
        this.field4000 = arg1;
        this.field3999 = arg0;
        if (!this.field3999.method1575(61)) {
            this.field4005 = this.field3999.method1563((byte) 0, true, 255, (byte) -104, 255);
        }
    }
}
