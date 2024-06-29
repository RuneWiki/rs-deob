import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class540 {

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    private int field7151;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[C")
    public static char[] field7158 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Lhda;")
    public static class752 field7154 = new class752(74, 6);

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Z")
    public static boolean field7159 = false;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "[I")
    public static int[] field7160;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method3009(int arg0) {
        field7160 = null;
        if (arg0 == 8218) {
            field7154 = null;
            field7158 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method3010(int arg0, int[] arg1) {
        field7156++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class569.field7491;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class141 var5 = class21.field391.method1776(35, arg1[var4]);
            if (var5.field2254 != -1) {
                class133 var6 = (class133) class635.field8452.method552(arg0 - 22, (long) var5.field2254);
                if (var6 == null) {
                    class720 var7 = class720.method4034(class84.field1023, var5.field2254, 0);
                    if (var7 != null) {
                        var6 = class341.field4807.method415(var7, true);
                        class635.field8452.method556((byte) 0, (long) var5.field2254, var6);
                    }
                }
                if (var6 != null) {
                    class657.field8682[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (arg0 != 26) {
            field7154 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Lft;")
    public static final class3 method3011(int arg0) {
        field7150++;
        if (arg0 != 352) {
            field7153 = -99;
        }
        return class566.field7445;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lrda;I)V")
    public class540(class663 arg0, int arg1) {
        this.field7151 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
    public final void method3012(int arg0, int arg1) {
        field7155++;
        OpenGL.glNewList(this.field7151 + arg1, 4864);
        if (arg0 > -84) {
            method3011(82);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BC)V")
    public final void method3013(byte arg0, char arg1) {
        OpenGL.glCallList(this.field7151 + arg1);
        field7152++;
        if (arg0 <= 40) {
            method3014(-44, 123, -127);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
    public static final void method3014(int arg0, int arg1, int arg2) {
        field7149++;
        int var3 = class105.field1446.method3001(arg1 - 5967, class517.field6864.method2877(class713.field9854, (byte) -108));
        int var5;
        if (class163.field2471) {
            for (class236 var7 = (class236) class592.field7703.method4051(896); var7 != null; var7 = (class236) class592.field7703.method4049(true)) {
                int var10;
                if (var7.field3323 == 1) {
                    var10 = class110.method810(-82, (class433) var7.field3322.field10032.field5748);
                } else {
                    var10 = class583.method3187(-28046, var7);
                }
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            var5 = class172.field2634 * 16 + 21;
            class141.field2261 = class172.field2634 * 16 + (class743.field10329 ? 26 : 22);
            var3 += 8;
        } else {
            for (class433 var4 = (class433) class446.field6126.method21(2); var4 != null; var4 = (class433) class446.field6126.method9(arg1 ^ 0xFFFFE8CE)) {
                int var6 = class110.method810(-74, var4);
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            class141.field2261 = (class743.field10329 ? 26 : 22) + class181.field2730 * 16;
            var5 = class181.field2730 * 16 + 21;
            var3 += 8;
        }
        int var8 = arg0 - var3 / 2;
        if ((var3 + var8) > class228.field3251) {
            var8 = class228.field3251 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        if (arg2 + var5 > class199.field2993) {
            var9 = class199.field2993 - var5;
        }
        if (arg1 != 5966) {
            return;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class477.field6534 = var8;
        class403.field5625 = true;
        class733.field10151 = var9;
        class575.field7554 = var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
    public final void method3015(byte arg0) {
        OpenGL.glEndList();
        if (arg0 == 26) {
            field7157++;
        }
    }
}
