import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class18 extends class96 {

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[I")
    public static int[] field244 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Ljava/lang/String;")
    public static String field250 = "Use";

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Lec;")
    public static class25 field254 = new class25(64);

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lfa;")
    public static class273 field247;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Lfa;")
    public static class273 field252;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Lh;")
    public static class294 field253;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Lvd;")
    public static class4 field248;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[I")
    public static int[] field245;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
    public static final void method110(int arg0, int arg1) {
        int var2 = 17 / ((arg1 + 9) / 35);
        field243++;
        class36 var3 = class161.method1067(10, arg0, (byte) 81);
        var3.method220(119);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method111(int arg0) {
        field244 = null;
        field247 = null;
        field250 = null;
        field252 = null;
        field248 = null;
        field245 = null;
        field253 = null;
        if (arg0 != 0) {
            method110(64, -126);
        }
        field254 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lfa;IBLfa;I)Lde;")
    public static final class116 method112(class273 arg0, int arg1, byte arg2, class273 arg3, int arg4) {
        field246++;
        int var5 = 16 / ((25 - arg2) / 44);
        return class163.method1081(0, arg3, arg4, arg1) ? class237.method1642((byte) 101, arg0.method1877(arg4, arg1, (byte) 34)) : null;
    }
}
