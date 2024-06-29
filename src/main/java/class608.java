import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class608 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public int field8954;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lnj;")
    public static class487 field8957 = new class487("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field8960 = 0;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIILvo;I)V", line = 3)
    public static final void method3536(int arg0, int arg1, int arg2, int arg3, class434 arg4, int arg5) {
        field8959++;
        if (arg4.field6351 == -1 && arg4.field6370 == null) {
            return;
        }
        int var6 = 0;
        if (arg0 > arg4.field6354) {
            var6 += arg0 - arg4.field6354;
        } else if (arg0 < arg4.field6363) {
            var6 += arg4.field6363 - arg0;
        }
        int var7 = class94.field1158.field303 * arg4.field6357 >> 8;
        if (arg3 > arg4.field6350) {
            var6 += arg3 - arg4.field6350;
        } else if (arg3 < arg4.field6369) {
            var6 += arg4.field6369 - arg3;
        }
        if (arg4.field6367 == 0 || (var6 - 64) > arg4.field6367 || class94.field1158.field303 == 0 || arg4.field6352 != arg1) {
            if (arg4.field6356 != null) {
                class105.field1321.method2085(arg4.field6356);
                arg4.field6356 = null;
            }
            if (arg4.field6348 != null) {
                class105.field1321.method2085(arg4.field6348);
                arg4.field6348 = null;
            }
            return;
        }
        int var8 = var6 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = (arg4.field6367 - var8) * var7 / arg4.field6367;
        if (arg4.field6356 != null) {
            arg4.field6356.method1412(var9);
        } else if (arg4.field6351 >= 0) {
            class48 var10 = class48.method248(class197.field2968, arg4.field6351, 0);
            if (var10 != null) {
                class5 var11 = var10.method246().method23(class371.field5359);
                class217 var12 = class217.method1408(var11, 100, var9);
                var12.method1417(-1);
                class105.field1321.method2083(var12);
                arg4.field6356 = var12;
            }
        }
        if (arg4.field6348 != null) {
            arg4.field6348.method1412(var9);
            if (arg4.field6348.method2994(109)) {
                return;
            }
            arg4.field6348 = null;
        } else if (arg4.field6370 != null && (arg4.field6371 -= arg5) <= 0) {
            int var13 = (int) ((double) arg4.field6370.length * Math.random());
            class48 var14 = class48.method248(class197.field2968, arg4.field6370[var13], 0);
            if (var14 != null) {
                class5 var15 = var14.method246().method23(class371.field5359);
                class217 var16 = class217.method1408(var15, 100, var9);
                var16.method1417(0);
                class105.field1321.method2083(var16);
                arg4.field6371 = arg4.field6349 + (int) ((double) (arg4.field6366 - arg4.field6349) * Math.random());
                arg4.field6348 = var16;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V", line = 136)
    public static final void method3537(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field5985 != null) {
            var3.field5985 = null;
        }
        if (var3.field5989 != null) {
            var3.field5989 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 149)
    public static void method3538(byte arg0) {
        field8957 = null;
        if (arg0 != 61) {
            method3536(-82, 118, -109, -43, null, -57);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(II)V", line = 165)
    public class608(int arg0, int arg1) {
        this.field8954 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)I", line = 175)
    public static final int method3539(byte arg0) {
        if (arg0 >= -78) {
            method3537(114, 5, 42);
        }
        field8956++;
        return class461.field6673;
    }

    @OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;", line = 190)
    public final String toString() {
        field8955++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I", line = 198)
    public static final int method3540(int arg0) {
        field8958++;
        if (arg0 <= 117) {
            method3536(34, -109, 50, -95, null, 81);
        }
        if (class644.field9345 == null) {
            return class2.field13 ? 2 : 1;
        } else {
            return 3;
        }
    }
}
