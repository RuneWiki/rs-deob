import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class74 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lma;")
    public static class5 field1160 = class12.method119("Hidden)2", (byte) 55);

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Z")
    public static boolean field1169 = false;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lma;")
    public static class5 field1166 = class12.method119("(U0a )2 via: ", (byte) 59);

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1168 = 0;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "[[B")
    public static byte[][] field1173 = new byte[1000][];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "[[[I")
    public static int[][][] field1167;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 14)
    public static void method526(boolean arg0) {
        field1167 = (int[][][]) null;
        if (arg0) {
            method528(-105);
        }
        field1160 = null;
        field1166 = null;
        field1173 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)[Lb;", line = 44)
    public static final class129[] method528(int arg0) {
        if (class141.field2080 == null) {
            class129[] var1 = class244.method1713(class267.field4597, -120);
            class129[] var2 = new class129[var1.length];
            int var3 = 0;
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class129 var5 = var1[var4];
                if ((var5.field1942 <= 0 || var5.field1942 >= 24) && var5.field1935 >= 800 && var5.field1939 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class129 var7 = var2[var6];
                        if (var5.field1935 == var7.field1935 && var5.field1939 == var7.field1939) {
                            if (var7.field1942 < var5.field1942) {
                                var2[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class141.field2080 = new class129[var3];
            class42.method294(var2, 0, class141.field2080, 0, var3);
            int[] var8 = new int[class141.field2080.length];
            for (int var9 = 0; var9 < class141.field2080.length; var9++) {
                class129 var10 = class141.field2080[var9];
                var8[var9] = var10.field1939 * var10.field1935;
            }
            class244.method1712(76, class141.field2080, var8);
        }
        field1164++;
        return arg0 <= 50 ? (class129[]) null : class141.field2080;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V", line = 133)
    public static final void method529(boolean arg0, boolean arg1) {
        field1161++;
        if (class115.field1713 == null) {
            return;
        }
        try {
            class221 var2 = new class221(4);
            var2.method1542(-91, arg1 ? 2 : 3);
            var2.method1496(0, 79);
            if (arg0) {
                field1173 = (byte[][]) ((byte[][]) null);
            }
            class115.field1713.method1185(-22036, 4, var2.field3617, 0);
        } catch (IOException var6) {
            try {
                class115.field1713.method1184(arg0);
            } catch (Exception var5) {
            }
            class115.field1713 = null;
            class242.field4038++;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    public abstract void method525(int arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
    public abstract void method527(int arg0, int arg1, int arg2);
}
