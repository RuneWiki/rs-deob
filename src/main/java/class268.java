import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class268 {

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    private int field4519 = 0;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    private int field4520 = -1;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ljk;")
    private class76 field4526 = new class76();

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Z")
    public boolean field4531 = false;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    private int field4523;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    private int field4515;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[[I")
    private int[][] field4518;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "[Lm;")
    private class44[] field4528;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field4525 = 0;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Luf;")
    public static class168 field4529 = class148.method1019(-1720, "::clientdrop");

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BIZLdk;II)V", line = 15)
    public static final void method1862(byte arg0, int arg1, boolean arg2, class241 arg3, int arg4, int arg5) {
        class83.field1261 = 1;
        class300.field5091 = arg3;
        int var6 = 51 / ((-arg0 - 25) / 45);
        field4521++;
        class285.field4825 = arg2;
        class151.field2345 = 10000;
        class282.field4765 = arg5;
        class14.field145 = arg1;
        class157.field2478 = arg4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Luf;I)V", line = 34)
    public static final void method1863(class168 arg0, int arg1) {
        field4522++;
        if (class291.field4896 == null) {
            return;
        }
        long var2 = arg0.method1208((byte) 71);
        int var4 = arg1;
        if (var2 == 0L) {
            return;
        }
        while (class291.field4896.length > var4 && class291.field4896[var4].field292 != var2) {
            var4++;
        }
        if (var4 < class291.field4896.length && class291.field4896[var4] != null) {
            class249.field4262.method726(146, 2138389379);
            class249.field4262.method1053(class291.field4896[var4].field292, 11247);
            class299.field5061++;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(III)V", line = 257)
    public class268(int arg0, int arg1, int arg2) {
        this.field4523 = arg0;
        this.field4515 = arg1;
        this.field4518 = new int[this.field4523][arg2];
        this.field4528 = new class44[this.field4515];
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 76)
    public final void method1864(int arg0) {
        field4516++;
        for (int var2 = arg0; var2 < this.field4523; var2++) {
            this.field4518[var2] = null;
        }
        this.field4528 = null;
        this.field4518 = (int[][]) null;
        this.field4526.method453(255);
        this.field4526 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ldk;I)V", line = 94)
    public static final void method1865(class241 arg0, int arg1) {
        field4530++;
        if (arg1 != 4073) {
            method1863((class168) null, 38);
        }
        if (class87.field1343) {
            return;
        }
        class228.method1551();
        class130.field2022 = class168.method1183(arg0, class85.field1325, 255);
        int var2 = class299.field5069;
        int var3 = var2 * 956 / 503;
        class130.field2022.method265((class14.field142 - var3) / 2, 0, var3, var2);
        class145.field2266 = class27.method144(class198.field3277, -64, arg0);
        class145.field2266.method1363(class14.field142 / 2 - (class145.field2266.field3139 / 2), 18);
        class87.field1343 = true;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I", line = 136)
    public final int[] method1866(int arg0, int arg1) {
        if (arg0 != 1) {
            method1867((byte) -16);
        }
        field4524++;
        if (this.field4523 == this.field4515) {
            this.field4531 = this.field4528[arg1] == null;
            this.field4528[arg1] = class205.field3360;
            return this.field4518[arg1];
        } else if (this.field4523 == 1) {
            this.field4531 = this.field4520 != arg1;
            this.field4520 = arg1;
            return this.field4518[0];
        } else {
            class44 var3 = this.field4528[arg1];
            if (var3 == null) {
                this.field4531 = true;
                if (this.field4523 > this.field4519) {
                    var3 = new class44(arg1, this.field4519);
                    this.field4519++;
                } else {
                    class44 var4 = (class44) this.field4526.method443(-111);
                    var3 = new class44(arg1, var4.field543);
                    this.field4528[var4.field546] = null;
                    var4.method124((byte) 71);
                }
                this.field4528[arg1] = var3;
            } else {
                this.field4531 = false;
            }
            this.field4526.method446(var3, arg0 - 27763);
            return this.field4518[var3.field543];
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 217)
    public static void method1867(byte arg0) {
        field4529 = null;
        if (arg0 >= -60) {
            method1863((class168) null, 30);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)[[I", line = 230)
    public final int[][] method1868(int arg0) {
        field4517++;
        if (this.field4523 != this.field4515) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4523; var2++) {
            this.field4528[var2] = class205.field3360;
        }
        return this.field4518;
    }
}
