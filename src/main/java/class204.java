import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class class204 {

    @OriginalMember(owner = "wb", name = "a", descriptor = "I")
    private int field4000 = 65000;

    @OriginalMember(owner = "wb", name = "l", descriptor = "Lhf;")
    private class75 field4011 = null;

    @OriginalMember(owner = "wb", name = "o", descriptor = "Lhf;")
    private class75 field4014 = null;

    @OriginalMember(owner = "wb", name = "e", descriptor = "I")
    private int field4004;

    @OriginalMember(owner = "wb", name = "d", descriptor = "Llf;")
    public static class109 field4003 = class35.method275("Die Adresse dieses Computers wurde gesperrt)1", 2);

    @OriginalMember(owner = "wb", name = "i", descriptor = "Llf;")
    public static class109 field4008 = class35.method275("rot:", 2);

    @OriginalMember(owner = "wb", name = "h", descriptor = "Llf;")
    public static class109 field4007 = class35.method275("sl_button", 2);

    @OriginalMember(owner = "wb", name = "g", descriptor = "I")
    public static int field4006 = 0;

    @OriginalMember(owner = "wb", name = "b", descriptor = "Llf;")
    public static class109 field4001 = null;

    @OriginalMember(owner = "wb", name = "r", descriptor = "Llf;")
    public static class109 field4017 = class35.method275("runes", 2);

    @OriginalMember(owner = "wb", name = "q", descriptor = "I")
    public static int field4016 = 0;

    @OriginalMember(owner = "wb", name = "c", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "wb", name = "f", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "wb", name = "j", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "wb", name = "k", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "wb", name = "m", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "wb", name = "n", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "wb", name = "p", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "wb", name = "s", descriptor = "[[[B")
    public static byte[][][] field4018;

    @OriginalMember(owner = "wb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4015++;
        return "Cache:" + this.field4004;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IB)[B")
    public final byte[] method1342(int arg0, byte arg1) {
        field4002++;
        class75 var3 = this.field4014;
        synchronized (this.field4014) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field4011.method476(-117)) {
                    return null;
                }
                int var5 = -108 % ((54 - arg1) / 36);
                this.field4011.method477((long) (arg0 * 6), false);
                this.field4011.method468(-125, 0, 6, class96.field1954);
                int var6 = ((class96.field1954[3] & 0xFF) << 16) + (class96.field1954[4] << 8 & 0xFF00) + (class96.field1954[5] & 0xFF);
                int var7 = ((class96.field1954[0] & 0xFF) << 16) + ((class96.field1954[1] & 0xFF) << 8) + (class96.field1954[2] & 0xFF);
                if (var7 < 0 || var7 > this.field4000) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field4014.method476(-127) / 520L) {
                    byte[] var10 = new byte[var7];
                    int var11 = 0;
                    int var12 = 0;
                    label70: while (var7 > var12) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4014.method477((long) (var6 * 520), false);
                        int var14 = var7 - var12;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4014.method468(-126, 0, var14 + 8, class96.field1954);
                        int var15 = ((class96.field1954[0] & 0xFF) << 8) + (class96.field1954[1] & 0xFF);
                        int var16 = class96.field1954[7] & 0xFF;
                        int var17 = ((class96.field1954[2] & 0xFF) << 8) + (class96.field1954[3] & 0xFF);
                        int var18 = ((class96.field1954[4] & 0xFF) << 16) + ((class96.field1954[5] & 0xFF) << 8) + (class96.field1954[6] & 0xFF);
                        if (arg0 == var15 && var11 == var17 && this.field4004 == var16) {
                            if (var18 >= 0 && (long) var18 <= this.field4014.method476(-119) / 520L) {
                                var6 = var18;
                                var11++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label70;
                                    }
                                    var10[var12++] = class96.field1954[var21 + 8];
                                    var21++;
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
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "([BILwb;I)V")
    public static final void method1343(byte[] arg0, int arg1, class204 arg2, int arg3) {
        field4009++;
        class136 var4 = new class136();
        var4.field2635 = arg0;
        var4.field2624 = arg2;
        var4.field2626 = arg3;
        var4.field1381 = arg1;
        class181 var5 = class51.field1037;
        synchronized (class51.field1037) {
            class51.field1037.method1231(var4, 0);
        }
        class67.method440((byte) -86);
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "([BIII)Z")
    public final boolean method1344(byte[] arg0, int arg1, int arg2, int arg3) {
        field4010++;
        class75 var5 = this.field4014;
        synchronized (this.field4014) {
            if (arg3 < 0 || this.field4000 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1346(true, arg2 ^ 0xFF00FF, arg0, arg1, arg3);
            if (arg2 != 255) {
                this.field4014 = null;
            }
            if (!var6) {
                var6 = this.method1346(false, 16711680, arg0, arg1, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(BI)V")
    public static final void method1345(byte arg0, int arg1) {
        field4012++;
        if (arg0 != 58) {
            field4005 = 33;
        }
        if (!class185.method1253(false, arg1)) {
            return;
        }
        class200[] var2 = class169.field3146[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class200 var4 = var2[var3];
            if (var4 != null) {
                var4.field3822 = 0;
                var4.field3939 = 0;
            }
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(ZI[BII)Z")
    private final boolean method1346(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field4013++;
        class75 var6 = this.field4014;
        synchronized (this.field4014) {
            if (arg1 != 16711680) {
                this.method1346(true, 84, null, 19, -39);
            }
            try {
                int var7;
                if (arg0) {
                    if (this.field4011.method476(-126) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field4011.method477((long) (arg3 * 6), false);
                    this.field4011.method468(-128, 0, 6, class96.field1954);
                    var7 = ((class96.field1954[4] & 0xFF) << 8) + ((class96.field1954[3] & 0xFF) << 16) + (class96.field1954[5] & 0xFF);
                    if (var7 <= 0 || this.field4014.method476(-126) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4014.method476(-118) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class96.field1954[2] = (byte) arg4;
                class96.field1954[5] = (byte) var7;
                int var10 = 0;
                class96.field1954[1] = (byte) (arg4 >> 8);
                class96.field1954[0] = (byte) (arg4 >> 16);
                class96.field1954[4] = (byte) (var7 >> 8);
                int var11 = 0;
                class96.field1954[3] = (byte) (var7 >> 16);
                this.field4011.method477((long) (arg3 * 6), false);
                this.field4011.method474(class96.field1954, 0, (byte) 19, 6);
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field4014.method477((long) (var7 * 520), false);
                            try {
                                this.field4014.method468(arg1 ^ 0xFF00FF82, 0, 8, class96.field1954);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class96.field1954[4] & 0xFF) << 16) + (class96.field1954[6] & 0xFF) + ((class96.field1954[5] & 0xFF) << 8);
                            int var13 = ((class96.field1954[0] & 0xFF) << 8) + (class96.field1954[1] & 0xFF);
                            int var14 = ((class96.field1954[2] & 0xFF) << 8) + (class96.field1954[3] & 0xFF);
                            int var15 = class96.field1954[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field4004 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field4014.method476(-119) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field4014.method476(-122) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class96.field1954[5] = (byte) (var12 >> 8);
                    class96.field1954[6] = (byte) var12;
                    class96.field1954[1] = (byte) arg3;
                    class96.field1954[0] = (byte) (arg3 >> 8);
                    class96.field1954[2] = (byte) (var11 >> 8);
                    class96.field1954[4] = (byte) (var12 >> 16);
                    class96.field1954[3] = (byte) var11;
                    class96.field1954[7] = (byte) this.field4004;
                    this.field4014.method477((long) (var7 * 520), false);
                    var7 = var12;
                    var11++;
                    int var18 = arg4 - var10;
                    this.field4014.method474(class96.field1954, 0, (byte) 19, 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4014.method474(arg2, var10, (byte) 19, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(I)V")
    public static void method1347(int arg0) {
        field4017 = null;
        if (arg0 > -81) {
            field4006 = 68;
        }
        field4003 = null;
        field4008 = null;
        field4018 = null;
        field4001 = null;
        field4007 = null;
    }

    @OriginalMember(owner = "wb", name = "<init>", descriptor = "(ILhf;Lhf;I)V")
    public class204(int arg0, class75 arg1, class75 arg2, int arg3) {
        this.field4004 = arg0;
        this.field4011 = arg2;
        this.field4000 = arg3;
        this.field4014 = arg1;
    }
}
