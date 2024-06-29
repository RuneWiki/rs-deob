import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class125 extends class26 {

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "[J")
    private long[] field1806 = new long[10];

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    private int field1809 = 0;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    private int field1808 = 1;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    private int field1805 = 256;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "J")
    private long field1802 = class219.method1609(-898);

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
    public static int[] field1800 = new int[128];

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field1810 = 0;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "J")
    public static volatile long field1803 = 0L;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "C")
    public static char field1814;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "[Lv;")
    public static class263[] field1815;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V", line = 4)
    public static final void method908() {
        GL var0 = class109.field1456;
        var0.glDisableClientState(32886);
        class109.method749(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class109.method768();
        for (int var1 = 0; var1 < class18.field288[0].length; var1++) {
            class247 var2 = class18.field288[0][var1];
            if (var2.field3889 >= 0 && class144.method1071(-125, class31.field466.method453(255, var2.field3889))) {
                var0.glColor4fv(class30.method270(var2.field3886, (byte) -116), 0);
                float var3 = 201.5F - (var2.field3891 ? 1.0F : 0.5F);
                var2.method1780(class83.field1138, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class109.method751();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class109.method776();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I", line = 47)
    public final int method244(int arg0, int arg1, int arg2) {
        if (arg0 != 15) {
            return -3;
        }
        int var4 = this.field1808;
        field1799++;
        this.field1808 = 1;
        int var5 = this.field1805;
        this.field1805 = 300;
        this.field1802 = class219.method1609(-898);
        if (this.field1806[this.field1811] == 0L) {
            this.field1805 = var5;
            this.field1808 = var4;
        } else if (this.field1802 > this.field1806[this.field1811]) {
            this.field1805 = (int) ((long) (arg2 * 2560) / (this.field1802 - this.field1806[this.field1811]));
        }
        if (this.field1805 < 25) {
            this.field1805 = 25;
        }
        if (this.field1805 > 256) {
            this.field1805 = 256;
            this.field1808 = (int) ((long) arg2 - (this.field1802 - this.field1806[this.field1811]) / 10L);
        }
        if (this.field1808 > arg2) {
            this.field1808 = arg2;
        }
        this.field1806[this.field1811] = this.field1802;
        this.field1811 = (this.field1811 + 1) % 10;
        if (this.field1808 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1806[var6] != 0L) {
                    this.field1806[var6] += (long) this.field1808;
                }
            }
        }
        int var7 = 0;
        if (arg1 > this.field1808) {
            this.field1808 = arg1;
        }
        class272.method1918((byte) 22, (long) this.field1808);
        while (this.field1809 < 256) {
            var7++;
            this.field1809 += this.field1805;
        }
        this.field1809 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILug;I)[Lun;", line = 124)
    public static final class190[] method909(int arg0, int arg1, class253 arg2, int arg3) {
        if (arg3 > -25) {
            return (class190[]) null;
        } else {
            field1807++;
            return class287.method2029(arg2, arg1, 2, arg0) ? class85.method617((byte) -28) : null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 139)
    public static final void method910(byte arg0) {
        if (arg0 != -48) {
            field1800 = (int[]) null;
        }
        int var1 = class111.field1544.method1950((byte) 78, 8);
        if (class232.field3631 > var1) {
            for (int var2 = var1; var2 < class232.field3631; var2++) {
                class263.field4121[class9.field171++] = class81.field1116[var2];
            }
        }
        field1813++;
        if (var1 > class232.field3631) {
            throw new RuntimeException("gppov1");
        }
        class232.field3631 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class81.field1116[var3];
            class337 var5 = class284.field4403[var4];
            int var6 = class111.field1544.method1950((byte) 110, 1);
            if (var6 == 0) {
                class81.field1116[class232.field3631++] = var4;
                var5.field4718 = class229.field3595;
            } else {
                int var7 = class111.field1544.method1950((byte) -33, 2);
                if (var7 == 0) {
                    class81.field1116[class232.field3631++] = var4;
                    var5.field4718 = class229.field3595;
                    class36.field526[class277.field4285++] = var4;
                } else if (var7 == 1) {
                    class81.field1116[class232.field3631++] = var4;
                    var5.field4718 = class229.field3595;
                    int var12 = class111.field1544.method1950((byte) -17, 3);
                    var5.method2095(1, -1, var12);
                    int var13 = class111.field1544.method1950((byte) 114, 1);
                    if (var13 == 1) {
                        class36.field526[class277.field4285++] = var4;
                    }
                } else if (var7 == 2) {
                    class81.field1116[class232.field3631++] = var4;
                    var5.field4718 = class229.field3595;
                    if (class111.field1544.method1950((byte) 96, 1) == 1) {
                        int var9 = class111.field1544.method1950((byte) 76, 3);
                        var5.method2095(2, -1, var9);
                        int var10 = class111.field1544.method1950((byte) -38, 3);
                        var5.method2095(2, -1, var10);
                    } else {
                        int var8 = class111.field1544.method1950((byte) -93, 3);
                        var5.method2095(0, -1, var8);
                    }
                    int var11 = class111.field1544.method1950((byte) 125, 1);
                    if (var11 == 1) {
                        class36.field526[class277.field4285++] = var4;
                    }
                } else if (var7 == 3) {
                    class263.field4121[class9.field171++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 256)
    public static void method911(int arg0) {
        if (arg0 != -9104) {
            method911(55);
        }
        field1800 = null;
        field1815 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 274)
    public static final String method912(boolean arg0, int arg1, int arg2) {
        field1801++;
        if (!arg0) {
            field1814 = (char) 65526;
        }
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 <= 0) {
            return "<col=ffff00>";
        } else {
            return "<col=c0ff00>";
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 313)
    public final void method243(byte arg0) {
        field1812++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1806[var2] = 0L;
        }
        int var3 = 116 % ((-arg0 - 51) / 36);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)V", line = 336)
    public static final void method913(byte arg0, int arg1) {
        field1804++;
        if (arg0 < -123) {
            class45.field603.method1353(-1, arg1);
            class25.field372.method1353(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 354)
    public class125() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1806[var1] = this.field1802;
        }
    }
}
