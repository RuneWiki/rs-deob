import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class96 {

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
    public static int[] field1192 = new int[13];

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Lbn;")
    public static class160 field1196 = new class160(4, 7);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "B")
    public static byte field1180;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public int field1203;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field1204;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([JI[Ljava/lang/Object;II)V")
    public static final void method640(long[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
        if (arg1 != 4) {
            method642(-66, 36, -109, 118);
        }
        field1193++;
        if (arg4 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg4];
        arg0[arg4] = var7;
        Object var9 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var9;
        for (int var10 = arg3; var10 < arg4; var10++) {
            if (((long) (var10 & 0x1) + var7) > arg0[var10]) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                Object var13 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var13;
            }
        }
        arg0[arg4] = arg0[var6];
        arg0[var6] = var7;
        arg2[arg4] = arg2[var6];
        arg2[var6] = var9;
        method640(arg0, arg1, arg2, arg3, var6 - 1);
        method640(arg0, 4, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method641(int arg0) {
        field1196 = null;
        int var1 = 12 % ((arg0 - 1) / 51);
        field1192 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method642(int arg0, int arg1, int arg2, int arg3) {
        field1197++;
        class438 var4 = (class438) class319.method2098(arg1, arg2, arg0);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class51.method396(arg3 ^ 0xFFFFFFFE, var4);
        }
        class438 var6 = (class438) class188.method1287(arg1, arg2, arg0, field1204 == null ? (field1204 = method644("jb")) : field1204);
        if (var6 != null) {
            var5 &= class51.method396(-1, var6);
        }
        class438 var7 = (class438) class137.method913(arg1, arg2, arg0);
        if (arg3 != 1) {
            method641(115);
        }
        if (var7 != null) {
            var5 &= class51.method396(arg3 ^ 0xFFFFFFFE, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method643(byte[] arg0, boolean arg1) {
        field1187++;
        if (arg1) {
            field1196 = null;
        }
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class224.method1539(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method644(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
