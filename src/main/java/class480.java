import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class480 implements class682 {

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lpe;")
    private class615 field6401;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Lrm;")
    public class243 field6400;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[[F")
    public static float[][] field6395 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Lbm;")
    public static class637 field6396 = new class637();

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "Lra;")
    public static class361 field6403 = new class361(85, 7);

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field6406 = 0;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "F")
    public static float field6404;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lxa;")
    public class511 field6397;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 3)
    public final void method449(int arg0) {
        field6399++;
        int var2 = 15 / ((arg0 - 65) / 45);
        this.field6397 = class53.method462(26513, this.field6400.field3259, this.field6401);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z", line = 21)
    public final boolean method444(byte arg0) {
        if (arg0 > -10) {
            field6396 = null;
        }
        field6398++;
        return this.field6401.method3362(this.field6400.field3259, -109);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 32)
    public static void method2655(boolean arg0) {
        field6403 = null;
        field6396 = null;
        if (!arg0) {
            method2655(false);
        }
        field6395 = null;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lpe;Lrm;)V", line = 43)
    public class480(class615 arg0, class243 arg1) {
        this.field6401 = arg0;
        this.field6400 = arg1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V", line = 55)
    public void method448(int arg0, boolean arg1) {
        field6402++;
        if (arg0 != -207) {
            method2655(false);
        }
        if (arg1) {
            int var3 = this.field6400.field3257.method3005(class94.field1240, (byte) -124, this.field6397.method602()) + this.field6400.field3258;
            int var4 = this.field6400.field3261.method3059(this.field6397.method595(), class535.field6968, -121) + this.field6400.field3262;
            this.field6397.method2751(var3, var4);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V", line = 80)
    public static final void method2656(byte arg0) {
        if (class213.field2750 <= 0) {
            class247.field3327 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class612.field8281.length; var2++) {
                if (class612.field8281[var2].startsWith("--> ")) {
                    int var10000 = ~class213.field2750;
                    var1++;
                    if (var10000 == ~var1) {
                        class247.field3327 = class612.field8281[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field6405++;
        if (arg0 != -22) {
            method2655(true);
        }
    }
}
