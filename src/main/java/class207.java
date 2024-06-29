import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class207 extends class512 {

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Z")
    private boolean field2947 = false;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "B")
    public static byte field2950;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "F")
    public static float field2952;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILlo;)V")
    public final void method40(int arg0, int arg1, class117 arg2) {
        if (arg1 != -37) {
            this.method39(-30);
        }
        ++field2946;
        super.field7153.method2933((byte) -80, arg2);
        super.field7153.method2881(arg0, -1);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZZ)V")
    public final void method33(boolean arg0, boolean arg1) {
        ++field2945;
        if (!arg0) {
            field2953 = 19;
        }
        super.field7153.method2878(class253.field3501, 28768, class369.field4717);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZ)V")
    public final void method38(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field2948;
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        ++field2951;
        int var2 = -88 % ((-72 - arg0) / 37);
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        ++field2954;
        if (this.field2947) {
            super.field7153.method2949(1, arg0 ^ 7550);
            super.field7153.method592(class313.field4010, (byte) 126);
            super.field7153.method2878(class369.field4717, arg0 + 28762, class369.field4717);
            super.field7153.method2946(2, class123.field1675, (byte) 127);
            super.field7153.method2923(-124, 0, class186.field2725);
            super.field7153.method2928(false);
            super.field7153.method2933((byte) 103, (class117) null);
            super.field7153.method2949(0, 7544);
            this.field2947 = false;
        } else {
            super.field7153.method2923(arg0 + -101, 0, class186.field2725);
        }
        if (arg0 != 6) {
            this.method38(3, 35, false);
        }
        super.field7153.method2878(class369.field4717, 28768, class369.field4717);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([Lig;II)V")
    public static final void method1375(class674[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class674 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field9491;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field9491 > (var7 & 1) + var6) {
                    class674 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method1375(arg0, arg1, var4 - 1);
            method1375(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lpga;)V")
    public class207(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
    public final void method36(int arg0, boolean arg1) {
        ++field2949;
        if (arg0 > -62) {
            this.method38(-60, 82, true);
        }
        class273 var3 = super.field7153.method2898((byte) 74);
        if (var3 != null && arg1) {
            super.field7153.method2949(1, 7544);
            super.field7153.method2933((byte) -47, var3);
            super.field7153.method592(class126.field1734, (byte) -90);
            super.field7153.method2949(1, 7544);
            super.field7153.method2878(class253.field3501, 28768, class438.field6017);
            super.field7153.method582(2, (byte) -110, true, class214.field3017, false);
            super.field7153.method2923(-107, 0, class87.field1198);
            class173 var4 = super.field7153.method2872((byte) -109);
            var4.method1078(super.field7153.method2927((byte) -92), 16383);
            super.field7153.method2925(class144.field1997, (byte) 107);
            super.field7153.method2949(0, 7544);
            this.field2947 = true;
        } else {
            super.field7153.method2923(-114, 0, class87.field1198);
        }
    }
}
