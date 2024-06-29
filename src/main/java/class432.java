import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class432 extends class320 {

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "[J")
    public static long[] field6420 = new long[32];

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6423;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "[S")
    public static short[] field6425;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Lrn;")
    public static class174 field6424;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILmq;ILea;IJI)V")
    public static final void method2584(int arg0, int arg1, int arg2, class350 arg3, int arg4, class381 arg5, int arg6, long arg7, int arg8) {
        field6421++;
        int var10 = arg4 * arg4 + arg8 * arg8;
        if ((long) var10 > arg7) {
            return;
        }
        if (arg2 != 12267) {
            method2587(109, 125, false);
        }
        int var11 = Math.min(arg3.field5329 / 2, arg3.field5269 / 2);
        if (var10 <= var11 * var11) {
            class166.method1225(arg1, arg5, arg3, arg8, arg0, -127, class376.field5707[arg6], arg4);
            return;
        }
        var11 -= 10;
        int var12;
        if (class85.field1473 == 4) {
            var12 = (int) class526.field7779 & 0x3FFF;
        } else {
            var12 = (int) class526.field7779 + class255.field3674 & 0x3FFF;
        }
        int var13 = class528.field7783[var12];
        int var14 = class528.field7786[var12];
        if (class85.field1473 != 4) {
            var14 = var14 * 256 / (class70.field1215 + 256);
            var13 = var13 * 256 / (class70.field1215 + 256);
        }
        int var15 = arg4 * var13 + arg8 * var14 >> 15;
        int var16 = arg4 * var14 - arg8 * var13 >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class399.field6021[arg6].method3139((float) arg3.field5329 / 2.0F + (float) arg1 + (float) var19, (float) arg3.field5269 / 2.0F + (float) arg0 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZII)V")
    public static final void method2585(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        field6422++;
        class226 var3 = class237.field3431[arg2][arg1];
        if (var3 != null) {
            class202.field2949 = var3.field3212;
            class155.field2438 = var3.field3223;
            class84.field1459 = var3.field3218;
        }
        class303.method1942((byte) -125);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)J")
    public abstract long method2184(int arg0);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)I")
    public abstract int method2186(byte arg0);

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)I")
    public abstract int method2183(int arg0);

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V")
    public static void method2586(int arg0) {
        field6425 = null;
        field6420 = null;
        field6423 = null;
        if (arg0 != 974428047) {
            method2585(false, -102, 124);
        }
        field6424 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ)V")
    public static final void method2587(int arg0, int arg1, boolean arg2) {
        field6426++;
        if (class509.field7493 < class509.field7492) {
            class509.field7493 = (float) ((double) class509.field7493 / 30.0D + (double) class509.field7493);
            if (class509.field7493 > class509.field7492) {
                class509.field7493 = class509.field7492;
            }
            class216.method1443(true);
            class509.field7495 = (int) class509.field7493 >> 1;
            class509.field7498 = class406.method2479(class509.field7495, (byte) 121);
        } else if (class509.field7493 > class509.field7492) {
            class509.field7493 = (float) ((double) class509.field7493 - (double) class509.field7493 / 30.0D);
            if (class509.field7493 < class509.field7492) {
                class509.field7493 = class509.field7492;
            }
            class216.method1443(true);
            class509.field7495 = (int) class509.field7493 >> 1;
            class509.field7498 = class406.method2479(class509.field7495, (byte) 100);
        }
        if (class151.field2403 != -1 && class307.field4691 != -1) {
            int var3 = class151.field2403 - class404.field6067;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class307.field4691 - class158.field2464;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class404.field6067 -= -var3;
            class158.field2464 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class307.field4691 = -1;
                class151.field2403 = -1;
            }
            class216.method1443(true);
        }
        if (class443.field6619 > 0) {
            class475.field7104--;
            if (class475.field7104 == 0) {
                class443.field6619--;
                class475.field7104 = 100;
            }
        } else {
            class115.field1909 = -1;
            class528.field7794 = -1;
        }
        if (arg2 || !class424.field6325 || class329.field4971 == null) {
            return;
        }
        for (class514 var5 = (class514) class329.field4971.method2427(109); var5 != null; var5 = (class514) class329.field4971.method2422(-112)) {
            class447 var6 = class509.field7486.method1812((byte) 28, var5.field7559.field5397);
            if (var5.method3069(14, arg1, arg0)) {
                if (var6.field6694 != null) {
                    if (var6.field6694[4] != null) {
                        class338.method2167(var6.field6697, (long) var5.field7559.field5397, -1, 1, 0, true, var6.field6694[4], false, var6.field6670, -1, 1009);
                    }
                    if (var6.field6694[3] != null) {
                        class338.method2167(var6.field6697, (long) var5.field7559.field5397, -1, 1, 0, true, var6.field6694[3], false, var6.field6670, -1, 1003);
                    }
                    if (var6.field6694[2] != null) {
                        class338.method2167(var6.field6697, (long) var5.field7559.field5397, -1, 1, 0, true, var6.field6694[2], false, var6.field6670, -1, 1012);
                    }
                    if (var6.field6694[1] != null) {
                        class338.method2167(var6.field6697, (long) var5.field7559.field5397, -1, 1, 0, true, var6.field6694[1], false, var6.field6670, -1, 1008);
                    }
                    if (var6.field6694[0] != null) {
                        class338.method2167(var6.field6697, (long) var5.field7559.field5397, -1, 1, 0, true, var6.field6694[0], false, var6.field6670, -1, 1007);
                    }
                }
                if (!var5.field7559.field5399) {
                    var5.field7559.field5399 = true;
                    class437.method2609(class527.field7781, var5.field7559.field5397, var6.field6670);
                }
                if (var5.field7559.field5399) {
                    class437.method2609(class107.field1776, var5.field7559.field5397, var6.field6670);
                }
            } else if (var5.field7559.field5399) {
                var5.field7559.field5399 = false;
                class437.method2609(class92.field1575, var5.field7559.field5397, var6.field6670);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)I")
    public abstract int method2187(byte arg0);

    static {
        new class342("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field6423 = null;
        field6425 = new short[] { -4160, -4163, -8256, -8259, 22461 };
        field6424 = new class174(47, 0);
    }
}
