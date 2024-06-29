import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class307 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lpt;")
    private class403 field4811 = null;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    private int field4818 = 65000;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lpt;")
    private class403 field4814 = null;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    private int field4815;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lo;")
    public static class139 field4820;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lza;")
    public static class497 field4813;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[B)Z")
    public final boolean method2067(int arg0, int arg1, int arg2, byte[] arg3) {
        field4821++;
        class403 var5 = this.field4811;
        synchronized (this.field4811) {
            if (arg2 < 0 || this.field4818 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2068((byte) 99, arg2, true, arg0, arg3);
            if (!var6) {
                var6 = this.method2068((byte) 99, arg2, false, arg0, arg3);
            }
            if (arg1 != 2050602952) {
                method2070((byte) -12);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIZI[B)Z")
    private final boolean method2068(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field4812++;
        class403 var6 = this.field4811;
        synchronized (this.field4811) {
            try {
                int var7;
                if (arg2) {
                    if (this.field4814.method2592((byte) 50) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field4814.method2589((long) (arg3 * 6), arg0 - 99);
                    this.field4814.method2593(true, 6, class491.field7435, 0);
                    var7 = ((class491.field7435[4] & 0xFF) << 8) + ((class491.field7435[3] & 0xFF) << 16) + (class491.field7435[5] & 0xFF);
                    if (var7 <= 0 || (this.field4811.method2592((byte) 50) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4811.method2592((byte) 50) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class491.field7435[2] = (byte) arg1;
                class491.field7435[5] = (byte) var7;
                class491.field7435[3] = (byte) (var7 >> 16);
                class491.field7435[1] = (byte) (arg1 >> 8);
                class491.field7435[0] = (byte) (arg1 >> 16);
                class491.field7435[4] = (byte) (var7 >> 8);
                this.field4814.method2589((long) (arg3 * 6), arg0 ^ 0x63);
                if (arg0 != 99) {
                    return true;
                }
                this.field4814.method2594(class491.field7435, 6, 0, -1);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg1) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field4811.method2589((long) (var7 * 520), 0);
                            try {
                                this.field4811.method2593(true, 8, class491.field7435, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class491.field7435[0] & 0xFF) << 8) + (class491.field7435[1] & 0xFF);
                            int var15 = (class491.field7435[2] & 0xFF << 8) + (class491.field7435[3] & 0xFF);
                            var13 = (class491.field7435[6] & 0xFF) + (class491.field7435[5] & 0xFF << 8) + (class491.field7435[4] & 0xFF << 16);
                            int var16 = class491.field7435[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field4815 == var16) {
                                if (var13 >= 0 && this.field4811.method2592((byte) 50) / 520L >= (long) var13) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg2 = false;
                        var13 = (int) ((this.field4811.method2592((byte) 50) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    if ((arg1 - var11) <= 512) {
                        var13 = 0;
                    }
                    class491.field7435[1] = (byte) arg3;
                    class491.field7435[2] = (byte) (var12 >> 8);
                    class491.field7435[3] = (byte) var12;
                    class491.field7435[0] = (byte) (arg3 >> 8);
                    class491.field7435[6] = (byte) var13;
                    class491.field7435[7] = (byte) this.field4815;
                    class491.field7435[4] = (byte) (var13 >> 16);
                    class491.field7435[5] = (byte) (var13 >> 8);
                    this.field4811.method2589((long) (var7 * 520), 0);
                    this.field4811.method2594(class491.field7435, 8, 0, -1);
                    int var19 = arg1 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field4811.method2594(arg4, var19, var11, arg0 ^ 0xFFFFFF9C);
                    var12++;
                    var7 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[B")
    public final byte[] method2069(int arg0, int arg1) {
        field4817++;
        class403 var3 = this.field4811;
        synchronized (this.field4811) {
            if (arg0 != 520) {
                this.method2069(-114, -60);
            }
            try {
                if (this.field4814.method2592((byte) 50) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field4814.method2589((long) (arg1 * 6), 0);
                this.field4814.method2593(true, 6, class491.field7435, 0);
                int var5 = (class491.field7435[2] & 0xFF) + ((class491.field7435[0] & 0xFF) << 16) + (class491.field7435[1] & 0xFF << 8);
                int var6 = ((class491.field7435[4] & 0xFF) << 8) + (((class491.field7435[3] & 0xFF) << 16) + (class491.field7435[5] & 0xFF));
                if (var5 < 0 || var5 > this.field4818) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4811.method2592((byte) 50) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4811.method2589((long) (var6 * 520), 0);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4811.method2593(true, var13 + 8, class491.field7435, 0);
                        int var14 = ((class491.field7435[0] & 0xFF) << 8) + (class491.field7435[1] & 0xFF);
                        int var15 = (class491.field7435[2] & 0xFF << 8) + (class491.field7435[3] & 0xFF);
                        int var16 = (class491.field7435[6] & 0xFF) + ((class491.field7435[5] & 0xFF) << 8) + (class491.field7435[4] & 0xFF << 16);
                        int var17 = class491.field7435[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4815 == var17) {
                            if (var16 >= 0 && (this.field4811.method2592((byte) 50) / 520L) >= ((long) var16)) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class491.field7435[var20 + 8];
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

    @OriginalMember(owner = "client!bh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4819++;
        return "Cache:" + this.field4815;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method2070(byte arg0) {
        field4820 = null;
        field4813 = null;
        if (arg0 != 62) {
            field4813 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIBII)V")
    public static final void method2071(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4816++;
        class335.method2222(arg6, 0);
        int var7 = 0;
        int var8 = arg6 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        if (arg4 >= -17) {
            method2071(-8, -86, -16, -94, (byte) 5, -63, 103);
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class103.field1521[arg5];
        int var16 = arg1 - var8;
        int var17 = arg1 + var8;
        class280.method1888(arg1 - arg6, var16, (byte) 82, var15, arg0);
        class280.method1888(var16, var17, (byte) 82, var15, arg3);
        class280.method1888(var17, arg1 + arg6, (byte) 82, var15, arg0);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class290.field4590[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 < var8) {
                    int[] var18 = class103.field1521[arg5 + var9];
                    int[] var19 = class103.field1521[arg5 - var9];
                    int var20 = class290.field4590[var9];
                    int var21 = arg1 + var7;
                    int var22 = arg1 - var7;
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class280.method1888(var22, var24, (byte) 82, var18, arg0);
                    class280.method1888(var24, var23, (byte) 82, var18, arg3);
                    class280.method1888(var23, var21, (byte) 82, var18, arg0);
                    class280.method1888(var22, var24, (byte) 82, var19, arg0);
                    class280.method1888(var24, var23, (byte) 82, var19, arg3);
                    class280.method1888(var23, var21, (byte) 82, var19, arg0);
                } else {
                    int[] var25 = class103.field1521[arg5 + var9];
                    int[] var26 = class103.field1521[arg5 - var9];
                    int var27 = arg1 + var7;
                    int var28 = arg1 - var7;
                    class280.method1888(var28, var27, (byte) 82, var25, arg0);
                    class280.method1888(var28, var27, (byte) 82, var26, arg0);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class103.field1521[arg5 + var7];
            int[] var30 = class103.field1521[arg5 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var8 <= var7) {
                class280.method1888(var32, var31, (byte) 82, var29, arg0);
                class280.method1888(var32, var31, (byte) 82, var30, arg0);
            } else {
                int var33 = var7 <= var11 ? var11 : class290.field4590[var7];
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class280.method1888(var32, var35, (byte) 82, var29, arg0);
                class280.method1888(var35, var34, (byte) 82, var29, arg3);
                class280.method1888(var34, var31, (byte) 82, var29, arg0);
                class280.method1888(var32, var35, (byte) 82, var30, arg0);
                class280.method1888(var35, var34, (byte) 82, var30, arg3);
                class280.method1888(var34, var31, (byte) 82, var30, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(ILpt;Lpt;I)V")
    public class307(int arg0, class403 arg1, class403 arg2, int arg3) {
        this.field4811 = arg1;
        this.field4815 = arg0;
        this.field4814 = arg2;
        this.field4818 = arg3;
    }
}
