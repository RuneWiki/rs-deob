import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class197 extends class154 {

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "Z")
    public boolean field3462;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "[Lsg;")
    public class197[] field3468;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field3451 = 0;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "Loh;")
    public static class258 field3460 = class153.method1046("Suche nach Updates )2 ", 108);

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static volatile int field3467 = -1;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "Loh;")
    public static class258 field3457 = class153.method1046("Lade Benutzeroberfl-=che )2 ", 125);

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Z")
    public static boolean field3463 = true;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "Lqi;")
    public class276 field3461;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lod;")
    public class299 field3456;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)[[I", line = 7)
    public final int[][] method1322(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1326(28, true);
        }
        field3465++;
        if (this.field3468[arg2].field3462) {
            int[] var4 = this.field3468[arg2].method96(-16221, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3468[arg2].method101(arg1, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIIIIII)V", line = 41)
    public static final void method1323(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class149[] var7 = class76.field1320;
        if (arg0 < 36) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class149 var9 = var7[var8];
            if (var9 != null && var9.field2524 == 2) {
                class88.method631(arg5, 16329, (var9.field2525 - class311.field5271 << 7) + var9.field2523, (-class229.field3955 + var9.field2531 << 7) + var9.field2522, arg4, arg6 >> 1, var9.field2528 * 2, arg3 >> 1);
                if (class294.field5055 > -1 && class202.field3498 % 20 < 10) {
                    class317.field5351[var9.field2535].method327(class294.field5055 + arg1 - 12, arg2 + -28 + class73.field1287);
                }
            }
        }
        field3464++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[I", line = 73)
    public int[] method96(int arg0, int arg1) {
        field3455++;
        if (arg0 == -16221) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V", line = 85)
    public static void method1324(boolean arg0) {
        field3457 = null;
        if (!arg0) {
            field3460 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)V", line = 114)
    public final void method1325(int arg0, int arg1, int arg2) {
        field3448++;
        int var4 = this.field3454 == 255 ? arg2 : this.field3454;
        if (this.field3462) {
            this.field3456 = new class299(var4, arg2, arg0);
        } else {
            this.field3461 = new class276(var4, arg2, arg0);
        }
        if (arg1 != 4987) {
            this.field3456 = (class299) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V", line = 139)
    public static final void method1326(int arg0, boolean arg1) {
        class286 var2 = class48.method389(arg0, 3, 10738);
        var2.method2010((byte) -38);
        field3453++;
        if (arg1) {
            field3463 = false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)I", line = 151)
    public int method603(byte arg0) {
        if (arg0 == -25) {
            field3459++;
            return -1;
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 162)
    public void method223(int arg0) {
        if (arg0 != 11135) {
            method1324(true);
        }
        field3466++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)[[I", line = 174)
    public int[][] method101(int arg0, byte arg1) {
        int var3 = 121 % ((1 - arg1) / 37);
        field3469++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)I", line = 186)
    public int method527(byte arg0) {
        if (arg0 >= -43) {
            field3457 = (class258) null;
        }
        field3470++;
        return -1;
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(B)V", line = 209)
    public void method529(byte arg0) {
        if (this.field3462) {
            this.field3456.method2106(-9);
            this.field3456 = null;
        } else {
            this.field3461.method1940((byte) 73);
            this.field3461 = null;
        }
        field3450++;
        if (arg0 < 91) {
            this.method101(118, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(III)[I", line = 236)
    public final int[] method1327(int arg0, int arg1, int arg2) {
        if (arg1 > -110) {
            field3471 = 25;
        }
        field3452++;
        return this.field3468[arg0].field3462 ? this.field3468[arg0].method96(-16221, arg2) : this.field3468[arg0].method101(arg2, (byte) 96)[0];
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IZ)V", line = 262)
    public class197(int arg0, boolean arg1) {
        this.field3462 = arg1;
        this.field3468 = new class197[arg0];
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILva;I)V", line = 291)
    public void method98(int arg0, class235 arg1, int arg2) {
        field3458++;
        if (arg0 != 7955) {
            method1324(false);
        }
    }
}
