import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class58 extends class139 {

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
    private int field1175 = 4096;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
    private int field1173 = 0;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "Lfc;")
    public static class54 field1167 = new class54(50);

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "Lrf;")
    public static class163 field1168 = class53.method392(56, "<col=ffff00>");

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "Lrf;")
    public static class163 field1170 = class53.method392(46, "b12_full");

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!fg", name = "gb", descriptor = "[I")
    public static int[] field1176 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
    public static volatile int field1169 = -1;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!fg", name = "ib", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!fg", name = "jb", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!fg", name = "hb", descriptor = "Lrh;")
    public static class165 field1177;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "[I")
    public static int[] field1174;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "[Lrh;")
    public static class165[] field1172;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public static void method421(int arg0) {
        field1167 = null;
        field1176 = null;
        field1177 = null;
        field1172 = null;
        field1168 = null;
        if (arg0 != -25395) {
            field1177 = null;
        }
        field1170 = null;
        field1174 = null;
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(B)V")
    public static final void method422(byte arg0) {
        class154.field3202 = null;
        if (arg0 > -26) {
            method422((byte) 115);
        }
        class118.field2493 = null;
        ++field1165;
        class21.field362 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field1164;
        if (arg1 != 21) {
            field1172 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2872 = ~arg2.method344(255) == -2;
                }
            } else {
                this.field1175 = arg2.method390((byte) 98);
            }
        } else {
            this.field1173 = arg2.method390((byte) 116);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class58() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2859.method1319(arg1 ^ -7523, arg0);
        ++field1179;
        if (arg1 != 7451) {
            this.method64(22, -59, (class52) null);
        }
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0, 0, true);
            for (int var5 = 0; ~var5 > ~class23.field402; ++var5) {
                int var6 = var4[var5];
                if (~this.field1173 < ~var6) {
                    var3[var5] = this.field1173;
                } else if (this.field1175 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1175;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field1163;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (arg0 < 53) {
            return null;
        } else {
            if (super.field2866.field885) {
                int[][] var4 = this.method910((byte) -74, arg1, 0);
                int[] var5 = var3[0];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class23.field402; ++var11) {
                    int var12 = var6[var11];
                    int var13 = var8[var11];
                    int var14 = var7[var11];
                    if (~var12 > ~this.field1173) {
                        var5[var11] = this.field1173;
                    } else if (~var12 >= ~this.field1175) {
                        var5[var11] = var12;
                    } else {
                        var5[var11] = this.field1175;
                    }
                    if (this.field1173 > var13) {
                        var9[var11] = this.field1173;
                    } else if (this.field1175 >= var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field1175;
                    }
                    if (this.field1173 > var14) {
                        var10[var11] = this.field1173;
                    } else if (~var14 >= ~this.field1175) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field1175;
                    }
                }
            }
            return var3;
        }
    }
}
