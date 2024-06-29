import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class29 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    private int field361 = 128;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "B")
    public byte field365 = 0;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    private int field371 = 0;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    private int field369 = 128;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public int field373 = -1;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    private int field375 = 0;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    private int field384 = 0;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    private int field380 = -1;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Z")
    public boolean field382 = false;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Len;")
    public class201 field386;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[S")
    private short[] field366;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "[S")
    private short[] field377;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[S")
    private short[] field378;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "[S")
    private short[] field385;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;BI)I", line = 15)
    public static final int method144(String arg0, byte arg1, int arg2) {
        field364++;
        if (arg1 != 77) {
            method150(-58, 32, 75, -74, 84);
        }
        return class278.method1700(arg0, (byte) 66, arg2, true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lnc;IIIILqq;I)Lcd;", line = 27)
    public final class198 method145(class21 arg0, int arg1, int arg2, int arg3, int arg4, class318 arg5, int arg6) {
        if (arg2 <= 124) {
            method154(-22, null, -92, (byte) -110, -95, -29);
        }
        field374++;
        return this.method146(null, arg6, false, arg3, null, (byte) 5, arg0, 30935, 0, arg4, arg5, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lfo;IZILfo;BLnc;IIILqq;III)Lcd;", line = 56)
    private final class198 method146(class343 arg0, int arg1, boolean arg2, int arg3, class343 arg4, byte arg5, class21 arg6, int arg7, int arg8, int arg9, class318 arg10, int arg11, int arg12, int arg13) {
        field362++;
        int var15 = arg1;
        class87 var16 = this.field373 == -1 || arg12 == -1 ? null : arg6.method106(-86, this.field373);
        boolean var17 = arg2 & this.field365 != 0;
        if (var16 != null) {
            var15 = arg1 | var16.method615((byte) 17, arg9, arg12, false);
        }
        if (var17) {
            var15 |= this.field365 == 3 ? 7 : 2;
        }
        if (this.field369 != 128) {
            var15 |= 0x2;
        }
        if (this.field361 != 128 || this.field384 != 0) {
            var15 |= 0x5;
        }
        class288 var18 = this.field386.field3197;
        class198 var19;
        synchronized (this.field386.field3197) {
            var19 = (class198) this.field386.field3197.method1752(0, (long) (this.field363 |= arg10.field4787 << 29));
        }
        if (var19 == null || arg10.method1944(var19.method489(), var15) != 0) {
            if (var19 != null) {
                var15 = arg10.method1951(var15, var19.method489());
            }
            int var20 = var15;
            if (this.field366 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field385 != null) {
                var20 |= 0x8000;
            }
            class303 var21 = class175.method1096(this.field370, -6, this.field386.field3193, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field4564 < 13) {
                var21.method1822(-13275, 0);
            }
            var19 = arg10.method1908(var21, var20, this.field386.field3198, this.field371 + 64, this.field375 + 850);
            if (this.field366 != null) {
                for (int var22 = 0; var22 < this.field366.length; var22++) {
                    var19.method485(this.field366[var22], this.field377[var22]);
                }
            }
            if (this.field385 != null) {
                for (int var23 = 0; var23 < this.field385.length; var23++) {
                    var19.method505(this.field385[var23], this.field378[var23]);
                }
            }
            var19.method504(var15);
            class288 var24 = this.field386.field3197;
            synchronized (this.field386.field3197) {
                this.field386.field3197.method1758(1, var19, (long) (this.field363 |= arg10.field4787 << 29));
            }
        }
        class198 var25 = var16 == null ? var19.method511(arg5, var15, true) : var16.method618(0, arg5, var19, arg3, arg9, -408, arg12, var15);
        if (arg7 != 30935) {
            this.method145(null, -66, 79, -17, -59, null, -15);
        }
        if (this.field361 != 128 || this.field369 != 128) {
            var25.method487(this.field361, this.field369, this.field361);
        }
        if (this.field384 != 0) {
            if (this.field384 == 90) {
                var25.method476(4096);
            }
            if (this.field384 == 180) {
                var25.method476(8192);
            }
            if (this.field384 == 270) {
                var25.method476(12288);
            }
        }
        if (var17) {
            var25.method463(this.field365, this.field380, arg0, arg4, arg8, arg13, arg11);
        }
        var25.method504(arg1);
        return var25;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILqq;IZIIIILfo;Lnc;IILfo;)Lcd;", line = 174)
    public final class198 method147(int arg0, class318 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class343 arg8, class21 arg9, int arg10, int arg11, class343 arg12) {
        if (arg10 > -122) {
            this.field386 = null;
        }
        field367++;
        return this.method146(arg8, arg0, arg3, arg2, arg12, (byte) 2, arg9, 30935, arg7, arg6, arg1, arg11, arg5, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lha;I)V", line = 189)
    public final void method148(class40 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method257((byte) 119);
            if (var3 == 0) {
                field368++;
                if (arg1 != 0) {
                    method150(14, -28, -101, 91, -39);
                    return;
                }
                return;
            }
            this.method149(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILha;)V", line = 211)
    private final void method149(int arg0, int arg1, class40 arg2) {
        if (arg0 == 1) {
            this.field370 = arg2.method254((byte) -80);
        } else if (arg0 == 2) {
            this.field373 = arg2.method254((byte) -85);
        } else if (arg0 == 4) {
            this.field361 = arg2.method254((byte) -77);
        } else if (arg0 == 5) {
            this.field369 = arg2.method254((byte) -81);
        } else if (arg0 == 6) {
            this.field384 = arg2.method254((byte) -104);
        } else if (arg0 == 7) {
            this.field371 = arg2.method257((byte) 29);
        } else if (arg0 == 8) {
            this.field375 = arg2.method257((byte) 121);
        } else if (arg0 == 9) {
            this.field380 = 8224;
            this.field365 = 3;
        } else if (arg0 == 10) {
            this.field382 = true;
        } else if (arg0 == 11) {
            this.field365 = 1;
        } else if (arg0 == 12) {
            this.field365 = 4;
        } else if (arg0 == 13) {
            this.field365 = 5;
        } else if (arg0 == 14) {
            this.field365 = 2;
            this.field380 = arg2.method257((byte) 41) * 256;
        } else if (arg0 == 15) {
            this.field365 = 3;
            this.field380 = arg2.method254((byte) -36);
        } else if (arg0 == 16) {
            this.field365 = 3;
            this.field380 = arg2.method255((byte) 96);
        } else if (arg0 == 40) {
            int var4 = arg2.method257((byte) 78);
            this.field377 = new short[var4];
            this.field366 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field366[var5] = (short) arg2.method254((byte) -70);
                this.field377[var5] = (short) arg2.method254((byte) -125);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method257((byte) 119);
            this.field378 = new short[var6];
            this.field385 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field385[var7] = (short) arg2.method254((byte) -114);
                this.field378[var7] = (short) arg2.method254((byte) -92);
            }
        }
        if (arg1 == 0) {
            field383++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V", line = 335)
    public static final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class355.field5296 = arg2;
        class478.field7310 = arg0;
        class320.field4818 = arg1;
        field379++;
        if (arg3 == 7142) {
            class248.field3808 = arg4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIZ)I", line = 349)
    public static final int method151(int arg0, int arg1, int arg2, boolean arg3) {
        field376++;
        if (arg2 != 0) {
            return 30;
        }
        class146 var4 = class478.method2889(arg0, (byte) 27, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && var4.field2359.length > arg1) {
            return var4.field2359[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqq;Lnc;IIIII)Lcd;", line = 373)
    public final class198 method152(class318 arg0, class21 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 3) {
            this.field385 = null;
        }
        field372++;
        return this.method146(null, arg5, false, arg3, null, (byte) 2, arg1, 30935, 0, arg2, arg0, 0, arg6, 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIBI)Z", line = 386)
    public static final boolean method153(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field381++;
        if ((class146.field2369[0][arg0][arg1] & 0x2) != 0) {
            return true;
        } else if ((class146.field2369[arg2][arg0][arg1] & 0x10) != 0) {
            return false;
        } else if (arg4 == class76.method561(arg2, arg0, true, arg1)) {
            return true;
        } else {
            int var5 = 6 % ((-arg3 - 67) / 51);
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[[[BIBII)V", line = 409)
    public static final void method154(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class321.field4828++;
        class65.field1074 = 0;
        for (int var6 = class273.field4149; var6 < class483.field7381; var6++) {
            class268[][] var17 = class321.field4830[var6];
            for (int var18 = class56.field916; var18 < class255.field3886; var18++) {
                for (int var19 = class72.field1287; var19 < class14.field197; var19++) {
                    class268 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class358.field5313[var18 + class320.field4826 - class7.field82][var19 + class320.field4826 - class248.field3812] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field4044 = true;
                            var20.field4053 = true;
                            if (var20.field4045 == null) {
                                var20.field4048 = false;
                            } else {
                                var20.field4048 = true;
                            }
                            class65.field1074++;
                        } else {
                            var20.field4044 = false;
                            var20.field4053 = false;
                            var20.field4041 = 0;
                            if (var18 >= class7.field82 - 16 && var18 <= class7.field82 + 16 && var19 >= class248.field3812 - 16 && var19 <= class248.field3812 + 16 && (var20.field4059 != null || var20.field4063 != null || var20.field4052 != null || var20.field4051 != null || var20.field4042 != null || var20.field4045 != null)) {
                                class100.field1810.method862((byte) 94, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class99.field1801 == class262.field3978;
        for (int var8 = class273.field4149; var8 < class483.field7381; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class179.field2801.method1893() && var8 >= arg2 && arg1 != null) {
                int var10 = class358.field5313.length;
                if (class358.field5313.length + class56.field916 > class377.field5492) {
                    var10 -= class358.field5313.length + class56.field916 - class377.field5492;
                }
                int var11 = class358.field5313[0].length;
                if (class358.field5313[0].length + class72.field1287 > class347.field5132) {
                    var11 -= class358.field5313[0].length + class72.field1287 - class347.field5132;
                }
                int var12 = class139.field2282;
                while (true) {
                    if (var12 >= var10) {
                        class100.field1810.method856(var8, 0, var9, class99.field1801[var8], true);
                        break;
                    }
                    int var13 = class56.field916 + var12 - class139.field2282;
                    for (int var14 = class312.field4697; var14 < var11; var14++) {
                        class323.field4845[var12][var14] = false;
                        if (class358.field5313[var12][var14]) {
                            int var15 = class72.field1287 + var14 - class312.field4697;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class321.field4830[var16][var13][var15] != null && class321.field4830[var16][var13][var15].field4062 == var8) {
                                    class323.field4845[var12][var14] = class321.field4830[var16][var13][var15].field4044;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class100.field1810.method856(var8, 0, var9, class99.field1801[var8], false);
            }
            class100.field1810.method858((byte) -70);
        }
        if (!class413.method2433(true)) {
            class413.method2433(false);
        }
    }
}
