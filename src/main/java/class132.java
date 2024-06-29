import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class132 {

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    private int field2350 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    private int field2339 = -1;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lbb;")
    private class90 field2341 = new class90();

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Z")
    public boolean field2357 = false;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[Lbh;")
    private class7[] field2340;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[[[I")
    private int[][][] field2349;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lp;")
    public static class280 field2348 = class18.method140((byte) -121, "Polices charg-Bes");

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lsb;")
    public static class221 field2351 = new class221(200);

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lp;")
    public static class280 field2356 = class18.method140((byte) -128, "Fps:");

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ltg;")
    public static class180 field2342;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[Lbl;")
    public static class33[] field2355;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BI)[B")
    public static final byte[] method914(byte[] arg0, int arg1) {
        if (arg1 != -2081) {
            method915((byte) -54);
        }
        field2353++;
        class25 var2 = new class25(arg0);
        int var3 = var2.method189((byte) -103);
        int var4 = var2.method199((byte) -85);
        if (var4 < 0 || class149.field2578 != 0 && var4 > class149.field2578) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method188(var5, 0, 3, var4);
            return var5;
        } else {
            int var6 = var2.method199((byte) -85);
            if (var6 < 0 || !(class149.field2578 == 0 || var6 <= class149.field2578)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class87.method621(var7, var6, arg0, var4, 9);
            } else {
                class278.field4872.method265(-10, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method915(byte arg0) {
        field2355 = null;
        field2356 = null;
        field2342 = null;
        if (arg0 != 77) {
            method919(-113, -78);
        }
        field2348 = null;
        field2351 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public final void method916(boolean arg0) {
        for (int var2 = 0; var2 < this.field2343; var2++) {
            this.field2349[var2][0] = null;
            this.field2349[var2][1] = null;
            this.field2349[var2][2] = null;
            this.field2349[var2] = null;
        }
        if (arg0) {
            return;
        }
        this.field2349 = null;
        field2346++;
        this.field2340 = null;
        this.field2341.method639(49);
        this.field2341 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I")
    public final int[][] method917(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        }
        field2344++;
        if (this.field2347 == this.field2343) {
            this.field2357 = this.field2340[arg0] == null;
            this.field2340[arg0] = class80.field1317;
            return this.field2349[arg0];
        } else if (this.field2343 == 1) {
            this.field2357 = this.field2339 != arg0;
            this.field2339 = arg0;
            return this.field2349[0];
        } else {
            class7 var3 = this.field2340[arg0];
            if (var3 == null) {
                this.field2357 = true;
                if (this.field2343 > this.field2350) {
                    var3 = new class7(arg0, this.field2350);
                    this.field2350++;
                } else {
                    class7 var4 = (class7) this.field2341.method646((byte) 22);
                    var3 = new class7(arg0, var4.field141);
                    this.field2340[var4.field140] = null;
                    var4.method1146(26159);
                }
                this.field2340[arg0] = var3;
            } else {
                this.field2357 = false;
            }
            this.field2341.method645(71, var3);
            return this.field2349[var3.field141];
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method918(byte arg0) {
        field2354++;
        if (this.field2347 != this.field2343) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2343; var2++) {
            this.field2340[var2] = class80.field1317;
        }
        if (arg0 != -2) {
            field2345 = -100;
        }
        return this.field2349;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
    public static final void method919(int arg0, int arg1) {
        if (arg0 < 105) {
            field2356 = null;
        }
        field2352++;
        class81.field1322.method1478(arg1, 88);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(III)V")
    public class132(int arg0, int arg1, int arg2) {
        this.field2347 = arg1;
        this.field2340 = new class7[this.field2347];
        this.field2343 = arg0;
        this.field2349 = new int[this.field2343][3][arg2];
    }
}
