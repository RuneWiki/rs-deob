import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class289 {

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[B")
    private byte[] field4764 = new byte[4];

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lth;")
    private class275 field4749;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    private int field4761;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "J")
    private long field4753;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lck;")
    public static class119 field4754 = class298.method1987((byte) 8, "mem=");

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[I")
    public static int[] field4750 = new int[5];

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field4757 = 128;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lck;")
    public static class119 field4756 = class298.method1987((byte) 72, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4744 = 0;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lck;")
    public static class119 field4762 = class298.method1987((byte) 93, "floorshadows");

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "[Z")
    public static boolean[] field4760 = new boolean[112];

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[Lcd;")
    public static class169[] field4759 = new class169[500];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    private int field4758;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lmd;")
    public static class88 field4748;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field4745;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[B")
    private byte[] field4763;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[[[B")
    public static byte[][][] field4752;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1925(byte arg0) {
        field4751++;
        if (class124.field1913 == null) {
            return;
        }
        if (class198.field3166 < 10) {
            if (!class152.field2426.method279(class124.field1913, (byte) -118)) {
                class198.field3166 = class152.field2426.method278(class124.field1913, (byte) 77) / 10;
                return;
            }
            class37.method292(24100);
            class198.field3166 = 10;
        }
        if (class198.field3166 == 10) {
            class3 var1 = new class3(class152.field2426.method275(class240.field3851, false, class124.field1913));
            int var2 = var1.method63((byte) 1);
            int var3 = var1.method63((byte) 1);
            int var4 = var1.method63((byte) 1);
            int var5 = var1.method63((byte) 1);
            int var6 = var1.method63((byte) 1);
            int var7 = var1.method63((byte) 1);
            class126.field1938 = (var4 - var2) * 64 + 64;
            class258.field4137 = (var5 - var3) * 64 + 64;
            class142.field2263 = var2 * 64;
            class221.field3552 = var3 * 64;
            int var8 = (class124.field1917.field4949 >> 7) + class30.field421 - class142.field2263;
            int var9 = var8 + ((int) (Math.random() * 10.0D) - 5);
            class285.field4707 = 8.0D;
            class108.field1651 = 8.0D;
            int var10 = (class124.field1917.field4991 >> 7) + class189.field2995 - class221.field3552;
            int var11 = var10 + (int) (Math.random() * 10.0D) - 5;
            if (var9 >= 0 && class126.field1938 > var9 && var11 >= 0 && class258.field4137 > var11) {
                class257.field4133 = var9;
                class162.field2561 = class258.field4137 - var11;
            } else {
                class162.field2561 = class258.field4137 + class221.field3552 - (var7 * 64);
                class257.field4133 = var6 * 64 - class142.field2263;
            }
            class212.method1337((byte) 112);
            int var12 = class68.field1057 >> 2 << 10;
            int var13 = class126.field1938 >> 6;
            int var14 = class258.field4137 >> 6;
            class229.field3702 = new byte[var13][var14][];
            class158.field2507 = new int[var13][var14][];
            class85.field1275 = new int[var13][var14][];
            class236.field3796 = new byte[var13][var14][];
            class196.field3133 = new byte[var13][var14][];
            class144.field2294 = new byte[var13][var14][];
            class285.field4713 = new int[class82.field1255 + 1];
            int var15 = class164.field2584 >> 1;
            class39.field570 = new byte[var13][var14][];
            class283.field4674 = new byte[var13][var14][];
            for (int var16 = 0; var16 < class82.field1255; var16++) {
                class296 var17 = class158.method1009((byte) -128, var16);
                if (var17 != null) {
                    int var18 = var17.field4928;
                    if (var18 >= 0 && !class284.field4692.method131(var18, 64)) {
                        var18 = -1;
                    }
                    int var19;
                    if (var17.field4916 >= 0) {
                        int var23 = var17.field4916;
                        int var24 = (var23 & 0x7F) + var15;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > 127) {
                            var24 = 127;
                        }
                        int var25 = (var12 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                        var19 = class284.field4687[class25.method190(var25, 96, 2)];
                    } else if (var18 >= 0) {
                        var19 = class284.field4687[class25.method190(class284.field4692.method134(var18, 25505), 96, 2)];
                    } else if (var17.field4923 == -1) {
                        var19 = -1;
                    } else {
                        int var20 = var17.field4923;
                        int var21 = (var20 & 0x7F) + var15;
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 > 127) {
                            var21 = 127;
                        }
                        int var22 = (var12 + var20 & 0xFC00) + (var20 & 0x380) + var21;
                        var19 = class284.field4687[class25.method190(var22, 96, 2)];
                    }
                    class285.field4713[var16 + 1] = var19;
                }
            }
            class198.field3166 = 20;
        } else if (class198.field3166 == 20) {
            class128.method854((byte) 36, class152.field2426.method275(class81.field1244, false, class124.field1913));
            class198.field3166 = 30;
            class108.method698(true, (byte) 93);
            class184.method1173(32);
        } else {
            if (arg0 >= -8) {
                field4760 = (boolean[]) null;
            }
            if (class198.field3166 == 30) {
                class23.method182(class152.field2426.method275(class259.field4142, false, class124.field1913), -81);
                class198.field3166 = 40;
                class184.method1173(32);
            } else if (class198.field3166 == 40) {
                class98.method655(class152.field2426.method275(class42.field649, false, class124.field1913), (byte) 121);
                class198.field3166 = 50;
                class184.method1173(32);
            } else if (class198.field3166 == 50) {
                class207.method1305(class152.field2426.method275(class183.field2899, false, class124.field1913), 61794726);
                class198.field3166 = 60;
                class108.method698(true, (byte) 103);
                class184.method1173(32);
            } else if (class198.field3166 == 60) {
                class31.method233(92, class152.field2426.method275(class171.field2718, false, class124.field1913));
                class198.field3166 = 70;
                class184.method1173(32);
            } else if (class198.field3166 == 70) {
                class257.field4123 = new class294(11, true, class39.field587);
                class198.field3166 = 73;
                class108.method698(true, (byte) 107);
                class184.method1173(32);
            } else if (class198.field3166 == 73) {
                class189.field2986 = new class294(12, true, class39.field587);
                class198.field3166 = 76;
                class108.method698(true, (byte) 72);
                class184.method1173(32);
            } else if (class198.field3166 == 76) {
                class245.field3974 = new class294(14, true, class39.field587);
                class198.field3166 = 79;
                class108.method698(true, (byte) 101);
                class184.method1173(32);
            } else if (class198.field3166 == 79) {
                class84.field1270 = new class294(17, true, class39.field587);
                class198.field3166 = 82;
                class108.method698(true, (byte) 86);
                class184.method1173(32);
            } else if (class198.field3166 == 82) {
                class106.field1639 = new class294(19, true, class39.field587);
                class198.field3166 = 85;
                class108.method698(true, (byte) 84);
                class184.method1173(32);
            } else if (class198.field3166 == 85) {
                class95.field1463 = new class294(22, true, class39.field587);
                class198.field3166 = 88;
                class108.method698(true, (byte) 100);
                class184.method1173(32);
            } else if (class198.field3166 == 88) {
                class153.field2432 = new class294(26, true, class39.field587);
                class198.field3166 = 91;
                class108.method698(true, (byte) 75);
                class184.method1173(32);
            } else {
                class210.field3350 = new class294(30, true, class39.field587);
                class198.field3166 = 100;
                class108.method698(true, (byte) 114);
                class184.method1173(32);
                class19.field242 = -1;
                class11.field195 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)[B", line = 278)
    public final byte[] method1926(int arg0) throws IOException {
        field4746++;
        if (this.field4753 < class110.method707((byte) 89)) {
            throw new IOException("fdt");
        }
        if (this.field4761 == 0) {
            if (this.field4749.field4496 == 2) {
                throw new IOException("fds");
            }
            if (this.field4749.field4496 == 1) {
                this.field4745 = (DataInputStream) this.field4749.field4499;
                this.field4761 = 1;
            }
        }
        if (this.field4761 == 1) {
            int var2 = this.field4745.available();
            if (var2 > 0) {
                if ((var2 + this.field4758) > 4) {
                    var2 = 4 - this.field4758;
                }
                this.field4758 += this.field4745.read(this.field4764, this.field4758, var2);
                if (this.field4758 == 4) {
                    int var3 = (new class3(this.field4764)).method71(-668527048);
                    this.field4763 = new byte[var3];
                    this.field4761 = 2;
                }
            }
        }
        if (arg0 != -7388) {
            this.field4747 = -38;
        }
        if (this.field4761 == 2) {
            int var4 = this.field4745.available();
            if (var4 > 0) {
                if ((this.field4747 + var4) > this.field4763.length) {
                    var4 = this.field4763.length - this.field4747;
                }
                this.field4747 += this.field4745.read(this.field4763, this.field4747, var4);
                if (this.field4763.length == this.field4747) {
                    return this.field4763;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 361)
    public static void method1927(int arg0) {
        field4762 = null;
        field4750 = null;
        field4748 = null;
        field4756 = null;
        field4754 = null;
        field4760 = null;
        field4752 = (byte[][][]) null;
        field4759 = null;
        if (arg0 != 127) {
            field4754 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Llh;Ljava/net/URL;)V", line = 419)
    public class289(class282 arg0, URL arg1) {
        this.field4749 = arg0.method1867(arg1, (byte) -121);
        this.field4761 = 0;
        this.field4753 = class110.method707((byte) 75) + 30000L;
    }
}
