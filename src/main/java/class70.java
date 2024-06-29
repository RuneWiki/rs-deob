import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class70 {

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    private int field918 = 65000;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Lpl;")
    private class459 field919 = null;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "Lpl;")
    private class459 field925 = null;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "[I")
    public static int[] field920 = new int[4096];

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "Lct;")
    public static class104 field923;

    @OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field917++;
        return "Cache:" + this.field924;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II[BB)Z")
    public final boolean method511(int arg0, int arg1, byte[] arg2, byte arg3) {
        field921++;
        if (arg3 != -122) {
            field920 = null;
        }
        class459 var5 = this.field919;
        synchronized (this.field919) {
            if (arg1 < 0 || this.field918 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method512(arg0, arg2, arg1, true, (byte) 120);
            if (!var6) {
                var6 = this.method512(arg0, arg2, arg1, false, (byte) 95);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[BIZB)Z")
    private final boolean method512(int arg0, byte[] arg1, int arg2, boolean arg3, byte arg4) {
        field915++;
        class459 var6 = this.field919;
        synchronized (this.field919) {
            try {
                int var8;
                if (arg3) {
                    if (this.field925.method2848(19284) < ((long) (arg0 * 6 + 6))) {
                        return false;
                    }
                    this.field925.method2853((long) (arg0 * 6), false);
                    this.field925.method2845(class120.field1606, 6, -1, 0);
                    var8 = (class120.field1606[5] & 0xFF) + (class120.field1606[3] & 0xFF << 16) + (class120.field1606[4] & 0xFF << 8);
                    if (var8 <= 0 || (this.field919.method2848(19284) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field919.method2848(19284) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class120.field1606[3] = (byte) (var8 >> 16);
                class120.field1606[2] = (byte) arg2;
                class120.field1606[4] = (byte) (var8 >> 8);
                class120.field1606[0] = (byte) (arg2 >> 16);
                class120.field1606[5] = (byte) var8;
                class120.field1606[1] = (byte) (arg2 >> 8);
                this.field925.method2853((long) (arg0 * 6), false);
                if (arg4 < 81) {
                    field923 = null;
                }
                this.field925.method2849(class120.field1606, 6, (byte) -101, 0);
                int var10 = 0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field919.method2853((long) (var8 * 520), false);
                            try {
                                this.field919.method2845(class120.field1606, 8, -1, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class120.field1606[0] & 0xFF) << 8) + (class120.field1606[1] & 0xFF);
                            var12 = (class120.field1606[6] & 0xFF) + ((class120.field1606[5] & 0xFF) << 8) + (class120.field1606[4] & 0xFF << 16);
                            int var14 = ((class120.field1606[2] & 0xFF) << 8) + (class120.field1606[3] & 0xFF);
                            int var15 = class120.field1606[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field924 == var15) {
                                if (var12 >= 0 && (this.field919.method2848(19284) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field919.method2848(19284) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class120.field1606[0] = (byte) (arg0 >> 8);
                    class120.field1606[2] = (byte) (var11 >> 8);
                    class120.field1606[1] = (byte) arg0;
                    class120.field1606[3] = (byte) var11;
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class120.field1606[7] = (byte) this.field924;
                    class120.field1606[5] = (byte) (var12 >> 8);
                    class120.field1606[6] = (byte) var12;
                    class120.field1606[4] = (byte) (var12 >> 16);
                    this.field919.method2853((long) (var8 * 520), false);
                    this.field919.method2849(class120.field1606, 8, (byte) -29, 0);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field919.method2849(arg1, var18, (byte) -92, var10);
                    var8 = var12;
                    var11++;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public static void method513(byte arg0) {
        int var1 = -87 / ((arg0 - 70) / 38);
        field923 = null;
        field920 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)[B")
    public final byte[] method514(byte arg0, int arg1) {
        field916++;
        class459 var3 = this.field919;
        synchronized (this.field919) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field925.method2848(19284)) {
                    return null;
                }
                this.field925.method2853((long) (arg1 * 6), false);
                this.field925.method2845(class120.field1606, 6, -1, 0);
                int var5 = (class120.field1606[0] & 0xFF << 16) + ((class120.field1606[1] & 0xFF) << 8) + (class120.field1606[2] & 0xFF);
                if (arg0 <= 108) {
                    return null;
                }
                int var7 = (class120.field1606[5] & 0xFF) + (((class120.field1606[3] & 0xFF) << 16) + (class120.field1606[4] & 0xFF << 8));
                if (var5 < 0 || var5 > this.field918) {
                    return null;
                } else if (var7 > 0 && this.field919.method2848(19284) / 520L >= (long) var7) {
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    label74: while (var11 < var5) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field919.method2853((long) (var7 * 520), false);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field919.method2845(class120.field1606, var14 + 8, -1, 0);
                        int var15 = (class120.field1606[0] & 0xFF << 8) + (class120.field1606[1] & 0xFF);
                        int var16 = ((class120.field1606[2] & 0xFF) << 8) + (class120.field1606[3] & 0xFF);
                        int var17 = (class120.field1606[6] & 0xFF) + (((class120.field1606[4] & 0xFF) << 16) + (class120.field1606[5] & 0xFF << 8));
                        int var18 = class120.field1606[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field924 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field919.method2848(19284) / 520L) {
                                var12++;
                                var7 = var17;
                                int var21 = 0;
                                while (true) {
                                    if (var21 >= var14) {
                                        continue label74;
                                    }
                                    var10[var11++] = class120.field1606[var21 + 8];
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(ILpl;Lpl;I)V")
    public class70(int arg0, class459 arg1, class459 arg2, int arg3) {
        this.field925 = arg2;
        this.field924 = arg0;
        this.field919 = arg1;
        this.field918 = arg3;
    }
}
