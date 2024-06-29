import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class307 extends class187 {

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "J")
    public static long field4150 = 0L;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "[I")
    public static int[] field4155 = new int[4096];

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "Llg;")
    public static class20 field4156;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V", line = 3)
    public static final void method1800(byte arg0) {
        field4154++;
        if (class293.field3990 || arg0 >= -8) {
            return;
        }
        if (class165.field2104) {
            class41.field432 = (float) ((int) class41.field432 - 17 & 0xFFFFFFF0);
        } else {
            class125.field1604 += (-class125.field1604 - 12.0F) / 2.0F;
        }
        class293.field3990 = true;
        class69.field726 = true;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V", line = 28)
    public static void method1801(int arg0) {
        if (arg0 != -16) {
            field4156 = null;
        }
        field4155 = null;
        field4156 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILfd;II)V", line = 39)
    public static final void method1802(int arg0, class194 arg1, int arg2, int arg3) {
        field4151++;
        if (class106.field1313 != null || class452.field6586 || arg1 == null || class198.method1059(arg1, arg2 + 13544) == null) {
            return;
        }
        class106.field1313 = arg1;
        class428.field6290 = class198.method1059(arg1, arg2 ^ 0xFFFFCB18);
        class36.field379 = arg3;
        if (arg2 != -13416) {
            method1807(42, 116, 94);
        }
        class279.field3800 = arg0;
        class104.field1280 = false;
        class125.field1600 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;III[Z)Z", line = 71)
    public static final boolean method1803(class307 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class98.field1161 != class275.field3707) {
            int var6 = class272.field3682[arg1].method265(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class54 var8 = class272.field3682[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method265(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method278(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method266(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)V", line = 110)
    public static final void method1804(int arg0, byte arg1, int arg2) {
        class281.field3857.method295(20579, 83);
        if (arg1 < -107) {
            field4157++;
            class402.field5860++;
            class281.field3857.method1378(arg2, (byte) 47);
            class281.field3857.method1360(arg0, -111);
        }
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)V", line = 126)
    public static final void method1805(int arg0) {
        if (arg0 != -16) {
            method1800((byte) -82);
        }
        field4153++;
        if (class110.field1351 != null) {
            class109 var1 = class110.field1351;
            synchronized (class110.field1351) {
                class110.field1351 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lam;Lam;I)V", line = 144)
    public static final void method1806(class286 arg0, class286 arg1, int arg2) {
        class297.field4041 = arg1;
        field4152++;
        class430.field6317 = arg0;
        if (arg2 != 0) {
            method1801(53);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 163)
    public static final void method1807(int arg0, int arg1, int arg2) {
        boolean var3 = class176.field2209[0][arg1][arg2] != null && class176.field2209[0][arg1][arg2].field1139 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class176.field2209[var4][arg1][arg2] == null) {
                class96 var5 = class176.field2209[var4][arg1][arg2] = new class96(var4, arg1, arg2);
                if (var3) {
                    var5.field1137++;
                }
            }
        }
    }
}
