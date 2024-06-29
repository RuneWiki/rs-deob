import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class291 extends class157 {

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    private int field4497;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    private int field4491;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    private int field4496;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field4490 = 0;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4485 = " has logged in.";

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4488 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4504 = "purple:";

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field4508 = -1;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    private int field4486;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    private int field4494;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    private int field4499;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "[B")
    private byte[] field4507;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIII)Z", line = 3)
    public static final boolean method2033(int arg0, int arg1, int arg2, int arg3) {
        if (!class307.method2124(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class172.field2843[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class261.field4103) {
                    if (!class117.method830(var4, var6, var5)) {
                        return false;
                    }
                    if (!class117.method830(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class117.method830(var4, var7, var5)) {
                        return false;
                    }
                    if (!class117.method830(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class117.method830(var4, var8, var5)) {
                    return false;
                }
                if (!class117.method830(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class206.field3276) {
                    if (!class117.method830(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class117.method830(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class117.method830(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class117.method830(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class117.method830(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class117.method830(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class261.field4103) {
                    if (!class117.method830(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class117.method830(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class117.method830(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class117.method830(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class117.method830(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class117.method830(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class206.field3276) {
                    if (!class117.method830(var4, var6, var5)) {
                        return false;
                    }
                    if (!class117.method830(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class117.method830(var4, var7, var5)) {
                        return false;
                    }
                    if (!class117.method830(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class117.method830(var4, var8, var5)) {
                    return false;
                }
                if (!class117.method830(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class117.method830(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class117.method830(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class117.method830(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class117.method830(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class117.method830(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLug;)V", line = 192)
    public static final void method2034(byte arg0, class253 arg1) {
        field4487++;
        if (class3.field26) {
            return;
        }
        if (class109.field1458) {
            class122.method887();
        } else {
            class280.method1968();
        }
        class344.field5342 = class344.method2378(false, class42.field572, arg1);
        int var2 = class95.field1258;
        if (arg0 != -35) {
            field4504 = (String) null;
        }
        int var3 = var2 * 956 / 503;
        class344.field5342.method1262((class127.field1841 - var3) / 2, 0, var3, var2);
        class327.field5128 = class120.method862(arg0 ^ 0x56, arg1, class318.field5030);
        class327.field5128.method198(class127.field1841 / 2 - (class327.field5128.field297 / 2), 18);
        class3.field26 = true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 219)
    public final void method1137(byte arg0) {
        if (arg0 > -3) {
            field4501 = 33;
        }
        field4505++;
        this.field4499 = 0;
        this.field4494 = 0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V", line = 235)
    public final void method1143(int arg0, int arg1, int arg2) {
        field4489++;
        if (arg1 == 0) {
            this.field4486 = this.field4503 - (arg2 < 0 ? -arg2 : arg2);
            this.field4500 = 4096;
            this.field4486 = this.field4486 * this.field4486 >> 12;
            this.field4499 = this.field4486;
        } else {
            this.field4500 = this.field4497 * this.field4486 >> 12;
            if (this.field4500 < 0) {
                this.field4500 = 0;
            } else if (this.field4500 > 4096) {
                this.field4500 = 4096;
            }
            this.field4486 = this.field4503 - (arg2 < 0 ? -arg2 : arg2);
            this.field4486 = this.field4486 * this.field4486 >> 12;
            this.field4486 = this.field4500 * this.field4486 >> 12;
            this.field4499 += this.field4496 * this.field4486 >> 12;
            this.field4496 = this.field4496 * this.field4491 >> 12;
        }
        if (arg0 != -9140) {
            this.method1135(52);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZII)V", line = 270)
    public static final void method2035(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method2036(-105, 107);
        }
        field4502++;
        class34 var4 = class91.method656(arg0, -2, 9);
        var4.method307(-19063);
        var4.field500 = arg3;
        var4.field497 = arg2;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIIFFF)V", line = 285)
    public class291(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4503 = (int) (arg6 * 4096.0F);
        this.field4497 = (int) (arg7 * 4096.0F);
        this.field4496 = this.field4491 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 301)
    public final void method1135(int arg0) {
        this.field4496 = this.field4491;
        this.field4499 >>= 0x4;
        if (this.field4499 < 0) {
            this.field4499 = 0;
        } else if (this.field4499 > 255) {
            this.field4499 = 255;
        }
        field4493++;
        this.method670(this.field4494++, (byte) this.field4499);
        this.field4499 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V", line = 338)
    public void method670(int arg0, byte arg1) {
        field4492++;
        this.field4507[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lnn;", line = 347)
    public static final class187 method2036(int arg0, int arg1) {
        field4498++;
        if (arg1 != 30725) {
            field4485 = (String) null;
        }
        return class123.field1766 && class136.field2065 <= arg0 && arg0 <= class96.field1267 ? class142.field2251[arg0 - class136.field2065] : null;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V", line = 371)
    public static void method2037(byte arg0) {
        field4485 = null;
        if (arg0 >= 0) {
            field4501 = -57;
        }
        field4488 = null;
        field4504 = null;
    }
}
