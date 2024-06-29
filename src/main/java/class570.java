import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class570 extends class606 {

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 7)
    public final void method521(byte arg0) {
        ++field8088;
        int var2 = 18 / ((arg0 - -26) / 56);
        super.field8525.method1623(122, false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLag;)V", line = 17)
    public static final void method3278(byte arg0, class682 arg1) {
        arg1.method3831(7);
        ++field8092;
        int var2 = class389.field5512;
        class280 var3 = class660.field9039 = class309.field4311[var2] = new class280();
        var3.field7958 = var2;
        int var4 = arg1.method3821(30, (byte) 108);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (268420514 & var4) >> 14;
        var3.field8009[0] = -class228.field3063 + var6;
        int var7 = 16383 & var4;
        var3.field1264 = (var3.field8009[0] << 9) - -(var3.method1835((byte) 127) << 8);
        var3.field8015[0] = -class3.field30 + var7;
        var3.field1250 = (var3.field8015[0] << 9) - -(var3.method1835((byte) 127) << 8);
        class526.field7430 = var3.field1266 = var3.field1258 = var5;
        if (class364.method2319((byte) -110, var3.field8009[0], var3.field8015[0])) {
            ++var3.field1258;
        }
        if (class522.field7398[var2] != null) {
            var3.method1833(class522.field7398[var2], 116);
        }
        class578.field8168 = 0;
        class240.field3201[class578.field8168++] = var2;
        class155.field2173[var2] = 0;
        class588.field8290 = 0;
        if (arg0 >= 3) {
            for (int var8 = 1; ~var8 > -2049; ++var8) {
                if (var2 != var8) {
                    int var9 = arg1.method3821(18, (byte) 108);
                    int var10 = var9 >> 16;
                    int var11 = 255 & var9 >> 8;
                    int var12 = 255 & var9;
                    class408 var13 = class711.field9886[var8] = new class408();
                    var13.field5778 = -1;
                    var13.field5776 = (var10 << 28) - -(var11 << 14) + var12;
                    var13.field5779 = 0;
                    var13.field5782 = false;
                    class179.field2402[class588.field8290++] = var8;
                    class155.field2173[var8] = 0;
                }
            }
            arg1.method3827((byte) 125);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIIZ)V", line = 94)
    public static final void method3279(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        ++field8093;
        if (class393.method2476(104, arg2)) {
            if (!arg1) {
                field8090 = -91;
            }
            class336.method2184((byte) -102, class37.field475[arg2], arg0, -1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)Z", line = 110)
    public final boolean method525(int arg0) {
        ++field8087;
        if (arg0 < 19) {
            this.method517(false, -43);
        }
        return true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lma;II)V", line = 122)
    public final void method523(class12 arg0, int arg1, int arg2) {
        if (arg2 == 3) {
            ++field8091;
            super.field8525.method1663(arg0, arg2 + -5);
            super.field8525.method1628((byte) 117, arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V", line = 134)
    public final void method516(int arg0, int arg1, int arg2) {
        if (arg1 >= 91) {
            ++field8086;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lsr;)V", line = 144)
    public class570(class251 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V", line = 148)
    public final void method517(boolean arg0, int arg1) {
        super.field8525.method1623(117, true);
        if (arg1 <= -64) {
            ++field8094;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V", line = 159)
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            this.method517(true, 81);
        }
        ++field8089;
    }
}
