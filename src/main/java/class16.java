import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class16 extends class51 {

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "Z")
    private boolean field331 = true;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    private int field335 = 4096;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "Lea;")
    public static class38 field332 = class9.method46((byte) 108, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lea;")
    public static class38 field337 = class9.method46((byte) 125, "Welt");

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "Lea;")
    public static class38 field334 = class9.method46((byte) 113, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bf", name = "lb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "Lob;")
    public static class127 field336;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    public static final void method92(byte arg0) {
        if (arg0 != 43) {
            method92((byte) -46);
        }
        client.field542.method1083(3056);
        ++field330;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class16() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        if (arg0 <= 111) {
            field332 = null;
        }
        ++field338;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int[] var4 = this.method376(arg1 - 1 & class144.field3018, 0, -127);
            int[] var5 = this.method376(arg1, 0, -80);
            int[] var6 = this.method376(class144.field3018 & arg1 + 1, 0, -110);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; ~class86.field2008 < ~var10; ++var10) {
                int var11 = (var5[class39.field850 & var10 + 1] + -var5[class39.field850 & var10 + -1]) * this.field335;
                int var12 = (var6[var10] + -var4[var10]) * this.field335;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((var15 + 4096 + var16) / 4096)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var20 = 16777216 / var17;
                    var19 = var12 / var17;
                }
                if (this.field331) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var9[var10] = var19;
                var8[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method51((class66) null, -61, true);
        }
        ++field329;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field331 = arg0.method509(121) == 1;
            }
        } else {
            this.field335 = arg0.method511(64);
        }
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)V")
    public static void method93(int arg0) {
        field337 = null;
        int var1 = -61 % ((arg0 - -62) / 56);
        field336 = null;
        field334 = null;
        field332 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method94(int arg0, byte arg1, int arg2) {
        ++field340;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (~arg0 <= -6 && arg0 <= 8) {
            arg0 = 4;
        }
        class106 var3 = class70.method553(arg2, 28067);
        if (arg1 != 1) {
            method93(-16);
        }
        return var3.method861(arg0, -13979);
    }
}
