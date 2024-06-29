import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class346 {

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    private int field5614 = 0;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lqr;")
    private class69 field5612;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5620 = new String[] { method2899(method2898("\u001a\u001d;?\\")), method2899(method2898("\u000fFy}")), method2899(method2898("\tC;U\t")), method2899(method2898("\tC;P\t")), method2899(method2898("\tC;R\t")), method2899(method2898("\tC;S\t")), method2899(method2898("\tC;-H\u000fZa/\t")), method2899(method2898("\tC;T\t")) };

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Ljava/lang/Object;")
    public static volatile Object field5618 = null;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Lhl;")
    public static class556 field5611 = new class556(47, -2);

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field5619 = 0;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Lac;")
    private class568 field5617;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Lac;")
    public final class568 method2893(int arg0) {
        try {
            this.field5614 = 0;
            field5610++;
            return arg0 == -20631 ? this.method2895(false) : null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5620[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lmj;IILha;I)V")
    public static final void method2894(class683 arg0, int arg1, int arg2, class63 arg3, int arg4) {
        try {
            field5613++;
            byte var5 = 63;
            byte var6 = 7;
            if (arg4 == 29474) {
                for (int var7 = 63; var7 >= 0; var7--) {
                    class517.method3877(true, false, 1);
                    int var8 = var5 & 0x7F | (var6 & 0x7) << 7 | var7 & 0x3F << 10;
                    int var9 = class613.field8810[var8];
                    class300.method2587((byte) 67, false, true);
                    arg3.method242(arg2, arg1 + ((63 - var7) * arg0.field9777 >> 6), arg0.field9797, (arg0.field9777 >> 6) + 1, var9, 0);
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field5620[4] + (arg0 == null ? field5620[1] : field5620[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5620[1] : field5620[0]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Lac;")
    public final class568 method2895(boolean arg0) {
        try {
            field5609++;
            if (this.field5614 > 0 && this.field5612.field984[this.field5614 - 1] != this.field5617) {
                class568 var2 = this.field5617;
                this.field5617 = var2.field8249;
                return var2;
            }
            while (this.field5614 < this.field5612.field971) {
                class568 var3 = this.field5612.field984[this.field5614++].field8249;
                if (this.field5612.field984[this.field5614 - 1] != var3) {
                    this.field5617 = var3.field8249;
                    return var3;
                }
            }
            if (arg0) {
                field5619 = 83;
            }
            return null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5620[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static void method2896(byte arg0) {
        try {
            if (arg0 <= 95) {
                method2894(null, -74, -43, null, 16);
            }
            field5611 = null;
            field5618 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5620[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILmj;B)V")
    public static final void method2897(int arg0, int arg1, class683 arg2, byte arg3) {
        try {
            field5616++;
            class514 var4 = arg2.method4984(class662.field9437, 110);
            if (var4 != null) {
                class662.field9437.method221(arg0, arg1, arg2.field9797 + arg0, arg1 - -arg2.field9777);
                if (class137.field1930 >= 3) {
                    class662.field9437.method170(-16777216, var4, arg0, arg1);
                } else {
                    class539.field7916.method1000((float) arg2.field9797 / 2.0F + (float) arg0, (float) arg2.field9777 / 2.0F + (float) arg1, 4096, ((int) (-class29.field293) & 0x3FFF) << 2, var4, arg0, arg1);
                }
                int var5 = 97 / ((arg3 - 22) / 60);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5620[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5620[1] : field5620[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class346() {
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lqr;)V")
    public class346(class69 arg0) {
        try {
            this.field5612 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5620[6] + (arg0 == null ? field5620[1] : field5620[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2898(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2899(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
