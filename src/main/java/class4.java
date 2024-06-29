import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class4 {

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    private int field46 = -1;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    private int field60 = 0;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lvf;")
    private class48 field57 = new class48();

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Z")
    public boolean field61 = false;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[[I")
    private int[][] field49;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[Lef;")
    private class169[] field59;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
    public static boolean field41 = false;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field47 = -1;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lsb;")
    public static class98 field54 = class47.method368("sch-Utteln:", 0);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "F")
    public static float field42;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public final void method14(byte arg0) {
        field45++;
        for (int var2 = 0; var2 < this.field50; var2++) {
            this.field49[var2] = null;
        }
        this.field59 = null;
        this.field49 = null;
        this.field57.method382(false);
        if (arg0 >= -117) {
            this.field46 = -2;
        }
        this.field57 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method15(int arg0) {
        if (arg0 != 8) {
            field41 = false;
        }
        field54 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILac;I)V")
    public static final void method16(int arg0, class188 arg1, int arg2) {
        int var3 = -47 % ((arg2 + 79) / 44);
        field43++;
        if (class112.field1991 == null) {
            class41.method332(255, true, true, (byte) 0, 255, (class188) null, 0);
            class183.field3149[arg0] = arg1;
        } else {
            class112.field1991.field3728 = arg0 * 8 + 5;
            int var4 = class112.field1991.method1442(-1330139880);
            int var5 = class112.field1991.method1442(-1330139880);
            arg1.method1298((byte) 18, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)[[I")
    public final int[][] method17(int arg0) {
        field55++;
        if (this.field50 != this.field44) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -12433) {
            method16(-84, (class188) null, 111);
        }
        for (int var2 = 0; var2 < this.field50; var2++) {
            this.field59[var2] = class41.field677;
        }
        return this.field49;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Lhf;")
    public static final class134 method18(byte arg0) {
        field48++;
        if (arg0 < 4) {
            field41 = false;
        }
        class134 var1 = (class134) class75.field1313.method129(0);
        if (var1 != null) {
            var1.method1611((byte) -128);
            var1.method1368((byte) 3);
            return var1;
        }
        class134 var2;
        do {
            var2 = (class134) class146.field2555.method129(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method1009(2) > class164.method1183((byte) 80)) {
                return null;
            }
            var2.method1611((byte) 53);
            var2.method1368((byte) 3);
        } while ((Long.MIN_VALUE & var2.field3439) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(JB)V")
    public static final void method19(long arg0, byte arg1) {
        if (arg1 != 103) {
            field41 = false;
        }
        field51++;
        if (arg0 != 0L) {
            class118.field2110++;
            class237.field4084.method490(145, -70);
            class237.field4084.method1484(arg0, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ltg;I)V")
    public static final void method20(class75 arg0, int arg1) {
        field56++;
        if (arg1 != -12792) {
            field47 = 120;
        }
        class144.field2539 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)I")
    public static final int method21(boolean arg0, int arg1) {
        if (arg0) {
            field52++;
            return arg1 >>> 8;
        } else {
            return 95;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        field53++;
        if (arg0 != 0) {
            this.method14((byte) -91);
        }
        if (this.field50 == this.field44) {
            this.field61 = this.field59[arg1] == null;
            this.field59[arg1] = class41.field677;
            return this.field49[arg1];
        } else if (this.field50 == 1) {
            this.field61 = this.field46 != arg1;
            this.field46 = arg1;
            return this.field49[0];
        } else {
            class169 var3 = this.field59[arg1];
            if (var3 == null) {
                this.field61 = true;
                if (this.field60 < this.field50) {
                    var3 = new class169(arg1, this.field60);
                    this.field60++;
                } else {
                    class169 var4 = (class169) this.field57.method373((byte) -114);
                    var3 = new class169(arg1, var4.field2993);
                    this.field59[var4.field2989] = null;
                    var4.method1611((byte) 11);
                }
                this.field59[arg1] = var3;
            } else {
                this.field61 = false;
            }
            this.field57.method378(var3, 0);
            return this.field49[var3.field2993];
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
    public static final void method23(int arg0, int arg1) {
        field58++;
        Container var2;
        if (class14.field263 != null) {
            var2 = class14.field263;
        } else if (class72.field1195 == null) {
            var2 = class119.field2145.field76;
        } else {
            var2 = class72.field1195;
        }
        class227.field3915 = var2.getSize().width;
        class265.field4638 = var2.getSize().height;
        if (class72.field1195 == var2) {
            Insets var3 = class72.field1195.getInsets();
            class265.field4638 -= var3.top + var3.bottom;
            class227.field3915 -= var3.left + var3.right;
        }
        if (arg0 >= -105) {
            return;
        }
        class121.field2227 = 765;
        class180.field3111 = 503;
        class216.field3692 = (class227.field3915 - 765) / 2;
        class87.field1551 = class217.field3740;
        class85.field1504.setSize(class121.field2227, class180.field3111);
        if (class72.field1195 == var2) {
            Insets var4 = class72.field1195.getInsets();
            class85.field1504.setLocation(class216.field3692 + var4.left, class87.field1551 + var4.top);
        } else {
            class85.field1504.setLocation(class216.field3692, class87.field1551);
        }
        if (class232.field3992 != -1) {
            class49.method386((byte) 60, true);
        }
        class254.method1755(-25291);
        if (class5.field80.startsWith("mac")) {
            class244.field4246 = (long) arg1 + class164.method1183((byte) 80);
        }
        class125.field2261 = (long) arg1 + class164.method1183((byte) 80);
        if (arg1 == 0 && class46.field774 != null && class249.field4370 == 30 || class249.field4370 == 25) {
            class32.method287((byte) -105);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(III)V")
    public class4(int arg0, int arg1, int arg2) {
        this.field44 = arg1;
        this.field50 = arg0;
        this.field49 = new int[this.field50][arg2];
        this.field59 = new class169[this.field44];
    }
}
