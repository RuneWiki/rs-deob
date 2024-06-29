import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class258 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Llr;")
    private class105 field3577 = null;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Llr;")
    private class105 field3581 = null;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    private int field3586 = 65000;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    private int field3575;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field3572 = -1;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[Z")
    public static boolean[] field3579 = new boolean[100];

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field3585 = 0;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field3573 = 1;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
    public static int[] field3584 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BI)Z", line = 7)
    public final boolean method1662(int arg0, int arg1, byte[] arg2, int arg3) {
        field3583++;
        class105 var5 = this.field3577;
        synchronized (this.field3577) {
            int var6 = -43 % ((arg3 - 4) / 57);
            if (arg0 < 0 || this.field3586 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method1664(true, true, arg1, arg2, arg0);
            if (!var7) {
                var7 = this.method1664(false, true, arg1, arg2, arg0);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[B", line = 33)
    public final byte[] method1663(int arg0, int arg1) {
        field3576++;
        class105 var3 = this.field3577;
        synchronized (this.field3577) {
            try {
                if (this.field3581.method794(arg0 ^ 0xF9) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3581.method802(-128, (long) (arg1 * 6));
                this.field3581.method801(class51.field653, 1, 6, 0);
                int var5 = (class51.field653[2] & 0xFF) + ((class51.field653[1] & 0xFF) << 8) + ((class51.field653[0] & 0xFF) << 16);
                int var6 = (class51.field653[4] & 0xFF << 8) + (((class51.field653[arg0] & 0xFF) << 16) + (class51.field653[5] & 0xFF));
                if (var5 < 0 || var5 > this.field3586) {
                    return null;
                } else if (var6 > 0 && this.field3577.method794(arg0 ^ 0xF9) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label70: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3577.method802(-105, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3577.method801(class51.field653, 1, var13 + 8, 0);
                        int var14 = ((class51.field653[0] & 0xFF) << 8) + (class51.field653[1] & 0xFF);
                        int var15 = (class51.field653[2] & 0xFF << 8) + (class51.field653[3] & 0xFF);
                        int var16 = (class51.field653[6] & 0xFF) + ((class51.field653[4] & 0xFF) << 16) + (class51.field653[5] & 0xFF << 8);
                        int var17 = class51.field653[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3575 == var17) {
                            if (var16 >= 0 && this.field3577.method794(250) / 520L >= (long) var16) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var9[var10++] = class51.field653[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!nf", name = "toString", descriptor = "()Ljava/lang/String;", line = 111)
    public final String toString() {
        field3580++;
        return "Cache:" + this.field3575;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZI[BI)Z", line = 119)
    private final boolean method1664(boolean arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field3574++;
        class105 var6 = this.field3577;
        synchronized (this.field3577) {
            if (!arg1) {
                return true;
            }
            try {
                int var9;
                if (arg0) {
                    if (this.field3581.method794(250) < ((long) (arg2 * 6 + 6))) {
                        return false;
                    }
                    this.field3581.method802(-127, (long) (arg2 * 6));
                    this.field3581.method801(class51.field653, 1, 6, 0);
                    var9 = ((class51.field653[3] & 0xFF) << 16) - (-((class51.field653[4] & 0xFF) << 8) - (class51.field653[5] & 0xFF));
                    if (var9 <= 0 || this.field3577.method794(250) / 520L < (long) var9) {
                        return false;
                    }
                } else {
                    var9 = (int) ((this.field3577.method794(250) + 519L) / 520L);
                    if (var9 == 0) {
                        var9 = 1;
                    }
                }
                class51.field653[2] = (byte) arg4;
                class51.field653[0] = (byte) (arg4 >> 16);
                class51.field653[3] = (byte) (var9 >> 16);
                class51.field653[4] = (byte) (var9 >> 8);
                class51.field653[1] = (byte) (arg4 >> 8);
                class51.field653[5] = (byte) var9;
                this.field3581.method802(-108, (long) (arg2 * 6));
                this.field3581.method804(0, 6, class51.field653, 0);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field3577.method802(-128, (long) (var9 * 520));
                            try {
                                this.field3577.method801(class51.field653, 1, 8, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class51.field653[0] & 0xFF) << 8) + (class51.field653[1] & 0xFF);
                            var13 = (class51.field653[4] & 0xFF << 16) - (-(class51.field653[5] & 0xFF << 8) - (class51.field653[6] & 0xFF));
                            int var15 = ((class51.field653[2] & 0xFF) << 8) + (class51.field653[3] & 0xFF);
                            int var16 = class51.field653[7] & 0xFF;
                            if (arg2 == var14 && var12 == var15 && this.field3575 == var16) {
                                if (var13 >= 0 && this.field3577.method794(250) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field3577.method794(250) + 519L) / 520L);
                        arg0 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var9 == var13) {
                            var13++;
                        }
                    }
                    class51.field653[2] = (byte) (var12 >> 8);
                    class51.field653[0] = (byte) (arg2 >> 8);
                    class51.field653[1] = (byte) arg2;
                    class51.field653[3] = (byte) var12;
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    class51.field653[6] = (byte) var13;
                    class51.field653[7] = (byte) this.field3575;
                    class51.field653[5] = (byte) (var13 >> 8);
                    class51.field653[4] = (byte) (var13 >> 16);
                    this.field3577.method802(-121, (long) (var9 * 520));
                    this.field3577.method804(0, 8, class51.field653, 0);
                    int var19 = arg4 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field3577.method804(var11, var19, arg3, 0);
                    var12++;
                    var9 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 247)
    public static void method1665(int arg0) {
        field3584 = null;
        if (arg0 == 4) {
            field3579 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILlr;Llr;I)V", line = 306)
    public class258(int arg0, class105 arg1, class105 arg2, int arg3) {
        this.field3575 = arg0;
        this.field3581 = arg2;
        this.field3577 = arg1;
        this.field3586 = arg3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 262)
    public static final void method1666(byte arg0) {
        class408 var1 = class22.field282;
        synchronized (class22.field282) {
            class22.field282.method2522((byte) 77);
        }
        field3582++;
        class408 var2 = class269.field3683;
        synchronized (class269.field3683) {
            class269.field3683.method2522((byte) 74);
        }
        class146 var3 = class431.field6035;
        synchronized (class431.field6035) {
            class431.field6035.method1058((byte) 74);
            if (arg0 <= 83) {
                field3584 = null;
            }
        }
    }
}
