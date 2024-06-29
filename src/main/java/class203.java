import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class203 implements Runnable {

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Z")
    public boolean field3455 = true;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field3452 = new Object();

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field3464 = 0;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
    public int[] field3463 = new int[500];

    @OriginalMember(owner = "client!db", name = "n", descriptor = "[I")
    public int[] field3465 = new int[500];

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3454 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lul;")
    public static class51 field3453 = new class51(4);

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lc;")
    public static class331 field3460 = new class331();

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3461 = "green:";

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lkh;")
    public static class17 field3462;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1524(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class90.field1428 && arg2 <= class135.field2358) {
            int var5 = class105.method899(false, class310.field4916, class170.field2944, arg1);
            int var6 = class105.method899(false, class310.field4916, class170.field2944, arg3);
            class248.method1740(0, arg2, var6, var5, arg4);
        }
        if (arg0 == -29775) {
            field3458++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 23)
    public static void method1525(int arg0) {
        field3462 = null;
        field3453 = null;
        field3461 = null;
        field3460 = null;
        if (arg0 != 0) {
            method1526(55);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 38)
    public static final void method1526(int arg0) {
        if (arg0 != -27860) {
            method1524(22, -102, -102, -100, -60);
        }
        field3456++;
        class57.field882.method470(12);
        class250.field4053.method470(12);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lcg;ILcg;)V", line = 62)
    public static final void method1527(class49 arg0, int arg1, class49 arg2) {
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = -23 % ((-arg1 - 27) / 33);
        class74.field1214 = arg0;
        class35.field496 = arg2;
        class74.field1214.method455(34, true);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class34.field486 = var5 + var6;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        field3457++;
        class308.field4900 = var3 + var6;
        class248.field4029 = var6 + var7;
    }

    @OriginalMember(owner = "client!db", name = "run", descriptor = "()V", line = 91)
    public final void run() {
        while (this.field3455) {
            Object var1 = this.field3452;
            synchronized (this.field3452) {
                if (this.field3464 < 500) {
                    this.field3463[this.field3464] = class284.field4508;
                    this.field3465[this.field3464] = class258.field4182;
                    this.field3464++;
                }
            }
            class142.method1149(50L, (byte) 124);
        }
        field3459++;
    }
}
