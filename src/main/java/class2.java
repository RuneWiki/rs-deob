import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BJGOYLYN")
public class class2 {

    @OriginalMember(owner = "client!BJGOYLYN", name = "c", descriptor = "I")
    private int field17 = 128;

    @OriginalMember(owner = "client!BJGOYLYN", name = "d", descriptor = "I")
    public int field18 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "e", descriptor = "Z")
    public boolean field19 = false;

    @OriginalMember(owner = "client!BJGOYLYN", name = "g", descriptor = "I")
    public int field21 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "i", descriptor = "Z")
    public boolean field23 = true;

    @OriginalMember(owner = "client!BJGOYLYN", name = "j", descriptor = "I")
    public int field24 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "l", descriptor = "J")
    public long field26 = -1L;

    @OriginalMember(owner = "client!BJGOYLYN", name = "m", descriptor = "Z")
    private boolean field27 = false;

    @OriginalMember(owner = "client!BJGOYLYN", name = "o", descriptor = "B")
    public byte field29 = 1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "p", descriptor = "Ljava/lang/String;")
    public String field30 = "null";

    @OriginalMember(owner = "client!BJGOYLYN", name = "q", descriptor = "I")
    public int field31 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "s", descriptor = "I")
    public int field33 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "u", descriptor = "I")
    public int field35 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "y", descriptor = "I")
    public int field39 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "z", descriptor = "I")
    public int field40 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "B", descriptor = "I")
    public int field42 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "C", descriptor = "Z")
    public boolean field43 = true;

    @OriginalMember(owner = "client!BJGOYLYN", name = "D", descriptor = "I")
    public int field44 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "E", descriptor = "I")
    private int field45 = 128;

    @OriginalMember(owner = "client!BJGOYLYN", name = "G", descriptor = "I")
    private int field47 = 45895;

    @OriginalMember(owner = "client!BJGOYLYN", name = "H", descriptor = "I")
    public int field48 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "I", descriptor = "I")
    public int field49 = -1;

    @OriginalMember(owner = "client!BJGOYLYN", name = "K", descriptor = "I")
    public int field51 = 32;

    @OriginalMember(owner = "client!BJGOYLYN", name = "w", descriptor = "LDSCQIAPU;")
    public static class8 field37 = new class8(401, 30);

    @OriginalMember(owner = "client!BJGOYLYN", name = "h", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!BJGOYLYN", name = "r", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!BJGOYLYN", name = "F", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "client!BJGOYLYN", name = "J", descriptor = "I")
    private static int field50;

    @OriginalMember(owner = "client!BJGOYLYN", name = "n", descriptor = "LWNCFPLWV;")
    private static class63 field28;

    @OriginalMember(owner = "client!BJGOYLYN", name = "b", descriptor = "Lclient;")
    public static client field16;

    @OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "[B")
    public byte[] field15;

    @OriginalMember(owner = "client!BJGOYLYN", name = "f", descriptor = "[I")
    private int[] field20;

    @OriginalMember(owner = "client!BJGOYLYN", name = "v", descriptor = "[I")
    private int[] field36;

    @OriginalMember(owner = "client!BJGOYLYN", name = "x", descriptor = "[I")
    public int[] field38;

    @OriginalMember(owner = "client!BJGOYLYN", name = "A", descriptor = "[I")
    private int[] field41;

    @OriginalMember(owner = "client!BJGOYLYN", name = "L", descriptor = "[I")
    private static int[] field52;

    @OriginalMember(owner = "client!BJGOYLYN", name = "M", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "client!BJGOYLYN", name = "k", descriptor = "[LBJGOYLYN;")
    private static class2[] field25;

    @OriginalMember(owner = "client!BJGOYLYN", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field34;

    @OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(Z)Z")
    public boolean method1(boolean arg0) {
        if (this.field38 == null) {
            return true;
        }
        int var2 = -1;
        if (!arg0) {
            this.field47 = -291;
        }
        if (this.field21 != -1) {
            class60 var3 = class60.field1530[this.field21];
            int var4 = var3.field1532;
            int var5 = var3.field1533;
            int var6 = var3.field1534;
            int var7 = client.field114[var6 - var5];
            var2 = field16.field534[var4] >> var5 & var7;
        } else if (this.field35 != -1) {
            var2 = field16.field534[this.field35];
        }
        return var2 >= 0 && var2 < this.field38.length && this.field38[var2] != -1;
    }

    @OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(I[IIZ)LUNLYQRUD;")
    public final class56 method2(int arg0, int[] arg1, int arg2, boolean arg3) {
        if (this.field38 != null) {
            class2 var5 = this.method6(324);
            return var5 == null ? null : var5.method2(arg0, arg1, arg2, false);
        }
        class56 var6 = (class56) field37.method179(this.field26);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field41.length; var8++) {
                if (!class56.method443(this.field41[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class56[] var9 = new class56[this.field41.length];
            for (int var10 = 0; var10 < this.field41.length; var10++) {
                var9[var10] = class56.method442(this.field41[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class56(var9.length, var9, 0);
            }
            if (this.field53 != null) {
                for (int var11 = 0; var11 < this.field53.length; var11++) {
                    var6.method456(this.field53[var11], this.field20[var11]);
                }
            }
            var6.method449(956);
            var6.method459(this.field32 + 64, this.field46 + 850, -30, -50, -30, true);
            field37.method180(true, var6, this.field26);
        }
        class56 var12 = class56.field1430;
        if (arg3) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        var12.method444(class6.method178(arg2, 688) & class6.method178(arg0, 688), this.field47, var6);
        if (arg2 != -1 && arg0 != -1) {
            var12.method451(arg0, -164, arg2, arg1);
        } else if (arg2 != -1) {
            var12.method450(936, arg2);
        }
        if (this.field17 != 128 || this.field45 != 128) {
            var12.method458(this.field17, this.field45, false, this.field17);
        }
        var12.method446(19419);
        var12.field1466 = null;
        var12.field1465 = null;
        if (this.field29 == 1) {
            var12.field1467 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(I)V")
    public static final void method3(int arg0) {
        field37 = null;
        if (arg0 == 0) {
            field52 = null;
            field25 = null;
            field28 = null;
        }
    }

    @OriginalMember(owner = "client!BJGOYLYN", name = "b", descriptor = "(I)LBJGOYLYN;")
    public static final class2 method4(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field25[var1].field26) {
                return field25[var1];
            }
        }
        field50 = (field50 + 1) % 20;
        class2 var2 = field25[field50] = new class2();
        field28.field1571 = field52[arg0];
        var2.field26 = arg0;
        var2.method5(-934, field28);
        return var2;
    }

    @OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(ILWNCFPLWV;)V")
    private final void method5(int arg0, class63 arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method502();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method502();
                    this.field41 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field41[var5] = arg1.method504();
                    }
                } else if (var3 == 2) {
                    this.field30 = arg1.method509();
                } else if (var3 == 3) {
                    this.field15 = arg1.method510(-34529);
                } else if (var3 == 12) {
                    this.field29 = arg1.method503();
                } else if (var3 == 13) {
                    this.field40 = arg1.method504();
                } else if (var3 == 14) {
                    this.field24 = arg1.method504();
                } else if (var3 == 17) {
                    this.field24 = arg1.method504();
                    this.field39 = arg1.method504();
                    this.field18 = arg1.method504();
                    this.field48 = arg1.method504();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field34 == null) {
                        this.field34 = new String[5];
                    }
                    this.field34[var3 - 30] = arg1.method509();
                    if (this.field34[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field34[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method502();
                    this.field53 = new int[var6];
                    this.field20 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field53[var7] = arg1.method504();
                        this.field20[var7] = arg1.method504();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method502();
                    this.field36 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field36[var9] = arg1.method504();
                    }
                } else if (var3 == 90) {
                    this.field31 = arg1.method504();
                } else if (var3 == 91) {
                    this.field49 = arg1.method504();
                } else if (var3 == 92) {
                    this.field33 = arg1.method504();
                } else if (var3 == 93) {
                    this.field43 = false;
                } else if (var3 == 95) {
                    this.field42 = arg1.method504();
                } else if (var3 == 97) {
                    this.field17 = arg1.method504();
                } else if (var3 == 98) {
                    this.field45 = arg1.method504();
                } else if (var3 == 99) {
                    this.field19 = true;
                } else if (var3 == 100) {
                    this.field32 = arg1.method503();
                } else if (var3 == 101) {
                    this.field46 = arg1.method503() * 5;
                } else if (var3 == 102) {
                    this.field44 = arg1.method504();
                } else if (var3 == 103) {
                    this.field51 = arg1.method504();
                } else if (var3 == 106) {
                    this.field21 = arg1.method504();
                    if (this.field21 == 65535) {
                        this.field21 = -1;
                    }
                    this.field35 = arg1.method504();
                    if (this.field35 == 65535) {
                        this.field35 = -1;
                    }
                    int var10 = arg1.method502();
                    this.field38 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field38[var11] = arg1.method504();
                        if (this.field38[var11] == 65535) {
                            this.field38[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field23 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!BJGOYLYN", name = "c", descriptor = "(I)LBJGOYLYN;")
    public final class2 method6(int arg0) {
        int var2 = -1;
        if (arg0 <= 0) {
            this.field27 = !this.field27;
        }
        if (this.field21 != -1) {
            class60 var3 = class60.field1530[this.field21];
            int var4 = var3.field1532;
            int var5 = var3.field1533;
            int var6 = var3.field1534;
            int var7 = client.field114[var6 - var5];
            var2 = field16.field534[var4] >> var5 & var7;
        } else if (this.field35 != -1) {
            var2 = field16.field534[this.field35];
        }
        return var2 < 0 || var2 >= this.field38.length || this.field38[var2] == -1 ? null : method4(this.field38[var2]);
    }

    @OriginalMember(owner = "client!BJGOYLYN", name = "d", descriptor = "(I)LUNLYQRUD;")
    public final class56 method7(int arg0) {
        while (arg0 >= 0) {
            this.field27 = !this.field27;
        }
        if (this.field38 != null) {
            class2 var2 = this.method6(324);
            if (var2 == null) {
                return null;
            } else {
                return var2.method7(-748);
            }
        } else if (this.field36 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field36.length; var4++) {
                if (!class56.method443(this.field36[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class56[] var5 = new class56[this.field36.length];
            for (int var6 = 0; var6 < this.field36.length; var6++) {
                var5[var6] = class56.method442(this.field36[var6]);
            }
            class56 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class56(var5.length, var5, 0);
            }
            if (this.field53 != null) {
                for (int var8 = 0; var8 < this.field53.length; var8++) {
                    var7.method456(this.field53[var8], this.field20[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!BJGOYLYN", name = "a", descriptor = "(LRPFMUSNN;)V")
    public static final void method8(class49 arg0) {
        field28 = new class63((byte) -58, arg0.method414("npc.dat", null));
        class63 var1 = new class63((byte) -58, arg0.method414("npc.idx", null));
        field22 = var1.method504();
        field52 = new int[field22];
        int var2 = 2;
        for (int var3 = 0; var3 < field22; var3++) {
            field52[var3] = var2;
            var2 += var1.method504();
        }
        field25 = new class2[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field25[var4] = new class2();
        }
    }
}
