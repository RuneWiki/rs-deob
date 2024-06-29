import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class106 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1341;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Ldq;")
    public static class493 field1345;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1344;

    static {
        new class335("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field1342 = 0;
        field1341 = new String[200];
        field1345 = new class493(19, 0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method780(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class216.field2773 = arg3;
        class346.field4452 = arg2;
        field1340++;
        class228.field2921 = arg4;
        class475.field6885 = arg1;
        int var5 = -74 / ((-arg0 - 38) / 58);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 35)
    public static final void method781(int arg0) {
        if (arg0 <= 8) {
            method782(8);
        }
        field1343++;
        if (class533.field7846 == 0) {
            return;
        }
        try {
            if (++class456.field6562 > 2000) {
                if (class64.field835 != null) {
                    class64.field835.method2473(10228);
                    class64.field835 = null;
                }
                if (class312.field3984 >= 1) {
                    class45.field539 = -5;
                    class533.field7846 = 0;
                    return;
                }
                class312.field3984++;
                class382.field5031.field367 = !class382.field5031.field367;
                class533.field7846 = 1;
                class456.field6562 = 0;
            }
            if (class533.field7846 == 1) {
                class518.field7494 = class219.field2794.method2888(class382.field5031.field363, class382.field5031.method202((byte) -88), (byte) 91);
                class533.field7846 = 2;
            }
            if (class533.field7846 == 2) {
                if (class518.field7494.field1628 == 2) {
                    throw new IOException();
                }
                if (class518.field7494.field1628 != 1) {
                    return;
                }
                class64.field835 = new class421((Socket) class518.field7494.field1627, class219.field2794);
                class518.field7494 = null;
                class64.field835.method2475(0, (byte) 108, class40.field511.field6631, class40.field511.field6618);
                class404.method2390((byte) 84);
                int var1 = class64.field835.method2474(false);
                class404.method2390((byte) 84);
                if (var1 != 21) {
                    class533.field7846 = 0;
                    class45.field539 = var1;
                    class64.field835.method2473(10228);
                    class64.field835 = null;
                    return;
                }
                class533.field7846 = 3;
            }
            if (class533.field7846 == 3) {
                if (class64.field835.method2470((byte) 123) < 1) {
                    return;
                }
                class528.field7787 = new String[class64.field835.method2474(false)];
                class533.field7846 = 4;
            }
            if (class533.field7846 == 4 && class64.field835.method2470((byte) 85) >= class528.field7787.length * 8) {
                class513.field7443.field6631 = 0;
                class64.field835.method2472(-20555, class528.field7787.length * 8, class513.field7443.field6618, 0);
                for (int var2 = 0; var2 < class528.field7787.length; var2++) {
                    class528.field7787[var2] = class279.method1651(class513.field7443.method2754(-98), (byte) 110);
                }
                class533.field7846 = 0;
                class45.field539 = 21;
                class64.field835.method2473(10228);
                class64.field835 = null;
            }
        } catch (IOException var3) {
            if (class64.field835 != null) {
                class64.field835.method2473(10228);
                class64.field835 = null;
            }
            if (class312.field3984 >= 1) {
                class533.field7846 = 0;
                class45.field539 = -4;
            } else {
                class456.field6562 = 0;
                class312.field3984++;
                class382.field5031.field367 = !class382.field5031.field367;
                class533.field7846 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lfg;", line = 172)
    public static final class84 method782(int arg0) {
        if (arg0 != 27059) {
            method781(122);
        }
        field1344++;
        try {
            return (class84) Class.forName("aj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 192)
    public static void method783(byte arg0) {
        field1345 = null;
        if (arg0 != 81) {
            field1345 = null;
        }
        field1341 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I", line = 204)
    public static final int method784(int arg0, int arg1) {
        return class382.field5040 == null ? 0 : class382.field5040[arg0][arg1] & 0xFFFF;
    }
}
