import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class144 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Laf;")
    private class7 field3590 = null;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    private int field3599 = 65000;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Laf;")
    private class7 field3609 = null;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    private int field3596;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3591 = 0;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Loc;")
    public static class99 field3598 = class48.method402((byte) -104, "@whi@");

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3604 = 0;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Loc;")
    public static class99 field3595 = class48.method402((byte) -104, "Fertigkeit)2");

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lef;")
    public static class35 field3603;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "[I")
    public static int[] field3608;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[Lhe;")
    public static class54[] field3607;

    @OriginalMember(owner = "client!ve", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3602++;
        return "Cache:" + this.field3596;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1180(int arg0) {
        if (arg0 != -1654066136) {
            field3607 = null;
        }
        field3607 = null;
        field3595 = null;
        field3608 = null;
        field3598 = null;
        field3603 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[B")
    public final byte[] method1181(int arg0, byte arg1) {
        field3594++;
        class7 var3 = this.field3590;
        synchronized (this.field3590) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3609.method93((byte) -66)) {
                    return null;
                }
                if (arg1 != -3) {
                    this.method1185(null, -107, -78, -7);
                }
                this.field3609.method89((byte) 54, (long) (arg0 * 6));
                this.field3609.method86(class33.field800, 0, (byte) -82, 6);
                int var5 = ((class33.field800[4] & 0xFF) << 8) + ((class33.field800[3] & 0xFF) << 16) + (class33.field800[5] & 0xFF);
                int var6 = ((class33.field800[0] & 0xFF) << 16) + (class33.field800[2] & 0xFF) + ((class33.field800[1] & 0xFF) << 8);
                if (var6 < 0 || this.field3599 < var6) {
                    return null;
                } else if (var5 > 0 && this.field3590.method93((byte) -66) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field3590.method89((byte) 54, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3590.method86(class33.field800, 0, (byte) -82, var13 + 8);
                        int var14 = ((class33.field800[0] & 0xFF) << 8) + (class33.field800[1] & 0xFF);
                        int var15 = ((class33.field800[2] & 0xFF) << 8) + (class33.field800[3] & 0xFF);
                        int var16 = ((class33.field800[5] & 0xFF) << 8) + (((class33.field800[4] & 0xFF) << 16) + (class33.field800[6] & 0xFF));
                        int var17 = class33.field800[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field3596 == var17) {
                            if (var16 >= 0 && this.field3590.method93((byte) -66) / 520L >= (long) var16) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class33.field800[var20 + 8];
                                }
                                var11++;
                                var5 = var16;
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

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
    public static final int method1182(int arg0, int arg1, int arg2) {
        int var3 = -5 / ((arg0 + 22) / 50);
        int var4 = class113.method956(arg2 - 1, 15731, arg1 - 1) + class113.method956(arg2 - 1, 15731, arg1 + 1) + class113.method956(arg2 + 1, 15731, arg1 + -1) + class113.method956(arg2 + 1, 15731, arg1 + 1);
        field3597++;
        int var5 = class113.method956(arg2, 15731, arg1 - 1) + class113.method956(arg2, 15731, arg1 + 1) + class113.method956(arg2 + -1, 15731, arg1) + class113.method956(arg2 + 1, 15731, arg1);
        int var6 = class113.method956(arg2, 15731, arg1);
        return var4 / 16 + var5 / 8 + var6 / 4;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
    public static final int method1183(int arg0) {
        field3606++;
        return arg0 >= -82 ? 112 : 19;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z")
    public static final boolean method1184(byte arg0) {
        field3605++;
        if (arg0 <= 45) {
            field3607 = null;
        }
        class125 var1 = class39.field978;
        synchronized (class39.field978) {
            if (class14.field351 == class121.field2956) {
                return false;
            } else {
                class68.field1756 = class108.field2639[class14.field351];
                class11.field261 = class122.field2985[class14.field351];
                class14.field351 = class14.field351 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIII)Z")
    public final boolean method1185(byte[] arg0, int arg1, int arg2, int arg3) {
        field3593++;
        class7 var5 = this.field3590;
        synchronized (this.field3590) {
            if (arg3 != 1) {
                return true;
            } else if (arg2 >= 0 && this.field3599 >= arg2) {
                boolean var7 = this.method1186(true, true, arg2, arg0, arg1);
                if (!var7) {
                    var7 = this.method1186(false, true, arg2, arg0, arg1);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZZI[BI)Z")
    private final boolean method1186(boolean arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field3600++;
        class7 var6 = this.field3590;
        synchronized (this.field3590) {
            try {
                int var8;
                if (arg0) {
                    if (this.field3609.method93((byte) -66) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field3609.method89((byte) 54, (long) (arg4 * 6));
                    this.field3609.method86(class33.field800, 0, (byte) -82, 6);
                    var8 = (class33.field800[5] & 0xFF) + ((class33.field800[4] & 0xFF) << 8) + ((class33.field800[3] & 0xFF) << 16);
                    if (var8 <= 0 || (long) var8 > this.field3590.method93((byte) -66) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3590.method93((byte) -66) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class33.field800[5] = (byte) var8;
                class33.field800[1] = (byte) (arg2 >> 8);
                class33.field800[3] = (byte) (var8 >> 16);
                int var10 = 0;
                class33.field800[4] = (byte) (var8 >> 8);
                if (!arg1) {
                    this.field3609 = null;
                }
                class33.field800[0] = (byte) (arg2 >> 16);
                int var11 = 0;
                class33.field800[2] = (byte) arg2;
                this.field3609.method89((byte) 54, (long) (arg4 * 6));
                this.field3609.method88(6, class33.field800, 19102, 0);
                while (arg2 > var11) {
                    int var12 = 0;
                    if (arg0) {
                        label108: {
                            this.field3590.method89((byte) 54, (long) (var8 * 520));
                            try {
                                this.field3590.method86(class33.field800, 0, (byte) -82, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class33.field800[5] & 0xFF) << 8) + ((class33.field800[4] & 0xFF) << 16) + (class33.field800[6] & 0xFF);
                            int var13 = ((class33.field800[0] & 0xFF) << 8) + (class33.field800[1] & 0xFF);
                            int var14 = ((class33.field800[2] & 0xFF) << 8) + (class33.field800[3] & 0xFF);
                            int var15 = class33.field800[7] & 0xFF;
                            if (arg4 == var13 && var10 == var14 && this.field3596 == var15) {
                                if (var12 >= 0 && this.field3590.method93((byte) -66) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg2 - var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3590.method93((byte) -66) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg2 - var11 <= 512) {
                        var12 = 0;
                    }
                    class33.field800[7] = (byte) this.field3596;
                    class33.field800[0] = (byte) (arg4 >> 8);
                    class33.field800[3] = (byte) var10;
                    class33.field800[4] = (byte) (var12 >> 16);
                    class33.field800[2] = (byte) (var10 >> 8);
                    var10++;
                    class33.field800[1] = (byte) arg4;
                    class33.field800[6] = (byte) var12;
                    class33.field800[5] = (byte) (var12 >> 8);
                    this.field3590.method89((byte) 54, (long) (var8 * 520));
                    var8 = var12;
                    this.field3590.method88(8, class33.field800, 19102, 0);
                    this.field3590.method88(var18, arg3, 19102, var11);
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ILaf;Laf;I)V")
    public class144(int arg0, class7 arg1, class7 arg2, int arg3) {
        this.field3599 = arg3;
        this.field3596 = arg0;
        this.field3590 = arg1;
        this.field3609 = arg2;
    }
}
