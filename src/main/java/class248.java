import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class248 extends class96 {

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public int field3556 = 12800;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public int field3553 = 12800;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public int field3545 = 0;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public int field3549 = -1;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public int field3551 = -1;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    public int field3560 = 0;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Z")
    public boolean field3562 = true;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "Ljava/lang/String;")
    public String field3546;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "Ljava/lang/String;")
    public String field3558;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "Lum;")
    public class347 field3557;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "Ltq;")
    public static class426 field3548 = new class426(3, 2);

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "Lpp;")
    public static class256 field3563 = new class256("", 12);

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "Lir;")
    public static class22 field3564;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([IIII)Z", line = 3)
    public final boolean method1541(int[] arg0, int arg1, int arg2, int arg3) {
        field3561++;
        if (arg3 != -31921) {
            method1547(-116, 22, -128, -127, -112);
        }
        for (class39 var5 = (class39) this.field3557.method2096(-21400); var5 != null; var5 = (class39) this.field3557.method2084((byte) 19)) {
            if (var5.method301(arg2, true, arg1)) {
                var5.method303(2, arg1, arg2, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 32)
    public static void method1542(int arg0) {
        if (arg0 != 0) {
            field3563 = null;
        }
        field3564 = null;
        field3548 = null;
        field3563 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "([IIII)Z", line = 49)
    public final boolean method1543(int[] arg0, int arg1, int arg2, int arg3) {
        field3550++;
        if (arg3 != -21161) {
            return true;
        }
        for (class39 var5 = (class39) this.field3557.method2096(-21400); var5 != null; var5 = (class39) this.field3557.method2084((byte) 19)) {
            if (var5.method300(-153, arg1, arg2)) {
                var5.method302(arg3 + 21161, arg0, arg1, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[IIII)Z", line = 76)
    public final boolean method1544(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3544++;
        class39 var6 = (class39) this.field3557.method2096(-21400);
        if (arg3 != -15842) {
            this.method1541(null, 57, -104, 77);
        }
        while (var6 != null) {
            if (var6.method305(arg0, arg4, false, arg2)) {
                var6.method303(2, arg4, arg0, arg1);
                return true;
            }
            var6 = (class39) this.field3557.method2084((byte) 19);
        }
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)Z", line = 104)
    public final boolean method1545(int arg0, int arg1, int arg2) {
        int var4 = -51 / ((arg1 + 29) / 63);
        field3559++;
        for (class39 var5 = (class39) this.field3557.method2096(-21400); var5 != null; var5 = (class39) this.field3557.method2084((byte) 19)) {
            if (var5.method301(arg2, true, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 319)
    public class248(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3562 = arg5;
        this.field3546 = arg1;
        this.field3543 = arg0;
        this.field3551 = arg4;
        this.field3558 = arg2;
        this.field3554 = arg3;
        this.field3549 = arg6;
        if (this.field3549 == 255) {
            this.field3549 = 0;
        }
        this.field3557 = new class347();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BJ)V", line = 145)
    public static final void method1546(byte arg0, long arg1) {
        field3555++;
        int var3 = class305.field4424 + class415.field6145.field2959;
        int var4 = class415.field6145.field2966 + class407.field5976;
        if ((class318.field4665 - var3) < -500 || (class318.field4665 - var3) > 500 || class356.field5150 - var4 < -500 || class356.field5150 - var4 > 500) {
            class318.field4665 = var3;
            class356.field5150 = var4;
        }
        if (arg0 > -73) {
            return;
        }
        if (class318.field4665 != var3) {
            int var5 = var3 - class318.field4665;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class318.field4665 += var6;
        }
        if (class356.field5150 != var4) {
            int var7 = var4 - class356.field5150;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class356.field5150 += var8;
        }
        if (!class118.field1533.field6908) {
            class473.field6841 += (float) arg1 * class107.field1432 / 6.0F;
            class506.field7722 += (float) arg1 * class242.field3485 / 6.0F;
        }
        class493.method2965((byte) 124);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V", line = 244)
    public static final void method1547(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 320) {
            method1546((byte) -104, -96L);
        }
        field3552++;
        for (int var5 = 0; var5 < class55.field845; var5++) {
            Rectangle var6 = class309.field4495[var5];
            if (arg1 < var6.x + var6.width && var6.x < (arg0 + arg1) && arg3 < var6.y + var6.height && var6.y < arg3 + arg4) {
                class61.field909[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V", line = 274)
    public final void method1548(int arg0) {
        this.field3556 = 12800;
        this.field3553 = 12800;
        if (arg0 != -28825) {
            method1542(17);
        }
        field3547++;
        this.field3545 = 0;
        this.field3560 = 0;
        for (class39 var2 = (class39) this.field3557.method2096(-21400); var2 != null; var2 = (class39) this.field3557.method2084((byte) 19)) {
            if (this.field3545 < var2.field603) {
                this.field3545 = var2.field603;
            }
            if (this.field3553 > var2.field598) {
                this.field3553 = var2.field598;
            }
            if (var2.field596 > this.field3560) {
                this.field3560 = var2.field596;
            }
            if (var2.field601 < this.field3556) {
                this.field3556 = var2.field601;
            }
        }
    }
}
