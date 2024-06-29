import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class18 {

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Llt;")
    private class255 field158 = null;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "Llt;")
    private class255 field162 = null;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
    private int field164 = 65000;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "[I")
    public static int[] field157 = new int[250];

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "Lqp;")
    public static class586 field167;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BI)[B")
    public final byte[] method83(byte arg0, int arg1) {
        field159++;
        class255 var3 = this.field162;
        synchronized (this.field162) {
            try {
                if (this.field158.method1616(-1) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field158.method1619((long) (arg1 * 6), (byte) 65);
                this.field158.method1617(class166.field2240, 6, 0, -17510);
                int var5 = (class166.field2240[2] & 0xFF) + ((class166.field2240[0] & 0xFF << 16) + ((class166.field2240[1] & 0xFF) << 8));
                int var6 = ((class166.field2240[4] & 0xFF) << 8) + ((class166.field2240[3] & 0xFF) << 16) + (class166.field2240[5] & 0xFF);
                if (var5 < 0 || this.field164 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field162.method1616(-1) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    if (arg0 > -4) {
                        this.field164 = 93;
                    }
                    label72: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field162.method1619((long) (var6 * 520), (byte) 65);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field162.method1617(class166.field2240, var13 + 8, 0, -17510);
                        int var14 = ((class166.field2240[0] & 0xFF) << 8) + (class166.field2240[1] & 0xFF);
                        int var15 = ((class166.field2240[2] & 0xFF) << 8) + (class166.field2240[3] & 0xFF);
                        int var16 = (class166.field2240[6] & 0xFF) + (class166.field2240[5] & 0xFF << 8) + (class166.field2240[4] & 0xFF << 16);
                        int var17 = class166.field2240[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field161 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field162.method1616(-1) / 520L)) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class166.field2240[var20 + 8];
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

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
    public static void method84(byte arg0) {
        field167 = null;
        if (arg0 >= -95) {
            method84((byte) -77);
        }
        field157 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "([BZIIZ)Z")
    private final boolean method85(byte[] arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field163++;
        class255 var6 = this.field162;
        synchronized (this.field162) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg2 * 6 + 6) > this.field158.method1616(-1)) {
                        return false;
                    }
                    this.field158.method1619((long) (arg2 * 6), (byte) 65);
                    this.field158.method1617(class166.field2240, 6, 0, -17510);
                    var8 = ((class166.field2240[3] & 0xFF) << 16) + (class166.field2240[4] & 0xFF << 8) + (class166.field2240[5] & 0xFF);
                    if (var8 <= 0 || this.field162.method1616(-1) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field162.method1616(-1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class166.field2240[5] = (byte) var8;
                class166.field2240[3] = (byte) (var8 >> 16);
                class166.field2240[1] = (byte) (arg3 >> 8);
                class166.field2240[2] = (byte) arg3;
                class166.field2240[4] = (byte) (var8 >> 8);
                class166.field2240[0] = (byte) (arg3 >> 16);
                this.field158.method1619((long) (arg2 * 6), (byte) 65);
                this.field158.method1611(6, 98, class166.field2240, 0);
                if (!arg4) {
                    this.field158 = null;
                }
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field162.method1619((long) (var8 * 520), (byte) 65);
                            try {
                                this.field162.method1617(class166.field2240, 8, 0, -17510);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class166.field2240[0] & 0xFF) << 8) + (class166.field2240[1] & 0xFF);
                            int var14 = ((class166.field2240[2] & 0xFF) << 8) + (class166.field2240[3] & 0xFF);
                            var12 = (class166.field2240[6] & 0xFF) + ((class166.field2240[5] & 0xFF) << 8) + (class166.field2240[4] & 0xFF << 16);
                            int var15 = class166.field2240[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field161 == var15) {
                                if (var12 >= 0 && (this.field162.method1616(-1) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field162.method1616(-1) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class166.field2240[2] = (byte) (var11 >> 8);
                    class166.field2240[0] = (byte) (arg2 >> 8);
                    class166.field2240[1] = (byte) arg2;
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class166.field2240[3] = (byte) var11;
                    class166.field2240[6] = (byte) var12;
                    class166.field2240[7] = (byte) this.field161;
                    class166.field2240[5] = (byte) (var12 >> 8);
                    class166.field2240[4] = (byte) (var12 >> 16);
                    this.field162.method1619((long) (var8 * 520), (byte) 65);
                    this.field162.method1611(8, -100, class166.field2240, 0);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field162.method1611(var18, 95, arg0, var10);
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

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(III[B)Z")
    public final boolean method86(int arg0, int arg1, int arg2, byte[] arg3) {
        field166++;
        class255 var5 = this.field162;
        synchronized (this.field162) {
            if (arg1 < 0 || this.field164 < arg1) {
                throw new IllegalArgumentException();
            } else if (arg0 == -17307) {
                boolean var7 = this.method85(arg3, true, arg2, arg1, true);
                if (!var7) {
                    var7 = this.method85(arg3, false, arg2, arg1, true);
                }
                return var7;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method87(int arg0, boolean arg1, String arg2, String arg3) {
        class69.field785 = arg1;
        field165++;
        class227.field3343 = arg2;
        if (arg0 != 30245) {
            field157 = null;
        }
        class451.field6590 = arg3;
        if (!class69.field785 && class322.field4782 != 3 && class227.field3343.equals("") || class451.field6590.equals("")) {
            class313.method1932(3, false);
            return;
        }
        if (class322.field4782 != 1) {
            class619.field9035 = 0;
            class431.field6313 = -1;
        }
        class590.field8736 = false;
        class313.method1932(-3, false);
        class142.field1852 = 0;
        class616.field9020 = 0;
        class395.field5743 = 1;
    }

    @OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field160++;
        return "Cache:" + this.field161;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(ILlt;Llt;I)V")
    public class18(int arg0, class255 arg1, class255 arg2, int arg3) {
        this.field158 = arg2;
        this.field164 = arg3;
        this.field162 = arg1;
        this.field161 = arg0;
    }

    static {
        new class487("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field167 = new class586(35, 14);
    }
}
