import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class31 extends class291 {

    @OriginalMember(owner = "client!u", name = "M", descriptor = "Lai;")
    public class232 field456;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Leg;")
    public static class37 field459 = class174.method1167(":", -53);

    @OriginalMember(owner = "client!u", name = "O", descriptor = "Lgj;")
    public static class247 field458 = new class247(5000);

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Z")
    public static boolean field461 = true;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "Leg;")
    public static class37 field462 = class174.method1167("Titelbild ge-Offnet)3", 113);

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 23872) {
            return;
        }
        field457++;
        if (arg1 == arg4) {
            class244.method1683(arg7, arg6, arg5, arg0, 0, arg3, arg1);
        } else if ((arg0 - arg1) >= class178.field2972 && arg0 + arg1 <= class217.field3741 && (arg7 - arg4) >= class286.field5050 && class96.field1507 >= arg7 + arg4) {
            class86.method572(arg0, arg1, arg7, arg3, arg4, arg6, arg5, 1);
        } else {
            class23.method140(arg5, arg3, arg0, arg4, arg6, arg1, (byte) -36, arg7);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public static final void method181(boolean arg0) {
        if (arg0) {
            class286.field5048 = class233.field4031;
            class218.field3754 = class39.field635;
        } else {
            class286.field5048 = class88.field1394;
            class218.field3754 = class177.field2958;
        }
        class274.field4815 = class286.field5048.length;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(Z)V")
    public static void method182(boolean arg0) {
        if (arg0) {
            field461 = false;
        }
        field462 = null;
        field459 = null;
        field458 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class175.field2936 * 128) {
            arg0 = class175.field2936 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class160.field2675 * 128) {
            arg2 = class160.field2675 * 128 - 1;
        }
        class197.field3347 = class76.field1192[arg3];
        class61.field999 = class76.field1189[arg3];
        class8.field139 = class76.field1192[arg4];
        class69.field1101 = class76.field1189[arg4];
        class23.field301 = arg0;
        class120.field2032 = arg1;
        class184.field3099 = arg2;
        class111.field1853 = arg0 / 128;
        class254.field4514 = arg2 / 128;
        class39.field633 = class111.field1853 - class257.field4562;
        if (class39.field633 < 0) {
            class39.field633 = 0;
        }
        class86.field1353 = class254.field4514 - class257.field4562;
        if (class86.field1353 < 0) {
            class86.field1353 = 0;
        }
        class77.field1202 = class257.field4562 + class111.field1853;
        if (class77.field1202 > class175.field2936) {
            class77.field1202 = class175.field2936;
        }
        class125.field2093 = class257.field4562 + class254.field4514;
        if (class125.field2093 > class160.field2675) {
            class125.field2093 = class160.field2675;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class257.field4562 + class257.field4562 + 2; var16++) {
            for (int var19 = 0; var19 < class257.field4562 + class257.field4562 + 2; var19++) {
                int var20 = (var16 - class257.field4562 << 7) - (class23.field301 & 0x7F);
                int var21 = (var19 - class257.field4562 << 7) - (class184.field3099 & 0x7F);
                int var22 = class111.field1853 + var16 - class257.field4562;
                int var23 = class254.field4514 + var19 - class257.field4562;
                if (var22 >= 0 && var23 >= 0 && var22 < class175.field2936 && var23 < class160.field2675) {
                    int var24;
                    if (class39.field635 == null) {
                        var24 = class177.field2958[0][var22][var23] + 128 - class120.field2032;
                    } else {
                        var24 = class39.field635[0][var22][var23] + 128 - class120.field2032;
                    }
                    int var25 = class177.field2958[3][var22][var23] - class120.field2032 - 1000;
                    client.field1884[var16][var19] = class86.method571(var20, var25, var24, var21, var15);
                } else {
                    client.field1884[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class257.field4562 + class257.field4562 + 1; var17++) {
            for (int var18 = 0; var18 < class257.field4562 + class257.field4562 + 1; var18++) {
                class181.field3036[var17][var18] = client.field1884[var17][var18] || client.field1884[var17 + 1][var18] || client.field1884[var17][var18 + 1] || client.field1884[var17 + 1][var18 + 1];
            }
        }
        class255.field4525 = arg6;
        class270.field4743 = arg7;
        class288.field5062 = arg8;
        class150.field2526 = arg9;
        class260.field4597 = arg10;
        class45.method294();
        if (class233.field4031 != null) {
            method181(true);
            class132.method944(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            method181(false);
        }
        class132.method944(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLjl;Leh;Ljl;Z)V")
    public static final void method184(boolean arg0, class101 arg1, class136 arg2, class101 arg3, boolean arg4) {
        field460++;
        class72.field1139 = arg1;
        class35.field504 = arg4;
        class13.field206 = arg3;
        if (!arg0) {
            method183(-120, 50, -74, 35, 16, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -65, (byte) 104, -42, 86);
        }
        int var5 = class13.field206.method676(!arg0) - 1;
        class45.field704 = class13.field206.method672(var5, (byte) 116) + var5 * 256;
        class1.field16 = arg2;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lai;)V")
    public class31(class232 arg0) {
        this.field456 = arg0;
    }
}
