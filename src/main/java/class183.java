import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class183 implements Runnable {

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Z")
    public boolean field3375 = true;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field3382 = new Object();

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field3385 = 0;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[I")
    public int[] field3386 = new int[500];

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    public int[] field3387 = new int[500];

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lcf;")
    private static class93 field3378 = class147.method1066("Please remove ", -48);

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lcf;")
    public static class93 field3380 = field3378;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lcf;")
    public static class93 field3379 = field3378;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Luf;")
    public static class173 field3376 = null;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lcf;")
    public static class93 field3377 = class147.method1066("Chargement en cours)3 Veuillez patienter)3", -48);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lvh;")
    public static class274 field3383;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[I")
    public static int[] field3381;

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3375) {
            Object var1 = this.field3382;
            synchronized (this.field3382) {
                if (this.field3385 < 500) {
                    this.field3386[this.field3385] = class227.field4056;
                    this.field3387[this.field3385] = class157.field2793;
                    this.field3385++;
                }
            }
            class53.method290(50L, true);
        }
        field3372++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lcc;B)V")
    public static final void method1341(class210 arg0, byte arg1) {
        if (class275.field4921 == arg0.field3833 || arg0.field3840 == -1 || arg0.field3869 != 0 || (arg0.field3811 + 1) > class131.method964(arg0.field3840, true).field486[arg0.field3852]) {
            int var2 = arg0.field3833 - arg0.field3804;
            int var3 = class275.field4921 - arg0.field3804;
            int var4 = arg0.field3851 * 128 + (arg0.method1475(false) * 64);
            int var5 = arg0.field3781 * 128 + (arg0.method1475(false) * 64);
            int var6 = arg0.field3780 * 128 + (arg0.method1475(false) * 64);
            int var7 = arg0.field3818 * 128 + (arg0.method1475(false) * 64);
            arg0.field3784 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field3868 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
        }
        if (arg0.field3794 == 0) {
            arg0.field3770 = 1024;
        }
        field3384++;
        if (arg0.field3794 == 1) {
            arg0.field3770 = 1536;
        }
        if (arg0.field3794 == 2) {
            arg0.field3770 = 0;
        }
        if (arg0.field3794 == 3) {
            arg0.field3770 = 512;
        }
        if (arg1 >= -89) {
            field3378 = null;
        }
        arg0.field3823 = 0;
        arg0.field3807 = arg0.field3770;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method1342(int arg0) {
        field3374++;
        if (!class95.field1714) {
            return;
        }
        class95.field1714 = false;
        class68.field1241 = null;
        class56.field930 = null;
        if (arg0 != 1) {
            field3378 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static void method1343(boolean arg0) {
        field3377 = null;
        field3376 = null;
        field3379 = null;
        if (arg0) {
            field3383 = null;
            field3380 = null;
            field3378 = null;
            field3381 = null;
        }
    }
}
