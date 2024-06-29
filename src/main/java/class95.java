import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class95 extends class212 {

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "Z")
    public boolean field1503 = true;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public int field1492 = -1;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public int field1495 = -1;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public int field1496 = 0;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lqe;")
    public static class168 field1491 = class66.method448("<)4col>", 104);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lqe;")
    private static class168 field1493 = class66.method448("Drop", 39);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "S")
    public static short field1500 = 256;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "Lqe;")
    public static class168 field1504 = field1493;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field1502 = 0;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[[B")
    public static byte[][] field1494;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILnh;)V")
    public final void method627(byte arg0, int arg1, class112 arg2) {
        if (arg0 < 85) {
            return;
        }
        field1499++;
        while (true) {
            int var4 = arg2.method758(true);
            if (var4 == 0) {
                return;
            }
            this.method628(arg2, (byte) -117, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnh;BII)V")
    private final void method628(class112 arg0, byte arg1, int arg2, int arg3) {
        field1498++;
        if (arg3 == 1) {
            this.field1496 = class51.method358((byte) -7, arg0.method727(-27619));
        } else if (arg3 == 2) {
            this.field1492 = arg0.method758(true);
        } else if (arg3 == 3) {
            this.field1492 = arg0.method731(false);
            if (this.field1492 == 65535) {
                this.field1492 = -1;
            }
        } else if (arg3 == 5) {
            this.field1503 = false;
        } else if (arg3 == 7) {
            this.field1495 = class51.method358((byte) -7, arg0.method727(-27619));
        } else if (arg3 == 8) {
            class6.field74 = arg2;
        } else if (arg3 == 9) {
            arg0.method731(false);
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg0.method758(true);
            } else if (arg3 != 12) {
                if (arg3 == 13) {
                    arg0.method727(-27619);
                } else if (arg3 == 14) {
                    arg0.method758(true);
                }
            }
        }
        if (arg1 >= -104) {
            this.method627((byte) -82, 37, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZILoe;)Lfe;")
    public static final class15 method629(boolean arg0, int arg1, class256 arg2) {
        field1490++;
        if (class105.method697(arg0, arg1, arg2)) {
            if (arg0) {
                field1500 = -50;
            }
            return class197.method1267(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V")
    public static final void method630(boolean arg0, int arg1) {
        field1497++;
        byte[][] var2 = class178.field3139;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class177.method1165(-8886);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class76.field1141[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class131.field2316.length; var14++) {
                                if (class131.field2316[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class190.method1230(0, var4, var6 * 8, var2[var14], class169.field2951, var9, var5 * 8, (var12 & 0x7) * 8, var10, arg0, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class18.method88(var4, var6 * 8, 8, (byte) -121, 8, var5 * 8);
                    }
                }
            }
        }
        if (arg1 != 8) {
            method630(true, -43);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static void method631(byte arg0) {
        if (arg0 == 111) {
            field1494 = null;
            field1493 = null;
            field1504 = null;
            field1491 = null;
        }
    }
}
