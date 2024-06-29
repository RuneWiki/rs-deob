import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class124 extends class286 {

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    private int field2055 = 0;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    private int field2065 = 10;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    private int field2058 = 2048;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field2068 = 99;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "Z")
    public static boolean field2066 = false;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "[I")
    private int[] field2057;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "[I")
    private int[] field2060;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "[Lod;")
    public static class24[] field2070;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 52)
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)V", line = 8)
    public static void method779(int arg0) {
        if (arg0 != -28912) {
            field2070 = (class24[]) null;
        }
        field2070 = null;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V", line = 22)
    private final void method780(byte arg0) {
        field2069++;
        this.field2060 = new int[this.field2065 + 1];
        this.field2057 = new int[this.field2065 + 1];
        int var2 = 4096 / this.field2065;
        if (arg0 != 93) {
            field2068 = 112;
        }
        int var3 = this.field2058 * var2 >> 12;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2065; var5++) {
            this.field2060[var5] = var4;
            this.field2057[var5] = var3 + var4;
            var4 += var2;
        }
        this.field2060[this.field2065] = 4096;
        this.field2057[this.field2065] = this.field2057[0] + 4096;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lmg;Lt;I)Lsf;", line = 57)
    public static final class100 method781(class145 arg0, class239 arg1, int arg2) {
        field2059++;
        long var3 = ((long) arg0.field2404 << 56) + ((long) arg0.field2395 << 32) + (long) ((arg0.field2397 + 1 << 16) + arg0.field2398);
        if (arg2 >= -20) {
            method781((class145) null, (class239) null, -28);
        }
        class100 var5 = (class100) arg1.method1612(var3, 110);
        if (var5 == null) {
            var5 = new class100(arg0.field2397, (float) arg0.field2398, true, false, arg0.field2395);
            arg1.method1611(var5, -1, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lfe;ZI)V", line = 86)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field2067++;
        if (arg2 == 0) {
            this.field2065 = arg0.method1535((byte) 118);
        } else if (arg2 == 1) {
            this.field2058 = arg0.method1496(!arg1);
        } else if (arg2 == 2) {
            this.field2055 = arg0.method1535((byte) 105);
        }
        if (arg1) {
            method779(23);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I", line = 134)
    public final int[] method14(int arg0, int arg1) {
        field2063++;
        if (arg0 > -52) {
            this.field2057 = (int[]) null;
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int var4 = class153.field2509[arg1];
            if (this.field2055 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field2065; var12++) {
                    if (var4 >= this.field2060[var12] && var4 < this.field2060[var12 + 1]) {
                        if (var4 < this.field2057[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class136.method849(var3, 0, class27.field410, var11);
            } else {
                for (int var5 = 0; var5 < class27.field410; var5++) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class174.field2978[var5];
                    int var9 = this.field2055;
                    if (var9 == 1) {
                        var7 = var8;
                    } else if (var9 == 2) {
                        var7 = (var8 - (4096 - var4) >> 1) + 2048;
                    } else if (var9 == 3) {
                        var7 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field2065; var10++) {
                        if (this.field2060[var10] <= var7 && this.field2060[var10 + 1] > var7) {
                            if (this.field2057[var10] > var7) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 256)
    public final void method276(int arg0) {
        if (arg0 != 3) {
            this.method14(-74, -23);
        }
        field2064++;
        this.method780((byte) 93);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V", line = 267)
    public static final void method782(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2056++;
        int var5 = arg0;
        int var6 = arg3;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class44.method263(class166.field2765, arg1 + arg0, (byte) -55, class269.field4551);
        int var10 = class44.method263(class166.field2765, arg1 - arg0, (byte) -109, class269.field4551);
        class114.method742(30197, var10, class97.field1636[arg4], var9, arg2);
        while (var5 > var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var5--;
                int var11 = arg4 - var5;
                var7 -= var5 << 1;
                int var12 = arg4 + var5;
                if (var12 >= class217.field3677 && var11 <= class247.field4220) {
                    int var13 = class44.method263(class166.field2765, arg1 + var6, (byte) -79, class269.field4551);
                    int var14 = class44.method263(class166.field2765, arg1 - var6, (byte) -108, class269.field4551);
                    if (class247.field4220 >= var12) {
                        class114.method742(30197, var14, class97.field1636[var12], var13, arg2);
                    }
                    if (var11 >= class217.field3677) {
                        class114.method742(arg3 + 30197, var14, class97.field1636[var11], var13, arg2);
                    }
                }
            }
            var6++;
            int var15 = arg4 - var6;
            int var16 = arg4 + var6;
            if (class217.field3677 <= var16 && var15 <= class247.field4220) {
                int var17 = class44.method263(class166.field2765, arg1 + var5, (byte) -49, class269.field4551);
                int var18 = class44.method263(class166.field2765, arg1 - var5, (byte) -121, class269.field4551);
                if (var16 <= class247.field4220) {
                    class114.method742(30197, var18, class97.field1636[var16], var17, arg2);
                }
                if (var15 >= class217.field3677) {
                    class114.method742(30197, var18, class97.field1636[var15], var17, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lek;ZI)Ljd;", line = 352)
    public static final class132 method783(class172 arg0, boolean arg1, int arg2) {
        field2061++;
        byte[] var3 = arg0.method1112(arg2, -92);
        if (var3 == null) {
            return null;
        } else if (arg1) {
            return new class132(var3);
        } else {
            return (class132) null;
        }
    }
}
