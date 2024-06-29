import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class527 extends class296 {

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    private int field7303;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    private int field7299;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    private int field7304;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    private int field7291;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[Lnt;")
    public static class493[] field7298 = new class493[14];

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "[C")
    public static char[] field7294 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "F")
    public static float field7300;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lpm;")
    public static class131 field7301;

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIII)V")
    public class527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field7303 = arg2;
        this.field7299 = arg1;
        this.field7304 = arg0;
        this.field7291 = arg3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lio;I)Lwl;")
    public static final class677 method2977(class157 arg0, int arg1) {
        if (arg1 >= -98) {
            field7294 = null;
        }
        ++field7305;
        class77 var2 = class6.method40(-18254, arg0);
        int var3 = arg0.method928(2016790224);
        return new class677(var2.field9726, var2.field9729, var2.field9731, var2.field9736, var2.field9733, var2.field9743, var2.field9744, var2.field9727, var2.field9740, var2.field907, var2.field910, var2.field909, var2.field902, var2.field911, var2.field906, var3);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)V")
    public final void method136(byte arg0, int arg1, int arg2) {
        if (arg0 == 122) {
            ++field7293;
            int var4 = this.field7304 * arg2 >> 12;
            int var5 = this.field7303 * arg2 >> 12;
            int var6 = this.field7299 * arg1 >> 12;
            int var7 = this.field7291 * arg1 >> 12;
            class287.method1703(var7, var6, arg0 ^ 6, var4, var5, super.field3919);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZILga;III)V")
    public static final void method2978(int arg0, boolean arg1, int arg2, class332 arg3, int arg4, int arg5, int arg6) {
        ++field7296;
        if (arg4 > -5) {
            method2978(61, true, 39, (class332) null, -26, 91, -58);
        }
        if (~arg5 < -1) {
            class110.field1302 = arg0;
            class174.field2461 = arg6;
            class285.field3762 = arg3;
            class574.field7844 = 1;
            class401.field5322 = arg2;
            class111.field1339 = arg1;
            class253.field3319 = class16.field217.method272((byte) 113) / arg5;
            if (class253.field3319 < 1) {
                class253.field3319 = 1;
                return;
            }
        } else {
            class571.method3154(arg3, arg6, arg1, (byte) -124, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    public final void method134(int arg0, int arg1, int arg2) {
        if (arg2 >= -125) {
            method2979((byte) -44);
        }
        ++field7295;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)V")
    public final void method135(int arg0, byte arg1, int arg2) {
        if (arg1 >= 20) {
            ++field7302;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public static void method2979(byte arg0) {
        field7301 = null;
        field7294 = null;
        int var1 = -98 / ((arg0 - -26) / 53);
        field7298 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILci;Z)Z")
    public static final boolean method2980(int arg0, class152 arg1, boolean arg2) {
        class419.field5504.method363(arg1.field2078[arg0], arg1.field2084[arg0], arg1.field2085[arg0], class506.field6999);
        ++field7297;
        int var3 = class506.field6999[2];
        if (var3 < 50) {
            return false;
        } else {
            arg1.field2087[arg0] = (short) (class506.field6999[0] * class408.field5368 / var3 + class329.field4422);
            arg1.field2086[arg0] = (short) (class506.field6999[1] * class374.field4962 / var3 + class195.field2676);
            arg1.field2081[arg0] = (short) var3;
            if (!arg2) {
                method2978(-49, false, -1, (class332) null, 43, -119, -99);
            }
            return true;
        }
    }
}
