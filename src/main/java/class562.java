import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class562 {

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public int field7958;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public int field7960;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public int field7954;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public int field7964;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field7961 = new String[200];

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "Lcb;")
    public static class631 field7957 = new class631(6, 3);

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "Leha;")
    public static class162 field7956;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lfea;[[BI)V")
    public static final void method3250(class460 arg0, byte[][] arg1, int arg2) {
        field7965++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field1963; var4++) {
            class493.method2998((byte) -124);
            for (int var9 = 0; var9 < (class191.field3229 >> 3); var9++) {
                for (int var10 = 0; var10 < class314.field4720 >> 3; var10++) {
                    int var11 = class36.field365[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x3C0031D) >> 24;
                        if (!arg0.field1968 || var12 == 0) {
                            int var13 = var11 >> 1 & 0x3;
                            int var14 = var11 >> 14 & 0x3FF;
                            int var15 = (var11 & 0x3FF8) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class205.field3445.length; var17++) {
                                if (class205.field3445[var17] == var16 && arg1[var17] != null) {
                                    class301 var18 = new class301(arg1[var17]);
                                    arg0.method978(var10 * 8, var14, class247.field3958, var12, var15, var9 * 8, var4, var13, var18, (byte) 125);
                                    arg0.method2816((byte) -41, var15, var12, var14, var4, var18, class364.field5573, var10 * 8, var9 * 8, var13, var3[0] == -1 ? var3 : null);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg0.field1963; var5++) {
            class493.method2998((byte) -102);
            for (int var6 = 0; var6 < (class191.field3229 >> 3); var6++) {
                for (int var7 = 0; var7 < (class314.field4720 >> 3); var7++) {
                    int var8 = class36.field365[var5][var6][var7];
                    if (var8 == -1) {
                        arg0.method974(1, var5, var6 * 8, 8, 8, var7 * 8);
                    }
                }
            }
        }
        if (arg2 != 3) {
            method3253(false, false, 69, 5, -66);
        }
        if (var3[0] != -1) {
            class93.field1395 = class691.field9803.method2539(var3[3], class416.field6122, var3[2], arg2 + 10644, var3[0], var3[1]);
            class98.field1450 = var3[4];
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZ)Loga;")
    public final class562 method3251(int arg0, boolean arg1) {
        field7955++;
        if (arg1) {
            field7957 = null;
        }
        return new class562(this.field7954, arg0, this.field7958, this.field7960);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
    public static void method3252(byte arg0) {
        if (arg0 == 30) {
            field7961 = null;
            field7957 = null;
            field7956 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZZIII)V")
    public static final void method3253(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class650.method3658((byte) 74);
        field7959++;
        if (arg0) {
            field7956 = null;
        }
        class143.field2224 = 0L;
        int var5 = class347.method2215(-21383);
        if (arg2 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class364.field5573.method381()) {
            arg1 = true;
        }
        class564.method3264(var5, arg3, arg1, arg4, arg2, (byte) -105);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BCLjava/lang/String;)I")
    public static final int method3254(byte arg0, char arg1, String arg2) {
        field7963++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        if (arg0 == -58) {
            return var3;
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(IIII)V")
    public class562(int arg0, int arg1, int arg2, int arg3) {
        this.field7958 = arg2;
        this.field7960 = arg3;
        this.field7954 = arg0;
        this.field7964 = arg1;
    }
}
