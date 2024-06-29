import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class242 extends class23 {

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    private int field4427 = 2048;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    private int field4426 = 0;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    private int field4436 = 2;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    private int field4438 = 5;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    private int field4448 = 1;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "[B")
    private byte[] field4440 = new byte[512];

    @OriginalMember(owner = "client!we", name = "db", descriptor = "I")
    private int field4444 = 5;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "[S")
    private short[] field4447 = new short[512];

    @OriginalMember(owner = "client!we", name = "T", descriptor = "Ldc;")
    public static class37 field4434 = class185.method1233((byte) 86, "http:)4)4");

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "Ldc;")
    private static class37 field4439 = class185.method1233((byte) 86, "Discard");

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "Ldc;")
    public static class37 field4431 = class185.method1233((byte) 86, "Wordpack geladen)3");

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    public static int field4442 = 0;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "Ldc;")
    public static class37 field4428 = field4439;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    public static int field4445 = 128;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "Ldc;")
    public static class37 field4449 = class185.method1233((byte) 86, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!we", name = "U", descriptor = "Ldc;")
    public static class37 field4435 = class185.method1233((byte) 86, "hint_mapmarkers");

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "J")
    public static volatile long field4450 = 0L;

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "Z")
    public static boolean field4451 = false;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Ldj;")
    public static class44 field4443;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 != 1000) {
            method1583(-34, -65, 51, 124, -30, -40);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field4444 = arg0.method215(arg2 ^ -1797813792);
                                }
                            } else {
                                this.field4438 = arg0.method215(-1797813752);
                            }
                        } else {
                            this.field4448 = arg0.method215(-1797813752);
                        }
                    } else {
                        this.field4436 = arg0.method215(arg2 + -1797814752);
                    }
                } else {
                    this.field4427 = arg0.method230((byte) -124);
                }
            } else {
                this.field4426 = arg0.method215(-1797813752);
            }
        } else {
            this.field4438 = this.field4444 = arg0.method215(-1797813752);
        }
        ++field4430;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
    public static void method1581(byte arg0) {
        if (arg0 != -23) {
            field4434 = null;
        }
        field4443 = null;
        field4449 = null;
        field4435 = null;
        field4439 = null;
        field4428 = null;
        field4431 = null;
        field4434 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        int[] var3 = super.field405.method1461(arg1, (byte) -122);
        if (arg0 != 0) {
            return null;
        } else {
            ++field4432;
            if (super.field405.field4114) {
                int var4 = class167.field3196[arg1] * this.field4444 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~var7 > ~class199.field3705; ++var7) {
                    class51.field1036 = Integer.MAX_VALUE;
                    class147.field2807 = Integer.MAX_VALUE;
                    class72.field1285 = Integer.MAX_VALUE;
                    class142.field2739 = Integer.MAX_VALUE;
                    int var8 = class133.field2477[var7] * this.field4438 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 - -1;
                    for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                        int var13 = 255 & this.field4440[(this.field4444 <= var11 ? -this.field4444 + var11 : var11) & 255];
                        for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                            int var15 = (this.field4440[var13 - -(~var14 > ~this.field4438 ? var14 : -this.field4438 + var14) & 255] & 255) * 2;
                            int var27 = var15 + 1;
                            int var16 = -this.field4447[var15] - ((var14 << 12) - var8);
                            int var17 = -this.field4447[var27] - ((var11 << 12) - var4);
                            int var18 = this.field4448;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 > -1 ? -var16 : var16) - -(~var17 <= -1 ? var17 : -var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var17 > -1 ? -var17 : var17;
                                    int var26 = var16 < 0 ? -var16 : var16;
                                    var19 = ~var25 <= ~var26 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~var19 > ~class142.field2739) {
                                class51.field1036 = class147.field2807;
                                class147.field2807 = class72.field1285;
                                class72.field1285 = class142.field2739;
                                class142.field2739 = var19;
                            } else if (~class72.field1285 >= ~var19) {
                                if (~var19 <= ~class147.field2807) {
                                    if (~class51.field1036 < ~var19) {
                                        class51.field1036 = var19;
                                    }
                                } else {
                                    class51.field1036 = class147.field2807;
                                    class147.field2807 = var19;
                                }
                            } else {
                                class51.field1036 = class147.field2807;
                                class147.field2807 = class72.field1285;
                                class72.field1285 = var19;
                            }
                        }
                    }
                    int var12 = this.field4436;
                    if (~var12 != -1) {
                        if (~var12 != -2) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = -class142.field2739 + class72.field1285;
                                    }
                                } else {
                                    var3[var7] = class51.field1036;
                                }
                            } else {
                                var3[var7] = class147.field2807;
                            }
                        } else {
                            var3[var7] = class72.field1285;
                        }
                    } else {
                        var3[var7] = class142.field2739;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method1582(String arg0, byte arg1) throws ClassNotFoundException {
        ++field4429;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg1 != -65) {
                method1583(76, 4, 40, 112, 52, 16);
            }
            if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
    public static final void method1583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4433;
        for (int var6 = arg5; arg4 >= var6; ++var6) {
            class29.method242(arg2, (byte) -30, arg1, class11.field156[var6], arg0);
        }
        if (arg3 != 0) {
            field4428 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class242() {
        super(0, true);
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (arg0 != -21746) {
            field4446 = 3;
        }
        this.field4440 = class212.method1410(this.field4426, true);
        ++field4437;
        this.method1584(true);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
    private final void method1584(boolean arg0) {
        ++field4441;
        if (arg0) {
            Random var2 = new Random((long) this.field4426);
            this.field4447 = new short[512];
            if (this.field4427 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field4447[var3] = (short) class97.method646(12402, var2, this.field4427);
                }
            }
        }
    }
}
