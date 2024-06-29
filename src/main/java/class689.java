import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class689 implements class236 {

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "Ltl;")
    public class566 field9726;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    public int field9731;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public int field9727;

    @OriginalMember(owner = "client!mga", name = "s", descriptor = "I")
    public int field9744;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "Lfn;")
    public class286 field9729;

    @OriginalMember(owner = "client!mga", name = "r", descriptor = "I")
    public int field9743;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public int field9733;

    @OriginalMember(owner = "client!mga", name = "o", descriptor = "I")
    public int field9740;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    public int field9736;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "Llg;")
    public static class32 field9734 = new class32(13, 0, 1, 0);

    @OriginalMember(owner = "client!mga", name = "n", descriptor = "I")
    public static int field9739 = -1;

    @OriginalMember(owner = "client!mga", name = "q", descriptor = "Leba;")
    public static class550 field9742 = new class550(23, 6);

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
    public static int field9738;

    @OriginalMember(owner = "client!mga", name = "p", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V", line = 8)
    public static final void method3894(byte arg0) {
        class643.field8914.method2105(71);
        field9735++;
        class409.field5387.method1895(-20895);
        class386.field5153.method2610(96);
        class583.field7996.setBackground(Color.black);
        class431.field5790 = -1;
        class643.field8914 = class211.method1338(class583.field7996, 81);
        int var1 = 22 / ((-arg0 - 13) / 51);
        class409.field5387 = class381.method2184(true, false, class583.field7996);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)V", line = 31)
    public static void method3895(boolean arg0) {
        if (!arg0) {
            method3897(-100);
        }
        field9734 = null;
        field9742 = null;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 46)
    public static final void method3896(String arg0, int arg1, boolean arg2) {
        field9738++;
        if (arg0 == null) {
            return;
        }
        if (class52.field662 >= 100) {
            class642.method3555((byte) -101, class371.field4918.method2141(class422.field5539, true), 4);
            return;
        }
        String var3 = class55.method328(arg0, (byte) -64);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg1 >= -92) {
            return;
        }
        while (var4 < class52.field662) {
            String var9 = class55.method328(class204.field2746[var4], (byte) -64);
            if (var9 != null && var9.equals(var3)) {
                class642.method3555((byte) -101, arg0 + class371.field4919.method2141(class422.field5539, true), 4);
                return;
            }
            if (class104.field1242[var4] != null) {
                String var10 = class55.method328(class104.field1242[var4], (byte) -64);
                if (var10 != null && var10.equals(var3)) {
                    class642.method3555((byte) -101, arg0 + class371.field4919.method2141(class422.field5539, true), 4);
                    return;
                }
            }
            var4++;
        }
        for (int var5 = 0; var5 < class427.field5757; var5++) {
            String var7 = class55.method328(class82.field948[var5], (byte) -64);
            if (var7 != null && var7.equals(var3)) {
                class642.method3555((byte) -101, class371.field4924.method2141(class422.field5539, true) + arg0 + class371.field4925.method2141(class422.field5539, true), 4);
                return;
            }
            if (class292.field3854[var5] != null) {
                String var8 = class55.method328(class292.field3854[var5], (byte) -64);
                if (var8 != null && var8.equals(var3)) {
                    class642.method3555((byte) -101, class371.field4924.method2141(class422.field5539, true) + arg0 + class371.field4925.method2141(class422.field5539, true), 4);
                    return;
                }
            }
        }
        if (class55.method328(class408.field5369.field7791, (byte) -64).equals(var3)) {
            class642.method3555((byte) -101, class371.field4921.method2141(class422.field5539, true), 4);
            return;
        }
        class339.field4569++;
        class229 var6 = class97.method550(class71.field841, false, class354.field4720);
        var6.field2971.method915(-31914, class206.method1313((byte) 92, arg0) + 1);
        var6.field2971.method936(arg0, -93);
        var6.field2971.method915(-31914, arg2 ? 1 : 0);
        class307.method1805(var6, -14704);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Ltca;", line = 142)
    public class141 method421(int arg0) {
        field9732++;
        return arg0 == 4 ? null : null;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V", line = 153)
    public static final void method3897(int arg0) {
        if (arg0 != -1) {
            return;
        }
        for (class502 var1 = (class502) class552.field7525.method2506(68); var1 != null; var1 = (class502) class552.field7525.method2505(-114)) {
            if (var1.field6896) {
                var1.method2853((byte) -77);
            }
        }
        field9728++;
        for (class502 var2 = (class502) class598.field8232.method2506(68); var2 != null; var2 = (class502) class598.field8232.method2505(-128)) {
            if (var2.field6896) {
                var2.method2853((byte) -76);
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(III)Z", line = 199)
    public static final boolean method3898(int arg0, int arg1, int arg2) {
        field9730++;
        if (arg1 != -1100) {
            method3898(-98, 0, -55);
        }
        return false;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Ltl;Lfn;IIIIIII)V", line = 209)
    public class689(class566 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9726 = arg0;
        this.field9731 = arg2;
        this.field9727 = arg7;
        this.field9744 = arg6;
        this.field9729 = arg1;
        this.field9743 = arg5;
        this.field9733 = arg4;
        this.field9740 = arg8;
        this.field9736 = arg3;
    }
}
