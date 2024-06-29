import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class133 extends class76 {

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
    private int field2388;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lia;")
    public static class257 field2376 = null;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field2377 = 0;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "Lia;")
    public static class257 field2382 = class28.method234(83, ")1");

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lia;")
    public static class257 field2380 = class28.method234(-73, "blinken1:");

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "[Lia;")
    public static class257[] field2385 = new class257[1000];

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "Lia;")
    public static class257 field2379 = class28.method234(-30, "hitbar_default");

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "Z")
    public static boolean field2387 = true;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "S")
    public static short field2386 = 32767;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2383;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
    private class133(int arg0) {
        super(0, true);
        this.field2388 = 4096;
        this.field2388 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public static void method924(byte arg0) {
        field2383 = null;
        if (arg0 <= 77) {
            field2377 = -117;
        }
        field2385 = null;
        field2376 = null;
        field2379 = null;
        field2380 = null;
        field2382 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field2389;
        if (arg1 > -86) {
            method926(true, (byte[]) null);
        }
        if (~arg2 == -1) {
            this.field2388 = (arg0.method1051((byte) 89) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
    public static final void method925(byte arg0, boolean arg1) {
        if (arg0 != -18) {
            field2376 = null;
        }
        class215.field3651 = arg1;
        ++field2381;
        class194.field3296 = !class69.method524((byte) 125);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field2378;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            class86.method645(var3, 0, class96.field1807, this.field2388);
        }
        if (arg0 != -9351) {
            this.method169(104, -2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z[B)V")
    public static final void method926(boolean arg0, byte[] arg1) {
        if (arg0) {
            ++field2384;
            int var2 = 0;
            while (true) {
                while (var2 < arg1.length) {
                    int var3 = -class182.field3159 + (arg1[var2++] & 255) * 64;
                    int var4 = 64 * (255 & arg1[var2++]) - class8.field174;
                    if (var3 > 0 && ~var4 < -1 && ~class252.field4337 < ~(var3 - -64) && var4 + 64 < class181.field3149) {
                        int var5 = var3 >> 6;
                        int var6 = class181.field3149 + -1 - var4 >> 6;
                        for (int var7 = 0; var7 < 64; ++var7) {
                            for (int var8 = -64; ~var8 > -1; ++var8) {
                                byte var9 = arg1[var2++];
                                if (var9 != 0) {
                                    if (class250.field4311[var5][var6] == null) {
                                        class250.field4311[var5][var6] = new byte[4096];
                                    }
                                    class250.field4311[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                    byte var10 = arg1[var2++];
                                    if (class94.field1781[var5][var6] == null) {
                                        class94.field1781[var5][var6] = new byte[4096];
                                    }
                                    class94.field1781[var5][var6][(-(1 - -var8) << 6) + var7] = var10;
                                }
                            }
                        }
                    } else {
                        for (int var11 = -4096; var11 < 0; ++var11) {
                            byte var12 = arg1[var2++];
                            if (var12 != 0) {
                                ++var2;
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class133() {
        this(4096);
    }
}
