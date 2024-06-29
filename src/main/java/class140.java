import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class140 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method1135(int arg0) {
        if (arg0 == 1) {
            field2296++;
            return (this.field2300 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)Z", line = 16)
    public final boolean method1136(boolean arg0) {
        if (!arg0) {
            this.field2299 = -70;
        }
        field2298++;
        return (this.field2300 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIILcea;I)Ljava/awt/Frame;", line = 27)
    private static final Frame method1137(int arg0, int arg1, int arg2, int arg3, class111 arg4, int arg5) {
        field2304++;
        if (!arg4.method916((byte) 57)) {
            return null;
        }
        if (arg1 == arg5) {
            class157[] var6 = class212.method1469(arg4, 10);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2458 == arg2 && var6[var8].field2459 == arg0 && (arg3 == 0 || var6[var8].field2461 == arg3) && (!var7 || arg1 < var6[var8].field2463)) {
                    var7 = true;
                    arg1 = var6[var8].field2463;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class746 var9 = arg4.method923(arg0, arg3, arg2, arg1, arg5 ^ 0x60);
        while (var9.field10365 == 0) {
            class579.method3405(10L, 10);
        }
        Frame var10 = (Frame) var9.field10371;
        if (var10 == null) {
            return null;
        } else if (var9.field10365 == 2) {
            class253.method1670((byte) -98, arg4, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z", line = 108)
    public final boolean method1138(int arg0) {
        if (arg0 < 81) {
            return true;
        } else {
            field2303++;
            return (this.field2300 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIZ)V", line = 119)
    public static final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (class259.field3676 != null && (arg2 != 3 || class61.field941 != arg0 || class69.field1120 != arg4)) {
            class253.method1670((byte) -98, class336.field4775, class259.field3676);
            class259.field3676 = null;
        }
        field2297++;
        if (arg2 == 3 && class259.field3676 == null) {
            class259.field3676 = method1137(arg4, 0, arg0, 0, class336.field4775, 0);
            if (class259.field3676 != null) {
                class69.field1120 = arg4;
                class61.field941 = arg0;
                class95.method797(arg1 - 53);
            }
        }
        if (arg2 == 3 && class259.field3676 == null) {
            method1139(-1, -1, class420.field5820.field9488.method3773(17539), arg3, -1, true);
            return;
        }
        Container var6;
        if (class259.field3676 != null) {
            var6 = class259.field3676;
            class668.field9393 = arg4;
            class688.field9724 = arg0;
        } else if (class410.field5617 == null) {
            if (class343.field4881 == null) {
                var6 = class149.field2396;
            } else {
                var6 = class343.field4881;
            }
            class688.field9724 = var6.getSize().width;
            class668.field9393 = var6.getSize().height;
        } else {
            Insets var7 = class410.field5617.getInsets();
            class688.field9724 = class410.field5617.getSize().width - var7.right - var7.left;
            int var10001 = var7.top + var7.bottom;
            class668.field9393 = class410.field5617.getSize().height - var10001;
            var6 = class410.field5617;
        }
        if (arg2 == 1) {
            class424.field5897 = 0;
            class709.field9923 = class499.field6858;
            class448.field6174 = class381.field5334;
            class728.field10160 = (class688.field9724 - class499.field6858) / 2;
        } else {
            class661.method3705(124);
        }
        if (class94.field1340 != class145.field2353) {
            boolean var10000;
            if (class709.field9923 < 1024 && class448.field6174 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class145.method1158(-3);
        } else {
            class213.field3128.setSize(class709.field9923, class448.field6174);
            if (class593.field8489) {
                class617.method3547(class213.field3128, 113);
            } else {
                class686.field9702.method432(class213.field3128, class709.field9923, class448.field6174);
            }
            if (class410.field5617 == var6) {
                Insets var8 = class410.field5617.getInsets();
                class213.field3128.setLocation(var8.left + class728.field10160, var8.top - -class424.field5897);
            } else {
                class213.field3128.setLocation(class728.field10160, class424.field5897);
            }
        }
        if (arg2 < 2) {
            class60.field911 = false;
        } else {
            class60.field911 = true;
        }
        if (class379.field5314 != -1) {
            class106.method857(true, 0);
        }
        if (class600.field8551 != null && class659.method3694(9, class141.field2306)) {
            class594.method3470(arg1 ^ 0x6564);
        }
        if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class438.field6082[var9] = true;
            }
            class291.field4243 = true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Z", line = 248)
    public final boolean method1140(byte arg0) {
        int var2 = 70 / ((-arg0 - 79) / 47);
        field2302++;
        return (this.field2300 & 0x4) != 0;
    }
}
