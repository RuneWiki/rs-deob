import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class425 implements class346 {

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Lpa;")
    private class339 field6469;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Leaa;")
    private class463 field6460;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lui;")
    public static class210 field6463 = new class210(4, 1, 1, 1);

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field6467 = 1;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field6468 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method1066(boolean arg0, int arg1) {
        field6462++;
        if (arg1 != -5506) {
            return;
        }
        class86 var3 = this.field6469.method2320(this.field6460.field6918, (byte) 96);
        if (var3 == null) {
            return;
        }
        int var4 = this.field6460.field6922.method1799(arg1 + 5383, this.field6460.field6917, class585.field8333) + this.field6460.field6911;
        int var5 = this.field6460.field6912.method2550(this.field6460.field6909, true, class95.field1487) + this.field6460.field6910;
        if (this.field6460.field6914) {
            class627.field8857.method344(var4, var5, this.field6460.field6917, this.field6460.field6909, this.field6460.field6923, 0);
        }
        int var6 = var5 + this.method2695(5, var4, 1, class246.field3928, var3.field1050, var5) * 12;
        int var9 = var6 + 8;
        if (this.field6460.field6914) {
            class627.field8857.method345(var4, var9, var4 + this.field6460.field6917 - 1, var9, this.field6460.field6923, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method2695(5, var4, arg1 + 5507, class246.field3928, var3.field1052, var6) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method2695(5, var4, 1, class246.field3928, var3.field1054, var10) * 12;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 37)
    public final void method587(int arg0) {
        field6466++;
        if (arg0 != 22478) {
            field6465 = -43;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 48)
    public static void method2693(byte arg0) {
        field6463 = null;
        int var1 = -21 / ((arg0 + 3) / 37);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)Z", line = 58)
    public final boolean method585(byte arg0) {
        field6464++;
        if (arg0 <= 119) {
            field6465 = -26;
        }
        return this.field6469.method2326(-8522);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lcca;IZZLcca;ZI)I", line = 69)
    public static final int method2694(class226 arg0, int arg1, boolean arg2, boolean arg3, class226 arg4, boolean arg5, int arg6) {
        field6459++;
        int var7 = class180.method1468(arg6, 126, arg3, arg4, arg0);
        if (arg2) {
            method2693((byte) -86);
        }
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class180.method1468(arg1, -72, arg5, arg4, arg0);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILla;Ljava/lang/String;I)I", line = 103)
    private final int method2695(int arg0, int arg1, int arg2, class418 arg3, String arg4, int arg5) {
        if (arg2 != 1) {
            field6463 = null;
        }
        field6461++;
        return arg3.method2658(this.field6460.field6917 - (arg0 * 2), this.field6460.field6913, 0, 0, null, arg5 + arg0, arg4, 0, arg0 + arg1, 78, 0, 0, this.field6460.field6916, null, null, this.field6460.field6909 - arg0 * 2);
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lpa;Leaa;)V", line = 129)
    public class425(class339 arg0, class463 arg1) {
        this.field6469 = arg0;
        this.field6460 = arg1;
    }
}
