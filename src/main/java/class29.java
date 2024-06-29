import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class29 {

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "Ljs;")
    public class306 field471 = null;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "[Lak;")
    private class324[] field473 = null;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "[Lak;")
    public class324[] field474 = null;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "Z")
    public boolean field472;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "Z")
    public static boolean field477 = false;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "Ldb;")
    public static class298 field475 = new class298(24, -1);

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "Ldb;")
    public static class298 field482 = new class298(10, -1);

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "F")
    public static float field480;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "Lbi;")
    public static class449 field481;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "Lww;")
    public static class686 field478;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method246(int arg0) {
        if (arg0 != 16) {
            return true;
        }
        field479++;
        if (this.field472) {
            return this.field471 != null;
        } else {
            return this.field474 != null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "([IBIILno;[I)Lon;", line = 23)
    public static final class311 method247(int[] arg0, byte arg1, int arg2, int arg3, class658 arg4, int[] arg5) {
        if (arg1 != -1) {
            field476 = 70;
        }
        field470++;
        byte[] var6 = new byte[arg2 * arg3];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg2 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class311(arg4, arg2, arg3, var6);
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lej;)V", line = 77)
    public class29(class111 arg0) {
        this.field472 = arg0.field1836;
        if (this.field472 && !arg0.method34(class98.field1488, class294.field4160, 0)) {
            this.field472 = false;
        }
        if (this.field472 || arg0.method69(class98.field1488, true, class294.field4160)) {
            class91.method726((byte) -121);
            if (this.field472) {
                byte[] var6 = class50.method338(false, class218.field3098, 15900);
                this.field471 = arg0.method92((byte) 0, var6, 128, 128, class98.field1488, 16);
                byte[] var7 = class50.method338(false, class586.field7774, 15900);
                arg0.method92((byte) 0, var7, 128, 128, class98.field1488, 16);
            } else {
                this.field474 = new class324[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class227.method1422(32768, var2 * 128 * 256, class218.field3098, false);
                    this.field474[var2] = arg0.method884((byte) 96, true, 128, var5, class98.field1488, 128);
                }
                this.field473 = new class324[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class227.method1422(32768, var3 * 16384 * 2, class586.field7774, false);
                    this.field473[var3] = arg0.method884((byte) 96, true, 128, var4, class98.field1488, 128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V", line = 61)
    public static void method248(int arg0) {
        field481 = null;
        if (arg0 != -19589) {
            field480 = 0.57876605F;
        }
        field475 = null;
        field478 = null;
        field482 = null;
    }
}
