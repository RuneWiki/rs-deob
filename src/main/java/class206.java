import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class206 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lfc;")
    private class174 field2978 = new class174(128);

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lfc;")
    public class174 field2988 = new class174(64);

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Loi;")
    private class53 field2982;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Loi;")
    public class53 field2975;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ltn;")
    public static class60 field2976 = new class60(61, 4);

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[B")
    public static byte[] field2987;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "[I")
    public static int[] field2989;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Loi;")
    public static class53 field2986;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[I")
    public static int[] field2985;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static void method1312(boolean arg0) {
        field2986 = null;
        field2989 = null;
        field2985 = null;
        if (!arg0) {
            field2976 = null;
            field2987 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIII)V")
    public static final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2981++;
        if (arg2 != 36) {
            method1315(67, 39, 105, null, 61, 5);
        }
        for (int var6 = arg4; var6 <= arg0; var6++) {
            class447.method2605(-7, arg1, arg3, arg5, class112.field1523[var6]);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public final void method1314(int arg0) {
        field2977++;
        if (arg0 != 3) {
            return;
        }
        class174 var2 = this.field2978;
        synchronized (this.field2978) {
            this.field2978.method1095(0);
        }
        class174 var3 = this.field2988;
        synchronized (this.field2988) {
            this.field2988.method1095(0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[BII)V")
    public static final void method1315(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field2979++;
        if (arg1 <= arg4) {
            return;
        }
        int var6 = arg0 + arg4;
        int var7 = arg1 - arg4 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = -16 / ((arg2 - 77) / 46);
                int var9 = arg1 - arg4 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Ljd;")
    public final class156 method1316(byte arg0, int arg1) {
        field2974++;
        if (arg0 != -68) {
            return null;
        }
        class174 var3 = this.field2978;
        class156 var4;
        synchronized (this.field2978) {
            var4 = (class156) this.field2978.method1088((long) arg1, (byte) 56);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field2982;
        byte[] var6;
        synchronized (this.field2982) {
            var6 = this.field2982.method426(36, (byte) 9, arg1);
        }
        class156 var7 = new class156();
        var7.field2350 = arg1;
        var7.field2339 = this;
        if (var6 != null) {
            var7.method1006(arg0 - 32, new class403(var6));
        }
        var7.method1010(0);
        class174 var8 = this.field2978;
        synchronized (this.field2978) {
            this.field2978.method1097(19627, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
    public final void method1317(int arg0, int arg1, int arg2) {
        if (arg2 != 61) {
            this.field2982 = null;
        }
        this.field2978 = new class174(arg0);
        field2980++;
        this.field2988 = new class174(arg1);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public final void method1318(byte arg0) {
        class174 var2 = this.field2978;
        synchronized (this.field2978) {
            this.field2978.method1096((byte) 114);
            if (arg0 <= 56) {
                this.field2978 = null;
            }
        }
        field2984++;
        class174 var3 = this.field2988;
        synchronized (this.field2988) {
            this.field2988.method1096((byte) 119);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
    public final void method1319(int arg0, byte arg1) {
        class174 var3 = this.field2978;
        synchronized (this.field2978) {
            this.field2978.method1087(arg1 + 120, arg0);
        }
        field2983++;
        class174 var4 = this.field2988;
        synchronized (this.field2988) {
            this.field2988.method1087(1, arg0);
        }
        if (arg1 != -119) {
            field2976 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lle;ILoi;Loi;)V")
    public class206(class205 arg0, int arg1, class53 arg2, class53 arg3) {
        this.field2982 = arg2;
        this.field2975 = arg3;
        this.field2982.method435(36, 0);
    }

    static {
        int var0 = 0;
        field2987 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2987[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
        field2989 = new int[] { 104, 120, 136, 168 };
    }
}
