import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class97 {

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Z")
    public boolean field1089 = false;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Lkj;")
    public static class337 field1088 = new class337();

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "[I")
    public static int[] field1091 = new int[8];

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field1092 = 2;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "Lfi;")
    public static class331 field1094 = new class331(2);

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "Lra;")
    public static class57 field1093;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
    public static int method519(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBZLen;)Lkh;")
    public final class11 method520(int arg0, byte arg1, boolean arg2, class174 arg3) {
        field1090++;
        long var5 = (long) (arg0 << 16 | this.field1082 | (arg2 ? 262144 : 0) | arg3.field2424 << 19);
        int var7 = -94 % ((-arg1 - 74) / 42);
        class11 var8 = (class11) class72.field808.method2049(-123, var5);
        if (var8 != null) {
            return var8;
        } else if (class349.field5105.method345(1, this.field1082)) {
            class145 var9 = class145.method854(class349.field5105, this.field1082, 0);
            if (var9 != null) {
                var9.field2039 = var9.field2041 = var9.field2040 = var9.field2046 = 0;
                if (arg2) {
                    var9.method866();
                }
                for (int var10 = 0; var10 < arg0; var10++) {
                    var9.method852();
                }
            }
            class11 var11 = arg3.method955(var9, true);
            if (var11 != null) {
                class72.field808.method2046(var5, 0, var11);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method521(int arg0, int arg1, String arg2) {
        if (arg0 != 2) {
            field1091 = null;
        }
        field1084++;
        return class30.method173(true, false, arg2, arg1);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method522(String arg0, byte arg1) {
        field1081++;
        int var2 = arg0.length();
        if (arg1 != -81) {
            field1091 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lbk;II)V")
    public final void method523(class211 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method1342((byte) -128);
            if (var4 == 0) {
                field1079++;
                return;
            }
            this.method524(var4, -29, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIILbk;)V")
    private final void method524(int arg0, int arg1, int arg2, class211 arg3) {
        int var5 = -59 / ((arg1 - 20) / 43);
        field1087++;
        if (arg0 == 1) {
            this.field1082 = arg3.method1355(32136);
        } else if (arg0 == 2) {
            this.field1085 = arg3.method1353(97);
        } else if (arg0 == 3) {
            this.field1089 = true;
        } else if (arg0 == 4) {
            this.field1082 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
    public final boolean method525(int arg0) {
        if (arg0 != 0) {
            this.method520(-7, (byte) 4, false, (class174) null);
        }
        field1080++;
        return class349.field5105.method345(1, this.field1082);
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public static void method526(int arg0) {
        int var1 = 109 / ((10 - arg0) / 54);
        field1091 = null;
        field1088 = null;
        field1094 = null;
        field1093 = null;
    }
}
