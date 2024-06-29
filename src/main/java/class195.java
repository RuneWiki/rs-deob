import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class195 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    private int field2793 = 65000;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lbda;")
    private class503 field2798 = null;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Lbda;")
    private class503 field2803 = null;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    private int field2802;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lqe;")
    public static class465 field2794 = new class465(69, 4);

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static final void method1366(int arg0) {
        class474.field6796 = null;
        class530.field7509 = null;
        class2.field18 = null;
        field2796++;
        class47.field699 = null;
        class483.field6845 = null;
        class631.field9051 = null;
        class748.field10461 = null;
        class388.field5429 = null;
        if (arg0 != -25575) {
            method1368(-4, 104, (byte) 26, -2, 104);
        }
        class212.field3047 = null;
        class537.field7568 = null;
        class236.field3340 = null;
        class284.field4038 = null;
        class283.field4028 = null;
        class237.field3358 = null;
        class722.field10090 = null;
        class351.field4958 = null;
        class242.field3393 = null;
        class272.field3886 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([BIBI)Z")
    public final boolean method1367(byte[] arg0, int arg1, byte arg2, int arg3) {
        field2799++;
        if (arg2 != -14) {
            this.method1369((byte) 124, 78);
        }
        class503 var5 = this.field2798;
        synchronized (this.field2798) {
            if (arg3 < 0 || arg3 > this.field2793) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1371(arg0, arg3, (byte) 38, arg1, true);
            if (!var6) {
                var6 = this.method1371(arg0, arg3, (byte) 108, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIBII)I")
    public static final int method1368(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 121) {
            field2794 = null;
        }
        field2801++;
        int var5 = arg0 & 0xF;
        int var6 = var5 < 8 ? arg1 : arg4;
        int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg1 : arg3);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[B")
    public final byte[] method1369(byte arg0, int arg1) {
        field2795++;
        class503 var3 = this.field2798;
        synchronized (this.field2798) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field2803.method3015(25411)) {
                    return null;
                }
                this.field2803.method3019((long) (arg1 * 6), 118);
                this.field2803.method3024(6, 0, class76.field1427, (byte) 125);
                int var5 = ((class76.field1427[0] & 0xFF) << 16) + (class76.field1427[1] & 0xFF << 8) + (class76.field1427[2] & 0xFF);
                int var6 = 63 / ((arg0 + 15) / 49);
                int var7 = ((class76.field1427[3] & 0xFF) << 16) + (class76.field1427[4] & 0xFF << 8) + (class76.field1427[5] & 0xFF);
                if (var5 < 0 || var5 > this.field2793) {
                    return null;
                } else if (var7 > 0 && (this.field2798.method3015(25411) / 520L) >= ((long) var7)) {
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    while (var11 < var5) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field2798.method3019((long) (var7 * 520), 125);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2798.method3024(var14 + 8, 0, class76.field1427, (byte) 122);
                        int var15 = (class76.field1427[0] & 0xFF << 8) + (class76.field1427[1] & 0xFF);
                        int var16 = (class76.field1427[2] & 0xFF << 8) + (class76.field1427[3] & 0xFF);
                        int var17 = ((class76.field1427[4] & 0xFF) << 16) - (-(class76.field1427[5] & 0xFF << 8) - (class76.field1427[6] & 0xFF));
                        int var18 = class76.field1427[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field2802 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field2798.method3015(25411) / 520L)) {
                                var7 = var17;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class76.field1427[var21 + 8];
                                }
                                var12++;
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
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static void method1370(int arg0) {
        field2794 = null;
        if (arg0 >= -116) {
            method1368(-100, -121, (byte) -102, -77, -39);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([BIBIZ)Z")
    private final boolean method1371(byte[] arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field2797++;
        class503 var6 = this.field2798;
        synchronized (this.field2798) {
            try {
                int var7;
                if (arg4) {
                    if (this.field2803.method3015(25411) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field2803.method3019((long) (arg3 * 6), 117);
                    this.field2803.method3024(6, 0, class76.field1427, (byte) 127);
                    var7 = (class76.field1427[3] & 0xFF << 16) + (class76.field1427[5] & 0xFF) + ((class76.field1427[4] & 0xFF) << 8);
                    if (var7 <= 0 || (this.field2798.method3015(25411) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2798.method3015(25411) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class76.field1427[5] = (byte) var7;
                int var10 = -8 % ((arg2 + 27) / 59);
                class76.field1427[1] = (byte) (arg1 >> 8);
                class76.field1427[2] = (byte) arg1;
                class76.field1427[3] = (byte) (var7 >> 16);
                class76.field1427[4] = (byte) (var7 >> 8);
                class76.field1427[0] = (byte) (arg1 >> 16);
                this.field2803.method3019((long) (arg3 * 6), 117);
                this.field2803.method3023(0, 119, 6, class76.field1427);
                int var11 = 0;
                int var12 = 0;
                while (arg1 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label105: {
                            this.field2798.method3019((long) (var7 * 520), 118);
                            try {
                                this.field2798.method3024(8, 0, class76.field1427, (byte) 126);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = ((class76.field1427[0] & 0xFF) << 8) + (class76.field1427[1] & 0xFF);
                            var13 = (class76.field1427[6] & 0xFF) + ((class76.field1427[5] & 0xFF) << 8) + (class76.field1427[4] & 0xFF << 16);
                            int var15 = ((class76.field1427[2] & 0xFF) << 8) + (class76.field1427[3] & 0xFF);
                            int var16 = class76.field1427[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field2802 == var16) {
                                if (var13 >= 0 && this.field2798.method3015(25411) / 520L >= (long) var13) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field2798.method3015(25411) + 519L) / 520L);
                        arg4 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    if (arg1 - var11 <= 512) {
                        var13 = 0;
                    }
                    class76.field1427[0] = (byte) (arg3 >> 8);
                    class76.field1427[1] = (byte) arg3;
                    class76.field1427[2] = (byte) (var12 >> 8);
                    class76.field1427[3] = (byte) var12;
                    class76.field1427[5] = (byte) (var13 >> 8);
                    class76.field1427[7] = (byte) this.field2802;
                    class76.field1427[4] = (byte) (var13 >> 16);
                    class76.field1427[6] = (byte) var13;
                    this.field2798.method3019((long) (var7 * 520), 118);
                    this.field2798.method3023(0, 71, 8, class76.field1427);
                    int var19 = arg1 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field2798.method3023(var11, 54, var19, arg0);
                    var12++;
                    var11 += var19;
                    var7 = var13;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2800++;
        return "Cache:" + this.field2802;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(ILbda;Lbda;I)V")
    public class195(int arg0, class503 arg1, class503 arg2, int arg3) {
        this.field2793 = arg3;
        this.field2802 = arg0;
        this.field2798 = arg1;
        this.field2803 = arg2;
    }
}
