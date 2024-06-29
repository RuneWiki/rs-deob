import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class125 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Z")
    public boolean field1977 = false;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field1983 = -1;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public int field1982 = -1;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field1987 = -1;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    private int field1988 = -1;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    private int field1994 = -1;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "[Ljava/lang/String;")
    public String[] field1993 = new String[5];

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    private int field1991 = -1;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Z")
    public boolean field1998 = true;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    private int field2003 = -1;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    private int field1981 = -1;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Z")
    public boolean field1979 = true;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public int field2007 = 0;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public int field2008 = -1;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "Z")
    public boolean field2014 = true;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "J")
    public static volatile long field1996 = 0L;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field1989 = 0;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    private int field2004;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    private int field2010;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "Lrk;")
    public static class292 field2011;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "Ljava/lang/String;")
    public String field1999;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Ljava/lang/String;")
    public String field2001;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[I")
    public int[] field2000;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method857(long arg0, byte arg1) {
        field1995++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 > -65) {
                field1989 = 2;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = client.field2679[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)Lud;")
    public final class2 method858(byte arg0) {
        field1984++;
        class2 var2 = (class2) class16.field303.method1879(8887, (long) (this.field1988 | 0x20000));
        if (var2 != null) {
            return var2;
        }
        int var3 = -101 / ((-arg0 - 1) / 48);
        class91.field1430.method1168(0, this.field1988);
        class2 var4 = class100.method709(0, this.field1988, class91.field1430, true);
        if (var4 != null) {
            var4.field3175 = 0;
            var4.field3177 = var4.field3179;
            var4.field3178 = var4.field3181;
            var4.field3169 = 0;
            class16.field303.method1883((long) (this.field1988 | 0x20000), -65, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIBI)I")
    public static final int method859(int arg0, int arg1, byte arg2, int arg3) {
        field2006++;
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        int var6 = arg1 / arg3;
        int var7 = arg3 - 1 & arg1;
        if (arg2 != 88) {
            return -28;
        }
        int var8 = class104.method740(var6, var4, -15533);
        int var9 = class104.method740(var6, var4 + 1, arg2 + -15621);
        int var10 = class104.method740(var6 + 1, var4, -15533);
        int var11 = class104.method740(var6 + 1, var4 - -1, -15533);
        int var12 = class75.method543((byte) -119, var5, var8, arg3, var9);
        int var13 = class75.method543((byte) -119, var5, var10, arg3, var11);
        return class75.method543((byte) -119, var7, var12, arg3, var13);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILrg;)Ljava/lang/String;")
    public static final String method860(int arg0, int arg1, class248 arg2) {
        field1992++;
        if (!client.method1126(arg2).method179((byte) 27, arg0) && arg2.field3986 == null) {
            return null;
        }
        if (arg1 != -1) {
            method859(-40, 100, (byte) 30, 52);
        }
        if (arg2.field3991 == null || arg0 >= arg2.field3991.length || arg2.field3991[arg0] == null || arg2.field3991[arg0].trim().length() == 0) {
            return class61.field881 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field3991[arg0];
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method861(boolean arg0) {
        if (arg0) {
            field2011 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLfj;)V")
    public final void method862(boolean arg0, class274 arg1) {
        while (true) {
            int var3 = arg1.method1849(255);
            if (var3 == 0) {
                field2013++;
                if (!arg0) {
                    this.field1987 = 61;
                    return;
                }
                return;
            }
            this.method863(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLfj;I)V")
    private final void method863(boolean arg0, class274 arg1, int arg2) {
        if (arg0) {
            this.field1975 = -1;
        }
        field1985++;
        if (arg2 == 1) {
            this.field1982 = arg1.method1837(252);
        } else if (arg2 == 2) {
            this.field2008 = arg1.method1837(252);
        } else if (arg2 == 3) {
            this.field1999 = arg1.method1855(-76);
        } else if (arg2 == 4) {
            this.field1990 = arg1.method1812(true);
        } else if (arg2 == 5) {
            this.field1987 = arg1.method1812(true);
        } else if (arg2 == 6) {
            this.field2007 = arg1.method1849(255);
            return;
        } else if (arg2 == 7) {
            int var6 = arg1.method1849(255);
            if ((var6 & 0x2) == 2) {
                this.field1977 = true;
            }
            if ((var6 & 0x1) == 0) {
                this.field1998 = false;
                return;
            }
        } else if (arg2 == 8) {
            this.field1979 = arg1.method1849(255) == 1;
            return;
        } else if (arg2 == 9) {
            this.field2003 = arg1.method1837(252);
            if (this.field2003 == 65535) {
                this.field2003 = -1;
            }
            this.field1991 = arg1.method1837(252);
            if (this.field1991 == 65535) {
                this.field1991 = -1;
            }
            this.field1976 = arg1.method1833((byte) -104);
            this.field1975 = arg1.method1833((byte) -104);
            return;
        } else if (arg2 < 10 || arg2 > 14) {
            if (arg2 != 15) {
                if (arg2 == 16) {
                    this.field2014 = false;
                    return;
                }
                if (arg2 == 17) {
                    this.field2001 = arg1.method1855(-59);
                    return;
                }
                if (arg2 == 18) {
                    this.field1988 = arg1.method1837(252);
                    return;
                }
                if (arg2 == 19) {
                    this.field1983 = arg1.method1837(252);
                    return;
                }
                if (arg2 == 20) {
                    this.field1981 = arg1.method1837(252);
                    if (this.field1981 == 65535) {
                        this.field1981 = -1;
                    }
                    this.field1994 = arg1.method1837(252);
                    if (this.field1994 == 65535) {
                        this.field1994 = -1;
                    }
                    this.field2004 = arg1.method1833((byte) -104);
                    this.field2010 = arg1.method1833((byte) -104);
                } else if (arg2 == 21) {
                    this.field2009 = arg1.method1833((byte) -104);
                    return;
                } else if (arg2 == 22) {
                    this.field2002 = arg1.method1833((byte) -104);
                    return;
                }
                return;
            }
            int var4 = arg1.method1849(255);
            this.field2000 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field2000[var5] = arg1.method1847(-404);
            }
            this.field2005 = arg1.method1833((byte) -104);
            this.field2012 = arg1.method1833((byte) -104);
            return;
        } else {
            this.field1993[arg2 - 10] = arg1.method1855(86);
            return;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZZ)Lag;")
    public final class197 method864(int arg0, boolean arg1, boolean arg2) {
        int var4 = arg1 ? this.field2008 : this.field1982;
        field1978++;
        class197 var5 = (class197) class16.field303.method1879(8887, (long) ((arg1 ? 65536 : 0) | var4));
        if (var5 != null) {
            return var5;
        } else if (class91.field1430.method1168(0, var4)) {
            class2 var6 = class100.method709(0, var4, class91.field1430, true);
            if (var6 != null) {
                var6.field3175 = 0;
                var6.field3177 = var6.field3179;
                var6.field3178 = var6.field3181;
                var6.field3169 = 0;
                class16.field303.method1883((long) (var4 | (arg1 ? 65536 : 0)), 22, var6);
            }
            return arg0 < 70 ? null : var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Z")
    public final boolean method865(int arg0) {
        if (arg0 != 24525) {
            method861(true);
        }
        field1986++;
        if (this.field1991 == -1 && this.field2003 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field1991 == -1) {
            var3 = class119.method821(this.field2003, arg0 ^ 0x5844);
        } else {
            var3 = class68.field1090[this.field1991];
        }
        if (var3 < this.field1976 || this.field1975 < var3) {
            return false;
        } else if (this.field1994 == -1 && this.field1981 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field1994 == -1) {
                var5 = class119.method821(this.field1981, 1929);
            } else {
                var5 = class68.field1090[this.field1994];
            }
            return this.field2004 <= var5 && this.field2010 >= var5;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([BB)Z")
    public static final boolean method866(byte[] arg0, byte arg1) {
        field1997++;
        class274 var2 = new class274(arg0);
        int var3 = var2.method1849(255);
        if (var3 != 1) {
            return false;
        }
        if (arg1 > -99) {
            method861(true);
        }
        boolean var4 = var2.method1849(255) == 1;
        if (var4) {
            class286.method1939((byte) -111, var2);
        }
        class93.method651(false, var2);
        return true;
    }
}
