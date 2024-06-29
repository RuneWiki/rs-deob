import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class685 {

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lck;")
    private class600 field9630 = null;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lck;")
    private class600 field9626 = null;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    private int field9633 = 65000;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    private int field9639;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "[[Z")
    public static boolean[][] field9636 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field9637 = -1;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Ldb;")
    public static class298 field9629 = new class298(20, -1);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field9638 = 4;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!cc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9634++;
        return "Cache:" + this.field9639;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z[BIIZ)Z")
    private final boolean method3810(boolean arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field9631++;
        class600 var6 = this.field9630;
        synchronized (this.field9630) {
            try {
                int var8;
                if (arg4) {
                    if (((long) (arg2 * 6 + 6)) > this.field9626.method3308((byte) 103)) {
                        return false;
                    }
                    this.field9626.method3302((long) (arg2 * 6), (byte) -51);
                    this.field9626.method3310(6, class69.field1037, 0, (byte) 88);
                    var8 = ((class69.field1037[3] & 0xFF) << 16) + ((class69.field1037[4] & 0xFF) << 8) + (class69.field1037[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field9630.method3308((byte) 0) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field9630.method3308((byte) -113) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class69.field1037[0] = (byte) (arg3 >> 16);
                class69.field1037[2] = (byte) arg3;
                class69.field1037[5] = (byte) var8;
                class69.field1037[4] = (byte) (var8 >> 8);
                class69.field1037[3] = (byte) (var8 >> 16);
                class69.field1037[1] = (byte) (arg3 >> 8);
                this.field9626.method3302((long) (arg2 * 6), (byte) -51);
                this.field9626.method3306(6, 0, class69.field1037, -25944);
                if (!arg0) {
                    this.field9633 = -128;
                }
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg3) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field9630.method3302((long) (var8 * 520), (byte) -51);
                            try {
                                this.field9630.method3310(8, class69.field1037, 0, (byte) -84);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class69.field1037[0] & 0xFF << 8) + (class69.field1037[1] & 0xFF);
                            var12 = (class69.field1037[4] & 0xFF << 16) + (class69.field1037[6] & 0xFF) + ((class69.field1037[5] & 0xFF) << 8);
                            int var14 = (class69.field1037[2] & 0xFF << 8) + (class69.field1037[3] & 0xFF);
                            int var15 = class69.field1037[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field9639 == var15) {
                                if (var12 >= 0 && (this.field9630.method3308((byte) 125) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field9630.method3308((byte) -29) + 519L) / 520L);
                        arg4 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class69.field1037[2] = (byte) (var11 >> 8);
                    class69.field1037[1] = (byte) arg2;
                    class69.field1037[0] = (byte) (arg2 >> 8);
                    class69.field1037[3] = (byte) var11;
                    class69.field1037[6] = (byte) var12;
                    class69.field1037[4] = (byte) (var12 >> 16);
                    class69.field1037[5] = (byte) (var12 >> 8);
                    class69.field1037[7] = (byte) this.field9639;
                    this.field9630.method3302((long) (var8 * 520), (byte) -51);
                    this.field9630.method3306(8, 0, class69.field1037, -25944);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field9630.method3306(var18, var10, arg1, -25944);
                    var10 += var18;
                    var8 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III[B)Z")
    public final boolean method3811(int arg0, int arg1, int arg2, byte[] arg3) {
        field9627++;
        class600 var5 = this.field9630;
        synchronized (this.field9630) {
            if (arg1 < 0 || this.field9633 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method3810(true, arg3, arg2, arg1, true);
            if (arg0 != 5) {
                this.toString();
            }
            if (!var6) {
                var6 = this.method3810(true, arg3, arg2, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)V")
    public static final void method3812(int arg0, byte arg1) {
        class412.field5653 = 100;
        if (arg1 != 126) {
            method3813(-121);
        }
        class665.field9428 = 3;
        field9628++;
        class345.field4753 = arg0;
        class96.field1461 = -1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method3813(int arg0) {
        field9636 = null;
        field9629 = null;
        if (arg0 != -27379) {
            method3813(58);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)[B")
    public final byte[] method3814(boolean arg0, int arg1) {
        field9632++;
        if (!arg0) {
            return null;
        }
        class600 var3 = this.field9630;
        synchronized (this.field9630) {
            try {
                if (this.field9626.method3308((byte) 110) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field9626.method3302((long) (arg1 * 6), (byte) -51);
                this.field9626.method3310(6, class69.field1037, 0, (byte) -107);
                int var5 = ((class69.field1037[0] & 0xFF) << 16) + (class69.field1037[1] & 0xFF << 8) + (class69.field1037[2] & 0xFF);
                int var6 = (class69.field1037[3] & 0xFF << 16) + (((class69.field1037[4] & 0xFF) << 8) + (class69.field1037[5] & 0xFF));
                if (var5 < 0 || this.field9633 < var5) {
                    return null;
                } else if (var6 > 0 && this.field9630.method3308((byte) 123) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field9630.method3302((long) (var6 * 520), (byte) -51);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field9630.method3310(var13 + 8, class69.field1037, 0, (byte) 112);
                        int var14 = ((class69.field1037[0] & 0xFF) << 8) + (class69.field1037[1] & 0xFF);
                        int var15 = ((class69.field1037[2] & 0xFF) << 8) + (class69.field1037[3] & 0xFF);
                        int var16 = (class69.field1037[5] & 0xFF << 8) + (class69.field1037[4] & 0xFF << 16) + (class69.field1037[6] & 0xFF);
                        int var17 = class69.field1037[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field9639 == var17) {
                            if (var16 >= 0 && this.field9630.method3308((byte) -35) / 520L >= (long) var16) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class69.field1037[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
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

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ILck;Lck;I)V")
    public class685(int arg0, class600 arg1, class600 arg2, int arg3) {
        this.field9626 = arg2;
        this.field9633 = arg3;
        this.field9639 = arg0;
        this.field9630 = arg1;
    }
}
