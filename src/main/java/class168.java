import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class168 extends class298 {

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    private int field1994 = 1;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    private int field1998 = 0;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    private int field1999 = 0;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "[I")
    public static int[] field1993;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method820(String arg0, boolean arg1) {
        ++field2000;
        class326.field4695 = arg0;
        if (class42.field512.field5106 != null) {
            try {
                String var2 = class42.field512.field5106.getParameter("cookieprefix");
                String var3 = class42.field512.field5106.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg0.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class192.method1052(86, class434.method2591(-19310) + 94608000000L) + "; Max-Age=" + 94608000L;
                }
                class336.method2039((byte) 87, "document.cookie=\"" + var5 + "\"", class42.field512.field5106);
                if (!arg1) {
                    method823((class258) null, 68, 6, -7);
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)V")
    public static void method821(byte arg0) {
        if (arg0 <= 114) {
            method823((class258) null, -106, -91, -122);
        }
        field1993 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public final void method15(int arg0) {
        if (arg0 >= -41) {
            this.method15(-28);
        }
        ++field2002;
        class292.method1836(6090);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field1997;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field1994 = arg2.method895((byte) -118);
                }
            } else {
                this.field1999 = arg2.method895((byte) -123);
            }
        } else {
            this.field1998 = arg2.method895((byte) -121);
        }
        if (arg0 >= -44) {
            method820((String) null, true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(CI)Z")
    public static final boolean method822(char arg0, int arg1) {
        if (arg1 != 65) {
            return true;
        } else {
            ++field2001;
            return ~arg0 <= -49 && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || ~arg0 <= -98 && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lrs;III)V")
    public static final void method823(class258 arg0, int arg1, int arg2, int arg3) {
        long var4 = class382.field5424[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3730 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field3732[arg0.field3730++] = class364.field5236[var8 - 1];
            var6 += 16L;
        }
        for (int var9 = arg0.field3730; var9 < 4; ++var9) {
            arg0.field3732[var9] = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class168() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static final void method824(int arg0) {
        class244.method1332((byte) -128, class440.field6304);
        ++field2003;
        int var1 = 68 % ((arg0 - -45) / 36);
        ++class247.field3485;
        class230.field3185.method909(class71.method366(113), -1);
        class230.field3185.method884(class110.field1336, true);
        class230.field3185.method884(class464.field6541, true);
        class230.field3185.method909(class154.field1855, -1);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field1995;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (!arg1) {
            return null;
        } else {
            if (super.field4443.field6915) {
                int var4 = class156.field1865[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~var6 > ~class158.field1877; ++var6) {
                    int var7 = class236.field3260[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (~this.field1998 != -1) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field1994 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (var7 - var4) * this.field1994;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (this.field1999 == 0) {
                        var12 = class420.field6058[255 & var12 >> 4] + 4096 >> 1;
                    } else if (~this.field1999 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }
}
