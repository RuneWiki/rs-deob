import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class193 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[[B")
    public static byte[][] field3286 = new byte[1000][];

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field3294 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lcd;")
    public static class64 field3284 = class44.method335((byte) 71, "rot:");

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3295 = -1;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lqm;")
    public static class222 field3287;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3292;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lwf;ZII[BI)V", line = 5)
    public static final void method1356(class54[] arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field3288++;
        class13 var6 = new class13(arg4);
        int var7 = -1;
        if (arg3 != 30384) {
            method1356((class54[]) null, true, 64, -108, (byte[]) null, 99);
        }
        while (true) {
            int var8 = var6.method156(0);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method163(255);
                if (var10 == 0) {
                    break;
                }
                int var11 = var6.method152((byte) -127);
                int var12 = var11 >> 2;
                var9 += var10 - 1;
                int var13 = (var9 & 0xFD3) >> 6;
                int var14 = var9 >> 12;
                int var15 = var9 & 0x3F;
                int var16 = arg2 + var13;
                int var17 = var11 & 0x3;
                int var18 = arg5 + var15;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class54 var19 = null;
                    if (!arg1) {
                        int var20 = var14;
                        if ((class82.field1508[1][var16][var18] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class9.method82(var12, true, var14, var19, var16, var7, var14, !arg1, var18, arg1, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V", line = 78)
    public static final void method1357(int arg0, int arg1) {
        field3293++;
        class115 var2 = (class115) class17.field351.method1151((long) arg1, 0);
        if (arg0 >= -97) {
            method1358(-25, (class64) null);
        }
        if (var2 != null) {
            var2.method232(128);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILcd;)V", line = 105)
    public static final void method1358(int arg0, class64 arg1) {
        field3289++;
        if (arg0 > -25) {
            field3295 = -117;
        }
        for (class306 var2 = (class306) class267.field4603.method778(0); var2 != null; var2 = (class306) class267.field4603.method775(26517)) {
            if (var2.field5233.method519((byte) 126, arg1)) {
                class165.field2897 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 148)
    public class193() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V", line = 158)
    public static final void method1359(int arg0, byte arg1) {
        field3285++;
        class200.field3434 = 50;
        class278.field4795 = arg0;
        int var2 = -19 % ((arg1 - 17) / 56);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lkh;[BB)V", line = 174)
    public final void method1360(class13 arg0, byte[] arg1, byte arg2) {
        field3290++;
        if (arg0.field254[arg0.field281] != 31 || arg0.field254[arg0.field281 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3292 == null) {
            this.field3292 = new Inflater(true);
        }
        try {
            if (arg2 != 79) {
                this.field3292 = (Inflater) null;
            }
            this.field3292.setInput(arg0.field254, arg0.field281 + 10, -8 - (arg0.field281 + 10) + arg0.field254.length);
            this.field3292.inflate(arg1);
        } catch (Exception var5) {
            this.field3292.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3292.reset();
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(III)V", line = 203)
    private class193(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lqm;I)I", line = 221)
    public static final int method1361(class222 arg0, int arg1) {
        field3291++;
        int var2 = arg1;
        if (arg0.method1585(class34.field555, 1)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1585(class226.field3847, 1)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 247)
    public static void method1362(byte arg0) {
        field3287 = null;
        field3284 = null;
        if (arg0 == -63) {
            field3286 = (byte[][]) null;
        }
    }
}
