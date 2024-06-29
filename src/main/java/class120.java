import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class120 extends class73 {

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "Lrd;")
    public static class117 field2937 = class95.method812(": ", (byte) 8);

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Lrd;")
    private static class117 field2947 = class95.method812("This world is running a closed Beta)3", (byte) 8);

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Lrd;")
    public static class117 field2938 = class95.method812("Fps:", (byte) 8);

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "Lrd;")
    private static class117 field2939 = class95.method812("Your profile will be transferred in:", (byte) 8);

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Lrd;")
    public static class117 field2943 = field2939;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "Lrd;")
    public static class117 field2958 = field2947;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "Lra;")
    public static class114 field2941;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lee;")
    public class34 field2952;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "Lee;")
    public class34 field2956;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Lj;")
    public class62 field2944;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "[I")
    public int[] field2949;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    public final void method985(int arg0) {
        if (arg0 != 0) {
            method986(34);
        }
        field2948++;
        int var2 = this.field2951;
        class62 var3 = this.field2944.method635(-18710);
        if (var3 == null) {
            this.field2949 = null;
            this.field2936 = 0;
            this.field2946 = 0;
            this.field2951 = -1;
            this.field2935 = 0;
        } else {
            this.field2946 = var3.field1784;
            this.field2935 = var3.field1786 * 128;
            this.field2951 = var3.field1740;
            this.field2949 = var3.field1746;
            this.field2936 = var3.field1774;
        }
        if (this.field2951 != var2 && this.field2956 != null) {
            class61.field1702.method881(this.field2956);
            this.field2956 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public static void method986(int arg0) {
        field2943 = null;
        field2941 = null;
        field2939 = null;
        field2938 = null;
        field2947 = null;
        field2958 = null;
        if (arg0 != 0) {
            field2938 = null;
        }
        field2937 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
    public static final void method987(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field2958 = null;
        }
        for (class120 var5 = (class120) class96.field2397.method3(false); var5 != null; var5 = (class120) class96.field2397.method14(127)) {
            if (var5.field2951 != -1 || var5.field2949 != null) {
                int var6 = 0;
                if (arg0 > var5.field2955) {
                    var6 += arg0 - var5.field2955;
                } else if (var5.field2942 > arg0) {
                    var6 += var5.field2942 - arg0;
                }
                if (arg4 > var5.field2950) {
                    var6 += arg4 - var5.field2950;
                } else if (arg4 < var5.field2954) {
                    var6 += var5.field2954 - arg4;
                }
                if (var6 - 64 > var5.field2935 || class63.field1813 == 0 || var5.field2957 != arg1) {
                    if (var5.field2956 != null) {
                        class61.field1702.method881(var5.field2956);
                        var5.field2956 = null;
                    }
                    if (var5.field2952 != null) {
                        class61.field1702.method881(var5.field2952);
                        var5.field2952 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field2935 - var6) * class63.field1813 / var5.field2935;
                    if (var5.field2956 != null) {
                        var5.field2956.method393(var7);
                    } else if (var5.field2951 >= 0) {
                        class113 var8 = class113.method921(class101.field2503, var5.field2951, 0);
                        if (var8 != null) {
                            class126 var9 = var8.method919().method1005(class79.field2117);
                            class34 var10 = class34.method410(var9, 100, var7);
                            var10.method423(-1);
                            class61.field1702.method877(var10);
                            var5.field2956 = var10;
                        }
                    }
                    if (var5.field2952 != null) {
                        var5.field2952.method393(var7);
                        if (!var5.field2952.method692(4)) {
                            var5.field2952 = null;
                        }
                    } else if (var5.field2949 != null && (var5.field2945 -= arg2) <= 0) {
                        int var11 = (int) ((double) var5.field2949.length * Math.random());
                        class113 var12 = class113.method921(class101.field2503, var5.field2949[var11], 0);
                        if (var12 != null) {
                            class126 var13 = var12.method919().method1005(class79.field2117);
                            class34 var14 = class34.method410(var13, 100, var7);
                            var14.method423(0);
                            class61.field1702.method877(var14);
                            var5.field2945 = (int) (Math.random() * (double) (var5.field2936 - var5.field2946)) + var5.field2946;
                            var5.field2952 = var14;
                        }
                    }
                }
            }
        }
        field2953++;
    }
}
