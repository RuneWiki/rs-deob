import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class222 {

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "S")
    public short field2988;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "S")
    public short field2996;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "S")
    public short field2992;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "B")
    public byte field2997;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "Z")
    public boolean field2999;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "B")
    public byte field2987;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "[I")
    public static int[] field2990 = new int[5];

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2989 = new String[100];

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public static int field3001 = 0;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)I", line = 3)
    public static final int method1396(int arg0, int arg1, int arg2) {
        field2991++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return arg1 == -4465 ? var3 : 92;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZIZ)Lvo;", line = 23)
    public static final class32 method1397(boolean arg0, int arg1, boolean arg2) {
        field3002++;
        if (arg2) {
            field3001 = -72;
        }
        long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
        return (class32) class306.field4038.method182(var3, (byte) 82);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 51)
    public static void method1398(int arg0) {
        if (arg0 >= 27) {
            field2989 = null;
            field2990 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 71)
    public static final void method1399(String arg0, byte arg1) {
        field2986++;
        if (arg0 == null) {
            return;
        }
        if (!(class267.field3528 < 100 || class412.field5681) || class267.field3528 >= 200) {
            class414.method2404(class14.field273.method1764(class489.field6789, false), -48);
            return;
        }
        String var2 = class264.method1587(arg0, -18488);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class267.field3528; var3++) {
            String var7 = class264.method1587(class471.field6485[var3], -18488);
            if (var7 != null && var7.equals(var2)) {
                class414.method2404(arg0 + class1.field88.method1764(class489.field6789, false), -104);
                return;
            }
            if (class71.field1076[var3] != null) {
                String var8 = class264.method1587(class71.field1076[var3], -18488);
                if (var8 != null && var8.equals(var2)) {
                    class414.method2404(arg0 + class1.field88.method1764(class489.field6789, false), -68);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class114.field1621; var4++) {
            String var5 = class264.method1587(class227.field3064[var4], -18488);
            if (var5 != null && var5.equals(var2)) {
                class414.method2404(class379.field5179.method1764(class489.field6789, false) + arg0 + class441.field6045.method1764(class489.field6789, false), -92);
                return;
            }
            if (class184.field2622[var4] != null) {
                String var6 = class264.method1587(class184.field2622[var4], -18488);
                if (var6 != null && var6.equals(var2)) {
                    class414.method2404(class379.field5179.method1764(class489.field6789, false) + arg0 + class441.field6045.method1764(class489.field6789, false), -63);
                    return;
                }
            }
        }
        if (class264.method1587(class385.field5232.field7638, -18488).equals(var2)) {
            class414.method2404(class306.field4037.method1764(class489.field6789, false), -71);
            return;
        }
        class118.method822(-106, class249.field3298);
        class44.field648++;
        class193.field2708.method2200(7, class125.method912(arg0, 1));
        if (arg1 >= -30) {
            field2990 = null;
        }
        class193.field2708.method2216(arg0, -122);
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 162)
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2988 = (short) arg4;
        this.field2996 = (short) arg6;
        this.field2985 = arg2;
        this.field2995 = arg3;
        this.field2992 = (short) arg5;
        this.field2997 = (byte) arg7;
        this.field2999 = arg10;
        this.field2987 = (byte) arg8;
        this.field2998 = arg1;
        this.field2993 = arg11;
        this.field3000 = arg0;
    }
}
