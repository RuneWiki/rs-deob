import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class174 {

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "Lmi;")
    public class195 field2253 = new class195();

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "Z")
    public boolean field2256 = false;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "Z")
    public static boolean field2251 = false;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "Luv;")
    public static class3 field2250 = new class3(56, 7);

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public static int field2258 = 0;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "Ljq;")
    public static class447 field2259 = null;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        field2259 = null;
        field2250 = null;
        if (arg0 != -1) {
            field2259 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILkr;)I")
    public static final int method1069(int arg0, class329 arg1) {
        field2249++;
        int var2 = 0;
        if (arg1.method2042((byte) -80, class30.field480)) {
            var2++;
        }
        if (arg0 > -42) {
            field2250 = null;
        }
        if (arg1.method2042((byte) -80, class463.field6586)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class163.field2069)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class80.field1079)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class327.field4487)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class522.field7273)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class389.field5405)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class360.field5026)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class612.field8804)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class424.field5746)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class512.field7134)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class263.field3357)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class44.field628)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class372.field5183)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class74.field1015)) {
            var2++;
        }
        if (arg1.method2042((byte) -80, class626.field9116)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([I[IILjc;[I)V")
    public static final void method1070(int[] arg0, int[] arg1, int arg2, class585 arg3, int[] arg4) {
        field2254++;
        if (arg2 != 56) {
            method1068(98);
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field325.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field325[var9] = null;
                    } else {
                        class320 var10 = class609.field8754.method535(var6, true);
                        int var11 = var10.field4419;
                        class257 var12 = arg3.field325[var9];
                        if (var12 != null) {
                            if (var12.field3194 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field325[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3188 = 1;
                                    var12.field3186 = 0;
                                    var12.field3187 = 0;
                                    var12.field3192 = 0;
                                    var12.field3196 = var8;
                                    class627.method3629(arg3.field6368, false, var10, 0, arg3.field6358, (byte) -112, arg3.field6362);
                                } else if (var11 == 2) {
                                    var12.field3192 = 0;
                                }
                            } else if (var10.field4430 >= class609.field8754.method535(var12.field3194, true).field4430) {
                                var12 = arg3.field325[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class257 var13 = arg3.field325[var9] = new class257();
                            var13.field3194 = var6;
                            var13.field3196 = var8;
                            var13.field3188 = 1;
                            var13.field3192 = 0;
                            var13.field3187 = 0;
                            var13.field3186 = 0;
                            class627.method3629(arg3.field6368, false, var10, 0, arg3.field6358, (byte) -119, arg3.field6362);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }
}
