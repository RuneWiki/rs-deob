import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class612 {

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "B")
    private byte field8155;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
    public int field8152;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public int field8147;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    public int field8157;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
    public int field8156;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public int field8149;

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "Luk;")
    public static class263 field8154 = new class263("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILha;)V")
    public static final void method3330(int arg0, class59 arg1) {
        if (arg0 != 81) {
            field8154 = null;
        }
        field8150++;
        if (!(class181.field2730 >= 2 || class142.field2268) || class137.field2182 != null) {
            return;
        }
        String var2;
        if (class142.field2268 && class181.field2730 < 2) {
            var2 = class719.field10008 + class517.field6872.method2877(class713.field9854, (byte) -108) + class341.field4808 + " ->";
        } else if (class658.field8699 && class153.field2345.method2313(true, 81) && class181.field2730 > 2) {
            var2 = class407.method2383(124, class218.field3147);
        } else {
            class433 var3 = class218.field3147;
            if (var3 == null) {
                return;
            }
            var2 = class407.method2383(arg0 ^ 0x36, var3);
            int[] var4 = null;
            if (class361.method2151(var3.field5963, 50)) {
                var4 = class77.field948.method1165((byte) 92, (int) var3.field5970).field7822;
            } else if (var3.field5967 != -1) {
                var4 = class77.field948.method1165((byte) 97, var3.field5967).field7822;
            } else if (class410.method2392(-54, var3.field5963)) {
                class134 var5 = (class134) class390.field5470.method2135((long) ((int) var3.field5970), (byte) 31);
                if (var5 != null) {
                    class556 var6 = var5.field2154;
                    class166 var7 = var6.field7328;
                    if (var7.field2575 != null) {
                        var7 = var7.method1190((byte) 56, class74.field901);
                    }
                    if (var7 != null) {
                        var4 = var7.field2557;
                    }
                }
            } else if (class84.method650(var3.field5963, (byte) 111)) {
                Object var8 = null;
                class100 var9;
                if (var3.field5963 == 1009) {
                    var9 = class462.field6333.method2008((byte) -81, (int) var3.field5970);
                } else {
                    var9 = class462.field6333.method2008((byte) -92, (int) (var3.field5970 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field1307 != null) {
                    var9 = var9.method748(class74.field901, 125);
                }
                if (var9 != null) {
                    var4 = var9.field1287;
                }
            }
            if (var4 != null) {
                var2 = var2 + class540.method3010(arg0 ^ 0x4B, var4);
            }
        }
        if (class181.field2730 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class181.field2730 - 2) + class517.field6865.method2877(class713.field9854, (byte) -108);
        }
        if (class294.field4214 != null) {
            class60 var10 = class294.field4214.method3705(arg0 - 80, arg1);
            if (var10 == null) {
                var10 = class64.field785;
            }
            var10.method516(class264.field3681, class459.field6266, class50.field637, class657.field8682, class229.field3265, class294.field4214.field9178, class294.field4214.field9263, class43.field567, class294.field4214.field9211, var2, class12.field190, 31520, class294.field4214.field9287, class294.field4214.field9295, class294.field4214.field9289);
            class310.method1908(class229.field3265[3], class229.field3265[0], -47, class229.field3265[1], class229.field3265[2]);
        } else if (class316.field4503 != null && class683.field9532 == class628.field8355) {
            int var11 = class64.field785.method515(class264.field3681, class517.field6906 + 4, class657.field8682, var2, 16777215, class117.field1892 + 16, class43.field567, (byte) -115, class459.field6266, 0);
            class310.method1908(16, class517.field6906 + 4, -121, class117.field1892, var11 + class105.field1446.method3001(-1, var2));
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)I")
    public final int method3331(int arg0) {
        int var2 = 94 % ((arg0 + 36) / 52);
        field8153++;
        return (this.field8155 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)I")
    public final int method3332(int arg0) {
        if (arg0 != -1) {
            this.method3332(109);
        }
        field8151++;
        return this.field8155 & 0x7;
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V")
    public static void method3333(int arg0) {
        field8154 = null;
        if (arg0 != -3) {
            field8154 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "()V")
    public class612() {
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lee;)V")
    public class612(class677 arg0) {
        this.field8155 = arg0.method3811(69);
        this.field8152 = arg0.method3807(-1);
        this.field8147 = arg0.method3799(false);
        this.field8157 = arg0.method3799(false);
        this.field8156 = arg0.method3799(false);
        this.field8149 = arg0.method3799(false);
    }
}
