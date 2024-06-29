import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class586 {

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Ll;")
    private class18 field7995 = null;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Ll;")
    private class18 field8000 = null;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
    private int field8001 = 65000;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    private int field7994;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II[BI)Z", line = 4)
    public final boolean method3346(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != -7305) {
            return true;
        }
        field7997++;
        class18 var5 = this.field7995;
        synchronized (this.field7995) {
            if (arg0 < 0 || this.field8001 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method3348(arg2, -15096, arg1, arg0, true);
            if (!var6) {
                var6 = this.method3348(arg2, -15096, arg1, arg0, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)[B", line = 33)
    public final byte[] method3347(byte arg0, int arg1) {
        field7999++;
        class18 var3 = this.field7995;
        synchronized (this.field7995) {
            try {
                if (this.field8000.method137(0) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field8000.method139((long) (arg1 * 6), (byte) -106);
                this.field8000.method138(0, class212.field3012, 6, arg0 - 16713);
                int var5 = (class212.field3012[2] & 0xFF) + (class212.field3012[1] & 0xFF << 8) + (class212.field3012[0] & 0xFF << 16);
                int var6 = ((class212.field3012[3] & 0xFF) << 16) + (class212.field3012[5] & 0xFF) + ((class212.field3012[4] & 0xFF) << 8);
                if (var5 < 0 || var5 > this.field8001) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field7995.method137(0) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg0 != -4) {
                        return null;
                    }
                    int var12 = 0;
                    label76: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field7995.method139((long) (var6 * 520), (byte) -103);
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field7995.method138(0, class212.field3012, var14 + 8, arg0 ^ 0x414F);
                        int var15 = (class212.field3012[0] & 0xFF << 8) + (class212.field3012[1] & 0xFF);
                        int var16 = (class212.field3012[2] & 0xFF << 8) + (class212.field3012[3] & 0xFF);
                        int var17 = (class212.field3012[6] & 0xFF) + ((class212.field3012[5] & 0xFF) << 8) + (class212.field3012[4] & 0xFF << 16);
                        int var18 = class212.field3012[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field7994 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field7995.method137(arg0 + 4) / 520L) {
                                var6 = var17;
                                var12++;
                                int var21 = 0;
                                while (true) {
                                    if (var21 >= var14) {
                                        continue label76;
                                    }
                                    var9[var10++] = class212.field3012[var21 + 8];
                                    var21++;
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "([BIIIZ)Z", line = 114)
    private final boolean method3348(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7998++;
        class18 var6 = this.field7995;
        synchronized (this.field7995) {
            try {
                int var8;
                if (arg4) {
                    if (this.field8000.method137(arg1 + 15096) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field8000.method139((long) (arg2 * 6), (byte) 70);
                    this.field8000.method138(0, class212.field3012, 6, -16717);
                    var8 = ((class212.field3012[4] & 0xFF) << 8) + ((class212.field3012[3] & 0xFF) << 16) + (class212.field3012[5] & 0xFF);
                    if (var8 <= 0 || ((long) var8) > (this.field7995.method137(arg1 ^ 0xFFFFC508) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field7995.method137(0) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class212.field3012[0] = (byte) (arg3 >> 16);
                class212.field3012[4] = (byte) (var8 >> 8);
                class212.field3012[2] = (byte) arg3;
                class212.field3012[1] = (byte) (arg3 >> 8);
                class212.field3012[3] = (byte) (var8 >> 16);
                class212.field3012[5] = (byte) var8;
                this.field8000.method139((long) (arg2 * 6), (byte) 111);
                this.field8000.method133(0, 6, true, class212.field3012);
                int var10 = 0;
                if (arg1 != -15096) {
                    this.field7994 = 122;
                }
                int var11 = 0;
                while (var10 < arg3) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field7995.method139((long) (var8 * 520), (byte) -116);
                            try {
                                this.field7995.method138(0, class212.field3012, 8, -16717);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class212.field3012[0] & 0xFF << 8) + (class212.field3012[1] & 0xFF);
                            var12 = (class212.field3012[5] & 0xFF << 8) + (((class212.field3012[4] & 0xFF) << 16) + (class212.field3012[6] & 0xFF));
                            int var14 = (class212.field3012[2] & 0xFF << 8) + (class212.field3012[3] & 0xFF);
                            int var15 = class212.field3012[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field7994 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field7995.method137(0) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field7995.method137(0) + 519L) / 520L);
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
                    class212.field3012[3] = (byte) var11;
                    class212.field3012[2] = (byte) (var11 >> 8);
                    class212.field3012[0] = (byte) (arg2 >> 8);
                    class212.field3012[1] = (byte) arg2;
                    class212.field3012[5] = (byte) (var12 >> 8);
                    class212.field3012[6] = (byte) var12;
                    class212.field3012[7] = (byte) this.field7994;
                    class212.field3012[4] = (byte) (var12 >> 16);
                    this.field7995.method139((long) (var8 * 520), (byte) -121);
                    this.field7995.method133(0, 8, true, class212.field3012);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field7995.method133(var10, var18, true, arg0);
                    var11++;
                    var10 += var18;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(ILl;Ll;I)V", line = 272)
    public class586(int arg0, class18 arg1, class18 arg2, int arg3) {
        this.field7994 = arg0;
        this.field7995 = arg1;
        this.field8000 = arg2;
        this.field8001 = arg3;
    }

    @OriginalMember(owner = "client!nw", name = "toString", descriptor = "()Ljava/lang/String;", line = 243)
    public final String toString() {
        field7996++;
        return "Cache:" + this.field7994;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IBI)Z", line = 255)
    public static final boolean method3349(int arg0, byte arg1, int arg2) {
        int var3 = -65 / ((arg1 - 2) / 55);
        field7993++;
        return (arg2 & 0x800) != 0;
    }
}
