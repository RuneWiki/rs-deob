import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    private int field819 = 65000;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lr;")
    private class118 field823 = null;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lr;")
    private class118 field834 = null;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
    public static int[] field818 = new int[4000];

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field828 = 0;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Lbc;")
    public static class11 field832 = new class11(20);

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lpe;")
    public static class109 field837 = class141.method1120("null", 0);

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[J")
    public static long[] field838 = new long[100];

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Lna;")
    public static class91 field836;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lre;BIBIIZ)V")
    public static final void method361(class123 arg0, byte arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        field827++;
        long var7 = (long) ((arg4 << 16) + arg5);
        class152 var9 = (class152) class84.field1779.method505((byte) -46, var7);
        if (var9 != null) {
            return;
        }
        class152 var10 = (class152) class43.field918.method505((byte) -46, var7);
        if (var10 != null) {
            return;
        }
        class152 var11 = (class152) class8.field193.method505((byte) -46, var7);
        if (var11 == null) {
            if (!arg6) {
                class152 var12 = (class152) class99.field2067.method505((byte) -46, var7);
                if (var12 != null) {
                    return;
                }
            }
            class152 var13 = new class152();
            if (arg1 >= 97) {
                var13.field3340 = arg3;
                var13.field3351 = arg2;
                var13.field3353 = arg0;
                if (arg6) {
                    class84.field1779.method503(-1, var13, var7);
                    class8.field205++;
                } else {
                    class48.field997.method1077(0, var13);
                    class8.field193.method503(-1, var13, var7);
                    class43.field908++;
                }
            }
        } else if (arg6) {
            var11.method1006((byte) -85);
            class84.field1779.method503(-1, var11, var7);
            class43.field908--;
            class8.field205++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field825++;
        if ((arg0 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg3;
            arg3 = var7;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 8 - arg4 - arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg2;
        } else if (arg5 >= -55) {
            return 68;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([BIIIZ)Z")
    private final boolean method363(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field826++;
        class118 var6 = this.field823;
        synchronized (this.field823) {
            try {
                int var8;
                if (arg4) {
                    if (this.field834.method965((byte) -116) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field834.method961((long) (arg3 * 6), -120);
                    this.field834.method971(class50.field1029, 0, 16711935, 6);
                    var8 = (class50.field1029[5] & 0xFF) + ((class50.field1029[3] & 0xFF) << 16) + ((class50.field1029[4] & 0xFF) << 8);
                    if (var8 <= 0 || this.field823.method965((byte) -27) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field823.method965((byte) -126) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class50.field1029[0] = (byte) (arg2 >> 16);
                class50.field1029[2] = (byte) arg2;
                class50.field1029[1] = (byte) (arg2 >> 8);
                int var10 = 0;
                class50.field1029[arg1] = (byte) var8;
                class50.field1029[3] = (byte) (var8 >> 16);
                class50.field1029[4] = (byte) (var8 >> 8);
                int var11 = 0;
                this.field834.method961((long) (arg3 * 6), -120);
                this.field834.method963(0, arg1 ^ 0x3B96, 6, class50.field1029);
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label104: {
                            this.field823.method961((long) (var8 * 520), -118);
                            try {
                                this.field823.method971(class50.field1029, 0, arg1 + 16711930, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class50.field1029[4] & 0xFF) << 16) + ((class50.field1029[5] & 0xFF) << 8) + (class50.field1029[6] & 0xFF);
                            int var13 = ((class50.field1029[0] & 0xFF) << 8) + (class50.field1029[1] & 0xFF);
                            int var14 = ((class50.field1029[2] & 0xFF) << 8) + (class50.field1029[3] & 0xFF);
                            int var15 = class50.field1029[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field831 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field823.method965((byte) -33) / 520L) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg2 - var10;
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field823.method965((byte) -116) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class50.field1029[1] = (byte) arg3;
                    class50.field1029[2] = (byte) (var11 >> 8);
                    class50.field1029[7] = (byte) this.field831;
                    class50.field1029[3] = (byte) var11;
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class50.field1029[5] = (byte) (var12 >> 8);
                    class50.field1029[4] = (byte) (var12 >> 16);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class50.field1029[0] = (byte) (arg3 >> 8);
                    class50.field1029[6] = (byte) var12;
                    var11++;
                    this.field823.method961((long) (var8 * 520), -125);
                    var8 = var12;
                    this.field823.method963(0, 15251, 8, class50.field1029);
                    this.field823.method963(var10, 15251, var18, arg0);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z[Lwa;I)V")
    public static final void method364(boolean arg0, class154[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class154 var4 = arg1[var3];
            if (var4 != null && var4.field3458 == arg2 && (!var4.field3473 || !class153.method1179((byte) -128, var4))) {
                if (var4.field3476 == 0) {
                    if (!var4.field3473 && class153.method1179((byte) -52, var4) && class4.field81 != var4) {
                        continue;
                    }
                    method364(arg0, arg1, var4.field3514);
                    if (var4.field3520 != null) {
                        method364(arg0, var4.field3520, var4.field3514);
                    }
                    class79 var5 = (class79) class134.field2916.method505((byte) -46, (long) var4.field3514);
                    if (var5 != null) {
                        class49.method420(var5.field1655, (byte) 38);
                    }
                }
                if (var4.field3476 == 6) {
                    if (var4.field3479 != -1 || var4.field3480 != -1) {
                        boolean var6 = class20.method204(var4, (byte) -84);
                        int var7;
                        if (var6) {
                            var7 = var4.field3480;
                        } else {
                            var7 = var4.field3479;
                        }
                        if (var7 != -1) {
                            class6 var8 = class27.method238(8, var7);
                            var4.field3392 += class139.field3042;
                            while (var4.field3392 > var8.field164[var4.field3504]) {
                                var4.field3392 -= var8.field164[var4.field3504];
                                var4.field3504++;
                                if (var4.field3504 >= var8.field144.length) {
                                    var4.field3504 -= var8.field134;
                                    if (var4.field3504 < 0 || var4.field3504 >= var8.field144.length) {
                                        var4.field3504 = 0;
                                    }
                                }
                                class138.method1092(0, var4);
                            }
                        }
                    }
                    if (var4.field3461 != 0 && !var4.field3473) {
                        int var9 = var4.field3461 >> 16;
                        int var10 = var4.field3461 << 16 >> 16;
                        int var11 = class139.field3042 * var9;
                        int var12 = class139.field3042 * var10;
                        var4.field3503 = var4.field3503 + var11 & 0x7FF;
                        var4.field3475 = var4.field3475 + var12 & 0x7FF;
                        class138.method1092(0, var4);
                    }
                }
            }
        }
        if (!arg0) {
            method365(-32, 117, -19);
        }
        field820++;
    }

    @OriginalMember(owner = "client!fb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field830++;
        return "Cache:" + this.field831;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public static final void method365(int arg0, int arg1, int arg2) {
        field821++;
        if (class113.method941(arg1, (byte) -114)) {
            class15.method179(class114.field2525[arg1], arg0, 122);
            if (arg2 != 2945) {
                method361(null, (byte) 80, -107, (byte) -97, 4, 66, false);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z[BII)Z")
    public final boolean method366(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field829++;
        class118 var5 = this.field823;
        synchronized (this.field823) {
            if (arg2 < 0 || this.field819 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method363(arg1, 5, arg2, arg3, arg0);
            if (!var6) {
                var6 = this.method363(arg1, 5, arg2, arg3, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[B")
    public final byte[] method367(int arg0, int arg1) {
        field822++;
        class118 var3 = this.field823;
        synchronized (this.field823) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field834.method965((byte) -51)) {
                    return null;
                }
                this.field834.method961((long) (arg0 * 6), -128);
                if (arg1 != -1119134904) {
                    field832 = null;
                }
                this.field834.method971(class50.field1029, 0, 16711935, 6);
                int var5 = ((class50.field1029[1] & 0xFF) << 8) + (((class50.field1029[0] & 0xFF) << 16) + (class50.field1029[2] & 0xFF));
                int var6 = ((class50.field1029[3] & 0xFF) << 16) + (class50.field1029[5] & 0xFF) + ((class50.field1029[4] & 0xFF) << 8);
                if (var5 < 0 || this.field819 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field823.method965((byte) -93) / 520L) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    label72: while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field823.method961((long) (var6 * 520), 126);
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field823.method971(class50.field1029, 0, arg1 + 1135846839, var13 + 8);
                        int var14 = ((class50.field1029[4] & 0xFF) << 16) + ((class50.field1029[5] & 0xFF) << 8) + (class50.field1029[6] & 0xFF);
                        int var15 = class50.field1029[7] & 0xFF;
                        int var16 = ((class50.field1029[0] & 0xFF) << 8) + (class50.field1029[1] & 0xFF);
                        int var17 = ((class50.field1029[2] & 0xFF) << 8) + (class50.field1029[3] & 0xFF);
                        if (arg0 == var16 && var9 == var17 && this.field831 == var15) {
                            if (var14 >= 0 && (long) var14 <= this.field823.method965((byte) -63) / 520L) {
                                var9++;
                                var6 = var14;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var10[var11++] = class50.field1029[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method368(byte arg0) {
        field838 = null;
        field832 = null;
        if (arg0 < 53) {
            method365(-32, -22, 8);
        }
        field836 = null;
        field837 = null;
        field818 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(ILr;Lr;I)V")
    public class38(int arg0, class118 arg1, class118 arg2, int arg3) {
        this.field819 = arg3;
        this.field831 = arg0;
        this.field834 = arg2;
        this.field823 = arg1;
    }
}
