import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class225 {

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "[I")
    public static int[] field3301 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "Llt;")
    public static class475 field3300 = new class475("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Lwf;")
    public static class88 field3302 = new class88();

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "Lri;")
    public static class73 field3303 = new class73(82, 1);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lno;")
    public static class494 field3299;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method1531(int arg0) {
        if (arg0 != 82) {
            return;
        }
        field3302 = null;
        field3301 = null;
        field3299 = null;
        field3303 = null;
        field3300 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
    public static final void method1532(int arg0, int arg1, int arg2) {
        if (arg2 != -27617) {
            method1531(-65);
        }
        field3298++;
        class338 var3 = class230.method1580(15, -1332166328, 0);
        var3.method2053(-101);
        var3.field4756 = arg1;
        var3.field4751 = arg0;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
    public static final void method1533() {
        class310.field4460 = 0;
        label212: for (int var0 = 0; var0 < class56.field870; var0++) {
            class430 var1 = class210.field3063[var0];
            if (class342.field4923 != null) {
                for (int var2 = 0; var2 < class342.field4923.length; var2++) {
                    if (class342.field4923[var2] != -1000000 && (var1.field6436 <= class342.field4923[var2] || var1.field6433 <= class342.field4923[var2]) && (var1.field6428 <= class518.field7548[var2] || var1.field6420 <= class518.field7548[var2]) && (var1.field6428 >= class43.field678[var2] || var1.field6420 >= class43.field678[var2]) && (var1.field6430 <= class261.field3841[var2] || var1.field6427 <= class261.field3841[var2]) && (var1.field6430 >= class29.field304[var2] || var1.field6427 >= class29.field304[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field6425 == 1) {
                int var3 = var1.field6421 + class367.field5607 - class381.field5776;
                if (var3 >= 0 && var3 <= class367.field5607 + class367.field5607) {
                    int var4 = var1.field6434 + class367.field5607 - class346.field4983;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class367.field5607 + class367.field5607) {
                        continue;
                    }
                    int var5 = var1.field6429 + class367.field5607 - class346.field4983;
                    if (var5 > class367.field5607 + class367.field5607) {
                        var5 = class367.field5607 + class367.field5607;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class329.field4682[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class45.field722 - var1.field6428;
                        if (var7 > class248.field3636) {
                            var1.field6424 = 1;
                        } else {
                            if (var7 >= -class248.field3636) {
                                continue;
                            }
                            var1.field6424 = 2;
                            var7 = -var7;
                        }
                        var1.field6422 = (var1.field6430 - class170.field2527 << 8) / var7;
                        var1.field6419 = (var1.field6427 - class170.field2527 << 8) / var7;
                        var1.field6437 = (var1.field6436 - class445.field6630 << 8) / var7;
                        var1.field6435 = (var1.field6433 - class445.field6630 << 8) / var7;
                        class184.field2746[class310.field4460++] = var1;
                    }
                }
            } else if (var1.field6425 == 2) {
                int var8 = var1.field6434 + class367.field5607 - class346.field4983;
                if (var8 >= 0 && var8 <= class367.field5607 + class367.field5607) {
                    int var9 = var1.field6421 + class367.field5607 - class381.field5776;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class367.field5607 + class367.field5607) {
                        continue;
                    }
                    int var10 = var1.field6432 + class367.field5607 - class381.field5776;
                    if (var10 > class367.field5607 + class367.field5607) {
                        var10 = class367.field5607 + class367.field5607;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class329.field4682[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class170.field2527 - var1.field6430;
                        if (var12 > class248.field3636) {
                            var1.field6424 = 3;
                        } else {
                            if (var12 >= -class248.field3636) {
                                continue;
                            }
                            var1.field6424 = 4;
                            var12 = -var12;
                        }
                        var1.field6431 = (var1.field6428 - class45.field722 << 8) / var12;
                        var1.field6426 = (var1.field6420 - class45.field722 << 8) / var12;
                        var1.field6437 = (var1.field6436 - class445.field6630 << 8) / var12;
                        var1.field6435 = (var1.field6433 - class445.field6630 << 8) / var12;
                        class184.field2746[class310.field4460++] = var1;
                    }
                }
            } else if (var1.field6425 == 4) {
                int var13 = var1.field6436 - class445.field6630;
                if (var13 > class329.field4685) {
                    int var14 = var1.field6434 + class367.field5607 - class346.field4983;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class367.field5607 + class367.field5607) {
                        continue;
                    }
                    int var15 = var1.field6429 + class367.field5607 - class346.field4983;
                    if (var15 > class367.field5607 + class367.field5607) {
                        var15 = class367.field5607 + class367.field5607;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field6421 + class367.field5607 - class381.field5776;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class367.field5607 + class367.field5607) {
                        continue;
                    }
                    int var17 = var1.field6432 + class367.field5607 - class381.field5776;
                    if (var17 > class367.field5607 + class367.field5607) {
                        var17 = class367.field5607 + class367.field5607;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class329.field4682[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field6424 = 5;
                        var1.field6431 = (var1.field6428 - class45.field722 << 8) / var13;
                        var1.field6426 = (var1.field6420 - class45.field722 << 8) / var13;
                        var1.field6422 = (var1.field6430 - class170.field2527 << 8) / var13;
                        var1.field6419 = (var1.field6427 - class170.field2527 << 8) / var13;
                        class184.field2746[class310.field4460++] = var1;
                    }
                }
            }
        }
    }
}
