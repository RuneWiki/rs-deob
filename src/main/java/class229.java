import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class229 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    private int field3840 = 65000;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lti;")
    private class128 field3852 = null;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lti;")
    private class128 field3851 = null;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lia;")
    private static class257 field3845 = class28.method234(111, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field3849 = 0;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lia;")
    public static class257 field3850 = class28.method234(76, "Clientscript error in: ");

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[B")
    public static byte[] field3843 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Lia;")
    public static class257 field3855 = class28.method234(89, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lia;")
    public static class257 field3844 = field3845;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3847++;
        return "Cache:" + this.field3841;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lsj;")
    public static final class159 method1490(int arg0, int arg1) {
        class159 var2 = (class159) class156.field2715.method615(false, (long) arg1);
        field3853++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 > arg1) {
            var3 = class1.field13.method1197(arg1, 0, arg0 ^ 0xFFFF7FFE);
        } else {
            var3 = class138.field2467.method1197(arg1 & 0x7FFF, 0, arg0 - 32770);
        }
        class159 var4 = new class159();
        if (var3 != null) {
            var4.method1107((byte) 106, new class152(var3));
        }
        if (arg1 >= 32768) {
            var4.method1112(arg0 ^ 0xFFFF7F9D);
        }
        class156.field2715.method619((byte) 94, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lme;II)Lia;")
    public static final class257 method1491(class44 arg0, int arg1, int arg2) {
        field3838++;
        int var3 = -27 / ((62 - arg2) / 43);
        if (!class146.method983(client.method590(arg0), 1, arg1) && arg0.field1017 == null) {
            return null;
        } else if (arg0.field887 == null || arg0.field887.length <= arg1 || arg0.field887[arg1] == null || arg0.field887[arg1].method1716((byte) 42).method1679((byte) 64) == 0) {
            return class87.field1695 ? class233.method1528(new class257[] { class7.field146, class111.method808(10, arg1) }, 0) : null;
        } else {
            return arg0.field887[arg1];
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[BIZ)Z")
    public final boolean method1492(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field3856++;
        class128 var5 = this.field3852;
        synchronized (this.field3852) {
            if (arg2 < 0 || this.field3840 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1493(arg1, (byte) 122, arg3, arg0, arg2);
            if (!var6) {
                var6 = this.method1493(arg1, (byte) 122, false, arg0, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BBZII)Z")
    private final boolean method1493(byte[] arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field3848++;
        class128 var6 = this.field3852;
        synchronized (this.field3852) {
            try {
                int var8;
                if (arg2) {
                    if ((long) (arg3 * 6 + 6) > this.field3851.method892(true)) {
                        return false;
                    }
                    this.field3851.method895(0, (long) (arg3 * 6));
                    this.field3851.method893(class13.field252, 0, 6, 0);
                    var8 = (class13.field252[3] & 0xFF << 16) + ((class13.field252[4] & 0xFF) << 8) + (class13.field252[5] & 0xFF);
                    if (var8 <= 0 || ((long) var8) > (this.field3852.method892(true) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3852.method892(true) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class13.field252[5] = (byte) var8;
                if (arg1 != 122) {
                    method1495(-106);
                }
                int var10 = 0;
                class13.field252[0] = (byte) (arg4 >> 16);
                class13.field252[1] = (byte) (arg4 >> 8);
                class13.field252[4] = (byte) (var8 >> 8);
                class13.field252[2] = (byte) arg4;
                class13.field252[3] = (byte) (var8 >> 16);
                this.field3851.method895(arg1 ^ 0x7A, (long) (arg3 * 6));
                int var11 = 0;
                this.field3851.method884((byte) 126, class13.field252, 0, 6);
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field3852.method895(0, (long) (var8 * 520));
                            try {
                                this.field3852.method893(class13.field252, 0, 8, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class13.field252[6] & 0xFF) + (class13.field252[5] & 0xFF << 8) + (class13.field252[4] & 0xFF << 16);
                            int var13 = (class13.field252[2] & 0xFF << 8) + (class13.field252[3] & 0xFF);
                            int var14 = ((class13.field252[0] & 0xFF) << 8) + (class13.field252[1] & 0xFF);
                            int var15 = class13.field252[7] & 0xFF;
                            if (arg3 == var14 && var11 == var13 && this.field3841 == var15) {
                                if (var12 >= 0 && (this.field3852.method892(true) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field3852.method892(true) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class13.field252[7] = (byte) this.field3841;
                    class13.field252[1] = (byte) arg3;
                    if ((arg4 - var10) <= 512) {
                        var12 = 0;
                    }
                    class13.field252[4] = (byte) (var12 >> 16);
                    class13.field252[2] = (byte) (var11 >> 8);
                    class13.field252[3] = (byte) var11;
                    class13.field252[6] = (byte) var12;
                    class13.field252[5] = (byte) (var12 >> 8);
                    class13.field252[0] = (byte) (arg3 >> 8);
                    var11++;
                    this.field3852.method895(0, (long) (var8 * 520));
                    var8 = var12;
                    this.field3852.method884((byte) 110, class13.field252, 0, 8);
                    this.field3852.method884((byte) 112, arg0, var10, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
    public static final int method1494(int arg0, int arg1) {
        field3842++;
        if (arg1 > -76) {
            field3844 = null;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1495(int arg0) {
        if (arg0 != 0) {
            method1491((class44) null, -55, -43);
        }
        field3850 = null;
        field3843 = null;
        field3855 = null;
        field3844 = null;
        field3845 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZBLme;)V")
    public static final void method1496(boolean arg0, byte arg1, class44 arg2) {
        field3839++;
        int var3 = 96 / ((41 - arg1) / 45);
        int var4 = arg2.field947 == 0 ? arg2.field981 : arg2.field947;
        int var5 = arg2.field991 == 0 ? arg2.field926 : arg2.field991;
        class146.method986(var4, 77, arg0, var5, arg2.field935, class28.field539[arg2.field935 >> 16]);
        if (arg2.field1015 != null) {
            class146.method986(var4, 59, arg0, var5, arg2.field935, arg2.field1015);
        }
        class157 var6 = (class157) class136.field2426.method434((byte) -93, (long) arg2.field935);
        if (var6 != null) {
            class222.method1464(var6.field2746, var5, -8480, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)[B")
    public final byte[] method1497(int arg0, int arg1) {
        field3854++;
        class128 var3 = this.field3852;
        synchronized (this.field3852) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field3851.method892(true)) {
                    return null;
                }
                this.field3851.method895(0, (long) (arg1 * 6));
                this.field3851.method893(class13.field252, 0, 6, 0);
                int var5 = (class13.field252[0] & 0xFF << 16) + (((class13.field252[1] & 0xFF) << 8) + (class13.field252[2] & 0xFF));
                int var6 = (class13.field252[3] & 0xFF << 16) + (class13.field252[4] & 0xFF << 8) + (class13.field252[5] & 0xFF);
                if (var5 < 0 || this.field3840 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field3852.method892(true) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = arg0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3852.method895(0, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3852.method893(class13.field252, 0, var13 + 8, arg0);
                        int var14 = (class13.field252[0] & 0xFF << 8) + (class13.field252[1] & 0xFF);
                        int var15 = ((class13.field252[5] & 0xFF) << 8) + (class13.field252[4] & 0xFF << 16) + (class13.field252[6] & 0xFF);
                        int var16 = (class13.field252[2] & 0xFF << 8) + (class13.field252[3] & 0xFF);
                        int var17 = class13.field252[7] & 0xFF;
                        if (arg1 == var14 && var11 == var16 && this.field3841 == var17) {
                            if (var15 >= 0 && this.field3852.method892(true) / 520L >= (long) var15) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class13.field252[var20 + 8];
                                }
                                var11++;
                                var6 = var15;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILti;Lti;I)V")
    public class229(int arg0, class128 arg1, class128 arg2, int arg3) {
        this.field3852 = arg1;
        this.field3851 = arg2;
        this.field3840 = arg3;
        this.field3841 = arg0;
    }
}
