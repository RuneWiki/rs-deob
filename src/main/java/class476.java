import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class476 {

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    private int field6651 = 65000;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Llv;")
    private class408 field6644 = null;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Llv;")
    private class408 field6647 = null;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    private int field6649;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Luc;")
    public static class27 field6645 = new class27(29, 7);

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "Luc;")
    public static class27 field6650 = new class27(6, -1);

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "Lfc;")
    public static class235 field6653 = new class235(85, 9);

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "[[I")
    public static int[][] field6655;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 3)
    public static void method2705(int arg0) {
        field6655 = null;
        if (arg0 == 0) {
            field6645 = null;
            field6653 = null;
            field6650 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field6654++;
        return "Cache:" + this.field6649;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([BIBI)Z", line = 30)
    public final boolean method2706(byte[] arg0, int arg1, byte arg2, int arg3) {
        field6648++;
        class408 var5 = this.field6647;
        synchronized (this.field6647) {
            if (arg1 < 0 || this.field6651 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2707(true, arg3, arg0, arg1, (byte) -85);
            if (!var6) {
                var6 = this.method2707(false, arg3, arg0, arg1, (byte) -85);
            }
            int var7 = 85 / ((arg2 - 4) / 46);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI[BIB)Z", line = 56)
    private final boolean method2707(boolean arg0, int arg1, byte[] arg2, int arg3, byte arg4) {
        field6652++;
        class408 var6 = this.field6647;
        synchronized (this.field6647) {
            try {
                int var7;
                if (arg0) {
                    if (((long) (arg1 * 6 + 6)) > this.field6644.method2333(-1)) {
                        return false;
                    }
                    this.field6644.method2337(0, (long) (arg1 * 6));
                    this.field6644.method2334(class42.field597, arg4 ^ 0x2F, 0, 6);
                    var7 = (class42.field597[3] & 0xFF << 16) + (class42.field597[4] & 0xFF << 8) + (class42.field597[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field6647.method2333(-1) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field6647.method2333(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class42.field597[3] = (byte) (var7 >> 16);
                class42.field597[4] = (byte) (var7 >> 8);
                class42.field597[2] = (byte) arg3;
                class42.field597[5] = (byte) var7;
                class42.field597[0] = (byte) (arg3 >> 16);
                if (arg4 != -85) {
                    method2705(109);
                }
                class42.field597[1] = (byte) (arg3 >> 8);
                this.field6644.method2337(0, (long) (arg1 * 6));
                this.field6644.method2329(6, 0, class42.field597, false);
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field6647.method2337(arg4 ^ 0xFFFFFFAB, (long) (var7 * 520));
                            try {
                                this.field6647.method2334(class42.field597, -117, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class42.field597[0] & 0xFF) << 8) + (class42.field597[1] & 0xFF);
                            int var14 = ((class42.field597[2] & 0xFF) << 8) + (class42.field597[3] & 0xFF);
                            var12 = (class42.field597[5] & 0xFF << 8) + (class42.field597[4] & 0xFF << 16) + (class42.field597[6] & 0xFF);
                            int var15 = class42.field597[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field6649 == var15) {
                                if (var12 >= 0 && this.field6647.method2333(arg4 ^ 0x54) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field6647.method2333(-1) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class42.field597[1] = (byte) arg1;
                    class42.field597[0] = (byte) (arg1 >> 8);
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class42.field597[3] = (byte) var11;
                    class42.field597[2] = (byte) (var11 >> 8);
                    class42.field597[5] = (byte) (var12 >> 8);
                    class42.field597[7] = (byte) this.field6649;
                    class42.field597[4] = (byte) (var12 >> 16);
                    class42.field597[6] = (byte) var12;
                    this.field6647.method2337(0, (long) (var7 * 520));
                    this.field6647.method2329(8, 0, class42.field597, false);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field6647.method2329(var18, var10, arg2, false);
                    var7 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)[B", line = 184)
    public final byte[] method2708(int arg0, int arg1) {
        field6646++;
        class408 var3 = this.field6647;
        synchronized (this.field6647) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field6644.method2333(-1)) {
                    return null;
                }
                this.field6644.method2337(0, (long) (arg1 * 6));
                this.field6644.method2334(class42.field597, -114, 0, 6);
                int var5 = (class42.field597[2] & 0xFF) + (((class42.field597[0] & 0xFF) << 16) + (class42.field597[1] & 0xFF << 8));
                int var6 = (class42.field597[5] & 0xFF) + ((class42.field597[3] & 0xFF) << 16) + ((class42.field597[4] & 0xFF) << 8);
                if (arg0 >= -125) {
                    return null;
                } else if (var5 < 0 || var5 > this.field6651) {
                    return null;
                } else if (var6 > 0 && (this.field6647.method2333(-1) / 520L) >= ((long) var6)) {
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field6647.method2337(0, (long) (var6 * 520));
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field6647.method2334(class42.field597, -119, 0, var14 + 8);
                        int var15 = ((class42.field597[0] & 0xFF) << 8) + (class42.field597[1] & 0xFF);
                        int var16 = ((class42.field597[2] & 0xFF) << 8) + (class42.field597[3] & 0xFF);
                        int var17 = (class42.field597[6] & 0xFF) + ((class42.field597[5] & 0xFF) << 8) + (class42.field597[4] & 0xFF << 16);
                        int var18 = class42.field597[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field6649 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field6647.method2333(-1) / 520L)) {
                                var6 = var17;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class42.field597[var21 + 8];
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(ILlv;Llv;I)V", line = 284)
    public class476(int arg0, class408 arg1, class408 arg2, int arg3) {
        this.field6644 = arg2;
        this.field6649 = arg0;
        this.field6647 = arg1;
        this.field6651 = arg3;
    }
}
