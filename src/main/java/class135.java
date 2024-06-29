import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class135 {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lfk;")
    private class462 field1935 = null;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    private int field1930 = 65000;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lfk;")
    private class462 field1929 = null;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lff;")
    public static class9 field1936 = new class9(89, 6);

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "F")
    public static float field1939;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(FIFF)F", line = 4)
    public static final float method952(float arg0, int arg1, float arg2, float arg3) {
        if (arg1 != 520) {
            method954(-39);
        }
        field1927++;
        return (arg2 - arg0) * arg3 + arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIZ)Z", line = 24)
    public final boolean method953(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method955(-90);
        }
        field1938++;
        class462 var5 = this.field1929;
        synchronized (this.field1929) {
            if (arg1 < 0 || arg1 > this.field1930) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method957(arg1, arg0, 520, arg2, true);
            if (!var6) {
                var6 = this.method957(arg1, arg0, 520, arg2, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 59)
    public static final void method954(int arg0) {
        field1928++;
        class457.field6297.method1459(19088);
        if (arg0 != -322) {
            field1939 = 1.5152599F;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 70)
    public static void method955(int arg0) {
        field1936 = null;
        if (arg0 != 6) {
            field1936 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ILfk;Lfk;I)V", line = 296)
    public class135(int arg0, class462 arg1, class462 arg2, int arg3) {
        this.field1935 = arg2;
        this.field1930 = arg3;
        this.field1929 = arg1;
        this.field1931 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[B", line = 84)
    public final byte[] method956(int arg0, int arg1) {
        field1933++;
        if (arg0 != 152710824) {
            this.toString();
        }
        class462 var3 = this.field1929;
        synchronized (this.field1929) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1935.method2639(2)) {
                    return null;
                }
                this.field1935.method2637((long) (arg1 * 6), arg0 ^ 0xF6E5D12F);
                this.field1935.method2632(0, class146.field2070, -1, 6);
                int var5 = (class146.field2070[0] & 0xFF << 16) + (class146.field2070[1] & 0xFF << 8) + (class146.field2070[2] & 0xFF);
                int var6 = (class146.field2070[4] & 0xFF << 8) + (((class146.field2070[3] & 0xFF) << 16) + (class146.field2070[5] & 0xFF));
                if (var5 < 0 || this.field1930 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field1929.method2639(2) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1929.method2637((long) (var6 * 520), -126);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1929.method2632(0, class146.field2070, -1, var13 + 8);
                        int var14 = (class146.field2070[0] & 0xFF << 8) + (class146.field2070[1] & 0xFF);
                        int var15 = ((class146.field2070[2] & 0xFF) << 8) + (class146.field2070[3] & 0xFF);
                        int var16 = (class146.field2070[6] & 0xFF) + ((class146.field2070[4] & 0xFF << 16) + ((class146.field2070[5] & 0xFF) << 8));
                        int var17 = class146.field2070[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field1931 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field1929.method2639(arg0 ^ 0x91A2EAA) / 520L)) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class146.field2070[var20 + 8];
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

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BIIZ)Z", line = 172)
    private final boolean method957(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field1934++;
        class462 var6 = this.field1929;
        synchronized (this.field1929) {
            try {
                int var7;
                if (arg4) {
                    if ((long) (arg3 * 6 + 6) > this.field1935.method2639(2)) {
                        return false;
                    }
                    this.field1935.method2637((long) (arg3 * 6), -121);
                    this.field1935.method2632(0, class146.field2070, -1, 6);
                    var7 = (class146.field2070[4] & 0xFF << 8) + (class146.field2070[3] & 0xFF << 16) + (class146.field2070[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field1929.method2639(2) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1929.method2639(2) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class146.field2070[3] = (byte) (var7 >> 16);
                class146.field2070[1] = (byte) (arg0 >> 8);
                class146.field2070[2] = (byte) arg0;
                class146.field2070[0] = (byte) (arg0 >> 16);
                class146.field2070[4] = (byte) (var7 >> 8);
                class146.field2070[5] = (byte) var7;
                this.field1935.method2637((long) (arg3 * 6), -111);
                this.field1935.method2636(6, 0, class146.field2070, arg2 - 425);
                if (arg2 != 520) {
                    field1936 = null;
                }
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field1929.method2637((long) (var7 * 520), -122);
                            try {
                                this.field1929.method2632(0, class146.field2070, -1, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class146.field2070[0] & 0xFF << 8) + (class146.field2070[1] & 0xFF);
                            var12 = (class146.field2070[6] & 0xFF) + ((class146.field2070[5] & 0xFF) << 8) + (class146.field2070[4] & 0xFF << 16);
                            int var14 = ((class146.field2070[2] & 0xFF) << 8) + (class146.field2070[3] & 0xFF);
                            int var15 = class146.field2070[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field1931 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1929.method2639(2) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field1929.method2639(2) + 519L) / 520L);
                        arg4 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class146.field2070[2] = (byte) (var11 >> 8);
                    class146.field2070[1] = (byte) arg3;
                    class146.field2070[0] = (byte) (arg3 >> 8);
                    class146.field2070[3] = (byte) var11;
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class146.field2070[6] = (byte) var12;
                    class146.field2070[4] = (byte) (var12 >> 16);
                    class146.field2070[5] = (byte) (var12 >> 8);
                    class146.field2070[7] = (byte) this.field1931;
                    this.field1929.method2637((long) (var7 * 520), -124);
                    this.field1929.method2636(8, 0, class146.field2070, arg2 - 395);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1929.method2636(var18, var10, arg1, -59);
                    var11++;
                    var10 += var18;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "toString", descriptor = "()Ljava/lang/String;", line = 309)
    public final String toString() {
        field1932++;
        return "Cache:" + this.field1931;
    }
}
