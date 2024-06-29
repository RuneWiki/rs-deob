import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class197 extends class182 {

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    private int field3289 = -1;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "Lea;")
    public static class227 field3288 = new class227();

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3297 = "glow2:";

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field3300 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "Z")
    public static boolean field3301 = false;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3293 = "flash1:";

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    public static volatile int field3302 = 0;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "[I")
    public int[] field3305;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "[[Lwl;")
    public static class102[][] field3294;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I", line = 5)
    public final int method1287(boolean arg0) {
        if (arg0) {
            return 45;
        } else {
            field3299++;
            return this.field3289;
        }
    }

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "(I)V", line = 16)
    public static void method1347(int arg0) {
        field3300 = null;
        if (arg0 >= -99) {
            field3297 = (String) null;
        }
        field3294 = (class102[][]) null;
        field3288 = null;
        field3297 = null;
        field3293 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 35)
    public class197() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[[I", line = 45)
    public int[][] method122(int arg0, int arg1) {
        field3295++;
        if (arg1 != 4944) {
            this.method122(111, -110);
        }
        int[][] var3 = this.field3152.method1953(arg0, 119);
        if (this.field3152.field4493 && this.method1349(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = this.field3298 * (class334.field5323 == this.field3292 ? arg0 : this.field3292 * arg0 / class334.field5323);
            if (class26.field672 == this.field3298) {
                for (int var8 = 0; var8 < class26.field672; var8++) {
                    int var9 = this.field3305[var7++];
                    var5[var8] = class83.method613(var9 << 4, 4080);
                    var6[var8] = class83.method613(65280, var9) >> 4;
                    var4[var8] = class83.method613(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class26.field672; var10++) {
                    int var11 = this.field3298 * var10 / class26.field672;
                    int var12 = this.field3305[var7 + var11];
                    var5[var10] = class83.method613(4080, var12 << 4);
                    var6[var10] = class83.method613(var12, 65280) >> 4;
                    var4[var10] = class83.method613(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Loe;IB)V", line = 112)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            field3293 = (String) null;
        }
        if (arg1 == 0) {
            this.field3289 = arg0.method989(arg2 + 24);
        }
        field3296++;
    }

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "(I)V", line = 131)
    public static final void method1348(int arg0) {
        field3304++;
        int var1 = 65 % ((-arg0 - 82) / 38);
        class238.field3885.method895(128);
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 145)
    public final void method470(int arg0) {
        if (arg0 != 2) {
            field3306 = 79;
        }
        super.method470(arg0 ^ 0x0);
        field3291++;
        this.field3305 = null;
    }

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "(I)Z", line = 164)
    public final boolean method1349(int arg0) {
        field3290++;
        if (this.field3305 != null) {
            return true;
        } else if (arg0 >= ~this.field3289) {
            class288 var2 = class23.field579 < 0 ? class274.method1951(this.field3289, (byte) 60, class7.field260) : class171.method1213(class23.field579, class7.field260, this.field3289, (byte) 37);
            var2.method2051();
            this.field3292 = var2.field1356;
            this.field3298 = var2.field1353;
            this.field3305 = var2.field4697;
            return true;
        } else {
            return false;
        }
    }
}
