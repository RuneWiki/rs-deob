import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class184 implements Runnable {

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Z")
    public boolean field3323 = true;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field3322 = new Object();

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
    public int[] field3330 = new int[500];

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
    public int[] field3328 = new int[500];

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public int field3329 = 0;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "[[[I")
    public static int[][][] field3319 = new int[4][13][13];

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lid;")
    public static class149 field3318 = class60.method382("::rebuild", (byte) 89);

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3320 = 0;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field3327 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lal;")
    public static class230 field3324;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[B")
    public static byte[] field3325;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[Lsi;")
    public static class198[] field3326;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method1272(int arg0) {
        field3318 = null;
        field3324 = null;
        field3319 = null;
        field3326 = null;
        if (arg0 != 4) {
            field3321 = -56;
        }
        field3325 = null;
    }

    @OriginalMember(owner = "client!ag", name = "run", descriptor = "()V")
    public final void run() {
        field3317++;
        while (this.field3323) {
            Object var1 = this.field3322;
            synchronized (this.field3322) {
                if (this.field3329 < 500) {
                    this.field3330[this.field3329] = class49.field883;
                    this.field3328[this.field3329] = class285.field5068;
                    this.field3329++;
                }
            }
            class151.method1074(-128, 50L);
        }
    }
}
