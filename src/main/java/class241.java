import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class241 extends class222 {

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field4345 = 0;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "Lcf;")
    public static class93 field4360 = class147.method1066(": ", -48);

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lg;")
    public static class276 field4359 = new class276(128);

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Z")
    public static boolean field4363 = false;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "Lcf;")
    public static class93 field4362 = class147.method1066("Attaquer", -48);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[I[IIB)V")
    public static final void method1643(int arg0, int[] arg1, int[] arg2, int arg3, byte arg4) {
        int var5 = 53 % ((35 - arg4) / 36);
        field4347++;
        if (arg0 <= arg3) {
            return;
        }
        int var6 = (arg3 + arg0) / 2;
        int var7 = arg3;
        int var8 = arg2[var6];
        arg2[var6] = arg2[arg0];
        arg2[arg0] = var8;
        int var9 = arg1[var6];
        arg1[var6] = arg1[arg0];
        arg1[arg0] = var9;
        for (int var10 = arg3; var10 < arg0; var10++) {
            if (arg2[var10] > ((var10 & 0x1) + var8)) {
                int var11 = arg2[var10];
                arg2[var10] = arg2[var7];
                arg2[var7] = var11;
                int var12 = arg1[var10];
                arg1[var10] = arg1[var7];
                arg1[var7++] = var12;
            }
        }
        arg2[arg0] = arg2[var7];
        arg2[var7] = var8;
        arg1[arg0] = arg1[var7];
        arg1[var7] = var9;
        method1643(var7 - 1, arg1, arg2, arg3, (byte) 87);
        method1643(arg0, arg1, arg2, var7 + 1, (byte) 95);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method1644(boolean arg0) {
        field4359 = null;
        field4360 = null;
        if (!arg0) {
            field4362 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Lcf;")
    public static final class93 method1645(byte arg0, int arg1) {
        if (arg0 != 72) {
            field4360 = null;
        }
        class93 var2 = class148.method1067(-7015, arg1);
        for (int var3 = var2.method666(false) - 3; var3 > 0; var3 -= 3) {
            var2 = class130.method949((byte) -77, new class93[] { var2.method674(86, 0, var3), class218.field3974, var2.method637(arg0 ^ 0x39, var3) });
        }
        field4361++;
        if (var2.method666(false) > 9) {
            return class130.method949((byte) -77, new class93[] { class76.field1409, var2.method674(arg0 ^ 0x1, 0, var2.method666(false) - 8), class156.field2763, class271.field4823, var2, class214.field3920 });
        } else if (var2.method666(false) > 6) {
            return class130.method949((byte) -77, new class93[] { class29.field410, var2.method674(arg0 - 106, 0, var2.method666(false) - 4), class177.field3094, class271.field4823, var2, class214.field3920 });
        } else {
            return class130.method949((byte) -77, new class93[] { class47.field769, var2, class109.field1861 });
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public static final void method1646(int arg0, int arg1, int arg2) {
        class198.field3599 = true;
        class53.field875 = arg0;
        class191.field3492 = arg1;
        class248.field4478 = arg2;
        class78.field1458 = -1;
        class26.field336 = -1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method1647(int arg0, int arg1) {
        if (class162.field2867 == null || arg1 > class162.field2867.length) {
            class162.field2867 = new int[arg1];
        }
        if (arg0 != 20220) {
            field4363 = false;
        }
        field4348++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILee;)V")
    public static final void method1648(int arg0, class280 arg1) {
        if (class30.field444 != null) {
            try {
                class30.field444.method1671(0L, arg0 + 4438);
                class30.field444.method1672(true, arg1.field5011, arg1.field5027, 24);
            } catch (Exception var2) {
            }
        }
        arg1.field5027 += 24;
        if (arg0 != 3) {
            field4362 = null;
        }
        field4349++;
    }
}
