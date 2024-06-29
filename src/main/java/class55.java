import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class55 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Z")
    public static boolean field863 = true;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field862 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
    public static boolean field864 = false;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lrg;")
    public static class88 field867;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 22)
    public static final void method342(int arg0) {
        class168.field2819.method554(arg0 ^ arg0);
        field870++;
        class259.field4392.method554(arg0 + 24957);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Lsi;", line = 43)
    public static final class304 method343(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        return var3 == null || var3.field4184 == null ? null : var3.field4184;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBI)I", line = 62)
    public static final int method344(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = 121 / ((-arg2 - 25) / 44);
        field865++;
        if (arg1 == arg3) {
            return arg3;
        } else {
            int var5 = 128 - arg0;
            int var6 = ((-16711936 & arg3) >>> 7) * var5 + ((arg1 >>> 7 & 0x1FE01FE) * arg0) & 0xFF00FF00;
            int var7 = (arg1 & 0xFF00FF) * arg0 + (arg3 & 0xFF00FF) * var5 & 0xFF00FF00;
            return var6 + (var7 >> 7);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 82)
    public static final void method345(int arg0) {
        field868++;
        class108.method834((byte) 49, class300.field5110);
        if (arg0 >= -50) {
            field866 = -102;
        }
        class246.field4127++;
        if (class160.field2698 && class130.field2142) {
            int var1 = class67.field994;
            int var2 = var1 - class197.field3255;
            int var3 = class2.field31;
            int var4 = var3 - class16.field232;
            if (var4 < class156.field2658) {
                var4 = class156.field2658;
            }
            if ((class300.field5110.field3294 + var4) > (class156.field2658 + class30.field493.field3294)) {
                var4 = class156.field2658 + class30.field493.field3294 - class300.field5110.field3294;
            }
            if (class50.field755 > var2) {
                var2 = class50.field755;
            }
            if (class50.field755 + class30.field493.field3253 < var2 - -class300.field5110.field3253) {
                var2 = class50.field755 + class30.field493.field3253 - class300.field5110.field3253;
            }
            int var5 = var2 - class47.field719;
            int var6 = class300.field5110.field3405;
            int var7 = class30.field493.field3371 + var4 - class156.field2658;
            int var8 = var4 - class201.field3478;
            if (class300.field5110.field3395 < class246.field4127 && (var8 > var6 || (-var6) > var8 || var6 < var5 || (-var6) > var5)) {
                class10.field138 = true;
            }
            int var9 = class30.field493.field3310 + var2 - class50.field755;
            if (class300.field5110.field3402 != null && class10.field138) {
                class26 var10 = new class26();
                var10.field420 = var7;
                var10.field424 = class300.field5110;
                var10.field423 = var9;
                var10.field414 = class300.field5110.field3402;
                class114.method873(-49, var10);
            }
            if (class235.field3871 == 0) {
                if (class10.field138) {
                    if (class300.field5110.field3336 != null) {
                        class26 var11 = new class26();
                        var11.field416 = class116.field1971;
                        var11.field420 = var7;
                        var11.field423 = var9;
                        var11.field424 = class300.field5110;
                        var11.field414 = class300.field5110.field3336;
                        class114.method873(116, var11);
                    }
                    if (class116.field1971 != null && client.method1671(class300.field5110) != null) {
                        class255.field4318.method1523(22260, 151);
                        class24.field371++;
                        class255.field4318.method446(-23847, class300.field5110.field3273);
                        class255.field4318.method435((byte) 97, class116.field1971.field3273);
                        class255.field4318.method443((byte) 83, class300.field5110.field3256);
                        class255.field4318.method436(class116.field1971.field3256, -18820);
                    }
                } else if ((class195.field3220 == 1 || class125.method922(class136.field2272 - 1, -81)) && class136.field2272 > 2) {
                    class108.method837((byte) -111);
                } else if (class136.field2272 > 0) {
                    class38.method226(-710);
                }
                class300.field5110 = null;
            }
        } else if (class246.field4127 > 1) {
            class300.field5110 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 205)
    public static void method346(int arg0) {
        if (arg0 > -81) {
            method346(119);
        }
        field867 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[B")
    public abstract byte[] method99(int arg0, int arg1);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V")
    public abstract void method91(int arg0, byte arg1);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IB)I")
    public abstract int method97(int arg0, byte arg1);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Lda;")
    public abstract class112 method106(byte arg0);
}
