import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class51 {

    @OriginalMember(owner = "client!gja", name = "y", descriptor = "Liha;")
    private class29 field626 = new class29(64);

    @OriginalMember(owner = "client!gja", name = "j", descriptor = "Liha;")
    public class29 field630 = new class29(50);

    @OriginalMember(owner = "client!gja", name = "k", descriptor = "Leaa;")
    public class528 field632 = new class528(250);

    @OriginalMember(owner = "client!gja", name = "p", descriptor = "Lcw;")
    private class190 field633 = new class190();

    @OriginalMember(owner = "client!gja", name = "n", descriptor = "Lgda;")
    public class58 field621;

    @OriginalMember(owner = "client!gja", name = "g", descriptor = "Z")
    private boolean field613;

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!gja", name = "l", descriptor = "Lvl;")
    private class13 field636;

    @OriginalMember(owner = "client!gja", name = "o", descriptor = "Lgda;")
    private class58 field611;

    @OriginalMember(owner = "client!gja", name = "f", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!gja", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field637;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field635;

    @OriginalMember(owner = "client!gja", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field638 = new String[] { method539(method538("M\u0003@\u007f\u000b\u0002")), method539(method538("M\u0003@\u007f\u0007\u0002")), method539(method538("QG\u000f\u007f<")), method539(method538("M\u0003@\u007f}C\u0007H%\u007f\u0002")), method539(method538("D\u001cM=")), method539(method538("M\u0003@\u007f\u0002\u0002")), method539(method538("M\u0003@\u007f\u0006\u0002")), method539(method538("M\u0003@\u007f\u0004\u0002")), method539(method538("M\u0003@\u007f\u0000\u0002")), method539(method538("M\u0003@\u007f\n\u0002")), method539(method538("M\u0003@\u007f\r\u0002")), method539(method538("M\u0003@\u007f\t\u0002")), method539(method538("M\u0003@\u007f\u0003\u0002")), method539(method538("M\u0003@\u007f\f\u0002")), method539(method538("M\u0003@\u007f\u000f\u0002")), method539(method538("M\u0003@\u007f\u0005\u0002")) };

    @OriginalMember(owner = "client!gja", name = "s", descriptor = "Lvn;")
    public static class330 field617 = new class330(46, 3);

    @OriginalMember(owner = "client!gja", name = "r", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!gja", name = "u", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!gja", name = "v", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!gja", name = "x", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!gja", name = "A", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!gja", name = "i", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!gja", name = "w", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!gja", name = "h", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!gja", name = "t", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!gja", name = "q", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "(B)V", line = 14)
    public final void method524(byte arg0) {
        try {
            class29 var2 = this.field626;
            synchronized (this.field626) {
                this.field626.method298(5);
            }
            field620++;
            class29 var3 = this.field630;
            synchronized (this.field630) {
                if (arg0 < 95) {
                    method529((byte) -27);
                }
                this.field630.method298(5);
            }
            class528 var4 = this.field632;
            synchronized (this.field632) {
                this.field632.method3952(13194);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field638[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(ZI)V", line = 34)
    public final void method525(boolean arg0, int arg1) {
        try {
            field628++;
            class29 var3 = this.field626;
            synchronized (this.field626) {
                this.field626.method294(arg1, -630);
            }
            class29 var4 = this.field630;
            synchronized (this.field630) {
                this.field630.method294(arg1, -630);
                if (arg0) {
                    field617 = null;
                }
            }
            class528 var5 = this.field632;
            synchronized (this.field632) {
                this.field632.method3953((byte) -26, arg1);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field638[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(ZIZIZLda;Lha;ILuaa;Lha;II)Lhk;", line = 53)
    public final class107 method526(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4, class64 arg5, class63 arg6, int arg7, class124 arg8, class63 arg9, int arg10, int arg11) {
        try {
            field623++;
            class107 var13 = this.method537(58, arg11, arg3, arg8, arg10, arg9, arg1, arg7);
            if (var13 != null) {
                return var13;
            }
            class584 var14 = this.method531(arg3, (byte) 104);
            if (arg7 > 1 && var14.field8447 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (arg7 >= var14.field8401[var16] && var14.field8401[var16] != 0) {
                        var15 = var14.field8447[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method531(var15, (byte) 49);
                }
            }
            int[] var17 = var14.method4292(arg6, arg9, arg8, arg10, arg1, arg5, arg0, arg4, arg11, arg7);
            if (var17 == null) {
                return null;
            }
            class107 var18;
            if (arg2) {
                var18 = arg6.method665(36, 36, -70, 0, var17, 32);
            } else {
                var18 = arg9.method665(36, 36, -33, 0, var17, 32);
            }
            if (!arg2) {
                class190 var19 = new class190();
                var19.field2999 = arg1;
                var19.field3004 = arg3;
                var19.field2998 = arg11;
                var19.field3007 = arg7;
                var19.field3000 = arg8 != null;
                var19.field2996 = arg9.field865;
                var19.field3006 = arg10;
                this.field632.method3955((byte) 69, var18, var19);
            }
            return var18;
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field638[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field638[4] : field638[2]) + ',' + (arg6 == null ? field638[4] : field638[2]) + ',' + arg7 + ',' + (arg8 == null ? field638[4] : field638[2]) + ',' + (arg9 == null ? field638[4] : field638[2]) + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Z)V", line = 115)
    public final void method527(boolean arg0) {
        try {
            class29 var2 = this.field626;
            synchronized (this.field626) {
                this.field626.method304(1);
                if (arg0) {
                    this.method531(29, (byte) 8);
                }
            }
            field615++;
            class29 var3 = this.field630;
            synchronized (this.field630) {
                this.field630.method304(1);
            }
            class528 var4 = this.field632;
            synchronized (this.field632) {
                this.field632.method3950((byte) -116);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field638[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V", line = 135)
    public final void method528(int arg0) {
        try {
            class29 var2 = this.field630;
            synchronized (this.field630) {
                this.field630.method304(arg0 + 1);
                if (arg0 != 0) {
                    this.method537(-110, -125, -28, null, -49, null, -102, 92);
                }
            }
            field612++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field638[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(B)V", line = 155)
    public static void method529(byte arg0) {
        try {
            field617 = null;
            int var1 = 66 % ((arg0 - 20) / 58);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field638[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(BZ)V", line = 164)
    public final void method530(byte arg0, boolean arg1) {
        try {
            field627++;
            if (arg1 != this.field613) {
                int var3 = -13 / ((arg0 + 37) / 58);
                this.field613 = arg1;
                this.method527(false);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field638[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IB)Lnda;", line = 179)
    public final class584 method531(int arg0, byte arg1) {
        try {
            field624++;
            class29 var3 = this.field626;
            class584 var4;
            synchronized (this.field626) {
                var4 = (class584) this.field626.method302(-96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field611;
            byte[] var6;
            synchronized (this.field611) {
                var6 = this.field611.method604((byte) -124, class643.method4656((byte) -43, arg0), class177.method1693(arg0, -4));
            }
            class584 var7 = new class584();
            var7.field8430 = this;
            var7.field8414 = arg0;
            var7.field8424 = new String[] { null, null, class709.field10210.method5154(this.field622, (byte) 65), null, null };
            var7.field8396 = new String[] { null, null, null, null, class709.field10211.method5154(this.field622, (byte) 65) };
            if (var6 != null) {
                var7.method4279(-96, new class176(var6));
            }
            var7.method4294(113);
            if (var7.field8442 != -1) {
                var7.method4291(this.method531(var7.field8464, (byte) 111), this.method531(var7.field8442, (byte) 116), false);
            }
            if (var7.field8468 != -1) {
                var7.method4282(this.method531(var7.field8417, (byte) 36), this.method531(var7.field8468, (byte) 27), false);
            }
            if (var7.field8470 != -1) {
                var7.method4280(this.method531(var7.field8470, (byte) 123), this.method531(var7.field8461, (byte) 89), 13);
            }
            if (!this.field613 && var7.field8409) {
                var7.field8423 = class709.field10207.method5154(this.field622, (byte) 65);
                var7.field8396 = this.field635;
                var7.field8424 = this.field637;
                var7.field8476 = null;
                var7.field8440 = false;
                var7.field8472 = 0;
                if (var7.field8410 != null) {
                    boolean var8 = false;
                    for (class568 var9 = var7.field8410.method735(0); var9 != null; var9 = var7.field8410.method734((byte) -50)) {
                        class668 var10 = this.field636.method97((int) var9.field8252, (byte) 38);
                        if (var10.field9499) {
                            var9.method4173(-1);
                        } else {
                            var8 = true;
                        }
                    }
                    if (!var8) {
                        var7.field8410 = null;
                    }
                }
            }
            class29 var11 = this.field626;
            synchronized (this.field626) {
                this.field626.method295(false, (long) arg0, var7);
            }
            return arg1 < 23 ? null : var7;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field638[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lgda;ZLgda;Lgda;Lgda;)V", line = 258)
    public static final void method532(class58 arg0, boolean arg1, class58 arg2, class58 arg3, class58 arg4) {
        try {
            class599.field8683 = arg0;
            class735.field10780 = arg2;
            class687.field9927 = arg3;
            if (arg1) {
                method529((byte) 81);
            }
            field631++;
            class309.field5028 = new class683[class735.field10780.method600(1)][];
            class572.field8277 = new boolean[class735.field10780.method600(1)];
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field638[11] + (arg0 == null ? field638[4] : field638[2]) + ',' + arg1 + ',' + (arg2 == null ? field638[4] : field638[2]) + ',' + (arg3 == null ? field638[4] : field638[2]) + ',' + (arg4 == null ? field638[4] : field638[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(III)Lqea;", line = 278)
    public static final class135 method533(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4670;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(B)V", line = 286)
    public final void method534(byte arg0) {
        try {
            field618++;
            int var2 = -92 / ((arg0 - 19) / 38);
            class528 var3 = this.field632;
            synchronized (this.field632) {
                this.field632.method3950((byte) -115);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field638[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lha;I)V", line = 298)
    public static final void method535(class63 arg0, int arg1) {
        try {
            field616++;
            class198.field3146 = new class85[class321.field5230.length];
            for (int var2 = arg1; var2 < class321.field5230.length; var2++) {
                int var3 = class321.field5230[var2];
                class49 var4 = class570.method4197(class266.field4311, (byte) 106, var3);
                class64 var5 = arg0.method184(var4, class174.method1603(class453.field7008, var3), true);
                class198.field3146[var2] = new class85(var5, var4);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field638[15] + (arg0 == null ? field638[4] : field638[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lpo;IZLvl;Lgda;Lgda;)V", line = 372)
    public class51(class585 arg0, int arg1, boolean arg2, class13 arg3, class58 arg4, class58 arg5) {
        try {
            this.field621 = arg5;
            this.field613 = arg2;
            this.field622 = arg1;
            this.field636 = arg3;
            this.field611 = arg4;
            if (this.field611 == null) {
                this.field625 = 0;
            } else {
                int var7 = this.field611.method600(1) - 1;
                this.field625 = this.field611.method580(114, var7) + var7 * 256;
            }
            this.field637 = new String[] { null, null, class709.field10210.method5154(this.field622, (byte) 65), null, null };
            this.field635 = new String[] { null, null, null, null, class709.field10211.method5154(this.field622, (byte) 65) };
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field638[3] + (arg0 == null ? field638[4] : field638[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field638[4] : field638[2]) + ',' + (arg4 == null ? field638[4] : field638[2]) + ',' + (arg5 == null ? field638[4] : field638[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(II)V", line = 328)
    public final void method536(int arg0, int arg1) {
        try {
            int var3 = -98 % ((arg0 + 34) / 54);
            this.field634 = arg1;
            field629++;
            class29 var4 = this.field630;
            synchronized (this.field630) {
                this.field630.method304(1);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field638[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIILuaa;ILha;II)Lhk;", line = 344)
    public final class107 method537(int arg0, int arg1, int arg2, class124 arg3, int arg4, class63 arg5, int arg6, int arg7) {
        try {
            this.field633.field3000 = arg3 != null;
            this.field633.field2998 = arg1;
            this.field633.field3007 = arg7;
            int var9 = -28 / ((-arg0 - 12) / 57);
            this.field633.field3006 = arg4;
            field614++;
            this.field633.field2996 = arg5.field865;
            this.field633.field2999 = arg6;
            this.field633.field3004 = arg2;
            return (class107) this.field632.method3949(this.field633, (byte) 67);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field638[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field638[4] : field638[2]) + ',' + arg4 + ',' + (arg5 == null ? field638[4] : field638[2]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method538(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method539(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
