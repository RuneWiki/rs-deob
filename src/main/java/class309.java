import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class309 extends class361 {

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public int field4493 = -1;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public int field4500 = 12800;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public int field4499 = 0;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public int field4505 = 12800;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public int field4508 = 0;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public int field4502 = -1;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "Z")
    public boolean field4509 = true;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Ljava/lang/String;")
    public String field4492;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Ljava/lang/String;")
    public String field4507;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "Lam;")
    public class455 field4504;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "[Lek;")
    public static class357[] field4501;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field4513;

    static {
        new class530("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field4501 = new class357[2048];
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lqf;IZZ)V", line = 8)
    public static final void method1870(class489 arg0, int arg1, boolean arg2, boolean arg3) {
        field4513++;
        if (arg1 != -26349) {
            method1875(-72);
        }
        int var4 = arg0.field6840;
        int var5 = (int) arg0.field7060;
        arg0.method2891(-126);
        if (arg2) {
            class471.method2726(5, var4);
        }
        class455.method2664(var4, (byte) 45);
        class150 var6 = client.method1276(106, var5);
        if (var6 != null) {
            class187.method1190(var6, 117);
        }
        class116.method776((byte) -101);
        if (!arg3 && class472.field6578 != -1) {
            class171.method1071(class472.field6578, 2, 1);
        }
        class469 var7 = new class469(class255.field3763);
        for (class489 var8 = (class489) var7.method2722(0); var8 != null; var8 = (class489) var7.method2720(arg1 + 26475)) {
            if (!var8.method2894(0)) {
                var8 = (class489) var7.method2722(arg1 + 26349);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6835 == 3) {
                int var9 = (int) var8.field7060;
                if ((var9 >>> 16) == var4) {
                    method1870(var8, -26349, true, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 68)
    public static final void method1871(int arg0) {
        class373.field5316.method1096((byte) -78);
        if (arg0 == 1) {
            field4497++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[III)Z", line = 83)
    public final boolean method1872(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field4510++;
        for (class163 var6 = (class163) this.field4504.method2655(15152); var6 != null; var6 = (class163) this.field4504.method2660((byte) 67)) {
            if (var6.method1040(0, arg1, arg4, arg0)) {
                var6.method1039(arg2, arg4, arg0, 124);
                return true;
            }
        }
        if (arg3 != 0) {
            field4511 = -122;
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([IBII)Z", line = 112)
    public final boolean method1873(int[] arg0, byte arg1, int arg2, int arg3) {
        field4506++;
        if (arg1 >= -126) {
            method1875(87);
        }
        for (class163 var5 = (class163) this.field4504.method2655(15152); var5 != null; var5 = (class163) this.field4504.method2660((byte) 67)) {
            if (var5.method1037(arg2, arg3, 0)) {
                var5.method1039(arg0, arg2, arg3, 124);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)Z", line = 138)
    public final boolean method1874(int arg0, int arg1, int arg2) {
        field4495++;
        class163 var4 = (class163) this.field4504.method2655(15152);
        if (arg2 < 3) {
            this.method1874(79, -67, 57);
        }
        while (var4 != null) {
            if (var4.method1037(arg1, arg0, 0)) {
                return true;
            }
            var4 = (class163) this.field4504.method2660((byte) 67);
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V", line = 162)
    public static void method1875(int arg0) {
        field4501 = null;
        if (arg0 != 12800) {
            field4501 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 274)
    public class309(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4492 = arg1;
        this.field4498 = arg3;
        this.field4512 = arg0;
        this.field4493 = arg4;
        this.field4509 = arg5;
        this.field4502 = arg6;
        this.field4507 = arg2;
        if (this.field4502 == 255) {
            this.field4502 = 0;
        }
        this.field4504 = new class455();
    }

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)V", line = 188)
    public final void method1876(int arg0) {
        this.field4505 = arg0;
        field4503++;
        this.field4508 = 0;
        this.field4500 = 12800;
        this.field4499 = 0;
        for (class163 var2 = (class163) this.field4504.method2655(15152); var2 != null; var2 = (class163) this.field4504.method2660((byte) 67)) {
            if (var2.field2401 > this.field4499) {
                this.field4499 = var2.field2401;
            }
            if (this.field4500 > var2.field2417) {
                this.field4500 = var2.field2417;
            }
            if (this.field4508 < var2.field2411) {
                this.field4508 = var2.field2411;
            }
            if (this.field4505 > var2.field2406) {
                this.field4505 = var2.field2406;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[III)Z", line = 221)
    public final boolean method1877(int arg0, int[] arg1, int arg2, int arg3) {
        field4496++;
        if (arg2 != 2048) {
            this.field4498 = 73;
        }
        for (class163 var5 = (class163) this.field4504.method2655(15152); var5 != null; var5 = (class163) this.field4504.method2660((byte) 67)) {
            if (var5.method1038((byte) 61, arg3, arg0)) {
                var5.method1042(0, arg3, arg0, arg1);
                return true;
            }
        }
        return false;
    }
}
