import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class388 extends class372 {

    @OriginalMember(owner = "client!dv", name = "W", descriptor = "Lgd;")
    public class406 field5600;

    @OriginalMember(owner = "client!dv", name = "Y", descriptor = "[I")
    public static int[] field5602 = new int[5];

    @OriginalMember(owner = "client!dv", name = "X", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!dv", name = "Z", descriptor = "Lkg;")
    public static class208 field5603;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method2276(int arg0) {
        this.field5600 = new class406((class527) super.field5334);
        ++field5601;
        if (arg0 >= -106) {
            this.field5600 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lkv;)V")
    public class388(class527 arg0) {
        super(arg0);
        this.field5600 = new class406(arg0);
        super.field5353 = new class444(super.field5334);
        super.field5354 = new class444(super.field5334);
        super.field5346 = new class444(super.field5334);
        super.field5375 = new class444(super.field5334);
        super.field5361 = new class444(super.field5334);
        super.field5362 = new class444(super.field5334);
        super.field5363 = new class444(super.field5334);
        super.field5356 = new class444(super.field5334);
        super.field5369 = new class444(super.field5334);
        super.field5348 = new class444(super.field5334);
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static void method2324(int arg0) {
        if (arg0 != 1) {
            field5602 = null;
        }
        field5603 = null;
        field5602 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z")
    public static final boolean method2325(int arg0, int arg1, int arg2) {
        int var3 = class236.field3074[arg0][arg1][arg2];
        if (-class675.field9559 == var3) {
            return false;
        } else if (class675.field9559 == var3) {
            return true;
        } else {
            int var4 = arg1 << class428.field5949;
            int var5 = arg2 << class428.field5949;
            if (class38.method223(var4 + 1, class397.field5666[arg0].method150(arg1, arg2), var5 + 1) && class38.method223(class33.field327 + var4 - 1, class397.field5666[arg0].method150(arg1 + 1, arg2), var5 + 1) && class38.method223(class33.field327 + var4 - 1, class397.field5666[arg0].method150(arg1 + 1, arg2 + 1), class33.field327 + var5 - 1) && class38.method223(var4 + 1, class397.field5666[arg0].method150(arg1, arg2 + 1), class33.field327 + var5 - 1) && class38.method223(class49.field656 + var4, class397.field5666[arg0].method150(arg1, arg2), var5 + 1) && class38.method223(class33.field327 + var4 - 1, class397.field5666[arg0].method150(arg1 + 1, arg2), class49.field656 + var5) && class38.method223(class49.field656 + var4, class397.field5666[arg0].method150(arg1, arg2 + 1), class33.field327 + var5 - 1) && class38.method223(class33.field327 + var4 - 1, class397.field5666[arg0].method150(arg1, arg2), class49.field656 + var5) && class38.method223(class49.field656 + var4, class397.field5666[arg0].method150(arg1, arg2), class49.field656 + var5)) {
                class236.field3074[arg0][arg1][arg2] = class675.field9559;
                return true;
            } else {
                class236.field3074[arg0][arg1][arg2] = -class675.field9559;
                return false;
            }
        }
    }
}
