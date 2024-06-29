import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class470 extends OutputStream {

    @OriginalMember(owner = "client!st", name = "e", descriptor = "Lcm;")
    public static class449 field6871 = new class449(7, 8);

    @OriginalMember(owner = "client!st", name = "f", descriptor = "[I")
    public static int[] field6872 = new int[3];

    @OriginalMember(owner = "client!st", name = "h", descriptor = "F")
    public static float field6874;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "[[[I")
    public static int[][][] field6873;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I[I[ILbp;[I)V", line = 10)
    public static final void method2819(int arg0, int[] arg1, int[] arg2, class322 arg3, int[] arg4) {
        field6867++;
        int var5 = 0;
        if (arg0 != 31820) {
            method2819(-67, null, null, null, null);
        }
        while (var5 < arg2.length) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg3.field5288.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field5288[var9] = null;
                    } else {
                        class270 var10 = class260.field3621.method1934(114, var6);
                        int var11 = var10.field3735;
                        class113 var12 = arg3.field5288[var9];
                        if (var12 != null) {
                            if (var12.field1587 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field5288[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1574 = 0;
                                    var12.field1583 = var8;
                                    var12.field1585 = 0;
                                    var12.field1579 = 0;
                                    var12.field1586 = 1;
                                    class445.method2678(class339.field5365 == arg3, 0, arg3.field2210, var10, arg3.field2217, (byte) -117, arg3.field2215);
                                } else if (var11 == 2) {
                                    var12.field1574 = 0;
                                }
                            } else if (var10.field3756 >= class260.field3621.method1934(120, var12.field1587).field3756) {
                                var12 = arg3.field5288[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class113 var13 = arg3.field5288[var9] = new class113();
                            var13.field1579 = 0;
                            var13.field1574 = 0;
                            var13.field1587 = var6;
                            var13.field1585 = 0;
                            var13.field1583 = var8;
                            var13.field1586 = 1;
                            class445.method2678(class339.field5365 == arg3, 0, arg3.field2210, var10, arg3.field2217, (byte) -123, arg3.field2215);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V", line = 106)
    public static void method2820(byte arg0) {
        if (arg0 != -110) {
            field6873 = null;
        }
        field6873 = null;
        field6871 = null;
        field6872 = null;
    }

    @OriginalMember(owner = "client!st", name = "write", descriptor = "(I)V", line = 122)
    public final void write(int arg0) throws IOException {
        field6869++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/Object;IZI)[B", line = 133)
    public static final byte[] method2821(Object arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field6871 = null;
        }
        field6870++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class407.method2486(arg3, 20779, arg1, var4);
        } else if (arg0 instanceof class323) {
            class323 var5 = (class323) arg0;
            return var5.method1634(58, arg1, arg3);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
