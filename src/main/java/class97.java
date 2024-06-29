import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class97 extends class286 {

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field1395;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "[I")
    public static int[] field1391 = new int[5];

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "[I")
    public static int[] field1392 = new int[200];

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "[I")
    public static int[] field1400 = new int[100];

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1397 = "yellow:";

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BJ)V", line = 15)
    public static final void method723(byte arg0, long arg1) {
        field1390++;
        if (arg1 == 0L) {
            return;
        }
        class85.field1236.method1141((byte) 85, 6);
        class172.field2770++;
        if (arg0 != 79) {
            field1391 = (int[]) null;
        }
        class85.field1236.method1738((byte) 25, arg1);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 32)
    public final Object method724(byte arg0) {
        if (arg0 != -114) {
            this.field1395 = (Object) null;
        }
        field1393++;
        return this.field1395;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(B)V", line = 44)
    public static void method725(byte arg0) {
        field1400 = null;
        field1397 = null;
        if (arg0 >= -82) {
            field1391 = (int[]) null;
        }
        field1392 = null;
        field1391 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 65)
    public class97(Object arg0) {
        this.field1395 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZI)V", line = 74)
    public static final void method726(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 > arg1) {
            for (int var5 = arg1; var5 < arg4; var5++) {
                class79.field1178[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg1; var6++) {
                class79.field1178[var6][arg0] = arg2;
            }
        }
        if (arg3) {
            field1396++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 109)
    public static final boolean method727(String arg0, boolean arg1) {
        if (arg1) {
            return true;
        }
        field1389++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class159.field2416; var2++) {
            if (arg0.equalsIgnoreCase(class309.field4819[var2])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class39.field575.field4218)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)Z", line = 139)
    public final boolean method728(byte arg0) {
        if (arg0 < 11) {
            field1397 = (String) null;
        }
        field1398++;
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 150)
    public static final void method729(int arg0, boolean arg1, String arg2) {
        field1394++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class265.field4128.method2273(arg2, 250);
        int var7 = class265.field4128.method2259(arg2, 250) * 13;
        if (arg0 != 29912) {
            method729(13, false, (String) null);
        }
        if (class73.field1058) {
            class175.method1322(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 0);
            class175.method1320(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 16777215);
        } else {
            class287.method1987(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 - -var3, 0);
            class287.method1981(var4 - var3, var5 - var3, var6 - (-var3 - var3), var3 + var7 - -var3, 16777215);
        }
        class265.field4128.method2266(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class278.method1927(var3 + var3 + var7, -var3 + var4, (byte) -90, var5 - var3, var3 + var6 + var3);
        if (!arg1) {
            class299.method2060((byte) -115, var4, var5, var6, var7);
        } else if (class73.field1058) {
            class73.method545();
        } else {
            try {
                Graphics var8 = class102.field1480.getGraphics();
                class13.field186.method1091(-24418, var8, 0, 0);
            } catch (Exception var10) {
                class102.field1480.repaint();
            }
        }
    }
}
