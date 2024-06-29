import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class136 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2290 = 52;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    public static int[] field2293 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[[Z")
    public static boolean[][] field2294 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lvp;")
    public static class126 field2292;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 11)
    public static void method1030(int arg0) {
        field2293 = null;
        field2294 = null;
        field2292 = null;
        if (arg0 != -1) {
            field2293 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 25)
    public static final void method1031(int arg0, boolean arg1, String arg2) {
        field2291++;
        if (arg2 == null) {
            return;
        }
        if (class172.field2777 >= 100) {
            class475.method2843((byte) -98, class322.field4907.method1977(class146.field2452, arg0 + 86));
            return;
        }
        String var3 = class502.method3025(-13, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class172.field2777; var4++) {
            String var8 = class502.method3025(arg0 - 12, class395.field6015[var4]);
            if (var8 != null && var8.equals(var3)) {
                class475.method2843((byte) -98, arg2 + class428.field6409.method1977(class146.field2452, -49));
                return;
            }
            if (class143.field2380[var4] != null) {
                String var9 = class502.method3025(-13, class143.field2380[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class475.method2843((byte) -98, arg2 + class428.field6409.method1977(class146.field2452, -42));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class513.field7453; var5++) {
            String var6 = class502.method3025(-13, class330.field5008[var5]);
            if (var6 != null && var6.equals(var3)) {
                class475.method2843((byte) -98, class336.field5068.method1977(class146.field2452, arg0 ^ 0x63) + arg2 + class209.field3339.method1977(class146.field2452, -93));
                return;
            }
            if (class59.field1232[var5] != null) {
                String var7 = class502.method3025(-13, class59.field1232[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class475.method2843((byte) -98, class336.field5068.method1977(class146.field2452, 127) + arg2 + class209.field3339.method1977(class146.field2452, 127));
                    return;
                }
            }
        }
        if (class502.method3025(arg0 ^ 0xC, class15.field266.field5381).equals(var3)) {
            class475.method2843((byte) -98, class28.field458.method1977(class146.field2452, 117));
            return;
        }
        class94.field1856++;
        class459.method2765(class536.field7880, (byte) 87);
        class335.field5062.method1814(class362.method2220(arg2, (byte) -80) - arg0, true);
        class335.field5062.method1821(arg2, 84);
        class335.field5062.method1814(arg1 ? 1 : 0, true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIB)I", line = 118)
    public static final int method1032(int arg0, int arg1, byte arg2) {
        field2289++;
        int var3 = arg0 >> 31 & arg1 - 1;
        if (arg2 != 9) {
            field2290 = -52;
        }
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }
}
