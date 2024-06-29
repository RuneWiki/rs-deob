import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class34 extends class139 {

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    private int field659 = 0;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    private int field663 = 4096;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "Lrf;")
    public static class163 field665 = class53.method392(92, "(U4");

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "Lrf;")
    public static class163 field667 = class53.method392(-86, "<)4col>");

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lub;")
    public static final class186 method216(Throwable arg0, String arg1) {
        ++field657;
        class186 var2;
        if (!(arg0 instanceof class186)) {
            var2 = new class186(arg0, arg1);
        } else {
            var2 = (class186) arg0;
            var2.field3705 = var2.field3705 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(II)Lrf;")
    public static final class163 method217(int arg0, int arg1) {
        ++field660;
        if (arg1 >= -37) {
            method216((Throwable) null, (String) null);
        }
        return class103.method705((byte) -17, false, arg0, 10);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field668;
        if (arg1 != 7451) {
            field661 = 99;
        }
        int[] var3 = super.field2859.method1319(-104, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0, 0, true);
            for (int var5 = 0; ~class23.field402 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field659 && ~this.field663 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public static void method218(int arg0) {
        int var1 = 66 / ((7 - arg0) / 50);
        field667 = null;
        field665 = null;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBII)I")
    public static final int method219(int arg0, byte arg1, int arg2, int arg3) {
        ++field664;
        int var4 = 256 - arg3;
        return arg1 < 84 ? 57 : ((arg0 & 16711935) * var4 + (arg2 & 16711935) * arg3 & -16711936) - -((65280 & arg0) * var4 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZILu;III)V")
    public static final void method220(boolean arg0, int arg1, class184 arg2, int arg3, int arg4, int arg5) {
        int var6 = -128 / ((arg3 - 34) / 58);
        class51.field1024 = arg5;
        class209.field4074 = arg1;
        class155.field3210 = arg2;
        ++field662;
        class29.field543 = 10000;
        class155.field3211 = arg0;
        class180.field3611 = 1;
        class158.field3230 = arg4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field663 = arg2.method390((byte) 104);
            }
        } else {
            this.field659 = arg2.method390((byte) 93);
        }
        if (arg1 != 21) {
            this.field663 = -32;
        }
        ++field666;
    }
}
