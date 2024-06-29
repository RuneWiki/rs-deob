import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class382 {

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    private int field5577 = 0;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[Lnr;")
    public class97[] field5565;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public int field5560;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Lnn;")
    public static class151 field5572 = new class151("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field5579 = 0;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Lpf;")
    public static class425 field5578 = new class425(74, 2);

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field5580 = -60;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "J")
    private long field5563;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Lnr;")
    private class97 field5566;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Lnr;")
    private class97 field5574;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lnr;")
    public final class97 method2296(int arg0) {
        this.field5577 = 0;
        field5562++;
        if (arg0 != 5773) {
            this.field5566 = null;
        }
        return this.method2304(100);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)I")
    public final int method2297(boolean arg0) {
        if (arg0) {
            this.method2304(-85);
        }
        field5573++;
        return this.field5560;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Lnr;")
    public final class97 method2298(byte arg0) {
        field5571++;
        if (this.field5566 == null) {
            return null;
        }
        class97 var2 = this.field5565[(int) (this.field5563 & (long) (this.field5560 - 1))];
        while (this.field5566 != var2) {
            if (this.field5566.field1339 == this.field5563) {
                class97 var4 = this.field5566;
                this.field5566 = this.field5566.field1331;
                return var4;
            }
            this.field5566 = this.field5566.field1331;
        }
        this.field5566 = null;
        int var3 = -8 / ((-arg0 - 48) / 50);
        return null;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)I")
    public static final int method2299(boolean arg0) {
        field5570++;
        class261 var1 = class196.field2965;
        boolean var2 = arg0;
        if (class405.field6032 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class261.method1619(!arg0, var3, (class239) null, 0, (class96) null, 0);
            var2 = true;
        }
        long var4 = class445.method2750(-27580);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method375(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class445.method2750(-27580) - var4);
        var1.method1615(100, -16777216, 100, 0, 0, (byte) -119);
        if (var2) {
            var1.method1617((byte) -37);
        }
        return var7;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([Lnr;Z)I")
    public final int method2300(class97[] arg0, boolean arg1) {
        if (!arg1) {
            this.method2301(29, (class97) null, -127L);
        }
        field5568++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5560; var4++) {
            class97 var5 = this.field5565[var4];
            for (class97 var6 = var5.field1331; var6 != var5; var6 = var6.field1331) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILnr;J)V")
    public final void method2301(int arg0, class97 arg1, long arg2) {
        if (arg1.field1336 != null) {
            arg1.method625((byte) -50);
        }
        field5564++;
        class97 var5 = this.field5565[(int) ((long) (this.field5560 - 1) & arg2)];
        arg1.field1336 = var5.field1336;
        arg1.field1331 = var5;
        if (arg0 <= 13) {
            this.method2301(-16, (class97) null, 66L);
        }
        arg1.field1336.field1331 = arg1;
        arg1.field1331.field1336 = arg1;
        arg1.field1339 = arg2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(JI)Lnr;")
    public final class97 method2302(long arg0, int arg1) {
        this.field5563 = arg0;
        field5575++;
        class97 var4 = this.field5565[(int) ((long) (this.field5560 - 1) & arg0)];
        if (arg1 != 23576) {
            this.method2301(107, (class97) null, -30L);
        }
        for (this.field5566 = var4.field1331; this.field5566 != var4; this.field5566 = this.field5566.field1331) {
            if (this.field5566.field1339 == arg0) {
                class97 var5 = this.field5566;
                this.field5566 = this.field5566.field1331;
                return var5;
            }
        }
        this.field5566 = null;
        return null;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public static final void method2303(int arg0) {
        field5579 = arg0;
        for (int var1 = 0; var1 < class275.field4206; var1++) {
            for (int var2 = 0; var2 < class265.field4044; var2++) {
                if (class277.field4216[arg0][var1][var2] == null) {
                    class277.field4216[arg0][var1][var2] = new class13(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
    public class382(int arg0) {
        this.field5565 = new class97[arg0];
        this.field5560 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class97 var3 = this.field5565[var2] = new class97();
            var3.field1331 = var3;
            var3.field1336 = var3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)Lnr;")
    public final class97 method2304(int arg0) {
        field5561++;
        if (this.field5577 > 0 && this.field5565[this.field5577 - 1] != this.field5574) {
            class97 var2 = this.field5574;
            this.field5574 = var2.field1331;
            return var2;
        }
        while (this.field5577 < this.field5560) {
            class97 var3 = this.field5565[this.field5577++].field1331;
            if (this.field5565[this.field5577 - 1] != var3) {
                this.field5574 = var3.field1331;
                return var3;
            }
        }
        if (arg0 != 100) {
            field5580 = -18;
        }
        return null;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)I")
    public final int method2305(int arg0) {
        int var2 = -24 % ((-arg0 - 79) / 46);
        field5567++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5560; var4++) {
            class97 var5 = this.field5565[var4];
            class97 var6 = var5.field1331;
            while (var5 != var6) {
                var6 = var6.field1331;
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(Z)V")
    public static void method2306(boolean arg0) {
        field5572 = null;
        field5578 = null;
        if (arg0) {
            method2308(-102, 84);
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
    public final void method2307(int arg0) {
        field5576++;
        for (int var2 = 0; var2 < this.field5560; var2++) {
            class97 var3 = this.field5565[var2];
            while (true) {
                class97 var4 = var3.field1331;
                if (var3 == var4) {
                    break;
                }
                var4.method625((byte) -50);
            }
        }
        if (arg0 != 5142) {
            this.field5566 = null;
        }
        this.field5566 = null;
        this.field5574 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
    public static final void method2308(int arg0, int arg1) {
        class241 var2 = class398.field5938;
        synchronized (class398.field5938) {
            if (arg1 != 0) {
                field5572 = null;
            }
            class398.field5938.method1481(arg1 ^ 0x3, arg0);
        }
        field5569++;
    }
}
