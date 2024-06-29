import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class148 extends class201 {

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Ljd;")
    public static class85 field2504 = class221.method1499("logo", (byte) 118);

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Ljd;")
    private static class85 field2520 = class221.method1499(" ", (byte) 122);

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "Ljd;")
    public static class85 field2518 = field2520;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "Ljd;")
    public class85 field2515;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "[I")
    public int[] field2502;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "[I")
    public int[] field2508;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "[I")
    public int[] field2513;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "[I")
    public int[] field2514;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "[[I")
    public static int[][] field2507;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZIII)V")
    public static final void method964(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2503++;
        if (!arg1) {
            return;
        }
        if (arg3 <= arg4) {
            for (int var5 = arg3; var5 < arg4; var5++) {
                class146.field2488[var5][arg2] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class146.field2488[var6][arg2] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    public static final void method965(int arg0, int arg1) {
        field2506++;
        if (arg1 < 114) {
            method968(true);
        }
        if (class230.field3983 == 0) {
            class201.field3511.method801(7692, arg0);
        } else {
            class1.field7 = arg0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILik;)V")
    public final void method966(int arg0, class247 arg1) {
        int var3 = 33 / ((-arg0 - 31) / 48);
        while (true) {
            int var4 = arg1.method1711((byte) -67);
            if (var4 == 0) {
                field2516++;
                return;
            }
            this.method970(-16663, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lrh;B)V")
    public static final void method967(class44 arg0, byte arg1) {
        if (arg1 != 42) {
            method968(true);
        }
        class185 var2 = (class185) class31.field472.method1398(1, arg0.field762.method624(false));
        field2512++;
        if (var2 == null) {
            class1.method3((class17) null, class116.field2066, arg0.field1066[0], 0, 128, arg0, (class199) null, arg0.field1043[0]);
        } else {
            var2.method1276(true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)V")
    public static void method968(boolean arg0) {
        if (!arg0) {
            field2507 = null;
        }
        field2518 = null;
        field2520 = null;
        field2504 = null;
        field2507 = null;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
    public final void method969(int arg0) {
        if (this.field2502 != null) {
            for (int var2 = 0; var2 < this.field2502.length; var2++) {
                this.field2502[var2] = class75.method528(this.field2502[var2], 32768);
            }
        }
        if (this.field2514 != null) {
            for (int var3 = 0; var3 < this.field2514.length; var3++) {
                this.field2514[var3] = class75.method528(this.field2514[var3], 32768);
            }
        }
        field2505++;
        if (arg0 != 32426) {
            this.method966(-101, (class247) null);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILik;I)V")
    private final void method970(int arg0, class247 arg1, int arg2) {
        field2517++;
        if (arg0 != -16663) {
            this.method966(87, (class247) null);
        }
        if (arg2 == 1) {
            this.field2515 = arg1.method1692(125);
        } else if (arg2 == 2) {
            int var4 = arg1.method1711((byte) -67);
            this.field2514 = new int[var4];
            this.field2508 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2514[var5] = arg1.method1694((byte) -100);
                int var6 = arg1.method1711((byte) -67);
                if (var6 == 0) {
                    this.field2508[var5] = -1;
                } else {
                    this.field2508[var5] = var6;
                }
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg1.method1711((byte) -67);
            this.field2502 = new int[var7];
            this.field2513 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2502[var8] = arg1.method1694((byte) -100);
                int var9 = arg1.method1711((byte) -67);
                if (var9 == 0) {
                    this.field2513[var8] = -1;
                } else {
                    this.field2513[var8] = var9;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)I")
    public final int method971(int arg0, byte arg1) {
        field2509++;
        if (this.field2514 == null) {
            return -1;
        }
        int var3 = 57 / ((arg1 + 60) / 50);
        for (int var4 = 0; var4 < this.field2514.length; var4++) {
            if (this.field2508[var4] == arg0) {
                return this.field2514[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljd;BLjd;I)V")
    public static final void method972(class85 arg0, byte arg1, class85 arg2, int arg3) {
        if (arg1 > -12) {
            field2520 = null;
        }
        field2519++;
        class32.method222(-1, (class85) null, -100, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)I")
    public final int method973(byte arg0, int arg1) {
        field2510++;
        if (this.field2502 == null) {
            return -1;
        }
        if (arg0 != -123) {
            field2507 = null;
        }
        for (int var3 = 0; var3 < this.field2502.length; var3++) {
            if (this.field2513[var3] == arg1) {
                return this.field2502[var3];
            }
        }
        return -1;
    }
}
