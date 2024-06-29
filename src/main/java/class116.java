import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class116 extends class263 {

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Z")
    private boolean field1440;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Z")
    private boolean field1442;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "J")
    public static long field1432 = 0L;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Ldr;")
    public static class675 field1439 = new class675(53, 28);

    @OriginalMember(owner = "client!di", name = "u", descriptor = "[[F")
    public static float[][] field1444 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field1446 = -1;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 6)
    public static void method787(int arg0) {
        if (arg0 != 0) {
            method787(8);
        }
        field1439 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lji;I)V", line = 35)
    public final void method788(class572 arg0, int arg1) {
        field1437++;
        arg0.method3090(3, 3);
        arg0.method3090(this.field1430, arg1 + 3);
        arg0.method3090(this.field1440 ? 1 : 0, 3);
        arg0.method3090(this.field1448, arg1 + 3);
        arg0.method3090(this.field1435, arg1 + 3);
        arg0.method3090(this.field1434, 3);
        if (arg1 != 0) {
            this.method788(null, -16);
        }
        arg0.method3090(this.field1436, 3);
        arg0.method3090(this.field1443, 3);
        arg0.method3090(this.field1442 ? 1 : 0, 3);
        arg0.method3080((byte) -115, this.field1441);
        arg0.method3090(this.field1445, 3);
        arg0.method3056((byte) 106, this.field1433);
        arg0.method3061(this.field1431, (byte) 115);
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(ZLqj;)V", line = 69)
    public class116(boolean arg0, class476 arg1) {
        if (arg0) {
            if (class476.field5927.startsWith("win")) {
                this.field1430 = 1;
            } else if (class476.field5927.startsWith("mac")) {
                this.field1430 = 2;
            } else if (class476.field5927.startsWith("linux")) {
                this.field1430 = 3;
            } else {
                this.field1430 = 4;
            }
            if (class476.field5920.startsWith("amd64") || class476.field5920.startsWith("x86_64")) {
                this.field1440 = true;
            } else {
                this.field1440 = false;
            }
            if (this.field1430 == 1) {
                if (class476.field5929.indexOf("4.0") != -1) {
                    this.field1448 = 1;
                } else if (class476.field5929.indexOf("4.1") != -1) {
                    this.field1448 = 2;
                } else if (class476.field5929.indexOf("4.9") != -1) {
                    this.field1448 = 3;
                } else if (class476.field5929.indexOf("5.0") != -1) {
                    this.field1448 = 4;
                } else if (class476.field5929.indexOf("5.1") != -1) {
                    this.field1448 = 5;
                } else if (class476.field5929.indexOf("6.0") != -1) {
                    this.field1448 = 6;
                } else if (class476.field5929.indexOf("6.1") != -1) {
                    this.field1448 = 7;
                }
            } else if (this.field1430 == 2) {
                if (class476.field5929.indexOf("10.4") != -1) {
                    this.field1448 = 20;
                } else if (class476.field5929.indexOf("10.5") != -1) {
                    this.field1448 = 21;
                } else if (class476.field5929.indexOf("10.6") != -1) {
                    this.field1448 = 22;
                }
            }
            if (class476.field5923.toLowerCase().indexOf("sun") != -1) {
                this.field1435 = 1;
            } else if (class476.field5923.toLowerCase().indexOf("microsoft") != -1) {
                this.field1435 = 2;
            } else if (class476.field5923.toLowerCase().indexOf("apple") == -1) {
                this.field1435 = 4;
            } else {
                this.field1435 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class476.field5918.length()) {
                    char var5 = class476.field5918.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field1434 = var4;
            int var6 = class476.field5918.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class476.field5918.length() > var6) {
                    char var8 = class476.field5918.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + var8 - 48;
                }
            } catch (Exception var15) {
            }
            this.field1436 = var7;
            int var9 = 0;
            int var10 = class476.field5918.indexOf(95, 4) + 1;
            try {
                while (var10 < class476.field5918.length()) {
                    char var11 = class476.field5918.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var14) {
            }
            if (arg1.field5919) {
                this.field1442 = false;
            } else {
                this.field1442 = true;
            }
            this.field1441 = class357.field4610;
            if (this.field1434 > 3) {
                this.field1445 = class552.field6914;
            } else {
                this.field1445 = 0;
            }
            this.field1443 = var9;
            try {
                this.field1433 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field1433 = 0;
            }
            try {
                this.field1431 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }
}
