import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class67 extends class215 {

    @OriginalMember(owner = "client!me", name = "X", descriptor = "Z")
    private boolean field853 = true;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    private int field854 = 4096;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "F")
    public static float field847 = 0.0F;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    public static int field855 = 0;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "Leh;")
    public static class137 field852;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "Lga;")
    public static class155 field848;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "[[[I")
    public static int[][][] field843;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public static void method385(boolean arg0) {
        field852 = null;
        field843 = null;
        field848 = null;
        if (!arg0) {
            method386(false, (Component) null);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        int[][] var3 = super.field3461.method1126(arg0 + 2, arg1);
        ++field844;
        if (arg0 != -1) {
            field855 = 74;
        }
        if (super.field3461.field2591) {
            int[] var4 = this.method1503(-1, 0, arg1 + -1 & class83.field1026);
            int[] var5 = this.method1503(-1, 0, arg1);
            int[] var6 = this.method1503(-1, 0, arg1 - -1 & class83.field1026);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; class244.field4015 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field854;
                int var12 = (var5[class118.field1673 & var10 + 1] + -var5[var10 + -1 & class118.field1673]) * this.field854;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var18 = 16777216 / var17;
                    var20 = var12 / var17;
                }
                if (this.field853) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var10] = var20;
                var7[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class67() {
        super(1, false);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field845;
        if (arg0 != 1521146348) {
            this.method45(-82, 16, (class96) null);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field853 = arg2.method584(255) == 1;
            }
        } else {
            this.field854 = arg2.method549(arg0 + -1521146093);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method386(boolean arg0, Component arg1) {
        if (arg0) {
            ++field846;
            Method var2 = class48.field619;
            if (var2 != null) {
                try {
                    var2.invoke(arg1, Boolean.FALSE);
                } catch (Throwable var3) {
                }
            }
            arg1.addKeyListener(class118.field1671);
            arg1.addFocusListener(class118.field1671);
        }
    }
}
