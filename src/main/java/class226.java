import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class226 {

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3612 = -1;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "J")
    public static long field3607 = 0L;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lck;")
    public static class119 field3614 = class298.method1987((byte) 12, "go");

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
    public static int[] field3609 = new int[2048];

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lck;")
    public static class119 field3618 = class298.method1987((byte) 58, "<col=ff9040>");

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lva;")
    public static class36 field3615;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
    public static int[] field3611;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 17)
    public static void method1437(byte arg0) {
        field3609 = null;
        field3611 = null;
        field3614 = null;
        if (arg0 > -14) {
            field3612 = 4;
        }
        field3618 = null;
        field3615 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 53)
    public static final void method1438(int arg0, int arg1) {
        if (arg1 != -76) {
            field3615 = (class36) null;
        }
        field3617++;
        if (arg0 == 37) {
            class108.field1651 = 3.0D;
        } else if (arg0 == 50) {
            class108.field1651 = 4.0D;
        } else if (arg0 == 75) {
            class108.field1651 = 6.0D;
        } else {
            class108.field1651 = 8.0D;
        }
        class11.field195 = -1;
        class11.field195 = -1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[Lck;B)Lck;", line = 83)
    public static final class119 method1439(int arg0, int arg1, class119[] arg2, byte arg3) {
        field3610++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class103.field1581;
            }
            var4 += arg2[arg1 + var5].field1825;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg3 < 88) {
            return (class119) null;
        }
        for (int var8 = 0; var8 < arg0; var8++) {
            class119 var9 = arg2[arg1 + var8];
            class213.method1339(var9.field1838, 0, var6, var7, var9.field1825);
            var7 += var9.field1825;
        }
        class119 var10 = new class119();
        var10.field1838 = var6;
        var10.field1825 = var4;
        return var10;
    }
}
