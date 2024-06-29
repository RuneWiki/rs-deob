import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class350 extends class159 {

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field5592;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field5597 = -1;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Ljava/lang/String;")
    public static String field5596 = "glow3:";

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5594 = "Opened title screen";

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Lnm;")
    public static class221 field5598;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "[I")
    public static int[] field5587;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILph;Lph;)V", line = 4)
    public static final void method2452(int arg0, class308 arg1, class308 arg2) {
        field5591++;
        if (arg1.field5009 != null) {
            arg1.method2148((byte) 104);
        }
        arg1.field5012 = arg2.field5012;
        arg1.field5009 = arg2;
        if (arg0 == -2818) {
            arg1.field5009.field5012 = arg1;
            arg1.field5012.field5009 = arg1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lkm;IIIII)V", line = 23)
    public static final void method2453(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class217.field3348 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class263.field4155) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class163.field2590 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class50 var14 = class264.field4230[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class101.field1457[var11][var12 + 1][var13] + class101.field1457[var11][var12][var13] + class101.field1457[var11][var12][var13 + 1] + class101.field1457[var11][var12 + 1][var13 + 1]) / 4 - (class101.field1457[arg1][arg2 + 1][arg3] + class101.field1457[arg1][arg2][arg3] + class101.field1457[arg1][arg2][arg3 + 1] + class101.field1457[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class257 var16 = var14.field732;
                                    if (var16 != null) {
                                        if (var16.field4070.method175()) {
                                            arg0.method185(var16.field4070, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4059 != null && var16.field4059.method175()) {
                                            arg0.method185(var16.field4059, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field735; var17++) {
                                        class258 var18 = var14.field752[var17];
                                        if (var18 != null && var18.field4071.method175() && (var18.field4082 == var12 || var7 == var12) && (var18.field4081 == var13 || var9 == var13)) {
                                            int var19 = var18.field4084 + 1 - var18.field4082;
                                            int var20 = var18.field4077 + 1 - var18.field4081;
                                            arg0.method185(var18.field4071, (var18.field4082 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4081 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 122)
    public static void method2454(boolean arg0) {
        field5598 = null;
        if (!arg0) {
            field5594 = null;
            field5587 = null;
            field5596 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V", line = 141)
    public class350(int arg0, int arg1) {
        this.field5592 = arg0;
        this.field5589 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V", line = 159)
    public static final void method2455(int arg0, int arg1, int arg2) {
        class311 var3 = class217.method1468(126, arg2);
        int var4 = var3.field5059;
        if (arg0 >= -122) {
            method2454(true);
        }
        field5590++;
        int var5 = var3.field5064;
        int var6 = var3.field5065;
        int var7 = class116.field1690[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class308.method2146(var8 & arg1 << var5 | class170.field2650[var4] & ~var8, 0, var4);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 189)
    public static final void method2456(String arg0, int arg1) {
        if (arg1 >= -104) {
            method2452(49, (class308) null, (class308) null);
        }
        System.out.println("Error: " + class181.method1263(107, arg0, "%0a", "\n"));
        field5593++;
    }
}
