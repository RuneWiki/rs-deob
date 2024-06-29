import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class316 {

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "S")
    public short field4320;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "B")
    public byte field4318;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "Lwfa;")
    public class212 field4319;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "B")
    public byte field4316;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "J")
    public static long field4322 = 0L;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IBI)Z", line = 7)
    public static final boolean method1994(int arg0, byte arg1, int arg2) {
        if (arg1 < 22) {
            return true;
        } else {
            field4317++;
            return (arg2 & 0x40000) != 0 | class164.method1281(arg2, -125, arg0) || class4.method23(arg2, false, arg0);
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lwfa;III)V", line = 21)
    public class316(class212 arg0, int arg1, int arg2, int arg3) {
        this.field4320 = (short) arg1;
        this.field4318 = (byte) arg3;
        this.field4319 = arg0;
        this.field4316 = (byte) arg2;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)I", line = 32)
    public static final int method1995(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        field4321++;
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 <= 33) {
            return -83;
        } else {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }
}
