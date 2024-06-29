import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class175 {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[[[I")
    public static int[][][] field3095 = new int[4][13][13];

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Ls;")
    public static class261 field3091 = new class261(64);

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lvd;")
    public static class127 field3097 = null;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lmh;")
    public static class128 field3098 = class22.method156(124, ":");

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
    public static int[] field3099;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JZ)V", line = 4)
    public static final void method1203(long arg0, boolean arg1) {
        field3088++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class218.field3847; var3++) {
            if (class208.field3646[var3] == arg0) {
                class218.field3847--;
                class203.field3584++;
                for (int var4 = var3; var4 < class218.field3847; var4++) {
                    class208.field3646[var4] = class208.field3646[var4 + 1];
                    class163.field2777[var4] = class163.field2777[var4 + 1];
                }
                class208.field3708 = class104.field1788;
                class71.field1320.method570(104, -1);
                class71.field1320.method1344(126, arg0);
                break;
            }
        }
        if (!arg1) {
            field3095 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 56)
    public static final void method1204(int arg0) {
        int var1 = -48 % ((-arg0 - 51) / 63);
        field3092++;
        class47.field937.method1832((byte) 69);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 68)
    public static final void method1205(int arg0, int arg1) {
        field3094++;
        int var2 = 23 / ((58 - arg1) / 54);
        class97.field1661.method1833(arg0, (byte) 116);
        class98.field1694.method1833(arg0, (byte) 79);
        class259.field4463.method1833(arg0, (byte) 96);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)I", line = 84)
    public static final int method1206(int arg0, int arg1, int arg2, int arg3) {
        field3089++;
        if (arg0 == arg1) {
            return arg1;
        }
        int var4 = 128 - arg2;
        if (arg3 != 1) {
            field3097 = (class127) null;
        }
        int var5 = ((arg0 & 0xFF00FF00) >>> 7) * arg2 + (arg1 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
        int var6 = (arg1 & 0xFF00FF) * var4 + ((arg0 & 0xFF00FF) * arg2) & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lbg;", line = 106)
    public static final class194 method1207(int arg0) {
        field3090++;
        class194 var1 = new class194(30);
        var1.method1352(arg0 + 7527, 7);
        var1.method1352(7528, class254.field4378);
        if (arg0 != 1) {
            return (class194) null;
        }
        var1.method1352(7528, class17.field496 ? 1 : 0);
        var1.method1352(arg0 ^ 0x1D69, class116.field1969 ? 1 : 0);
        var1.method1352(7528, class228.field3968 ? 1 : 0);
        var1.method1352(7528, class1.field12 ? 1 : 0);
        var1.method1352(7528, class22.field545 ? 1 : 0);
        var1.method1352(7528, class260.field4512 ? 1 : 0);
        var1.method1352(7528, class121.field2039 ? 1 : 0);
        var1.method1352(7528, class114.field1916 ? 1 : 0);
        var1.method1352(arg0 + 7527, class182.field3197);
        var1.method1352(7528, class90.field1536 ? 1 : 0);
        var1.method1352(7528, class240.field4101 ? 1 : 0);
        var1.method1352(7528, class271.field4693 ? 1 : 0);
        var1.method1352(7528, class238.field4073);
        var1.method1352(7528, class31.field689 ? 1 : 0);
        var1.method1352(7528, class214.field3778);
        var1.method1352(7528, class139.field2391);
        var1.method1352(7528, class158.field2699);
        var1.method1324(class206.field3629, arg0 + 15802);
        var1.method1324(class221.field3885, 15803);
        var1.method1352(arg0 ^ 0x1D69, 2);
        var1.method1337(arg0 ^ 0xFFFFFFA6, class196.field3435);
        var1.method1352(7528, class165.field2836);
        var1.method1352(7528, class45.field908 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ldj;B)V", line = 143)
    public static final void method1208(class314 arg0, byte arg1) {
        class263.field4563 = arg0;
        field3093++;
        if (arg1 != 110) {
            field3097 = (class127) null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 156)
    public static void method1209(byte arg0) {
        field3098 = null;
        field3091 = null;
        field3097 = null;
        field3099 = null;
        if (arg0 != -32) {
            field3098 = (class128) null;
        }
        field3095 = (int[][][]) null;
    }
}
