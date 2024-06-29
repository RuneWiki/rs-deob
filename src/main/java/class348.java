import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class348 {

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public int field4442 = -1;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public int field4437 = 99;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "Z")
    public boolean field4457 = false;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public int field4460 = 0;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field4450 = -1;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "Z")
    public boolean field4448 = false;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public int field4447 = 2;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public int field4446 = -1;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "Z")
    public boolean field4459 = false;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "Z")
    public boolean field4455 = false;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public int field4465 = -1;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public int field4443 = -1;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public int field4466 = 5;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "Lhp;")
    public static class329 field4436;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Lie;")
    public class567 field4445;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "Ljava/applet/Applet;")
    public static Applet field4462;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "[I")
    private int[] field4452;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "[I")
    public int[] field4453;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "[I")
    public int[] field4463;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "[Z")
    public boolean[] field4451;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "[[I")
    public int[][] field4461;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public final void method1997(byte arg0) {
        if (this.field4465 == -1) {
            if (this.field4451 == null) {
                this.field4465 = 0;
            } else {
                this.field4465 = 2;
            }
        }
        field4440++;
        if (this.field4446 == -1) {
            if (this.field4451 == null) {
                this.field4446 = 0;
            } else {
                this.field4446 = 2;
            }
        }
        int var2 = -64 / ((arg0 - 17) / 32);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)I")
    public static final int method1998(byte arg0) {
        field4438++;
        if (arg0 <= 5) {
            field4436 = null;
        }
        return class363.method2077((byte) 126, false);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lfd;II)V")
    private final void method1999(class418 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            int var13 = arg0.method2393(-30727);
            this.field4453 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4453[var14] = arg0.method2393(arg1 - 30826);
            }
            this.field4463 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4463[var15] = arg0.method2393(-30727);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field4463[var16] += arg0.method2393(-30727) << 16;
            }
        } else if (arg2 == 2) {
            this.field4443 = arg0.method2393(arg1 ^ 0xFFFF879A);
        } else if (arg2 == 3) {
            this.field4451 = new boolean[256];
            int var4 = arg0.method2396(-111);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4451[arg0.method2396(-121)] = true;
            }
        } else if (arg2 == 5) {
            this.field4466 = arg0.method2396(-111);
        } else if (arg2 == 6) {
            this.field4450 = arg0.method2393(-30727);
        } else if (arg2 == 7) {
            this.field4442 = arg0.method2393(-30727);
        } else if (arg2 == 8) {
            this.field4437 = arg0.method2396(arg1 ^ 0xFFFFFF83);
        } else if (arg2 == 9) {
            this.field4446 = arg0.method2396(-102);
        } else if (arg2 == 10) {
            this.field4465 = arg0.method2396(-118);
        } else if (arg2 == 11) {
            this.field4447 = arg0.method2396(arg1 - 105);
        } else if (arg2 == 12) {
            int var10 = arg0.method2396(-105);
            this.field4452 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field4452[var11] = arg0.method2393(-30727);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field4452[var12] += arg0.method2393(-30727) << 16;
            }
        } else if (arg2 == 13) {
            int var6 = arg0.method2393(arg1 ^ 0xFFFF879A);
            this.field4461 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2396(arg1 ^ 0x1E);
                if (var8 > 0) {
                    this.field4461[var7] = new int[var8];
                    this.field4461[var7][0] = arg0.method2364(-113);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field4461[var7][var9] = arg0.method2393(-30727);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4448 = true;
        } else if (arg2 == 15) {
            this.field4459 = true;
        } else if (arg2 == 16) {
            this.field4457 = true;
        } else if (arg2 == 17) {
            this.field4460 = arg0.method2396(-104);
        } else if (arg2 == 18) {
            this.field4455 = true;
        }
        if (arg1 != 99) {
            method1998((byte) -87);
        }
        field4456++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILfd;)V")
    public final void method2000(int arg0, class418 arg1) {
        field4449++;
        if (arg0 > -21) {
            this.field4453 = null;
        }
        while (true) {
            int var3 = arg1.method2396(59);
            if (var3 == 0) {
                return;
            }
            this.method1999(arg1, 99, var3);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method2001(int arg0) {
        field4462 = null;
        field4436 = null;
        if (arg0 != -16661) {
            method2002(-61, (char) 65433, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ICB)C")
    public static final char method2002(int arg0, char arg1, byte arg2) {
        field4444++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 != 29) {
            method2003(-104, 109, 5, -14, -106);
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIII)V")
    public static final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4441++;
        if (arg2 != -1835602288) {
            field4462 = null;
        }
        class367 var5 = class573.method3057(10, arg3, 2);
        var5.method2115(arg2 ^ 0x9296EE91);
        var5.field4742 = arg0;
        var5.field4736 = arg1;
        var5.field4735 = arg4;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIBIILba;)Lba;")
    public final class107 method2004(int arg0, int arg1, byte arg2, int arg3, int arg4, class107 arg5) {
        field4458++;
        int var7 = this.field4453[arg1];
        int var8 = this.field4463[arg1];
        class63 var9 = this.field4445.method3034(-98, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method479((byte) 1, arg4, true);
        }
        class63 var11 = null;
        if ((this.field4459 || class673.field9330) && arg3 != -1 && arg3 < this.field4463.length) {
            int var12 = this.field4463[arg3];
            var11 = this.field4445.method3034(-28, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        if (arg2 != 118) {
            return null;
        }
        class63 var13 = null;
        class63 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field4452 != null) {
            if (this.field4452.length > arg1) {
                var15 = this.field4452[arg1];
                if (var15 != 65535) {
                    var13 = this.field4445.method3034(-113, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4459 || class673.field9330) && arg3 != -1 && this.field4452.length > arg3) {
                var16 = this.field4452[arg3];
                if (var16 != 65535) {
                    var14 = this.field4445.method3034(-100, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field4448) {
            arg4 |= 0x200;
        }
        if (var9.method530(var10, 100)) {
            arg4 |= 0x80;
        }
        if (var9.method532(var10, (byte) 107)) {
            arg4 |= 0x100;
        }
        if (var9.method531(5858, var10)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method530(var15, 56)) {
                arg4 |= 0x80;
            }
            if (var13.method532(var15, (byte) 123)) {
                arg4 |= 0x100;
            }
            if (var13.method531(5858, var15)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method530(arg3, 75)) {
                arg4 |= 0x80;
            }
            if (var11.method532(arg3, (byte) 111)) {
                arg4 |= 0x100;
            }
            if (var11.method531(5858, arg3)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method530(var16, 73)) {
                arg4 |= 0x80;
            }
            if (var14.method532(var16, (byte) 96)) {
                arg4 |= 0x100;
            }
            if (var14.method531(5858, var16)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class107 var18 = arg5.method479((byte) 1, var17, true);
        var18.method791(this.field4448, var11, arg3, arg0 - 1, var10, 0, arg2 + 10473, var9, var7);
        if (var13 != null) {
            var18.method791(this.field4448, var14, var16, arg0 - 1, var15, 0, 10591, var13, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBZI)I")
    public final int method2005(int arg0, byte arg1, boolean arg2, int arg3) {
        field4454++;
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 18) {
            this.method1999(null, -43, -71);
        }
        int var7 = this.field4463[arg3];
        class63 var8 = null;
        class63 var9 = this.field4445.method3034(-112, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field4459 || class673.field9330) && arg0 != -1 && arg0 < this.field4463.length) {
            int var11 = this.field4463[arg0];
            var8 = this.field4445.method3034(-45, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field4448) {
            var5 |= 0x200;
        }
        if (var9.method530(var10, 95)) {
            var5 |= 0x80;
        }
        if (var9.method532(var10, (byte) 104)) {
            var5 |= 0x100;
        }
        if (var9.method531(5858, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method530(var6, 73)) {
                var5 |= 0x80;
            }
            if (var8.method532(var6, (byte) 124)) {
                var5 |= 0x100;
            }
            if (var8.method531(5858, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field4452 != null && arg2) {
            if (arg3 < this.field4452.length) {
                int var12 = this.field4452[arg3];
                if (var12 != 65535) {
                    class63 var13 = this.field4445.method3034(arg1 - 145, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method530(var14, arg1 ^ 0x63)) {
                            var5 |= 0x80;
                        }
                        if (var13.method532(var14, (byte) 117)) {
                            var5 |= 0x100;
                        }
                        if (var13.method531(arg1 + 5840, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field4459 || class673.field9330) && arg0 != -1 && this.field4452.length > arg0) {
                int var15 = this.field4452[arg0];
                if (var15 != 65535) {
                    class63 var16 = this.field4445.method3034(-85, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method530(var17, 77)) {
                            var5 |= 0x80;
                        }
                        if (var16.method532(var17, (byte) 91)) {
                            var5 |= 0x100;
                        }
                        if (var16.method531(5858, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BIIIILba;II)Lba;")
    public final class107 method2006(byte arg0, int arg1, int arg2, int arg3, int arg4, class107 arg5, int arg6, int arg7) {
        field4464++;
        int var9 = this.field4453[arg1];
        int var10 = this.field4463[arg1];
        class63 var11 = this.field4445.method3034(arg4 - 31, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg5.method479(arg0, arg2, true);
        }
        class63 var13 = null;
        if ((this.field4459 || class673.field9330) && arg7 != -1 && this.field4463.length > arg7) {
            int var14 = this.field4463[arg7];
            var13 = this.field4445.method3034(-92, var14 >> 16);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field4448) {
            arg2 |= 0x200;
        }
        if (var11.method530(var12, 73)) {
            arg2 |= 0x80;
        }
        if (var11.method532(var12, (byte) 100)) {
            arg2 |= 0x100;
        }
        if (var11.method531(5858, var12)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method530(arg7, 106)) {
                arg2 |= 0x80;
            }
            if (var13.method532(arg7, (byte) 107)) {
                arg2 |= 0x100;
            }
            if (var13.method531(arg4 ^ 0x16E2, arg7)) {
                arg2 |= 0x400;
            }
        }
        if (arg4 == 0) {
            int var15 = arg2 | 0x20;
            class107 var16 = arg5.method479(arg0, var15, true);
            var16.method791(this.field4448, var13, arg7, arg6 - 1, var12, arg3, 10591, var11, var9);
            return var16;
        } else {
            return null;
        }
    }
}
