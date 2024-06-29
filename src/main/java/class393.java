import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class393 extends class189 {

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    private int field5554;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "Z")
    private boolean field5563;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "I")
    private int field5565;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    private int field5566;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    private int field5560;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    private int field5564;

    @OriginalMember(owner = "client!br", name = "K", descriptor = "I")
    private int field5578;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    private int field5555;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Z")
    private boolean field5553;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    private int field5559;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "I")
    private int field5569;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "I")
    private int field5572;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "I")
    private int field5567;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    private int field5562;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public int field5558;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "Ljava/lang/String;")
    private String field5551;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "Ljava/lang/String;")
    private String field5574;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "Ljava/lang/String;")
    private String field5556;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "Ljava/lang/String;")
    private String field5570;

    @OriginalMember(owner = "client!br", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field5577 = new String[8];

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    private int field5552;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "I")
    private int field5571;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!br", name = "H", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILfp;II)Lie;", line = 6)
    public static final class6 method2470(int arg0, class323 arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field5577 = null;
        }
        field5561++;
        byte[] var4 = arg1.method2100(arg3, (byte) 112, arg2);
        return var4 == null ? null : new class6(var4);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V", line = 30)
    public static final void method2471(byte arg0) {
        if (arg0 != -97) {
            return;
        }
        class615.method3442(class557.field7812.field6536.method3530(false) == 1, 22050, 2, arg0 ^ 0xFFFFFFA8);
        field5576++;
        class220.field2882 = class139.method983(22050, class366.field5196, 0, (byte) -93, class202.field2644);
        class29.method168(true, (byte) -50, class509.method3011(null, (byte) 9));
        class503.field7209 = class139.method983(2048, class366.field5196, 1, (byte) 104, class202.field2644);
        class192.field2560 = new class265();
        class503.field7209.method2491(true, class192.field2560);
        class712.field9905 = new class498(22050, class68.field831);
        class64.method540(-1);
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(B)V", line = 48)
    public static void method2472(byte arg0) {
        int var1 = 62 % ((21 - arg0) / 36);
        field5577 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 62)
    private final void method2473(int arg0) {
        field5568++;
        if (this.field5556.length() > 40) {
            this.field5556 = this.field5556.substring(0, 40);
        }
        if (this.field5570.length() > 40) {
            this.field5570 = this.field5570.substring(0, 40);
        }
        if (this.field5551.length() > 10) {
            this.field5551 = this.field5551.substring(0, 10);
        }
        if (this.field5574.length() > 10) {
            this.field5574 = this.field5574.substring(0, 10);
        }
        int var2 = 123 / ((arg0 + 38) / 56);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLee;)V", line = 84)
    public final void method2474(boolean arg0, class675 arg1) {
        arg1.method3694(5, -1528071456);
        field5575++;
        if (arg0) {
            method2470(41, null, -82, 8);
        }
        arg1.method3694(this.field5554, -1528071456);
        arg1.method3694(this.field5563 ? 1 : 0, -1528071456);
        arg1.method3694(this.field5565, -1528071456);
        arg1.method3694(this.field5566, -1528071456);
        arg1.method3694(this.field5560, -1528071456);
        arg1.method3694(this.field5564, -1528071456);
        arg1.method3694(this.field5555, -1528071456);
        arg1.method3694(this.field5553 ? 1 : 0, -1528071456);
        arg1.method3745(-124, this.field5578);
        arg1.method3694(this.field5559, -1528071456);
        arg1.method3753(1333491824, this.field5558);
        arg1.method3745(-120, this.field5569);
        arg1.method3694(this.field5572, -1528071456);
        arg1.method3694(this.field5567, -1528071456);
        arg1.method3694(this.field5562, -1528071456);
        arg1.method3707(this.field5556, (byte) -52);
        arg1.method3707(this.field5570, (byte) -52);
        arg1.method3707(this.field5551, (byte) -52);
        arg1.method3707(this.field5574, (byte) -52);
        arg1.method3694(this.field5552, -1528071456);
        arg1.method3745(-120, this.field5571);
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(B)I", line = 124)
    public final int method2475(byte arg0) {
        field5573++;
        byte var2 = 23;
        int var3 = var2 + class692.method3893(8192, this.field5556);
        int var4 = var3 + class692.method3893(8192, this.field5570);
        int var5 = var4 + class692.method3893(8192, this.field5551);
        if (arg0 != -10) {
            this.field5563 = true;
        }
        return var5 + class692.method3893(8192, this.field5574);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Z", line = 141)
    public static final boolean method2476(int arg0, int arg1) {
        field5557++;
        if (class46.field544[arg1]) {
            return true;
        } else if (class48.field569.method2101(arg1, -120)) {
            int var2 = class48.field569.method2084(arg1, 0);
            if (var2 == 0) {
                class46.field544[arg1] = true;
                return true;
            }
            if (class37.field475[arg1] == null) {
                class37.field475[arg1] = new class493[var2];
            }
            if (arg0 <= 47) {
                return true;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class37.field475[arg1][var3] == null) {
                    byte[] var4 = class48.field569.method2100(var3, (byte) 112, arg1);
                    if (var4 != null) {
                        class493 var5 = class37.field475[arg1][var3] = new class493();
                        var5.field6956 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2945((byte) 127, new class675(var4));
                    }
                }
            }
            class46.field544[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 208)
    public class393() {
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(ZLvc;)V", line = 213)
    public class393(boolean arg0, class316 arg1) {
        if (arg0) {
            if (class316.field4377.startsWith("win")) {
                this.field5554 = 1;
            } else if (class316.field4377.startsWith("mac")) {
                this.field5554 = 2;
            } else if (class316.field4377.startsWith("linux")) {
                this.field5554 = 3;
            } else {
                this.field5554 = 4;
            }
            if (class316.field4386.startsWith("amd64") || class316.field4386.startsWith("x86_64")) {
                this.field5563 = true;
            } else {
                this.field5563 = false;
            }
            if (this.field5554 == 1) {
                if (class316.field4371.indexOf("4.0") != -1) {
                    this.field5565 = 1;
                } else if (class316.field4371.indexOf("4.1") != -1) {
                    this.field5565 = 2;
                } else if (class316.field4371.indexOf("4.9") != -1) {
                    this.field5565 = 3;
                } else if (class316.field4371.indexOf("5.0") != -1) {
                    this.field5565 = 4;
                } else if (class316.field4371.indexOf("5.1") != -1) {
                    this.field5565 = 5;
                } else if (class316.field4371.indexOf("6.0") != -1) {
                    this.field5565 = 6;
                } else if (class316.field4371.indexOf("6.1") != -1) {
                    this.field5565 = 7;
                }
            } else if (this.field5554 == 2) {
                if (class316.field4371.indexOf("10.4") != -1) {
                    this.field5565 = 20;
                } else if (class316.field4371.indexOf("10.5") != -1) {
                    this.field5565 = 21;
                } else if (class316.field4371.indexOf("10.6") != -1) {
                    this.field5565 = 22;
                }
            }
            if (class316.field4374.toLowerCase().indexOf("sun") != -1) {
                this.field5566 = 1;
            } else if (class316.field4374.toLowerCase().indexOf("microsoft") != -1) {
                this.field5566 = 2;
            } else if (class316.field4374.toLowerCase().indexOf("apple") == -1) {
                this.field5566 = 4;
            } else {
                this.field5566 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class316.field4382.length()) {
                    char var5 = class316.field4382.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var16) {
            }
            this.field5560 = var4;
            int var6 = class316.field4382.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class316.field4382.length()) {
                    char var8 = class316.field4382.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field5564 = var7;
            int var9 = 0;
            int var10 = class316.field4382.indexOf(95, 4) + 1;
            try {
                while (class316.field4382.length() > var10) {
                    char var11 = class316.field4382.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var14) {
            }
            this.field5578 = class698.field9627;
            this.field5555 = var9;
            if (arg1.field4385) {
                this.field5553 = false;
            } else {
                this.field5553 = true;
            }
            if (this.field5560 <= 3) {
                this.field5559 = 0;
            } else {
                this.field5559 = class312.field4331;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field5569 = var12[2];
                    this.field5572 = var12[3];
                    this.field5567 = var12[4];
                    this.field5562 = var12[5];
                    this.field5558 = var12[6];
                }
            } catch (Throwable var13) {
                this.field5558 = 0;
            }
        }
        if (this.field5551 == null) {
            this.field5551 = "";
        }
        if (this.field5574 == null) {
            this.field5574 = "";
        }
        if (this.field5556 == null) {
            this.field5556 = "";
        }
        if (this.field5570 == null) {
            this.field5570 = "";
        }
        this.method2473(72);
    }
}
