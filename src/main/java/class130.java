import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class130 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1879 = -1;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[[S")
    public static short[][] field1881;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V", line = 9)
    public static final void method893(int arg0, int arg1, int arg2) {
        class257 var3 = class345.field5472[class219.field3290][arg0][arg1];
        field1878++;
        if (var3 == null) {
            class170.method1196(class219.field3290, arg0, arg1);
            return;
        }
        int var4 = arg2;
        class91 var5 = null;
        for (class91 var6 = (class91) var3.method1812(1); var6 != null; var6 = (class91) var3.method1809(128)) {
            class309 var7 = class190.method1302(var6.field1193.field5409, (byte) -125);
            int var8 = var7.field4826;
            if (var7.field4814 == 1) {
                var8 = (var6.field1193.field5406 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class170.method1196(class219.field3290, arg0, arg1);
            return;
        }
        class339 var9 = null;
        var3.method1810(0, var5);
        class91 var10 = (class91) var3.method1812(1);
        class339 var11 = null;
        while (var10 != null) {
            class339 var12 = var10.field1193;
            if (var5.field1193.field5409 != var12.field5409) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field5409 != var12.field5409 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class91) var3.method1809(128);
        }
        long var13 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class301.method2123(class219.field3290, arg0, arg1, class14.method80(arg1 * 128 + 64, class219.field3290, arg0 * 128 + 64, (byte) -126), var5.field1193, var13, var9, var11);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 93)
    public static final String[] method894(String[] arg0, byte arg1) {
        int var2 = -56 / ((6 - arg1) / 41);
        String[] var3 = new String[5];
        for (int var4 = 0; var4 < 5; var4++) {
            var3[var4] = var4 + ": ";
            if (arg0 != null && arg0[var4] != null) {
                var3[var4] = var3[var4] + arg0[var4];
            }
        }
        field1876++;
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BC)Z", line = 117)
    public static final boolean method895(byte arg0, char arg1) {
        field1880++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else {
            if (arg0 != -93) {
                field1881 = (short[][]) ((short[][]) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILlf;)Lu;", line = 140)
    public static final class283 method896(int arg0, class143 arg1) {
        field1877++;
        return arg0 == -161 ? new class283(arg1.method1021(-1), arg1.method1021(arg0 + 160), arg1.method1021(-1), arg1.method1021(arg0 + 160), arg1.method1021(-1), arg1.method1021(-1), arg1.method1021(arg0 ^ 0xA0), arg1.method1021(arg0 + 160), arg1.method1017((byte) 101), arg1.method1043(true)) : (class283) null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 158)
    public static void method897(int arg0) {
        if (arg0 == -67595545) {
            field1881 = (short[][]) null;
        }
    }
}
