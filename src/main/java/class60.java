import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class60 {

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "B")
    private byte field1232;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lrf;")
    public static class163 field1229 = class53.method392(-63, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Lrf;")
    public static class163 field1234 = class53.method392(-76, ":chalreq:");

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[[I")
    public static int[][] field1221;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method428(byte arg0) {
        field1234 = null;
        if (arg0 > 55) {
            field1229 = null;
            field1221 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
    public final int method429(int arg0) {
        field1228++;
        if (arg0 != -8) {
            field1221 = null;
        }
        return this.field1232 & 0x7;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
    public static final void method430(boolean arg0, int arg1) {
        class138.field2849 = 1000 / arg1;
        field1235++;
        if (arg0) {
            method430(true, 52);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
    public final int method431(byte arg0) {
        field1224++;
        int var2 = -126 / ((7 - arg0) / 53);
        return (this.field1232 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lee;IIIIII)V")
    public static final void method432(class46 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field910.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field910[var8] - class154.field3198;
            int var22 = arg0.field903[var8] - class208.field4046;
            int var23 = arg0.field922[var8] - class116.field2466;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field904 != null) {
                class46.field911[var8] = var24;
                class46.field912[var8] = var27;
                class46.field919[var8] = var28;
            }
            class46.field913[var8] = (var24 << 9) / var28 + class1.field7;
            class46.field918[var8] = (var27 << 9) / var28 + class1.field9;
        }
        class1.field10 = 0;
        int var9 = arg0.field920.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field920[var10];
            int var12 = arg0.field908[var10];
            int var13 = arg0.field907[var10];
            int var14 = class46.field913[var11];
            int var15 = class46.field913[var12];
            int var16 = class46.field913[var13];
            int var17 = class46.field918[var11];
            int var18 = class46.field918[var12];
            int var19 = class46.field918[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class101.field2116 && class92.method649(class113.field2393, class194.field3821, var17, var18, var19, var14, var15, var16)) {
                    class97.field2056 = arg5;
                    class92.field2009 = arg6;
                }
                class1.field18 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class1.field2 || var15 > class1.field2 || var16 > class1.field2) {
                    class1.field18 = true;
                }
                if (arg0.field904 == null || arg0.field904[var10] == -1) {
                    if (arg0.field921[var10] != 12345678) {
                        class1.method5(var17, var18, var19, var14, var15, var16, arg0.field921[var10], arg0.field914[var10], arg0.field923[var10]);
                    }
                } else if (class184.field3687) {
                    int var20 = class1.field17.method1218(arg0.field904[var10], -124);
                    class1.method5(var17, var18, var19, var14, var15, var16, class139.method918(var20, arg0.field921[var10]), class139.method918(var20, arg0.field914[var10]), class139.method918(var20, arg0.field923[var10]));
                } else if (arg0.field909) {
                    class1.method17(var17, var18, var19, var14, var15, var16, arg0.field921[var10], arg0.field914[var10], arg0.field923[var10], class46.field911[0], class46.field911[1], class46.field911[3], class46.field912[0], class46.field912[1], class46.field912[3], class46.field919[0], class46.field919[1], class46.field919[3], arg0.field904[var10]);
                } else {
                    class1.method17(var17, var18, var19, var14, var15, var16, arg0.field921[var10], arg0.field914[var10], arg0.field923[var10], class46.field911[var11], class46.field911[var12], class46.field911[var13], class46.field912[var11], class46.field912[var12], class46.field912[var13], class46.field919[var11], class46.field919[var12], class46.field919[var13], arg0.field904[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public static final void method433(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2352 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class60() {
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lfa;)V")
    public class60(class52 arg0) {
        this.field1232 = arg0.method353(-118);
        this.field1231 = arg0.method390((byte) 123);
        this.field1225 = arg0.method383(124);
        this.field1226 = arg0.method383(31);
        this.field1230 = arg0.method383(56);
        this.field1223 = arg0.method383(110);
    }
}
