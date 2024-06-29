import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class91 extends class76 {

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    private int field1740 = 585;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "[Lk;")
    public static class152[] field1735 = new class152[2048];

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "Lia;")
    public static class257 field1737 = class28.method234(92, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "[Z")
    public static boolean[] field1744 = new boolean[200];

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "Lia;")
    private static class257 field1743 = class28.method234(103, "Loading textures )2 ");

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "Lia;")
    public static class257 field1741 = field1743;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field1739;
        if (arg1 <= -86) {
            if (arg2 == 0) {
                this.field1740 = arg0.method1063(-17162);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLia;Lia;ILia;)V")
    public static final void method674(boolean arg0, class257 arg1, class257 arg2, int arg3, class257 arg4) {
        ++field1736;
        class115.method823(-1, arg2, arg3, arg1, -110, arg4);
        if (!arg0) {
            method677(-40);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public static final void method675(int arg0, int arg1, int arg2) {
        ++field1746;
        if (arg0 != 434406988) {
            method676(-61, 77);
        }
        if (~class96.field1807 != ~arg2) {
            class137.field2457 = new int[arg2];
            for (int var3 = 0; var3 < arg2; ++var3) {
                class137.field2457[var3] = (var3 << 12) / arg2;
            }
            class96.field1807 = arg2;
            class157.field2753 = arg2 + -1;
            class160.field2804 = ~arg2 == -65 ? 2048 : 4096;
        }
        if (class13.field249 != arg1) {
            if (~class96.field1807 == ~arg1) {
                class10.field197 = class137.field2457;
            } else {
                class10.field197 = new int[arg1];
                for (int var4 = 0; ~arg1 < ~var4; ++var4) {
                    class10.field197[var4] = (var4 << 12) / arg1;
                }
            }
            class105.field1950 = arg1 + -1;
            class13.field249 = arg1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field1745;
        if (arg0 != -9351) {
            field1741 = null;
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int var4 = class10.field197[arg1];
            for (int var5 = 0; var5 < class96.field1807; ++var5) {
                int var6 = class137.field2457[var5];
                if (var6 > this.field1740 && ~(-this.field1740 + 4096) < ~var6 && 2048 - this.field1740 < var4 && this.field1740 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1740 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (2048 - this.field1740 < var6 && var6 < this.field1740 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field1740;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1740);
                } else if (var4 >= this.field1740 && var4 <= -this.field1740 + 4096) {
                    if (var6 >= this.field1740 && ~var6 >= ~(-this.field1740 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1740 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field1740;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1740);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)Lcj;")
    public static final class134 method676(int arg0, int arg1) {
        ++field1738;
        class134 var2 = (class134) class21.field435.method836(-94, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class57.field1224.method1197(arg1, 4, -2);
            class134 var4 = new class134();
            if (var3 != null) {
                var4.method930(arg1, new class152(var3), (byte) -89);
            }
            class21.field435.method832(var4, (long) arg1, arg0 ^ arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "(I)V")
    public static void method677(int arg0) {
        if (arg0 > 76) {
            field1744 = null;
            field1741 = null;
            field1735 = null;
            field1743 = null;
            field1737 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lmb;I)V")
    public static final void method678(class178 arg0, int arg1) {
        if (arg1 >= -10) {
            field1744 = null;
        }
        ++field1742;
        class57.field1224 = arg0;
        class238.field4097 = class57.field1224.method1220((byte) -63, 4);
    }
}
