import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class252 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljb;")
    private class276 field3868 = null;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    private int field3873 = 65000;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Ljb;")
    private class276 field3883 = null;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    private int field3870;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field3872 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3879 = "glow2:";

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
    public static int[] field3878;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3869;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZI[B)Z")
    private final boolean method1683(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field3871++;
        class276 var6 = this.field3883;
        synchronized (this.field3883) {
            try {
                int var7;
                if (arg2) {
                    if ((long) (arg1 * 6 + 6) > this.field3868.method1853(0)) {
                        return false;
                    }
                    this.field3868.method1857(-49, (long) (arg1 * 6));
                    this.field3868.method1852(6, 0, (byte) -98, class179.field2679);
                    var7 = ((class179.field2679[4] & 0xFF) << 8) + (class179.field2679[3] & 0xFF << 16) + (class179.field2679[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field3883.method1853(0) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3883.method1853(0) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class179.field2679[3] = (byte) (var7 >> 16);
                class179.field2679[0] = (byte) (arg3 >> 16);
                int var10 = 0;
                class179.field2679[2] = (byte) arg3;
                int var11 = 0;
                if (arg0 <= 99) {
                    this.field3868 = null;
                }
                class179.field2679[1] = (byte) (arg3 >> 8);
                class179.field2679[5] = (byte) var7;
                class179.field2679[4] = (byte) (var7 >> 8);
                this.field3868.method1857(-111, (long) (arg1 * 6));
                this.field3868.method1855(class179.field2679, 6, -62, 0);
                while (var10 < arg3) {
                    int var12 = 0;
                    if (arg2) {
                        label109: {
                            this.field3883.method1857(-73, (long) (var7 * 520));
                            try {
                                this.field3883.method1852(8, 0, (byte) -106, class179.field2679);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class179.field2679[6] & 0xFF) + ((class179.field2679[5] & 0xFF) << 8) + ((class179.field2679[4] & 0xFF) << 16);
                            int var13 = (class179.field2679[0] & 0xFF << 8) + (class179.field2679[1] & 0xFF);
                            int var14 = class179.field2679[7] & 0xFF;
                            int var15 = (class179.field2679[2] & 0xFF << 8) + (class179.field2679[3] & 0xFF);
                            if (arg1 == var13 && var11 == var15 && this.field3870 == var14) {
                                if (var12 >= 0 && ((long) var12) <= (this.field3883.method1853(0) / 520L)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field3883.method1853(0) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class179.field2679[3] = (byte) var11;
                    class179.field2679[7] = (byte) this.field3870;
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class179.field2679[2] = (byte) (var11 >> 8);
                    class179.field2679[1] = (byte) arg1;
                    class179.field2679[5] = (byte) (var12 >> 8);
                    var11++;
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class179.field2679[6] = (byte) var12;
                    class179.field2679[0] = (byte) (arg1 >> 8);
                    class179.field2679[4] = (byte) (var12 >> 16);
                    this.field3883.method1857(-70, (long) (var7 * 520));
                    var7 = var12;
                    this.field3883.method1855(class179.field2679, 8, 3, 0);
                    this.field3883.method1855(arg4, var18, 116, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3876++;
        return "Cache:" + this.field3870;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BIB)Z")
    public final boolean method1684(int arg0, byte[] arg1, int arg2, byte arg3) {
        field3875++;
        class276 var5 = this.field3883;
        synchronized (this.field3883) {
            if (arg0 < 0 || this.field3873 < arg0) {
                throw new IllegalArgumentException();
            }
            if (arg3 != 83) {
                field3878 = null;
            }
            boolean var6 = this.method1683(120, arg2, true, arg0, arg1);
            if (!var6) {
                var6 = this.method1683(117, arg2, false, arg0, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public static final void method1685(int arg0, int arg1, int arg2) {
        field3882++;
        class295 var3 = class250.method1673(arg0 ^ 0xFFFFFF9F, arg0, arg1);
        var3.method1980(1022716908);
        var3.field4632 = arg2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method1686(int arg0) {
        field3881++;
        class247.field3822.method1782(107);
        class64.field1019.method1782(arg0 - 20552);
        if (arg0 != 20646) {
            method1686(41);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method1687(int arg0) {
        field3879 = null;
        if (arg0 != 0) {
            field3872 = 41;
        }
        field3878 = null;
        field3869 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[B")
    public final byte[] method1688(int arg0, byte arg1) {
        field3874++;
        class276 var3 = this.field3883;
        synchronized (this.field3883) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3868.method1853(0)) {
                    return null;
                }
                this.field3868.method1857(-126, (long) (arg0 * 6));
                this.field3868.method1852(6, 0, (byte) -124, class179.field2679);
                int var5 = (class179.field2679[2] & 0xFF) + ((class179.field2679[1] & 0xFF) << 8) + (class179.field2679[0] & 0xFF << 16);
                int var6 = (class179.field2679[5] & 0xFF) + (((class179.field2679[3] & 0xFF) << 16) + ((class179.field2679[4] & 0xFF) << 8));
                if (var5 < 0 || this.field3873 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field3883.method1853(0) / 520L) {
                    int var9 = 0;
                    if (arg1 <= 8) {
                        this.toString();
                    }
                    int var10 = 0;
                    byte[] var11 = new byte[var5];
                    label74: while (var9 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3883.method1857(-23, (long) (var6 * 520));
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3883.method1852(var13 + 8, 0, (byte) -85, class179.field2679);
                        int var14 = ((class179.field2679[2] & 0xFF) << 8) + (class179.field2679[3] & 0xFF);
                        int var15 = ((class179.field2679[0] & 0xFF) << 8) + (class179.field2679[1] & 0xFF);
                        int var16 = (class179.field2679[4] & 0xFF << 16) + ((class179.field2679[5] & 0xFF) << 8) + (class179.field2679[6] & 0xFF);
                        int var17 = class179.field2679[7] & 0xFF;
                        if (arg0 == var15 && var10 == var14 && this.field3870 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3883.method1853(0) / 520L) {
                                var6 = var16;
                                var10++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label74;
                                    }
                                    var11[var9++] = class179.field2679[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(ILjb;Ljb;I)V")
    public class252(int arg0, class276 arg1, class276 arg2, int arg3) {
        this.field3873 = arg3;
        this.field3883 = arg1;
        this.field3870 = arg0;
        this.field3868 = arg2;
    }
}
