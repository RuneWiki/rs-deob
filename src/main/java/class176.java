import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class176 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    private int field3207 = 0;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    private int field3211 = -1;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lmi;")
    private class128 field3210 = new class128();

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Z")
    public boolean field3221 = false;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[[[I")
    private int[][][] field3219;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    private int field3205;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[Ltb;")
    private class21[] field3206;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lhh;")
    public static class163 field3212 = class137.method1065("W-=hlen Sie eine Option", 17);

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field3218 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3214 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Lhh;")
    public static class163 field3220 = class137.method1065("Texturen geladen)3", 17);

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Lpg;")
    public static class81 field3222 = new class81(8);

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field3223 = 1;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1303(byte arg0) {
        if (arg0 >= 106) {
            field3214 = null;
            field3212 = null;
            field3222 = null;
            field3220 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1304(int arg0, byte arg1) {
        int var3 = 18 % ((40 - arg1) / 40);
        field3215++;
        if (this.field3209 == this.field3205) {
            this.field3221 = this.field3206[arg0] == null;
            this.field3206[arg0] = class20.field312;
            return this.field3219[arg0];
        } else if (this.field3209 == 1) {
            this.field3221 = this.field3211 != arg0;
            this.field3211 = arg0;
            return this.field3219[0];
        } else {
            class21 var4 = this.field3206[arg0];
            if (var4 == null) {
                this.field3221 = true;
                if (this.field3209 > this.field3207) {
                    var4 = new class21(arg0, this.field3207);
                    this.field3207++;
                } else {
                    class21 var5 = (class21) this.field3210.method1022(false);
                    var4 = new class21(arg0, var5.field339);
                    this.field3206[var5.field336] = null;
                    var5.method1063(85);
                }
                this.field3206[arg0] = var4;
            } else {
                this.field3221 = false;
            }
            this.field3210.method1014(false, var4);
            return this.field3219[var4.field339];
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method1305(int arg0) {
        int var1 = 74 / ((51 - arg0) / 32);
        class125.field2415 = 0;
        class22.field351 = 0;
        class191.field3499.field1541 = 0;
        class38.field635 = -1;
        class92.field1744 = -1;
        class202.field3647 = 0;
        class33.field502.field1541 = 0;
        class113.field2125 = -1;
        class265.field4605 = 0;
        field3216++;
        class71.field1349 = 0;
        class130.field2530 = false;
        class182.field3359 = -1;
        class203.field3687 = 0;
        for (int var2 = 0; var2 < class106.field2029.length; var2++) {
            if (class106.field2029[var2] != null) {
                class106.field2029[var2].field3618 = -1;
            }
        }
        for (int var3 = 0; var3 < class111.field2098.length; var3++) {
            if (class111.field2098[var3] != null) {
                class111.field2098[var3].field3618 = -1;
            }
        }
        class90.method699(32);
        class5.field99 = 1;
        class174.method1292(30, true);
        for (int var4 = 0; var4 < 100; var4++) {
            class110.field2086[var4] = true;
        }
        class238.field4237.method1021((byte) 88);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public final void method1306(int arg0) {
        if (arg0 != 2) {
            field3218 = 96;
        }
        for (int var2 = 0; var2 < this.field3209; var2++) {
            this.field3219[var2][0] = null;
            this.field3219[var2][1] = null;
            this.field3219[var2][2] = null;
            this.field3219[var2] = null;
        }
        field3213++;
        this.field3206 = null;
        this.field3219 = null;
        this.field3210.method1021((byte) 96);
        this.field3210 = null;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)[[[I")
    public final int[][][] method1307(int arg0) {
        field3208++;
        if (this.field3209 != this.field3205) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3209; var2++) {
            this.field3206[var2] = class20.field312;
        }
        if (arg0 != 32329) {
            field3212 = null;
        }
        return this.field3219;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(III)V")
    public class176(int arg0, int arg1, int arg2) {
        this.field3209 = arg0;
        this.field3219 = new int[this.field3209][3][arg2];
        this.field3205 = arg1;
        this.field3206 = new class21[this.field3205];
    }
}
