import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class286 extends class192 {

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Z")
    public static boolean field4927 = false;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "Lmb;")
    public static class172 field4934 = new class172(30);

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "Loh;")
    public static class258 field4937 = class153.method1046("", 94);

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    public int field4932;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public int field4936;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "Loh;")
    public class258 field4928;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(B)V", line = 4)
    public final void method2010(byte arg0) {
        if (arg0 != -38) {
            this.method2015(true);
        }
        this.field3397 = class25.method197(-3418) + 500L | Long.MIN_VALUE & this.field3397;
        class176.field3167.method1305(this, 0);
        field4930++;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)I", line = 16)
    public final int method2011(int arg0) {
        field4931++;
        if (arg0 != -571826873) {
            method2016((class213) null, true, 57);
        }
        return (int) (this.field2642 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V", line = 28)
    public static final void method2012(int arg0, int arg1) {
        class286 var2 = class48.method389(arg1, arg0, arg0 + 10730);
        var2.method2010((byte) -38);
        field4929++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lvi;I)V", line = 39)
    public static final void method2013(class129 arg0, int arg1) {
        if (arg1 != -5416) {
            field4934 = (class172) null;
        }
        field4923++;
        short var2 = 256;
        for (int var3 = 0; var3 < class69.field1196.length; var3++) {
            class69.field1196[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var2 * 128.0D * Math.random());
            class69.field1196[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class268.field4664[var9] = (class69.field1196[var9 + 128] + class69.field1196[var9 - 1] + class69.field1196[var9 + 1] + class69.field1196[var9 - 128]) / 4;
                }
            }
            int[] var10 = class69.field1196;
            class69.field1196 = class268.field4664;
            class268.field4664 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field1948; var12++) {
            for (int var13 = 0; var13 < arg0.field1950; var13++) {
                if (arg0.field2281[var11++] != 0) {
                    int var14 = var13 + arg0.field1952 + 16;
                    int var15 = var12 + arg0.field1953 + 16;
                    int var16 = (var15 << 7) + var14;
                    class69.field1196[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)I", line = 140)
    public static final int method2014(int arg0, int arg1) {
        int var7 = arg0 - 1;
        if (arg1 != 783135696) {
            method2014(17, 109);
        }
        field4925++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)I", line = 157)
    public final int method2015(boolean arg0) {
        field4935++;
        if (arg0) {
            method2012(26, 4);
        }
        return (int) this.field2642;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lgb;ZI)Z", line = 169)
    public static final boolean method2016(class213 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2012(42, 3);
        }
        field4933++;
        byte[] var3 = arg0.method1437(-109, arg2);
        if (var3 == null) {
            return false;
        } else {
            class212.method1418(-120, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 201)
    public final void method2017(int arg0) {
        this.field3397 |= Long.MIN_VALUE;
        if (this.method2019(0) == 0L) {
            class128.field2267.method1305(this, 0);
        }
        if (arg0 <= -20) {
            field4924++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V", line = 227)
    public static void method2018(int arg0) {
        int var1 = 24 / ((arg0 - 38) / 52);
        field4937 = null;
        field4934 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(II)V", line = 242)
    public class286(int arg0, int arg1) {
        this.field2642 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)J", line = 251)
    public final long method2019(int arg0) {
        if (arg0 == 0) {
            field4922++;
            return Long.MAX_VALUE & this.field3397;
        } else {
            return 122L;
        }
    }
}
