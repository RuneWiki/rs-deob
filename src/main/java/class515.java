import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class515 {

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    private int field7620 = 0;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    private int field7626 = -1;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "Lrk;")
    private class419 field7623 = new class419();

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "Z")
    public boolean field7632 = false;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    private int field7624;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    private int field7622;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "[[[I")
    private int[][][] field7625;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "[Lam;")
    private class646[] field7617;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "Z")
    public static boolean field7619 = false;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V", line = 6)
    public final void method3060(boolean arg0) {
        field7621++;
        for (int var2 = 0; var2 < this.field7622; var2++) {
            this.field7625[var2][0] = null;
            this.field7625[var2][1] = null;
            this.field7625[var2][2] = null;
            this.field7625[var2] = null;
        }
        this.field7617 = null;
        if (!arg0) {
            this.method3060(true);
        }
        this.field7625 = null;
        this.field7623.method2499(0);
        this.field7623 = null;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(III)V", line = 221)
    public class515(int arg0, int arg1, int arg2) {
        this.field7624 = arg1;
        this.field7622 = arg0;
        this.field7625 = new int[this.field7622][3][arg2];
        this.field7617 = new class646[this.field7624];
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)[[[I", line = 39)
    public final int[][][] method3061(int arg0) {
        field7618++;
        if (this.field7624 != this.field7622) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field7622; var2++) {
            this.field7617[var2] = class588.field8723;
        }
        return this.field7625;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)Lob;", line = 58)
    public static final class385 method3062(boolean arg0) {
        field7628++;
        if (class113.field1428 == null || class613.field8998 == null) {
            return null;
        }
        class613.field8998.method1220(class113.field1428, 23);
        class385 var1 = (class385) class613.field8998.method1222((byte) -86);
        if (var1 == null) {
            return null;
        }
        if (arg0) {
            method3062(false);
        }
        class42 var2 = class113.field1420.method1213(var1.field5633, 6);
        return var2 != null && var2.field485 && var2.method220((byte) 106, class113.field1422) ? var1 : class221.method1453(1);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 84)
    public static final void method3063(int arg0) {
        field7631++;
        if (class481.field7303) {
            return;
        }
        if (arg0 != 1) {
            field7619 = false;
        }
        class120.field1561 = true;
        class481.field7303 = true;
        if (class94.field1158.field301) {
            class591.field8752 = ((int) class591.field8752 + 191 & 0xFFFFFF80);
        } else {
            class74.field860 += (24.0F - class74.field860) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[[I", line = 118)
    public final int[][] method3064(int arg0, int arg1) {
        field7627++;
        if (arg0 != 1) {
            this.field7632 = true;
        }
        if (this.field7624 == this.field7622) {
            this.field7632 = this.field7617[arg1] == null;
            this.field7617[arg1] = class588.field8723;
            return this.field7625[arg1];
        } else if (this.field7622 == 1) {
            this.field7632 = this.field7626 != arg1;
            this.field7626 = arg1;
            return this.field7625[0];
        } else {
            class646 var3 = this.field7617[arg1];
            if (var3 == null) {
                this.field7632 = true;
                if (this.field7620 < this.field7622) {
                    var3 = new class646(arg1, this.field7620);
                    this.field7620++;
                } else {
                    class646 var4 = (class646) this.field7623.method2490(0);
                    var3 = new class646(arg1, var4.field9376);
                    this.field7617[var4.field9375] = null;
                    var4.method2997(arg0);
                }
                this.field7617[arg1] = var3;
            } else {
                this.field7632 = false;
            }
            this.field7623.method2489(true, var3);
            return this.field7625[var3.field9376];
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZIIZI)Ldda;", line = 191)
    public static final class597 method3065(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field7629++;
        if (arg2 != 1000000) {
            return null;
        }
        class18 var5 = null;
        if (class551.field8210 != null) {
            var5 = new class18(arg4, class551.field8210, class349.field5063[arg4], 1000000);
        }
        class532.field7888[arg4] = class179.field2759.method1575(var5, class444.field6482, arg4, (byte) 105);
        if (arg0) {
            class532.field7888[arg4].method1548(arg2 ^ 0xFFF0BDD4);
        }
        return new class597(class532.field7888[arg4], arg3, arg1);
    }
}
