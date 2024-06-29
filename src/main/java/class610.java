import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class610 {

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "B")
    public byte field8297;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "I")
    public int field8294;

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "Ljava/lang/String;")
    public String field8289;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "Ljava/lang/String;")
    public String field8290;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "Ljava/lang/String;")
    public String field8292;

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "Ljava/lang/String;")
    public String field8293;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I", line = 8)
    public static final int method3374(boolean arg0) {
        field8291++;
        if (arg0) {
            return class669.field9399 == 1 ? class688.field9675 : class564.field7561;
        } else {
            return 15;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)V", line = 30)
    public static final void method3375(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        if (var3 != null) {
            class745.method4126(var3.field3280);
            if (var3.field3280 != null) {
                var3.field3280 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V", line = 42)
    public static final void method3376(int arg0) {
        for (int var1 = 0; var1 < class665.field9191; var1++) {
            class64.field906[var1] = null;
        }
        field8295++;
        if (arg0 != 1) {
            return;
        }
        class665.field9191 = 0;
        for (int var2 = 0; var2 < class315.field4541; var2++) {
            for (int var42 = 0; var42 < class405.field5875; var42++) {
                for (int var43 = 0; var43 < class710.field9947; var43++) {
                    class243 var44 = class626.field8501[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field3271 > 0) {
                            var44.field3271 = (short) (var44.field3271 * -1);
                        }
                        if (var44.field3276 > 0) {
                            var44.field3276 = (short) (var44.field3276 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class315.field4541; var3++) {
            for (int var4 = 0; var4 < class405.field5875; var4++) {
                for (int var5 = 0; var5 < class710.field9947; var5++) {
                    class243 var6 = class626.field8501[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class626.field8501[0][var5][var4] != null && class626.field8501[0][var5][var4].field3281 != null;
                        if (var6.field3271 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class243 var12 = class626.field8501[var3][var5][var4 - 1];
                            int var13 = class412.field5933[var3].method1880(var5, false, var4);
                            while (var8 > 0 && var12 != null && var12.field3271 < 0 && var6.field3271 == var12.field3271 && var6.field3273 == var12.field3273 && class412.field5933[var3].method1880(var5, false, var8 - 1) == var13 && ((var8 - 1) <= 0 || class412.field5933[var3].method1880(var5, false, var8 - 2) == var13)) {
                                var8--;
                                var12 = class626.field8501[var3][var5][var8 - 1];
                            }
                            for (class243 var14 = class626.field8501[var3][var5][var4 + 1]; var9 < class710.field9947 && var14 != null && var14.field3271 < 0 && var6.field3271 == var14.field3271 && var6.field3273 == var14.field3273 && class412.field5933[var3].method1880(var5, false, var9 + 1) == var13 && (var9 + 1 >= class710.field9947 || class412.field5933[var3].method1880(var5, false, var9 + 2) == var13); var14 = class626.field8501[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class412.field5933[var7 ? var3 + 1 : var3].method1880(var5, false, var8);
                            int var17 = var6.field3271 * var15 + var16;
                            int var18 = class412.field5933[var7 ? var3 + 1 : var3].method1880(var5, false, var9 + 1);
                            int var19 = var6.field3271 * var15 + var18;
                            int var20 = var5 << class26.field388;
                            int var21 = var8 << class26.field388;
                            int var22 = (var9 << class26.field388) + class48.field722;
                            class64.field906[class665.field9191++] = new class723(1, var3, var20 + var6.field3273, var6.field3273 + var20, var6.field3273 + var20, var6.field3273 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class626.field8501[var23][var5][var24].field3271 = (short) (class626.field8501[var23][var5][var24].field3271 * -1);
                                }
                            }
                        }
                        if (var6.field3276 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class243 var29 = class626.field8501[var3][var5 - 1][var4];
                            int var30 = class412.field5933[var3].method1880(var5, false, var4);
                            while (var25 > 0 && var29 != null && var29.field3276 < 0 && var6.field3276 == var29.field3276 && var6.field3279 == var29.field3279 && class412.field5933[var3].method1880(var25 - 1, false, var4) == var30 && ((var25 - 1) <= 0 || class412.field5933[var3].method1880(var25 - 2, false, var4) == var30)) {
                                var25--;
                                var29 = class626.field8501[var3][var25 - 1][var4];
                            }
                            for (class243 var31 = class626.field8501[var3][var5 + 1][var4]; class405.field5875 > var26 && var31 != null && var31.field3276 < 0 && var6.field3276 == var31.field3276 && var6.field3279 == var31.field3279 && class412.field5933[var3].method1880(var26 + 1, false, var4) == var30 && (class405.field5875 <= (var26 + 1) || var30 == class412.field5933[var3].method1880(var26 + 2, false, var4)); var31 = class626.field8501[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class412.field5933[var7 ? var3 + 1 : var3].method1880(var25, false, var4);
                            int var34 = var33 + (var6.field3276 * var32);
                            int var35 = class412.field5933[var7 ? var3 + 1 : var3].method1880(var26 + 1, false, var4);
                            int var36 = var6.field3276 * var32 + var35;
                            int var37 = var25 << class26.field388;
                            int var38 = (var26 << class26.field388) + class48.field722;
                            int var39 = var4 << class26.field388;
                            class64.field906[class665.field9191++] = new class723(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field3279 + var39, var6.field3279 + var39, var6.field3279 + var39, var6.field3279 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class626.field8501[var40][var41][var4].field3276 = (short) (class626.field8501[var40][var41][var4].field3276 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class226.field3097 = true;
    }
}
