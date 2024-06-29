import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class242 {

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    private int field4321 = 65000;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Laj;")
    private class1 field4316 = null;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Laj;")
    private class1 field4322 = null;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    private int field4315;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field4323 = 0;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lgf;")
    public static class7 field4325 = new class7(100);

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lli;")
    public static class185 field4326 = class245.method1649("M-Bmoire en cours d(Wattribution", 125);

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lp;")
    public static class82 field4328 = null;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Lli;")
    public static class185 field4327 = class245.method1649("<br>(X100(U(Y", -40);

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lli;")
    public static class185 field4332 = class245.method1649(")4l=", 126);

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lli;")
    public static class185 field4330 = class245.method1649(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -44);

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lli;")
    private static class185 field4335 = class245.method1649("Members object", -11);

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lli;")
    public static class185 field4331 = field4335;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lli;")
    public static class185 field4336 = class245.method1649("runes", -83);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Lp;")
    public static class82 field4333;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[Lcg;")
    public static class34[] field4334;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public static final void method1634(int arg0, int arg1, int arg2) {
        field4317++;
        if (arg0 >= -94) {
            method1634(-94, -52, -119);
        }
        class209 var3 = class111.method775(arg2, -126);
        int var4 = var3.field3819;
        int var5 = var3.field3820;
        int var6 = var3.field3823;
        int var7 = class73.field1275[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class193.method1391(arg1 << var5 & var8 | ~var8 & class269.field4752[var4], -127, var4);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method1635(int arg0) {
        field4334 = null;
        field4336 = null;
        field4331 = null;
        field4327 = null;
        field4330 = null;
        field4335 = null;
        field4328 = null;
        field4333 = null;
        field4325 = null;
        if (arg0 > 93) {
            field4326 = null;
            field4332 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)V")
    public static final void method1636(byte arg0, int arg1) {
        field4314++;
        if (arg1 >= 0 && class196.field3590.length > arg1) {
            int var2 = 93 % ((arg0 - 50) / 42);
            class196.field3590[arg1] = !class196.field3590[arg1];
        }
    }

    @OriginalMember(owner = "client!n", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4319++;
        return "Cache:" + this.field4315;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIZ[B)Z")
    private final boolean method1637(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field4311++;
        class1 var6 = this.field4316;
        synchronized (this.field4316) {
            try {
                int var7;
                if (arg3) {
                    if (((long) (arg0 * 6 + 6)) > this.field4322.method17((byte) 67)) {
                        return false;
                    }
                    this.field4322.method8(arg1 ^ 0x3F46, (long) (arg0 * 6));
                    this.field4322.method16(arg1 - 3, 0, class238.field4250, 6);
                    var7 = (class238.field4250[4] & 0xFF << 8) + (class238.field4250[3] & 0xFF << 16) + (class238.field4250[5] & 0xFF);
                    if (var7 <= 0 || (this.field4316.method17((byte) 29) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4316.method17((byte) -96) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class238.field4250[5] = (byte) var7;
                class238.field4250[1] = (byte) (arg2 >> 8);
                class238.field4250[0] = (byte) (arg2 >> 16);
                int var10 = 0;
                int var11 = 0;
                class238.field4250[arg1] = (byte) (var7 >> 16);
                class238.field4250[4] = (byte) (var7 >> 8);
                class238.field4250[2] = (byte) arg2;
                this.field4322.method8(16197, (long) (arg0 * 6));
                this.field4322.method13(class238.field4250, 0, 6, 0);
                while (var11 < arg2) {
                    int var12 = 0;
                    if (arg3) {
                        label105: {
                            this.field4316.method8(arg1 ^ 0x3F46, (long) (var7 * 520));
                            try {
                                this.field4316.method16(0, 0, class238.field4250, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class238.field4250[0] & 0xFF) << 8) + (class238.field4250[1] & 0xFF);
                            var12 = (class238.field4250[4] & 0xFF << 16) + (class238.field4250[5] & 0xFF << 8) + (class238.field4250[6] & 0xFF);
                            int var14 = class238.field4250[7] & 0xFF;
                            int var15 = ((class238.field4250[2] & 0xFF) << 8) + (class238.field4250[3] & 0xFF);
                            if (arg0 == var13 && var10 == var15 && this.field4315 == var14) {
                                if (var12 >= 0 && ((long) var12) <= (this.field4316.method17((byte) 100) / 520L)) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field4316.method17((byte) 117) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class238.field4250[3] = (byte) var10;
                    class238.field4250[0] = (byte) (arg0 >> 8);
                    class238.field4250[1] = (byte) arg0;
                    int var18 = arg2 - var11;
                    if (arg2 - var11 <= 512) {
                        var12 = 0;
                    }
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class238.field4250[7] = (byte) this.field4315;
                    class238.field4250[2] = (byte) (var10 >> 8);
                    class238.field4250[5] = (byte) (var12 >> 8);
                    class238.field4250[4] = (byte) (var12 >> 16);
                    var10++;
                    class238.field4250[6] = (byte) var12;
                    this.field4316.method8(16197, (long) (var7 * 520));
                    this.field4316.method13(class238.field4250, 0, 8, 0);
                    this.field4316.method13(arg4, 0, var18, var11);
                    var11 += var18;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)[B")
    public final byte[] method1638(int arg0, byte arg1) {
        field4320++;
        class1 var3 = this.field4316;
        synchronized (this.field4316) {
            try {
                if (this.field4322.method17((byte) -67) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                if (arg1 >= -94) {
                    field4328 = null;
                }
                this.field4322.method8(16197, (long) (arg0 * 6));
                this.field4322.method16(0, 0, class238.field4250, 6);
                int var5 = (class238.field4250[5] & 0xFF) + ((class238.field4250[3] & 0xFF) << 16) + (class238.field4250[4] & 0xFF << 8);
                int var6 = (class238.field4250[2] & 0xFF) + ((class238.field4250[1] & 0xFF) << 8) + (class238.field4250[0] & 0xFF << 16);
                if (var6 < 0 || this.field4321 < var6) {
                    return null;
                } else if (var5 > 0 && (this.field4316.method17((byte) -122) / 520L) >= ((long) var5)) {
                    int var9 = 0;
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    while (var6 > var9) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field4316.method8(16197, (long) (var5 * 520));
                        int var13 = var6 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4316.method16(0, 0, class238.field4250, var13 + 8);
                        int var14 = (class238.field4250[0] & 0xFF << 8) + (class238.field4250[1] & 0xFF);
                        int var15 = ((class238.field4250[2] & 0xFF) << 8) + (class238.field4250[3] & 0xFF);
                        int var16 = ((class238.field4250[4] & 0xFF) << 16) + ((class238.field4250[5] & 0xFF) << 8) + (class238.field4250[6] & 0xFF);
                        int var17 = class238.field4250[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field4315 == var17) {
                            if (var16 >= 0 && (this.field4316.method17((byte) 96) / 520L) >= ((long) var16)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class238.field4250[var20 + 8];
                                }
                                var5 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[B)Z")
    public final boolean method1639(int arg0, int arg1, int arg2, byte[] arg3) {
        field4313++;
        class1 var5 = this.field4316;
        synchronized (this.field4316) {
            if (arg1 < 0 || this.field4321 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1637(arg0, 3, arg1, true, arg3);
            if (arg2 != 6) {
                this.toString();
            }
            if (!var6) {
                var6 = this.method1637(arg0, 3, arg1, false, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method1640(int arg0, int arg1) {
        field4318++;
        class174 var2 = class249.method1671(11, arg0, (byte) 34);
        int var3 = 60 % ((-arg1 - 56) / 63);
        var2.method1234((byte) -21);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(ILaj;Laj;I)V")
    public class242(int arg0, class1 arg1, class1 arg2, int arg3) {
        this.field4316 = arg1;
        this.field4322 = arg2;
        this.field4315 = arg0;
        this.field4321 = arg3;
    }
}
