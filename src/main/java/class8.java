import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class8 {

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Lbm;")
    public class156 field277 = new class156();

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field268 = 127;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "[[B")
    public static byte[][] field271 = new byte[250][];

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Lca;")
    public static class114 field276;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Lbm;")
    private class156 field278;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V", line = 8)
    public static final void method88(int arg0, int arg1, int arg2) {
        field272++;
        class49 var3 = class99.field1810[class276.field4506][arg1][arg2];
        if (var3 == null) {
            class107.method792(class276.field4506, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class167 var5 = null;
        for (class167 var6 = (class167) var3.method431(0); var6 != null; var6 = (class167) var3.method439(-28512)) {
            class11 var7 = class296.method2124(0, var6.field2787.field5749);
            int var8 = var7.field323;
            if (var7.field338 == 1) {
                var8 = (var6.field2787.field5750 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class107.method792(class276.field4506, arg1, arg2);
            return;
        }
        var3.method434(arg0 ^ arg0, var5);
        class363 var9 = null;
        class363 var10 = null;
        for (class167 var11 = (class167) var3.method431(0); var11 != null; var11 = (class167) var3.method439(-28512)) {
            class363 var12 = var11.field2787;
            if (var5.field2787.field5749 != var12.field5749) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field5749 != var12.field5749 && var10 == null) {
                    var10 = var12;
                }
            }
        }
        long var13 = (long) (arg1 - (-(arg2 << 7) - 1610612736));
        class79.method597(class276.field4506, arg1, arg2, class21.method189((byte) -79, arg2 * 128 + 64, arg1 * 128 + 64, class276.field4506), var5.field2787, var13, var9, var10);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Lbm;", line = 85)
    public final class156 method89(int arg0) {
        class156 var2 = this.field277.field2641;
        if (arg0 != 16) {
            this.field278 = (class156) null;
        }
        field269++;
        if (this.field277 == var2) {
            this.field278 = null;
            return null;
        } else {
            this.field278 = var2.field2641;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZI)V", line = 105)
    public static final void method90(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field268 = 61;
        }
        class341.field5402 = new class124(arg2);
        field267++;
        class44.field906 = new class124(arg0);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V", line = 117)
    public final void method91(int arg0) {
        field275++;
        int var2 = -76 / ((arg0 - 12) / 59);
        while (true) {
            class156 var3 = this.field277.field2641;
            if (this.field277 == var3) {
                this.field278 = null;
                return;
            }
            var3.method1105(123);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 140)
    public static void method92(byte arg0) {
        field276 = null;
        field271 = (byte[][]) null;
        if (arg0 > -75) {
            field271 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(III)V", line = 154)
    public static final void method93(int arg0, int arg1, int arg2) {
        field265++;
        class335 var3 = class119.method868(arg2, (byte) -92);
        int var4 = var3.field5329;
        int var5 = var3.field5334;
        int var6 = var3.field5337;
        int var7 = class238.field3970[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        if (arg0 != 32) {
            method97(123, 122, (class181) null, 96, -91, 74, 20, -113);
        }
        int var8 = var7 << var5;
        class207.method1433((byte) -104, var4, var8 & arg1 << var5 | ~var8 & class340.field5391[var4]);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lbm;I)V", line = 180)
    public final void method94(class156 arg0, int arg1) {
        if (arg0.field2645 != null) {
            arg0.method1105(118);
        }
        if (arg1 != -1) {
            return;
        }
        arg0.field2645 = this.field277.field2645;
        arg0.field2641 = this.field277;
        field273++;
        arg0.field2645.field2641 = arg0;
        arg0.field2641.field2645 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)Lbm;", line = 197)
    public final class156 method95(byte arg0) {
        if (arg0 != 48) {
            method92((byte) -52);
        }
        field266++;
        class156 var2 = this.field278;
        if (this.field277 == var2) {
            this.field278 = null;
            return null;
        } else {
            this.field278 = var2.field2641;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 222)
    public static final void method96(int arg0) {
        field274++;
        if (!class347.field5547) {
            return;
        }
        class7.field240 = null;
        class135.field2319 = null;
        class347.field5547 = false;
        if (arg0 != 32) {
            field276 = (class114) null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILg;IIIII)V", line = 253)
    public static final void method97(int arg0, int arg1, class181 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class263.field4321) {
            class79.field1393 = 32;
        } else {
            class79.field1393 = 0;
        }
        class263.field4321 = false;
        field270++;
        if (~class94.field1651 != arg0) {
            if (arg6 <= arg5 && (arg6 + 16) > arg5 && arg3 >= arg1 && arg3 < arg1 + 16) {
                arg2.field2992 -= 4;
                class52.method459(128, arg2);
            } else if (arg6 <= arg5 && arg6 + 16 > arg5 && (arg1 + arg4 - 16) <= arg3 && arg1 + arg4 > arg3) {
                arg2.field2992 += 4;
                class52.method459(arg0 ^ 0xFFFFFF7F, arg2);
            } else if (arg6 - class79.field1393 <= arg5 && (arg6 - (-class79.field1393 - 16)) > arg5 && arg1 + 16 <= arg3 && arg3 < arg1 + arg4 - 16) {
                int var8 = (arg4 - 32) * arg4 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - (var8 / 2) - arg1 - 16;
                int var10 = arg4 - (var8 + 32);
                arg2.field2992 = (arg7 - arg4) * var9 / var10;
                class52.method459(arg0 ^ 0xFFFFFF7F, arg2);
                class263.field4321 = true;
            }
        }
        if (class237.field3881 == 0) {
            return;
        }
        int var11 = arg2.field3024;
        if ((arg6 - var11) <= arg5 && arg3 >= arg1 && arg5 < arg6 + 16 && (arg1 + arg4) >= arg3) {
            arg2.field2992 += class237.field3881 * 45;
            class52.method459(128, arg2);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 319)
    public class8() {
        this.field277.field2641 = this.field277;
        this.field277.field2645 = this.field277;
    }
}
