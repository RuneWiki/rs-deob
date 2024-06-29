import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class277 {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Ljl;")
    private class245 field4958 = null;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Ljl;")
    private class245 field4971 = null;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    private int field4973 = 65000;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lcf;")
    public static class93 field4963 = class147.method1066("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -48);

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lcf;")
    private static class93 field4964 = class147.method1066("Allocated memory", -48);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field4957 = 0;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field4967 = 0;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lcf;")
    public static class93 field4961 = class147.method1066(",Mcran)2titre charg-B", -48);

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Lcf;")
    public static class93 field4969 = field4964;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field4974 = 1;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Lcf;")
    public static final class93 method1854(int arg0, int arg1) {
        field4959++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class93 var2 = new class93();
        var2.field1683 = new byte[arg0];
        var2.field1629 = 1;
        var2.field1683[0] = (byte) arg1;
        return var2;
    }

    @OriginalMember(owner = "client!ah", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4970++;
        return "Cache:" + this.field4968;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1855(int arg0) {
        if (arg0 != 6) {
            method1855(-124);
        }
        field4969 = null;
        field4964 = null;
        field4963 = null;
        field4961 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BIII)Z")
    public final boolean method1856(byte[] arg0, int arg1, int arg2, int arg3) {
        field4962++;
        if (arg3 != 3540) {
            field4967 = 5;
        }
        class245 var5 = this.field4971;
        synchronized (this.field4971) {
            if (arg2 < 0 || this.field4973 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1858(arg1, true, arg0, (byte) -124, arg2);
            if (!var6) {
                var6 = this.method1858(arg1, false, arg0, (byte) -65, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V")
    public static final void method1857(int arg0, int arg1) {
        field4966++;
        if (arg0 < 62) {
            method1855(-75);
        }
        class212 var2 = class123.method905(-1205364448, 3, arg1);
        var2.method1502(255);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ[BBI)Z")
    private final boolean method1858(int arg0, boolean arg1, byte[] arg2, byte arg3, int arg4) {
        field4960++;
        class245 var6 = this.field4971;
        synchronized (this.field4971) {
            if (arg3 > -36) {
                return false;
            }
            try {
                int var8;
                if (arg1) {
                    if (this.field4958.method1666(false) < ((long) (arg0 * 6 + 6))) {
                        return false;
                    }
                    this.field4958.method1671((long) (arg0 * 6), 4441);
                    this.field4958.method1660(class15.field191, 0, 107, 6);
                    var8 = (class15.field191[4] & 0xFF << 8) + (((class15.field191[3] & 0xFF) << 16) + (class15.field191[5] & 0xFF));
                    if (var8 <= 0 || (long) var8 > this.field4971.method1666(false) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4971.method1666(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class15.field191[1] = (byte) (arg4 >> 8);
                class15.field191[5] = (byte) var8;
                int var11 = 0;
                class15.field191[3] = (byte) (var8 >> 16);
                class15.field191[4] = (byte) (var8 >> 8);
                class15.field191[2] = (byte) arg4;
                int var12 = 0;
                class15.field191[0] = (byte) (arg4 >> 16);
                this.field4958.method1671((long) (arg0 * 6), 4441);
                this.field4958.method1672(true, class15.field191, 0, 6);
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg1) {
                        label111: {
                            this.field4971.method1671((long) (var8 * 520), 4441);
                            try {
                                this.field4971.method1660(class15.field191, 0, 93, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = ((class15.field191[4] & 0xFF) << 16) + (((class15.field191[5] & 0xFF) << 8) + (class15.field191[6] & 0xFF));
                            int var14 = ((class15.field191[0] & 0xFF) << 8) + (class15.field191[1] & 0xFF);
                            int var15 = (class15.field191[2] & 0xFF << 8) + (class15.field191[3] & 0xFF);
                            int var16 = class15.field191[7] & 0xFF;
                            if (arg0 == var14 && var12 == var15 && this.field4968 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field4971.method1666(false) / 520L) {
                                    break label111;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field4971.method1666(false) + 519L) / 520L);
                        arg1 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class15.field191[7] = (byte) this.field4968;
                    class15.field191[2] = (byte) (var12 >> 8);
                    class15.field191[1] = (byte) arg0;
                    int var19 = arg4 - var11;
                    if ((arg4 - var11) <= 512) {
                        var13 = 0;
                    }
                    class15.field191[4] = (byte) (var13 >> 16);
                    class15.field191[6] = (byte) var13;
                    class15.field191[0] = (byte) (arg0 >> 8);
                    class15.field191[3] = (byte) var12;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class15.field191[5] = (byte) (var13 >> 8);
                    this.field4971.method1671((long) (var8 * 520), 4441);
                    var8 = var13;
                    this.field4971.method1672(true, class15.field191, 0, 8);
                    var12++;
                    this.field4971.method1672(true, arg2, var11, var19);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lcf;BILcf;)V")
    public static final void method1859(class93 arg0, byte arg1, int arg2, class93 arg3) {
        class178.field3147 = arg0;
        class178.field3146 = arg3;
        field4972++;
        if (arg1 != -107) {
            method1855(-50);
        }
        class9.field132 = arg2;
        if (class178.field3146.method667(class178.field3144, (byte) -120) || class178.field3147.method667(class178.field3144, (byte) -122)) {
            class242.field4371 = 3;
        } else if (class74.field1352 == -1) {
            class242.field4371 = -3;
            class167.field2945 = 0;
            class101.field1762 = 1;
            class29.field437 = 0;
            class280 var4 = new class280(128);
            var4.method1916(10, 108);
            var4.method1908(arg1 - 17, (int) (Math.random() * 99999.0D));
            var4.method1908(-95, 531);
            var4.method1882(class178.field3146.method679((byte) 76), (byte) -126);
            var4.method1886((int) (Math.random() * 9.9999999E7D), 2);
            var4.method1898((byte) 118, class178.field3147);
            var4.method1886((int) (Math.random() * 9.9999999E7D), 2);
            var4.method1900(class3.field22, 12073, class155.field2707);
            class285.field5105.field5027 = 0;
            class285.field5105.method1916(239, arg1 + 218);
            class285.field5105.method1916(var4.field5027, 83);
            class285.field5105.method1870(0, var4.field5011, var4.field5027, arg1 ^ 0x3B);
        } else {
            class110.method787(arg1 ^ 0x6A);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[B")
    public final byte[] method1860(int arg0, byte arg1) {
        field4965++;
        class245 var3 = this.field4971;
        synchronized (this.field4971) {
            try {
                if (this.field4958.method1666(false) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field4958.method1671((long) (arg0 * 6), 4441);
                this.field4958.method1660(class15.field191, 0, 94, 6);
                int var5 = -80 % ((arg1 - 72) / 37);
                int var6 = (class15.field191[1] & 0xFF << 8) + (class15.field191[0] & 0xFF << 16) + (class15.field191[2] & 0xFF);
                int var7 = ((class15.field191[4] & 0xFF) << 8) + (class15.field191[3] & 0xFF << 16) + (class15.field191[5] & 0xFF);
                if (var6 < 0 || this.field4973 < var6) {
                    return null;
                } else if (var7 > 0 && (this.field4971.method1666(false) / 520L) >= ((long) var7)) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    label70: while (var11 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field4971.method1671((long) (var7 * 520), 4441);
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4971.method1660(class15.field191, 0, 109, var14 + 8);
                        int var15 = (class15.field191[5] & 0xFF << 8) + ((class15.field191[4] & 0xFF) << 16) + (class15.field191[6] & 0xFF);
                        int var16 = (class15.field191[0] & 0xFF << 8) + (class15.field191[1] & 0xFF);
                        int var17 = class15.field191[7] & 0xFF;
                        int var18 = (class15.field191[2] & 0xFF << 8) + (class15.field191[3] & 0xFF);
                        if (arg0 == var16 && var12 == var18 && this.field4968 == var17) {
                            if (var15 >= 0 && this.field4971.method1666(false) / 520L >= (long) var15) {
                                var12++;
                                var7 = var15;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label70;
                                    }
                                    var10[var11++] = class15.field191[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(ILjl;Ljl;I)V")
    public class277(int arg0, class245 arg1, class245 arg2, int arg3) {
        this.field4968 = arg0;
        this.field4973 = arg3;
        this.field4958 = arg2;
        this.field4971 = arg1;
    }
}
