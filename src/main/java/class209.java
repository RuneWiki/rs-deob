import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class209 extends class7 {

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    private int field3356;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "[I")
    public static int[] field3354 = new int[25];

    @OriginalMember(owner = "client!om", name = "D", descriptor = "Lal;")
    public static class52 field3362 = new class52(8);

    @OriginalMember(owner = "client!om", name = "E", descriptor = "[C")
    public static char[] field3363 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "[Lhi;")
    public class113[] field3355;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "[[B")
    private byte[][] field3360;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 5)
    public static final void method1474(byte arg0) {
        if (arg0 != -17) {
            field3363 = null;
        }
        class296.field4710.method655(class30.field380, class433.field6396, class271.field4349);
        field3359++;
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V", line = 30)
    public static void method1475(int arg0) {
        field3354 = null;
        field3362 = null;
        int var1 = -2 % ((83 - arg0) / 35);
        field3363 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBII)V", line = 43)
    public static final void method1476(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3364++;
        float var5 = (float) class400.field5967 / (float) class400.field5981;
        int var6 = arg1;
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg0 - (arg1 - var6) / 2;
        int var9 = arg3 - (arg4 - var7) / 2;
        if (arg2 < 58) {
            return;
        }
        class80.field1002 = -1;
        class375.field5656 = class400.field5981 * var8 / var6;
        class196.field3184 = -1;
        class144.field2270 = class400.field5967 - (class400.field5967 * var9 / var7);
        class270.method1829(0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z", line = 71)
    public final boolean method1477(int arg0, int arg1) {
        field3357++;
        if (arg1 != 0) {
            method1480(-47, (class57) null, 116);
        }
        return this.field3355[arg0].field1559;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V", line = 81)
    public class209(int arg0) {
        this.field3356 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(Z)Z", line = 89)
    public final boolean method1478(boolean arg0) {
        field3365++;
        if (this.field3355 != null) {
            return true;
        }
        if (this.field3360 == null) {
            if (!class342.field5276.method2785(this.field3356, (byte) 100)) {
                return false;
            }
            int[] var2 = class342.field5276.method2764(this.field3356, (byte) -121);
            this.field3360 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field3360[var3] = class342.field5276.method2771(this.field3356, var2[var3], 3);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field3360.length; var5++) {
            byte[] var14 = this.field3360[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class391.field5876.method2762(1, var15);
        }
        if (!var4) {
            return false;
        }
        class37 var6 = new class37();
        int var7 = class342.field5276.method2758(this.field3356, 14535);
        this.field3355 = new class113[var7];
        if (arg0) {
            field3354 = null;
        }
        int[] var8 = class342.field5276.method2764(this.field3356, (byte) -121);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field3360[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class426 var12 = null;
            for (class426 var13 = (class426) var6.method253((byte) -6); var13 != null; var13 = (class426) var6.method247((byte) 62)) {
                if (var13.field6284 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class426(var11, class391.field5876.method2776(0, var11));
                var6.method245(500, var12);
            }
            this.field3355[var8[var9]] = new class113(var10, var12);
        }
        this.field3360 = null;
        return true;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)I", line = 188)
    public static final int method1479(int arg0) {
        field3358++;
        if (arg0 != 15795) {
            method1479(-7);
        }
        class52 var1 = class235.field3940;
        synchronized (class235.field3940) {
            return class235.field3940.method340(0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjr;I)Lgr;", line = 204)
    public static final class247 method1480(int arg0, class57 arg1, int arg2) {
        field3366++;
        class247 var3;
        if (class101.field1411 == null) {
            var3 = new class247();
        } else {
            var3 = class101.field1411;
            class101.field1411 = class101.field1411.field4054;
            var3.field4054 = null;
            class47.field589--;
        }
        if (arg2 != 0) {
            field3362 = null;
        }
        var3.field4052 = arg1;
        var3.field4051 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Z", line = 229)
    public final boolean method1481(int arg0, int arg1) {
        if (arg1 != 35) {
            this.method1477(92, 78);
        }
        field3361++;
        return this.field3355[arg0].field1568;
    }
}
