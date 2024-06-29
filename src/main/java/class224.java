import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class224 {

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lvb;")
    private class73 field3295 = null;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lvb;")
    private class73 field3299 = null;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    private int field3300 = 65000;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    private int field3298;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3297 = "Members object";

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    public static int[] field3290;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III[B)Z")
    public final boolean method1552(int arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 12 % ((arg0 + 7) / 61);
        field3293++;
        class73 var6 = this.field3295;
        synchronized (this.field3295) {
            if (arg2 < 0 || arg2 > this.field3300) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method1558(arg2, 255, arg1, true, arg3);
            if (!var7) {
                var7 = this.method1558(arg2, 255, arg1, false, arg3);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public static int method1553(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
    public static final void method1554(int arg0, byte arg1) {
        field3287++;
        if (arg1 != -88) {
            method1557((byte) -13, (class234) null);
        }
        class101 var2 = (class101) class142.field2308.method1073(arg1 + 87, (long) arg0);
        if (var2 != null) {
            var2.method1781(arg1 ^ 0xFFFFEB2A);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)[B")
    public final byte[] method1555(int arg0, int arg1) {
        field3289++;
        class73 var3 = this.field3295;
        synchronized (this.field3295) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field3299.method549((byte) 126)) {
                    return null;
                }
                this.field3299.method546((long) (arg1 * 6), (byte) 126);
                this.field3299.method542(true, 6, class111.field1857, 0);
                int var5 = ((class111.field1857[0] & 0xFF) << 16) + ((class111.field1857[1] & 0xFF) << 8) + (class111.field1857[2] & 0xFF);
                int var6 = (class111.field1857[3] & 0xFF << 16) + ((class111.field1857[4] & 0xFF) << 8) + (class111.field1857[5] & 0xFF);
                if (arg0 > var5 || var5 > this.field3300) {
                    return null;
                } else if (var6 > 0 && this.field3295.method549((byte) 122) / 520L >= (long) var6) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3295.method546((long) (var6 * 520), (byte) 127);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3295.method542(true, var13 + 8, class111.field1857, 0);
                        int var14 = (class111.field1857[2] & 0xFF << 8) + (class111.field1857[3] & 0xFF);
                        int var15 = ((class111.field1857[0] & 0xFF) << 8) + (class111.field1857[1] & 0xFF);
                        int var16 = ((class111.field1857[4] & 0xFF) << 16) + (class111.field1857[5] & 0xFF << 8) + (class111.field1857[6] & 0xFF);
                        int var17 = class111.field1857[7] & 0xFF;
                        if (arg1 == var15 && var11 == var14 && this.field3298 == var17) {
                            if (var16 >= 0 && (this.field3295.method549((byte) 124) / 520L) >= ((long) var16)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class111.field1857[var20 + 8];
                                }
                                var11++;
                                var6 = var16;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method1556(int arg0) {
        if (arg0 > -89) {
            method1557((byte) 36, (class234) null);
        }
        field3290 = null;
        field3297 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLqi;)V")
    public static final void method1557(byte arg0, class234 arg1) {
        class170.method1212(arg1, 124, 200000);
        if (arg0 <= 56) {
            method1557((byte) -49, (class234) null);
        }
        field3292++;
    }

    @OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3294++;
        return "Cache:" + this.field3298;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZ[B)Z")
    private final boolean method1558(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field3288++;
        class73 var6 = this.field3295;
        synchronized (this.field3295) {
            try {
                int var8;
                if (arg3) {
                    if (this.field3299.method549((byte) 126) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field3299.method546((long) (arg2 * 6), (byte) 127);
                    this.field3299.method542(true, 6, class111.field1857, 0);
                    var8 = (class111.field1857[5] & 0xFF) + (class111.field1857[4] & 0xFF << 8) + (class111.field1857[3] & 0xFF << 16);
                    if (var8 <= 0 || (long) var8 > this.field3295.method549((byte) 124) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3295.method549((byte) 124) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class111.field1857[5] = (byte) var8;
                class111.field1857[1] = (byte) (arg0 >> 8);
                class111.field1857[3] = (byte) (var8 >> 16);
                class111.field1857[4] = (byte) (var8 >> 8);
                class111.field1857[2] = (byte) arg0;
                int var10 = 0;
                class111.field1857[0] = (byte) (arg0 >> 16);
                this.field3299.method546((long) (arg2 * 6), (byte) 126);
                this.field3299.method551(class111.field1857, 122, 6, 0);
                int var11 = 0;
                while (true) {
                    if (arg0 > var10) {
                        label119: {
                            int var12 = 0;
                            if (arg3) {
                                this.field3295.method546((long) (var8 * 520), (byte) 127);
                                try {
                                    this.field3295.method542(true, 8, class111.field1857, 0);
                                } catch (EOFException var36) {
                                    break label119;
                                }
                                int var13 = (class111.field1857[0] & 0xFF << 8) + (class111.field1857[1] & 0xFF);
                                var12 = ((class111.field1857[4] & 0xFF) << 16) + (class111.field1857[6] & 0xFF) + (class111.field1857[5] & 0xFF << 8);
                                int var14 = ((class111.field1857[2] & 0xFF) << 8) + (class111.field1857[3] & 0xFF);
                                int var15 = class111.field1857[7] & 0xFF;
                                if (arg2 != var13 || var11 != var14 || this.field3298 != var15) {
                                    return false;
                                }
                                if (var12 < 0 || this.field3295.method549((byte) 122) / 520L < (long) var12) {
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                var12 = (int) ((this.field3295.method549((byte) 124) + 519L) / 520L);
                                arg3 = false;
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var8 == var12) {
                                    var12++;
                                }
                            }
                            if ((arg0 - var10) <= 512) {
                                var12 = 0;
                            }
                            class111.field1857[5] = (byte) (var12 >> 8);
                            class111.field1857[2] = (byte) (var11 >> 8);
                            class111.field1857[3] = (byte) var11;
                            class111.field1857[1] = (byte) arg2;
                            int var18 = arg0 - var10;
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            class111.field1857[4] = (byte) (var12 >> 16);
                            class111.field1857[0] = (byte) (arg2 >> 8);
                            class111.field1857[7] = (byte) this.field3298;
                            class111.field1857[6] = (byte) var12;
                            var11++;
                            this.field3295.method546((long) (var8 * 520), (byte) 126);
                            var8 = var12;
                            this.field3295.method551(class111.field1857, 125, 8, 0);
                            this.field3295.method551(arg4, arg1 ^ 0x82, var18, var10);
                            var10 += var18;
                            continue;
                        }
                    }
                    if (arg1 != 255) {
                        return true;
                    }
                    return true;
                }
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(ILvb;Lvb;I)V")
    public class224(int arg0, class73 arg1, class73 arg2, int arg3) {
        this.field3298 = arg0;
        this.field3300 = arg3;
        this.field3295 = arg1;
        this.field3299 = arg2;
    }
}
