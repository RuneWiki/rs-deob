import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class43 {

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    private int field866 = 0;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    private int field867 = -1;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lad;")
    private class5 field858 = new class5();

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "Z")
    public boolean field885 = false;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    private int field873;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[[[I")
    private int[][][] field881;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[Lrb;")
    private class159[] field859;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lrf;")
    public static class163 field863 = class53.method392(-54, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lrf;")
    public static class163 field877 = class53.method392(98, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
    public static int[] field869 = new int[1000];

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "Lrf;")
    private static class163 field883 = class53.method392(87, "Choose Option");

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lrf;")
    private static class163 field868 = class53.method392(80, "Players");

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lrf;")
    public static class163 field864 = field883;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lrf;")
    public static class163 field875 = field868;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[I")
    public static int[] field870;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "[[[B")
    public static byte[][][] field884;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[[I")
    public final int[][] method259(int arg0, int arg1) {
        field860++;
        if (arg1 != -2) {
            field863 = null;
        }
        if (this.field873 == this.field862) {
            this.field885 = this.field859[arg0] == null;
            this.field859[arg0] = class129.field2645;
            return this.field881[arg0];
        } else if (this.field873 == 1) {
            this.field885 = this.field867 != arg0;
            this.field867 = arg0;
            return this.field881[0];
        } else {
            class159 var3 = this.field859[arg0];
            if (this.field885 = var3 == null) {
                if (this.field866 < this.field873) {
                    var3 = new class159(arg0, this.field866);
                    this.field866++;
                } else {
                    class159 var4 = (class159) this.field858.method48(0);
                    var3 = new class159(arg0, var4.field3237);
                    this.field859[var4.field3241] = null;
                    var4.method630(97);
                }
                this.field859[arg0] = var3;
            }
            this.field858.method52(var3, 0);
            return this.field881[var3.field3237];
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method260(int arg0) {
        field865++;
        for (int var2 = arg0; var2 < this.field873; var2++) {
            this.field881[var2][0] = null;
            this.field881[var2][1] = null;
            this.field881[var2][2] = null;
            this.field881[var2] = null;
        }
        this.field859 = null;
        this.field881 = null;
        this.field858.method54((byte) 102);
        this.field858 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method261(int arg0) {
        field880++;
        if (this.field873 != this.field862) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field873; var2++) {
            this.field859[var2] = class129.field2645;
        }
        return this.field881;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Lnh;")
    public static final class129 method262(int arg0, int arg1) {
        field874++;
        class129 var2 = (class129) class99.field2084.method401((long) arg1, (byte) 94);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class77.field1584.method1235(arg1, (byte) -64, 9);
        class129 var4 = new class129();
        var4.field2662 = arg1;
        if (var3 != null) {
            var4.method854(new class52(var3), false);
        }
        var4.method847(-128);
        class99.field2084.method398(var4, (long) arg1, (byte) 94);
        if (arg0 != 18354) {
            method266(54, (byte) -5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)Lja;")
    public static final class87 method263(int arg0, int arg1, int arg2, int arg3) {
        class87 var4 = new class87();
        var4.field1890 = arg2;
        field879++;
        var4.field1903 = arg3;
        class138.field2847.method462(112, var4, (long) arg1);
        class120.method820(arg3, true);
        class41.method257(arg3, (byte) 27);
        class84 var5 = class138.method907(arg1, false);
        if (var5 != null) {
            class194.method1295((byte) 125, var5);
        }
        if (class88.field1924 != null) {
            class194.method1295((byte) 103, class88.field1924);
            class88.field1924 = null;
        }
        class32.field638 = false;
        class184.field3678 = 0;
        class191.method1287(class118.field2507, class19.field305, class4.field43, class193.field3803, arg0 - 7807);
        if (~class62.field1314 != arg0) {
            class31.method208(1, class62.field1314, (byte) -127);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
    public static final void method264(int arg0, byte arg1) {
        class95 var2 = (class95) class65.field1373.method465((long) arg0, (byte) -69);
        field878++;
        if (var2 != null) {
            var2.method630(93);
            if (arg1 != 53) {
                field869 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public static void method265(int arg0) {
        field868 = null;
        field884 = null;
        int var1 = 86 % ((29 - arg0) / 37);
        field870 = null;
        field864 = null;
        field877 = null;
        field869 = null;
        field863 = null;
        field875 = null;
        field883 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)I")
    public static final int method266(int arg0, byte arg1) {
        field871++;
        if (arg1 != -51) {
            method265(67);
        }
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLrf;Lrf;I)V")
    public static final void method267(byte arg0, class163 arg1, class163 arg2, int arg3) {
        class129.method846(arg1, null, arg3, -1, arg2);
        field876++;
        if (arg0 >= -42) {
            field884 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(III)V")
    public class43(int arg0, int arg1, int arg2) {
        this.field862 = arg1;
        this.field873 = arg0;
        this.field881 = new int[arg0][3][arg2];
        this.field859 = new class159[arg1];
    }
}
