import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class716 {

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "B")
    private byte field10001;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public int field10009;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public int field10010;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public int field10008;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public int field10004;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public int field10000;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "Z")
    public static boolean field9999 = false;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field10003;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public static int field10006;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)I", line = 14)
    public final int method3987(boolean arg0) {
        if (arg0) {
            method3988(false);
        }
        field10006++;
        return this.field10001 & 0x7;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Z)I", line = 27)
    public static final int method3988(boolean arg0) {
        field10005++;
        if (class388.field5420 == 1) {
            return class278.field4016;
        } else {
            if (arg0) {
                field9999 = true;
            }
            return class483.field6679;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILha;IIII)V", line = 44)
    public static final void method3989(int arg0, int arg1, class475 arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((class27.field281 == null || class431.field6017 == null || class303.field4359 == null) && class176.field2648.method3005(class211.field3087, (byte) -69) && class176.field2648.method3005(class265.field3743, (byte) -69) && class176.field2648.method3005(class655.field9256, (byte) -69)) {
            class418 var7 = class418.method2468(class176.field2648, class265.field3743, 0);
            class431.field6017 = arg2.method487(var7, true);
            var7.method2461();
            class215.field3139 = arg2.method487(var7, true);
            class27.field281 = arg2.method487(class418.method2468(class176.field2648, class211.field3087, 0), true);
            class418 var8 = class418.method2468(class176.field2648, class655.field9256, 0);
            class303.field4359 = arg2.method487(var8, true);
            var8.method2461();
            class26.field279 = arg2.method487(var8, true);
        }
        field10007++;
        if (arg3 != 2 || class27.field281 == null || class431.field6017 == null || class303.field4359 == null) {
            return;
        }
        int var9 = (arg1 - class303.field4359.method16() * 2) / class27.field281.method16();
        for (int var10 = 0; var10 < var9; var10++) {
            class27.field281.method759(arg6 + (class303.field4359.method16() + (var10 * class27.field281.method16())), -class27.field281.method5() + arg4 + arg5);
        }
        int var11 = ((arg4 - arg0) - class303.field4359.method5()) / class431.field6017.method5();
        for (int var12 = 0; var12 < var11; var12++) {
            class431.field6017.method759(arg6, var12 * class431.field6017.method5() + arg5 + arg0);
            class215.field3139.method759(arg1 + arg6 - class215.field3139.method16(), arg0 + arg5 + class431.field6017.method5() * var12);
        }
        class303.field4359.method759(arg6, arg4 + arg5 - class303.field4359.method5());
        class26.field279.method759((arg6 + arg1) - class303.field4359.method16(), arg4 + arg5 + -class303.field4359.method5());
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILjava/lang/String;)V", line = 106)
    public static final void method3990(int arg0, String arg1) {
        field10002++;
        class302 var2 = class99.method815(-18016);
        var2.field4341.method2524(false, class260.field3696.field9792);
        var2.field4341.method2546(true, 0);
        int var3 = var2.field4341.field5983;
        if (arg0 > -11) {
            return;
        }
        var2.field4341.method2546(true, 643);
        int[] var4 = class14.method168((byte) -122, var2);
        int var5 = var2.field4341.field5983;
        var2.field4341.method2566(-2, arg1);
        var2.field4341.method2524(false, class423.field5892);
        var2.field4341.field5983 += 7;
        var2.field4341.method2583(var2.field4341.field5983, var4, -79, var5);
        var2.field4341.method2516(var2.field4341.field5983 - var3, true);
        class501.method2928(0, var2);
        class578.field8333 = 0;
        class100.field1492 = 1;
        class624.field8862 = 0;
        class657.field9273 = -3;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)I", line = 138)
    public final int method3991(byte arg0) {
        if (arg0 == 41) {
            field10003++;
            return (this.field10001 & 0x8) == 8 ? 1 : 0;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V", line = 149)
    public class716() {
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lol;)V", line = 151)
    public class716(class431 arg0) {
        this.field10001 = arg0.method2529(117);
        this.field10009 = arg0.method2565((byte) -85);
        this.field10010 = arg0.method2526(17);
        this.field10008 = arg0.method2526(17);
        this.field10004 = arg0.method2526(17);
        this.field10000 = arg0.method2526(17);
    }
}
