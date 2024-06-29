import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class492 {

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Leba;")
    private class590 field7015 = null;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Leba;")
    private class590 field7012 = null;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    private int field7017 = 65000;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    private int field7018;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Lqe;")
    public static class469 field7016 = new class469(93, 6);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "Lvd;")
    public static class39 field7019;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([BIIIZ)Z", line = 3)
    private final boolean method2934(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7014++;
        class590 var6 = this.field7015;
        synchronized (this.field7015) {
            try {
                int var7;
                if (arg4) {
                    if (this.field7012.method3408(-1) < ((long) (arg1 * 6 + 6))) {
                        return false;
                    }
                    this.field7012.method3417(-25, (long) (arg1 * 6));
                    this.field7012.method3418(0, class600.field8488, 6, 104);
                    var7 = ((class600.field8488[3] & 0xFF) << 16) + ((class600.field8488[4] & 0xFF) << 8) + (class600.field8488[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field7015.method3408(-1) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field7015.method3408(arg3 - 91924) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class600.field8488[0] = (byte) (arg2 >> 16);
                class600.field8488[3] = (byte) (var7 >> 16);
                class600.field8488[4] = (byte) (var7 >> 8);
                class600.field8488[5] = (byte) var7;
                class600.field8488[2] = (byte) arg2;
                class600.field8488[1] = (byte) (arg2 >> 8);
                this.field7012.method3417(arg3 - 92012, (long) (arg1 * 6));
                if (arg3 != 91923) {
                    return true;
                }
                this.field7012.method3410(6, arg3 - 91924, 0, class600.field8488);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg2) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field7015.method3417(-81, (long) (var7 * 520));
                            try {
                                this.field7015.method3418(0, class600.field8488, 8, arg3 ^ 0x1676E);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class600.field8488[0] & 0xFF) << 8) + (class600.field8488[1] & 0xFF);
                            int var15 = (class600.field8488[2] & 0xFF << 8) + (class600.field8488[3] & 0xFF);
                            var13 = ((class600.field8488[5] & 0xFF) << 8) + ((class600.field8488[4] & 0xFF) << 16) + (class600.field8488[6] & 0xFF);
                            int var16 = class600.field8488[7] & 0xFF;
                            if (arg1 == var14 && var12 == var15 && this.field7018 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field7015.method3408(-1) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field7015.method3408(arg3 - 91924) + 519L) / 520L);
                        arg4 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class600.field8488[3] = (byte) var12;
                    class600.field8488[1] = (byte) arg1;
                    if ((arg2 - var11) <= 512) {
                        var13 = 0;
                    }
                    class600.field8488[0] = (byte) (arg1 >> 8);
                    class600.field8488[2] = (byte) (var12 >> 8);
                    class600.field8488[7] = (byte) this.field7018;
                    class600.field8488[6] = (byte) var13;
                    class600.field8488[4] = (byte) (var13 >> 16);
                    class600.field8488[5] = (byte) (var13 >> 8);
                    this.field7015.method3417(126, (long) (var7 * 520));
                    this.field7015.method3410(8, -1, 0, class600.field8488);
                    int var19 = arg2 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field7015.method3410(var19, -1, var11, arg0);
                    var12++;
                    var11 += var19;
                    var7 = var13;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V", line = 131)
    public static final void method2935(int arg0, int arg1) {
        class183 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class280 var4 = class531.field7566[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class565.field8040; var5++) {
                    for (int var6 = 0; var6 < class34.field356; var6++) {
                        var2 = var4.method967(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class459.field6769;
                            int var8 = var5 << class459.field6769;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class280 var10 = class531.field7566[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1787(var6, 19646, var5) - var10.method1787(var6, 19646, var5);
                                    int var12 = var4.method1787(var6 + 1, 19646, var5) - var10.method1787(var6 + 1, 19646, var5);
                                    int var13 = var4.method1787(var6 + 1, 19646, var5 + 1) - var10.method1787(var6 + 1, 19646, var5 + 1);
                                    int var14 = var4.method1787(var6, 19646, var5 + 1) - var10.method1787(var6, 19646, var5 + 1);
                                    var10.method976(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(ILeba;Leba;I)V", line = 350)
    public class492(int arg0, class590 arg1, class590 arg2, int arg3) {
        this.field7017 = arg3;
        this.field7015 = arg1;
        this.field7018 = arg0;
        this.field7012 = arg2;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III[B)Z", line = 204)
    public final boolean method2936(int arg0, int arg1, int arg2, byte[] arg3) {
        field7010++;
        if (arg2 != 0) {
            this.method2939(11, 25);
        }
        class590 var5 = this.field7015;
        synchronized (this.field7015) {
            if (arg0 < 0 || this.field7017 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2934(arg3, arg1, arg0, 91923, true);
            if (!var6) {
                var6 = this.method2934(arg3, arg1, arg0, arg2 ^ 0x16713, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIB)I", line = 230)
    public static final int method2937(int arg0, int arg1, byte arg2) {
        field7013++;
        if (arg2 > -84) {
            return -38;
        }
        int var3 = class252.method1658(arg0 + 91923, arg1 + 45365, 4, -1) + (-(-(class252.method1658(arg0 + 37821, arg1 + 10294, 2, -1) - 128 >> 1) - (class252.method1658(arg0, arg1, 1, -1) - 128 >> 2)) - 128);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 256)
    public static void method2938(int arg0) {
        field7016 = null;
        int var1 = 89 / ((13 - arg0) / 50);
        field7019 = null;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II)[B", line = 266)
    public final byte[] method2939(int arg0, int arg1) {
        field7011++;
        class590 var3 = this.field7015;
        synchronized (this.field7015) {
            try {
                if (this.field7012.method3408(-1) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field7012.method3417(arg0 + 123, (long) (arg1 * 6));
                this.field7012.method3418(0, class600.field8488, 6, 115);
                int var5 = (class600.field8488[2] & 0xFF) + (((class600.field8488[0] & 0xFF) << 16) + (class600.field8488[1] & 0xFF << 8));
                int var6 = (class600.field8488[5] & 0xFF) + ((class600.field8488[4] & 0xFF) << 8) + (class600.field8488[3] & 0xFF << 16);
                if (var5 < 0 || this.field7017 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field7015.method3408(-1) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = arg0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field7015.method3417(116, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field7015.method3418(0, class600.field8488, var13 + 8, arg0 ^ 0x5A);
                        int var14 = (class600.field8488[0] & 0xFF << 8) + (class600.field8488[1] & 0xFF);
                        int var15 = ((class600.field8488[2] & 0xFF) << 8) + (class600.field8488[3] & 0xFF);
                        int var16 = ((class600.field8488[4] & 0xFF) << 16) + (((class600.field8488[5] & 0xFF) << 8) + (class600.field8488[6] & 0xFF));
                        int var17 = class600.field8488[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field7018 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field7015.method3408(-1) / 520L) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class600.field8488[var20 + 8];
                                }
                                var6 = var16;
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

    @OriginalMember(owner = "client!np", name = "toString", descriptor = "()Ljava/lang/String;", line = 368)
    public final String toString() {
        field7009++;
        return "Cache:" + this.field7018;
    }
}
