import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class215 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public int field3428 = -1;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Z")
    public boolean field3429 = true;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public int field3432 = 0;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public int field3436 = -1;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLma;I)V")
    public final void method1504(byte arg0, class202 arg1, int arg2) {
        field3430++;
        if (arg0 != 42) {
            return;
        }
        while (true) {
            int var4 = arg1.method1420((byte) 0);
            if (var4 == 0) {
                return;
            }
            this.method1507(arg2, false, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static final void method1505(boolean arg0) {
        field3433++;
        if (!arg0) {
            return;
        }
        class192.field3042.method1390((byte) -6);
        int var1 = class192.field3042.method1394((byte) 89, 8);
        if (var1 < class14.field195) {
            for (int var2 = var1; var2 < class14.field195; var2++) {
                class261.field4267[class138.field2142++] = class76.field1189[var2];
            }
        }
        if (var1 > class14.field195) {
            throw new RuntimeException("gnpov1");
        }
        class14.field195 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class76.field1189[var3];
            class35 var5 = class76.field1188[var4];
            int var6 = class192.field3042.method1394((byte) 105, 1);
            if (var6 == 0) {
                class76.field1189[class14.field195++] = var4;
                var5.field860 = class4.field32;
            } else {
                int var7 = class192.field3042.method1394((byte) 126, 2);
                if (var7 == 0) {
                    class76.field1189[class14.field195++] = var4;
                    var5.field860 = class4.field32;
                    class208.field3323[class70.field1018++] = var4;
                } else if (var7 == 1) {
                    class76.field1189[class14.field195++] = var4;
                    var5.field860 = class4.field32;
                    int var8 = class192.field3042.method1394((byte) 108, 3);
                    var5.method351(var8, -1834, 1);
                    int var9 = class192.field3042.method1394((byte) 105, 1);
                    if (var9 == 1) {
                        class208.field3323[class70.field1018++] = var4;
                    }
                } else if (var7 == 2) {
                    class76.field1189[class14.field195++] = var4;
                    var5.field860 = class4.field32;
                    if (class192.field3042.method1394((byte) 93, 1) == 1) {
                        int var10 = class192.field3042.method1394((byte) 115, 3);
                        var5.method351(var10, -1834, 2);
                        int var11 = class192.field3042.method1394((byte) 118, 3);
                        var5.method351(var11, -1834, 2);
                    } else {
                        int var12 = class192.field3042.method1394((byte) 118, 3);
                        var5.method351(var12, -1834, 0);
                    }
                    int var13 = class192.field3042.method1394((byte) 113, 1);
                    if (var13 == 1) {
                        class208.field3323[class70.field1018++] = var4;
                    }
                } else if (var7 == 3) {
                    class261.field4267[class138.field2142++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ)V")
    public static final void method1506(byte arg0, boolean arg1) {
        field3435++;
        class217.method1521(1);
        if (class115.field1733 != 30 && class115.field1733 != 25 || arg0 != 59) {
            return;
        }
        class241.field3813++;
        if (class241.field3813 < 50 && !arg1) {
            return;
        }
        class241.field3813 = 0;
        if (!class311.field5021 && class103.field1551 != null) {
            class22.field287++;
            class276.field4572.method1391(arg0 - 59, 164);
            try {
                class103.field1551.method1275(0, true, class276.field4572.field3272, class276.field4572.field3234);
                class276.field4572.field3272 = 0;
            } catch (IOException var2) {
                class311.field5021 = true;
            }
        }
        class217.method1521(1);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZILma;)V")
    private final void method1507(int arg0, boolean arg1, int arg2, class202 arg3) {
        if (arg1) {
            this.field3429 = true;
        }
        field3434++;
        if (arg2 == 1) {
            this.field3432 = class300.method2076((byte) 110, arg3.method1401((byte) -90));
        } else if (arg2 == 2) {
            this.field3436 = arg3.method1420((byte) 0);
        } else if (arg2 == 3) {
            this.field3436 = arg3.method1419(113);
            if (this.field3436 == 65535) {
                this.field3436 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field3429 = false;
        } else if (arg2 == 7) {
            this.field3428 = class300.method2076((byte) 114, arg3.method1401((byte) -86));
            return;
        } else if (arg2 == 8) {
            class252.field3995 = arg0;
            return;
        } else {
            if (arg2 == 9) {
                arg3.method1419(69);
            } else if (arg2 != 10) {
                if (arg2 == 11) {
                    arg3.method1420((byte) 0);
                } else if (arg2 != 12) {
                    if (arg2 == 13) {
                        arg3.method1401((byte) -112);
                    } else if (arg2 == 14) {
                        arg3.method1420((byte) 0);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
    }
}
