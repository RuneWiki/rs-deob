import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class224 extends class24 {

    @OriginalMember(owner = "client!t", name = "s", descriptor = "[Lt;")
    public class224[] field3607;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Z")
    public boolean field3610;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "[Luf;")
    public static class168[] field3606 = new class168[100];

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field3611 = 0;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "J")
    public static long field3614 = 0L;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "[Luf;")
    public static class168[] field3625 = new class168[500];

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "Lof;")
    public class233 field3631;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Ldk;")
    public static class241 field3615;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lb;")
    public class268 field3613;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V", line = 11)
    public void method80(boolean arg0) {
        if (!arg0) {
            field3628++;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V", line = 22)
    public static void method1534(boolean arg0) {
        field3606 = null;
        if (arg0) {
            field3615 = (class241) null;
        }
        field3615 = null;
        field3625 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)[[I", line = 38)
    public final int[][] method1535(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            this.field3631 = (class233) null;
        }
        field3617++;
        if (this.field3607[arg0].field3610) {
            int[] var4 = this.field3607[arg0].method18((byte) -49, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3607[arg0].method17(arg2, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)I", line = 78)
    public int method1536(int arg0) {
        if (arg0 != -15899) {
            field3606 = (class168[]) null;
        }
        field3618++;
        return -1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)[I", line = 92)
    public int[] method18(byte arg0, int arg1) {
        int var3 = -14 / ((arg0 - 20) / 51);
        field3612++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V", line = 101)
    public void method1273(int arg0) {
        field3623++;
        if (this.field3610) {
            this.field3613.method1864(0);
            this.field3613 = null;
        } else {
            this.field3631.method1585((byte) -92);
            this.field3631 = null;
        }
        if (arg0 != -17545) {
            field3624 = -9;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(III)[I", line = 130)
    public final int[] method1537(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field3602++;
            return this.field3607[arg1].field3610 ? this.field3607[arg1].method18((byte) -43, arg0) : this.field3607[arg1].method17(arg0, (byte) -77)[0];
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(BI)V", line = 166)
    public static final void method1538(byte arg0, int arg1) {
        field3609++;
        if (arg0 != 126) {
            method1538((byte) -62, -85);
        }
        class26 var2 = class77.method455(1, -122, arg1);
        var2.method136(8);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)I", line = 179)
    public int method1275(byte arg0) {
        field3603++;
        if (arg0 != 119) {
            field3606 = (class168[]) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(Z)V", line = 194)
    public static final void method1539(boolean arg0) {
        class22.field275 = 0;
        class62.field824 = -1;
        class142.field2190 = 0;
        class153.field2407 = -1;
        class110.field1726 = 0;
        class76.field1032 = 0;
        field3627++;
        class121.field1888 = false;
        class151.field2348 = 0;
        class249.field4262.field2367 = 0;
        class166.field2671.field2367 = 0;
        class102.field1587 = -1;
        class268.field4525 = 0;
        class63.field847 = -1;
        for (int var1 = 0; var1 < class9.field117.length; var1++) {
            if (class9.field117[var1] != null) {
                class9.field117[var1].field3029 = -1;
            }
        }
        for (int var2 = 0; var2 < class190.field3065.length; var2++) {
            if (class190.field3065[var2] != null) {
                class190.field3065[var2].field3029 = -1;
            }
        }
        class276.method1904(32);
        class289.field4867 = 1;
        class109.method810(30, 8858);
        int var3 = 0;
        if (!arg0) {
            method1542((byte) 123);
        }
        while (var3 < 100) {
            class214.field3495[var3] = true;
            var3++;
        }
        class193.field3136.method453(255);
        class261.method1826(200);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ldk;Ldk;Z)V", line = 265)
    public static final void method1540(class241 arg0, class241 arg1, boolean arg2) {
        field3629++;
        class245.field4170 = class67.method380(arg0, arg1, 0, (byte) -53, class31.field384);
        class293.field4963 = class99.method741(class31.field384, arg1, arg0, -25, 0);
        if (!arg2) {
            method1542((byte) -12);
        }
        class283.field4781 = class67.method380(arg0, arg1, 0, (byte) -53, class17.field185);
        class102.field1588 = class67.method380(arg0, arg1, 0, (byte) -53, class159.field2504);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([Luf;IZ[SI)V", line = 281)
    public static final void method1541(class168[] arg0, int arg1, boolean arg2, short[] arg3, int arg4) {
        if (arg2) {
            field3614 = 69L;
        }
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            class168 var6 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var6;
            int var7 = arg1;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (var6 == null || arg0[var9] != null && arg0[var9].method1177(1, var6) < (var9 & 0x1)) {
                    class168 var10 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7++] = var11;
                }
            }
            arg0[arg4] = arg0[var7];
            arg0[var7] = var6;
            arg3[arg4] = arg3[var7];
            arg3[var7] = var8;
            method1541(arg0, arg1, false, arg3, var7 - 1);
            method1541(arg0, var7 + 1, false, arg3, arg4);
        }
        field3604++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)[[I", line = 337)
    public int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            this.field3631 = (class233) null;
        }
        field3619++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)V", line = 351)
    public static final void method1542(byte arg0) {
        field3622++;
        if (arg0 <= 124) {
            method1538((byte) 26, 59);
        }
        if (class159.field2509 != null) {
            class205 var1 = class159.field2509;
            synchronized (class159.field2509) {
                class159.field2509 = null;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIB)V", line = 371)
    public final void method1543(int arg0, int arg1, byte arg2) {
        field3605++;
        int var4 = this.field3630 == 255 ? arg1 : this.field3630;
        if (this.field3610) {
            this.field3613 = new class268(var4, arg1, arg0);
        } else {
            this.field3631 = new class233(var4, arg1, arg0);
        }
        if (arg2 != -118) {
            field3606 = (class168[]) null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLj;)V", line = 393)
    public void method19(int arg0, boolean arg1, class153 arg2) {
        field3626++;
        if (arg1) {
            method1542((byte) -23);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IZ)V", line = 403)
    public class224(int arg0, boolean arg1) {
        this.field3607 = new class224[arg0];
        this.field3610 = arg1;
    }
}
