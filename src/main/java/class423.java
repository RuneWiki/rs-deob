import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class423 {

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lmn;")
    public static class247 field6197 = new class247(32);

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lwj;")
    public static class270 field6202 = new class270(25, 20);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public int field6188;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field6189;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public int field6190;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field6191;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public int field6193;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public int field6201;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lwa;")
    public static class433 field6196;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lmh;")
    public static class444 field6200;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[B")
    public byte[] field6194;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "[B")
    public byte[] field6198;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;Lsi;B)I", line = 5)
    public static final int method2516(String arg0, class391 arg1, byte arg2) {
        field6195++;
        int var3 = -35 % ((-arg2 - 22) / 58);
        int var4 = arg1.field5719;
        byte[] var5 = class138.method925(97, arg0);
        arg1.method2328(false, var5.length);
        arg1.field5719 += class53.field647.method2792(arg1.field5678, arg1.field5719, false, 0, var5.length, var5);
        return arg1.field5719 - var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 28)
    public static void method2517(int arg0) {
        field6196 = null;
        field6197 = null;
        field6200 = null;
        int var1 = 48 / ((arg0 + 27) / 47);
        field6202 = null;
    }
}
