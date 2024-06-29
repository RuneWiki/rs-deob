import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class291 {

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    private int field5098 = 0;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    private int field5099 = -1;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Laj;")
    private class1 field5095 = new class1();

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Z")
    public boolean field5106 = false;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[[[I")
    private int[][][] field5088;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    private int field5101;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[Lcg;")
    private class43[] field5105;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Z")
    public static volatile boolean field5086 = true;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lsf;")
    public static class108 field5102 = class140.method973(255, " <col=ffffff>");

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lik;")
    public static class262 field5104;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[Lvd;")
    public static class135[] field5089;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2079(int arg0, int arg1) {
        class167.field3013 = 1000 / arg0;
        field5100++;
        if (arg1 != -4514) {
            field5102 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 18)
    public final void method2080(int arg0) {
        int var2 = 0;
        if (arg0 != 1) {
            method2079(-103, -49);
        }
        while (this.field5094 > var2) {
            this.field5088[var2][0] = null;
            this.field5088[var2][1] = null;
            this.field5088[var2][2] = null;
            this.field5088[var2] = (int[][]) null;
            var2++;
        }
        field5087++;
        this.field5088 = (int[][][]) null;
        this.field5105 = null;
        this.field5095.method9((byte) -125);
        this.field5095 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)[[I", line = 47)
    public final int[][] method2081(int arg0, int arg1) {
        if (arg1 > -38) {
            return (int[][]) ((int[][]) null);
        }
        field5096++;
        if (this.field5101 == this.field5094) {
            this.field5106 = this.field5105[arg0] == null;
            this.field5105[arg0] = class234.field4138;
            return this.field5088[arg0];
        } else if (this.field5094 == 1) {
            this.field5106 = this.field5099 != arg0;
            this.field5099 = arg0;
            return this.field5088[0];
        } else {
            class43 var3 = this.field5105[arg0];
            if (var3 == null) {
                this.field5106 = true;
                if (this.field5098 >= this.field5094) {
                    class43 var4 = (class43) this.field5095.method11((byte) 60);
                    var3 = new class43(arg0, var4.field564);
                    this.field5105[var4.field563] = null;
                    var4.method1325(0);
                } else {
                    var3 = new class43(arg0, this.field5098);
                    this.field5098++;
                }
                this.field5105[arg0] = var3;
            } else {
                this.field5106 = false;
            }
            this.field5095.method14((byte) 67, var3);
            return this.field5088[var3.field564];
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 114)
    public static void method2082(byte arg0) {
        field5104 = null;
        field5089 = null;
        field5102 = null;
        if (arg0 != -33) {
            method2084(-69);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lee;", line = 151)
    public static final class284 method2083(int arg0, int arg1) {
        field5103++;
        class284 var2 = (class284) class145.field2598.method642((long) arg0, (byte) -53);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -14) {
            method2087(-85);
        }
        class284 var3 = class130.method893(false, false, class62.field993, arg0, class152.field2756);
        if (var3 != null) {
            class145.field2598.method643((byte) -49, (long) arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lrm;", line = 173)
    public static final class249 method2084(int arg0) {
        if (arg0 != 0) {
            field5104 = (class262) null;
        }
        field5093++;
        class249 var1 = new class249(31);
        var1.method1759(-32768, 8);
        var1.method1759(-32768, class269.field4716);
        var1.method1759(-32768, class183.field3367 ? 1 : 0);
        var1.method1759(arg0 ^ 0xFFFF8000, class163.field2916 ? 1 : 0);
        var1.method1759(-32768, class137.field2427 ? 1 : 0);
        var1.method1759(-32768, class180.field3277 ? 1 : 0);
        var1.method1759(-32768, class287.field5018 ? 1 : 0);
        var1.method1759(-32768, class283.field4962 ? 1 : 0);
        var1.method1759(-32768, class312.field5394 ? 1 : 0);
        var1.method1759(arg0 - 32768, class180.field3280 ? 1 : 0);
        var1.method1759(-32768, class247.field4280);
        var1.method1759(arg0 - 32768, class26.field397 ? 1 : 0);
        var1.method1759(-32768, class60.field962 ? 1 : 0);
        var1.method1759(arg0 ^ 0xFFFF8000, class221.field3937 ? 1 : 0);
        var1.method1759(-32768, class299.field5202);
        var1.method1759(-32768, class131.field2242 ? 1 : 0);
        var1.method1759(arg0 - 32768, class15.field194);
        var1.method1759(-32768, class203.field3671);
        var1.method1759(arg0 - 32768, class42.field561);
        var1.method1724(false, class311.field5380);
        var1.method1724(false, class288.field5028);
        var1.method1759(arg0 ^ 0xFFFF8000, class165.method1145());
        var1.method1741(class95.field1523, -1580277072);
        var1.method1759(arg0 ^ 0xFFFF8000, class258.field4562);
        var1.method1759(-32768, class45.field643 ? 1 : 0);
        var1.method1759(-32768, class282.field4939 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILik;)V", line = 213)
    public static final void method2085(int arg0, class262 arg1) {
        field5091++;
        class81.field1265 = arg1;
        if (arg0 < 82) {
            method2084(17);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 230)
    public static final void method2086(boolean arg0) {
        field5092++;
        if (arg0) {
            method2079(50, 102);
        }
        class121.field2069.method639(-49);
        class260.field4586.method639(-47);
        class110.field1928.method639(-47);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(III)V", line = 296)
    public class291(int arg0, int arg1, int arg2) {
        this.field5094 = arg0;
        this.field5088 = new int[this.field5094][3][arg2];
        this.field5101 = arg1;
        this.field5105 = new class43[this.field5101];
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 252)
    public static final void method2087(int arg0) {
        if (arg0 != 1) {
            field5085 = 62;
        }
        field5097++;
        class240.field4185.method644((byte) 90);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)[[[I", line = 263)
    public final int[][][] method2088(int arg0) {
        field5090++;
        if (this.field5101 != this.field5094) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5094; var2++) {
            this.field5105[var2] = class234.field4138;
        }
        if (arg0 != -9796) {
            field5085 = 112;
        }
        return this.field5088;
    }
}
