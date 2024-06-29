import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class272 {

    @OriginalMember(owner = "client!we", name = "W", descriptor = "Ljava/lang/String;")
    public static String field185 = "glow1:";

    @OriginalMember(owner = "client!we", name = "U", descriptor = "Lrf;")
    public static class289 field183 = null;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "Lll;")
    public class211 field184;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "[B")
    public byte[] field182;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static void method110(int arg0) {
        field183 = null;
        if (arg0 != 0) {
            method114((class294) null, -39, false, (class294) null, false);
        }
        field185 = null;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(B)[B")
    public final byte[] method111(byte arg0) {
        ++field180;
        if (arg0 < 70) {
            method113(true, 62, 123, 110, -77, false, 105);
        }
        if (super.field4091) {
            throw new RuntimeException();
        } else {
            return this.field182;
        }
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)I")
    public final int method112(int arg0) {
        ++field179;
        if (arg0 != -1) {
            this.method112(-68);
        }
        return super.field4091 ? 0 : 100;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIIIZI)V")
    public static final void method113(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field187;
        if (arg3 == 3) {
            method113(true, 127, arg2, class132.field1937, -1, true, -1);
        } else {
            Container var7;
            if (class244.field3657 == null) {
                if (class210.field3152 == null) {
                    var7 = class209.field3147.field150;
                } else {
                    var7 = class210.field3152;
                }
            } else {
                var7 = class244.field3657;
            }
            class107.field1676 = var7.getSize().width;
            class26.field321 = var7.getSize().height;
            if (class210.field3152 == var7) {
                Insets var8 = class210.field3152.getInsets();
                class107.field1676 -= var8.right + var8.left;
                class26.field321 -= var8.top + var8.bottom;
            }
            if (arg3 < 2) {
                class77.field1245 = 765;
                class272.field4090 = (class107.field1676 + -765) / 2;
                class180.field2748 = 503;
                class214.field3191 = 0;
            } else {
                class214.field3191 = 0;
                class272.field4090 = 0;
                class180.field2748 = class26.field321;
                class77.field1245 = class107.field1676;
            }
            if (!arg5) {
                class47.field762.setSize(class77.field1245, class180.field2748);
                if (class210.field3152 == var7) {
                    Insets var9 = class210.field3152.getInsets();
                    class47.field762.setLocation(class272.field4090 + var9.left, class214.field3191 + var9.top);
                } else {
                    class47.field762.setLocation(class272.field4090, class214.field3191);
                }
            } else {
                class292.method1933(class47.field762, false);
                class209.method1345(116, class47.field762);
                if (class184.field2796 != null) {
                    class184.field2796.method44((byte) 106, class47.field762);
                }
                class152.field2200.method1177(-7518);
                class133.method818(-30864, class47.field762);
                class2.method10(class47.field762, -1);
                if (class184.field2796 != null) {
                    class184.field2796.method42(class47.field762, 30153);
                }
            }
            if (arg3 > 0) {
                method113(true, -67, arg2, 0, -1, true, -1);
            } else {
                class236.field3557 = !class266.method1772(-117);
                if (~class136.field1987 != 0) {
                    class282.method1859((byte) -56, true);
                }
                if (class44.field706 != null && (~class184.field2794 == -31 || class184.field2794 == 25)) {
                    class24.method150(false);
                }
                for (int var10 = 0; ~var10 > -101; ++var10) {
                    class7.field105[var10] = true;
                }
                int var11 = -97 % ((68 - arg1) / 46);
                class211.field3174 = true;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lpf;IZLpf;Z)Leb;")
    public static final class247 method114(class294 arg0, int arg1, boolean arg2, class294 arg3, boolean arg4) {
        ++field181;
        boolean var5 = arg2;
        int[] var6 = arg0.method1946(0, arg1);
        for (int var7 = 0; ~var7 > ~var6.length; ++var7) {
            byte[] var8 = arg0.method1974(arg1, true, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 255 | (255 & var8[0]) << 8;
                byte[] var10;
                if (!arg4) {
                    var10 = arg3.method1974(var9, true, 0);
                } else {
                    var10 = arg3.method1974(0, true, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class247(arg0, arg3, arg1, arg4);
            } catch (Exception var11) {
                return null;
            }
        }
    }
}
