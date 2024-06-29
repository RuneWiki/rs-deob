import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class32 {

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Ltl;")
    public static class566 field446 = new class566();

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field454 = 0;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lga;")
    public static class332 field449;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lwq;")
    public static class378 field447;

    @OriginalMember(owner = "client!lg", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field457++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLkba;I)V", line = 13)
    public static final void method194(boolean arg0, class573 arg1, int arg2) {
        field451++;
        if (class137.field1873 >= 400) {
            return;
        }
        if (class408.field5369 != arg1) {
            String var3;
            if (arg1.field7796 == 0) {
                boolean var4 = true;
                if (class408.field5369.field7801 != -1 && arg1.field7801 != -1) {
                    int var5 = class408.field5369.field7795 > arg1.field7795 ? class408.field5369.field7795 : arg1.field7795;
                    int var6 = arg1.field7801 > class408.field5369.field7801 ? class408.field5369.field7801 : arg1.field7801;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class408.field5369.field7795 - arg1.field7795;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class678.field9636 == class508.field7015 ? class371.field4909.method2141(class422.field5539, true) : class371.field4907.method2141(class422.field5539, true);
                if (arg1.field7804 > arg1.field7795) {
                    var3 = arg1.method3173(true, (byte) 0) + (var4 ? class312.method1832(arg1.field7795, class408.field5369.field7795, (byte) -17) : "<col=ffffff>") + " (" + var9 + arg1.field7795 + "+" + (arg1.field7804 - arg1.field7795) + ")";
                } else {
                    var3 = arg1.method3173(true, (byte) 0) + (var4 ? class312.method1832(arg1.field7795, class408.field5369.field7795, (byte) -54) : "<col=ffffff>") + " (" + var9 + arg1.field7795 + ")";
                }
            } else if (arg1.field7796 == -1) {
                var3 = arg1.method3173(true, (byte) 0);
            } else {
                var3 = arg1.method3173(true, (byte) 0) + " (" + class371.field4908.method2141(class422.field5539, true) + arg1.field7796 + ")";
            }
            if (class38.field507 && !arg0 && (class544.field7442 & 0x8) != 0) {
                class232.field3102++;
                class592.method3274(false, true, -1, 22, class418.field5499, false, (long) arg1.field3010, class101.field1208, 0, 0, class209.field2788 + " -> <col=ffffff>" + var3);
            }
            if (arg0) {
                class592.method3274(false, false, 0, -1, "<col=cccccc>" + var3, true, 0L, -1, 0, 0, "");
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class18.field229[var10] != null) {
                        short var11 = 0;
                        if (class510.field7101 == class508.field7015 && class18.field229[var10].equalsIgnoreCase(class371.field4902.method2141(class422.field5539, true))) {
                            if (arg1.field7795 > class408.field5369.field7795) {
                                var11 = 2000;
                            }
                            if (class408.field5369.field7807 != 0 && arg1.field7807 != 0) {
                                if (class408.field5369.field7807 == arg1.field7807) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class31.field431[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class78.field915[var10] + var11);
                        int var13 = class557.field7599[var10] == -1 ? class440.field5831 : class557.field7599[var10];
                        class592.method3274(false, true, -1, var12, class18.field229[var10], false, (long) arg1.field3010, var13, 0, 0, "<col=ffffff>" + var3);
                        class94.field1134++;
                    }
                }
            }
            if (arg2 == -17386 && !arg0) {
                for (class354 var14 = (class354) class101.field1211.method2506(arg2 ^ 0xFFFFBC52); var14 != null; var14 = (class354) class101.field1211.method2505(-118)) {
                    if (var14.field4729 == 12) {
                        var14.field4724 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class38.field507 && (class544.field7442 & 0x10) != 0) {
            class81.field941++;
            class592.method3274(false, true, -1, 57, class418.field5499, false, 0L, class101.field1208, 0, 0, class209.field2788 + " -> <col=ffffff>" + class371.field4916.method2141(class422.field5539, true));
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V", line = 169)
    public static final void method195(boolean arg0, int arg1, String arg2, String arg3) {
        class299.field3960 = arg3;
        class351.field4683 = arg0;
        field443++;
        class213.field2815 = arg2;
        if (!class351.field4683 && class378.field5005 != 3 && (class213.field2815.equals("") || class299.field3960.equals(""))) {
            class126.method747(3, (byte) 34);
            return;
        }
        if (arg1 != 11703) {
            field454 = -23;
        }
        class447.field5920 = false;
        if (class378.field5005 != 1) {
            class504.field6939 = -1;
            class72.field861 = 0;
        }
        class126.method747(-3, (byte) 34);
        class21.field270 = 0;
        class420.field5513 = 1;
        class347.field4631 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 200)
    public static void method196(int arg0) {
        field446 = null;
        field447 = null;
        int var1 = -69 % ((arg0 - 66) / 58);
        field449 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 221)
    public static final void method197(int arg0, String arg1, int arg2) {
        field455++;
        class642.field8867++;
        class229 var3 = class97.method550(class71.field841, false, class613.field8502);
        var3.field2971.method915(arg2 - 31915, class206.method1313((byte) -54, arg1) + arg2);
        var3.field2971.method936(arg1, arg2 ^ 0x6C);
        var3.field2971.method914(5, arg0);
        class307.method1805(var3, arg2 - 14705);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIII)V", line = 239)
    public class32(int arg0, int arg1, int arg2, int arg3) {
        this.field448 = arg3;
        this.field450 = arg2;
        this.field444 = arg1;
        this.field445 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(DB)V", line = 258)
    public static final void method198(double arg0, byte arg1) {
        if (class169.field2420 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class601.field8355[var3] = var4 > 255 ? 255 : var4;
            }
            class169.field2420 = arg0;
        }
        if (arg1 < -93) {
            field452++;
        }
    }
}
