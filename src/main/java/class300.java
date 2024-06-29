import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class300 extends class331 {

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
    public int field4205 = 0;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
    public int field4202 = 12800;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "Z")
    public boolean field4194 = true;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "I")
    public int field4207 = 12800;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
    public int field4204 = 0;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
    public int field4200 = -1;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public int field4193 = -1;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!gq", name = "V", descriptor = "I")
    public int field4210;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "Ljava/lang/String;")
    public String field4208;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "Ljava/lang/String;")
    public String field4196;

    @OriginalMember(owner = "client!gq", name = "W", descriptor = "Lwq;")
    public class92 field4211;

    @OriginalMember(owner = "client!gq", name = "X", descriptor = "[I")
    public static int[] field4212 = new int[2];

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "Llg;")
    public static class237 field4197 = new class237(200);

    @OriginalMember(owner = "client!gq", name = "bb", descriptor = "[Ljava/lang/String;")
    public static String[] field4216 = new String[200];

    @OriginalMember(owner = "client!gq", name = "Z", descriptor = "I")
    public static int field4214 = 12;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!gq", name = "U", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!gq", name = "Y", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!gq", name = "ab", descriptor = "Ltq;")
    public static class376 field4215;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
    public final void method1976(int arg0) {
        this.field4207 = 12800;
        if (arg0 != -15044) {
            method1982(-90);
        }
        this.field4202 = 12800;
        this.field4205 = 0;
        field4199++;
        this.field4204 = 0;
        for (class68 var2 = (class68) this.field4211.method506((byte) -128); var2 != null; var2 = (class68) this.field4211.method514(true)) {
            if (this.field4202 > var2.field764) {
                this.field4202 = var2.field764;
            }
            if (this.field4207 > var2.field776) {
                this.field4207 = var2.field776;
            }
            if (var2.field775 > this.field4204) {
                this.field4204 = var2.field775;
            }
            if (var2.field768 > this.field4205) {
                this.field4205 = var2.field768;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(III)Z")
    public final boolean method1977(int arg0, int arg1, int arg2) {
        field4209++;
        if (arg1 != 12800) {
            this.field4193 = 27;
        }
        for (class68 var4 = (class68) this.field4211.method506((byte) -128); var4 != null; var4 = (class68) this.field4211.method514(true)) {
            if (var4.method379(arg0, arg1 - 12799, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
    public static final void method1978(int arg0, int arg1) {
        field4197.method1629(arg0, 74);
        if (arg1 != 2716) {
            return;
        }
        field4198++;
        class444.field6373.method1629(arg0, 59);
        class435.field6251.method1629(arg0, arg1 - 2592);
        class86.field974.method1629(arg0, 95);
        class87.field985.method1629(arg0, 96);
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)V")
    public static void method1979(byte arg0) {
        field4216 = null;
        field4212 = null;
        field4215 = null;
        field4197 = null;
        if (arg0 != -35) {
            method1978(-89, -5);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method1980(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4203++;
        for (class68 var6 = (class68) this.field4211.method506((byte) -128); var6 != null; var6 = (class68) this.field4211.method514(true)) {
            if (var6.method389((byte) -2, arg3, arg2, arg1)) {
                var6.method380(arg4, -89, arg2, arg1);
                return true;
            }
        }
        if (arg0 != 0) {
            this.method1983((byte) 118, -109, (int[]) null, -83);
        }
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[III)Z")
    public final boolean method1981(int arg0, int[] arg1, int arg2, int arg3) {
        field4213++;
        if (arg2 != 1) {
            return false;
        }
        for (class68 var5 = (class68) this.field4211.method506((byte) -128); var5 != null; var5 = (class68) this.field4211.method514(true)) {
            if (var5.method379(arg0, 1, arg3)) {
                var5.method380(arg1, arg2 ^ 0xFFFFFF9A, arg0, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)V")
    public static final void method1982(int arg0) {
        field4195++;
        if (class105.field1260 == 0) {
            return;
        }
        try {
            if ((++class380.field5351) > 1500) {
                if (class146.field1798 != null) {
                    class146.field1798.method1343((byte) -50);
                    class146.field1798 = null;
                }
                if (class34.field391 >= 1) {
                    class105.field1260 = 0;
                    class346.field4890 = -5;
                    return;
                }
                class380.field5351 = 0;
                class34.field391++;
                if (class99.field1207 == class419.field5989) {
                    class99.field1207 = class250.field3569;
                } else {
                    class99.field1207 = class419.field5989;
                }
                class105.field1260 = 1;
            }
            if (class105.field1260 == 1) {
                class358.field5087 = class14.field185.method1268(class253.field3616, (byte) -108, class99.field1207);
                class105.field1260 = 2;
            }
            if (class105.field1260 == 2) {
                if (class358.field5087.field4498 == 2) {
                    throw new IOException();
                }
                if (class358.field5087.field4498 != 1) {
                    return;
                }
                class146.field1798 = new class202((Socket) class358.field5087.field4497, class14.field185);
                class358.field5087 = null;
                class146.field1798.method1337(class62.field718.field3320, (byte) 120, 0, class62.field718.field3364);
                if (class81.field942 != null) {
                    class81.field942.method137(-15326);
                }
                if (class230.field3255 != null) {
                    class230.field3255.method137(-15326);
                }
                int var1 = class146.field1798.method1344((byte) -103);
                if (class81.field942 != null) {
                    class81.field942.method137(-15326);
                }
                if (class230.field3255 != null) {
                    class230.field3255.method137(-15326);
                }
                if (var1 != 101) {
                    class346.field4890 = var1;
                    class105.field1260 = 0;
                    class146.field1798.method1343((byte) 44);
                    class146.field1798 = null;
                    return;
                }
                class105.field1260 = 3;
            }
            if (class105.field1260 == 3) {
                if (class146.field1798.method1340(0) < 2) {
                    return;
                }
                int var2 = class146.field1798.method1344((byte) -103) << 8 | class146.field1798.method1344((byte) -103);
                class75.method420(-11745, var2);
                if (class397.field5685 == -1) {
                    class346.field4890 = 6;
                    class105.field1260 = 0;
                    class146.field1798.method1343((byte) -112);
                    class146.field1798 = null;
                    return;
                }
                class105.field1260 = 0;
                class146.field1798.method1343((byte) 120);
                class146.field1798 = null;
                class414.method2640((byte) -76);
                return;
            }
        } catch (IOException var3) {
            if (class146.field1798 != null) {
                class146.field1798.method1343((byte) -70);
                class146.field1798 = null;
            }
            if (class34.field391 < 1) {
                class34.field391++;
                class105.field1260 = 1;
                class380.field5351 = 0;
                if (class99.field1207 == class419.field5989) {
                    class99.field1207 = class250.field3569;
                } else {
                    class99.field1207 = class419.field5989;
                }
            } else {
                class105.field1260 = 0;
                class346.field4890 = -4;
            }
        }
        if (arg0 >= -9) {
            method1979((byte) 76);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI[II)Z")
    public final boolean method1983(byte arg0, int arg1, int[] arg2, int arg3) {
        field4201++;
        for (class68 var5 = (class68) this.field4211.method506((byte) -128); var5 != null; var5 = (class68) this.field4211.method514(true)) {
            if (var5.method384((byte) 118, arg1, arg3)) {
                var5.method386(arg2, arg3, 1, arg1);
                return true;
            }
        }
        return arg0 == -101 ? false : false;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class300(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4206 = arg3;
        this.field4200 = arg6;
        this.field4193 = arg4;
        this.field4210 = arg0;
        this.field4208 = arg1;
        this.field4194 = arg5;
        this.field4196 = arg2;
        if (this.field4200 == 255) {
            this.field4200 = 0;
        }
        this.field4211 = new class92();
    }
}
