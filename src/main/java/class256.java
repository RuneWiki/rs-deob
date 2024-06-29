import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class256 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    private int field4144 = 0;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    private int field4152 = -1;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lab;")
    private class269 field4150 = new class269();

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
    public boolean field4163 = false;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    private int field4156;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    private int field4148;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[Lfb;")
    private class271[] field4161;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[[I")
    private int[][] field4145;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4146 = "Close";

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4153 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4154 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
    public static int[] field4160 = new int[100];

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field4159 = 0;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4143;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Lv;")
    public static final class228 method1749(int arg0, int arg1) {
        field4158++;
        class228 var2 = (class228) class81.field1004.method1693((long) arg0, arg1 ^ 0x6C);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class137.field2200.method928(class181.method1261((byte) -62, arg0), (byte) 110, class18.method94(arg0, arg1));
        class228 var4 = new class228();
        var4.field3697 = arg0;
        if (var3 != null) {
            var4.method1627((byte) -101, new class96(var3));
        }
        var4.method1630(-24023);
        if (var4.field3704) {
            var4.field3676 = 0;
            var4.field3653 = false;
        }
        if (!class263.field4251 && var4.field3682) {
            var4.field3705 = null;
        }
        class81.field1004.method1694(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)I")
    public static final int method1750(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 36) {
            method1753(-91, -57);
        }
        field4155++;
        if (arg1 >= arg2) {
            return arg1 <= arg3 ? arg1 : arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method1751(byte arg0) {
        field4154 = null;
        field4146 = null;
        if (arg0 > 59) {
            field4143 = null;
            field4160 = null;
            field4153 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)[[I")
    public final int[][] method1752(byte arg0) {
        int var2 = 11 / ((-arg0 - 16) / 58);
        field4162++;
        if (this.field4156 != this.field4148) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field4148; var3++) {
            this.field4161[var3] = class234.field3870;
        }
        return this.field4145;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Lkd;")
    public static final class108 method1753(int arg0, int arg1) {
        if (arg0 != -2) {
            method1753(44, -97);
        }
        field4157++;
        class108 var2 = (class108) class124.field1929.method1693((long) arg1, 79);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class95.field1208.method928(class51.method290(arg1, (byte) -11), (byte) 119, class200.method1394((byte) -65, arg1));
        class108 var4 = new class108();
        var4.field1467 = arg1;
        if (var3 != null) {
            var4.method655(17, new class96(var3));
        }
        var4.method660((byte) 105);
        if (var4.field1489 != -1) {
            var4.method661(method1753(-2, var4.field1501), method1753(-2, var4.field1489), arg0);
        }
        if (var4.field1456 != -1) {
            var4.method656(method1753(arg0, var4.field1456), 106, method1753(-2, var4.field1498));
        }
        if (!class85.field1053 && var4.field1476) {
            var4.field1510 = 0;
            var4.field1475 = class245.field4031;
            var4.field1491 = class239.field3944;
            var4.field1461 = false;
            var4.field1504 = class209.field3344;
        }
        class124.field1929.method1694(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method1754(int arg0) {
        if (arg0 != 0) {
            method1751((byte) -68);
        }
        field4151++;
        for (class117 var1 = (class117) class196.field3122.method1802(43); var1 != null; var1 = (class117) class196.field3122.method1815(0)) {
            class101 var2 = var1.field1657;
            if (class244.field4011 != var2.field1371 || var2.field1345 < class73.field924) {
                var1.method1673(14510);
            } else if (class73.field924 >= var2.field1343) {
                if (var2.field1334 > 0) {
                    class200 var3 = class265.field4273[var2.field1334 - 1];
                    if (var3 != null && var3.field3818 >= 0 && var3.field3818 < 13312 && var3.field3820 >= 0 && var3.field3820 < 13312) {
                        var2.method620(class73.field924, var3.field3818, class166.method1148(var2.field1371, var3.field3818, var3.field3820, (byte) 120) - var2.field1331, var3.field3820, (byte) 68);
                    }
                }
                if (var2.field1334 < 0) {
                    int var4 = -var2.field1334 - 1;
                    class259 var5;
                    if (class185.field2958 == var4) {
                        var5 = class286.field4571;
                    } else {
                        var5 = class89.field1113[var4];
                    }
                    if (var5 != null && var5.field3818 >= 0 && var5.field3818 < 13312 && var5.field3820 >= 0 && var5.field3820 < 13312) {
                        var2.method620(class73.field924, var5.field3818, class166.method1148(var2.field1371, var5.field3818, var5.field3820, (byte) 122) - var2.field1331, var5.field3820, (byte) 112);
                    }
                }
                var2.method617(class32.field427, (byte) 126);
                class28.method165(class244.field4011, (int) var2.field1336, (int) var2.field1369, (int) var2.field1333, 60, var2, var2.field1350, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)[I")
    public final int[] method1755(int arg0, byte arg1) {
        field4147++;
        if (arg1 < 95) {
            field4143 = null;
        }
        if (this.field4156 == this.field4148) {
            this.field4163 = this.field4161[arg0] == null;
            this.field4161[arg0] = class234.field3870;
            return this.field4145[arg0];
        } else if (this.field4148 == 1) {
            this.field4163 = this.field4152 != arg0;
            this.field4152 = arg0;
            return this.field4145[0];
        } else {
            class271 var3 = this.field4161[arg0];
            if (var3 == null) {
                this.field4163 = true;
                if (this.field4144 < this.field4148) {
                    var3 = new class271(arg0, this.field4144);
                    this.field4144++;
                } else {
                    class271 var4 = (class271) this.field4150.method1806(1);
                    var3 = new class271(arg0, var4.field4333);
                    this.field4161[var4.field4332] = null;
                    var4.method1673(14510);
                }
                this.field4161[arg0] = var3;
            } else {
                this.field4163 = false;
            }
            this.field4150.method1810(var3, (byte) -106);
            return this.field4145[var3.field4333];
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public final void method1756(boolean arg0) {
        field4149++;
        if (!arg0) {
            field4146 = null;
        }
        for (int var2 = 0; var2 < this.field4148; var2++) {
            this.field4145[var2] = null;
        }
        this.field4145 = null;
        this.field4161 = null;
        this.field4150.method1805(-729782270);
        this.field4150 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(III)V")
    public class256(int arg0, int arg1, int arg2) {
        this.field4156 = arg1;
        this.field4148 = arg0;
        this.field4161 = new class271[this.field4156];
        this.field4145 = new int[this.field4148][arg2];
    }
}
