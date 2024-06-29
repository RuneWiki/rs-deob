import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class261 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[I")
    private int[] field3853;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field3855 = -1;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Z")
    public static boolean field3860 = false;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3859 = 0;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Ltj;")
    public static class108 field3861;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lkg;")
    public static class148 field3856;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILtj;Ltj;)V", line = 3)
    public static final void method1800(int arg0, class108 arg1, class108 arg2) {
        field3858++;
        class323.field4706 = arg2;
        if (arg0 != 65408) {
            method1802(-72);
        }
        class435.field6210 = arg1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(DZ)V", line = 24)
    public static final void method1801(double arg0, boolean arg1) {
        if (class392.field5517 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class451.field6466[var3] = var4 > 255 ? 255 : var4;
            }
            class392.field5517 = arg0;
        }
        field3862++;
        if (arg1) {
            method1800(-115, (class108) null, (class108) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([I)V", line = 52)
    public class261(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3853 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3853[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3853[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3853[var5 + var5] = arg0[var4];
            this.field3853[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 87)
    public static void method1802(int arg0) {
        field3861 = null;
        field3856 = null;
        if (arg0 != -24337) {
            method1802(49);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLvq;)V", line = 99)
    public static final void method1803(byte arg0, class269 arg1) {
        if (class359.field5185) {
            class99.method578(arg1, 0);
        } else {
            class136.method1046(arg1, (byte) 104);
        }
        field3864++;
        if (arg0 >= -45) {
            method1805(-79, -68, -3);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I", line = 115)
    public final int method1804(int arg0, int arg1) {
        field3857++;
        int var3 = (this.field3853.length >> 1) - 1;
        int var4 = var3 & arg0;
        int var5 = -76 / ((28 - arg1) / 60);
        while (true) {
            int var6 = this.field3853[var4 + var4 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field3853[var4 + var4] == arg0) {
                return var6;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I", line = 156)
    public static final int method1805(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field3854++;
        if (arg1 != -1) {
            return -67;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
