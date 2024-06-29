import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class280 {

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[B")
    private byte[] field4916;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[I")
    private int[] field4929;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[I")
    private int[] field4917;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4915 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4918 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lqk;")
    public static class207 field4913 = class24.method212(255, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lqk;")
    public static class207 field4914 = class24.method212(255, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4923 = 0;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Ldd;")
    public static class132 field4921 = new class132();

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lqk;")
    public static class207 field4930 = class24.method212(255, " ");

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lpk;")
    public static class99 field4919;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "[Ldg;")
    public static class139[] field4920;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BII[B)I")
    public final int method1898(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field4922++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg4;
        if (arg3 != -8337) {
            return -127;
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var7 = this.field4929[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field4929[var7]) < 0) {
                arg5[arg1++] = (byte) (~var11);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4929[var7];
            }
            int var12;
            if ((var12 = this.field4929[var7]) < 0) {
                arg5[arg1++] = (byte) (~var12);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4929[var7];
            }
            int var13;
            if ((var13 = this.field4929[var7]) < 0) {
                arg5[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4929[var7];
            }
            int var14;
            if ((var14 = this.field4929[var7]) < 0) {
                arg5[arg1++] = (byte) (~var14);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4929[var7];
            }
            int var15;
            if ((var15 = this.field4929[var7]) < 0) {
                arg5[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4929[var7];
            }
            int var16;
            if ((var16 = this.field4929[var7]) < 0) {
                arg5[arg1++] = (byte) (~var16);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4929[var7];
            }
            int var17;
            if ((var17 = this.field4929[var7]) < 0) {
                arg5[arg1++] = (byte) (~var17);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4929[var7];
            }
            int var18;
            if ((var18 = this.field4929[var7]) < 0) {
                arg5[arg1++] = (byte) (~var18);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method1899(int arg0) {
        if (arg0 != 503) {
            field4928 = -91;
        }
        field4913 = null;
        field4920 = null;
        field4930 = null;
        field4919 = null;
        field4914 = null;
        field4921 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIILpk;)[Luh;")
    public static final class100[] method1900(byte arg0, int arg1, int arg2, class99 arg3) {
        field4931++;
        if (class78.method594(arg1, arg3, 109, arg2)) {
            return arg0 == -17 ? class208.method1475((byte) 22) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public static int method1901(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZIBIIZ)V")
    public static final void method1902(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        field4927++;
        if (arg0 == 3) {
            method1902(class156.field2743, true, -1, (byte) 80, -1, arg5, true);
            return;
        }
        Container var7;
        if (class126.field2189 != null) {
            var7 = class126.field2189;
        } else if (class272.field4794 == null) {
            var7 = class20.field326.field4207;
        } else {
            var7 = class272.field4794;
        }
        class182.field3246 = var7.getSize().width;
        class215.field3821 = var7.getSize().height;
        if (class272.field4794 == var7) {
            Insets var8 = class272.field4794.getInsets();
            class215.field3821 -= var8.top + var8.bottom;
            class182.field3246 -= var8.left + var8.right;
        }
        int var9 = 101 % ((arg3 + 47) / 50);
        if (arg0 < 2) {
            class107.field1906 = 0;
            class17.field267 = (class182.field3246 - 765) / 2;
            class244.field4428 = 503;
            class31.field625 = 765;
        } else {
            class17.field267 = 0;
            class107.field1906 = 0;
            class244.field4428 = class215.field3821;
            class31.field625 = class182.field3246;
        }
        if (arg1) {
            class55.method415(class112.field1949, true);
            class244.method1721(0, class112.field1949);
            if (class213.field3776 != null) {
                class213.field3776.method1694(4, class112.field1949);
            }
            class136.field2347.method683(false);
            class286.method1946(class112.field1949, true);
            class30.method235(class112.field1949, -218);
            if (class213.field3776 != null) {
                class213.field3776.method1695(class112.field1949, (byte) 107);
            }
        } else {
            class112.field1949.setSize(class31.field625, class244.field4428);
            if (class272.field4794 == var7) {
                Insets var10 = class272.field4794.getInsets();
                class112.field1949.setLocation(class17.field267 + var10.left, class107.field1906 + var10.top);
            } else {
                class112.field1949.setLocation(class17.field267, class107.field1906);
            }
        }
        if (arg0 > 0) {
            method1902(0, true, -1, (byte) -106, -1, arg5, true);
            return;
        }
        class46.field914 = !class212.method1512(-34);
        if (class165.field2915 != -1) {
            class202.method1404(-19680, true);
        }
        if (class98.field1738 != null && (class250.field4524 == 30 || class250.field4524 == 25)) {
            class178.method1271(2);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class140.field2431[var11] = true;
        }
        class57.field1053 = true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Lcc;")
    public static final class209 method1903(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3136;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIII[BI)I")
    public final int method1904(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg2 + arg5;
        field4924++;
        int var8 = 0;
        if (arg1 != 16595) {
            field4919 = null;
        }
        int var9 = arg3 << 3;
        while (var7 > arg2) {
            int var10 = arg4[arg2] & 0xFF;
            int var11 = this.field4917[var10];
            byte var12 = this.field4916[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var12;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class281.method1906(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1905(byte arg0, String arg1) throws ClassNotFoundException {
        field4925++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg0 != -51) {
            return null;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
    public class280(byte[] arg0) {
        int var2 = arg0.length;
        this.field4916 = arg0;
        this.field4929 = new int[8];
        int[] var3 = new int[33];
        this.field4917 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4917[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class281.method1906(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field4929[var14] == 0) {
                            this.field4929[var14] = var4;
                        }
                        var14 = this.field4929[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4929.length) {
                        int[] var18 = new int[this.field4929.length * 2];
                        for (int var19 = 0; var19 < this.field4929.length; var19++) {
                            var18[var19] = this.field4929[var19];
                        }
                        this.field4929 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field4929[var14] = ~var5;
            }
        }
    }
}
