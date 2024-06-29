import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class280 extends class313 {

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    private int field4437 = 204;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    private int field4440 = 1;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    private int field4441 = 1;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field4435 = -1;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static int field4443 = 0;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z", line = 7)
    public static final boolean method1914(boolean arg0, String arg1, String arg2) {
        field4442++;
        if (!arg0) {
            method1915((byte) -51);
        }
        int var3 = arg1.length();
        int var4 = arg2.length();
        if (var4 > var3) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)Z", line = 44)
    public static final boolean method1915(byte arg0) {
        field4444++;
        if (class265.field4275) {
            try {
                class251.method1754("showVideoAd", (byte) -104, class85.field1369.field910);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 != -86) {
            method1916(-123, -41);
        }
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 126)
    public class280() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILpi;)V", line = 75)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field4436++;
        if (arg0 == 0) {
            this.field4441 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field4440 = arg2.method2364(arg1 ^ 0x66DB);
        } else if (arg0 == 2) {
            this.field4437 = arg2.method2339((byte) -46);
        }
        if (arg1 != -17848) {
            this.method111(-57, 84);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[I", line = 135)
    public final int[] method111(int arg0, int arg1) {
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            for (int var4 = 0; var4 < class133.field2269; var4++) {
                int var5 = class1.field6[arg1];
                int var6 = class8.field104[var4];
                int var7 = this.field4441 * var6 >> 12;
                int var8 = this.field4440 * var5 >> 12;
                int var9 = var6 % (4096 / this.field4441) * this.field4441;
                int var10 = var5 % (4096 / this.field4440) * this.field4440;
                if (this.field4437 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field4437) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field4437) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 == 4) {
            field4439++;
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)I", line = 217)
    public static final int method1916(int arg0, int arg1) {
        field4438++;
        return arg1 == 0 ? arg0 & 0xFF : 103;
    }
}
