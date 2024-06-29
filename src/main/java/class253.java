import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class253 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3984 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lah;")
    public static class126 field3987;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 6)
    public static void method1746(int arg0) {
        int var1 = 29 / ((58 - arg0) / 56);
        field3987 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lwb;IIIZ)V", line = 14)
    public void method184(class253 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3985++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lwb;", line = 24)
    public class253 method200(int arg0, int arg1, int arg2) {
        field3988++;
        return this;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)I", line = 40)
    public static final int method1747(byte arg0, int arg1) {
        if (arg0 > -13) {
            return 97;
        } else {
            field3983++;
            return (arg1 & 0x3FC39) >> 11;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIZ)V", line = 55)
    public static final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field3986++;
        if (arg1 > arg4) {
            arg4 = 1;
        }
        if (class94.field1516) {
            int var6 = arg0 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class53.field889 - class298.field4601) * var6 / 100 + class298.field4601;
            if (var7 < class10.field129) {
                var7 = class10.field129;
            } else if (class131.field2051 < var7) {
                var7 = class131.field2051;
            }
            int var8 = arg0 * var7 * 512 / (arg4 * 334);
            if (var8 < class70.field1138) {
                short var9 = class70.field1138;
                var7 = arg4 * var9 * 334 / (arg0 * 512);
                if (var7 > class131.field2051) {
                    var7 = class131.field2051;
                    int var10 = arg0 * 512 * var7 / (var9 * 334);
                    int var11 = (arg4 - var10) / 2;
                    if (arg5) {
                        class167.method1191();
                        class167.method1186(arg3, arg2, var11, arg0, 0);
                        class167.method1186(arg4 + arg3 - var11, arg2, var11, arg0, 0);
                    }
                    arg4 -= var11 * 2;
                    arg3 += var11;
                }
            } else if (var8 > class16.field231) {
                short var12 = class16.field231;
                var7 = var12 * 334 * arg4 / (arg0 * 512);
                if (var7 < class10.field129) {
                    var7 = class10.field129;
                    int var13 = var12 * 334 * arg4 / (var7 * 512);
                    int var14 = (arg0 - var13) / 2;
                    if (arg5) {
                        class167.method1191();
                        class167.method1186(arg3, arg2, arg4, var14, 0);
                        class167.method1186(arg3, arg0 + arg2 - var14, arg4, var14, 0);
                    }
                    arg0 -= var14 * 2;
                    arg2 += var14;
                }
            }
            class73.field1196 = arg0 * var7 / 334;
        }
        class260.field4081 = (short) arg4;
        class52.field880 = arg2;
        class256.field4006 = (short) arg0;
        class212.field3234 = arg3;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()Z", line = 151)
    public boolean method162() {
        field3982++;
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public abstract void method71(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIIJILvh;)V")
    public abstract void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
    public abstract int method76();
}
