import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class27 {

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    private int field468 = 65000;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lpb;")
    private class141 field464 = null;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lpb;")
    private class141 field477 = null;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field467 = new String[100];

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Lhg;")
    public static class207 field471;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method171(int arg0) {
        field471 = null;
        if (arg0 != -1070086520) {
            field470 = -110;
        }
        field467 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Lbm;")
    public static final class294 method172(int arg0, byte arg1) {
        field472++;
        class294 var2 = (class294) class183.field2921.method99((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class174.field2792.method1149(4, (byte) 121, arg0);
        if (arg1 != -79) {
            method172(27, (byte) 81);
        }
        class294 var4 = new class294();
        if (var3 != null) {
            var4.method2032(-2952, arg0, new class249(var3));
        }
        class183.field2921.method100((long) arg0, var4, 87);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field466++;
        return "Cache:" + this.field474;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ[BII)Z")
    private final boolean method173(byte arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        field475++;
        class141 var6 = this.field464;
        synchronized (this.field464) {
            try {
                int var7;
                if (arg1) {
                    if (this.field477.method1044(108) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field477.method1042((long) (arg3 * 6), true);
                    this.field477.method1051(class239.field4019, 6, 90, 0);
                    var7 = (class239.field4019[4] & 0xFF << 8) + ((class239.field4019[3] & 0xFF << 16) + (class239.field4019[5] & 0xFF));
                    if (var7 <= 0 || (this.field464.method1044(arg0 - 106) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field464.method1044(64) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class239.field4019[4] = (byte) (var7 >> 8);
                class239.field4019[2] = (byte) arg4;
                int var10 = 0;
                class239.field4019[3] = (byte) (var7 >> 16);
                class239.field4019[1] = (byte) (arg4 >> 8);
                class239.field4019[5] = (byte) var7;
                class239.field4019[0] = (byte) (arg4 >> 16);
                this.field477.method1042((long) (arg3 * 6), true);
                this.field477.method1041(class239.field4019, (byte) 89, 6, 0);
                if (arg0 != 7) {
                    this.field477 = null;
                }
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label109: {
                            this.field464.method1042((long) (var7 * 520), true);
                            try {
                                this.field464.method1051(class239.field4019, 8, -93, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class239.field4019[5] & 0xFF) << 8) + (class239.field4019[4] & 0xFF << 16) + (class239.field4019[6] & 0xFF);
                            int var13 = (class239.field4019[0] & 0xFF << 8) + (class239.field4019[1] & 0xFF);
                            int var14 = (class239.field4019[2] & 0xFF << 8) + (class239.field4019[3] & 0xFF);
                            int var15 = class239.field4019[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field474 == var15) {
                                if (var12 >= 0 && this.field464.method1044(66) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field464.method1044(-104) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class239.field4019[3] = (byte) var11;
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class239.field4019[1] = (byte) arg3;
                    class239.field4019[6] = (byte) var12;
                    class239.field4019[5] = (byte) (var12 >> 8);
                    class239.field4019[7] = (byte) this.field474;
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class239.field4019[2] = (byte) (var11 >> 8);
                    class239.field4019[0] = (byte) (arg3 >> 8);
                    var11++;
                    class239.field4019[4] = (byte) (var12 >> 16);
                    this.field464.method1042((long) (var7 * 520), true);
                    this.field464.method1041(class239.field4019, (byte) 86, 8, 0);
                    var7 = var12;
                    this.field464.method1041(arg2, (byte) -84, var18, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)Lfi;")
    public static final class168 method174(boolean arg0, int arg1) {
        field469++;
        if (!arg0) {
            method171(-69);
        }
        class168 var2 = (class168) class127.field2118.method99((long) arg1, arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class222.field3729.method1149(3, (byte) 87, arg1);
        class168 var4 = new class168();
        if (var3 != null) {
            var4.method1262(-1, new class249(var3));
        }
        class127.field2118.method100((long) arg1, var4, 110);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[B")
    public final byte[] method175(int arg0, int arg1) {
        field473++;
        class141 var3 = this.field464;
        synchronized (this.field464) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field477.method1044(102)) {
                    return null;
                }
                this.field477.method1042((long) (arg1 * 6), true);
                int var5 = -110 / ((16 - arg0) / 59);
                this.field477.method1051(class239.field4019, 6, 80, 0);
                int var6 = (class239.field4019[0] & 0xFF << 16) - (-((class239.field4019[1] & 0xFF) << 8) - (class239.field4019[2] & 0xFF));
                int var7 = (class239.field4019[4] & 0xFF << 8) + (class239.field4019[3] & 0xFF << 16) + (class239.field4019[5] & 0xFF);
                if (var6 < 0 || this.field468 < var6) {
                    return null;
                } else if (var7 > 0 && ((long) var7) <= (this.field464.method1044(-103) / 520L)) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var6 > var11) {
                        if (var7 == 0) {
                            return null;
                        }
                        int var14 = var6 - var11;
                        this.field464.method1042((long) (var7 * 520), true);
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field464.method1051(class239.field4019, var14 + 8, 35, 0);
                        int var15 = (class239.field4019[0] & 0xFF << 8) + (class239.field4019[1] & 0xFF);
                        int var16 = ((class239.field4019[2] & 0xFF) << 8) + (class239.field4019[3] & 0xFF);
                        int var17 = (class239.field4019[6] & 0xFF) + (((class239.field4019[4] & 0xFF) << 16) + ((class239.field4019[5] & 0xFF) << 8));
                        int var18 = class239.field4019[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field474 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field464.method1044(-86) / 520L) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class239.field4019[var21 + 8];
                                }
                                var12++;
                                var7 = var17;
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

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
    public static final void method176() {
        for (int var0 = 0; var0 < class118.field1990; var0++) {
            class73 var1 = class140.field2310[var0];
            class81.method566(var1);
            class140.field2310[var0] = null;
        }
        class118.field1990 = 0;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ILpb;Lpb;I)V")
    public class27(int arg0, class141 arg1, class141 arg2, int arg3) {
        this.field464 = arg1;
        this.field474 = arg0;
        this.field468 = arg3;
        this.field477 = arg2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[BB)Z")
    public final boolean method177(int arg0, int arg1, byte[] arg2, byte arg3) {
        field465++;
        class141 var5 = this.field464;
        synchronized (this.field464) {
            if (arg0 < 0 || arg0 > this.field468) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method173((byte) 7, true, arg2, arg1, arg0);
            if (arg3 != -94) {
                method176();
            }
            if (!var6) {
                var6 = this.method173((byte) 7, false, arg2, arg1, arg0);
            }
            return var6;
        }
    }
}
