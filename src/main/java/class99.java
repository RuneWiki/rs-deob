import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class99 implements Runnable {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "[Lwl;")
    public volatile class270[] field1792 = new class270[2];

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Z")
    public volatile boolean field1799 = false;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Z")
    public volatile boolean field1797 = false;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[Lnf;")
    public static class390[] field1791 = new class390[30];

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Loe;")
    public static class127 field1798 = new class127(0, 3);

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1802 = -1;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lhf;")
    public class260 field1795;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "[Lfo;")
    public static class343[] field1801;

    @OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
    public final void run() {
        field1790++;
        this.field1797 = true;
        try {
            while (!this.field1799) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class270 var2 = this.field1792[var1];
                    if (var2 != null) {
                        var2.method1642(-2955);
                    }
                }
                class414.method2437(10L, (byte) -122);
                class49.method347(0, null, this.field1795);
            }
        } catch (Exception var9) {
            class32.method177(var9, (byte) -85, null);
        } finally {
            Object var6 = null;
            this.field1797 = false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method745(int arg0) {
        field1801 = null;
        field1798 = null;
        field1791 = null;
        if (arg0 != 121) {
            method747(-10);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method746(int[] arg0, byte arg1) {
        field1794++;
        if (arg1 != 53) {
            return null;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class306.field4637;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class120 var5 = class156.field2465.method1701(arg0[var4], (byte) 56);
            if (var5.field1990 != -1) {
                class154 var6 = (class154) class500.field7587.method1752(0, (long) var5.field1990);
                if (var6 == null) {
                    class351 var7 = class351.method2132(class472.field7225, var5.field1990, 0);
                    if (var7 != null) {
                        var6 = class345.field5116.method1952(var7, true);
                        class500.field7587.method1758(1, var6, (long) var5.field1990);
                    }
                }
                if (var6 != null) {
                    class302.field4562[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static final void method747(int arg0) {
        field1793++;
        class211.field3282 = -3;
        class32.field417 = 0;
        if (arg0 >= -88) {
            field1802 = -13;
        }
        class480.field7323 = 0;
        class458.field7053 = false;
        class120.field2000 = -1;
        class490.field7451 = 1;
        class447.field6873 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    public static final void method748(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class105.field1842 = arg2;
        field1800++;
        class222.field3438 = arg4;
        class121.field2014 = arg1;
        class106.field1864 = arg3;
        int var5 = -55 % ((35 - arg0) / 32);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)I")
    public static final int method749(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field1796++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 == -23866) {
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return -93;
        }
    }
}
