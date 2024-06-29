import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class230 {

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "B")
    private byte field3241;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public int field3240;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Z")
    public static boolean field3237 = true;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "F")
    public static float field3233 = 0.0F;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lhc;")
    public static class368 field3239 = new class368("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field3244 = 0;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Lfk;")
    public static class23 field3245;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 9)
    public final int method1503(int arg0) {
        if (arg0 <= 117) {
            method1507(-36);
        }
        field3236++;
        return this.field3241 & 0x7;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 21)
    public static final void method1504(int arg0) {
        field3242++;
        if (class393.field5452 == 0) {
            return;
        }
        if (arg0 != 0) {
            field3244 = -23;
        }
        try {
            if ((++class83.field1139) > 1500) {
                if (class398.field5513 != null) {
                    class398.field5513.method1324(122);
                    class398.field5513 = null;
                }
                if (class304.field4145 >= 1) {
                    class393.field5452 = 0;
                    class310.field4205 = -5;
                    return;
                }
                class393.field5452 = 1;
                class83.field1139 = 0;
                class304.field4145++;
                if (class369.field5111 == class166.field2340) {
                    class166.field2340 = class169.field2405;
                } else {
                    class166.field2340 = class369.field5111;
                }
            }
            if (class393.field5452 == 1) {
                class332.field4479 = class122.field1839.method588((byte) -62, class166.field2340, class248.field3483);
                class393.field5452 = 2;
            }
            if (class393.field5452 == 2) {
                if (class332.field4479.field3875 == 2) {
                    throw new IOException();
                }
                if (class332.field4479.field3875 != 1) {
                    return;
                }
                class398.field5513 = new class191((Socket) class332.field4479.field3871, class122.field1839);
                class332.field4479 = null;
                class398.field5513.method1328(0, class88.field1232.field5076, class88.field1232.field5048, 3);
                if (class39.field513 != null) {
                    class39.field513.method1333(arg0 ^ 0xFFFFB2F7);
                }
                if (class431.field6047 != null) {
                    class431.field6047.method1333(-19721);
                }
                int var1 = class398.field5513.method1329(-19824);
                if (class39.field513 != null) {
                    class39.field513.method1333(arg0 - 19721);
                }
                if (class431.field6047 != null) {
                    class431.field6047.method1333(arg0 - 19721);
                }
                if (var1 != 101) {
                    class393.field5452 = 0;
                    class310.field4205 = var1;
                    class398.field5513.method1324(125);
                    class398.field5513 = null;
                    return;
                }
                class393.field5452 = 3;
            }
            if (class393.field5452 == 3 && class398.field5513.method1325(0) >= 2) {
                int var2 = class398.field5513.method1329(arg0 ^ 0xFFFFB290) << 8 | class398.field5513.method1329(-19824);
                class228.method1491(63, var2);
                if (class399.field5517 == -1) {
                    class310.field4205 = 6;
                    class393.field5452 = 0;
                    class398.field5513.method1324(125);
                    class398.field5513 = null;
                } else {
                    class393.field5452 = 0;
                    class398.field5513.method1324(109);
                    class398.field5513 = null;
                    class19.method114(arg0);
                }
            }
        } catch (IOException var3) {
            if (class398.field5513 != null) {
                class398.field5513.method1324(arg0 ^ 0x66);
                class398.field5513 = null;
            }
            if (class304.field4145 < 1) {
                if (class369.field5111 == class166.field2340) {
                    class166.field2340 = class169.field2405;
                } else {
                    class166.field2340 = class369.field5111;
                }
                class304.field4145++;
                class393.field5452 = 1;
                class83.field1139 = 0;
            } else {
                class310.field4205 = -4;
                class393.field5452 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 170)
    public static final void method1505(int arg0) {
        class260.field3592.method2522((byte) 116);
        if (arg0 == 0) {
            field3231++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)I", line = 185)
    public final int method1506(int arg0) {
        if (arg0 != 8) {
            field3239 = null;
        }
        field3234++;
        return (this.field3241 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 212)
    public class230() {
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lrg;)V", line = 215)
    public class230(class366 arg0) {
        this.field3241 = arg0.method2289((byte) -77);
        this.field3240 = arg0.method2297(13352);
        this.field3229 = arg0.method2258(1177515464);
        this.field3232 = arg0.method2258(1177515464);
        this.field3235 = arg0.method2258(1177515464);
        this.field3243 = arg0.method2258(1177515464);
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V", line = 228)
    public static void method1507(int arg0) {
        field3239 = null;
        field3245 = null;
        int var1 = -115 % ((7 - arg0) / 42);
    }
}
