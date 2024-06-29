import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class430 {

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public int field5990 = -1;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    private int field5996 = -1;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Z")
    public boolean field5997 = false;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public int field5995 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public int field6006 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Z")
    public boolean field5985 = true;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    private int field5999 = -1;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public int field5998 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "Z")
    public boolean field6012 = true;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public int field5994 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public int field5986 = -1;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    private int field6014 = -1;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public int field6011 = -1;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Z")
    public boolean field5993 = true;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field6024 = new String[5];

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public int field6030 = 0;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    private int field6027 = -1;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    private int field6004 = -1;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public int field6021 = -1;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field6003 = 100;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field6019 = -1;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field6020 = -1;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5989 = new String[100];

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field6022 = 0;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    private int field5991;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field6000;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public int field6009;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    private int field6010;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public int field6016;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    private int field6026;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    private int field6029;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lep;")
    public static class147 field5988;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "Lbc;")
    public static class285 field6015;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "Lij;")
    public static class316 field6023;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Ljava/lang/String;")
    public String field5987;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "Ljava/lang/String;")
    public String field6018;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "[I")
    public int[] field6007;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
    public final void method2647(byte arg0) {
        if (this.field6007 != null) {
            for (int var2 = 0; var2 < this.field6007.length; var2 += 2) {
                if (this.field6007[var2] < this.field5998) {
                    this.field5998 = this.field6007[var2];
                } else if (this.field5994 < this.field6007[var2]) {
                    this.field5994 = this.field6007[var2];
                }
                if (this.field6006 > this.field6007[var2 + 1]) {
                    this.field6006 = this.field6007[var2 + 1];
                } else if (this.field6007[var2 + 1] > this.field5995) {
                    this.field5995 = this.field6007[var2 + 1];
                }
            }
        }
        int var3 = 11 / ((arg0 - 14) / 47);
        field6001++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLea;I)Lwn;")
    public final class77 method2648(boolean arg0, class58 arg1, int arg2) {
        field6025++;
        int var4 = arg0 ? this.field6011 : this.field5990;
        if (arg2 >= -107) {
            return null;
        }
        int var5 = arg1.field744 << 29 | var4;
        class77 var6 = (class77) class273.field3739.method2529(0, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (class160.field2273.method1930((byte) 41, var4)) {
            class96 var7 = class96.method739(class160.field2273, var4, 0);
            if (var7 != null) {
                var6 = arg1.method199(var7, true);
                class273.field3739.method2527(-118, (long) var5, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lrg;B)V")
    public final void method2649(class366 arg0, byte arg1) {
        field6017++;
        if (arg1 >= -95) {
            this.method2649((class366) null, (byte) 122);
        }
        while (true) {
            int var3 = arg0.method2306((byte) 46);
            if (var3 == 0) {
                return;
            }
            this.method2653(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)Z")
    public final boolean method2650(byte arg0) {
        field5992++;
        if (arg0 != 40) {
            return true;
        } else if (this.field5999 == -1 && this.field6014 == -1) {
            return true;
        } else {
            boolean var2 = false;
            int var3;
            if (this.field5999 == -1) {
                var3 = class255.method1655(arg0 ^ 0x28, this.field6014);
            } else {
                var3 = class13.field121[this.field5999];
            }
            if (var3 < this.field6029 || var3 > this.field6010) {
                return false;
            } else if (this.field6027 == -1 && this.field5996 == -1) {
                return true;
            } else {
                boolean var4 = false;
                int var5;
                if (this.field6027 == -1) {
                    var5 = class255.method1655(0, this.field5996);
                } else {
                    var5 = class13.field121[this.field6027];
                }
                return var5 >= this.field6026 && this.field5991 >= var5;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method2651(int arg0) {
        field5989 = null;
        field6015 = null;
        field5988 = null;
        if (arg0 != -1) {
            field5988 = null;
        }
        field6023 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILea;)Lwn;")
    public final class77 method2652(int arg0, class58 arg1) {
        if (arg0 > -18) {
            return null;
        }
        field6013++;
        class77 var3 = (class77) class273.field3739.method2529(0, (long) (this.field6004 | 0x20000 | arg1.field744 << 29));
        if (var3 != null) {
            return var3;
        }
        class160.field2273.method1930((byte) -124, this.field6004);
        class96 var4 = class96.method739(class160.field2273, this.field6004, 0);
        if (var4 != null) {
            var3 = arg1.method199(var4, true);
            class273.field3739.method2527(-122, (long) (arg1.field744 << 29 | this.field6004 | 0x20000), var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLrg;)V")
    private final void method2653(int arg0, boolean arg1, class366 arg2) {
        field6028++;
        if (!arg1) {
            return;
        }
        if (arg0 == 1) {
            this.field5990 = arg2.method2297(13352);
        } else if (arg0 == 2) {
            this.field6011 = arg2.method2297(13352);
        } else if (arg0 == 3) {
            this.field6018 = arg2.method2255(-32226);
        } else if (arg0 == 4) {
            this.field6000 = arg2.method2263((byte) 10);
        } else if (arg0 == 5) {
            this.field5986 = arg2.method2263((byte) 10);
        } else if (arg0 == 6) {
            this.field6030 = arg2.method2306((byte) 67);
            return;
        } else if (arg0 == 7) {
            int var6 = arg2.method2306((byte) 102);
            if ((var6 & 0x2) == 2) {
                this.field5997 = true;
            }
            if ((var6 & 0x1) == 0) {
                this.field6012 = false;
                return;
            }
        } else if (arg0 == 8) {
            this.field5985 = arg2.method2306((byte) 51) == 1;
            return;
        } else if (arg0 == 9) {
            this.field6014 = arg2.method2297(13352);
            if (this.field6014 == 65535) {
                this.field6014 = -1;
            }
            this.field5999 = arg2.method2297(13352);
            if (this.field5999 == 65535) {
                this.field5999 = -1;
            }
            this.field6029 = arg2.method2258(1177515464);
            this.field6010 = arg2.method2258(1177515464);
            return;
        } else if (arg0 < 10 || arg0 > 14) {
            if (arg0 != 15) {
                if (arg0 != 16) {
                    if (arg0 != 17) {
                        if (arg0 != 18) {
                            if (arg0 == 19) {
                                this.field6021 = arg2.method2297(13352);
                                return;
                            }
                            if (arg0 == 20) {
                                this.field5996 = arg2.method2297(13352);
                                if (this.field5996 == 65535) {
                                    this.field5996 = -1;
                                }
                                this.field6027 = arg2.method2297(13352);
                                if (this.field6027 == 65535) {
                                    this.field6027 = -1;
                                }
                                this.field6026 = arg2.method2258(1177515464);
                                this.field5991 = arg2.method2258(1177515464);
                            } else if (arg0 == 21) {
                                this.field6008 = arg2.method2258(1177515464);
                                return;
                            } else if (arg0 == 22) {
                                this.field6002 = arg2.method2258(1177515464);
                                return;
                            }
                            return;
                        }
                        this.field6004 = arg2.method2297(13352);
                        return;
                    }
                    this.field5987 = arg2.method2255(-32226);
                    return;
                }
                this.field5993 = false;
                return;
            }
            int var4 = arg2.method2306((byte) 108);
            this.field6007 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field6007[var5] = arg2.method2257((byte) 110);
            }
            this.field6016 = arg2.method2258(1177515464);
            this.field6005 = arg2.method2258(1177515464);
            return;
        } else {
            this.field6024[arg0 - 10] = arg2.method2255(-32226);
            return;
        }
    }
}
