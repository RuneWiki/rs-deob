import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class154 extends class287 {

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "I")
    private int field2120;

    @OriginalMember(owner = "client!nea", name = "B", descriptor = "Lfha;")
    public static class522 field2122 = new class522();

    @OriginalMember(owner = "client!nea", name = "t", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!nea", name = "u", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!nea", name = "v", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!nea", name = "w", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!nea", name = "x", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!nea", name = "y", descriptor = "[Lri;")
    public class342[] field2119;

    @OriginalMember(owner = "client!nea", name = "A", descriptor = "[[B")
    private byte[][] field2121;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
    public static final void method976(int arg0) {
        class4.method12(false, true);
        if (arg0 != 0) {
            method981(true);
        }
        field2118++;
        if (class42.field607 >= 0 && class42.field607 != 0) {
            class736.method4088((byte) 122, false, class42.field607);
            class42.field607 = -1;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)Z")
    public final boolean method977(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method980((byte) 64, 9);
        }
        field2114++;
        return this.field2119[arg0].field4375;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)Z")
    public final boolean method978(boolean arg0) {
        field2115++;
        if (this.field2119 != null) {
            return true;
        }
        if (this.field2121 == null) {
            class557 var2 = class295.field3840;
            synchronized (class295.field3840) {
                if (!class295.field3840.method3337(-89, this.field2120)) {
                    return false;
                }
                int[] var4 = class295.field3840.method3319(this.field2120, (byte) 122);
                this.field2121 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field2121[var5] = class295.field3840.method3322(this.field2120, var4[var5], (byte) 107);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field2121.length; var7++) {
            byte[] var8 = this.field2121[var7];
            class26 var9 = new class26(var8);
            var9.field330 = 1;
            int var10 = var9.method193(2);
            class557 var11 = class210.field2987;
            synchronized (class210.field2987) {
                var6 &= class210.field2987.method3340(0, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class522 var12 = new class522();
        class557 var13 = class295.field3840;
        int[] var16;
        synchronized (class295.field3840) {
            if (arg0) {
                return true;
            }
            int var15 = class295.field3840.method3333(this.field2120, 3443);
            this.field2119 = new class342[var15];
            var16 = class295.field3840.method3319(this.field2120, (byte) 1);
        }
        for (int var17 = 0; var17 < var16.length; var17++) {
            byte[] var18 = this.field2121[var17];
            class26 var19 = new class26(var18);
            var19.field330 = 1;
            int var20 = var19.method193(2);
            class41 var21 = null;
            for (class41 var22 = (class41) var12.method3118((byte) 73); var22 != null; var22 = (class41) var12.method3111(117)) {
                if (var22.field575 == var20) {
                    var21 = var22;
                    break;
                }
            }
            if (var21 == null) {
                class557 var23 = class210.field2987;
                synchronized (class210.field2987) {
                    var21 = new class41(var20, class210.field2987.method3318(8941, var20));
                }
                var12.method3116(29066, var21);
            }
            this.field2119[var16[var17]] = new class342(var18, var21);
        }
        this.field2121 = null;
        return true;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(II)Z")
    public final boolean method979(int arg0, int arg1) {
        if (arg1 <= 96) {
            return false;
        } else {
            field2123++;
            return this.field2119[arg0].field4372;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)Z")
    public final boolean method980(byte arg0, int arg1) {
        field2117++;
        if (arg0 != -49) {
            this.field2121 = null;
        }
        return this.field2119[arg1].field4369;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(Z)V")
    public static final void method981(boolean arg0) {
        field2116++;
        if (arg0) {
            class714.field10131 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(Z)V")
    public static void method982(boolean arg0) {
        if (arg0) {
            field2122 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(I)V")
    public class154(int arg0) {
        this.field2120 = arg0;
    }
}
