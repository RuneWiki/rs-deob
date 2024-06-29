import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class686 extends class219 {

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
    public int field9730 = 0;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "Lga;")
    public static class420 field9727 = new class420();

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lpw;I)Z", line = 3)
    public static final boolean method3870(class733 arg0, int arg1) {
        field9731++;
        if (arg1 == 0) {
            return arg0 == null ? false : class357.method2250(arg0.field10238 - arg0.field10231, arg0.field10239, arg0.field10231, arg0.field10228 - arg0.field10239, arg0.field10229, arg0.field10221 - arg0.field10229, (byte) -56);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lrv;II)V", line = 18)
    private final void method3871(class120 arg0, int arg1, int arg2) {
        field9732++;
        int var4 = 79 / ((-arg2 - 28) / 55);
        if (arg1 == 2) {
            this.field9730 = arg0.method898((byte) -99);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lrv;I)V", line = 33)
    public final void method3872(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                if (arg1 != 1) {
                    method3870(null, -39);
                }
                field9729++;
                return;
            }
            this.method3871(arg0, var3, arg1 + 100);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V", line = 54)
    public static void method3873(int arg0) {
        if (arg0 < 98) {
            field9727 = null;
        }
        field9727 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V", line = 65)
    public static final void method3874(byte arg0) {
        class26.field371.method2137(1112311075);
        field9728++;
        int var1 = class26.field371.method2138(8, (byte) -105);
        if (var1 < class26.field379) {
            for (int var2 = var1; var2 < class26.field379; var2++) {
                class113.field1415[class276.field3843++] = class790.field10846[var2];
            }
        }
        if (class26.field379 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class26.field379 = 0;
        if (arg0 >= -77) {
            field9727 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class790.field10846[var3];
            class645 var5 = ((class14) class543.field7606.method380((byte) -3, (long) var4)).field262;
            int var6 = class26.field371.method2138(1, (byte) -105);
            if (var6 == 0) {
                class790.field10846[class26.field379++] = var4;
                var5.field6401 = class153.field2277;
            } else {
                int var7 = class26.field371.method2138(2, (byte) -105);
                if (var7 == 0) {
                    class790.field10846[class26.field379++] = var4;
                    var5.field6401 = class153.field2277;
                    class70.field960[class747.field10380++] = var4;
                } else if (var7 == 1) {
                    class790.field10846[class26.field379++] = var4;
                    var5.field6401 = class153.field2277;
                    int var8 = class26.field371.method2138(3, (byte) -105);
                    var5.method3685(1, var8, 6696);
                    int var9 = class26.field371.method2138(1, (byte) -105);
                    if (var9 == 1) {
                        class70.field960[class747.field10380++] = var4;
                    }
                } else if (var7 == 2) {
                    class790.field10846[class26.field379++] = var4;
                    var5.field6401 = class153.field2277;
                    if (class26.field371.method2138(1, (byte) -105) == 1) {
                        int var11 = class26.field371.method2138(3, (byte) -105);
                        var5.method3685(2, var11, 6696);
                        int var12 = class26.field371.method2138(3, (byte) -105);
                        var5.method3685(2, var12, 6696);
                    } else {
                        int var10 = class26.field371.method2138(3, (byte) -105);
                        var5.method3685(0, var10, 6696);
                    }
                    int var13 = class26.field371.method2138(1, (byte) -105);
                    if (var13 == 1) {
                        class70.field960[class747.field10380++] = var4;
                    }
                } else if (var7 == 3) {
                    class113.field1415[class276.field3843++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILwq;)Lwq;", line = 183)
    public static final class176 method3875(int arg0, class176 arg1) {
        field9733++;
        if (arg1.field2661 != -1) {
            return class518.method3014(arg1.field2661, -39);
        }
        int var2 = arg1.field2588 >>> 16;
        if (arg0 != 3) {
            field9727 = null;
        }
        class209 var3 = new class209(class251.field3547);
        for (class329 var4 = (class329) var3.method1484((byte) -84); var4 != null; var4 = (class329) var3.method1483((byte) -61)) {
            if (var4.field4912 == var2) {
                return class518.method3014((int) var4.field7577, -86);
            }
        }
        return null;
    }
}
