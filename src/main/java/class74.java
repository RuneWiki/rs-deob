import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class74 extends class175 {

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    private int field1390 = 1365;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    private int field1388 = 0;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    private int field1394 = 0;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    private int field1386 = 20;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field1397 = 0;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "Lij;")
    public static class50 field1399 = class78.method578(124, "(U0a )2 via: ");

    @OriginalMember(owner = "client!be", name = "M", descriptor = "Lpe;")
    public static class100 field1387 = new class100(200);

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "Lij;")
    public static class50 field1401 = class78.method578(121, "k");

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)V")
    public static void method552(int arg0) {
        if (arg0 > -81) {
            method552(16);
        }
        field1401 = null;
        field1399 = null;
        field1387 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field1395;
        if (~arg6 <= -129 && arg1 >= 128 && ~arg6 >= -13057 && arg1 <= 13056) {
            int var8 = -arg7 + class187.method1260((byte) 90, arg6, arg1, class201.field3312);
            int var9 = arg1 - class1.field15;
            int var10 = arg6 - class32.field644;
            if (arg5 >= -100) {
                method555(83);
            }
            int var11 = var8 - class129.field2268;
            int var12 = class13.field313[class221.field3723];
            int var13 = class13.field311[class221.field3723];
            int var14 = class13.field313[class68.field1286];
            int var15 = class13.field311[class68.field1286];
            int var16 = var9 * var14 + var10 * var15 >> 16;
            int var17 = var9 * var15 + -(var10 * var14) >> 16;
            int var19 = var11 * var13 + -(var12 * var17) >> 16;
            int var20 = var11 * var12 + var13 * var17 >> 16;
            if (var20 >= 50) {
                class131.field2299 = (var19 << 9) / var20 + arg3;
                class33.field660 = (var16 << 9) / var20 + arg2;
            } else {
                class33.field660 = -1;
                class131.field2299 = -1;
            }
        } else {
            class33.field660 = -1;
            class131.field2299 = -1;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field1388 = arg2.method1441(111);
                    }
                } else {
                    this.field1394 = arg2.method1441(-116);
                }
            } else {
                this.field1386 = arg2.method1441(-78);
            }
        } else {
            this.field1390 = arg2.method1441(106);
        }
        if (!arg0) {
            field1402 = -32;
        }
        ++field1392;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field1391;
        int[] var3 = super.field2941.method1427(arg1 + 6465, arg0);
        if (arg1 != -27746) {
            method557(19);
        }
        if (super.field2941.field3565) {
            for (int var4 = 0; class211.field3514 > var4; ++var4) {
                int var5 = (class129.field2272[var4] << 12) / this.field1390 + this.field1394;
                int var6 = (class29.field616[arg0] << 12) / this.field1390 + this.field1388;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                int var13 = var5 * var5 >> 12;
                while (~(var11 + var13) > -16385 && ~var12 > ~this.field1386) {
                    ++var12;
                    var9 = (var9 * var10 >> 12) * 2 + var8;
                    var10 = -var11 + var13 - -var7;
                    var13 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field1386 + -1 <= var12 ? 0 : (var12 << 12) / this.field1386;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;B)Lij;")
    public static final class50 method554(String arg0, byte arg1) {
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class50 var3 = new class50();
        ++field1396;
        if (arg1 != 76) {
            return null;
        } else {
            var3.field909 = var2;
            var3.field898 = 0;
            for (int var4 = 0; ~var4 > ~var2.length; ++var4) {
                if (~var2[var4] != -1) {
                    var2[var3.field898++] = var2[var4];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V")
    public static final void method555(int arg0) {
        ++field1398;
        class53.method427((byte) 7);
        class73.method549((byte) 81);
        class214.method1421(1);
        class122.method888((byte) -125);
        class205.method1387(false);
        class227.method1554((byte) 50);
        class63.method489(false);
        if (arg0 > 62) {
            class37.method298(0);
            class121.method882(1);
            class229.method1561(25219);
            class246.method1677(-90);
            class244.method1666(0);
            class129.method918(-10158);
            class159.method1121((byte) -115);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lij;I)Z")
    public static final boolean method556(class50 arg0, int arg1) {
        ++field1389;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1 <= 89) {
                field1399 = null;
            }
            for (int var2 = 0; var2 < class227.field3830; ++var2) {
                if (arg0.method387(class208.field3452[var2], true)) {
                    return true;
                }
            }
            return arg0.method387(class239.field4067.field3097, true);
        }
    }

    @OriginalMember(owner = "client!be", name = "i", descriptor = "(I)V")
    public static final void method557(int arg0) {
        ++field1393;
        Object var1 = class217.field3632;
        synchronized (class217.field3632) {
            if (~class164.field2807 == arg0) {
                class186.field3058.method956(new class45(), (byte) -124, 5);
            }
            class164.field2807 = 600;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZIII)V")
    public static final void method558(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class158.method1105(arg3, arg2, arg3 + arg4, arg2 - -arg0);
        class158.method1104(arg3, arg2, arg4, arg0, 0);
        ++field1400;
        if (~class223.field3762 <= -101) {
            if (class231.field3863 == null || ~class231.field3863.field1636 != ~arg4 || ~class231.field3863.field1643 != ~arg0) {
                class169 var5 = new class169(arg4, arg0);
                class158.method1117(var5.field2836, arg4, arg0);
                class248.method1691(0, class140.field2460, class155.field2701, (byte) 115, 0, arg0, arg4, 0, 0);
                class231.field3863 = var5;
                class221.field3725.method454(120);
            }
            if (arg1) {
                method556((class50) null, 93);
            }
            class231.field3863.method671(arg3, arg2);
            int var6 = class6.field76 * arg4 / class155.field2701 + arg3;
            int var7 = class207.field3430 * arg0 / class140.field2460 + arg2;
            int var8 = class191.field3175 * arg0 / class140.field2460;
            int var9 = class100.field1846 * arg4 / class155.field2701;
            class158.method1113(var6, var7, var9, var8, 16711680, 128);
            class158.method1119(var6, var7, var9, var8, 16711680);
            if (~class126.field2205 < -1 && class126.field2205 % 10 < 5) {
                for (class1 var10 = (class1) class101.field1863.method689(1001); var10 != null; var10 = (class1) class101.field1863.method688(-81)) {
                    if (class206.field3410 == var10.field4) {
                        int var11 = var10.field9 * arg4 / class155.field2701 + arg3;
                        int var12 = var10.field8 * arg0 / class140.field2460 + arg2;
                        class158.method1104(var11 + -2, var12 - 2, 4, 4, 16776960);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }
}
