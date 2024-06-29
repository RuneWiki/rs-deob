import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class47 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Lhs;")
    public class422 field598 = new class422();

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "Lhs;")
    private class422 field605;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static final void method383(int arg0) {
        field596++;
        if (class284.field3868 == 0) {
            return;
        }
        try {
            if ((++class445.field6240) > 2000) {
                if (class398.field5513 != null) {
                    class398.field5513.method1324(124);
                    class398.field5513 = null;
                }
                if (class123.field1850 >= 1) {
                    class284.field3868 = 0;
                    class436.field6158 = -5;
                    return;
                }
                class284.field3868 = 1;
                class445.field6240 = 0;
                if (class418.field5780 == class111.field1704) {
                    class111.field1704 = class189.field2729;
                } else {
                    class111.field1704 = class418.field5780;
                }
                class123.field1850++;
            }
            if (class284.field3868 == 1) {
                class332.field4479 = class122.field1839.method588((byte) -65, class111.field1704, class403.field5562);
                class284.field3868 = 2;
            }
            if (class284.field3868 == 2) {
                if (class332.field4479.field3875 == 2) {
                    throw new IOException();
                }
                if (class332.field4479.field3875 != 1) {
                    return;
                }
                class398.field5513 = new class191((Socket) class332.field4479.field3871, class122.field1839);
                class332.field4479 = null;
                class398.field5513.method1328(0, class88.field1232.field5076, class88.field1232.field5048, 3);
                if (class39.field513 != null) {
                    class39.field513.method1333(-19721);
                }
                if (class431.field6047 != null) {
                    class431.field6047.method1333(-19721);
                }
                int var1 = class398.field5513.method1329(-19824);
                if (class39.field513 != null) {
                    class39.field513.method1333(-19721);
                }
                if (class431.field6047 != null) {
                    class431.field6047.method1333(-19721);
                }
                if (var1 != 21) {
                    class436.field6158 = var1;
                    class284.field3868 = 0;
                    class398.field5513.method1324(108);
                    class398.field5513 = null;
                    return;
                }
                class284.field3868 = 3;
            }
            if (class284.field3868 == 3) {
                if (class398.field5513.method1325(0) < 1) {
                    return;
                }
                class220.field3090 = new String[class398.field5513.method1329(-19824)];
                class284.field3868 = 4;
            }
            if (class284.field3868 != 4) {
                int var3 = -114 % ((46 - arg0) / 56);
            } else if (class398.field5513.method1325(0) >= (class220.field3090.length * 8)) {
                class75.field1068.field5048 = 0;
                class398.field5513.method1326(class75.field1068.field5076, (byte) 120, class220.field3090.length * 8, 0);
                for (int var2 = 0; var2 < class220.field3090.length; var2++) {
                    class220.field3090[var2] = class68.method549(-18322, class75.field1068.method2290(-1083442040));
                }
                class436.field6158 = 21;
                class284.field3868 = 0;
                class398.field5513.method1324(116);
                class398.field5513 = null;
            }
        } catch (IOException var4) {
            if (class398.field5513 != null) {
                class398.field5513.method1324(118);
                class398.field5513 = null;
            }
            if (class123.field1850 < 1) {
                class445.field6240 = 0;
                class284.field3868 = 1;
                class123.field1850++;
                if (class418.field5780 == class111.field1704) {
                    class111.field1704 = class189.field2729;
                } else {
                    class111.field1704 = class418.field5780;
                }
            } else {
                class436.field6158 = -4;
                class284.field3868 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZZ)V")
    public static final void method384(boolean arg0, boolean arg1) {
        field604++;
        byte[][] var2;
        if (arg0) {
            var2 = class143.field2083;
        } else {
            var2 = class204.field2902;
        }
        int var3 = class115.field1750.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class171.field2413[var4] >> 8) * 64 - class6.field65;
                int var7 = (class171.field2413[var4] & 0xFF) * 64 - class371.field5148;
                class140.method1025(255);
                class445.method2751((byte) -124, var6, var7, class403.field5567, arg0, class354.field4765, var5);
            }
        }
        if (!arg1) {
            field606 = 115;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Lhs;")
    public final class422 method385(byte arg0) {
        field602++;
        class422 var2 = this.field598.field5847;
        if (this.field598 == var2) {
            this.field605 = null;
            return null;
        } else if (arg0 == 85) {
            this.field605 = var2.field5847;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    public final void method386(byte arg0) {
        field601++;
        while (true) {
            class422 var2 = this.field598.field5847;
            if (this.field598 == var2) {
                if (arg0 <= 12) {
                    this.method385((byte) 34);
                }
                this.field605 = null;
                return;
            }
            var2.method2606(false);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lhs;Z)V")
    public final void method387(class422 arg0, boolean arg1) {
        field600++;
        if (arg0.field5837 != null) {
            arg0.method2606(false);
        }
        arg0.field5847 = this.field598;
        if (!arg1) {
            arg0.field5837 = this.field598.field5837;
            arg0.field5837.field5847 = arg0;
            arg0.field5847.field5837 = arg0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[Lbm;IIIILea;[BZIBI)V")
    public static final void method388(int arg0, class325[] arg1, int arg2, int arg3, int arg4, int arg5, class58 arg6, byte[] arg7, boolean arg8, int arg9, byte arg10, int arg11) {
        field597++;
        class366 var12 = new class366(arg7);
        if (arg10 != 30) {
            return;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method2293(arg10 ^ 0xFFFFFFE0);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2251(-122);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method2306((byte) 109);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg0 == var19 && arg4 <= var18 && var18 < (arg4 + 8) && var17 >= arg11 && var17 < arg11 + 8) {
                    class447 var23 = class133.method996((byte) -19, var13);
                    int var24 = class372.method2332(var23.field6322, arg9, var18 & 0x7, true, var23.field6330, var22, var17 & 0x7) + arg3;
                    int var25 = arg5 + class60.method476(var22, var18 & 0x7, var23.field6322, arg9, (byte) -83, var17 & 0x7, var23.field6330);
                    if (var24 > 0 && var25 > 0 && class11.field107 - 1 > var24 && var25 < class264.field3620 - 1) {
                        class325 var26 = null;
                        if (!arg8) {
                            int var27 = arg2;
                            if ((class302.field4122[1][var24][var25] & 0x2) == 2) {
                                var27 = arg2 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg1[var27];
                            }
                        }
                        class405.method2499(var26, var25, arg9 + var22 & 0x3, 5000, var13, arg2, arg8, var21, arg2, -1, var24, arg6, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lof;Z)I")
    public static final int method389(class423 arg0, boolean arg1) {
        field599++;
        if (arg1) {
            return 62;
        }
        int var2 = arg0.field5870;
        class60 var3 = arg0.method1283((byte) -74);
        if (arg0.field2597) {
            var2 = arg0.field5858;
        } else if (arg0.field2587 == var3.field765 || arg0.field2587 == var3.field782 || arg0.field2587 == var3.field786 || arg0.field2587 == var3.field769) {
            var2 = arg0.field5860;
        } else if (arg0.field2587 == var3.field770 || arg0.field2587 == var3.field806 || arg0.field2587 == var3.field814 || arg0.field2587 == var3.field802) {
            var2 = arg0.field5862;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Lhs;")
    public final class422 method390(byte arg0) {
        field603++;
        class422 var2 = this.field605;
        if (this.field598 == var2) {
            this.field605 = null;
            return null;
        } else {
            int var3 = -108 % ((arg0 - 16) / 49);
            this.field605 = var2.field5847;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
    public class47() {
        this.field598.field5847 = this.field598;
        this.field598.field5837 = this.field598;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public static final void method391(int arg0) {
        field595++;
        if (arg0 != 21974 || class211.field2946 == null) {
            return;
        }
        if (class211.field2946.field3875 == 1) {
            class211.field2946 = null;
            return;
        }
        if (class211.field2946.field3875 == 2) {
            class417.method2575(2, class143.field2086, class100.field1390, (byte) -100);
            class211.field2946 = null;
            return;
        }
    }

    static {
        new class368("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field606 = 0;
    }
}
