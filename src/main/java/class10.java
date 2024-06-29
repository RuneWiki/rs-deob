import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class10 {

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "[I")
    public static int[] field134 = new int[5];

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lna;")
    public static class26 field135 = class69.method505("; version=1; path=)4; domain=", (byte) -117);

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
    public static int[] field128 = new int[50];

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lna;")
    public static class26 field136 = class69.method505("rect_debug=", (byte) -122);

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "[Lcl;")
    public static class132[] field131 = new class132[14];

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field140 = 0;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Lna;")
    public static class26 field142 = class69.method505("(U2", (byte) -118);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[B")
    public byte[] field123;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[B")
    public byte[] field137;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[Lqf;")
    public static class148[] field133;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[[[Lbj;")
    public static class55[][][] field124;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 4)
    public static void method64(byte arg0) {
        field134 = null;
        field124 = (class55[][][]) null;
        field142 = null;
        field136 = null;
        if (arg0 >= -126) {
            field142 = (class26) null;
        }
        field128 = null;
        field131 = null;
        field133 = null;
        field135 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)Z", line = 27)
    public static final boolean method65(int arg0, int arg1, int arg2, int arg3) {
        if (class321.method2239(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class144.method959(var4 + 1, class229.field3635[arg0][arg1][arg2] + arg3, var5 + 1) && class144.method959(var4 + 128 - 1, class229.field3635[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class144.method959(var4 + 128 - 1, class229.field3635[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class144.method959(var4 + 1, class229.field3635[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 49)
    public static final void method66(int arg0) {
        if (arg0 < 60) {
            field133 = (class148[]) null;
        }
        class252.field4132.method1987(3);
        field125++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILna;)V", line = 62)
    public static final void method67(int arg0, int arg1, class26 arg2) {
        class26 var3 = arg2.method210(-17).method176((byte) -50);
        field141++;
        boolean var4 = false;
        for (int var5 = arg1; var5 < class80.field1261; var5++) {
            class159 var6 = class268.field4427[class95.field1550[var5]];
            if (var6 != null && var6.field2495 != null && var6.field2495.method162(-110, var3)) {
                var4 = true;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var6.field3904[0], 1, 0, 2, var6.field3890[0], class13.field221.field3904[0]);
                if (arg0 == 1) {
                    class217.field3408++;
                    class114.field1789.method1431(0, 68);
                    class114.field1789.method604(class95.field1550[var5], (byte) 3);
                } else if (arg0 == 4) {
                    class22.field313++;
                    class114.field1789.method1431(0, 180);
                    class114.field1789.method604(class95.field1550[var5], (byte) 3);
                } else if (arg0 == 5) {
                    class114.field1789.method1431(0, 4);
                    class114.field1789.method635(arg1 - 1, class95.field1550[var5]);
                    class285.field4790++;
                } else if (arg0 == 6) {
                    class114.field1789.method1431(0, 133);
                    class114.field1789.method635(-1, class95.field1550[var5]);
                    class146.field2263++;
                } else if (arg0 == 7) {
                    class318.field5442++;
                    class114.field1789.method1431(arg1, 114);
                    class114.field1789.method604(class95.field1550[var5], (byte) 3);
                }
                break;
            }
        }
        if (!var4) {
            class214.method1420(class2.field18, 0, class236.method1587(new class26[] { class215.field3347, var3 }, (byte) -77), -1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Lok;", line = 135)
    public static final class150 method68(byte arg0) {
        field130++;
        class150 var1;
        if (class255.field4184) {
            var1 = new class16(class88.field1445, class37.field607, class58.field936[0], class82.field1281[0], class141.field2149[0], class98.field1596[0], class205.field3203[0], class190.field2975);
        } else {
            var1 = new class183(class88.field1445, class37.field607, class58.field936[0], class82.field1281[0], class141.field2149[0], class98.field1596[0], class205.field3203[0], class190.field2975);
        }
        if (arg0 != -40) {
            method66(83);
        }
        class160.method1088((byte) 116);
        return var1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 164)
    public static final void method69(int arg0, int arg1) {
        class126.field1952.method1985(arg0 + 919, arg1);
        if (arg0 == -1045) {
            class194.field3016.method1985(arg0 ^ 0x46A, arg1);
            field143++;
        }
    }
}
