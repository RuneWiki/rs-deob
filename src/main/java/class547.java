import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class547 extends class135 {

    @OriginalMember(owner = "client!tca", name = "s", descriptor = "Lad;")
    private class669 field8034;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "Lob;")
    private class354 field8026;

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "Lar;")
    private class526 field8036;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "[I")
    public static int[] field8027 = new int[4];

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        ++field8035;
        if (arg2 != 0) {
            this.field8026 = null;
        }
        if (!this.field8026.field4957) {
            int var4 = super.field2179.field7370 % 4000 * 16 / 4000;
            super.field2179.method2924(13528, this.field8026.field4961[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field2179.field7370 % 4000) / 4000.0F;
            super.field2179.method2924(13528, this.field8026.field4958);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(B)I")
    public static final int method3210(byte arg0) {
        ++field8033;
        if (arg0 != -47) {
            field8030 = 57;
        }
        class98 var1 = class637.field9048;
        boolean var2 = false;
        if (class76.field1182 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class98.method761((byte) -117, 0, (class345) null, var3, 0, (class615) null);
            var2 = true;
        }
        long var4 = class254.method1619(true);
        for (int var6 = 0; var6 < 10000; ++var6) {
            var1.method811(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (-var4 + class254.method1619(true));
        var1.method792(100, (byte) -88, 100, 0, -16777216, 0);
        if (var2) {
            var1.method753(1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)V")
    public static void method3211(boolean arg0) {
        field8027 = null;
        if (!arg0) {
            method3210((byte) -121);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)V")
    public final void method375(int arg0, boolean arg1) {
        super.field2179.method2959(class345.field4866, class673.field9556, (byte) -99);
        ++field8038;
        if (arg0 <= 14) {
            this.method377(54, -28, -75);
        }
    }

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "(I)Lbp;")
    public static final class431 method3212(int arg0) {
        ++field8032;
        if (arg0 < 106) {
            field8027 = null;
        }
        try {
            return (class431) Class.forName("su").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZI)V")
    public final void method376(boolean arg0, int arg1) {
        if (arg1 != -25475) {
            this.field8034 = null;
        }
        ++field8028;
        OpenGL.glBindProgramARB(34336, this.field8036.field7714);
        OpenGL.glEnable(34336);
        super.field2179.method2914(arg1 ^ -25546, 0, class51.field669);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Laj;II)V")
    public final void method384(class402 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field8036 = null;
        }
        ++field8031;
    }

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "(I)Z")
    public final boolean method379(int arg0) {
        if (arg0 != -4931) {
            this.field8036 = null;
        }
        ++field8037;
        return this.field8036 != null;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lad;Lvo;Lob;)V")
    public class547(class669 arg0, class345 arg1, class354 arg2) {
        super(arg0);
        this.field8034 = arg0;
        this.field8026 = arg2;
        if (arg1 != null && this.field8026.method2141(-75) && this.field8034.field9532) {
            this.field8036 = class109.method895(arg1.method2073((byte) 51, "transparent_water", "gl"), this.field8034, 32173, 34336);
        } else {
            this.field8036 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
    public final void method385(int arg0) {
        super.field2179.method2914(57, 0, class171.field2763);
        ++field8029;
        OpenGL.glBindProgramARB(34336, 0);
        int var2 = 74 % ((-29 - arg0) / 45);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }
}
