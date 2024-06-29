import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class14 {

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    private int field177 = 0;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    private int field175 = -1;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "Lbh;")
    public static class18 field173 = new class18();

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "Lrc;")
    public static class155 field179 = new class155(64);

    @OriginalMember(owner = "client!af", name = "db", descriptor = "[I")
    public static int[] field183 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "Lea;")
    public static class38 field182 = class9.method46((byte) 102, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method31(int arg0, int arg1) {
        field180++;
        if (class86.field2005 == arg0) {
            return;
        }
        if (class86.field2005 == 0) {
            class37.method246((byte) -99);
        }
        if (arg0 == 20 || arg0 == 40) {
            class148.field3078 = 0;
            class59.field1473 = 0;
            class95.field2135 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class28.field554 != null) {
            class28.field554.method366((byte) -128);
            class28.field554 = null;
        }
        if (class86.field2005 == 25) {
            class178.field3603 = 0;
            class102.field2285 = 1;
            class177.field3594 = 0;
            class17.field358 = 1;
            client.field548 = 0;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class119.method916(class146.field3049, class51.field1313, -3473, class124.field2673);
        } else {
            class30.method189(-124);
        }
        class86.field2005 = arg0;
        if (arg1 != 27931) {
            method39(null, null, -66);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLhc;I)V")
    public final void method32(boolean arg0, class66 arg1, int arg2) {
        field167++;
        while (true) {
            int var4 = arg1.method509(122);
            if (var4 == 0) {
                if (arg0) {
                    return;
                } else {
                    field183 = null;
                    return;
                }
            }
            this.method34(var4, arg1, false, arg2);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IZ)V")
    private final void method33(int arg0, boolean arg1) {
        field168++;
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        if (var5 > var7) {
            var9 = var5;
        }
        double var11 = var7;
        if (var9 < var3) {
            var9 = var3;
        }
        if (var5 < var7) {
            var11 = var5;
        }
        if (var11 > var3) {
            var11 = var3;
        }
        double var13 = 0.0D;
        if (arg1) {
            this.method33(-37, false);
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field166 = (int) (var17 * 256.0D);
        if (this.field166 < 0) {
            this.field166 = 0;
        } else if (this.field166 > 255) {
            this.field166 = 255;
        }
        if (var9 != var11) {
            if (var7 == var9) {
                var13 = (var5 - var3) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var3 - var7) / (-var11 + var9) + 2.0D;
            } else if (var3 == var9) {
                var13 = (var7 - var5) / (-var11 + var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        if (var17 > 0.5D) {
            this.field170 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field170 = (int) (var15 * var17 * 512.0D);
        }
        double var19 = var13 / 6.0D;
        this.field178 = (int) (var15 * 256.0D);
        if (this.field170 < 1) {
            this.field170 = 1;
        }
        this.field176 = (int) ((double) this.field170 * var19);
        if (this.field178 < 0) {
            this.field178 = 0;
        } else if (this.field178 > 255) {
            this.field178 = 255;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILhc;ZI)V")
    private final void method34(int arg0, class66 arg1, boolean arg2, int arg3) {
        if (arg0 == 1) {
            this.field177 = arg1.method466(-26256544);
        } else if (arg0 == 2) {
            this.field175 = arg1.method511(-125);
            if (this.field175 == 65535) {
                this.field175 = -1;
            }
        }
        if (!arg2) {
            field174++;
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public static void method35(int arg0) {
        field183 = null;
        field179 = null;
        field182 = null;
        field173 = null;
        int var1 = -105 % ((arg0 - 78) / 33);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
    public static final int method36(int arg0, int arg1) {
        field171++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg1 != -696398748) {
            method41(false, null, -16, null);
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLea;)Z")
    public static final boolean method37(byte arg0, class38 arg1) {
        if (arg0 != -35) {
            field183 = null;
        }
        field163++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class43.field951; var2++) {
            if (arg1.method263(class43.field943[var2], (byte) 84)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(Z)V")
    public final void method38(boolean arg0) {
        field165++;
        this.method33(this.field177, arg0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ldd;Ldd;I)V")
    public static final void method39(class32 arg0, class32 arg1, int arg2) {
        if (arg2 > 113) {
            class38.field797 = arg1;
            field164++;
            class58.field1448 = arg0;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lef;I)Z")
    public static final boolean method40(class43 arg0, int arg1) {
        field169++;
        if (arg0.field981 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field981.length; var2++) {
            int var3 = class101.method828(-29842, var2, arg0);
            int var4 = arg0.field1062[var2];
            if (arg0.field981[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field981[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field981[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg1 != 4) {
            field182 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z[BILs;)V")
    public static final void method41(boolean arg0, byte[] arg1, int arg2, class161 arg3) {
        class36 var4 = new class36();
        field172++;
        var4.field754 = 0;
        var4.field753 = arg3;
        var4.field2172 = arg2;
        var4.field750 = arg1;
        class141 var5 = class188.field3756;
        synchronized (class188.field3756) {
            class188.field3756.method1014((byte) -107, var4);
        }
        class53.method384(arg0);
    }
}
