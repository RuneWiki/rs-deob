import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class454 extends class264 {

    @OriginalMember(owner = "client!up", name = "I", descriptor = "Lbn;")
    public static class160 field6697 = new class160(75, 4);

    @OriginalMember(owner = "client!up", name = "O", descriptor = "[I")
    public static int[] field6703 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "[I")
    public static int[] field6705;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public int field6678;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public int field6679;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "I")
    public int field6682;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public int field6683;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public int field6685;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public int field6689;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "I")
    public int field6691;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public int field6694;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "I")
    public int field6695;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public int field6696;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    public int field6699;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    public int field6700;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public int field6701;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public int field6702;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "Lct;")
    public static class104 field6706;

    // $FF: synthetic field
    @OriginalMember(owner = "client!up", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field6707;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
    public static final void method2809(int arg0) {
        field6680++;
        int[] var1 = new int[class157.field2119.field154];
        int var2 = 0;
        for (int var3 = 0; var3 < class157.field2119.field154; var3++) {
            class427 var5 = class157.field2119.method176((byte) -84, var3);
            if (var5.field6179 >= 0 || var5.field6176 >= 0) {
                var1[var2++] = var3;
            }
        }
        class15.field247 = new int[var2];
        if (arg0 == -11288) {
            for (int var4 = 0; var4 < var2; var4++) {
                class15.field247[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(CI)C")
    public static final char method2810(char arg0, int arg1) {
        field6698++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else {
            if (arg1 <= 45) {
                field6703 = null;
            }
            if (arg0 == 'ß') {
                return 's';
            } else if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZC)Z")
    public static final boolean method2811(boolean arg0, char arg1) {
        if (arg0) {
            return false;
        } else {
            field6687++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
    public static void method2812(int arg0) {
        field6706 = null;
        field6703 = null;
        field6697 = null;
        if (arg0 == 1) {
            field6705 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
    public static final void method2813(int arg0, int arg1) {
        class337 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class378 var4 = class28.field401[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class380.field5590; var5++) {
                    for (int var6 = 0; var6 < class329.field4899; var6++) {
                        var2 = var4.method1426(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class167.field2206;
                            int var8 = var5 << class167.field2206;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class378 var10 = class28.field401[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1429(var6, var5) - var10.method1429(var6, var5);
                                    int var12 = var4.method1429(var6 + 1, var5) - var10.method1429(var6 + 1, var5);
                                    int var13 = var4.method1429(var6 + 1, var5 + 1) - var10.method1429(var6 + 1, var5 + 1);
                                    int var14 = var4.method1429(var6, var5 + 1) - var10.method1429(var6, var5 + 1);
                                    var10.method1430(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public static final void method2814(boolean arg0) {
        class257.method1773((byte) -10, class354.field5161);
        class308.field4540++;
        field6686++;
        class159.field2132.method1727(-128, class329.method2151(0));
        class159.field2132.method1750((byte) 0, class214.field3016);
        class159.field2132.method1750((byte) 0, class375.field5473);
        class159.field2132.method1727(-128, class275.field4077);
        if (arg0) {
            method2818((byte) 34, -126, -5);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)Lnk;")
    public static final class214 method2815(boolean arg0, int arg1) {
        if (arg0) {
            method2813(-112, -39);
        }
        field6681++;
        class214 var2 = (class214) class304.field4444.method1933((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class165.field2175.method715(class115.method804(arg1, 255), (byte) 58, class37.method335(arg1, 1805455176));
        class214 var4 = new class214();
        if (var3 != null) {
            var4.method1471(new class256(var3), false);
        }
        class304.field4444.method1937(-28, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILfp;B)Lbi;")
    public final class143 method2816(int arg0, class9 arg1, byte arg2) {
        field6688++;
        if (arg2 > -7) {
            this.field6678 = -45;
        }
        int var4 = class4.field69[this.field6683];
        if (var4 == 0) {
            class422 var11 = class319.method2098(this.field6700, this.field6695, this.field6702);
            if (var11 instanceof class346) {
                class346 var12 = (class346) var11;
                if (var12.field5091 != null) {
                    return ((class438) var12.field5091).method11(arg1, arg0, -23109);
                }
            }
        } else if (var4 == 1) {
            class233 var5 = class77.method538(this.field6700, this.field6695, this.field6702);
            if (var5 instanceof class403) {
                class403 var6 = (class403) var5;
                if (var6.field5812 != null) {
                    return ((class438) var6.field5812).method11(arg1, arg0, -23109);
                }
            }
        } else if (var4 == 2) {
            class336 var7 = class188.method1287(this.field6700, this.field6695, this.field6702, field6707 == null ? (field6707 = method2820("jb")) : field6707);
            if (var7 instanceof class260) {
                class260 var8 = (class260) var7;
                if (var8.field3854 != null) {
                    return ((class438) var8.field3854).method11(arg1, arg0, -23109);
                }
            }
        } else if (var4 == 3) {
            class323 var9 = class137.method913(this.field6700, this.field6695, this.field6702);
            if (var9 instanceof class184) {
                class184 var10 = (class184) var9;
                if (var10.field2591 != null) {
                    return ((class438) var10.field2591).method11(arg1, arg0, -23109);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(JI)V")
    public static final void method2817(long arg0, int arg1) {
        class159.field2132.field3762 = 0;
        field6692++;
        class159.field2132.method1727(-128, class33.field466.field892);
        if (arg1 != 115) {
            return;
        }
        class159.field2132.method1730(arg0, false);
        class244.field3616 = -3;
        class257.field3807 = 0;
        class263.field3899 = 0;
        class22.field310 = 1;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)I")
    public static final int method2818(byte arg0, int arg1, int arg2) {
        field6690++;
        if (arg0 != 23) {
            method2815(true, 105);
        }
        int var3 = class423.method2607(4, arg2 + 45365, (byte) 87, arg1 + 91923) + (class423.method2607(2, arg2 + 10294, (byte) 87, arg1 + 37821) - 128 >> 1) + (class423.method2607(1, arg2, (byte) 87, arg1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "(I)V")
    public static final void method2819(int arg0) {
        if (arg0 != -3) {
            method2809(51);
        }
        field6693++;
        class34.field492.method2313(118);
        class318.field4665.method2313(123);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2820(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class409("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field6705 = new int[200];
    }
}
