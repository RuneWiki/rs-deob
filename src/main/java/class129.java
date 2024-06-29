import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class129 implements class258 {

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Lia;")
    public class547 field2345;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "Z")
    public boolean field2343;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "Lsc;")
    public class320 field2338;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "[I")
    public static int[] field2331 = new int[13];

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "[I")
    public static int[] field2341 = new int[2];

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
    public static final boolean method1095(int arg0, int arg1) {
        field2336++;
        if (arg1 == 13 || arg1 == 15 || arg1 == 19 || arg1 == 18 || arg1 == 47) {
            return true;
        } else {
            return ~arg1 == arg0 || arg1 == 1012;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
    public static void method1096(int arg0) {
        if (arg0 != -48) {
            method1096(-20);
        }
        field2341 = null;
        field2331 = null;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILsc;Lia;IIIIIIIZ)V")
    public class129(int arg0, class320 arg1, class547 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field2344 = arg5;
        this.field2339 = arg8;
        this.field2332 = arg9;
        this.field2340 = arg7;
        this.field2334 = arg0;
        this.field2345 = arg2;
        this.field2343 = arg10;
        this.field2337 = arg4;
        this.field2342 = arg3;
        this.field2335 = arg6;
        this.field2338 = arg1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)Lph;")
    public final class598 method474(int arg0) {
        field2333++;
        return arg0 == 6686 ? class699.field9833 : null;
    }
}
