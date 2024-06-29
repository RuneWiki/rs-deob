import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class151 extends class297 {

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "F")
    public static float field2191;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "Lje;")
    public static class158 field2201;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Lpk;")
    public static class74 field2189;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lec;")
    public static class91 field2183;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "[I")
    public int[] field2186;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "[I")
    public int[] field2196;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "[I")
    public int[] field2197;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "[Loi;")
    public class32[] field2185;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "[Loi;")
    public class32[] field2202;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "[[[B")
    public byte[][][] field2188;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[I[Ljava/lang/Object;I)V", line = 19)
    public static final void method948(int arg0, int arg1, int[] arg2, Object[] arg3, int arg4) {
        if (arg4 != 1) {
            return;
        }
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var6;
            int var7 = arg0;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (((var9 & 0x1) + var6) > arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7++] = var11;
                }
            }
            arg2[arg1] = arg2[var7];
            arg2[var7] = var6;
            arg3[arg1] = arg3[var7];
            arg3[var7] = var8;
            method948(arg0, var7 - 1, arg2, arg3, arg4);
            method948(var7 + 1, arg1, arg2, arg3, 1);
        }
        field2199++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lni;I)V", line = 75)
    public static final void method949(class202 arg0, int arg1) {
        class181.field2767 = arg0;
        if (arg1 != 1) {
            field2187 = -59;
        }
        field2200++;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 86)
    public static final void method950(int arg0) {
        if (arg0 != 0) {
            return;
        }
        for (class174 var1 = (class174) class81.field1253.method1379(true); var1 != null; var1 = (class174) class81.field1253.method1380((byte) 66)) {
            int var2 = var1.field2660;
            if (class186.method1226(var2, 0)) {
                boolean var3 = true;
                class253[] var4 = class256.field4376[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4265;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field5004;
                    class253 var7 = class172.method1140(var6, -115);
                    if (var7 != null) {
                        class29.method205(var7, (byte) 122);
                    }
                }
            }
        }
        field2193++;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)Z", line = 141)
    public static final boolean method951(int arg0, int arg1, int arg2) {
        field2190++;
        if (arg0 != 1) {
            field2189 = (class74) null;
        }
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 159)
    public static void method952(int arg0) {
        field2201 = null;
        field2183 = null;
        if (arg0 != -1) {
            field2187 = -28;
        }
        field2189 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lni;Luh;ILni;)V", line = 189)
    public static final void method953(class202 arg0, class63 arg1, int arg2, class202 arg3) {
        class196.field3125 = arg1;
        class185.field2865 = arg3;
        class174.field2662 = arg0;
        if (arg2 != 10609) {
            method953((class202) null, (class63) null, -73, (class202) null);
        }
        field2192++;
    }
}
