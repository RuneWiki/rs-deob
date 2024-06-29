import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class82 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lhi;")
    public static class131 field1407 = new class131(1, 2, 2, 0);

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ltq;ZZ)V")
    public static final void method590(class427 arg0, boolean arg1, boolean arg2) {
        field1408++;
        int var3 = arg0.field6164 == 0 ? arg0.field6175 : arg0.field6164;
        int var4 = arg0.field6184 == 0 ? arg0.field6126 : arg0.field6184;
        if (!arg2) {
            field1407 = null;
        }
        class396.method2350((byte) -32, arg1, class409.field5933[arg0.field6157 >> 16], arg0.field6157, var4, var3);
        if (arg0.field6193 != null) {
            class396.method2350((byte) -32, arg1, arg0.field6193, arg0.field6157, var4, var3);
        }
        class394 var5 = (class394) class245.field3741.method2409(false, (long) arg0.field6157);
        if (var5 != null) {
            class41.method289(var5.field5750, var3, -1, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lqq;Lps;IIIII)V")
    public static final void method591(class318 arg0, class59 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class483.field7381 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class377.field5492) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class347.field5132 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class268 var15 = class321.field4830[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class99.field1801[var12].method318(var13, var14) + class99.field1801[var12].method318(var13 + 1, var14) + class99.field1801[var12].method318(var13, var14 + 1) + class99.field1801[var12].method318(var13 + 1, var14 + 1)) / 4 - (class99.field1801[arg2].method318(arg3, arg4) + class99.field1801[arg2].method318(arg3 + 1, arg4) + class99.field1801[arg2].method318(arg3, arg4 + 1) + class99.field1801[arg2].method318(arg3 + 1, arg4 + 1)) / 4;
                                    class455 var17 = var15.field4059;
                                    class455 var18 = var15.field4063;
                                    if (var17 != null && var17.method164(0)) {
                                        arg1.method165(var16, arg0, var17, var7, true, (var14 - arg4) * class434.field6362 + (1 - arg6) * class42.field621, (var13 - arg3) * class434.field6362 + (1 - arg5) * class42.field621);
                                    }
                                    if (var18 != null && var18.method164(0)) {
                                        arg1.method165(var16, arg0, var18, var7, true, (var14 - arg4) * class434.field6362 + (1 - arg6) * class42.field621, (var13 - arg3) * class434.field6362 + (1 - arg5) * class42.field621);
                                    }
                                    for (class297 var19 = var15.field4045; var19 != null; var19 = var19.field4500) {
                                        class205 var20 = var19.field4505;
                                        if (var20 != null && var20.method164(0) && (var20.field3225 == var13 || var8 == var13) && (var20.field3219 == var14 || var10 == var14)) {
                                            int var21 = var20.field3227 + 1 - var20.field3225;
                                            int var22 = var20.field3220 + 1 - var20.field3219;
                                            arg1.method165(var16, arg0, var20, var7, true, (var20.field3219 - arg4) * class434.field6362 + (var22 - arg6) * class42.field621, (var20.field3225 - arg3) * class434.field6362 + (var21 - arg5) * class42.field621);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Ljk;")
    public static final class431 method592(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4051;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method593(int arg0) {
        if (arg0 != -113462416) {
            field1407 = null;
        }
        field1407 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)V")
    public static final void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1409++;
        int var6 = class167.method1056(class478.field7310, (byte) -125, class248.field3808, arg2);
        int var7 = class167.method1056(class478.field7310, (byte) -123, class248.field3808, arg1);
        int var8 = class167.method1056(class320.field4818, (byte) -125, class355.field5296, arg3);
        if (arg4 >= 39) {
            int var9 = class167.method1056(class320.field4818, (byte) -124, class355.field5296, arg0);
            for (int var10 = var6; var10 <= var7; var10++) {
                class78.method566(class69.field1212[var10], var9, arg5, -7, var8);
            }
        }
    }
}
