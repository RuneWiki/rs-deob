import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class414 {

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5556 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "[F")
    public static float[] field5559 = new float[4];

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "F")
    public static float field5557;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "Lq;")
    public static class490 field5560;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([FII)[F")
    public static final float[] method2329(float[] arg0, int arg1, int arg2) {
        field5558++;
        float[] var3 = new float[arg1];
        class567.method3214(arg0, 0, var3, arg2, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IJ)V")
    public static final void method2330(int arg0, long arg1) {
        field5554++;
        int var3 = class672.field9356;
        if (arg0 < 118) {
            field5559 = null;
        }
        int var4 = class436.field6158;
        if (class463.field6603 != var3) {
            int var5 = var3 - class463.field6603;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class463.field6603 += var6;
        }
        if (class307.field3793 != var4) {
            int var7 = var4 - class307.field3793;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class307.field3793 += var8;
        }
        if (!class639.field9075.field6762) {
            class654.field9173 += (float) arg1 * class381.field5158 / 40.0F * 8.0F;
            class508.field7300 += (float) arg1 * class9.field94 / 40.0F * 8.0F;
        }
        class61.method327(-98);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)V")
    public static final void method2331(byte arg0, int arg1) {
        field5561++;
        if (arg0 != 81) {
            method2331((byte) -79, 37);
        }
        class76 var2 = class3.method28(2, (byte) 42, arg1);
        var2.method406(-975503968);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static void method2332(byte arg0) {
        field5560 = null;
        if (arg0 != 75) {
            field5557 = -1.0849063F;
        }
        field5559 = null;
        field5556 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIIII)V")
    public static final void method2333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 > -53) {
            field5557 = -2.2008672F;
        }
        for (int var6 = arg2; var6 <= arg4; var6++) {
            class315.method1809(class557.field7954[var6], arg5, -128, arg3, arg1);
        }
        field5555++;
    }
}
