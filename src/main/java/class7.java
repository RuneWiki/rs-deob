import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class7 extends class72 {

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    private int field111 = 0;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "Lh;")
    public static class42 field110 = new class42();

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "Lec;")
    public static class28 field116 = class28.method210(-46, "(Z");

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
    public static int field120 = 3;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field115 = 0;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "Lec;")
    public static class28 field118 = class28.method210(-46, "@red@");

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "Lec;")
    public static class28 field122 = class28.method210(-46, "Enter object name");

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field114 = 0;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "Lec;")
    public static class28 field123 = class28.method210(-46, "backbase2");

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "Lwc;")
    public static class128 field117;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "Lbb;")
    public static class9 field101;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILud;)V")
    private final void method31(int arg0, int arg1, int arg2, class119 arg3) {
        if (~arg0 == arg2) {
            this.field111 = arg3.method869(-121);
        }
        field105++;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public final void method32(int arg0) {
        if (arg0 == 3) {
            this.method35(this.field111, arg0 - 13478);
            field112++;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvb;I)V")
    public static final void method33(class122 arg0, int arg1) {
        field107++;
        if (arg1 != -20767) {
            method38((byte) -63, null);
        }
        class47.field1081 = arg0;
        class78.field1808 = class47.field1081.method947(16, (byte) 67);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class109 var10 = (class109) class37.field842.method326(0);
        field108++;
        class109 var11 = null;
        while (var10 != null) {
            if (var10.field2301 == arg6 && var10.field2286 == arg2 && var10.field2296 == arg8 && var10.field2295 == arg1) {
                var11 = var10;
                break;
            }
            var10 = (class109) class37.field842.method325((byte) 123);
        }
        if (var11 == null) {
            var11 = new class109();
            var11.field2286 = arg2;
            var11.field2295 = arg1;
            var11.field2301 = arg6;
            var11.field2296 = arg8;
            class109.method748(var11, 3);
            class37.field842.method337(25563, var11);
        }
        var11.field2275 = arg4;
        if (arg5 == -16228) {
            var11.field2285 = arg9;
            var11.field2306 = arg3;
            var11.field2300 = arg0;
            var11.field2308 = arg7;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
    private final void method35(int arg0, int arg1) {
        field99++;
        if (arg1 != -13475) {
            this.field104 = 96;
        }
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        double var13 = 0.0D;
        if (var3 > var7) {
            var11 = var7;
        }
        if (var5 < var11) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var7 > var3) {
            var9 = var7;
        }
        if (var5 > var9) {
            var9 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var9) {
                var13 = (var7 - var5) / (var9 - var11);
            } else if (var7 == var9) {
                var13 = (var5 - var3) / (var9 - var11) + 2.0D;
            } else if (var5 == var9) {
                var13 = (var3 - var7) / (-var11 + var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        this.field104 = (int) (var15 * 256.0D);
        if (this.field104 < 0) {
            this.field104 = 0;
        } else if (this.field104 > 255) {
            this.field104 = 255;
        }
        this.field119 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field119 < 0) {
            this.field119 = 0;
        } else if (this.field119 > 255) {
            this.field119 = 255;
        }
        if (var17 > 0.5D) {
            this.field100 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field100 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field100 < 1) {
            this.field100 = 1;
        }
        this.field113 = (int) ((double) this.field100 * var19);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLud;)V")
    public final void method36(int arg0, byte arg1, class119 arg2) {
        while (true) {
            int var4 = arg2.method879((byte) 45);
            if (var4 == 0) {
                if (arg1 != -121) {
                    this.method36(101, (byte) -62, null);
                }
                field103++;
                return;
            }
            this.method31(var4, arg0, -2, arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static final void method37(byte arg0) {
        field106++;
        class56.field1282.method158((byte) -6);
        int var1 = class56.field1282.method159(0, 8);
        if (var1 < class64.field1430) {
            for (int var2 = var1; var2 < class64.field1430; var2++) {
                class17.field327[class91.field2003++] = class64.field1429[var2];
            }
        }
        if (var1 > class64.field1430) {
            throw new RuntimeException("gnpov1");
        }
        class64.field1430 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class64.field1429[var3];
            class90 var5 = class88.field1956[var4];
            int var6 = class56.field1282.method159(0, 1);
            if (var6 == 0) {
                class64.field1429[class64.field1430++] = var4;
                var5.field1458 = class83.field1888;
            } else {
                int var7 = class56.field1282.method159(0, 2);
                if (var7 == 0) {
                    class64.field1429[class64.field1430++] = var4;
                    var5.field1458 = class83.field1888;
                    class25.field557[class16.field306++] = var4;
                } else if (var7 == 1) {
                    class64.field1429[class64.field1430++] = var4;
                    var5.field1458 = class83.field1888;
                    int var8 = class56.field1282.method159(0, 3);
                    var5.method523(var8, false, -2);
                    int var9 = class56.field1282.method159(0, 1);
                    if (var9 == 1) {
                        class25.field557[class16.field306++] = var4;
                    }
                } else if (var7 == 2) {
                    class64.field1429[class64.field1430++] = var4;
                    var5.field1458 = class83.field1888;
                    int var10 = class56.field1282.method159(0, 3);
                    var5.method523(var10, true, -2);
                    int var11 = class56.field1282.method159(0, 3);
                    var5.method523(var11, true, -2);
                    int var12 = class56.field1282.method159(0, 1);
                    if (var12 == 1) {
                        class25.field557[class16.field306++] = var4;
                    }
                } else if (var7 == 3) {
                    class17.field327[class91.field2003++] = var4;
                }
            }
        }
        if (arg0 > -115) {
            field122 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method38(byte arg0, KeyEvent arg1) {
        field98++;
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg0 != -112) {
            field121 = 35;
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(Z)V")
    public static void method39(boolean arg0) {
        field101 = null;
        if (!arg0) {
            method37((byte) -105);
        }
        field118 = null;
        field122 = null;
        field116 = null;
        field123 = null;
        field117 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Z")
    public static final boolean method40(int arg0) {
        field102++;
        class110 var1 = class49.field1133;
        synchronized (class49.field1133) {
            if (class94.field2078 == class74.field1644) {
                return false;
            }
            class117.field2497 = class74.field1648[class94.field2078];
            if (arg0 != 4625) {
                method37((byte) -84);
            }
            class78.field1820 = class64.field1426[class94.field2078];
            class94.field2078 = class94.field2078 + 1 & 0x7F;
            return true;
        }
    }
}
