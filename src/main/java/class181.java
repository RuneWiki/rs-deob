import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class181 extends class51 {

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "Lrc;")
    public static class155 field3647 = new class155(50);

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "Lea;")
    public static class38 field3651 = class9.method46((byte) 103, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "Lea;")
    public static class38 field3652 = class9.method46((byte) 126, "sl_flags");

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "Lea;")
    private static class38 field3648 = class9.method46((byte) 121, "Loaded title screen");

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "[Lcg;")
    public static class26[] field3649 = new class26[50];

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lea;")
    public static class38 field3650 = field3648;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3644;
        int[][] var3 = super.field1292.method720(false, arg1);
        int[] var4 = var3[1];
        int[] var5 = var3[0];
        if (arg0 < 111) {
            return null;
        } else {
            int[] var6 = var3[2];
            if (super.field1292.field2032) {
                for (int var7 = 0; class86.field2008 > var7; ++var7) {
                    this.method1241(-111, var7, arg1);
                    int[][] var8 = this.method377(0, class84.field1979, (byte) -95);
                    var5[var7] = var8[0][class42.field917];
                    var4[var7] = var8[1][class42.field917];
                    var6[var7] = var8[2][class42.field917];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
    public static void method1238(int arg0) {
        field3652 = null;
        field3648 = null;
        field3650 = null;
        if (arg0 == 50) {
            field3649 = null;
            field3647 = null;
            field3651 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1239(int arg0, Component arg1) {
        if (arg0 != 0) {
            method1239(-47, (Component) null);
        }
        ++field3646;
        Method var2 = class129.field2762;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class94.field2113);
        arg1.addFocusListener(class94.field2113);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static final void method1240(byte arg0) {
        class10.field232 = null;
        class190.field3761 = null;
        class92.field2079 = null;
        class124.field2670 = null;
        class32.field652 = null;
        ++field3643;
        class134.field2819 = null;
        class196.field3852 = null;
        class160.field3344 = null;
        class180.field3628 = null;
        class25.field511 = null;
        class67.field1695 = null;
        class162.field3371 = null;
        int var1 = -8 / ((arg0 - 48) / 46);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(III)V")
    private final void method1241(int arg0, int arg1, int arg2) {
        int var4 = class196.field3854[arg1];
        int var5 = 72 % ((arg0 - -52) / 45);
        ++field3645;
        int var6 = class170.field3490[arg2];
        float var7 = (float) Math.atan2((double) (var4 + -2048), (double) (var6 + -2048));
        if ((double) var7 >= -3.141592653589793D && (double) var7 <= -2.356194490192345D) {
            class84.field1979 = arg2;
            class42.field917 = arg1;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class84.field1979 = arg1;
            class42.field917 = arg2;
        } else if ((double) var7 <= -0.7853981633974483D && (double) var7 >= -1.5707963267948966D) {
            class42.field917 = -arg2 + class86.field2008;
            class84.field1979 = arg1;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class84.field1979 = -arg2 + class114.field2528;
            class42.field917 = arg1;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class42.field917 = -arg1 + class86.field2008;
            class84.field1979 = -arg2 + class114.field2528;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class42.field917 = -arg2 + class86.field2008;
            class84.field1979 = -arg1 + class114.field2528;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class42.field917 = arg2;
            class84.field1979 = -arg1 + class114.field2528;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class42.field917 = -arg1 + class86.field2008;
            class84.field1979 = arg2;
        }
        class84.field1979 &= class144.field3018;
        class42.field917 &= class39.field850;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field3642;
        if (arg0 >= -125) {
            field3649 = null;
        }
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            for (int var4 = 0; ~class86.field2008 < ~var4; ++var4) {
                this.method1241(56, var4, arg1);
                int[] var5 = this.method376(class84.field1979, 0, -108);
                var3[var4] = var5[class42.field917];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class181() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            super.field1289 = arg0.method509(116) == 1;
        }
        ++field3641;
        if (!arg2) {
            field3651 = null;
        }
    }
}
