import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class175 {

    @OriginalMember(owner = "client!td", name = "y", descriptor = "[B")
    private byte[] field3609 = new byte[4];

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Lje;")
    private class87 field3605;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "J")
    private long field3595;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lgg;")
    public static class63 field3588 = class116.method911(43, " weitere Optionen");

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lgg;")
    public static class63 field3585 = class116.method911(43, "(U0a )2 in: ");

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Lgg;")
    public static class63 field3594 = class116.method911(43, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lgg;")
    public static class63 field3587 = class116.method911(43, "_");

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lgg;")
    private static class63 field3596 = class116.method911(43, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Lgg;")
    public static class63 field3607 = field3596;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "[I")
    public static int[] field3597 = new int[2000];

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3589 = 0;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    private int field3600;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lbc;")
    public static class14 field3590;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3599;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "[B")
    private byte[] field3604;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Lgg;")
    public static final class63 method1162(byte arg0, int arg1) {
        if (arg0 != -126) {
            method1165((byte) -84, 79);
        }
        field3592++;
        return class158.method1095(false, 10, arg1, (byte) 87);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)[B")
    public final byte[] method1163(boolean arg0) throws IOException {
        if (arg0) {
            return null;
        }
        field3593++;
        if (this.field3595 < class198.method1295((byte) 117)) {
            throw new IOException("fdt");
        }
        if (this.field3602 == 0) {
            if (this.field3605.field2058 == 2) {
                throw new IOException("fds");
            }
            if (this.field3605.field2058 == 1) {
                this.field3602 = 1;
                this.field3599 = (DataInputStream) this.field3605.field2060;
            }
        }
        if (this.field3602 == 1) {
            int var2 = this.field3599.available();
            if (var2 > 0) {
                if (this.field3608 + var2 > 4) {
                    var2 = 4 - this.field3608;
                }
                this.field3608 += this.field3599.read(this.field3609, this.field3608, var2);
                if (this.field3608 == 4) {
                    int var3 = (new class3(this.field3609)).method56(-1);
                    this.field3602 = 2;
                    this.field3604 = new byte[var3];
                }
            }
        }
        if (this.field3602 == 2) {
            int var4 = this.field3599.available();
            if (var4 > 0) {
                if (this.field3600 + var4 > this.field3604.length) {
                    var4 = this.field3604.length - this.field3600;
                }
                this.field3600 += this.field3599.read(this.field3604, this.field3600, var4);
                if (this.field3604.length == this.field3600) {
                    return this.field3604;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method1164(byte arg0) {
        field3585 = null;
        if (arg0 < 22) {
            method1164((byte) 87);
        }
        field3607 = null;
        field3596 = null;
        field3590 = null;
        field3594 = null;
        field3597 = null;
        field3587 = null;
        field3588 = null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)Z")
    public static final boolean method1165(byte arg0, int arg1) {
        field3598++;
        if (arg1 < 32) {
            return false;
        } else if (arg0 > -31) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILgg;III)V")
    public static final void method1166(int arg0, class63 arg1, int arg2, int arg3, int arg4) {
        class54 var5 = class12.method149(arg3, arg0, 12226);
        field3586++;
        if (var5 == null) {
            return;
        }
        if (var5.field1311 != null) {
            class131 var6 = new class131();
            var6.field2853 = var5.field1311;
            var6.field2862 = var5;
            var6.field2857 = arg2;
            var6.field2861 = arg1;
            class130.method963(var6, (byte) -87);
        }
        boolean var7 = true;
        if (arg4 != 17120) {
            method1168(-39, 13, 9, -14, -113, 46, -100);
        }
        if (var5.field1367 > 0) {
            var7 = class170.method1146(var5, (byte) -120);
        }
        if (!var7 || !class65.method615(arg2 - 1, (byte) 120, class10.method136((byte) -110, var5))) {
            return;
        }
        if (arg2 == 1) {
            class52.field1276++;
            class141.field3031.method854(217, true);
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) -87);
        }
        if (arg2 == 2) {
            class141.field3031.method854(53, true);
            class27.field608++;
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) -117);
        }
        if (arg2 == 3) {
            class51.field1232++;
            class141.field3031.method854(21, true);
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) -118);
        }
        if (arg2 == 4) {
            class141.field3031.method854(25, true);
            class41.field951++;
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) 63);
        }
        if (arg2 == 5) {
            class88.field2067++;
            class141.field3031.method854(37, true);
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) 44);
        }
        if (arg2 == 6) {
            class141.field3031.method854(97, true);
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) 96);
            class51.field1234++;
        }
        if (arg2 == 7) {
            class141.field3031.method854(140, true);
            class141.field3031.method76(arg0, (byte) 114);
            class122.field2692++;
            class141.field3031.method62(arg3, (byte) 54);
        }
        if (arg2 == 8) {
            class141.field3031.method854(54, true);
            class48.field1184++;
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) -94);
        }
        if (arg2 == 9) {
            class141.field3031.method854(101, true);
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) -94);
            class24.field552++;
        }
        if (arg2 == 10) {
            class141.field3031.method854(96, true);
            class135.field2915++;
            class141.field3031.method76(arg0, (byte) 114);
            class141.field3031.method62(arg3, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
    public static final int method1167(int arg0, int arg1, int arg2) {
        field3591++;
        if (arg1 != -25170) {
            field3587 = null;
        }
        class90 var3 = (class90) class110.field2484.method694(-23979, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2099.length; var5++) {
                if (var3.field2102[var5] == arg0) {
                    var4 += var3.field2099[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lqe;Ljava/net/URL;)V")
    public class175(class149 arg0, URL arg1) {
        this.field3605 = arg0.method1041(100, arg1);
        this.field3602 = 0;
        this.field3595 = class198.method1295((byte) 40) + 30000L;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 29878) {
            field3607 = null;
        }
        int var7 = 2048 - arg2 & 0x7FF;
        field3603++;
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg6;
        if (var8 != 0) {
            int var12 = class25.field571[var8];
            int var13 = class25.field576[var8];
            int var14 = var10 * var13 - arg6 * var12 >> 16;
            var11 = var10 * var12 + arg6 * var13 >> 16;
            var10 = var14;
        }
        if (var7 != 0) {
            int var15 = class25.field571[var7];
            int var16 = class25.field576[var7];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class35.field828 = arg0 - var9;
        class123.field2719 = arg3;
        class32.field778 = arg2;
        class39.field924 = arg5 - var10;
        class21.field491 = arg1 - var11;
    }
}
