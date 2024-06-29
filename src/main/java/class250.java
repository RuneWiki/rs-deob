import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class250 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "J")
    public static long field3724 = -1L;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lvq;IILs;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method1735(class269 arg0, int arg1, int arg2, class154 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class294.field4251 = arg0;
        class223.field3269 = arg1;
        class16.field238 = arg3;
        class369.field5257 = class294.field4251.method953() > 0;
        class65.field891 = arg4 >> 7;
        class333.field4842 = arg6 >> 7;
        class72.field940 = arg4;
        class265.field3899 = arg6;
        class316.field4641 = arg5;
        class25.field308 = class65.field891 - class150.field2249;
        if (class25.field308 < 0) {
            class57.field761 = -class25.field308;
            class25.field308 = 0;
        } else {
            class57.field761 = 0;
        }
        class28.field353 = class333.field4842 - class150.field2249;
        if (class28.field353 < 0) {
            class365.field5221 = -class28.field353;
            class28.field353 = 0;
        } else {
            class365.field5221 = 0;
        }
        class183.field2589 = class65.field891 + class150.field2249;
        if (class183.field2589 > class394.field5548) {
            class183.field2589 = class394.field5548;
        }
        class441.field6306 = class333.field4842 + class150.field2249;
        if (class441.field6306 > class407.field5751) {
            class441.field6306 = class407.field5751;
        }
        for (int var18 = 0; var18 < class150.field2249 + class150.field2249 + 2; var18++) {
            for (int var23 = 0; var23 < class150.field2249 + class150.field2249 + 2; var23++) {
                int var24 = class65.field891 + var18 - class150.field2249;
                int var25 = class333.field4842 + var23 - class150.field2249;
                if (var24 >= 0 && var25 >= 0 && var24 < class394.field5548 && var25 < class407.field5751) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class126.field1734[3].method359(var24, var25) - 1000;
                    int var29 = class241.field3567 == null ? class126.field1734[0].method359(var24, var25) + 128 : class241.field3567[0].method359(var24, var25) + 128;
                    class213.field3013[var18][var23] = class294.field4251.method998(var26, var28, var27, var26, var29, var27);
                } else {
                    class213.field3013[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class150.field2249 + class150.field2249 + 1; var19++) {
            for (int var22 = 0; var22 < class150.field2249 + class150.field2249 + 1; var22++) {
                class9.field125[var19][var22] = class213.field3013[var19][var22] || class213.field3013[var19 + 1][var22] || class213.field3013[var19][var22 + 1] || class213.field3013[var19 + 1][var22 + 1];
            }
        }
        class115.field1485 = arg8;
        class373.field5318 = arg9;
        class126.field1711 = arg10;
        class86.field1121 = arg11;
        class20.field268 = arg12;
        class390.method2462();
        class245.method1713((byte) -12);
        for (class316 var20 = (class316) class147.field2188.method1082(112); var20 != null; var20 = (class316) class147.field2188.method1078(false)) {
            var20.method674(-1);
            class171.method1221(var20, 110);
        }
        if (class369.field5257) {
            for (int var21 = 0; var21 < class153.field2273; var21++) {
                class282.field4039[var21].method460((byte) 12, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class294.field4251.method1005(0);
            if (class312.field4615 == null || class312.field4615 instanceof class278) {
                class312.field4615 = new class302();
            }
        } else if (class312.field4615 == null || class312.field4615 instanceof class302) {
            class312.field4615 = new class278();
        }
        class312.field4615.method1916(arg2, 0);
        class312.field4615.method1913(true);
        if (class24.field306 != null) {
            class228.method1588(true);
            class312.field4615.method1915(22, (byte) -19);
            class413.method2607(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class312.field4615.method1913(true);
            class312.field4615.method1915(23, (byte) -19);
            class228.method1588(false);
        }
        class413.method2607(arg2, arg7, arg13, arg14, arg15, arg16);
        class312.field4615.method1913(true);
        class312.field4615.method1917((byte) 125);
        class312.field4615.method1913(true);
        if (arg2 > 1) {
            class294.field4251.method890(0);
        }
        class294.field4251.method945(0, (class402[]) null);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)J")
    public abstract long method191(boolean arg0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method1736(int arg0, int arg1) {
        field3723++;
        class276 var2 = class264.method1816((byte) -118, arg1, arg0);
        var2.method1870((byte) 126);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLlf;)V")
    public static final void method1737(boolean arg0, class130 arg1) {
        field3722++;
        int var2 = arg1.method854(3944);
        class231.field3420 = new class239[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class231.field3420[var3] = new class239();
            class231.field3420[var3].field3530 = arg1.method854(3944);
            class231.field3420[var3].field3527 = arg1.method801(1);
        }
        class19.field254 = arg1.method854(3944);
        class241.field3566 = arg1.method854(3944);
        if (arg0) {
            method1737(false, (class130) null);
        }
        class173.field2450 = arg1.method854(3944);
        class440.field6295 = new class158[class241.field3566 + 1 - class19.field254];
        for (int var4 = 0; var4 < class173.field2450; var4++) {
            int var5 = arg1.method854(3944);
            class158 var6 = class440.field6295[var5] = new class158();
            var6.field2393 = arg1.method837(!arg0);
            var6.field2386 = arg1.method815(true);
            var6.field2311 = class19.field254 + var5;
            var6.field2304 = arg1.method801(1);
            var6.field2303 = arg1.method801(1);
        }
        class417.field5996 = arg1.method815(!arg0);
        class320.field4689 = true;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
    public abstract int method194(int arg0, int arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public abstract void method193(byte arg0);

    static {
        new class349("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }
}
