import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class317 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "B")
    public byte field4661;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    private int field4668;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public int field4675;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public int field4678;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lqfa;")
    public static class85 field4662 = new class85(50, 7);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "F")
    public static float field4659;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public int field4664;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public int field4670;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public int field4673;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public int field4676;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public int field4680;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public int field4682;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Ltk;")
    public class317 field4665;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Ldp;")
    public static class3 field4663;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "Lrf;")
    public static class75 field4681;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBII)Ltk;")
    public final class317 method2043(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -47) {
            method2044(-91);
        }
        field4674++;
        return new class317(this.field4668, arg3, arg0, arg2, this.field4661);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static final void method2044(int arg0) {
        field4669++;
        class540.method3118(class527.field7429.field2673, -20476);
        int var1 = (class33.field967 >> 3) + (class206.field3158 >> 12);
        int var2 = (class537.field7518 >> 12) + (class323.field4749 >> 3);
        if (arg0 < 107) {
            method2044(100);
        }
        class37.field1046 = class532.field7456.field9814 = 0;
        class532.field7456.method3445(-30426, 8, 8);
        byte var3 = 18;
        class81.field1589 = new byte[var3][];
        class221.field3340 = new byte[var3][];
        class600.field8603 = new int[var3];
        class304.field4509 = new byte[var3][];
        class607.field8843 = new int[var3];
        class253.field3756 = new int[var3][4];
        class335.field5019 = new int[var3];
        class213.field3252 = new int[var3];
        class251.field3744 = new int[var3];
        class408.field5904 = new byte[var3][];
        class118.field2100 = new int[var3];
        class520.field7366 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (var1 - (class675.field9604 >> 4)) / 8; var5 <= (((class675.field9604 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class218.field3316 >> 4)) / 8; var8 <= ((class218.field3316 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class335.field5019[var4] = var9;
                class607.field8843[var4] = class13.field722.method2228("m" + var5 + "_" + var8, 5781);
                class251.field3744[var4] = class13.field722.method2228("l" + var5 + "_" + var8, 5781);
                class213.field3252[var4] = class13.field722.method2228("n" + var5 + "_" + var8, 5781);
                class118.field2100[var4] = class13.field722.method2228("um" + var5 + "_" + var8, 5781);
                class600.field8603[var4] = class13.field722.method2228("ul" + var5 + "_" + var8, 5781);
                if (class213.field3252[var4] == -1) {
                    class607.field8843[var4] = -1;
                    class251.field3744[var4] = -1;
                    class118.field2100[var4] = -1;
                    class600.field8603[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class213.field3252.length; var6++) {
            class213.field3252[var6] = -1;
            class607.field8843[var6] = -1;
            class251.field3744[var6] = -1;
            class118.field2100[var6] = -1;
            class600.field8603[var6] = -1;
        }
        byte var7;
        if (class199.field3098 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class138.method1133(var7, (byte) -16, false, var1, var2);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static final void method2045(int arg0) {
        field4677++;
        if (arg0 > -82) {
            field4681 = null;
        }
        class601.field8616.method1913(true);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
    public static void method2046(int arg0) {
        field4663 = null;
        int var1 = -92 % ((-arg0 - 55) / 33);
        field4662 = null;
        field4681 = null;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Lwf;")
    public final class121 method2047(int arg0) {
        if (arg0 == 8) {
            field4672++;
            return class381.method2375(this.field4668, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIIIB)V")
    public class317(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4661 = arg4;
        this.field4668 = arg0;
        this.field4675 = arg2;
        this.field4667 = arg1;
        this.field4678 = arg3;
    }
}
