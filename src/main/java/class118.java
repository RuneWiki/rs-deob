import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class118 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field1465 = class445.method2680(99);

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Ljava/lang/String;")
    public String field1468;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Ljava/lang/String;")
    public String field1470;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Ljava/lang/String;")
    public String field1474;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Ljava/lang/String;")
    public String field1472;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Ljava/lang/String;")
    public String field1479;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lpa;")
    public static class387 field1471 = new class387(50);

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
    public static boolean field1475 = false;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 7)
    public static void method822(int arg0) {
        if (arg0 != 11745) {
            method827(false);
        }
        field1471 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 24)
    public final void method823(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, String arg6, int arg7, String arg8) {
        this.field1465 = class445.method2680(arg7 + 7966);
        field1466++;
        this.field1474 = arg6;
        if (arg7 != -7847) {
            return;
        }
        this.field1467 = arg4;
        this.field1472 = arg5;
        this.field1476 = arg0;
        this.field1479 = arg1;
        this.field1470 = arg3;
        this.field1468 = arg8;
        this.field1473 = class673.field9441;
        this.field1463 = arg2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)I", line = 44)
    public static final int method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        field1469++;
        if (arg2 != 31197) {
            method826(26);
        }
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg4;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 82)
    public static final void method825(byte arg0) {
        field1477++;
        class336.field4995 = -1;
        class697.field9843 = -1;
        class2.field22 = 0;
        if (arg0 != 103) {
            method825((byte) -87);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 96)
    public static final void method826(int arg0) {
        field1480++;
        if (class535.field7544 == null) {
            return;
        }
        try {
            String var1 = class535.field7544.getParameter("cookiehost");
            int var2 = (int) (class109.method731(31) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            if (arg0 != 29693) {
                field1471 = null;
            }
            class150.method1036("document.cookie=\"" + var3 + "\"", (byte) -101, class535.field7544);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 124)
    public static final void method827(boolean arg0) {
        if (arg0) {
            field1471 = null;
        }
        field1464++;
        class1.method8();
        for (int var1 = 0; var1 < 4; var1++) {
            class234.field3394[var1].method2651(false);
        }
        class281.method1905((byte) 103);
        class497.method2902((byte) 120);
        class49.method325(-3959);
        System.gc();
        class638.field8979.method449();
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 152)
    public class118(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field1468 = arg7;
        this.field1470 = arg4;
        this.field1474 = arg5;
        this.field1467 = arg0;
        this.field1473 = class673.field9441;
        this.field1472 = arg3;
        this.field1479 = arg2;
        this.field1476 = arg6;
        this.field1463 = arg1;
    }
}
