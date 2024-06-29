import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class634 {

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "Lvg;")
    private class49 field8901 = new class49(64);

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "Lvg;")
    public class49 field8911 = new class49(60);

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "Lri;")
    private class97 field8908;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "Lri;")
    public class97 field8902;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "Z")
    public static boolean field8909 = false;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Lrl;")
    public static class672 field8900 = new class672(5, 4);

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public int field8912;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "[Lcca;")
    public static class226[] field8913;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method3681(int arg0) {
        field8913 = null;
        if (arg0 != 1) {
            field8909 = true;
        }
        field8900 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIII)I")
    public static final int method3682(int arg0, int arg1, int arg2, int arg3) {
        field8905++;
        if (class579.field8251 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        if (arg3 != 0) {
            method3685();
        }
        int var6 = arg1 - class378.field5901;
        int var7 = arg0 - class378.field5902;
        for (class143 var8 = (class143) class378.field5883.method3465((byte) 103); var8 != null; var8 = (class143) class378.field5883.method3469(0)) {
            if (var8.field2408 == arg2) {
                int var9 = var8.field2406;
                int var10 = var8.field2407;
                int var11 = class378.field5901 + var9 << 14 | class378.field5902 + var10;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
    public final void method3683(int arg0, int arg1) {
        class49 var3 = this.field8901;
        synchronized (this.field8901) {
            if (arg1 != 4194304) {
                this.method3688((byte) 82);
            }
            this.field8901.method573((byte) 126, arg0);
        }
        field8907++;
        class49 var4 = this.field8911;
        synchronized (this.field8911) {
            this.field8911.method573((byte) 123, arg0);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IB)V")
    public final void method3684(int arg0, byte arg1) {
        field8903++;
        this.field8912 = arg0;
        if (arg1 == -8) {
            class49 var3 = this.field8911;
            synchronized (this.field8911) {
                this.field8911.method569(arg1 ^ 0xFFFFFFF8);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "()V")
    public static final void method3685() {
        byte var0 = 10;
        byte var1 = 30;
        if (class689.field9665 == 0 || class65.field841 == null) {
            return;
        }
        class595.field8435.method343(class349.field5578);
        for (int var2 = 0; var2 < class90.field1081.length; var2++) {
            class595.field8435.method1347(class90.field1081[var2] + class547.field7971[var2], class349.field5578[1], class349.field5578[3] - class349.field5578[1], 127, -256);
        }
        for (int var3 = 0; var3 < class95.field1489; var3++) {
            class686 var11 = class331.field5131[var3];
            class595.field8435.method330(var11.field9623[0], var11.field9617[0], var11.field9619[0], class691.field9692);
            class595.field8435.method330(var11.field9623[1], var11.field9617[1], var11.field9619[1], class6.field104);
            class595.field8435.method330(var11.field9623[2], var11.field9617[2], var11.field9619[2], class437.field6667);
            class595.field8435.method330(var11.field9623[3], var11.field9617[3], var11.field9619[3], class591.field8389);
            if (class691.field9692[2] != -1 && class6.field104[2] != -1 && class437.field6667[2] != -1 && class591.field8389[2] != -1) {
                int var12 = -65536;
                if (var11.field9618 == 4) {
                    var12 = -16776961;
                }
                class595.field8435.method1354(var12, class691.field9692[1], class6.field104[1], 81, class691.field9692[0], class6.field104[0]);
                class595.field8435.method1354(var12, class6.field104[1], class437.field6667[1], -101, class6.field104[0], class437.field6667[0]);
                class595.field8435.method1354(var12, class437.field6667[1], class591.field8389[1], 67, class437.field6667[0], class591.field8389[0]);
                class595.field8435.method1354(var12, class591.field8389[1], class691.field9692[1], 99, class591.field8389[0], class691.field9692[0]);
                class595.field8435.method1354(var12, class691.field9692[1], class437.field6667[1], -81, class691.field9692[0], class437.field6667[0]);
            }
        }
        class65.field841.method2657("Static Opaque: OW: " + class203.field3310[0] + "/" + class426.field6478[0] + " UW: " + class203.field3310[1] + "/" + class426.field6478[1], -16777216, var0, -256, var1, (byte) -122);
        class65.field841.method2657("Static Trans: OW: " + class124.field2052[0] + "/" + class441.field6714[0] + " UW: " + class124.field2052[1] + "/" + class441.field6714[1], -16777216, var0, -256, var1 + 15, (byte) -123);
        class65.field841.method2657("Static Anim: OW: " + class95.field1483[0] + "/" + class691.field9694[0] + " UW: " + class95.field1483[1] + "/" + class691.field9694[1], -16777216, var0, -256, var1 + 30, (byte) -78);
        class65.field841.method2657("Dynamic: " + class15.field203 + "/" + 5000, -16777216, var0, -256, var1 + 45, (byte) -91);
        class65.field841.method2657("Total Opaque Onscreen: " + class148.field2465 + "/" + 10000, -16777216, var0, -256, var1 + 60, (byte) -85);
        class65.field841.method2657("Total Trans Onscreen: " + class207.field3462 + "/" + 5000, -16777216, var0, -256, var1 + 75, (byte) -89);
        class65.field841.method2657("Occluders: " + (class669.field9454 + class288.field4579) + " Active: " + class95.field1489, -16777216, var0, -256, var1 + 90, (byte) -96);
        class65.field841.method2657("Occluded: Ground:" + class524.field7621 + " Walls: " + class233.field3699 + " CPs: " + class544.field7915 + " Pixels: " + class504.field7375, -16777216, var0, -256, var1 + 105, (byte) -126);
        class65.field841.method2657("Occlude Calc Took: " + class469.field6956 / 1000L + "us", -16777216, var0, -256, var1 + 120, (byte) -69);
        if (class689.field9665 != 2 || class239.field3788 == null) {
            return;
        }
        for (int var4 = 0; var4 < class239.field3788.length; var4++) {
            float var6 = (float) class239.field3788[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class239.field3788[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class702 var5 = class595.field8435.method306(class239.field3788, 0, class245.field3908, class245.field3908, class570.field8156);
        var5.method1086(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)Lpaa;")
    public final class578 method3686(boolean arg0, int arg1) {
        field8906++;
        class49 var3 = this.field8901;
        class578 var4;
        synchronized (this.field8901) {
            var4 = (class578) this.field8901.method560(arg0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field8908;
        byte[] var6;
        synchronized (this.field8908) {
            var6 = this.field8908.method926(class619.method3594(arg1, (byte) -119), -124, class265.method1876(-123, arg1));
        }
        class578 var7 = new class578();
        var7.field8235 = this;
        var7.field8236 = arg1;
        if (var6 != null) {
            var7.method3384((byte) 2, new class6(var6));
        }
        class49 var8 = this.field8901;
        synchronized (this.field8901) {
            this.field8901.method559(var7, (long) arg1, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public final void method3687(int arg0) {
        int var2 = -95 % ((arg0 - 29) / 58);
        class49 var3 = this.field8901;
        synchronized (this.field8901) {
            this.field8901.method563(0);
        }
        field8910++;
        class49 var4 = this.field8911;
        synchronized (this.field8911) {
            this.field8911.method563(0);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public final void method3688(byte arg0) {
        if (arg0 < 69) {
            return;
        }
        field8904++;
        class49 var2 = this.field8901;
        synchronized (this.field8901) {
            this.field8901.method569(0);
        }
        class49 var3 = this.field8911;
        synchronized (this.field8911) {
            this.field8911.method569(0);
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lei;ILri;Lri;)V")
    public class634(class162 arg0, int arg1, class97 arg2, class97 arg3) {
        this.field8908 = arg2;
        this.field8902 = arg3;
        int var5 = this.field8908.method917(true) - 1;
        this.field8908.method949(var5, 0);
    }

    static {
        new class307("", 76);
    }
}
