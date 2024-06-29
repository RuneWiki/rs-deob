import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class165 {

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "[I")
    private int[] field2473;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "[Z")
    public static boolean[] field2477;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2479;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field2478;

    static {
        new class466("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2477 = new boolean[100];
        field2476 = -1;
        field2479 = new String[100];
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method1096(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class115.field1725 = arg0;
        class20.field258 = arg1;
        field2472++;
        class259.field3605 = arg4;
        if (arg2 != 2) {
            field2479 = null;
        }
        class116.field1741 = arg3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)I", line = 18)
    public final int method1097(byte arg0, int arg1) {
        if (arg0 != 83) {
            field2476 = -61;
        }
        field2475++;
        int var3 = (this.field2473.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field2473[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2473[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lvc;Z)V", line = 46)
    public static final void method1098(class207 arg0, boolean arg1) {
        field2474++;
        arg0.method1278(0);
        int var2 = 0;
        for (int var3 = 0; var3 < class375.field5498; var3++) {
            int var15 = class397.field5793[var3];
            if ((class320.field4375[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class320.field4375[var15] = (byte) class255.method1532(class320.field4375[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method1282(-26364, 1);
                    if (var16 == 0) {
                        var2 = class201.method1255(9568256, arg0);
                        class320.field4375[var15] = (byte) class255.method1532(class320.field4375[var15], 2);
                    } else {
                        class322.method1865((byte) -83, var15, arg0);
                    }
                }
            }
        }
        arg0.method1276(113);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method1278(0);
        for (int var4 = 0; var4 < class375.field5498; var4++) {
            int var13 = class397.field5793[var4];
            if ((class320.field4375[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class320.field4375[var13] = (byte) class255.method1532(class320.field4375[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method1282(-26364, 1);
                    if (var14 == 0) {
                        var2 = class201.method1255(9568256, arg0);
                        class320.field4375[var13] = (byte) class255.method1532(class320.field4375[var13], 2);
                    } else {
                        class322.method1865((byte) -83, var13, arg0);
                    }
                }
            }
        }
        arg0.method1276(98);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method1278(0);
        for (int var5 = 0; var5 < class266.field3679; var5++) {
            int var11 = class434.field6364[var5];
            if ((class320.field4375[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class320.field4375[var11] = (byte) class255.method1532(class320.field4375[var11], 2);
                } else {
                    int var12 = arg0.method1282(-26364, 1);
                    if (var12 == 0) {
                        var2 = class201.method1255(9568256, arg0);
                        class320.field4375[var11] = (byte) class255.method1532(class320.field4375[var11], 2);
                    } else if (class289.method1722(arg0, 32402, var11)) {
                        class320.field4375[var11] = (byte) class255.method1532(class320.field4375[var11], 2);
                    }
                }
            }
        }
        arg0.method1276(96);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method1278(0);
        int var6 = 0;
        if (!arg1) {
            return;
        }
        while (class266.field3679 > var6) {
            int var9 = class434.field6364[var6];
            if ((class320.field4375[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class320.field4375[var9] = (byte) class255.method1532(class320.field4375[var9], 2);
                } else {
                    int var10 = arg0.method1282(-26364, 1);
                    if (var10 == 0) {
                        var2 = class201.method1255(9568256, arg0);
                        class320.field4375[var9] = (byte) class255.method1532(class320.field4375[var9], 2);
                    } else if (class289.method1722(arg0, 32402, var9)) {
                        class320.field4375[var9] = (byte) class255.method1532(class320.field4375[var9], 2);
                    }
                }
            }
            var6++;
        }
        arg0.method1276(119);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class375.field5498 = 0;
        class266.field3679 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class320.field4375[var7] = (byte) (class320.field4375[var7] >> 1);
            class438 var8 = class12.field182[var7];
            if (var8 == null) {
                class434.field6364[class266.field3679++] = var7;
            } else {
                class397.field5793[class375.field5498++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "([I)V", line = 254)
    public class165(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2473 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2473[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2473[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field2473[var5 + var5] = arg0[var4];
            this.field2473[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)Lmf;", line = 289)
    public static final class289 method1099(boolean arg0, int arg1) {
        field2478++;
        class410[] var2 = class281.field3858;
        synchronized (class281.field3858) {
            if (!arg0) {
                method1100(-19);
            }
            class289 var3;
            if (arg1 >= class281.field3858.length || class281.field3858[arg1].method2453(-8365)) {
                var3 = new class289();
                var3.field4009 = new class387[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field4009[var4] = new class387();
                }
            } else {
                var3 = (class289) class281.field3858[arg1].method2455((byte) 125);
                var3.method1522(-59);
                int var10002 = class487.field7131[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 331)
    public static void method1100(int arg0) {
        if (arg0 != 100) {
            field2476 = -118;
        }
        field2479 = null;
        field2477 = null;
    }
}
