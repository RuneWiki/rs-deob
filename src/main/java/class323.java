import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class323 implements class437 {

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "Z")
    public boolean field4472;

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
    public int field4481;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
    public int field4482;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "Lec;")
    public class236 field4483;

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "Lsd;")
    public class95 field4480;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
    public static int field4477 = 0;

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "I")
    public static int field4488 = 0;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "Leq;")
    public static class213 field4473 = new class213(8);

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "Lcs;")
    public static class342 field4479;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(B)V")
    public static void method2068(byte arg0) {
        field4479 = null;
        if (arg0 != -22) {
            method2070(127, -73, -7, -77, -85, 79);
        }
        field4473 = null;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)Lad;")
    public final class426 method119(byte arg0) {
        if (arg0 <= 116) {
            return null;
        } else {
            field4485++;
            return class515.field7183;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method2069(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4474++;
        if (!class728.field9848 || !class151.field2492) {
            return false;
        } else if (class399.field5890 < 100) {
            return false;
        } else if (class393.method2471(arg2, arg4, (byte) -97, arg0)) {
            int var5 = arg4 << class130.field2185;
            int var6 = arg0 << class130.field2185;
            if (arg3 != -79) {
                field4477 = 64;
            }
            if (class343.method2166(arg1, class1.field3, var6, var5, class683.field9250[arg2].method1851((byte) -86, arg0, arg4), class1.field3, 18507)) {
                class528.field7302++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIII)V")
    public static final void method2070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg0; var6++) {
            class47.method550(-27, arg2, class691.field9345[var6], arg3, arg5);
        }
        if (arg1 != 0) {
            field4488 = 29;
        }
        field4484++;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(ILsd;Lec;IIIIIIIZ)V")
    public class323(int arg0, class95 arg1, class236 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field4472 = arg10;
        this.field4481 = arg6;
        this.field4476 = arg0;
        this.field4482 = arg3;
        this.field4471 = arg7;
        this.field4487 = arg5;
        this.field4478 = arg4;
        this.field4475 = arg9;
        this.field4483 = arg2;
        this.field4486 = arg8;
        this.field4480 = arg1;
    }
}
