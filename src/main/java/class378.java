import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class378 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "[Ldu;")
    public static class300[] field5206 = new class300[50];

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "J")
    public static long field5212 = 0L;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "[I")
    public static int[] field5213 = new int[1];

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public static void method2254(boolean arg0) {
        field5213 = null;
        field5206 = null;
        if (!arg0) {
            method2259(99);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method2255(Throwable arg0, String arg1, int arg2) {
        field5207++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class44.method277(-1, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class37.method229(var3, 1024);
            String var4 = class6.method20(var3, 112, ":", "%3a");
            String var5 = class6.method20(var4, 121, "@", "%40");
            int var6 = -8 / ((30 - arg2) / 53);
            String var7 = class6.method20(var5, 117, "&", "%26");
            String var8 = class6.method20(var7, 120, "#", "%23");
            if (class580.field8537.field4568 != null) {
                class21 var9 = class580.field8537.method2001((byte) 113, new URL(class580.field8537.field4568.getCodeBase(), "clienterror.ws?c=" + class390.field5380 + "&u=" + class515.field7350 + "&v1=" + class331.field4572 + "&v2=" + class331.field4562 + "&e=" + var8));
                while (var9.field202 == 0) {
                    class236.method1513(true, 1L);
                }
                if (var9.field202 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field201;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static final void method2256(int arg0) {
        class536.method3246(false, 9057);
        field5210++;
        if (~class514.field7338 <= arg0 && class514.field7338 != 0) {
            class430.method2521(class514.field7338, -2);
            class514.field7338 = -1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)V")
    public static final void method2257(boolean arg0, int arg1) {
        field5208++;
        if (arg0) {
            if (class340.field4708 != -1) {
                class417.method2455(-1, class340.field4708);
            }
            for (class243 var2 = (class243) class385.field5297.method2798((byte) -94); var2 != null; var2 = (class243) class385.field5297.method2806(true)) {
                if (!var2.method2453(arg1 ^ 0xFFFFC888)) {
                    var2 = (class243) class385.field5297.method2798((byte) -56);
                    if (var2 == null) {
                        break;
                    }
                }
                class321.method1935(false, var2, (byte) 78, true);
            }
            class340.field4708 = -1;
            class385.field5297 = new class465(8);
            class538.method3263(false);
            class340.field4708 = class488.field6935;
            class600.method3545(false, false);
            class504.method2996((byte) 109);
            class98.method746(class340.field4708);
        }
        class210.field3101 = false;
        class537.field8006 = "";
        class569.field8400 = "";
        class455.method2766((byte) -111);
        if (arg1 != -14136) {
            return;
        }
        class574.field8454 = -1;
        class512.method3041(arg1 + 14136, class396.field5454);
        class541.field8119 = new class373();
        class541.field8119.field8496 = class146.field2125 * 128 / 2;
        class541.field8119.field1957[0] = class146.field2125 / 2;
        class541.field8119.field8500 = class410.field5609 * 128 / 2;
        class214.field3161 = 0;
        class125.field1760 = 0;
        class541.field8119.field1955[0] = class410.field5609 / 2;
        if (class531.field7929 == 2) {
            class214.field3161 = class224.field3243 << 7;
            class125.field1760 = class92.field1368 << 7;
        } else {
            class116.method832(arg1 ^ 0xFFFFC8CB);
        }
        class232.method1489(8);
    }

    @OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5215++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
    public static final boolean method2258(int arg0, int arg1, int arg2) {
        if (arg2 > -111) {
            return false;
        } else {
            field5214++;
            return class162.method1157(arg0, arg1, 120) || class444.method2666(-13624, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    public static final void method2259(int arg0) {
        field5209++;
        int var1 = class551.field8224;
        int[] var2 = class314.field4332;
        if (arg0 != -1) {
            method2255(null, null, 1);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class373 var9 = class293.field4036[var2[var3]];
            if (var9 != null && var9.field1902 > 0) {
                var9.field1902--;
                if (var9.field1902 == 0) {
                    var9.field1867 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class527.field7717; var4++) {
            long var5 = (long) class634.field9290[var4];
            class505 var7 = (class505) class510.field7260.method2799(var5, true);
            if (var7 != null) {
                class571 var8 = var7.field7148;
                if (var8.field1902 > 0) {
                    var8.field1902--;
                    if (var8.field1902 == 0) {
                        var8.field1867 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(II)V")
    public class378(int arg0, int arg1) {
    }
}
