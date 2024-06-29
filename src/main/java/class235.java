import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class235 extends class137 {

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    private final int field4254;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    private final int field4241;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    private final int field4249;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    private final int field4253;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Ljd;")
    public static class86 field4245 = class122.method868("Benutzen", true);

    @OriginalMember(owner = "client!o", name = "G", descriptor = "[[B")
    public static byte[][] field4255 = new byte[1000][];

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
    public final void method471(int arg0, int arg1, int arg2) {
        ++field4244;
        int var4 = this.field4254 * arg0 >> 12;
        int var5 = this.field4253 * arg0 >> 12;
        int var6 = this.field4249 * arg2 >> 12;
        if (arg1 == 9) {
            int var7 = this.field4241 * arg2 >> 12;
            class190.method1306(var6, super.field2617, -1, var4, var7, var5);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)V")
    public static final void method1625(int arg0, int arg1) {
        class214.field3869.method693(6, arg1);
        ++field4246;
        class73.field1475.method693(6, arg1);
        class92.field1871.method693(arg0 ^ 16777209, arg1);
        if (arg0 != 16777215) {
            method1628((class6) null, -125, -24, 81, (class90) null, 7, -49);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V")
    public final void method468(int arg0, int arg1, int arg2) {
        ++field4243;
        int var4 = this.field4253 * arg0 >> 12;
        int var5 = this.field4254 * arg0 >> 12;
        int var6 = this.field4249 * arg2 >> 12;
        int var7 = this.field4241 * arg2 >> 12;
        if (arg1 != 500) {
            method1629((byte) -124);
        }
        class142.method1014(var5, super.field2617, 1, var6, var7, super.field2619, var4, super.field2613);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLqk;)Llc;")
    public static final class83 method1626(byte arg0, class200 arg1) {
        class83 var2 = new class83();
        if (arg0 < 95) {
            method1628((class6) null, -33, 74, -26, (class90) null, 84, -45);
        }
        ++field4252;
        var2.field1620 = arg1.method1410(-126);
        var2.field1626 = class177.method1244(var2.field1620, 1);
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1627(int arg0) {
        int var1 = -106 % ((arg0 - 58) / 36);
        field4245 = null;
        field4255 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB)V")
    public final void method467(int arg0, int arg1, byte arg2) {
        int var4 = -128 / ((arg2 - 77) / 46);
        ++field4251;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lwj;IIILod;II)V")
    public static final void method1628(class6 arg0, int arg1, int arg2, int arg3, class90 arg4, int arg5, int arg6) {
        ++field4256;
        if (arg4 != null) {
            int var7 = 2047 & class86.field1664 + class56.field1145;
            int var8 = 10 + Math.max(arg0.field163 / 2, arg0.field131 / 2);
            int var9 = arg2 * arg2 + arg6 * arg6;
            if (var8 * var8 >= var9) {
                int var10 = class145.field2746[var7];
                int var11 = var10 * 256 / (class76.field1515 + 256);
                int var12 = class145.field2742[var7];
                int var13 = var12 * 256 / (class76.field1515 - -256);
                int var14 = arg6 * var11 - -(arg2 * var13) >> 16;
                int var15 = arg6 * var13 - arg2 * var11 >> 16;
                ((class167) arg4).method1195(arg0.field163 / 2 + -(arg4.field1840 / 2) + var14 + arg5, -var15 - arg4.field1837 / 2 + arg0.field131 / 2 + arg1, arg0.field209, arg0.field200);
                if (arg3 != -182785264) {
                    field4245 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIII)V")
    public class235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4254 = arg0;
        this.field4241 = arg3;
        this.field4249 = arg1;
        this.field4253 = arg2;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public static final void method1629(byte arg0) {
        int var1 = 89 / ((arg0 - -68) / 48);
        class206.field3743.method702((byte) -88);
        ++field4248;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lk;B)V")
    public static final void method1630(class174 arg0, byte arg1) {
        ++field4242;
        arg0.field3179 = false;
        if (arg0.field3181 != null) {
            arg0.field3181.field4663 = 0;
        }
        for (class174 var2 = arg0.method283(); var2 != null; var2 = arg0.method276()) {
            method1630(var2, (byte) -82);
        }
        if (arg1 >= -27) {
            field4245 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lbj;IZ)Lei;")
    public static final class167 method1631(class151 arg0, int arg1, boolean arg2) {
        ++field4250;
        if (!class81.method570(14, arg0, arg1)) {
            return null;
        } else {
            if (arg2) {
                field4245 = null;
            }
            return class130.method916(128);
        }
    }
}
