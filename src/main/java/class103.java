import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class103 extends class344 {

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    private int field1701;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    private int field1695;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "[I")
    public static int[] field1693 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public static int field1704 = 0;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    private int field1694;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    private int field1709;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "[B")
    private byte[] field1706;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 6)
    public static final String method833(boolean arg0, int arg1, int arg2, int arg3) {
        field1692++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg1 != 267735788) {
                field1704 = 90;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg3;
                int var9 = var8 - (arg2 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 59)
    public static final Object method834(int arg0, byte[] arg1, boolean arg2) {
        field1698++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class20.field364) {
            try {
                class311 var3 = (class311) Class.forName("tg").getDeclaredConstructor().newInstance();
                var3.method2195(arg1, 124);
                return var3;
            } catch (Throwable var5) {
                class20.field364 = true;
            }
        }
        if (arg0 > -127) {
            return (Object) null;
        } else if (arg2) {
            return class19.method204(true, arg1);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V", line = 93)
    public static final void method835(int arg0) {
        class201.field3096 = (byte[][][]) null;
        if (arg0 != -6251) {
            return;
        }
        class345.field5352 = null;
        class307.field4870 = null;
        class253.field3745 = (byte[][][]) null;
        class258.field3829 = (int[][][]) null;
        class174.field2799 = null;
        class58.field872 = (byte[][][]) null;
        class272.field4263 = (byte[][][]) null;
        class55.field845 = null;
        class282.field4417 = null;
        class260.field3875 = (byte[][][]) null;
        field1705++;
        client.field4117 = null;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V", line = 116)
    public final void method160(byte arg0) {
        this.field1709 = 0;
        if (arg0 <= 77) {
            this.field1699 = -68;
        }
        field1710++;
        this.field1702 = 0;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(IIIIIFFF)V", line = 136)
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1711 = (int) (arg7 * 4096.0F);
        this.field1701 = (int) (arg6 * 4096.0F);
        this.field1691 = this.field1695 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V", line = 150)
    public final void method161(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            this.method161(59, 29, 22);
        }
        field1700++;
        if (arg1 == 0) {
            this.field1694 = this.field1701 - (arg0 >= 0 ? arg0 : -arg0);
            this.field1699 = 4096;
            this.field1694 = this.field1694 * this.field1694 >> 12;
            this.field1702 = this.field1694;
            return;
        }
        this.field1699 = this.field1711 * this.field1694 >> 12;
        this.field1694 = this.field1701 - (arg0 >= 0 ? arg0 : -arg0);
        this.field1694 = this.field1694 * this.field1694 >> 12;
        if (this.field1699 < 0) {
            this.field1699 = 0;
        } else if (this.field1699 > 4096) {
            this.field1699 = 4096;
        }
        this.field1694 = this.field1699 * this.field1694 >> 12;
        this.field1702 += this.field1694 * this.field1691 >> 12;
        this.field1691 = this.field1695 * this.field1691 >> 12;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V", line = 191)
    public void method836(int arg0, byte arg1) {
        field1707++;
        this.field1706[arg0] = arg1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V", line = 200)
    public static final void method837(int arg0, int arg1) {
        field1697++;
        if (arg1 != 10) {
            field1704 = 42;
        }
        class301.field4801 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)I", line = 213)
    public static final int method838(boolean arg0, int arg1) {
        if (arg0) {
            method834(64, (byte[]) null, true);
        }
        field1708++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V", line = 227)
    public final void method163(byte arg0) {
        field1703++;
        this.field1691 = this.field1695;
        if (arg0 != -8) {
            return;
        }
        this.field1702 >>= 0x4;
        if (this.field1702 < 0) {
            this.field1702 = 0;
        } else if (this.field1702 > 255) {
            this.field1702 = 255;
        }
        this.method836(this.field1709++, (byte) this.field1702);
        this.field1702 = 0;
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)Z", line = 249)
    public static final boolean method839(int arg0) {
        field1696++;
        if (arg0 != -14632) {
            method840((byte) 26);
        }
        class339 var1 = class24.field411;
        synchronized (class24.field411) {
            if (class151.field2491 == class110.field1790) {
                return false;
            } else {
                class217.field3371 = class200.field3069[class110.field1790];
                class327.field5115 = class208.field3285[class110.field1790];
                class110.field1790 = class110.field1790 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(B)V", line = 270)
    public static void method840(byte arg0) {
        field1693 = null;
        if (arg0 > -10) {
            method835(23);
        }
    }
}
