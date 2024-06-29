import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class197 extends class32 {

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "Ldk;")
    private class275 field3470;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILqk;)Lqk;")
    public final class207 method1366(int arg0, int arg1, class207 arg2) {
        field3462++;
        if (this.field3470 == null) {
            return arg2;
        }
        class165 var4 = (class165) this.field3470.method1867((long) arg1, true);
        if (arg0 == 1) {
            return var4 == null ? arg2 : var4.field2921;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLv;)V")
    public final void method1367(boolean arg0, class149 arg1) {
        while (true) {
            int var3 = arg1.method1045((byte) 78);
            if (var3 == 0) {
                if (arg0) {
                    this.field3470 = null;
                }
                field3467++;
                return;
            }
            this.method1369(-20, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZI)V")
    public static final void method1368(int arg0, int arg1, boolean arg2, int arg3) {
        field3469++;
        if (class32.field653 != 0 && arg1 != 0 && class242.field4404 < 50 && arg3 != -1) {
            class162.field2868[class242.field4404] = arg3;
            class245.field4435[class242.field4404] = arg1;
            class73.field1344[class242.field4404] = arg0;
            class261.field4656[class242.field4404] = null;
            class285.field5004[class242.field4404] = 0;
            class242.field4404++;
        }
        if (!arg2) {
            field3468 = -15;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILv;I)V")
    private final void method1369(int arg0, class149 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method1045((byte) 106);
            if (this.field3470 == null) {
                int var5 = class54.method408(true, var4);
                this.field3470 = new class275(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1045((byte) -110) == 1;
                int var8 = arg1.method1065((byte) 126);
                class194 var9;
                if (var7) {
                    var9 = new class165(arg1.method1034(-27220));
                } else {
                    var9 = new class178(arg1.method1076(65280));
                }
                this.field3470.method1863((byte) 95, var9, (long) var8);
            }
        }
        field3461++;
        if (arg0 > -8) {
            method1370(39, -104, -128);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
    public static final void method1370(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class100.field1801; var3++) {
            for (int var4 = 0; var4 < class225.field4104; var4++) {
                for (int var5 = 0; var5 < class279.field4908; var5++) {
                    class174 var6 = class82.field1498[var3][var4][var5];
                    if (var6 != null) {
                        class209 var7 = var6.field3136;
                        if (var7 != null && var7.field3704.method1506()) {
                            class155.method1139(var7.field3704, var3, var4, var5, 1, 1);
                            if (var7.field3712 != null && var7.field3712.method1506()) {
                                class155.method1139(var7.field3712, var3, var4, var5, 1, 1);
                                var7.field3704.method1489(var7.field3712, 0, 0, 0, false);
                                var7.field3712 = var7.field3712.method1509(arg0, arg1, arg2);
                            }
                            var7.field3704 = var7.field3704.method1509(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3138; var8++) {
                            class288 var10 = var6.field3140[var8];
                            if (var10 != null && var10.field5136.method1506()) {
                                class155.method1139(var10.field5136, var3, var4, var5, var10.field5146 + 1 - var10.field5150, var10.field5142 - var10.field5140 + 1);
                                var10.field5136 = var10.field5136.method1509(arg0, arg1, arg2);
                            }
                        }
                        class246 var9 = var6.field3152;
                        if (var9 != null && var9.field4465.method1506()) {
                            class219.method1556(var9.field4465, var3, var4, var5);
                            var9.field4465 = var9.field4465.method1509(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIB)I")
    public static final int method1371(int arg0, int arg1, byte arg2) {
        field3465++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg2 >= -37) {
            return -119;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lqk;II)V")
    public static final void method1372(class207 arg0, int arg1, int arg2) {
        if (arg2 != 30139) {
            method1368(114, -90, true, -12);
        }
        field3464++;
        class90 var3 = class221.method1575(2, arg1, 1651481952);
        var3.method648((byte) -77);
        var3.field1615 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)I")
    public final int method1373(int arg0, int arg1, int arg2) {
        field3471++;
        if (this.field3470 == null) {
            return arg1;
        }
        class178 var4 = (class178) this.field3470.method1867((long) arg2, true);
        if (arg0 == 29491) {
            return var4 == null ? arg1 : var4.field3212;
        } else {
            return 77;
        }
    }
}
