import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class647 implements class503 {

    @OriginalMember(owner = "client!it", name = "k", descriptor = "Lao;")
    private class289 field8908;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public int field8904;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public int field8901;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "[I")
    public int[] field8910;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "Lru;")
    private class194 field8903;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "[F")
    public float[] field8898;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "Z")
    public static volatile boolean field8905 = true;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "Z")
    public static boolean field8907 = false;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Lat;")
    public static class378 field8909 = null;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "F")
    public static float field8899;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 3)
    public static void method3672(int arg0) {
        if (arg0 == -2001) {
            field8909 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)I", line = 14)
    public static final int method3673(int arg0, byte arg1) {
        int var2 = 20 / ((arg1 + 4) / 37);
        field8906++;
        byte var3;
        if (arg0 > 12000) {
            class405.method2525(73);
            var3 = 4;
        } else if (arg0 > 5000) {
            class439.method2649((byte) -59);
            var3 = 3;
        } else if (arg0 <= 2000) {
            var3 = 1;
            class76.method709(0, true);
        } else {
            var3 = 2;
            class670.method3765(true);
        }
        if (class693.field9368.field4468.method1099(-32350) != 2) {
            class693.field9368.method2065((byte) 74, class693.field9368.field4448, 2);
            class171.method1284(false, (byte) 119, 2);
        }
        class310.method2019(37);
        return var3;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIZZ)V", line = 70)
    public final void method2958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field8902++;
        class352.method2215(this.field8908.field4012.field6959, arg1, arg0, arg5, arg7 ? this.field8908.field4045 : null, arg6 ? this.field8910 : null, arg2, 115, arg3, this.field8908.field4012.field6960, this.field8904, arg4, arg7 ? this.field8898 : null);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(IIIIIIZZ)V", line = 79)
    public final void method2959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field8900++;
        class352.method2215(this.field8910, arg1, arg0, arg5, arg7 ? this.field8898 : null, arg6 ? this.field8908.field4012.field6959 : null, arg2, 113, arg3, this.field8904, this.field8908.field4012.field6960, arg4, arg7 ? this.field8908.field4045 : null);
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lao;Lmi;Lru;)V", line = 101)
    public class647(class289 arg0, class496 arg1, class194 arg2) {
        this.field8908 = arg0;
        if ((arg1 instanceof class188)) {
            class188 var5 = (class188) arg1;
            this.field8910 = var5.field2813;
            this.field8901 = var5.field8096;
            this.field8904 = var5.field8097;
        } else if ((arg1 instanceof class379)) {
            class379 var4 = (class379) arg1;
            this.field8904 = var4.field8097;
            this.field8901 = var4.field8096;
            this.field8910 = var4.field5519;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field8903 = arg2;
            if (this.field8903.field2862 != this.field8904 || this.field8903.field2866 != this.field8901) {
                throw new RuntimeException();
            }
            this.field8898 = this.field8903.field2868;
        }
    }
}
