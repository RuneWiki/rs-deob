import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class172 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2884 = 0;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2886 = -1;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[[I")
    public static int[][] field2888 = new int[104][104];

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2885 = 0;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Z")
    public static boolean field2892 = false;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field2894 = -1;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "[[S")
    public static short[][] field2890;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method1154(int arg0) {
        if (arg0 != 25) {
            field2885 = -34;
        }
        field2889++;
        if (class232.field4011 == 30) {
            class102.method683(25, false);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjl;Ljl;II)Laa;")
    public static final class183 method1155(int arg0, class101 arg1, class101 arg2, int arg3, int arg4) {
        if (arg0 == 0) {
            field2887++;
            return class131.method941(arg3, arg1, arg4, -71) ? class52.method340(arg0 ^ 0xFFFFD8B3, arg2.method666(arg4, arg3, (byte) -51)) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)V")
    public static final void method1156(byte arg0, int arg1) {
        class28.field414 = arg1;
        field2893++;
        class82.field1291 = -1;
        class82.field1291 = -1;
        class78.method530(arg0 - 9);
        if (arg0 != 8) {
            field2888 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static void method1157(int arg0) {
        if (arg0 > 84) {
            field2888 = null;
            field2890 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static final void method1158(byte arg0) {
        field2891++;
        if (arg0 != 49) {
            return;
        }
        class121.method856(24665, class276.field4891);
        class51.field800++;
        if (class53.field826 && class95.field1494) {
            int var1 = class268.field4689;
            int var2 = class26.field363;
            int var3 = var1 - class222.field3822;
            if (var3 < class39.field630) {
                var3 = class39.field630;
            }
            int var4 = var2 - class242.field4361;
            if (class276.field4891.field4206 + var3 > class39.field630 + class247.field4432.field4206) {
                var3 = class39.field630 + class247.field4432.field4206 - class276.field4891.field4206;
            }
            int var5 = var3 - class216.field3722;
            if (class177.field2953 > var4) {
                var4 = class177.field2953;
            }
            if ((class177.field2953 + class247.field4432.field4067) < (class276.field4891.field4067 + var4)) {
                var4 = class177.field2953 + class247.field4432.field4067 - class276.field4891.field4067;
            }
            int var6 = var4 + class247.field4432.field4136 - class177.field2953;
            int var7 = var4 - class259.field4578;
            int var8 = class276.field4891.field4155;
            int var9 = class247.field4432.field4122 + var3 - class39.field630;
            if (class51.field800 > class276.field4891.field4216 && (var7 > var8 || -var8 > var7 || var8 < var5 || (-var8) > var5)) {
                class233.field4018 = true;
            }
            if (class276.field4891.field4217 != null && class233.field4018) {
                class85 var10 = new class85();
                var10.field1332 = var6;
                var10.field1339 = class276.field4891.field4217;
                var10.field1340 = var9;
                var10.field1346 = class276.field4891;
                class274.method1841(var10, arg0 ^ 0xFFFFFF9D);
            }
            if (class104.field1620 == 0) {
                if (class233.field4018) {
                    if (class276.field4891.field4138 != null) {
                        class85 var11 = new class85();
                        var11.field1346 = class276.field4891;
                        var11.field1332 = var6;
                        var11.field1339 = class276.field4891.field4138;
                        var11.field1329 = class13.field207;
                        var11.field1340 = var9;
                        class274.method1841(var11, -91);
                    }
                    if (class13.field207 != null && client.method783(class276.field4891) != null) {
                        class273.field4778.method1697(91, 115);
                        class273.field4778.method1291(true, class276.field4891.field4120);
                        class120.field2024++;
                        class273.field4778.method1294(class13.field207.field4120, -26655);
                        class273.field4778.method1272(arg0 + 27813, class13.field207.field4211);
                        class273.field4778.method1293(class276.field4891.field4211, arg0 ^ 0x425B3395);
                    }
                } else if ((class234.field4040 == 1 || class102.method688(-2001, class159.field2661 - 1)) && class159.field2661 > 2) {
                    class10.method59(-95);
                } else if (class159.field2661 > 0) {
                    class96.method624((byte) -37);
                }
                class276.field4891 = null;
            }
        } else if (class51.field800 > 1) {
            class276.field4891 = null;
        }
    }
}
