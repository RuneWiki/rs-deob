import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class119 extends class261 {

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    private int field1988 = 3216;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    private int field1991 = 3216;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    private int field1995 = 4096;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "[I")
    private int[] field1987 = new int[3];

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "S")
    public static short field1986 = 1;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "[Lve;")
    public static class255[] field1997 = new class255[100];

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "Lve;")
    public static class255 field1990 = class87.method607(89, "<col=00ff80>");

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V", line = 7)
    public static final void method886() {
        GL var0 = class281.field4839;
        var0.glDisableClientState(32886);
        class281.method1986(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class281.method1958();
        for (int var1 = 0; var1 < class34.field555[0].length; var1++) {
            class142 var2 = class34.field555[0][var1];
            if (var2.field2346 >= 0 && class283.field4866.method979(186, var2.field2346) == 4) {
                var0.glColor4fv(class292.method2067(false, var2.field2367), 0);
                float var3 = 201.5F - (var2.field2371 ? 1.0F : 0.5F);
                var2.method1060(class118.field1984, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class281.method1966();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class281.method1957();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)[I", line = 48)
    public final int[] method21(byte arg0, int arg1) {
        field1989++;
        int[] var3 = this.field4425.method906(arg1, 8251);
        int var4 = 102 % ((arg0 + 49) / 33);
        if (this.field4425.field2043) {
            int var5 = class154.field2619 * this.field1995 >> 12;
            int[] var6 = this.method1822(0, 100, arg1 - 1 & class250.field4205);
            int[] var7 = this.method1822(0, 63, arg1);
            int[] var8 = this.method1822(0, 62, arg1 + 1 & class250.field4205);
            for (int var9 = 0; var9 < class92.field1576; var9++) {
                int var10 = (var8[var9] - var6[var9]) * var5 >> 12;
                int var11 = (var7[class77.field1260 & var9 - 1] - var7[class77.field1260 & var9 + 1]) * var5 >> 12;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = var11 >> 4;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > 255) {
                    var13 = 255;
                }
                int var14 = class238.field3949[((var12 + 1) * var12 >> 1) + var13] & 0xFF;
                int var15 = var10 * var14 >> 8;
                int var16 = var11 * var14 >> 8;
                int var17 = this.field1987[0] * var16 >> 12;
                int var18 = this.field1987[1] * var15 >> 12;
                int var19 = var14 * 4096 >> 8;
                int var20 = this.field1987[2] * var19 >> 12;
                var3[var9] = var17 + var20 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(B)V", line = 116)
    public final void method111(byte arg0) {
        if (arg0 != -57) {
            method886();
        }
        this.method888(true);
        field1993++;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 199)
    public class119() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpb;BI)V", line = 137)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field1992++;
        if (arg2 == 0) {
            this.field1995 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field1988 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field1991 = arg0.method423(255);
        }
        if (arg1 > -115) {
            field1986 = -87;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V", line = 182)
    public static void method887(int arg0) {
        field1990 = null;
        field1997 = null;
        if (arg0 != 0) {
            field1990 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Z)V", line = 219)
    private final void method888(boolean arg0) {
        double var2 = Math.cos((double) ((float) this.field1991 / 4096.0F));
        this.field1987[0] = (int) (Math.sin((double) ((float) this.field1988 / 4096.0F)) * var2 * 4096.0D);
        this.field1987[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field1988 / 4096.0F)));
        field1998++;
        this.field1987[2] = (int) (Math.sin((double) ((float) this.field1991 / 4096.0F)) * 4096.0D);
        int var4 = this.field1987[1] * this.field1987[1] >> 12;
        int var5 = this.field1987[0] * this.field1987[0] >> 12;
        if (!arg0) {
            this.field1995 = -117;
        }
        int var6 = this.field1987[2] * this.field1987[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1987[1] = (this.field1987[1] << 12) / var7;
            this.field1987[2] = (this.field1987[2] << 12) / var7;
            this.field1987[0] = (this.field1987[0] << 12) / var7;
        }
    }
}
