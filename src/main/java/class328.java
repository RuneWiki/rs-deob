import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class328 extends class252 {

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "Lrba;")
    public static class101 field4260 = new class101("", 14);

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "J")
    public long field4264;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)I")
    public final int method320(int arg0) {
        if (arg0 >= -92) {
            this.method322(107);
        }
        field4256++;
        return this.field4259;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
    public final int method321(int arg0) {
        if (arg0 <= 35) {
            this.field4264 = 10L;
        }
        field4263++;
        return 0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
    public static void method1892(boolean arg0) {
        field4260 = null;
        if (!arg0) {
            field4260 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)I")
    public final int method324(int arg0) {
        if (arg0 != -2) {
            field4260 = null;
        }
        field4262++;
        return this.field4254;
    }

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)J")
    public final long method322(int arg0) {
        field4261++;
        if (arg0 < 64) {
            field4260 = null;
        }
        return this.field4264;
    }

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "(I)I")
    public final int method323(int arg0) {
        if (arg0 != -5) {
            field4260 = null;
        }
        field4255++;
        return this.field4257;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1893(String arg0, int arg1) {
        field4266++;
        if (arg0 == null) {
            return;
        }
        if (!(class665.field9225 < 200 || class603.field8118) || class665.field9225 >= 200) {
            class433.method2476(class604.field8134.method3280((byte) -102, class144.field1890), false, 4);
            String var2 = class604.field8135.method3280((byte) 66, class144.field1890);
            if (var2 != null) {
                class433.method2476(var2, false, 4);
            }
            return;
        }
        String var3 = class315.method1841((byte) 85, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class665.field9225; var4++) {
            String var9 = class315.method1841((byte) 80, class405.field5160[var4]);
            if (var9 != null && var9.equals(var3)) {
                class433.method2476(arg0 + class604.field8162.method3280((byte) -115, class144.field1890), false, 4);
                return;
            }
            if (class329.field4274[var4] != null) {
                String var10 = class315.method1841((byte) 110, class329.field4274[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class433.method2476(arg0 + class604.field8162.method3280((byte) 94, class144.field1890), false, 4);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class703.field9804; var5++) {
            String var7 = class315.method1841((byte) 74, class408.field5236[var5]);
            if (var7 != null && var7.equals(var3)) {
                class433.method2476(class604.field8167.method3280((byte) 112, class144.field1890) + arg0 + class604.field8168.method3280((byte) 117, class144.field1890), false, 4);
                return;
            }
            if (class580.field7903[var5] != null) {
                String var8 = class315.method1841((byte) 89, class580.field7903[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class433.method2476(class604.field8167.method3280((byte) -64, class144.field1890) + arg0 + class604.field8168.method3280((byte) -115, class144.field1890), false, 4);
                    return;
                }
            }
        }
        if (class315.method1841((byte) 121, class233.field3130.field2492).equals(var3)) {
            class433.method2476(class604.field8165.method3280((byte) -108, class144.field1890), false, 4);
            return;
        }
        class30.field457++;
        class11 var6 = class130.method931(class649.field9035, (byte) 54, class693.field9470);
        var6.field114.method2352(true, class367.method2111(2, arg0));
        var6.field114.method2374(arg0, -128);
        if (arg1 < 43) {
            method1895(null, -127, (byte) 84, 102);
        }
        class100.method760(var6, 32);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)I")
    public static final int method1894(boolean arg0) {
        field4265++;
        if (!arg0) {
            return 43;
        }
        class43 var1 = class520.field6799;
        boolean var2 = false;
        if (class364.field4697 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class43.method333(null, 117, var3, null, 0, 0);
            var2 = true;
        }
        long var4 = class584.method3191(1);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method352(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class584.method3191(1) - var4);
        var1.method400(-16777216, 0, 100, (byte) 64, 100, 0);
        if (var2) {
            var1.method392((byte) -39);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
    public static final String method1895(byte[] arg0, int arg1, byte arg2, int arg3) {
        field4258++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (arg2 > -29) {
            field4260 = null;
        }
        int var6 = arg1 + arg3;
        for (int var7 = arg3; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 >= 224) {
                if (var8 >= 240) {
                    if (var8 < 244) {
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                }
                if (var6 <= (var7 + 2)) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg0[var7] & 0xFF;
                if (var9 >= 128 && var9 <= 191) {
                    var7++;
                    int var10 = arg0[var7] & 0xFF;
                    if (var10 >= 128 && var10 <= 191) {
                        var4[var5++] = (char) class131.method954(class597.method3238(-129, var10), class131.method954(class597.method3238(var8 << 12, -921600), class597.method3238(var9 << 6, -8256)));
                        continue;
                    }
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
            } else if (var7 + 1 < var6) {
                var7++;
                int var11 = arg0[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class131.method954(class597.method3238(var11, -129), class597.method3238(-12352, var8 << 6));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }
}
