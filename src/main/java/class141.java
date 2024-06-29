import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class141 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lil;")
    private class48 field2035 = null;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lil;")
    private class48 field2036 = null;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    private int field2042 = 65000;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    private int field2045;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
    public static int[] field2044 = new int[128];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lve;")
    public static class233 field2037;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lve;")
    public static class233 field2049;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lha;")
    public static class267 field2034;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[Z")
    public static boolean[] field2039;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI[BI)Z")
    public final boolean method935(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field2047++;
        class48 var5 = this.field2036;
        synchronized (this.field2036) {
            if (arg1 < 0 || arg1 > this.field2042) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method940(arg3, 27724, arg1, arg0, arg2);
            if (!var6) {
                var6 = this.method940(arg3, 27724, arg1, false, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[B")
    public final byte[] method936(int arg0, int arg1) {
        field2040++;
        class48 var3 = this.field2036;
        synchronized (this.field2036) {
            try {
                if (this.field2035.method314(arg1 + 683333793) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2035.method325(arg1 ^ 0x34FA2F80, (long) (arg0 * 6));
                this.field2035.method324(class77.field1195, 6, 0, -1);
                int var5 = ((class77.field1195[1] & 0xFF) << 8) + (class77.field1195[0] & 0xFF << 16) + (class77.field1195[2] & 0xFF);
                int var6 = ((class77.field1195[3] & 0xFF) << 16) + (class77.field1195[5] & 0xFF) + ((class77.field1195[4] & 0xFF) << 8);
                if (var5 < 0 || var5 > this.field2042) {
                    return null;
                } else if (var6 <= 0 || ((long) var6) > (this.field2036.method314(-27415) / 520L)) {
                    return null;
                } else if (arg1 == -683361208) {
                    int var10 = 0;
                    byte[] var11 = new byte[var5];
                    int var12 = 0;
                    while (var5 > var12) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2036.method325(-474049592, (long) (var6 * 520));
                        int var14 = var5 - var12;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2036.method324(class77.field1195, var14 + 8, 0, -1);
                        int var15 = (class77.field1195[2] & 0xFF << 8) + (class77.field1195[3] & 0xFF);
                        int var16 = class77.field1195[7] & 0xFF;
                        int var17 = (class77.field1195[6] & 0xFF) + (((class77.field1195[4] & 0xFF) << 16) + ((class77.field1195[5] & 0xFF) << 8));
                        int var18 = (class77.field1195[0] & 0xFF << 8) + (class77.field1195[1] & 0xFF);
                        if (arg0 == var18 && var10 == var15 && this.field2045 == var16) {
                            if (var17 >= 0 && ((long) var17) <= (this.field2036.method314(arg1 + 683333793) / 520L)) {
                                var6 = var17;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var11[var12++] = class77.field1195[var21 + 8];
                                }
                                var10++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method937(int arg0) {
        if (arg0 != 5) {
            method938(true);
        }
        field2049 = null;
        field2034 = null;
        field2044 = null;
        field2039 = null;
        field2037 = null;
    }

    @OriginalMember(owner = "client!ac", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2048++;
        return "Cache:" + this.field2045;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static final void method938(boolean arg0) {
        class203.field2943.method257(false);
        field2050++;
        class259.field3917.method257(!arg0);
        if (!arg0) {
            field2041 = 10;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lve;ZBLve;I)Lee;")
    public static final class246 method939(class233 arg0, boolean arg1, byte arg2, class233 arg3, int arg4) {
        if (arg2 > -86) {
            return null;
        }
        int[] var5 = arg3.method1521(arg4, (byte) -73);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg3.method1515(-48, arg4, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method1515(-119, 0, var9);
                } else {
                    var10 = arg0.method1515(-41, var9, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        field2043++;
        if (!var6) {
            return null;
        }
        try {
            return new class246(arg3, arg0, arg4, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIZ[B)Z")
    private final boolean method940(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field2046++;
        class48 var6 = this.field2036;
        synchronized (this.field2036) {
            try {
                int var7;
                if (arg3) {
                    if (this.field2035.method314(-27415) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field2035.method325(arg1 ^ 0xE3BEFF84, (long) (arg0 * 6));
                    this.field2035.method324(class77.field1195, 6, 0, -1);
                    var7 = ((class77.field1195[3] & 0xFF) << 16) + (class77.field1195[4] & 0xFF << 8) + (class77.field1195[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field2036.method314(-27415) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2036.method314(-27415) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class77.field1195[3] = (byte) (var7 >> 16);
                class77.field1195[1] = (byte) (arg2 >> 8);
                class77.field1195[0] = (byte) (arg2 >> 16);
                class77.field1195[4] = (byte) (var7 >> 8);
                class77.field1195[2] = (byte) arg2;
                class77.field1195[5] = (byte) var7;
                int var10 = 0;
                if (arg1 != 27724) {
                    this.method936(-42, 119);
                }
                int var11 = 0;
                this.field2035.method325(-474049592, (long) (arg0 * 6));
                this.field2035.method316(6, 0, class77.field1195, true);
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label109: {
                            this.field2036.method325(-474049592, (long) (var7 * 520));
                            try {
                                this.field2036.method324(class77.field1195, 8, 0, -1);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class77.field1195[6] & 0xFF) + ((class77.field1195[5] & 0xFF) << 8) + ((class77.field1195[4] & 0xFF) << 16);
                            int var13 = (class77.field1195[0] & 0xFF << 8) + (class77.field1195[1] & 0xFF);
                            int var14 = class77.field1195[7] & 0xFF;
                            int var15 = ((class77.field1195[2] & 0xFF) << 8) + (class77.field1195[3] & 0xFF);
                            if (arg0 == var13 && var11 == var15 && this.field2045 == var14) {
                                if (var12 >= 0 && (long) var12 <= this.field2036.method314(-27415) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field2036.method314(-27415) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg3 = false;
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class77.field1195[0] = (byte) (arg0 >> 8);
                    class77.field1195[1] = (byte) arg0;
                    if ((arg2 - var10) <= 512) {
                        var12 = 0;
                    }
                    class77.field1195[3] = (byte) var11;
                    class77.field1195[5] = (byte) (var12 >> 8);
                    class77.field1195[6] = (byte) var12;
                    class77.field1195[4] = (byte) (var12 >> 16);
                    int var18 = arg2 - var10;
                    class77.field1195[2] = (byte) (var11 >> 8);
                    var11++;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class77.field1195[7] = (byte) this.field2045;
                    this.field2036.method325(-474049592, (long) (var7 * 520));
                    this.field2036.method316(8, 0, class77.field1195, true);
                    var7 = var12;
                    this.field2036.method316(var18, var10, arg4, true);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(ILil;Lil;I)V")
    public class141(int arg0, class48 arg1, class48 arg2, int arg3) {
        this.field2045 = arg0;
        this.field2035 = arg2;
        this.field2042 = arg3;
        this.field2036 = arg1;
    }
}
