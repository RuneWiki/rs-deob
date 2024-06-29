import java.awt.Dimension;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class368 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Luu;")
    private class237 field5211;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public int field5209;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Ljava/lang/Thread;")
    public static Thread field5215;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
    public static void method2317(byte arg0) {
        field5215 = null;
        int var1 = 12 / ((arg0 + 5) / 61);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2318(String arg0, int arg1) {
        field5210++;
        if (!class268.field3921.field1936) {
            return -1;
        }
        if (arg1 != 7210) {
            field5213 = -57;
        }
        if (class380.field5454.containsKey(arg0)) {
            return 100;
        }
        String var2 = class281.method1874(arg0, (byte) -37);
        if (var2 == null) {
            return -1;
        }
        String var3 = class539.field7483 + var2;
        if (!class508.field7054.method1596(var3, "", arg1 ^ 0xFFFFA1A8)) {
            return -1;
        } else if (class508.field7054.method1580(var3, arg1 - 7211)) {
            byte[] var4 = class508.field7054.method1582("", false, var3);
            Object var5 = null;
            File var6;
            try {
                var6 = class565.method3321((byte) -49, var2);
            } catch (RuntimeException var10) {
                return -1;
            }
            if (var4 == null || var6 == null) {
                return -1;
            }
            boolean var7 = true;
            byte[] var8 = class138.method911(var6, false);
            if (var8 != null && var4.length == var8.length) {
                for (int var9 = 0; var9 < var8.length; var9++) {
                    if (var4[var9] != var8[var9]) {
                        var7 = false;
                        break;
                    }
                }
            } else {
                var7 = false;
            }
            try {
                if (!var7) {
                    class268.field3921.method865((byte) -83, var4, var6);
                }
            } catch (Throwable var11) {
                return -1;
            }
            class525.method3121(var6, arg1 - 7209, arg0);
            return 100;
        } else {
            return class508.field7054.method1603(var3, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILcea;)V")
    public static final void method2319(int arg0, int arg1, int arg2, class96 arg3) {
        field5214++;
        int[] var4 = new int[4];
        if (arg2 != 1000) {
            method2318(null, 92);
        }
        class245.method1648(var4, 0, var4.length, arg1);
        class43.method237(arg3, (byte) -120, arg0, var4);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I")
    public static final int method2320(int arg0) {
        field5212++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class159.field2227.field1936 && !class159.field2227.field1929) {
            var1 = true;
            if (class372.field5248.field8060 < 512 && class372.field5248.field8060 != 0) {
                var1 = false;
            }
            if (class135.field1937.startsWith("win")) {
                var3 = true;
                var2 = true;
            } else {
                var2 = true;
            }
        }
        if (class577.field7933) {
            var3 = false;
        }
        if (class151.field2083) {
            var1 = false;
        }
        if (class525.field7292) {
            var2 = false;
        }
        if (arg0 != 2) {
            return 117;
        } else if (var1 || var2 || var3) {
            int var4 = -1;
            int var5 = -1;
            int var6 = -1;
            if (var1) {
                try {
                    var4 = class470.method2864(1000, 2, 2048);
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class470.method2864(1000, 3, 2048);
                    if (class332.field4707.field4789.method963(arg0 - 2) == 3) {
                        class299 var7 = class129.field1802.method263();
                        long var8 = var7.field4243 & 0xFFFFFFFFFFFFL;
                        int var10 = var7.field4236;
                        if (var10 == 4318) {
                            var2 &= var8 >= 64425238954L;
                        } else if (var10 == 4098) {
                            var2 &= var8 >= 60129613779L;
                        }
                    }
                } catch (Exception var14) {
                }
            }
            if (var2) {
                try {
                    var5 = class470.method2864(1000, 1, 2048);
                } catch (Exception var13) {
                }
            }
            if (var4 == -1 && var5 == -1 && var6 == -1) {
                return class406.method2539(arg0 - 2);
            }
            int var11 = (int) ((float) var6 * 1.1F);
            int var12 = (int) ((float) var5 * 1.1F);
            if (var11 < var4 && var12 < var4) {
                return class698.method3943(20188, var4);
            } else if (var11 <= var12) {
                return class634.method3559(var12, 1, (byte) -112);
            } else {
                return class634.method3559(var11, 3, (byte) -112);
            }
        } else {
            return class406.method2539(0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lgp;ILuu;)V")
    public class368(class553 arg0, int arg1, class237 arg2) {
        new class690(64);
        this.field5211 = arg2;
        this.field5209 = this.field5211.method1597(15, 0);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public static final void method2321(int arg0) {
        field5208++;
        if (class129.field1802.method1395()) {
            class129.field1802.method1510(class570.field7875);
            class482.method2935(27995);
            if (class222.field3009) {
                class503.method3032(class570.field7875, 1);
            } else {
                Dimension var1 = class570.field7875.getSize();
                class129.field1802.method1535(class570.field7875, var1.width, var1.height);
            }
            class129.field1802.method1451(class570.field7875);
        } else {
            class393.method2459(class332.field4707.field4789.method963(0), false, 1);
        }
        class235.method1566(16349);
        class569.field7870 = true;
        if (arg0 <= 65) {
            method2318(null, -99);
        }
    }
}
