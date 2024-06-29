import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class201 {

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[I")
    private int[] field3313;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Luf;")
    public static class168 field3304 = class148.method1019(-1720, "; Max)2Age=");

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field3310 = 2;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static volatile int field3309 = -1;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[J")
    public static long[] field3311 = new long[100];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lek;")
    public static class244 field3315;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3307;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 4)
    public static void method1407(byte arg0) {
        field3315 = null;
        field3304 = null;
        field3307 = null;
        if (arg0 >= 74) {
            field3311 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lj;IILcj;)V", line = 32)
    public static final void method1408(class153 arg0, int arg1, int arg2, class75 arg3) {
        class50 var4 = new class50();
        var4.field606 = arg0.method1042((byte) 117);
        var4.field604 = arg0.method1089((byte) -14);
        var4.field608 = new int[var4.field606];
        var4.field602 = new class112[var4.field606];
        var4.field600 = new byte[var4.field606][][];
        field3316++;
        var4.field603 = new int[var4.field606];
        if (arg1 != 3) {
            field3309 = 46;
        }
        var4.field601 = new class112[var4.field606];
        var4.field607 = new int[var4.field606];
        for (int var5 = 0; var5 < var4.field606; var5++) {
            try {
                int var6 = arg0.method1042((byte) 97);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method1075(56).method1174(true));
                    String var8 = new String(arg0.method1075(arg1 + 107).method1174(true));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method1089((byte) -14);
                    }
                    var4.field608[var5] = var6;
                    var4.field607[var5] = var9;
                    var4.field601[var5] = arg3.method425(var8, class289.method1988(arg1, 3), class140.method964((byte) 54, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method1075(57).method1174(true));
                    String var11 = new String(arg0.method1075(98).method1174(true));
                    int var12 = arg0.method1042((byte) 127);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method1075(27).method1174(true));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method1089((byte) -14);
                            var15[var16] = new byte[var17];
                            arg0.method1080(var17, (byte) -65, 0, var15[var16]);
                        }
                    }
                    var4.field608[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class140.method964((byte) 54, var13[var19]);
                    }
                    var4.field602[var5] = arg3.method435(var11, -66, var18, class140.method964((byte) 54, var10));
                    var4.field600[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field603[var5] = -1;
            } catch (SecurityException var26) {
                var4.field603[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field603[var5] = -3;
            } catch (Exception var28) {
                var4.field603[var5] = -4;
            } catch (Throwable var29) {
                var4.field603[var5] = -5;
            }
        }
        class167.field2678.method451(-91453648, var4);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 146)
    public static final void method1409(int arg0) {
        field3306++;
        int var1 = 0;
        if (arg0 != -105) {
            field3312 = 17;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class238.method1599(true, class92.field1424, var1, var3, 21849, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([I)V", line = 192)
    public class201(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field3313 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3313[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3313[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3313[var5 + var5] = arg0[var4];
            this.field3313[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I", line = 233)
    public final int method1410(int arg0, int arg1) {
        field3308++;
        int var3 = (this.field3313.length >> 1) + arg0;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field3313[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3313[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V", line = 258)
    public static final void method1411(byte arg0) {
        field3314++;
        int var1 = class102.field1588.method207(class217.field3548);
        for (int var2 = 0; var2 < class22.field275; var2++) {
            int var3 = class102.field1588.method207(class142.method979(var2, true));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class22.field275 * 15 + 21;
        int var5 = class166.field2661;
        int var6 = class301.field5093 - (var1 / 2);
        if (class14.field142 < var6 + var1) {
            var6 = class14.field142 - var1;
        }
        if ((var4 + var5) > class299.field5069) {
            var5 = class299.field5069 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (arg0 != -117) {
            field3310 = -99;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class211.field3471 == 1) {
            if (class301.field5093 == class187.field2955 && class25.field310 == class166.field2661) {
                class110.field1727 = class22.field275 * 15 + 22;
                class211.field3471 = 0;
                class131.field2031 = var5;
                class121.field1888 = true;
                class79.field1124 = var1;
                class20.field242 = var6;
            }
        } else if (class301.field5093 == class206.field3384 && class83.field1244 == class166.field2661) {
            class131.field2031 = var5;
            class20.field242 = var6;
            class110.field1727 = class22.field275 * 15 + 22;
            class211.field3471 = 0;
            class121.field1888 = true;
            class79.field1124 = var1;
        } else {
            class25.field310 = class83.field1244;
            class211.field3471 = 1;
            class187.field2955 = class206.field3384;
        }
    }
}
