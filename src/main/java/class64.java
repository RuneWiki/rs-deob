import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class64 {

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "B")
    public byte field875;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lwp;")
    public static class453 field869 = new class453(2, 0);

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Lwp;")
    public static class453 field874 = new class453(58, 3);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "Lhu;")
    public static class528 field879;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lhi;")
    public class64 field864;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;[BIZ)I")
    public static final int method382(String arg0, byte[] arg1, int arg2, boolean arg3) {
        field866++;
        int var4 = arg0.length();
        int var5 = arg2;
        if (!arg3) {
            method382(null, null, 17, true);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 <= '\u007F') {
                arg1[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg1[var5++] = (byte) (class444.method2376(var7, 12303) >> 6);
                arg1[var5++] = (byte) class444.method2376(class695.method3921(var7, 63), 128);
            } else {
                arg1[var5++] = (byte) (class444.method2376(var7, 919249) >> 12);
                arg1[var5++] = (byte) class444.method2376(128, class695.method3921(var7, 4085) >> 6);
                arg1[var5++] = (byte) class444.method2376(128, class695.method3921(var7, 63));
            }
        }
        return var5 - arg2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIB)Lhi;")
    public final class64 method383(int arg0, int arg1, int arg2, byte arg3) {
        field877++;
        if (arg3 != 11) {
            method385((byte) 25);
        }
        return new class64(this.field867, arg1, arg0, arg2, this.field875);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)Lce;")
    public final class446 method384(boolean arg0) {
        field876++;
        if (!arg0) {
            this.field875 = -8;
        }
        return class429.method2269((byte) -128, this.field867);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method385(byte arg0) {
        field879 = null;
        field874 = null;
        if (arg0 <= -44) {
            field869 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIB)V")
    public class64(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field865 = arg2;
        this.field863 = arg3;
        this.field867 = arg0;
        this.field875 = arg4;
        this.field862 = arg1;
    }
}
