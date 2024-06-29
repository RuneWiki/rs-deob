import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class211 extends class210 {

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    private int field3262;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    private int field3263;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    private int field3258;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3250;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[Lnl;")
    public static class98[] field3251;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public final void method504(int arg0, int arg1, int arg2) {
        ++field3252;
        if (arg2 > -8) {
            this.field3258 = -88;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method1468(byte arg0) {
        field3250 = null;
        if (arg0 != 72) {
            field3256 = 124;
        }
        field3251 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLcc;)V")
    public static final void method1469(boolean arg0, class222 arg1) {
        ++field3260;
        if (arg0) {
            class222 var2 = class112.method834(0, arg1);
            int var3;
            int var4;
            if (var2 == null) {
                var3 = class179.field2816;
                var4 = class163.field2449;
            } else {
                var3 = var2.field3408;
                var4 = var2.field3561;
            }
            class182.method1304(var4, var3, arg1, false, (byte) -109);
            class223.method1531(false, var4, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)[Llg;")
    public static final class13[] method1470(int arg0) {
        class13[] var1 = new class13[class174.field2682];
        for (int var2 = arg0; class174.field2682 > var2; ++var2) {
            var1[var2] = new class13(class214.field3278, class234.field3705, class196.field3069[var2], class125.field1877[var2], class104.field1621[var2], class170.field2583[var2], class301.field4847[var2], class102.field1585);
        }
        class30.method254(2);
        ++field3253;
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIII)V")
    public class211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3262 = arg3;
        this.field3263 = arg0;
        this.field3258 = arg2;
        this.field3259 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)V")
    public final void method502(int arg0, byte arg1, int arg2) {
        if (arg1 < 72) {
            this.field3262 = -120;
        }
        ++field3254;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        ++field3261;
        int var4 = this.field3259 * arg0 >> 12;
        int var5 = this.field3258 * arg2 >> 12;
        int var6 = this.field3263 * arg2 >> 12;
        int var7 = this.field3262 * arg0 >> 12;
        class116.method856(var4, super.field3247, var5, var7, -85, var6);
        if (arg1 != -20) {
            method1471(-60);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static final void method1471(int arg0) {
        ++field3264;
        if (arg0 != -1784196468) {
            method1470(-14);
        }
        class231.field3665.method1172((byte) 124);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLfh;)V")
    public static final void method1472(boolean arg0, class136 arg1) {
        ++field3257;
        if (!arg0) {
            method1469(true, (class222) null);
        }
        class80 var2 = (class80) class193.field3023.method2043(class170.method1223(arg0, arg1.field2064), -1);
        if (var2 == null) {
            class155.method1124(class130.field1941, arg1, (byte) 106, arg1.field4673[0], arg1.field4749[0], (class295) null, (class161) null, 0);
        } else {
            var2.method629(!arg0);
        }
    }
}
