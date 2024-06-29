import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class106 {

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lob;")
    public static class141 field2033 = class175.method1195(40, "(Y<)4col>");

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lob;")
    private static class141 field2039 = class175.method1195(40, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[Ljg;")
    public static class96[] field2032 = new class96[6];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Lob;")
    public static class141 field2044 = class175.method1195(40, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lob;")
    public static class141 field2041 = field2039;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[I")
    public static int[] field2043 = new int[50];

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2046 = Calendar.getInstance();

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Ljava/awt/Image;")
    public Image field2045;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[I")
    public int[] field2047;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[BII[Lhi;III)V")
    public static final void method701(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, class79[] arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg8 + var15 > 0 && arg8 + var15 < 103) {
                    arg6[arg5].field1592[arg4 + var10][arg8 + var15] = class15.method94(arg6[arg5].field1592[arg4 + var10][arg8 + var15], -16777217);
                }
            }
        }
        if (arg2 != 17606) {
            field2039 = null;
        }
        field2040++;
        class146 var11 = new class146(arg3);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg7 == var12 && arg9 <= var13 && arg9 + 8 > var13 && arg0 <= var14 && arg0 + 8 > var14) {
                        class105.method700(0, arg2 - 17506, arg4 + class91.method626((byte) 64, var13 & 0x7, arg1, var14 & 0x7), class150.method1047(var14 & 0x7, var13 & 0x7, arg1, 0) + arg8, arg5, 0, var11, arg1);
                    } else {
                        class105.method700(0, 93, -1, -1, 0, 0, var11, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method702(int arg0, int arg1, int arg2, long arg3) {
        class153 var5 = class131.field2506[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2929 != null && var5.field2929.field3417 == arg3) {
            return true;
        } else if (var5.field2923 != null && var5.field2923.field1133 == arg3) {
            return true;
        } else if (var5.field2926 != null && var5.field2926.field2391 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2933; var6++) {
                if (var5.field2935[var6].field141 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZI)I")
    public static final int method703(int arg0, int arg1, boolean arg2, int arg3) {
        field2031++;
        if (!arg2) {
            method703(-73, 49, false, -115);
        }
        if (arg0 <= arg3) {
            return arg1 < arg3 ? arg1 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public final void method704(int arg0) {
        class148.method1031(this.field2047, this.field2035, this.field2038);
        field2036++;
        if (arg0 != -5) {
            field2037 = -77;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static final void method705(byte arg0) {
        field2042++;
        class98.field1926.method1385(9946);
        if (arg0 != -86) {
            field2029 = -11;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method655(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method656(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static void method706(int arg0) {
        field2041 = null;
        field2046 = null;
        if (arg0 != -5218) {
            return;
        }
        field2044 = null;
        field2039 = null;
        field2032 = null;
        field2033 = null;
        field2043 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method657(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    protected class106() {
    }
}
