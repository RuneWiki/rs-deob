import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class215 extends class34 {

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    private int field3832 = 0;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    private int field3827 = -1;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    private int field3829;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "Lvm;")
    public static class297 field3834 = new class297(64);

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "Lke;")
    public static class256 field3837 = class316.method2202(":assist:", 27626);

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field3839 = 0;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "Lhd;")
    public static class319 field3838;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)[Lel;", line = 10)
    public static final class232[] method1503(int arg0) {
        class232[] var1 = new class232[class38.field691];
        int var2 = 0;
        int var3 = 20 / ((71 - arg0) / 53);
        while (class38.field691 > var2) {
            var1[var2] = new class232(class142.field2486, class153.field2740, class13.field172[var2], class307.field5283[var2], class94.field1692[var2], class62.field1093[var2], class6.field92[var2], class305.field5270);
            var2++;
        }
        class183.method1343(255);
        field3835++;
        return var1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lng;BLng;)V", line = 34)
    public static final void method1504(class138 arg0, byte arg1, class138 arg2) {
        int var3 = -22 % ((-arg1 - 21) / 48);
        field3836++;
        class72.field1326 = arg2;
        class294.field5109 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V", line = 44)
    public static void method1505(byte arg0) {
        field3834 = null;
        if (arg0 > 70) {
            field3837 = null;
            field3838 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)Lel;", line = 57)
    public static final class232 method1506(int arg0) {
        if (arg0 != 24537) {
            method1503(102);
        }
        class232 var1 = new class232(class142.field2486, class153.field2740, class13.field172[0], class307.field5283[0], class94.field1692[0], class62.field1093[0], class6.field92[0], class305.field5270);
        class183.method1343(255);
        field3828++;
        return var1;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V", line = 229)
    public class215(int arg0) {
        GL var2 = class253.field4319;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field3829 = class221.field3871;
        this.field3827 = var3[0];
        class253.method1714(this.field3827);
        int var4 = class136.field2370[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class221.field3869 += var6.limit() - this.field3832;
        this.field3832 = var6.limit();
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "(I)V", line = 78)
    public static final void method1507(int arg0) {
        field3830++;
        if (!class253.field4323 || class50.field924) {
            return;
        }
        class271[][][] var1 = class41.field790;
        if (arg0 != 7300) {
            method1506(124);
        }
        for (int var2 = 0; var2 < var1.length; var2++) {
            class271[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class271 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4628 != null && var6.field4628.field3905 instanceof class149) {
                            class149 var7 = (class149) var6.field4628.field3905;
                            if ((Long.MIN_VALUE & var6.field4628.field3902) == 0L) {
                                var7.method1087(false, true, true, true, false, true, true);
                            } else {
                                var7.method1087(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field4643 != null) {
                            if (var6.field4643.field700 instanceof class149) {
                                class149 var8 = (class149) var6.field4643.field700;
                                if ((var6.field4643.field712 & Long.MIN_VALUE) == 0L) {
                                    var8.method1087(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1087(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field4643.field711 instanceof class149) {
                                class149 var9 = (class149) var6.field4643.field711;
                                if ((Long.MIN_VALUE & var6.field4643.field712) == 0L) {
                                    var9.method1087(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1087(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field4639 != null) {
                            if (var6.field4639.field3597 instanceof class149) {
                                class149 var10 = (class149) var6.field4639.field3597;
                                if ((Long.MIN_VALUE & var6.field4639.field3601) == 0L) {
                                    var10.method1087(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1087(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field4639.field3596 instanceof class149) {
                                class149 var11 = (class149) var6.field4639.field3596;
                                if ((var6.field4639.field3601 & Long.MIN_VALUE) == 0L) {
                                    var11.method1087(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1087(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field4641; var12++) {
                            if (var6.field4624[var12].field4590 instanceof class149) {
                                class149 var13 = (class149) var6.field4624[var12].field4590;
                                if ((Long.MIN_VALUE & var6.field4624[var12].field4601) == 0L) {
                                    var13.method1087(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1087(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class50.field924 = true;
    }

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "(I)V", line = 258)
    public final void method1508(int arg0) {
        field3831++;
        if (arg0 != 5744) {
            this.field3832 = 17;
        }
        int var2 = class311.method2152((byte) 127);
        if ((var2 & 0x1) == 0) {
            class253.method1714(this.field3827);
        }
        if ((var2 & 0x2) == 0) {
            class253.method1704(0);
        }
        if ((var2 & 0x4) == 0) {
            class253.method1731(0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "finalize", descriptor = "()V", line = 291)
    protected final void finalize() throws Throwable {
        if (this.field3827 != -1) {
            class221.method1524(this.field3827, this.field3832, this.field3829);
            this.field3832 = 0;
            this.field3827 = -1;
        }
        super.finalize();
        field3833++;
    }
}
