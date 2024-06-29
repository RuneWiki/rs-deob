import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class264 {

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    private int field195 = -1;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "[B")
    public static byte[] field191 = new byte[520];

    @OriginalMember(owner = "client!we", name = "T", descriptor = "Lcf;")
    public static class93 field197 = class147.method1066("_", -48);

    @OriginalMember(owner = "client!we", name = "db", descriptor = "Lcf;")
    private static class93 field207 = class147.method1066("You can(Wt add yourself to your own friend list)3", -48);

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "Lcf;")
    public static class93 field204 = field207;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "Lcf;")
    public static class93 field209 = class147.method1066("<col=ff3000>", -48);

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
    private int[] field193;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "[[Z")
    public static boolean[][] field200;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/awt/Component;ZI)Ljc;")
    public static final class238 method66(int arg0, Component arg1, boolean arg2, int arg3) {
        if (arg2) {
            field207 = null;
        }
        ++field206;
        try {
            Class var4 = Class.forName("mf");
            class238 var5 = (class238) var4.newInstance();
            var5.method44(arg3, arg1, 0, arg0);
            return var5;
        } catch (Throwable var7) {
            class156 var6 = new class156();
            var6.method44(arg3, arg1, 0, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    public final void method67(byte arg0) {
        ++field192;
        super.method67((byte) 60);
        if (arg0 <= 42) {
            method71(-121);
        }
        this.field193 = null;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)I")
    public static final int method68(int arg0) {
        ++field189;
        class203.field3666 = arg0;
        return class39.method227(false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZILhg;III)V")
    public static final void method69(boolean arg0, int arg1, class177 arg2, int arg3, int arg4, int arg5) {
        ++field187;
        if (arg5 != -933796316) {
            method74(48);
        }
        class16.field227 = arg4;
        class110.field1882 = arg1;
        class72.field1298 = arg3;
        class41.field628 = 10000;
        class119.field2123 = arg0;
        class66.field1213 = arg2;
        class120.field2138 = 1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            method66(23, (Component) null, false, 2);
        }
        ++field196;
        int[][] var3 = super.field4705.method1089(arg0, 101);
        if (super.field4705.field2670 && this.method75((byte) 71)) {
            int var4 = this.field208 * (~class67.field1231 == ~this.field202 ? arg0 : this.field202 * arg0 / class67.field1231);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            if (~class176.field3060 == ~this.field208) {
                for (int var8 = 0; ~var8 > ~class176.field3060; ++var8) {
                    int var9 = this.field193[var4++];
                    var6[var8] = class58.method333(var9, 255) << 4;
                    var5[var8] = class58.method333(4080, var9 >> 4);
                    var7[var8] = class58.method333(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class176.field3060; ++var10) {
                    int var11 = this.field208 * var10 / class176.field3060;
                    int var12 = this.field193[var4 - -var11];
                    var6[var10] = class58.method333(255, var12) << 4;
                    var5[var10] = class58.method333(var12, 65280) >> 4;
                    var7[var10] = class58.method333(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IB)V")
    public static final void method70(int arg0, byte arg1) {
        ++field199;
        class212 var2 = class123.method905(-1205364448, 4, arg0);
        if (arg1 < -14) {
            var2.method1502(255);
        }
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
    public static final void method71(int arg0) {
        ++field198;
        for (int var1 = arg0; ~var1 > -6; ++var1) {
            class243.field4383[var1] = false;
        }
        class154.field2703 = 0;
        class97.field1737 = -1;
        class18.field234 = 1;
        class267.field4759 = -1;
        class258.field4652 = 0;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)I")
    public final int method72(int arg0) {
        ++field203;
        if (arg0 != -1) {
            method74(58);
        }
        return this.field195;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class15() {
        super(0, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg1 == 0) {
            this.field195 = arg2.method1891(-124);
        }
        ++field194;
        if (arg0 < 11) {
            this.field193 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lcf;")
    public static final class93 method73(byte arg0, int arg1) {
        ++field205;
        if (arg1 < 999999999) {
            return class148.method1067(-7015, arg1);
        } else {
            return arg0 != -108 ? null : class39.field608;
        }
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
    public static void method74(int arg0) {
        field209 = null;
        field200 = null;
        field204 = null;
        field207 = null;
        if (arg0 != -1) {
            field191 = null;
        }
        field191 = null;
        field197 = null;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)Z")
    private final boolean method75(byte arg0) {
        if (arg0 != 71) {
            return false;
        } else {
            ++field201;
            if (this.field193 != null) {
                return true;
            } else if (~this.field195 <= -1) {
                int var2 = class176.field3060;
                int var3 = class67.field1231;
                int var4 = class125.field2220.method1412(this.field195, (byte) 51) ? 64 : 128;
                this.field193 = class125.field2220.method1413(this.field195, 118);
                this.field202 = var4;
                this.field208 = var4;
                class121.method902(var2, (byte) -119, var3);
                return this.field193 != null;
            } else {
                return false;
            }
        }
    }
}
