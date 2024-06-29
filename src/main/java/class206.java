import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class206 {

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[Lbd;")
    private class334[] field3142;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    private int field3145;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lbi;")
    public static class104 field3141 = new class104(45, -1);

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Lj;")
    public static class235 field3149 = new class235("RC", 1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "J")
    private long field3140;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Lbd;")
    private class334 field3144;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method1406(int arg0) {
        if (arg0 != 0) {
            field3141 = null;
        }
        if (class357.field5545 == 1 || class357.field5545 == 3 || class357.field5545 != class149.field2001 && (class357.field5545 == 0 || class149.field2001 == 0)) {
            class378.field5815 = 0;
            class78.field1176 = 0;
            class365.field5659.method1128(56);
        }
        field3143++;
        class149.field2001 = class357.field5545;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JLbd;Z)V")
    public final void method1407(long arg0, class334 arg1, boolean arg2) {
        field3138++;
        if (arg1.field5228 != null) {
            arg1.method2219(0);
        }
        class334 var5 = this.field3142[(int) ((long) (this.field3145 - 1) & arg0)];
        arg1.field5228 = var5.field5228;
        arg1.field5224 = var5;
        arg1.field5228.field5224 = arg1;
        arg1.field5224.field5228 = arg1;
        arg1.field5226 = arg0;
        if (!arg2) {
            this.method1407(126L, null, true);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static final void method1408(int arg0) {
        field3147++;
        class406.field6138.method2120((byte) 27);
        int var1 = 113 / ((arg0 + 86) / 40);
        for (class140 var2 = (class140) class392.field5958.method2123(-68); var2 != null; var2 = (class140) class392.field5958.method2126((byte) 61)) {
            if (var2.field1894 < 1000) {
                var2.method3149(58);
                class406.field6138.method2124(var2, (byte) 96);
            }
        }
        class406.field6138.method2113((byte) -66, class392.field5958);
        int var3 = -1;
        class32 var4 = (class32) class513.field7612.method2123(54);
        if (var4 != null) {
            var3 = var4.method141((byte) -58);
        }
        if (!class409.field6204) {
            if (var3 == 0 && (class247.field4006 == 1 && class501.field7514 > 2 || class385.method2483(-92))) {
                var3 = 2;
            }
            if (var3 == 2 && class501.field7514 > 0 && var4 != null) {
                if (class477.field7309 == null && class160.field2192 == 0) {
                    class450.method2838((byte) 124, var4.method142(99), var4.method139(true));
                } else {
                    class103.field1514 = 2;
                }
            }
            if (var3 == 0 && class501.field7514 > 0) {
                class188.method1179((byte) 65);
            }
            if (class477.field7309 != null || class160.field2192 != 0) {
                return;
            }
            class419.field6352 = null;
            class103.field1514 = 0;
            return;
        }
        if (var3 == -1) {
            int var5 = class472.field7240.method2038(-49);
            int var6 = class472.field7240.method2043((byte) -120);
            if (var5 < class296.field4670 - 10 || (class296.field4670 + class201.field3054 + 10) < var5 || var6 < class521.field7715 - 10 || (class64.field1007 + class521.field7715 + 10) < var6) {
                class94.method643(15831);
            }
        }
        if (var3 != 0) {
            return;
        }
        int var7 = class296.field4670;
        int var8 = class521.field7715;
        int var9 = class201.field3054;
        int var10 = var4.method139(true);
        int var11 = var4.method142(85);
        int var12 = -1;
        for (int var13 = 0; var13 < class501.field7514; var13++) {
            if (class377.field5794) {
                int var18 = (class501.field7514 - var13 - 1) * 16 + var8 + 33;
                if (var10 > var7 && (var7 + var9) > var10 && var11 > var18 - 13 && var18 + 4 > var11) {
                    var12 = var13;
                }
            } else {
                int var17 = (class501.field7514 - var13 - 1) * 16 + var8 + 31;
                if (var7 < var10 && var10 < var7 + var9 && var11 > (var17 - 13) && var11 < var17 + 3) {
                    var12 = var13;
                }
            }
        }
        if (var12 != -1) {
            int var14 = 0;
            class450 var15 = new class450(class392.field5958);
            for (class140 var16 = (class140) var15.method2835(-1); var16 != null; var16 = (class140) var15.method2836((byte) -6)) {
                if (var12 == var14) {
                    class155.method944(0, var16, var10, var11);
                }
                var14++;
            }
        }
        class94.method643(15831);
        return;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void method1409(boolean arg0) {
        field3141 = null;
        field3149 = null;
        if (arg0) {
            field3141 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z")
    public static final boolean method1410(int arg0, int arg1, int arg2) {
        if (arg1 == -10454) {
            field3148++;
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Lbd;")
    public final class334 method1411(byte arg0) {
        if (arg0 <= 95) {
            return null;
        }
        field3139++;
        if (this.field3144 == null) {
            return null;
        }
        class334 var2 = this.field3142[(int) (this.field3140 & (long) (this.field3145 - 1))];
        while (this.field3144 != var2) {
            if (this.field3144.field5226 == this.field3140) {
                class334 var3 = this.field3144;
                this.field3144 = this.field3144.field5224;
                return var3;
            }
            this.field3144 = this.field3144.field5224;
        }
        this.field3144 = null;
        return null;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
    public class206(int arg0) {
        this.field3142 = new class334[arg0];
        this.field3145 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class334 var3 = this.field3142[var2] = new class334();
            var3.field5228 = var3;
            var3.field5224 = var3;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JB)Lbd;")
    public final class334 method1412(long arg0, byte arg1) {
        field3146++;
        this.field3140 = arg0;
        class334 var4 = this.field3142[(int) ((long) (this.field3145 - 1) & arg0)];
        for (this.field3144 = var4.field5224; this.field3144 != var4; this.field3144 = this.field3144.field5224) {
            if (this.field3144.field5226 == arg0) {
                class334 var5 = this.field3144;
                this.field3144 = this.field3144.field5224;
                return var5;
            }
        }
        this.field3144 = null;
        if (arg1 >= -8) {
            method1410(29, -122, 12);
        }
        return null;
    }
}
