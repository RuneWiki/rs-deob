import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class131 {

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    private int field2103 = 0;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    private int field2114 = -1;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lnb;")
    private class223 field2102 = new class223();

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "Z")
    public boolean field2115 = false;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "[[I")
    private int[][] field2100;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    private int field2107;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[Lqe;")
    private class103[] field2108;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[Luk;")
    public static class104[] field2113 = new class104[32768];

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Z")
    public static boolean field2101 = true;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method888(int arg0) {
        field2110++;
        if (arg0 != -21256) {
            return;
        }
        for (int var2 = 0; var2 < this.field2111; var2++) {
            this.field2100[var2] = null;
        }
        this.field2100 = null;
        this.field2108 = null;
        this.field2102.method1549(0);
        this.field2102 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method889(String arg0, int arg1) {
        int var2 = -6 % ((33 - arg1) / 50);
        field2109++;
        int var3 = arg0.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public static final void method890(boolean arg0) {
        class123.field1949.method1876((byte) 123);
        field2112++;
        if (!arg0) {
            method889((String) null, -19);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZZIIIZI)V")
    public static final void method891(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2104++;
        if (arg6 == 3) {
            method891(true, true, -1, -1, arg4, true, class147.field2352);
            return;
        }
        Container var7;
        if (class200.field3207 != null) {
            var7 = class200.field3207;
        } else if (class53.field776 == null) {
            var7 = class44.field659.field1105;
        } else {
            var7 = class53.field776;
        }
        class74.field1185 = var7.getSize().width;
        class132.field2124 = var7.getSize().height;
        if (class53.field776 == var7) {
            Insets var8 = class53.field776.getInsets();
            class74.field1185 -= var8.left + var8.right;
            class132.field2124 -= var8.top + var8.bottom;
        }
        if (arg6 < 2) {
            class195.field3161 = 503;
            class108.field1681 = (class74.field1185 - 765) / 2;
            class60.field869 = 0;
            class154.field2463 = 765;
        } else {
            class60.field869 = 0;
            class154.field2463 = class74.field1185;
            class195.field3161 = class132.field2124;
            class108.field1681 = 0;
        }
        if (arg1) {
            class113.method786((byte) -109, class122.field1926);
            class28.method224(class122.field1926, -123);
            if (class299.field4907 != null) {
                class299.field4907.method3(10, class122.field1926);
            }
            class106.field1658.method2048((byte) -61);
            class218.method1488(true, class122.field1926);
            class163.method1115(class122.field1926, false);
            if (class299.field4907 != null) {
                class299.field4907.method1(1, class122.field1926);
            }
        } else {
            class122.field1926.setSize(class154.field2463, class195.field3161);
            if (class53.field776 == var7) {
                Insets var9 = class53.field776.getInsets();
                class122.field1926.setLocation(var9.left + class108.field1681, var9.top - -class60.field869);
            } else {
                class122.field1926.setLocation(class108.field1681, class60.field869);
            }
        }
        if (arg6 > 0) {
            method891(true, true, -1, -1, arg4, true, 0);
            return;
        }
        class230.field3608 = !class143.method981(22351);
        class181.method1277(class154.field2463, class195.field3161);
        if (class68.field1089 != -1) {
            class291.method2011(true, -30310);
        }
        if (class18.field322 != null && (class238.field3741 == 30 || class238.field3741 == 25)) {
            class45.method299(101);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class259.field4249[var10] = true;
        }
        class233.field3650 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method892(byte arg0) {
        field2113 = null;
        if (arg0 != 84) {
            field2113 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)[[I")
    public final int[][] method893(int arg0) {
        field2105++;
        if (this.field2111 != this.field2107) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -129) {
            method892((byte) 99);
        }
        for (int var2 = 0; var2 < this.field2111; var2++) {
            this.field2108[var2] = class71.field1140;
        }
        return this.field2100;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I")
    public final int[] method894(int arg0, int arg1) {
        field2106++;
        int var3 = -113 / ((53 - arg0) / 57);
        if (this.field2111 == this.field2107) {
            this.field2115 = this.field2108[arg1] == null;
            this.field2108[arg1] = class71.field1140;
            return this.field2100[arg1];
        } else if (this.field2111 == 1) {
            this.field2115 = this.field2114 != arg1;
            this.field2114 = arg1;
            return this.field2100[0];
        } else {
            class103 var4 = this.field2108[arg1];
            if (var4 == null) {
                this.field2115 = true;
                if (this.field2111 > this.field2103) {
                    var4 = new class103(arg1, this.field2103);
                    this.field2103++;
                } else {
                    class103 var5 = (class103) this.field2102.method1547(0);
                    var4 = new class103(arg1, var5.field1629);
                    this.field2108[var5.field1627] = null;
                    var5.method952((byte) 107);
                }
                this.field2108[arg1] = var4;
            } else {
                this.field2115 = false;
            }
            this.field2102.method1548(var4, 0);
            return this.field2100[var4.field1629];
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(III)V")
    public class131(int arg0, int arg1, int arg2) {
        this.field2111 = arg0;
        this.field2100 = new int[this.field2111][arg2];
        this.field2107 = arg1;
        this.field2108 = new class103[this.field2107];
    }
}
