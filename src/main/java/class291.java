import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class291 {

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Loc;")
    private class135 field5000;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Ldf;")
    private class154 field4994;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lcg;")
    private class37 field5001;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[[S")
    public static short[][] field4992 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lve;")
    public static class255 field4990 = class87.method607(74, "blaugr-Un:");

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lve;")
    private static class255 field5007 = class87.method607(30, "Walk here");

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lve;")
    public static class255 field4996 = field5007;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lpb;")
    private class70 field5004;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[Lga;")
    private class18[] field4999;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[[[I")
    public static int[][][] field5003;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lch;IBLch;)Lga;", line = 12)
    public final class18 method2054(class131 arg0, int arg1, byte arg2, class131 arg3) {
        field5009++;
        if (arg2 != -20) {
            field4990 = (class255) null;
        }
        return this.method2060(true, arg3, arg0, arg1, (byte) -116);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Lc;", line = 23)
    public static final class293 method2055(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class293 var4 = var3.field4200;
            var3.field4200 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIII)I", line = 34)
    public static final int method2056(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4998++;
        if (arg1) {
            method2063(-26);
        }
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg3 : arg4) : arg0;
        int var7 = var5 < 8 ? arg3 : arg0;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 56)
    public final void method2057(int arg0) {
        field4993++;
        if (this.field4999 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4999.length; var2++) {
            if (this.field4999[var2] != null) {
                this.field4999[var2].method102((byte) 115);
            }
        }
        for (int var3 = 0; var3 < this.field4999.length; var3++) {
            if (this.field4999[var3] != null) {
                this.field4999[var3].method101((byte) 124);
            }
        }
        if (arg0 < 40) {
            field4992 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)Z", line = 92)
    public static final boolean method2058(boolean arg0) {
        field5005++;
        if (arg0) {
            return true;
        }
        try {
            return class124.method914((byte) -59);
        } catch (IOException var5) {
            class315.method2174((byte) -68);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class75.field1230 + "," + class30.field494 + "," + class235.field3866 + " - " + class125.field2084 + "," + (class276.field4742.field5125[0] + class197.field3355) + "," + (class276.field4742.field5154[0] + class268.field4615) + " - ";
            for (int var4 = 0; var4 < class125.field2084 && var4 < 50; var4++) {
                var3 = var3 + class160.field2692.field1066[var4] + ",";
            }
            class195.method1393(var6, 0, var3);
            class234.method1623(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZII)V", line = 123)
    public static final void method2059(boolean arg0, int arg1, int arg2) {
        field4997++;
        if (class225.method1570((byte) -96, arg2)) {
            if (!arg0) {
                method2055(50, -86, -94);
            }
            class186.method1297(127, class297.field5087[arg2], arg1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLch;Lch;IB)Lga;", line = 142)
    private final class18 method2060(boolean arg0, class131 arg1, class131 arg2, int arg3, byte arg4) {
        field4989++;
        if (this.field5004 == null) {
            throw new RuntimeException();
        }
        this.field5004.field1068 = arg3 * 8 + 5;
        if (this.field5004.field1066.length <= this.field5004.field1068) {
            throw new RuntimeException();
        } else if (this.field4999[arg3] != null) {
            return this.field4999[arg3];
        } else if (arg4 >= -77) {
            return (class18) null;
        } else {
            int var6 = this.field5004.method469(110);
            int var7 = this.field5004.method469(94);
            class18 var8 = new class18(arg3, arg2, arg1, this.field5000, this.field4994, var6, var7, arg0);
            this.field4999[arg3] = var8;
            return var8;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Z", line = 182)
    public final boolean method2061(int arg0) {
        field5008++;
        if (this.field5004 != null) {
            return true;
        }
        if (arg0 != 0) {
            field5007 = (class255) null;
        }
        if (this.field5001 == null) {
            if (this.field5000.method1017((byte) -27)) {
                return false;
            }
            this.field5001 = this.field5000.method1004(255, true, 255, (byte) 0, arg0 + 3);
        }
        if (this.field5001.field3742) {
            return false;
        } else {
            this.field5004 = new class70(this.field5001.method82((byte) -16));
            this.field4999 = new class18[(this.field5004.field1066.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([BZ)Lqi;", line = 217)
    public static final class290 method2062(byte[] arg0, boolean arg1) {
        field5002++;
        if (arg0 == null) {
            return null;
        }
        class290 var2 = new class290(arg0, class131.field2167, class298.field5098, class132.field2173, class187.field3027, class282.field4849);
        if (!arg1) {
            method2059(false, 36, -16);
        }
        class111.method850(-3);
        return var2;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 237)
    public static void method2063(int arg0) {
        field4990 = null;
        field5003 = (int[][][]) null;
        if (arg0 != -13053) {
            field4992 = (short[][]) ((short[][]) null);
        }
        field5007 = null;
        field4992 = (short[][]) null;
        field4996 = null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Loc;Ldf;)V", line = 263)
    public class291(class135 arg0, class154 arg1) {
        this.field5000 = arg0;
        this.field4994 = arg1;
        if (!this.field5000.method1017((byte) -27)) {
            this.field5001 = this.field5000.method1004(255, true, 255, (byte) 0, 3);
        }
    }
}
