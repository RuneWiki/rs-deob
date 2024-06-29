import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class190 {

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3503 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public static int[] field3504 = new int[200];

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lvd;")
    public static class222 field3505 = class212.method1357(")4l", 10731);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field3501;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field3508;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1186(int arg0) {
        if (arg0 == 2224) {
            field3505 = null;
            field3504 = null;
            field3503 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)V")
    public static final void method1187(byte arg0, int arg1, int arg2) {
        field3502++;
        int var3 = -71 / ((47 - arg0) / 32);
        long var4 = (long) ((arg2 << 16) + arg1);
        class212 var6 = (class212) class173.field3241.method1520(var4, 98);
        if (var6 != null) {
            class157.field3012.method1290(1, var6);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)I")
    public static final int method1188(int arg0, boolean arg1) {
        field3500++;
        return arg1 ? arg0 & 0xFF : 122;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lka;Z)Lfh;")
    public static final class63 method1189(class109 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field3499++;
            return new class63(arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method701(869322848), arg0.method701(869322848), arg0.method662((byte) -88));
        }
    }
}
