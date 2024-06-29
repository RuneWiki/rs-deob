import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class38 {

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lje;")
    private class178 field584 = null;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    private int field587 = 65000;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lje;")
    private class178 field591 = null;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Ljd;")
    private static class85 field582 = class221.method1499("Cancel", (byte) 116);

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Ljd;")
    public static class85 field592 = class221.method1499(")4", (byte) 121);

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Ljd;")
    public static class85 field596 = class221.method1499("Mem:", (byte) -86);

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Ljd;")
    private static class85 field594 = class221.method1499("wave2:", (byte) 126);

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Ljd;")
    public static class85 field585 = field594;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Ljd;")
    public static class85 field586 = field582;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Ljd;")
    public static class85 field595 = field594;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Ljf;")
    public static class62 field579;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lge;")
    public static class68 field589;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[I")
    public static int[] field593;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[BII)Z")
    public final boolean method251(int arg0, byte[] arg1, int arg2, int arg3) {
        field588++;
        if (arg3 != -1288866104) {
            return true;
        }
        class178 var5 = this.field591;
        synchronized (this.field591) {
            if (arg2 < 0 || this.field587 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method252(arg1, arg2, 255, arg0, true);
            if (!var6) {
                var6 = this.method252(arg1, arg2, arg3 ^ 0xB32D7637, arg0, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([BIIIZ)Z")
    private final boolean method252(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field590++;
        class178 var6 = this.field591;
        synchronized (this.field591) {
            try {
                int var8;
                if (arg4) {
                    if (this.field584.method1199(-1) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field584.method1203((long) (arg3 * 6), arg2 ^ 0xFFFF);
                    this.field584.method1198(6, 0, class107.field1885, (byte) 79);
                    var8 = ((class107.field1885[3] & 0xFF) << 16) + ((class107.field1885[4] & 0xFF) << 8) + (class107.field1885[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field591.method1199(-1) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field591.method1199(-1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class107.field1885[5] = (byte) var8;
                class107.field1885[0] = (byte) (arg1 >> 16);
                class107.field1885[1] = (byte) (arg1 >> 8);
                class107.field1885[2] = (byte) arg1;
                class107.field1885[4] = (byte) (var8 >> 8);
                int var10 = 0;
                class107.field1885[3] = (byte) (var8 >> 16);
                this.field584.method1203((long) (arg3 * 6), 65280);
                this.field584.method1204(0, 5230, 6, class107.field1885);
                if (arg2 != 255) {
                    this.toString();
                }
                int var11 = 0;
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label111: {
                            this.field591.method1203((long) (var8 * 520), arg2 + 65025);
                            try {
                                this.field591.method1198(8, 0, class107.field1885, (byte) 79);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class107.field1885[0] & 0xFF << 8) + (class107.field1885[1] & 0xFF);
                            int var14 = class107.field1885[7] & 0xFF;
                            var12 = (class107.field1885[6] & 0xFF) + (((class107.field1885[4] & 0xFF) << 16) + (class107.field1885[5] & 0xFF << 8));
                            int var15 = ((class107.field1885[2] & 0xFF) << 8) + (class107.field1885[3] & 0xFF);
                            if (arg3 == var13 && var11 == var15 && this.field583 == var14) {
                                if (var12 >= 0 && (this.field591.method1199(-1) / 520L) >= ((long) var12)) {
                                    break label111;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field591.method1199(-1) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                        arg4 = false;
                    }
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class107.field1885[0] = (byte) (arg3 >> 8);
                    class107.field1885[5] = (byte) (var12 >> 8);
                    class107.field1885[2] = (byte) (var11 >> 8);
                    class107.field1885[6] = (byte) var12;
                    class107.field1885[7] = (byte) this.field583;
                    class107.field1885[3] = (byte) var11;
                    class107.field1885[1] = (byte) arg3;
                    var11++;
                    class107.field1885[4] = (byte) (var12 >> 16);
                    this.field591.method1203((long) (var8 * 520), 65280);
                    var8 = var12;
                    this.field591.method1204(0, arg2 + 4975, 8, class107.field1885);
                    this.field591.method1204(var10, 5230, var18, arg0);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field581++;
        return "Cache:" + this.field583;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[B")
    public final byte[] method253(int arg0, int arg1) {
        if (arg1 != -513) {
            return null;
        }
        field580++;
        class178 var3 = this.field591;
        synchronized (this.field591) {
            try {
                if (this.field584.method1199(arg1 + 512) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field584.method1203((long) (arg0 * 6), 65280);
                this.field584.method1198(6, 0, class107.field1885, (byte) 79);
                int var5 = (class107.field1885[5] & 0xFF) + (((class107.field1885[3] & 0xFF) << 16) + (class107.field1885[4] & 0xFF << 8));
                int var6 = (class107.field1885[2] & 0xFF) + (class107.field1885[1] & 0xFF << 8) + (class107.field1885[0] & 0xFF << 16);
                if (var6 < 0 || var6 > this.field587) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field591.method1199(arg1 + 512) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        int var13 = var6 - var10;
                        this.field591.method1203((long) (var5 * 520), 65280);
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field591.method1198(var13 + 8, 0, class107.field1885, (byte) 79);
                        int var14 = ((class107.field1885[0] & 0xFF) << 8) + (class107.field1885[1] & 0xFF);
                        int var15 = class107.field1885[7] & 0xFF;
                        int var16 = ((class107.field1885[2] & 0xFF) << 8) + (class107.field1885[3] & 0xFF);
                        int var17 = ((class107.field1885[5] & 0xFF) << 8) + (class107.field1885[4] & 0xFF << 16) + (class107.field1885[6] & 0xFF);
                        if (arg0 == var14 && var11 == var16 && this.field583 == var15) {
                            if (var17 >= 0 && this.field591.method1199(arg1 + 512) / 520L >= (long) var17) {
                                var5 = var17;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var10++] = class107.field1885[var20 + 8];
                                    var20++;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method254(boolean arg0) {
        field592 = null;
        field586 = null;
        if (!arg0) {
            method254(false);
        }
        field579 = null;
        field596 = null;
        field595 = null;
        field593 = null;
        field582 = null;
        field585 = null;
        field589 = null;
        field594 = null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ILje;Lje;I)V")
    public class38(int arg0, class178 arg1, class178 arg2, int arg3) {
        this.field591 = arg1;
        this.field587 = arg3;
        this.field583 = arg0;
        this.field584 = arg2;
    }
}
