import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class310 {

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "B")
    public byte field4437;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public int field4440;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public int field4442;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field4432 = -1;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lgf;")
    public static class180 field4425 = new class180("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lsv;")
    public static class467 field4444 = new class467(10, 2, 2, 0);

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "[I")
    public static int[] field4447 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "[I")
    public static int[] field4448 = new int[32];

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lmu;")
    public class195 field4426;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lbv;")
    public class199 field4428;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lgk;")
    public class330 field4431;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lrv;")
    public class71 field4439;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lhh;")
    public static class84 field4443;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method1941(int arg0, int arg1, int arg2, int arg3) {
        field4438++;
        int var4 = class397.field5830.field141 * arg1 >> 8;
        if (arg0 == -9434 && var4 != 0 && arg2 != -1) {
            class72.method605(0, var4, arg2, false, 0, class515.field7580);
            class124.field1918 = true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 32)
    public static final void method1942(int arg0) {
        field4427++;
        if (class405.field5964 == 0) {
            return;
        }
        if (arg0 != 17134) {
            method1945(64, 114, 97, (byte) 32, 120, 55, 87, -100, -71);
        }
        try {
            if ((++class286.field4137) > 1500) {
                if (class138.field2091 != null) {
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                }
                if (class343.field5239 >= 1) {
                    class72.field1206 = -5;
                    class405.field5964 = 0;
                    return;
                }
                class405.field5964 = 1;
                if (class447.field6546 == field4445) {
                    field4445 = class291.field4173;
                } else {
                    field4445 = class447.field6546;
                }
                class343.field5239++;
                class286.field4137 = 0;
            }
            if (class405.field5964 == 1) {
                class178.field2699 = class112.field1785.method1962(1, class68.field1189, field4445);
                class405.field5964 = 2;
            }
            if (class405.field5964 == 2) {
                if (class178.field2699.field1604 == 2) {
                    throw new IOException();
                }
                if (class178.field2699.field1604 != 1) {
                    return;
                }
                class138.field2091 = new class85((Socket) class178.field2699.field1608, class112.field1785);
                class178.field2699 = null;
                class138.field2091.method695(class86.field1436.field4333, 0, class86.field1436.field4326, (byte) 112);
                class13.method125(-4);
                int var1 = class138.field2091.method697(0);
                class13.method125(-4);
                if (var1 != 101) {
                    class72.field1206 = var1;
                    class405.field5964 = 0;
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                    return;
                }
                class405.field5964 = 3;
            }
            if (class405.field5964 == 3 && class138.field2091.method693((byte) -126) >= 2) {
                int var2 = class138.field2091.method697(0) << 8 | class138.field2091.method697(0);
                class326.method2130(false, var2);
                if (class255.field3681 == -1) {
                    class405.field5964 = 0;
                    class72.field1206 = 6;
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                } else {
                    class405.field5964 = 0;
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                    class289.method1800(arg0 ^ 0x42EF);
                }
            }
        } catch (IOException var3) {
            if (class138.field2091 != null) {
                class138.field2091.method694(false);
                class138.field2091 = null;
            }
            if (class343.field5239 >= 1) {
                class72.field1206 = -4;
                class405.field5964 = 0;
            } else {
                class405.field5964 = 1;
                class343.field5239++;
                class286.field4137 = 0;
                if (class447.field6546 == field4445) {
                    field4445 = class291.field4173;
                } else {
                    field4445 = class447.field6546;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 167)
    public static final void method1943(int arg0) {
        class14.field242.method458(((float) class397.field5830.field128 * 0.1F + 0.7F) * class82.field1354);
        field4434++;
        class14.field242.method520(class134.field2066, class131.field2012, class41.field628, (float) (class440.field6419 << 0), (float) (class508.field7425 << 0), (float) (class122.field1910 << 0));
        if (arg0 == 1) {
            class14.field242.method455(class392.field5805);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 180)
    public static void method1944(boolean arg0) {
        field4444 = null;
        if (arg0) {
            field4443 = null;
            field4447 = null;
            field4425 = null;
            field4448 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIBIIIII)Z", line = 199)
    public static final boolean method1945(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -73) {
            return true;
        }
        field4435++;
        if ((arg1 + arg4) > arg6 && arg6 + arg8 > arg1) {
            return arg2 + arg7 > arg5 && arg2 < arg5 + arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(BIIIII)V", line = 225)
    public class310(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4437 = arg0;
        this.field4430 = arg2;
        this.field4436 = arg4;
        this.field4440 = arg3;
        this.field4442 = arg1;
        this.field4433 = arg5;
    }
}
