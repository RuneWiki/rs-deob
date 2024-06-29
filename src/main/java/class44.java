import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class44 extends class184 {

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Z")
    public boolean field701 = false;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
    public boolean field708 = false;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field709 = -1;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[I")
    public static int[] field705 = new int[50];

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[[[I")
    public static int[][][] field703;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
    public static final void method410(byte arg0) {
        field700++;
        int var1 = -30 / ((-arg0 - 19) / 38);
        class344 var2 = class234.field3227;
        synchronized (class234.field3227) {
            class234.field3227.method2176(96);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)Lbi;")
    public static final class139 method411(int arg0, boolean arg1, int arg2) {
        field711++;
        if (!arg1) {
            method410((byte) -63);
        }
        class139 var3 = class10.method57(65535, arg2);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field2045 == null || arg0 >= var3.field2045.length) {
            return null;
        } else {
            return var3.field2045[arg0];
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
    public static final void method412(byte arg0) {
        if (arg0 <= 116) {
            return;
        }
        field710++;
        if (class99.field1419 < class99.field1420) {
            class99.field1419 = (float) ((double) class99.field1419 / 30.0D + (double) class99.field1419);
            if (class99.field1419 > class99.field1420) {
                class99.field1419 = class99.field1420;
            }
            class156.method1196(true);
            class99.field1418 = (int) class99.field1419 >> 1;
            class99.field1413 = class74.method640((byte) 77, class99.field1418);
        } else if (class99.field1419 > class99.field1420) {
            class99.field1419 = (float) ((double) class99.field1419 - (double) class99.field1419 / 30.0D);
            if (class99.field1419 < class99.field1420) {
                class99.field1419 = class99.field1420;
            }
            class156.method1196(true);
            class99.field1418 = (int) class99.field1419 >> 1;
            class99.field1413 = class74.method640((byte) 77, class99.field1418);
        }
        if (field709 != -1 && class39.field605 != -1) {
            int var1 = field709 - class447.field6475;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class39.field605 - class172.field2519;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class447.field6475 += var1;
            class172.field2519 += var2;
            if (var1 == 0 && var2 == 0) {
                field709 = -1;
                class39.field605 = -1;
            }
            class156.method1196(true);
        }
        if (class115.field1615 > 0) {
            class440.field6330--;
            if (class440.field6330 == 0) {
                class440.field6330 = 100;
                class115.field1615--;
            }
        } else {
            class100.field1446 = -1;
            class312.field4219 = -1;
        }
        if (!class53.field866 || class71.field1081 == null) {
            return;
        }
        for (class129 var3 = (class129) class71.field1081.method1240((byte) -103); var3 != null; var3 = (class129) class71.field1081.method1245(1)) {
            class384 var4 = class212.method1451(var3.field1841.field6119, 36);
            if (class177.field2611 == 0 && var3.method1005(class312.field4220, class391.field5490, -22)) {
                if (var4.field5395 != null) {
                    if (var4.field5395[4] != null) {
                        class361.method2264(0, -1, var4.field5395[4], (long) var3.field1841.field6119, 48, var4.field5400, 1005, var4.field5408);
                    }
                    if (var4.field5395[3] != null) {
                        class361.method2264(0, -1, var4.field5395[3], (long) var3.field1841.field6119, -105, var4.field5400, 1007, var4.field5408);
                    }
                    if (var4.field5395[2] != null) {
                        class361.method2264(0, -1, var4.field5395[2], (long) var3.field1841.field6119, -126, var4.field5400, 1003, var4.field5408);
                    }
                    if (var4.field5395[1] != null) {
                        class361.method2264(0, -1, var4.field5395[1], (long) var3.field1841.field6119, 75, var4.field5400, 1012, var4.field5408);
                    }
                    if (var4.field5395[0] != null) {
                        class361.method2264(0, -1, var4.field5395[0], (long) var3.field1841.field6119, 55, var4.field5400, 1001, var4.field5408);
                    }
                }
                if (!var3.field1841.field6117) {
                    var3.field1841.field6117 = true;
                    class18.method262(15, var3.field1841.field6119, var4.field5408);
                }
                if (var3.field1841.field6117) {
                    class18.method262(17, var3.field1841.field6119, var4.field5408);
                }
            } else if (var3.field1841.field6117) {
                var3.field1841.field6117 = false;
                class18.method262(16, var3.field1841.field6119, var4.field5408);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)V")
    public static void method413(int arg0) {
        field703 = null;
        field705 = null;
        if (arg0 != 2) {
            method413(125);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIZZ)V")
    public class44(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field706 = arg2;
        this.field707 = arg0;
        this.field701 = arg3;
        this.field704 = arg1;
        this.field708 = arg4;
    }
}
