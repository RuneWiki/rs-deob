import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class74 extends class129 {

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field1219 = 0;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field1222 = -1;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1228 = "Loading title screen - ";

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Z")
    public static boolean field1215;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public abstract void method447(int arg0, int arg1);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIB)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1217++;
        if (arg4 != 49) {
            method454(-97);
        }
        int var6 = this.field1227 << 3;
        int var7 = this.field1230 << 3;
        int var8 = (arg2 << 4) + (var7 & 0xF);
        int var9 = (arg3 << 4) + (var6 & 0xF);
        this.method449(var7, var6, var8, var9, arg0, arg1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)V")
    public abstract void method450(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public static final void method451(byte arg0) {
        if (arg0 != -92) {
            field1222 = 9;
        }
        field1220++;
        for (class103 var1 = (class103) class49.field849.method379(arg0 ^ 0xFFFFE76F); var1 != null; var1 = (class103) class49.field849.method378(-116)) {
            if (var1.field1804 == -1) {
                var1.field1808 = 0;
                class66.method411(-101, var1);
            } else {
                var1.method547(10026);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V")
    public abstract void method452(int arg0, int arg1);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public abstract void method453(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static void method454(int arg0) {
        field1228 = null;
        int var1 = 113 / ((arg0 + 8) / 32);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIII)V")
    public abstract void method455(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/lang/StringBuffer;IC)Ljava/lang/StringBuffer;")
    public static final StringBuffer method456(int arg0, StringBuffer arg1, int arg2, char arg3) {
        field1224++;
        int var4 = arg1.length();
        arg1.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg1.setCharAt(var5, arg3);
        }
        if (arg0 != 0) {
            method456(27, (StringBuffer) null, -65, 'P');
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V")
    public abstract void method457(int arg0, int arg1);

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public static final void method458(int arg0) {
        if (arg0 != -585803421) {
            field1228 = null;
        }
        class123.field2176.method58(0);
        class272.field4362.method58(0);
        field1223++;
    }
}
