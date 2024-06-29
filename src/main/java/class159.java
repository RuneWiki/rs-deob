import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class159 extends class98 {

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Z")
    public boolean field2714 = true;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Z")
    public static boolean field2705 = false;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Lj;")
    public static class502 field2715 = new class502("LIVE", 0);

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "Lrw;")
    public class703 field2721;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "[I")
    public int[] field2711;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "[I")
    private int[] field2719;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "[Ljava/lang/String;")
    private String[] field2707;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "[[I")
    private int[][] field2706;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 4)
    public final void method1304(int arg0) {
        field2713++;
        if (arg0 != 32768) {
            this.field2706 = null;
        }
        if (this.field2711 != null) {
            for (int var2 = 0; var2 < this.field2711.length; var2++) {
                this.field2711[var2] = class81.method769(this.field2711[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lie;Z)V", line = 26)
    public final void method1305(class6 arg0, boolean arg1) {
        field2720++;
        if (arg1) {
            this.method1312(null, -128, (byte) 95);
        }
        while (true) {
            int var3 = arg0.method70(-9059);
            if (var3 == 0) {
                return;
            }
            this.method1312(arg0, var3, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lui;", line = 48)
    public final class210 method1306(int arg0, int arg1) {
        if (arg1 == -1) {
            field2718++;
            return this.field2719 == null || arg0 < 0 || arg0 > this.field2719.length ? null : class143.method1215(false, this.field2719[arg0]);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)Z", line = 64)
    public static final boolean method1307(int arg0, int arg1, int arg2) {
        if (arg1 == 29840) {
            field2708++;
            return (arg2 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I", line = 75)
    public final int method1308(int arg0) {
        field2717++;
        if (this.field2719 == null) {
            return 0;
        } else {
            if (arg0 > -88) {
                field2705 = false;
            }
            return this.field2719.length;
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)Ljava/lang/String;", line = 94)
    public final String method1309(byte arg0) {
        field2724++;
        if (arg0 >= -63) {
            return null;
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2707 == null) {
            return "";
        }
        var2.append(this.field2707[0]);
        for (int var3 = 1; var3 < this.field2707.length; var3++) {
            var2.append("...");
            var2.append(this.field2707[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lie;I)Ljava/lang/String;", line = 128)
    public final String method1310(class6 arg0, int arg1) {
        field2710++;
        int var3 = -43 % ((62 - arg1) / 47);
        StringBuffer var4 = new StringBuffer(80);
        if (this.field2719 != null) {
            for (int var5 = 0; var5 < this.field2719.length; var5++) {
                var4.append(this.field2707[var5]);
                var4.append(this.field2721.method3965(arg0.method61(99, class143.method1215(false, this.field2719[var5]).field3503), -85, this.field2706[var5], this.method1306(var5, -1)));
            }
        }
        var4.append(this.field2707[this.field2707.length - 1]);
        return var4.toString();
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V", line = 155)
    public static void method1311(int arg0) {
        field2715 = null;
        if (arg0 != 0) {
            field2715 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lie;IB)V", line = 165)
    private final void method1312(class6 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2707 = class698.method3944('<', arg0.method42((byte) -41), -4);
        } else if (arg1 == 2) {
            int var9 = arg0.method70(arg2 ^ 0xFFFFDCF6);
            this.field2711 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2711[var10] = arg0.method67(arg2 + 11914);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method70(arg2 ^ 0xFFFFDCF6);
            this.field2706 = new int[var4][];
            this.field2719 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method67(12021);
                class210 var7 = class143.method1215(false, var6);
                if (var7 != null) {
                    this.field2719[var5] = var6;
                    this.field2706[var5] = new int[var7.field3509];
                    for (int var8 = 0; var8 < var7.field3509; var8++) {
                        this.field2706[var5][var8] = arg0.method67(12021);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field2714 = false;
        }
        field2716++;
        if (arg2 != 107) {
            this.field2707 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(ILjava/lang/String;I)V", line = 242)
    public static final void method1313(int arg0, String arg1, int arg2) {
        field2709++;
        if (arg0 != 32768) {
            return;
        }
        int var3 = class99.field1607;
        int[] var4 = class359.field5700;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class304 var7 = class597.field8465[var4[var6]];
            if (var7 != null && class567.field8141 != var7 && var7.field4792 != null && var7.field4792.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class403.field6214++;
                    class165 var8 = class271.method1917(class420.field6424, (byte) -105, class87.field1070);
                    var8.field2776.method65(0, -77);
                    var8.field2776.method76(false, var4[var6]);
                    class642.method3726(-684096285, var8);
                } else if (arg2 == 4) {
                    class348.field5575++;
                    class165 var9 = class271.method1917(class420.field6424, (byte) -98, class181.field3049);
                    var9.field2776.method76(false, var4[var6]);
                    var9.field2776.method36((byte) -124, 0);
                    class642.method3726(-684096285, var9);
                } else if (arg2 == 5) {
                    class181.field3045++;
                    class165 var10 = class271.method1917(class420.field6424, (byte) -41, class192.field3171);
                    var10.field2776.method52(0, arg0 ^ 0xBF34);
                    var10.field2776.method76(false, var4[var6]);
                    class642.method3726(arg0 ^ 0xD73904E3, var10);
                } else if (arg2 == 6) {
                    class316.field4975++;
                    class165 var11 = class271.method1917(class420.field6424, (byte) -73, class436.field6655);
                    var11.field2776.method65(0, arg0 ^ 0xFFFF7FB3);
                    var11.field2776.method25(true, var4[var6]);
                    class642.method3726(arg0 ^ 0xD73904E3, var11);
                } else if (arg2 == 7) {
                    class40.field545++;
                    class165 var12 = class271.method1917(class420.field6424, (byte) -73, class40.field533);
                    var12.field2776.method25(true, var4[var6]);
                    var12.field2776.method65(0, -77);
                    class642.method3726(-684096285, var12);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class307.method2122(4, class122.field1993.method1091(class135.field2206, 1) + arg1, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lie;Z[I)V", line = 347)
    public final void method1314(class6 arg0, boolean arg1, int[] arg2) {
        field2712++;
        if (this.field2719 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2719.length && var4 < arg2.length; var4++) {
            int var5 = this.method1306(var4, -1).field3506;
            if (var5 > 0) {
                arg0.method73((long) arg2[var4], 102, var5);
            }
        }
        if (arg1) {
            this.field2714 = true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(III)I", line = 374)
    public final int method1315(int arg0, int arg1, int arg2) {
        field2723++;
        if (this.field2719 == null || arg0 < 0 || this.field2719.length < arg0) {
            return -1;
        } else {
            if (arg2 != 1) {
                this.method1308(-126);
            }
            return this.field2706[arg0] == null || arg1 < 0 || arg1 > this.field2706[arg0].length ? -1 : this.field2706[arg0][arg1];
        }
    }
}
