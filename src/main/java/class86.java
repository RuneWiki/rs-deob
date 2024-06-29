import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class86 {

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[I")
    private int[] field1696;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[B")
    private byte[] field1694;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[I")
    private int[] field1697;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[Lqc;")
    public static class4[] field1687 = new class4[4];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "S")
    public static short field1690 = 1;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field1695;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method558(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1686++;
        int var8 = 92 % ((arg1 + 48) / 40);
        if (class127.method912(arg0, (byte) -110)) {
            client.method1497(class136.field2557[arg0], -1, arg3, arg2, arg5, arg6, arg7, arg4);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLhi;I)[Ldd;")
    public static final class211[] method559(int arg0, byte arg1, class250 arg2, int arg3) {
        field1693++;
        if (class224.method1551(arg0, arg3, arg2, (byte) -94)) {
            return arg1 <= 60 ? null : class202.method1439((byte) -35);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static void method560(byte arg0) {
        int var1 = 72 / ((84 - arg0) / 38);
        field1695 = null;
        field1687 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[B[BIII)I")
    public final int method561(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0 + arg3;
        int var8 = arg5;
        field1691++;
        int var9 = arg4 << 3;
        while (arg0 < var7) {
            int var10 = arg2[arg0] & 0xFF;
            int var11 = this.field1697[var10];
            byte var12 = this.field1694[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class21.method150(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z")
    public static final boolean method562(int arg0, byte arg1) {
        if (arg1 > -99) {
            field1690 = -44;
        }
        field1692++;
        class199 var2 = class14.method109(73, arg0);
        if (var2 == null) {
            return false;
        } else if (class160.field3018 == 1 || class160.field3018 == 2 || class259.field4601 == 2) {
            byte[] var3 = var2.field3656.method1339((byte) 110);
            class33.field545 = new String(var3, 0, var3.length);
            class138.field2588 = var2.field3654;
            if (class259.field4601 != 0) {
                class21.field350 = class138.field2588 + 50000;
                class184.field3394 = class138.field2588 + 40000;
                class255.field4524 = class184.field3394;
            }
            return true;
        } else {
            class185 var4 = class147.field2780;
            if (class259.field4601 != 0) {
                var4 = class87.method567(-11039, new class185[] { class141.field2639, class90.method591(var2.field3654 + 7000, 0) });
            }
            class185 var5 = class147.field2780;
            if (class25.field420 != null) {
                var5 = class87.method567(-11039, new class185[] { class255.field4514, class25.field420 });
            }
            class185 var6 = class87.method567(-11039, new class185[] { class215.field3937, var2.field3656, var4, class242.field4332, class90.method591(class198.field3620, 0), class79.field1370, class90.method591(class119.field2175, 0), var5, class19.field304, class234.field4202 ? class105.field1898 : class271.field4809, class201.field3687, class197.field3610 ? class105.field1898 : class271.field4809, class70.field1233, class221.field4019 ? class105.field1898 : class271.field4809 });
            try {
                class88.field1730.getAppletContext().showDocument(var6.method1308(true), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[S[Lli;II)V")
    public static final void method563(int arg0, short[] arg1, class185[] arg2, int arg3, int arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            class185 var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].method1303(var7, (byte) -12)) {
                    class185 var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method563(var6 - 1, arg1, arg2, arg3, 45);
            method563(arg0, arg1, arg2, var6 + 1, 84);
        }
        field1688++;
        if (arg4 < 30) {
            method562(50, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
    public class86(byte[] arg0) {
        int var2 = arg0.length;
        this.field1696 = new int[8];
        int[] var3 = new int[33];
        this.field1694 = arg0;
        this.field1697 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1697[var5] = var8;
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
                        var3[var10] = class21.method150(var11, var12);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1696[var14] == 0) {
                            this.field1696[var14] = var4;
                        }
                        var14 = this.field1696[var14];
                    }
                    if (this.field1696.length <= var14) {
                        int[] var17 = new int[this.field1696.length * 2];
                        for (int var18 = 0; var18 < this.field1696.length; var18++) {
                            var17[var18] = this.field1696[var18];
                        }
                        this.field1696 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field1696[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lhi;Lhi;Z)V")
    public static final void method564(class250 arg0, class250 arg1, boolean arg2) {
        if (arg2) {
            method560((byte) 69);
        }
        class124.field2234 = arg1;
        class278.field4939 = arg0;
        field1689++;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I[B[BIII)I")
    public final int method565(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1698++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field1696[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1696[var8]) < 0) {
                arg2[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1696[var8];
            }
            int var12;
            if ((var12 = this.field1696[var8]) < 0) {
                arg2[arg5++] = (byte) (~var12);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1696[var8];
            }
            int var13;
            if ((var13 = this.field1696[var8]) < 0) {
                arg2[arg5++] = (byte) (~var13);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1696[var8];
            }
            int var14;
            if ((var14 = this.field1696[var8]) < 0) {
                arg2[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1696[var8];
            }
            int var15;
            if ((var15 = this.field1696[var8]) < 0) {
                arg2[arg5++] = (byte) (~var15);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1696[var8];
            }
            int var16;
            if ((var16 = this.field1696[var8]) < 0) {
                arg2[arg5++] = (byte) (~var16);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1696[var8];
            }
            int var17;
            if ((var17 = this.field1696[var8]) < 0) {
                arg2[arg5++] = (byte) (~var17);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1696[var8];
            }
            int var18;
            if ((var18 = this.field1696[var8]) < 0) {
                arg2[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg3 != -6999) {
            field1690 = 19;
        }
        return var9 + 1 - arg0;
    }
}
