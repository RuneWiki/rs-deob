import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class237 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lel;")
    public static class232 field4035 = null;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lke;")
    public static class256 field4034 = class316.method2202("Poser", 27626);

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field4037 = 0;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field4040 = 0;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lke;")
    public static class256 field4036 = class316.method2202("Clientscript error )2 check log for details", 27626);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field4038 = 7759444;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Lke;")
    public static class256 field4047 = class316.method2202("::errortest", 27626);

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lke;")
    public static class256 field4042 = class316.method2202("Gegenstand f-Ur Mitglieder", 27626);

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field4050 = 0;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lng;")
    public static class138 field4043;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "[[Lgf;")
    public static class113[][] field4041;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBIIIIII)V", line = 4)
    public static final void method1589(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4044++;
        if (arg3 == arg7) {
            class64.method495(arg4, arg2, 4096, arg0, arg5, arg3, arg6);
            return;
        }
        if ((arg5 - arg3) >= class244.field4161 && arg3 + arg5 <= class175.field3106 && class105.field1887 <= arg2 - arg7 && (arg2 + arg7) <= class274.field4748) {
            class243.method1630(arg0, arg5, arg7, false, arg3, arg4, arg2, arg6);
        } else {
            class160.method1184(8, arg3, arg0, arg5, arg7, arg6, arg4, arg2);
        }
        if (arg1 > -55) {
            method1590(true);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 43)
    public static void method1590(boolean arg0) {
        field4041 = (class113[][]) null;
        field4035 = null;
        field4036 = null;
        if (arg0) {
            field4042 = (class256) null;
        }
        field4047 = null;
        field4043 = null;
        field4042 = null;
        field4034 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZIIII)V", line = 66)
    public static final void method1591(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class115.method788(arg3, -25207);
        field4048++;
        int var7 = arg3 - arg5;
        int var8 = 0;
        int var9 = arg3;
        if (var7 < 0) {
            var7 = 0;
        }
        int var10 = -arg3;
        int var11 = var7;
        int var12 = -var7;
        if (arg2) {
            return;
        }
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class308.field5329[arg1];
        int var16 = arg0 - var7;
        class73.method550(-29903, var15, var16, arg0 - arg3, arg4);
        int var17 = arg0 + var7;
        class73.method550(-29903, var15, var17, var16, arg6);
        class73.method550(-29903, var15, arg0 + arg3, var17, arg4);
        while (var8 < var9) {
            var13 += 2;
            var10 += var13;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class31.field490[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var7) {
                    int[] var18 = class308.field5329[arg1 - var9];
                    int var19 = arg0 - var8;
                    int[] var20 = class308.field5329[arg1 + var9];
                    int var21 = arg0 + var8;
                    class73.method550(-29903, var20, var21, var19, arg4);
                    class73.method550(-29903, var18, var21, var19, arg4);
                } else {
                    int[] var22 = class308.field5329[arg1 - var9];
                    int[] var23 = class308.field5329[arg1 + var9];
                    int var24 = class31.field490[var9];
                    int var25 = arg0 - var8;
                    int var26 = arg0 + var8;
                    int var27 = arg0 + var24;
                    int var28 = arg0 - var24;
                    class73.method550(-29903, var23, var28, var25, arg4);
                    class73.method550(-29903, var23, var27, var28, arg6);
                    class73.method550(-29903, var23, var26, var27, arg4);
                    class73.method550(-29903, var22, var28, var25, arg4);
                    class73.method550(-29903, var22, var27, var28, arg6);
                    class73.method550(-29903, var22, var26, var27, arg4);
                }
            }
            int[] var29 = class308.field5329[arg1 + var8];
            int var30 = arg0 + var9;
            int[] var31 = class308.field5329[arg1 - var8];
            int var32 = arg0 - var9;
            if (var7 <= var8) {
                class73.method550(-29903, var29, var30, var32, arg4);
                class73.method550(-29903, var31, var30, var32, arg4);
            } else {
                int var33 = var8 <= var11 ? var11 : class31.field490[var8];
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class73.method550(-29903, var29, var35, var32, arg4);
                class73.method550(-29903, var29, var34, var35, arg6);
                class73.method550(-29903, var29, var30, var34, arg4);
                class73.method550(-29903, var31, var35, var32, arg4);
                class73.method550(-29903, var31, var34, var35, arg6);
                class73.method550(-29903, var31, var30, var34, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILke;Z)V", line = 231)
    public static final void method1592(int arg0, class256 arg1, boolean arg2) {
        field4045++;
        class256 var3 = arg1.method1771(false);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class137.field2383; var6++) {
            class36 var7 = class254.method1753(var6, true);
            if ((!arg2 || var7.field639) && var7.field579 == -1 && var7.field629 == -1 && var7.field637 == 0 && var7.field591.method1771(false).method1779(var3, (byte) -116) != -1) {
                if (var5 >= 250) {
                    class63.field1108 = -1;
                    class301.field5181 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (arg0 != 8084) {
            field4036 = (class256) null;
        }
        class44.field832 = 0;
        class301.field5181 = var4;
        class63.field1108 = var5;
        class256[] var10 = new class256[class63.field1108];
        for (int var11 = 0; var11 < class63.field1108; var11++) {
            var10[var11] = class254.method1753(var4[var11], true).field591;
        }
        class175.method1274(class301.field5181, var10, true);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lng;I)V", line = 309)
    public static final void method1593(class138 arg0, int arg1) {
        field4049++;
        class239.field4081 = arg0;
        class209.field3774 = class239.field4081.method991(16, -1);
        if (arg1 != -6264) {
            field4035 = (class232) null;
        }
    }
}
