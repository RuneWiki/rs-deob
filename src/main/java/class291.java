import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class291 extends class36 {

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public int field4023 = 0;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public int field4029 = 12800;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public int field4028 = 12800;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public int field4018 = 0;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public int field4034 = -1;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public int field4037 = -1;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "Z")
    public boolean field4036 = true;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Ljava/lang/String;")
    public String field4019;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Ljava/lang/String;")
    public String field4039;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "Leea;")
    public class114 field4031;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "[F")
    public static float[] field4030 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "Lll;")
    public static class308 field4035;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBI)Z", line = 5)
    public final boolean method1878(int arg0, byte arg1, int arg2) {
        field4024++;
        if (arg1 != -99) {
            method1884(null, true);
        }
        for (class72 var4 = (class72) this.field4031.method719(false); var4 != null; var4 = (class72) this.field4031.method716(14)) {
            if (var4.method480(arg2, 9116, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI[II)Z", line = 29)
    public final boolean method1879(byte arg0, int arg1, int[] arg2, int arg3) {
        field4038++;
        if (arg0 <= 10) {
            field4026 = -16;
        }
        for (class72 var5 = (class72) this.field4031.method719(false); var5 != null; var5 = (class72) this.field4031.method716(14)) {
            if (var5.method480(arg1, 9116, arg3)) {
                var5.method482(arg1, arg2, arg3, 2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 56)
    public static void method1880(byte arg0) {
        if (arg0 != -94) {
            method1880((byte) 57);
        }
        field4035 = null;
        field4030 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[III)Z", line = 69)
    public final boolean method1881(int arg0, int[] arg1, int arg2, int arg3) {
        field4032++;
        for (class72 var5 = (class72) this.field4031.method719(false); var5 != null; var5 = (class72) this.field4031.method716(14)) {
            if (var5.method483(arg0, arg2, arg3 ^ 0xB775)) {
                var5.method478(true, arg2, arg1, arg0);
                return true;
            }
        }
        if (arg3 != 12800) {
            this.method1882((byte) 74);
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 94)
    public final void method1882(byte arg0) {
        this.field4029 = 12800;
        if (arg0 != 16) {
            this.method1878(-51, (byte) -72, 17);
        }
        this.field4023 = 0;
        this.field4018 = 0;
        this.field4028 = 12800;
        field4021++;
        for (class72 var2 = (class72) this.field4031.method719(false); var2 != null; var2 = (class72) this.field4031.method716(14)) {
            if (this.field4018 < var2.field766) {
                this.field4018 = var2.field766;
            }
            if (this.field4028 > var2.field765) {
                this.field4028 = var2.field765;
            }
            if (var2.field761 > this.field4023) {
                this.field4023 = var2.field761;
            }
            if (var2.field758 < this.field4029) {
                this.field4029 = var2.field758;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII[I)Z", line = 136)
    public final boolean method1883(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4027++;
        if (arg2 != 0) {
            return false;
        }
        for (class72 var6 = (class72) this.field4031.method719(false); var6 != null; var6 = (class72) this.field4031.method716(arg2 ^ 0xE)) {
            if (var6.method479(arg1, false, arg3, arg0)) {
                var6.method482(arg0, arg4, arg3, 2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 215)
    public class291(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4036 = arg5;
        this.field4037 = arg4;
        this.field4022 = arg3;
        this.field4025 = arg0;
        this.field4034 = arg6;
        this.field4019 = arg2;
        this.field4039 = arg1;
        if (this.field4034 == 255) {
            this.field4034 = 0;
        }
        this.field4031 = new class114();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;Z)Lnr;", line = 199)
    public static final class52 method1884(Component arg0, boolean arg1) {
        field4020++;
        if (!arg1) {
            field4026 = -56;
        }
        return new class582(arg0);
    }
}
