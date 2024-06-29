import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class121 extends class87 {

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    private int field1987 = 2;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    private int field1985 = 5;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    private int field1995 = 0;

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "I")
    private int field2003 = 5;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    private int field1996 = 2048;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "[S")
    private short[] field1999 = new short[512];

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "[B")
    private byte[] field1998 = new byte[512];

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    private int field2005 = 1;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field1988 = new String[500];

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field1986 = 0;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field2002 = " from your ignore list first.";

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
    public static boolean field1990 = false;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "Ljava/lang/String;")
    public static String field2007 = "flash2:";

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "Llc;")
    public static class270 field2009;

    @OriginalMember(owner = "client!nb", name = "gb", descriptor = "Llc;")
    public static class270 field2010;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "[Z")
    public static boolean[] field1994;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field1997;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = class140.field2272[arg0] * this.field1985 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class206.field3032 < ~var7; ++var7) {
                class308.field4966 = Integer.MAX_VALUE;
                class186.field2773 = Integer.MAX_VALUE;
                class280.field4520 = Integer.MAX_VALUE;
                class309.field4982 = Integer.MAX_VALUE;
                int var8 = class138.field2254[var7] * this.field2003 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field1998[255 & (this.field1985 <= var11 ? var11 - this.field1985 : var11)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field1998[255 & var13 + (~this.field2003 < ~var14 ? var14 : -this.field2003 + var14)]);
                        int var27 = var15 + 1;
                        int var16 = -this.field1999[var15] - (var14 << 12) + var8;
                        int var17 = -(var11 << 12) - (this.field1999[var27] - var4);
                        int var18 = this.field2005;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class309.field4982) {
                            class308.field4966 = class186.field2773;
                            class186.field2773 = class280.field4520;
                            class280.field4520 = class309.field4982;
                            class309.field4982 = var19;
                        } else if (~class280.field4520 >= ~var19) {
                            if (~var19 > ~class186.field2773) {
                                class308.field4966 = class186.field2773;
                                class186.field2773 = var19;
                            } else if (var19 < class308.field4966) {
                                class308.field4966 = var19;
                            }
                        } else {
                            class308.field4966 = class186.field2773;
                            class186.field2773 = class280.field4520;
                            class280.field4520 = var19;
                        }
                    }
                }
                int var12 = this.field1987;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class309.field4982 + class280.field4520;
                                }
                            } else {
                                var3[var7] = class308.field4966;
                            }
                        } else {
                            var3[var7] = class186.field2773;
                        }
                    } else {
                        var3[var7] = class280.field4520;
                    }
                } else {
                    var3[var7] = class309.field4982;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V")
    public final void method136(int arg0) {
        ++field2000;
        this.field1998 = class136.method1025(this.field1995, false);
        this.method924(false);
        if (arg0 != 0) {
            method921(true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method920(int arg0, long arg1) {
        ++field2008;
        if (~arg1 < -1L && arg1 < 6582952005840035281L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg1 != -1L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    char var9 = class22.field248[(int) (-(arg1 * 37L) + var7)];
                    if (var9 == '_') {
                        var9 = 160;
                        int var10 = var6.length() - 1;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                if (arg0 <= 5) {
                    method920(76, 85L);
                }
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lpm;")
    public static final class242 method921(boolean arg0) {
        ++field2006;
        return !arg0 ? null : class46.field628;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIILca;Ljava/awt/Component;)Lih;")
    public static final class295 method922(int arg0, int arg1, int arg2, class122 arg3, Component arg4) {
        ++field1992;
        if (~class91.field1459 == -1) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class295 var5 = (class295) Class.forName("qc").newInstance();
                var5.field4751 = arg2;
                var5.field4727 = new int[(!class11.field128 ? 1 : 2) * 256];
                var5.method1797(arg4);
                var5.field4742 = (arg2 & -1024) + 1024;
                if (~var5.field4742 < -16385) {
                    var5.field4742 = 16384;
                }
                var5.method1799(var5.field4742);
                if (class254.field3833 > 0 && class247.field3641 == null) {
                    class247.field3641 = new class215();
                    class247.field3641.field3159 = arg3;
                    arg3.method941(class254.field3833, 124, class247.field3641);
                }
                if (class247.field3641 != null) {
                    if (class247.field3641.field3154[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class247.field3641.field3154[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class262 var6 = new class262(arg3, arg0);
                    var6.field4751 = arg2;
                    var6.field4727 = new int[(class11.field128 ? 2 : 1) * 256];
                    var6.method1797(arg4);
                    var6.field4742 = 16384;
                    var6.method1799(var6.field4742);
                    if (arg1 < class254.field3833 && class247.field3641 == null) {
                        class247.field3641 = new class215();
                        class247.field3641.field3159 = arg3;
                        arg3.method941(class254.field3833, 85, class247.field3641);
                    }
                    if (class247.field3641 != null) {
                        if (class247.field3641.field3154[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class247.field3641.field3154[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class295();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
    public static void method923(int arg0) {
        field1988 = null;
        if (arg0 != 37) {
            field2002 = null;
        }
        field2009 = null;
        field2007 = null;
        field2002 = null;
        field1994 = null;
        field2010 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field2004;
        if (arg2 != 25645) {
            this.field1999 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field1985 = arg0.method366(-16505);
                                }
                            } else {
                                this.field2003 = arg0.method366(-16505);
                            }
                        } else {
                            this.field2005 = arg0.method366(-16505);
                        }
                    } else {
                        this.field1987 = arg0.method366(-16505);
                    }
                } else {
                    this.field1996 = arg0.method331(arg2 ^ -25663);
                }
            } else {
                this.field1995 = arg0.method366(-16505);
            }
        } else {
            this.field2003 = this.field1985 = arg0.method366(-16505);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
    private final void method924(boolean arg0) {
        if (arg0) {
            field2009 = null;
        }
        Random var2 = new Random((long) this.field1995);
        this.field1999 = new short[512];
        ++field1993;
        if (this.field1996 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field1999[var3] = (short) class275.method1912(this.field1996, -93, var2);
            }
        }
    }
}
