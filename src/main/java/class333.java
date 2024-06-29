import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class333 {

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Ljm;")
    private class409 field5202 = null;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    private int field5204 = 65000;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Ljm;")
    private class409 field5208 = null;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    private int field5205;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
    public static boolean field5199 = false;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5200 = 52;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([BIII)Z")
    public final boolean method2204(byte[] arg0, int arg1, int arg2, int arg3) {
        field5206++;
        class409 var5 = this.field5202;
        synchronized (this.field5202) {
            if (arg3 < 0 || arg3 > this.field5204) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2207(true, arg0, arg3, arg1 ^ 0x20F, arg2);
            if (arg1 != 8) {
                field5201 = 76;
            }
            if (!var6) {
                var6 = this.method2207(false, arg0, arg3, 519, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
    public static final void method2205(int arg0, int arg1) {
        class232 var2 = class423.field6252[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class232 var4 = class423.field6252[var3][arg0][arg1] = class423.field6252[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3874--;
                for (class247 var5 = var4.field3866; var5 != null; var5 = var5.field4054) {
                    class57 var6 = var5.field4052;
                    if (var6.field726 == arg0 && var6.field720 == arg1) {
                        var6.field714--;
                    }
                }
            }
        }
        if (class423.field6252[0][arg0][arg1] == null) {
            class423.field6252[0][arg0][arg1] = new class232(0, arg0, arg1);
            class423.field6252[0][arg0][arg1].field3879 = 1;
        }
        class423.field6252[0][arg0][arg1].field3863 = var2;
        class423.field6252[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[B")
    public final byte[] method2206(int arg0, int arg1) {
        field5203++;
        class409 var3 = this.field5202;
        synchronized (this.field5202) {
            try {
                if (this.field5208.method2563((byte) 30) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field5208.method2564((long) (arg0 * 6), arg1 ^ 0x3);
                this.field5208.method2567(-119, class345.field5319, 0, 6);
                int var5 = ((class345.field5319[0] & 0xFF) << 16) + (class345.field5319[1] & 0xFF << 8) + (class345.field5319[2] & 0xFF);
                int var6 = (class345.field5319[arg1] & 0xFF << 16) - (-((class345.field5319[4] & 0xFF) << 8) - (class345.field5319[5] & 0xFF));
                if (var5 < 0 || var5 > this.field5204) {
                    return null;
                } else if (var6 > 0 && (this.field5202.method2563((byte) 30) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label70: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field5202.method2564((long) (var6 * 520), 0);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field5202.method2567(-105, class345.field5319, 0, var13 + 8);
                        int var14 = ((class345.field5319[0] & 0xFF) << 8) + (class345.field5319[1] & 0xFF);
                        int var15 = ((class345.field5319[2] & 0xFF) << 8) + (class345.field5319[3] & 0xFF);
                        int var16 = (class345.field5319[6] & 0xFF) + (((class345.field5319[4] & 0xFF) << 16) + (class345.field5319[5] & 0xFF << 8));
                        int var17 = class345.field5319[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field5205 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field5202.method2563((byte) 30) / 520L) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var9[var10++] = class345.field5319[var20 + 8];
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

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z[BIII)Z")
    private final boolean method2207(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 519) {
            return false;
        }
        field5207++;
        class409 var6 = this.field5202;
        synchronized (this.field5202) {
            try {
                int var7;
                if (arg0) {
                    if (((long) (arg4 * 6 + 6)) > this.field5208.method2563((byte) 30)) {
                        return false;
                    }
                    this.field5208.method2564((long) (arg4 * 6), arg3 - 519);
                    this.field5208.method2567(-126, class345.field5319, 0, 6);
                    var7 = (class345.field5319[5] & 0xFF) + ((class345.field5319[4] & 0xFF) << 8) + (class345.field5319[3] & 0xFF << 16);
                    if (var7 <= 0 || this.field5202.method2563((byte) 30) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field5202.method2563((byte) 30) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class345.field5319[3] = (byte) (var7 >> 16);
                class345.field5319[2] = (byte) arg2;
                class345.field5319[5] = (byte) var7;
                class345.field5319[1] = (byte) (arg2 >> 8);
                class345.field5319[4] = (byte) (var7 >> 8);
                class345.field5319[0] = (byte) (arg2 >> 16);
                this.field5208.method2564((long) (arg4 * 6), 0);
                this.field5208.method2560(-1, 0, 6, class345.field5319);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg2) {
                    int var12 = 0;
                    if (arg0) {
                        label110: {
                            this.field5202.method2564((long) (var7 * 520), 0);
                            try {
                                this.field5202.method2567(-108, class345.field5319, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class345.field5319[0] & 0xFF) << 8) + (class345.field5319[1] & 0xFF);
                            var12 = (class345.field5319[4] & 0xFF << 16) + (class345.field5319[5] & 0xFF << 8) + (class345.field5319[6] & 0xFF);
                            int var14 = (class345.field5319[2] & 0xFF << 8) + (class345.field5319[3] & 0xFF);
                            int var15 = class345.field5319[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field5205 == var15) {
                                if (var12 >= 0 && (this.field5202.method2563((byte) 30) / 520L) >= ((long) var12)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field5202.method2563((byte) 30) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class345.field5319[0] = (byte) (arg4 >> 8);
                    class345.field5319[1] = (byte) arg4;
                    class345.field5319[2] = (byte) (var11 >> 8);
                    if ((arg2 - var10) <= 512) {
                        var12 = 0;
                    }
                    class345.field5319[3] = (byte) var11;
                    class345.field5319[7] = (byte) this.field5205;
                    class345.field5319[4] = (byte) (var12 >> 16);
                    class345.field5319[5] = (byte) (var12 >> 8);
                    class345.field5319[6] = (byte) var12;
                    this.field5202.method2564((long) (var7 * 520), 0);
                    this.field5202.method2560(-1, 0, 8, class345.field5319);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field5202.method2560(arg3 ^ 0xFFFFFDF8, var10, var18, arg1);
                    var10 += var18;
                    var11++;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5209++;
        return "Cache:" + this.field5205;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILjm;Ljm;I)V")
    public class333(int arg0, class409 arg1, class409 arg2, int arg3) {
        this.field5202 = arg1;
        this.field5204 = arg3;
        this.field5208 = arg2;
        this.field5205 = arg0;
    }
}
