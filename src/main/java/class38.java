import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class38 extends class128 {

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    private int field453 = 2048;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    private int field455 = 0;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
    private int field456 = 10;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "Ljava/lang/String;")
    public static String field461 = "Loaded defaults";

    @OriginalMember(owner = "client!hn", name = "W", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "[I")
    private int[] field448;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "[I")
    private int[] field450;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "[Lbi;")
    public static class91[] field458;

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 3)
    public class38() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(BI)[I", line = 9)
    public final int[] method126(byte arg0, int arg1) {
        field452++;
        if (arg0 <= 100) {
            this.field453 = -55;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = class49.field600[arg1];
            if (this.field455 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field456; var12++) {
                    if (this.field450[var12] <= var4 && var4 < this.field450[var12 + 1]) {
                        if (var4 < this.field448[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class86.method514(var3, 0, class10.field141, var11);
            } else {
                for (int var5 = 0; var5 < class10.field141; var5++) {
                    int var6 = 0;
                    int var7 = class334.field5157[var5];
                    short var8 = 0;
                    int var9 = this.field455;
                    if (var9 == 1) {
                        var6 = var7;
                    } else if (var9 == 2) {
                        var6 = (var4 + var7 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var7 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field456; var10++) {
                        if (this.field450[var10] <= var6 && var6 < this.field450[var10 + 1]) {
                            if (var6 < this.field448[var10]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var8;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V", line = 127)
    private final void method224(int arg0) {
        this.field450 = new int[this.field456 + 1];
        field462++;
        this.field448 = new int[this.field456 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field456;
        int var4 = this.field453 * var3 >> 12;
        int var5 = 0;
        if (arg0 <= 124) {
            return;
        }
        while (var5 < this.field456) {
            this.field450[var5] = var2;
            this.field448[var5] = var2 + var4;
            var2 += var3;
            var5++;
        }
        this.field450[this.field456] = 4096;
        this.field448[this.field456] = this.field448[0] + 4096;
    }

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V", line = 159)
    public static void method225(int arg0) {
        if (arg0 != 128) {
            field463 = -109;
        }
        field461 = null;
        field458 = null;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(Z)V", line = 173)
    public static final void method226(boolean arg0) {
        while (class280.field4344 >= 2048.0F) {
            class280.field4344 -= 2048.0F;
        }
        while (class280.field4344 < 0.0F) {
            class280.field4344 += 2048.0F;
        }
        int var1 = class158.field2180 >> 7;
        int var2 = class231.field3370 >> 7;
        if (class184.field2664 < 128.0F) {
            class184.field2664 = 128.0F;
        }
        int var3 = 0;
        field454++;
        if (class184.field2664 > 383.0F) {
            class184.field2664 = 383.0F;
        }
        int var4 = class184.method1278(class138.field1940, -13660, class231.field3370, class158.field2180);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class138.field1940;
                    if (var7 < 3 && (class264.field4163[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class148.field2053[var7][var5][var6] & 0xFF) * 8 + var4 - class167.field2324[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (!arg0) {
            method228(68, false, 20, -81, 103, -89, 85);
        }
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (client.field4233 < var9) {
            client.field4233 += (var9 - client.field4233) / 24;
        } else if (var9 < client.field4233) {
            client.field4233 += (var9 - client.field4233) / 80;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lp;II)V", line = 258)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 > -85) {
            return;
        }
        if (arg1 == 0) {
            this.field456 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field453 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field455 = arg0.method661(-1);
        }
        field451++;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V", line = 301)
    public final void method130(boolean arg0) {
        if (arg0) {
            field461 = (String) null;
        }
        field459++;
        this.method224(127);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 327)
    public static final byte[] method227(boolean arg0, Object arg1, int arg2) {
        int var3 = 95 % ((arg2 - 20) / 35);
        field460++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) ((byte[]) arg1);
            return arg0 ? class1.method1(127, var4) : var4;
        } else if ((arg1 instanceof class160)) {
            class160 var5 = (class160) arg1;
            return var5.method612((byte) -122);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZIIIII)V", line = 370)
    public static final void method228(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field449++;
        if (arg1) {
            return;
        }
        class219[] var7 = class167.field2328;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class219 var9 = var7[var8];
            if (var9 != null && var9.field3079 == 2) {
                class41.method241(var9.field3080 * 2, arg0 >> 1, (var9.field3083 - class118.field1668 << 7) + var9.field3076, arg3, (byte) -123, (var9.field3081 - class142.field1992 << 7) + var9.field3082, arg4, arg2 >> 1);
                if (class242.field3642 > -1 && (field463 % 20) < 10) {
                    class141.field1970[var9.field3075].method531(class242.field3642 + arg5 - 12, class59.field722 + arg6 + -28);
                }
            }
        }
    }
}
