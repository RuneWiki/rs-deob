import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class342 {

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    private int field5458 = -1;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    private int field5459 = 0;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lc;")
    private class331 field5454 = new class331();

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Z")
    public boolean field5463 = false;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    private int field5453;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    private int field5461;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[Lgg;")
    private class81[] field5451;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[[[I")
    private int[][][] field5457;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field5460 = null;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lul;")
    public static class51 field5447 = new class51(50);

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field5464 = 0;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "F")
    public static float field5450;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2401(int arg0) {
        class259.field4198.method466(-1);
        if (arg0 != 3) {
            field5450 = 0.41828954F;
        }
        field5446++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)[[[I", line = 17)
    public final int[][][] method2402(byte arg0) {
        field5456++;
        if (this.field5461 != this.field5453) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -22) {
            method2406(-124, true, false, true, 12);
        }
        for (int var2 = 0; var2 < this.field5461; var2++) {
            this.field5451[var2] = class116.field1959;
        }
        return this.field5457;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 39)
    public static void method2403(int arg0) {
        if (arg0 >= -17) {
            field5450 = 0.1637832F;
        }
        field5447 = null;
        field5460 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[[I", line = 56)
    public final int[][] method2404(int arg0, byte arg1) {
        field5448++;
        if (arg1 < 115) {
            this.method2402((byte) 119);
        }
        if (this.field5461 == this.field5453) {
            this.field5463 = this.field5451[arg0] == null;
            this.field5451[arg0] = class116.field1959;
            return this.field5457[arg0];
        } else if (this.field5461 == 1) {
            this.field5463 = this.field5458 != arg0;
            this.field5458 = arg0;
            return this.field5457[0];
        } else {
            class81 var3 = this.field5451[arg0];
            if (var3 == null) {
                this.field5463 = true;
                if (this.field5461 > this.field5459) {
                    var3 = new class81(arg0, this.field5459);
                    this.field5459++;
                } else {
                    class81 var4 = (class81) this.field5454.method2293(14585);
                    var3 = new class81(arg0, var4.field1324);
                    this.field5451[var4.field1327] = null;
                    var4.method2195(-1);
                }
                this.field5451[arg0] = var3;
            } else {
                this.field5463 = false;
            }
            this.field5454.method2295(var3, (byte) 49);
            return this.field5457[var3.field1324];
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 122)
    public final void method2405(int arg0) {
        field5449++;
        if (arg0 != 8098) {
            this.field5451 = (class81[]) null;
        }
        for (int var2 = 0; var2 < this.field5461; var2++) {
            this.field5457[var2][0] = null;
            this.field5457[var2][1] = null;
            this.field5457[var2][2] = null;
            this.field5457[var2] = (int[][]) null;
        }
        this.field5451 = null;
        this.field5457 = (int[][][]) null;
        this.field5454.method2302(128);
        this.field5454 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZZZI)Lcg;", line = 151)
    public static final class49 method2406(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        field5452++;
        class177 var5 = null;
        if (class123.field2136 != null) {
            var5 = new class177(arg0, class123.field2136, class140.field2578[arg0], 1000000);
        }
        class134.field2291[arg0] = class278.field4414.method1738(var5, -61, class336.field5371, arg0);
        if (arg2) {
            class134.field2291[arg0].method2201((byte) 55);
        }
        return arg4 >= -1 ? (class49) null : new class49(class134.field2291[arg0], arg1, arg3);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V", line = 209)
    public class342(int arg0, int arg1, int arg2) {
        this.field5453 = arg1;
        this.field5461 = arg0;
        this.field5451 = new class81[this.field5453];
        this.field5457 = new int[this.field5461][3][arg2];
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 189)
    public static final boolean method2407(int arg0, String arg1) {
        int var2 = 24 / ((arg0 + 75) / 34);
        field5455++;
        return class127.method1057(10, true, arg1, 0);
    }
}
