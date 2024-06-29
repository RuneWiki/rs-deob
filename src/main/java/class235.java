import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class235 extends class626 {

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public int field3315 = 0;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Ltf;")
    public class294 field3319;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "Ltf;")
    public class294 field3338;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "Lak;")
    public class349 field3333;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Luw;")
    public class414 field3339;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Ldc;")
    public class5 field3311;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Ldc;")
    public class5 field3335;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lcj;")
    public class690 field3327;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Lcj;")
    public class690 field3336;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lfca;")
    public class84 field3328;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Z")
    public boolean field3316;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
    public boolean field3325;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Z")
    public boolean field3332;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "[I")
    public int[] field3331;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public final void method1602(byte arg0) {
        field3334++;
        int var2 = this.field3329;
        if (arg0 >= -28) {
            this.field3318 = -80;
        }
        boolean var3 = this.field3325;
        if (this.field3339 != null) {
            class414 var4 = this.field3339.method2513(class742.field10408, true);
            if (var4 == null) {
                this.field3321 = 0;
                this.field3332 = false;
                this.field3329 = -1;
                this.field3312 = 0;
                this.field3331 = null;
                this.field3317 = 0;
                this.field3314 = 256;
                this.field3330 = 0;
                this.field3325 = false;
                this.field3320 = 256;
            } else {
                this.field3325 = var4.field5772;
                this.field3320 = var4.field5778;
                this.field3317 = var4.field5776;
                this.field3312 = var4.field5741 << 9;
                this.field3330 = var4.field5740;
                this.field3321 = var4.field5763;
                this.field3331 = var4.field5785;
                this.field3314 = var4.field5725;
                this.field3332 = var4.field5791;
                this.field3329 = var4.field5714;
            }
        } else if (this.field3328 != null) {
            int var5 = class475.method2868(this.field3328, 70);
            if (var2 != var5) {
                this.field3329 = var5;
                class488 var6 = this.field3328.field1523;
                if (var6.field6923 != null) {
                    var6 = var6.method2926(8730, class742.field10408);
                }
                if (var6 == null) {
                    this.field3325 = this.field3328.field1523.field6975;
                    this.field3320 = 256;
                    this.field3314 = 256;
                    this.field3330 = this.field3312 = 0;
                } else {
                    this.field3330 = var6.field6952;
                    this.field3314 = var6.field6974;
                    this.field3320 = var6.field6924;
                    this.field3325 = var6.field6975;
                    this.field3312 = var6.field6950 << 9;
                }
            }
        } else if (this.field3333 != null) {
            this.field3329 = class700.method3937(this.field3333, 0);
            this.field3320 = 256;
            this.field3330 = this.field3333.field4935;
            this.field3325 = this.field3333.field4902;
            this.field3314 = 256;
            this.field3312 = this.field3333.field4915 << 9;
        }
        if (this.field3329 == var2 && this.field3325 == var3) {
            return;
        }
        if (this.field3338 == null) {
            return;
        }
        class484.field6848.method4051(this.field3338);
        this.field3335 = null;
        this.field3336 = null;
        this.field3338 = null;
    }
}
