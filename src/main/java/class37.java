import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class37 extends class96 {

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Lak;")
    public static class222 field569 = new class222(12, 0, 1, 0);

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "Lpp;")
    public class256 field572;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Ljava/lang/String;")
    public String field575;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "[I")
    public int[] field568;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "[I")
    public int[] field578;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "[Lfe;")
    public class384[] field574;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "[Ljava/lang/String;")
    public String[] field576;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method294(int arg0) {
        field569 = null;
        if (arg0 > -23) {
            field569 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Leq;Lbp;IIIII)V")
    public static final void method295(class134 arg0, class250 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class399.field5881 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class282.field4031) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class98.field1339 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class468 var15 = class358.field5312[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class311.field4527[var12].method848(var13, var14) + class311.field4527[var12].method848(var13 + 1, var14) + class311.field4527[var12].method848(var13, var14 + 1) + class311.field4527[var12].method848(var13 + 1, var14 + 1)) / 4 - (class311.field4527[arg2].method848(arg3, arg4) + class311.field4527[arg2].method848(arg3 + 1, arg4) + class311.field4527[arg2].method848(arg3, arg4 + 1) + class311.field4527[arg2].method848(arg3 + 1, arg4 + 1)) / 4;
                                    class403 var17 = var15.field6778;
                                    class403 var18 = var15.field6766;
                                    if (var17 != null && var17.method723(17774)) {
                                        arg1.method719((var14 - arg4) * class153.field1965 + (1 - arg6) * class170.field2281, var16, -1, var17, (var13 - arg3) * class153.field1965 + (1 - arg5) * class170.field2281, var7, arg0);
                                    }
                                    if (var18 != null && var18.method723(17774)) {
                                        arg1.method719((var14 - arg4) * class153.field1965 + (1 - arg6) * class170.field2281, var16, -1, var18, (var13 - arg3) * class153.field1965 + (1 - arg5) * class170.field2281, var7, arg0);
                                    }
                                    for (class323 var19 = var15.field6769; var19 != null; var19 = var19.field4727) {
                                        class210 var20 = var19.field4726;
                                        if (var20 != null && var20.method723(17774) && (var20.field2972 == var13 || var8 == var13) && (var20.field2975 == var14 || var10 == var14)) {
                                            int var21 = var20.field2962 + 1 - var20.field2972;
                                            int var22 = var20.field2957 + 1 - var20.field2975;
                                            arg1.method719((var20.field2975 - arg4) * class153.field1965 + (var22 - arg6) * class170.field2281, var16, -1, var20, (var20.field2972 - arg3) * class153.field1965 + (var21 - arg5) * class170.field2281, var7, arg0);
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
}
