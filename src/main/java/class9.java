import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lhp;")
    private class277 field71 = new class277(64);

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lhp;")
    public class277 field79 = new class277(2);

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lkea;")
    private class203 field76;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lkea;")
    public class203 field73;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lfda;[[BZ)V")
    public static final void method47(class270 arg0, byte[][] arg1, boolean arg2) {
        field77++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        if (arg2) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class194 var11 = new class194(var10);
                int var12 = class170.field2090[var5] >> 8;
                int var13 = class170.field2090[var5] & 0xFF;
                int var14 = var12 * 64 - class287.field3980;
                int var15 = var13 * 64 - class250.field3549;
                class453.method2798((byte) -53);
                arg0.method562(class250.field3549, class14.field120, var15, class287.field3980, var11, var14, -20500);
                arg0.method1759(var3, var14, (byte) 114, var15, class413.field6264, var11);
                if (!arg0.field1001 && (class568.field8159 / 8) == var12 && class400.field6066 / 8 == var13 && var3[0] != -1) {
                    class291.field4035 = class61.field702.method2028(var3[0], 0, class173.field2125, var3[1], var3[3], var3[2]);
                    class107.field1280 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class170.field2090[var6] >> 8) * 64 - class287.field3980;
            int var8 = (class170.field2090[var6] & 0xFF) * 64 - class250.field3549;
            byte[] var9 = arg1[var6];
            if (var9 == null && class400.field6066 < 800) {
                class453.method2798((byte) -54);
                arg0.method565(64, 64, var7, var8, (byte) 11);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
    public final void method48(int arg0, boolean arg1) {
        class277 var3 = this.field71;
        synchronized (this.field71) {
            this.field71.method1811((byte) 114, arg0);
        }
        if (!arg1) {
            return;
        }
        field78++;
        class277 var4 = this.field79;
        synchronized (this.field79) {
            this.field79.method1811((byte) 113, arg0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Llt;")
    public final class589 method49(int arg0, int arg1) {
        field72++;
        class277 var3 = this.field71;
        class589 var4;
        synchronized (this.field71) {
            var4 = (class589) this.field71.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field76;
        byte[] var6;
        synchronized (this.field76) {
            var6 = this.field76.method1286(arg0, arg1, (byte) -49);
        }
        class589 var7 = new class589();
        var7.field8470 = this;
        if (var6 != null) {
            var7.method3438(new class194(var6), 100);
        }
        class277 var8 = this.field71;
        synchronized (this.field71) {
            this.field71.method1808((long) arg0, var7, (byte) -71);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIB)V")
    public static final void method50(int arg0, int arg1, byte arg2) {
        if (arg2 > -99) {
            return;
        }
        field74++;
        class636 var3 = class316.field4605[arg0][arg1];
        if (var3 != null) {
            class113.field1399 = var3.field9157;
            class477.field7040 = var3.field9158;
            class95.field1126 = var3.field9153;
        }
        class112.method690(2);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public final void method51(byte arg0) {
        field75++;
        class277 var2 = this.field71;
        synchronized (this.field71) {
            this.field71.method1810(false);
            if (arg0 != -20) {
                this.method49(65, 1);
            }
        }
        class277 var3 = this.field79;
        synchronized (this.field79) {
            this.field79.method1810(false);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method52(int arg0) {
        class277 var2 = this.field71;
        synchronized (this.field71) {
            this.field71.method1805(25);
        }
        field80++;
        class277 var3 = this.field79;
        synchronized (this.field79) {
            this.field79.method1805(arg0 + 7);
        }
        if (arg0 != 64) {
            this.method49(-31, 0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lcda;ILkea;Lkea;)V")
    public class9(class149 arg0, int arg1, class203 arg2, class203 arg3) {
        this.field76 = arg2;
        this.field73 = arg3;
        this.field76.method1309(1675886592, 33);
    }
}
