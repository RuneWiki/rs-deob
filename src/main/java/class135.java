import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class135 implements class267 {

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lvi;")
    private class368 field1859 = new class368(256);

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lla;")
    private class423 field1855;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lla;")
    private class423 field1850;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    private int field1860;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "[Lkv;")
    private class679[] field1857;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "J")
    public static long field1854 = -1L;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lmr;")
    public static class611 field1856 = new class611();

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 15)
    public static void method959(byte arg0) {
        if (arg0 <= 108) {
            field1856 = null;
        }
        field1856 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 25)
    public static final void method960(int arg0) {
        if (class375.field5435 != null) {
            class375.field5435.method2235(arg0 + 30597);
        }
        field1858++;
        if (class224.field3310 != null) {
            class224.field3310.method2235(30597);
        }
        if (arg0 != 0) {
            field1854 = 10L;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZFIIB)[F", line = 44)
    public final float[] method961(int arg0, boolean arg1, float arg2, int arg3, int arg4, byte arg5) {
        if (arg5 < 9) {
            this.field1857 = null;
        }
        field1852++;
        return this.method968(8211, arg0).method978(arg4, arg3, 0, this, this.field1850, this.field1857[arg0].field9644);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lkv;", line = 60)
    public final class679 method962(int arg0, int arg1) {
        if (arg1 != 2904) {
            this.method963((byte) -78, 52);
        }
        field1861++;
        return this.field1857[arg0];
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Z", line = 74)
    public final boolean method963(byte arg0, int arg1) {
        if (arg0 != 41) {
            method967(-50);
        }
        field1847++;
        class138 var3 = this.method968(8211, arg1);
        return var3 != null && var3.method980(this.field1850, 31562, this);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZIIIF)[I", line = 87)
    public final int[] method964(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        field1851++;
        int var7 = 20 / ((-arg0 - 10) / 60);
        return this.method968(8211, arg3).method977((byte) -7, this, this.field1857[arg3].field9644, (double) arg5, arg1, this.field1850, arg4, arg2);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)I", line = 97)
    public static final int method965(int arg0, int arg1) {
        return class346.field4951 == null ? 0 : class346.field4951[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZFIZI)[I", line = 103)
    public final int[] method966(int arg0, boolean arg1, float arg2, int arg3, boolean arg4, int arg5) {
        if (arg1) {
            this.method962(84, 9);
        }
        field1848++;
        return this.method968(8211, arg5).method976(arg0, arg3, (double) arg2, this.field1857[arg5].field9644, this, this.field1850, true);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 114)
    public static final void method967(int arg0) {
        if (arg0 == 0) {
            if (class482.field6920 == 2) {
                class186.field2604[0].method827(class618.field8804[0]);
                class186.field2604[1].method827(class618.field8804[1]);
            } else if (class482.field6920 == 3) {
                class186.field2604[0].method827(class618.field8804[0]);
                class186.field2604[1].method827(class618.field8804[1]);
                class186.field2604[2].method827(class618.field8804[2]);
            } else {
                class186.field2604[0].method827(class618.field8804[0]);
                class186.field2604[1].method827(class618.field8804[1]);
                class186.field2604[2].method827(class618.field8804[2]);
                class186.field2604[3].method827(class618.field8804[3]);
            }
        } else if (arg0 == 1) {
            if (class482.field6920 == 2) {
                class186.field2604[0].method827(class618.field8804[2]);
            } else if (class482.field6920 == 3) {
                class186.field2604[0].method827(class618.field8804[3]);
                class186.field2604[1].method827(class618.field8804[4]);
            } else {
                class186.field2604[0].method827(class618.field8804[4]);
                class186.field2604[1].method827(class618.field8804[5]);
                class186.field2604[2].method827(class618.field8804[6]);
            }
        } else if (arg0 == 2) {
            if (class482.field6920 == 2) {
                class186.field2604[0].method827(class618.field8804[3]);
                return;
            }
            if (class482.field6920 == 3) {
                class186.field2604[0].method827(class618.field8804[5]);
                return;
            }
            class186.field2604[0].method827(class618.field8804[7]);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)Llg;", line = 184)
    private final class138 method968(int arg0, int arg1) {
        if (arg0 != 8211) {
            return null;
        }
        field1849++;
        class388 var3 = this.field1859.method2311((long) arg1, (byte) -110);
        if (var3 != null) {
            return (class138) var3;
        }
        byte[] var4 = this.field1855.method2611((byte) -97, arg1);
        if (var4 == null) {
            return null;
        } else {
            class138 var5 = new class138(new class479(var4));
            this.field1859.method2313((long) arg1, var5, (byte) -38);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lla;Lla;Lla;)V", line = 223)
    public class135(class423 arg0, class423 arg1, class423 arg2) {
        this.field1855 = arg1;
        this.field1850 = arg2;
        class479 var4 = new class479(arg0.method2600(0, 0, 0));
        this.field1860 = var4.method2882(-1);
        this.field1857 = new class679[this.field1860];
        for (int var5 = 0; var5 < this.field1860; var5++) {
            if (var4.method2886(true) == 1) {
                this.field1857[var5] = new class679();
            }
        }
        for (int var6 = 0; var6 < this.field1860; var6++) {
            if (this.field1857[var6] != null) {
                this.field1857[var6].field9639 = var4.method2886(true) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field1860; var7++) {
            if (this.field1857[var7] != null) {
                this.field1857[var7].field9636 = var4.method2886(true) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field1860; var8++) {
            if (this.field1857[var8] != null) {
                this.field1857[var8].field9652 = var4.method2886(true) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field1860; var9++) {
            if (this.field1857[var9] != null) {
                this.field1857[var9].field9651 = var4.method2915(-123);
            }
        }
        for (int var10 = 0; var10 < this.field1860; var10++) {
            if (this.field1857[var10] != null) {
                this.field1857[var10].field9637 = var4.method2915(-105);
            }
        }
        for (int var11 = 0; var11 < this.field1860; var11++) {
            if (this.field1857[var11] != null) {
                this.field1857[var11].field9648 = var4.method2915(-119);
            }
        }
        for (int var12 = 0; var12 < this.field1860; var12++) {
            if (this.field1857[var12] != null) {
                this.field1857[var12].field9646 = var4.method2915(-128);
            }
        }
        for (int var13 = 0; var13 < this.field1860; var13++) {
            if (this.field1857[var13] != null) {
                this.field1857[var13].field9631 = (short) var4.method2882(-1);
            }
        }
        for (int var14 = 0; var14 < this.field1860; var14++) {
            if (this.field1857[var14] != null) {
                this.field1857[var14].field9638 = var4.method2915(-101);
            }
        }
        for (int var15 = 0; var15 < this.field1860; var15++) {
            if (this.field1857[var15] != null) {
                this.field1857[var15].field9640 = var4.method2915(-104);
            }
        }
        for (int var16 = 0; var16 < this.field1860; var16++) {
            if (this.field1857[var16] != null) {
                this.field1857[var16].field9630 = var4.method2886(true) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field1860; var17++) {
            if (this.field1857[var17] != null) {
                this.field1857[var17].field9644 = var4.method2886(true) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field1860; var18++) {
            if (this.field1857[var18] != null) {
                this.field1857[var18].field9634 = var4.method2915(-117);
            }
        }
        for (int var19 = 0; var19 < this.field1860; var19++) {
            if (this.field1857[var19] != null) {
                this.field1857[var19].field9641 = var4.method2886(true) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field1860; var20++) {
            if (this.field1857[var20] != null) {
                this.field1857[var20].field9635 = var4.method2886(true) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field1860; var21++) {
            if (this.field1857[var21] != null) {
                this.field1857[var21].field9642 = var4.method2886(true) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field1860; var22++) {
            if (this.field1857[var22] != null) {
                this.field1857[var22].field9649 = var4.method2886(true);
            }
        }
        for (int var23 = 0; var23 < this.field1860; var23++) {
            if (this.field1857[var23] != null) {
                this.field1857[var23].field9645 = var4.method2868(-109);
            }
        }
        for (int var24 = 0; var24 < this.field1860; var24++) {
            if (this.field1857[var24] != null) {
                this.field1857[var24].field9632 = var4.method2886(true);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I", line = 213)
    public final int method969(byte arg0) {
        if (arg0 < 51) {
            method959((byte) -99);
        }
        field1853++;
        return this.field1860;
    }
}
