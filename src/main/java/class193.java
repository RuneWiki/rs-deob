import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class193 extends class286 {

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    private int field3305 = 32768;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "Lbe;")
    public static class283 field3304 = class153.method941(-114, "weiss:");

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)[[I", line = 7)
    public final int[][] method16(int arg0, byte arg1) {
        field3309++;
        if (arg1 != -19) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[] var4 = this.method1963(arg0, 1, arg1 ^ 0x12);
            int[] var5 = this.method1963(arg0, 2, -1);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class27.field410; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field3305 >> 12;
                int var12 = class33.field490[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class284.field4857;
                int var14 = class133.field2236[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + arg0 & class126.field2100;
                int[][] var16 = this.method1964(var15, 0, false);
                var7[var9] = var16[0][var13];
                var6[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I", line = 61)
    public final int[] method14(int arg0, int arg1) {
        field3307++;
        if (arg0 > -52) {
            return (int[]) null;
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(arg1, 1, -1);
            int[] var5 = this.method1963(arg1, 2, -1);
            for (int var6 = 0; var6 < class27.field410; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field3305 >> 12;
                int var9 = class33.field490[var7] * var8 >> 12;
                int var10 = class284.field4857 & (var9 >> 12) + var6;
                int var11 = class133.field2236[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg1 & class126.field2100;
                int[] var13 = this.method1963(var12, 0, -1);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V", line = 118)
    public final void method276(int arg0) {
        field3302++;
        if (arg0 == 3) {
            class86.method555(4096);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 131)
    public class193() {
        super(3, false);
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V", line = 135)
    public static void method1246(int arg0) {
        field3304 = null;
        if (arg0 <= 20) {
            field3304 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "i", descriptor = "(I)V", line = 146)
    public static final void method1247(int arg0) {
        field3308++;
        if (class194.field3316 == arg0) {
            return;
        }
        try {
            if (++class166.field2773 > 2000) {
                if (class263.field4484 != null) {
                    class263.field4484.method1282(true);
                    class263.field4484 = null;
                }
                if (class62.field862 >= 1) {
                    class2.field20 = -5;
                    class194.field3316 = 0;
                    return;
                }
                if (class53.field714 == class13.field138) {
                    class53.field714 = class54.field721;
                } else {
                    class53.field714 = class13.field138;
                }
                class62.field862++;
                class166.field2773 = 0;
                class194.field3316 = 1;
            }
            if (class194.field3316 == 1) {
                class145.field2400 = class150.field2460.method1692(class62.field866, class53.field714, 67);
                class194.field3316 = 2;
            }
            if (class194.field3316 == 2) {
                if (class145.field2400.field5293 == 2) {
                    throw new IOException();
                }
                if (class145.field2400.field5293 != 1) {
                    return;
                }
                class263.field4484 = new class199((Socket) class145.field2400.field5296, class150.field2460);
                class145.field2400 = null;
                class263.field4484.method1278(class228.field3831.field3905, class228.field3831.field3879, 0, (byte) -37);
                if (class60.field827 != null) {
                    class60.field827.method1473(2134);
                }
                if (class155.field2561 != null) {
                    class155.field2561.method1473(arg0 ^ 0x856);
                }
                int var1 = class263.field4484.method1280((byte) 63);
                if (class60.field827 != null) {
                    class60.field827.method1473(2134);
                }
                if (class155.field2561 != null) {
                    class155.field2561.method1473(arg0 + 2134);
                }
                if (var1 != 21) {
                    class194.field3316 = 0;
                    class2.field20 = var1;
                    class263.field4484.method1282(true);
                    class263.field4484 = null;
                    return;
                }
                class194.field3316 = 3;
            }
            if (class194.field3316 == 3) {
                if (class263.field4484.method1284(-1) < 1) {
                    return;
                }
                class67.field936 = new class283[class263.field4484.method1280((byte) 63)];
                class194.field3316 = 4;
            }
            if (class194.field3316 == 4) {
                if (class263.field4484.method1284(-1) < class67.field936.length * 8) {
                    return;
                }
                class262.field4462.field3905 = 0;
                class263.field4484.method1279(0, class262.field4462.field3879, class67.field936.length * 8, -85);
                for (int var2 = 0; var2 < class67.field936.length; var2++) {
                    class67.field936[var2] = class232.method1567(class262.field4462.method1495((byte) 79), -32);
                }
                class194.field3316 = 0;
                class2.field20 = 21;
                class263.field4484.method1282(true);
                class263.field4484 = null;
                return;
            }
        } catch (IOException var4) {
            if (class263.field4484 != null) {
                class263.field4484.method1282(true);
                class263.field4484 = null;
            }
            if (class62.field862 < 1) {
                class62.field862++;
                if (class53.field714 == class13.field138) {
                    class53.field714 = class54.field721;
                } else {
                    class53.field714 = class13.field138;
                }
                class194.field3316 = 1;
                class166.field2773 = 0;
            } else {
                class194.field3316 = 0;
                class2.field20 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)Z", line = 299)
    public static final boolean method1248(byte arg0) {
        field3306++;
        try {
            if (arg0 <= 115) {
                method1247(115);
            }
            if (class237.field3965 == 2) {
                if (class44.field607 == null) {
                    class44.field607 = class156.method954(class220.field3709, class203.field3465, class281.field4722);
                    if (class44.field607 == null) {
                        return false;
                    }
                }
                if (class246.field4175 == null) {
                    class246.field4175 = new class272(class140.field2336, class236.field3950);
                }
                if (class254.field4298.method146(class44.field607, class246.field4175, -30392, 22050, class243.field4107)) {
                    class254.field4298.method138(84);
                    class254.field4298.method153(false, class113.field1909);
                    class254.field4298.method155((byte) -126, class175.field3016, class44.field607);
                    class237.field3965 = 0;
                    class220.field3709 = null;
                    class246.field4175 = null;
                    class44.field607 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class254.field4298.method125((byte) -83);
            class237.field3965 = 0;
            class246.field4175 = null;
            class44.field607 = null;
            class220.field3709 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lfe;ZI)V", line = 372)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field3300++;
        if (arg2 == 0) {
            this.field3305 = arg0.method1496(true) << 4;
        } else if (arg2 == 1) {
            this.field4876 = arg0.method1535((byte) 81) == 1;
        }
        if (arg1) {
            field3301 = 112;
        }
    }
}
