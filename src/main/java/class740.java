import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class740 extends class105 {

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "[C")
    public static char[] field10391 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field10386;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field10389;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lqc;")
    public class740 field10388;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lqc;")
    public class740 field10390;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static final void method4118(boolean arg0) {
        field10387++;
        for (class66 var1 = (class66) class288.field4066.method1522(arg0); var1 != null; var1 = (class66) class288.field4066.method1527((byte) 116)) {
            if (class23.method139(var1.field1198, (byte) -20)) {
                class541.method3186(var1, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lnl;ZZI)V")
    public static final void method4119(class548 arg0, boolean arg1, boolean arg2, int arg3) {
        field10386++;
        int var4 = arg0.field7723;
        int var5 = (int) arg0.field8991;
        arg0.method3617(1);
        if (arg3 <= 48) {
            method4121(56, -40, -73, 57);
        }
        if (arg1) {
            class397.method2465((byte) -86, var4);
        }
        class252.method1710(false, var4);
        class50 var6 = class545.method3220(65535, var5);
        if (var6 != null) {
            class262.method1776(0, var6);
        }
        method4118(true);
        if (!arg2 && class401.field5610 != -1) {
            class425.method2588(1, -2, class401.field5610);
        }
        class310 var7 = new class310(class310.field4383);
        for (class548 var8 = (class548) var7.method2013((byte) 41); var8 != null; var8 = (class548) var7.method2012(-1)) {
            if (!var8.method3618(-119)) {
                var8 = (class548) var7.method2013((byte) 94);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field7725 == 3) {
                int var9 = (int) var8.field8991;
                if ((var9 >>> 16) == var4) {
                    method4119(var8, true, arg2, 89);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method4120(int arg0) {
        if (arg0 == -31390) {
            field10391 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)I")
    public static final int method4121(int arg0, int arg1, int arg2, int arg3) {
        field10389++;
        if (arg1 != -28675) {
            field10391 = null;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    public final void method4122(boolean arg0) {
        field10392++;
        if (this.field10388 == null) {
            return;
        }
        this.field10388.field10390 = this.field10390;
        if (arg0) {
            field10391 = null;
        }
        this.field10390.field10388 = this.field10388;
        this.field10388 = null;
        this.field10390 = null;
    }
}
