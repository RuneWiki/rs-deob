import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class165 {

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lok;")
    public static class146 field2797 = class235.method1724(-12908, ")4a=");

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lok;")
    public static class146 field2795 = class235.method1724(-12908, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lok;")
    public static class146 field2794 = class235.method1724(-12908, "::pcachesize");

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Z")
    public static boolean field2799 = true;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I", line = 40)
    public static final int method1284(int arg0, int arg1) {
        field2790++;
        if (arg1 != -24867) {
            field2797 = (class146) null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 52)
    public static final void method1285(int arg0) {
        field2789++;
        if (class22.field412 == arg0) {
            return;
        }
        try {
            if (++class15.field284 > 1500) {
                if (class98.field1582 != null) {
                    class98.field1582.method284((byte) 100);
                    class98.field1582 = null;
                }
                if (class91.field1454 >= 1) {
                    class101.field1633 = -5;
                    class22.field412 = 0;
                    return;
                }
                class15.field284 = 0;
                if (class265.field4556 == class147.field2490) {
                    class147.field2490 = class198.field3293;
                } else {
                    class147.field2490 = class265.field4556;
                }
                class22.field412 = 1;
                class91.field1454++;
            }
            if (class22.field412 == 1) {
                class78.field1248 = class232.field3876.method931(class180.field3019, (byte) 43, class147.field2490);
                class22.field412 = 2;
            }
            if (class22.field412 == 2) {
                if (class78.field1248.field4265 == 2) {
                    throw new IOException();
                }
                if (class78.field1248.field4265 != 1) {
                    return;
                }
                class98.field1582 = new class40((Socket) class78.field1248.field4269, class232.field3876);
                class78.field1248 = null;
                class98.field1582.method279(-69, 0, class47.field820.field857, class47.field820.field860);
                if (class142.field2369 != null) {
                    class142.field2369.method1483(true);
                }
                if (class138.field2303 != null) {
                    class138.field2303.method1483(true);
                }
                int var1 = class98.field1582.method280((byte) -36);
                if (class142.field2369 != null) {
                    class142.field2369.method1483(true);
                }
                if (class138.field2303 != null) {
                    class138.field2303.method1483(true);
                }
                if (var1 != 101) {
                    class22.field412 = 0;
                    class101.field1633 = var1;
                    class98.field1582.method284((byte) 114);
                    class98.field1582 = null;
                    return;
                }
                class22.field412 = 3;
            }
            if (class22.field412 == 3) {
                if (class98.field1582.method288(0) < 2) {
                    return;
                }
                int var2 = class98.field1582.method280((byte) -36) << 8 | class98.field1582.method280((byte) -36);
                class300.method2117(var2, -1);
                if (class72.field1178 == -1) {
                    class101.field1633 = 6;
                    class22.field412 = 0;
                    class98.field1582.method284((byte) -119);
                    class98.field1582 = null;
                    return;
                }
                class22.field412 = 0;
                class98.field1582.method284((byte) -125);
                class98.field1582 = null;
                class159.method1248(false);
                return;
            }
        } catch (IOException var4) {
            if (class98.field1582 != null) {
                class98.field1582.method284((byte) 122);
                class98.field1582 = null;
            }
            if (class91.field1454 < 1) {
                class15.field284 = 0;
                class91.field1454++;
                class22.field412 = 1;
                if (class265.field4556 == class147.field2490) {
                    class147.field2490 = class198.field3293;
                } else {
                    class147.field2490 = class265.field4556;
                }
            } else {
                class22.field412 = 0;
                class101.field1633 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lwh;Lld;B)Lhi;", line = 211)
    public static final class286 method1286(class9 arg0, class118 arg1, byte arg2) {
        long var3 = ((long) arg0.field201 << 56) + ((long) arg0.field178 << 32) + (long) ((arg0.field198 - -1 << 16) + arg0.field188);
        if (arg2 != -127) {
            field2795 = (class146) null;
        }
        field2798++;
        class286 var5 = (class286) arg1.method810((byte) -114, var3);
        if (var5 == null) {
            var5 = new class286(arg0.field198, (float) arg0.field188, true, false, arg0.field178);
            arg1.method805(var5, var3, 95);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lok;IZ)V", line = 233)
    public static final void method1287(class146 arg0, int arg1, boolean arg2) {
        field2791++;
        if (arg1 != -1) {
            method1284(96, 26);
        }
        if (!arg2) {
            try {
                class138.field2291.getAppletContext().showDocument(arg0.method1127(class138.field2291.getCodeBase(), (byte) 117), "_top");
            } catch (Exception var6) {
            }
            return;
        }
        if (class271.field4640 && class50.field902) {
            try {
                class111.method751(arg1 ^ 0xFFFFE448, class232.field3876.field2162, new Object[] { arg0.method1127(class138.field2291.getCodeBase(), (byte) 40).toString() }, "openjs");
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class138.field2291.getAppletContext().showDocument(arg0.method1127(class138.field2291.getCodeBase(), (byte) 75), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 299)
    public static void method1288(int arg0) {
        int var1 = -36 / ((arg0 + 59) / 54);
        field2795 = null;
        field2797 = null;
        field2794 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZI)Lr;", line = 322)
    public static final class264 method1289(int arg0, boolean arg1, int arg2) {
        field2792++;
        if (!arg1) {
            method1285(64);
        }
        class264 var3 = class98.method680(arg0, false);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4402 == null || var3.field4402.length <= arg2) {
            return null;
        } else {
            return var3.field4402[arg2];
        }
    }
}
