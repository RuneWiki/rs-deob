import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public abstract class class1 {

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Lfh;")
    public static class567 field1 = new class567();

    @OriginalMember(owner = "client!us", name = "h", descriptor = "Ldb;")
    public static class272 field8 = new class272(11, 0, 1, 2);

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "Lkea;")
    public static class203 field2;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "Lgh;")
    public static class476 field5;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 11)
    public static void method2(int arg0) {
        field2 = null;
        field5 = null;
        field8 = null;
        if (arg0 != 65280) {
            field4 = -100;
        }
        field1 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)I", line = 29)
    public static final int method3(int arg0, int arg1, int arg2) {
        field3++;
        int var3 = arg2 >>> 24;
        if (arg0 > -124) {
            field4 = -3;
        }
        int var4 = ((arg2 & 0xFF00) * var3 & 0xFF0000 | (arg2 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - var3;
        return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZBI)I", line = 51)
    public static final int method4(boolean arg0, byte arg1, int arg2) {
        field7++;
        if (arg0) {
            return 0;
        }
        class594 var3 = class581.method3372(arg0, arg2, -58);
        if (var3 == null) {
            return class81.field904.method3722(arg2, 5).field4738;
        }
        int var4 = 0;
        if (arg1 > -41) {
            method5(null, -29, -11);
        }
        for (int var5 = 0; var5 < var3.field8680.length; var5++) {
            if (var3.field8680[var5] == -1) {
                var4++;
            }
        }
        return var4 + class81.field904.method3722(arg2, 5).field4738 - var3.field8680.length;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([FII)[F", line = 87)
    public static final float[] method5(float[] arg0, int arg1, int arg2) {
        if (arg1 == -21147) {
            field6++;
            float[] var3 = new float[arg2];
            class210.method1328(arg0, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Len;B)Len;")
    public abstract class269 method1(class269 arg0, byte arg1);
}
