import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class92 extends class222 {

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "Llb;")
    public static class190 field1610 = new class190(128);

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "Lsb;")
    private static class98 field1618 = class47.method368("Prepared sound engine", 0);

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "Lsb;")
    public static class98 field1620 = field1618;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "[Lve;")
    public static class174[] field1621;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)V")
    public static final void method674(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -12659) {
            field1621 = null;
        }
        field1613++;
        class148 var4 = class157.method1138(arg0, (byte) -113, arg3);
        if (var4 != null && var4.field2625 != null) {
            class28 var5 = new class28();
            var5.field517 = var4;
            var5.field514 = var4.field2625;
            class192.method1327(var5, arg2 ^ 0xFFFCC3CD);
        }
        class56.field892 = true;
        class105.field1872 = arg0;
        class12.field236 = arg1;
        class202.field3438 = arg3;
        class72.method512(var4, arg2 + 12661);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[Lsb;)[Lsb;")
    public static final class98[] method675(int arg0, class98[] arg1) {
        field1615++;
        class98[] var2 = new class98[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class186.method1288(new class98[] { class125.method930(25904, var3), class214.field3650 }, 31618);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class186.method1288(new class98[] { var2[var3], arg1[var3] }, arg0 + 23859);
            }
        }
        if (arg0 != 7759) {
            field1610 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public static final void method676(int arg0) {
        field1617++;
        int var1 = class90.field1581.method521(class161.field2923);
        for (int var2 = arg0; var2 < class226.field3894; var2++) {
            int var6 = class90.field1581.method521(class36.method302(var2, 0));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class226.field3894 * 15 + 21;
        int var4 = class200.field3430;
        if (class180.field3111 < var4 + var3) {
            var4 = class180.field3111 - var3;
        }
        int var5 = class189.field3267 - (var1 / 2);
        if (class121.field2227 < var1 + var5) {
            var5 = class121.field2227 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class20.field362 == 1) {
            if (class189.field3267 == class157.field2859 && class200.field3430 == class112.field1998) {
                class41.field670 = class226.field3894 * 15 + 22;
                class81.field1434 = var5;
                class20.field362 = 0;
                class14.field258 = var1;
                class97.field1672 = true;
                class88.field1553 = var4;
            }
        } else if (class189.field3267 == class139.field2471 && class250.field4384 == class200.field3430) {
            class97.field1672 = true;
            class88.field1553 = var4;
            class14.field258 = var1;
            class20.field362 = 0;
            class41.field670 = class226.field3894 * 15 + 22;
            class81.field1434 = var5;
        } else {
            class20.field362 = 1;
            class157.field2859 = class139.field2471;
            class112.field1998 = class250.field4384;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(JB)Lsb;")
    public static final class98 method677(long arg0, byte arg1) {
        if (arg1 <= 27) {
            return null;
        } else {
            field1612++;
            return class161.method1168(10, false, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIZIIII)V")
    public static final void method678(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field1614++;
        class262 var10 = null;
        for (class262 var11 = (class262) class153.field2794.method371((byte) 61); var11 != null; var11 = (class262) class153.field2794.method370(true)) {
            if (var11.field4589 == arg9 && var11.field4593 == arg2 && var11.field4595 == arg4 && var11.field4598 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class262();
            var10.field4589 = arg9;
            var10.field4595 = arg4;
            var10.field4598 = arg6;
            var10.field4593 = arg2;
            class205.method1383(1115, var10);
            class153.field2794.method376((byte) 13, var10);
        }
        var10.field4604 = arg0;
        var10.field4608 = arg1;
        if (!arg5) {
            method680(false, (class98) null, false);
        }
        var10.field4601 = arg7;
        var10.field4605 = arg3;
        var10.field4607 = arg8;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
    public static void method679(int arg0) {
        if (arg0 != 250) {
            field1621 = null;
        }
        field1620 = null;
        field1618 = null;
        field1610 = null;
        field1621 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            return null;
        } else {
            field1611++;
            return class261.field4577;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLsb;Z)V")
    public static final void method680(boolean arg0, class98 arg1, boolean arg2) {
        field1616++;
        byte var3 = 4;
        int var4 = var3 + 6;
        if (!arg2) {
            method681(-83, -34, -93, 30, -58);
        }
        int var5 = class23.field471.method525(arg1, 250);
        int var6 = class23.field471.method537(arg1, 250) * 13;
        int var7 = var3 + 6;
        class128.method967(var4 - var3, -var3 + var7, var3 + var3 + var5, var3 + var6 + var3, 0);
        class128.method963(var4 - var3, -var3 + var7, var3 + var5 + var3, var3 + var6 + var3, 16777215);
        class23.field471.method520(arg1, var4, var7, var5, var6, 16777215, -1, 1, 1, 0);
        method681(-118, var7 - var3, var4 - var3, var3 + var6 + var3, var3 + var3 + var5);
        if (!arg0) {
            class15.method126(var4, var6, var5, -94, var7);
            return;
        }
        try {
            Graphics var8 = class85.field1504.getGraphics();
            class189.field3278.method241(false, var8, 0, 0);
        } catch (Exception var9) {
            class85.field1504.repaint();
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIIII)V")
    public static final void method681(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1622++;
        for (int var5 = 0; var5 < class120.field2215; var5++) {
            if ((class150.field2762[var5] + class119.field2132[var5]) > arg2 && class150.field2762[var5] < (arg2 + arg4) && arg1 < (class235.field4063[var5] + class11.field222[var5]) && arg1 + arg3 > class235.field4063[var5]) {
                class208.field3563[var5] = true;
            }
        }
        if (arg0 >= -103) {
            field1618 = null;
        }
    }
}
