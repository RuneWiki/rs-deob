import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class98 extends class179 {

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    private int field1743 = -1;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "Lij;")
    public static class175 field1744 = new class175();

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "[I")
    public static int[] field1751 = new int[1000];

    @OriginalMember(owner = "client!nj", name = "hb", descriptor = "Lke;")
    public static class256 field1759 = class316.method2202("Mem:", 27626);

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "I")
    public static int field1753 = 0;

    @OriginalMember(owner = "client!nj", name = "fb", descriptor = "I")
    public static int field1757 = 0;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!nj", name = "db", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!nj", name = "eb", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!nj", name = "gb", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!nj", name = "ib", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!nj", name = "jb", descriptor = "Lrj;")
    public static class254 field1761;

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "Lta;")
    public static class82 field1754;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "[I")
    private int[] field1749;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)[[I", line = 10)
    public final int[][] method55(int arg0, int arg1) {
        field1746++;
        if (arg0 != 75) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080 && this.method702(arg0 ^ 0xFFFFFFB9)) {
            int var4 = this.field1745 * (class38.field697 == this.field1758 ? arg1 : this.field1758 * arg1 / class38.field697);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class161.field2858 == this.field1745) {
                for (int var11 = 0; var11 < class161.field2858; var11++) {
                    int var12 = this.field1749[var4++];
                    var7[var11] = class150.method1123(var12 << 4, 4080);
                    var6[var11] = class150.method1123(65280, var12) >> 4;
                    var5[var11] = class150.method1123(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class161.field2858; var8++) {
                    int var9 = this.field1745 * var8 / class161.field2858;
                    int var10 = this.field1749[var4 + var9];
                    var7[var8] = class150.method1123(4080, var10 << 4);
                    var6[var8] = class150.method1123(var10 >> 4, 4080);
                    var5[var8] = class150.method1123(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLra;)Lai;", line = 82)
    public static final class257 method700(byte arg0, class41 arg1) {
        if (arg0 < 72) {
            method700((byte) -60, (class41) null);
        }
        field1742++;
        return new class257(arg1.method309(2), arg1.method309(2), arg1.method309(2), arg1.method309(2), arg1.method309(2), arg1.method309(2), arg1.method309(2), arg1.method309(2), arg1.method349((byte) 65), arg1.method357(false));
    }

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)V", line = 103)
    public static final void method701(int arg0) {
        field1748++;
        class188.field3429.method1944(13739);
        class137.field2391 = null;
        class83.field1518 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILra;I)V", line = 114)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field1750++;
        if (arg2 == 0) {
            this.field1743 = arg1.method346(-16);
        }
        if (arg0 < 108) {
            field1752 = -16;
        }
    }

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "(I)Z", line = 135)
    private final boolean method702(int arg0) {
        field1760++;
        if (this.field1749 != null) {
            return true;
        } else if (this.field1743 < 0) {
            return arg0 > -3 ? false : false;
        } else {
            int var2 = class161.field2858;
            int var3 = class38.field697;
            int var4 = class132.field2309.method200((byte) -67, this.field1743) ? 64 : 128;
            this.field1749 = class132.field2309.method181(this.field1743, (byte) -127);
            this.field1745 = var4;
            this.field1758 = var4;
            class271.method1873(var3, (byte) -97, var2);
            return this.field1749 != null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "(I)V", line = 165)
    public static final void method703(int arg0) {
        field1755++;
        if (class54.field1000 == 0 || arg0 != 0) {
            return;
        }
        try {
            if (++class42.field805 > 2000) {
                if (class196.field3586 != null) {
                    class196.field3586.method1627(123);
                    class196.field3586 = null;
                }
                if (class114.field2010 >= 1) {
                    class54.field1000 = 0;
                    class168.field2990 = -5;
                    return;
                }
                class114.field2010++;
                class54.field1000 = 1;
                if (class53.field968 == class286.field4968) {
                    class286.field4968 = class5.field78;
                } else {
                    class286.field4968 = class53.field968;
                }
                class42.field805 = 0;
            }
            if (class54.field1000 == 1) {
                field1754 = class272.field4658.method32(class286.field4968, (byte) 105, class29.field409);
                class54.field1000 = 2;
            }
            if (class54.field1000 == 2) {
                if (field1754.field1500 == 2) {
                    throw new IOException();
                }
                if (field1754.field1500 != 1) {
                    return;
                }
                class196.field3586 = new class243((Socket) field1754.field1499, class272.field4658);
                field1754 = null;
                class196.field3586.method1636((byte) 20, 0, class308.field5322.field772, class308.field5322.field738);
                if (class134.field2335 != null) {
                    class134.field2335.method1416((byte) -63);
                }
                if (class114.field2011 != null) {
                    class114.field2011.method1416((byte) -63);
                }
                int var1 = class196.field3586.method1629(0);
                if (class134.field2335 != null) {
                    class134.field2335.method1416((byte) -63);
                }
                if (class114.field2011 != null) {
                    class114.field2011.method1416((byte) -63);
                }
                if (var1 != 21) {
                    class54.field1000 = 0;
                    class168.field2990 = var1;
                    class196.field3586.method1627(arg0 + 126);
                    class196.field3586 = null;
                    return;
                }
                class54.field1000 = 3;
            }
            if (class54.field1000 == 3) {
                if (class196.field3586.method1633((byte) -5) < 1) {
                    return;
                }
                class198.field3619 = new class256[class196.field3586.method1629(arg0 ^ 0x0)];
                class54.field1000 = 4;
            }
            if (class54.field1000 == 4) {
                if (class196.field3586.method1633((byte) -5) < class198.field3619.length * 8) {
                    return;
                }
                class23.field302.field738 = 0;
                class196.field3586.method1635(0, class23.field302.field772, class198.field3619.length * 8, -1078);
                for (int var2 = 0; var2 < class198.field3619.length; var2++) {
                    class198.field3619[var2] = class290.method2018(7130, class23.field302.method344((byte) -86));
                }
                class54.field1000 = 0;
                class168.field2990 = 21;
                class196.field3586.method1627(86);
                class196.field3586 = null;
                return;
            }
        } catch (IOException var4) {
            if (class196.field3586 != null) {
                class196.field3586.method1627(104);
                class196.field3586 = null;
            }
            if (class114.field2010 >= 1) {
                class54.field1000 = 0;
                class168.field2990 = -4;
            } else {
                class114.field2010++;
                class42.field805 = 0;
                if (class53.field968 == class286.field4968) {
                    class286.field4968 = class5.field78;
                } else {
                    class286.field4968 = class53.field968;
                }
                class54.field1000 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 385)
    public class98() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)V", line = 326)
    public final void method704(int arg0) {
        super.method704(-106);
        if (arg0 > -27) {
            this.field1749 = (int[]) null;
        }
        field1756++;
        this.field1749 = null;
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)I", line = 351)
    public final int method705(int arg0) {
        field1747++;
        return arg0 == -1 ? this.field1743 : -4;
    }

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "(I)V", line = 363)
    public static void method706(int arg0) {
        if (arg0 <= 84) {
            method703(-48);
        }
        field1744 = null;
        field1761 = null;
        field1751 = null;
        field1759 = null;
        field1754 = null;
    }
}
