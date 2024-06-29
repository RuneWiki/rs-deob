import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class54 {

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    private int field967 = 0;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    private int field972 = -1;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lka;")
    private class243 field965 = new class243();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Z")
    public boolean field979 = false;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[[[I")
    private int[][][] field978;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[Lea;")
    private class36[] field974;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lhj;")
    public static class69 field977 = class181.method1318("floorshadows", (byte) -116);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lhj;")
    public static class69 field958 = class181.method1318(":", (byte) -110);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lvh;")
    public static class260 field959;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[Lqb;")
    public static class56[] field970;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[Lhj;")
    public static class69[] field963;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
    public static final boolean method316(int arg0, int arg1) {
        field976++;
        if (arg1 != -3853) {
            return false;
        } else if (class228.field4169 == arg0) {
            class228.field4169++;
            class49.field705 = true;
            if (class228.field4169 > 65535) {
                class228.field4169 = 0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILnc;Lnc;)V")
    public static final void method317(int arg0, class83 arg1, class83 arg2) {
        field975++;
        class194.field3532 = arg2;
        class156.field2909 = arg1;
        class201.field3643 = class194.field3532.method594(arg0, (byte) 120);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method318(int arg0) {
        field961++;
        if (this.field964 != this.field960) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 <= 44) {
            return null;
        }
        while (var2 < this.field964) {
            this.field974[var2] = class245.field4483;
            var2++;
        }
        return this.field978;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static void method319(int arg0) {
        field970 = null;
        field963 = null;
        field958 = null;
        field977 = null;
        if (arg0 == 8968) {
            field959 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[[I")
    public final int[][] method320(int arg0, byte arg1) {
        if (arg1 > -6) {
            return null;
        }
        field971++;
        if (this.field964 == this.field960) {
            this.field979 = this.field974[arg0] == null;
            this.field974[arg0] = class245.field4483;
            return this.field978[arg0];
        } else if (this.field964 == 1) {
            this.field979 = this.field972 != arg0;
            this.field972 = arg0;
            return this.field978[0];
        } else {
            class36 var3 = this.field974[arg0];
            if (var3 == null) {
                this.field979 = true;
                if (this.field964 <= this.field967) {
                    class36 var4 = (class36) this.field965.method1729(7113);
                    var3 = new class36(arg0, var4.field495);
                    this.field974[var4.field502] = null;
                    var4.method632(-8296);
                } else {
                    var3 = new class36(arg0, this.field967);
                    this.field967++;
                }
                this.field974[arg0] = var3;
            } else {
                this.field979 = false;
            }
            this.field965.method1730(var3, (byte) 56);
            return this.field978[var3.field495];
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public static final void method321(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class66.field1275; var3++) {
            for (int var4 = 0; var4 < class109.field2091; var4++) {
                for (int var5 = 0; var5 < class146.field2694; var5++) {
                    class217 var6 = class158.field2935[var3][var4][var5];
                    if (var6 != null) {
                        class118 var7 = var6.field3932;
                        if (var7 != null && var7.field2235.method512()) {
                            class41.method227(var7.field2235, var3, var4, var5, 1, 1);
                            if (var7.field2227 != null && var7.field2227.method512()) {
                                class41.method227(var7.field2227, var3, var4, var5, 1, 1);
                                var7.field2235.method522(var7.field2227, 0, 0, 0, false);
                                var7.field2227 = var7.field2227.method517(arg0, arg1, arg2);
                            }
                            var7.field2235 = var7.field2235.method517(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3940; var8++) {
                            class85 var10 = var6.field3933[var8];
                            if (var10 != null && var10.field1660.method512()) {
                                class41.method227(var10.field1660, var3, var4, var5, var10.field1651 + 1 - var10.field1662, var10.field1655 - var10.field1653 + 1);
                                var10.field1660 = var10.field1660.method517(arg0, arg1, arg2);
                            }
                        }
                        class68 var9 = var6.field3949;
                        if (var9 != null && var9.field1288.method512()) {
                            class22.method124(var9.field1288, var3, var4, var5);
                            var9.field1288 = var9.field1288.method517(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
    public static final void method322(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field968++;
        if (arg1 >= class19.field252 && arg1 <= class166.field3075) {
            int var5 = class240.method1700(class35.field485, arg0, 126, class201.field3629);
            int var6 = class240.method1700(class35.field485, arg4, -63, class201.field3629);
            class104.method775(arg2, var6, arg1, 16870, var5);
        }
        if (arg3 >= -114) {
            field970 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public final void method323(byte arg0) {
        field973++;
        for (int var2 = 0; var2 < this.field964; var2++) {
            this.field978[var2][0] = null;
            this.field978[var2][1] = null;
            this.field978[var2][2] = null;
            this.field978[var2] = null;
        }
        if (arg0 != 12) {
            this.field974 = null;
        }
        this.field974 = null;
        this.field978 = null;
        this.field965.method1732(106);
        this.field965 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V")
    public class54(int arg0, int arg1, int arg2) {
        this.field964 = arg0;
        this.field960 = arg1;
        this.field978 = new int[this.field964][3][arg2];
        this.field974 = new class36[this.field960];
    }
}
