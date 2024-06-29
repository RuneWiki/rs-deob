import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class261 extends class153 {

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public int field4468 = 0;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "Lpj;")
    public static class237 field4472 = class33.method353("Musik)2Engine vorbereitet)3", 32);

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "[J")
    public static long[] field4466 = new long[32];

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Lid;")
    public static class146 field4474 = new class146(0, 0);

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "Lpj;")
    public static class237 field4475 = class33.method353("<col=ffb000>", 23);

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "J")
    public static long field4469;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "[Lmc;")
    public static class191[] field4476;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "[[[I")
    public static int[][][] field4470;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    public static void method1753(int arg0) {
        field4475 = null;
        if (arg0 != 0) {
            field4476 = null;
        }
        field4466 = null;
        field4472 = null;
        field4474 = null;
        field4470 = null;
        field4476 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V")
    public static final void method1754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4471++;
        if (arg3 > -44) {
            method1754(-7, -93, -12, 97, 97);
        }
        if (class89.field1637 <= (arg4 - arg1) && class94.field1676 >= arg1 + arg4 && arg0 - arg1 >= class13.field215 && class34.field727 >= arg0 + arg1) {
            class208.method1391((byte) -69, arg1, arg2, arg0, arg4);
        } else {
            class176.method1216(arg0, (byte) -125, arg2, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILie;)V")
    public final void method1755(int arg0, class32 arg1) {
        field4473++;
        while (true) {
            int var3 = arg1.method316((byte) 111);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    field4466 = null;
                    return;
                }
            }
            this.method1756(var3, (byte) 6, arg1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBLie;)V")
    private final void method1756(int arg0, byte arg1, class32 arg2) {
        if (arg0 == 2) {
            this.field4468 = arg2.method339(-16777216);
        }
        field4467++;
        if (arg1 <= 2) {
            method1753(41);
        }
    }
}
