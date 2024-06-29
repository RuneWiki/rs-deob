import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class342 {

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "B")
    public byte field4312;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
    private int field4318;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "Lew;")
    public class342 field4317;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "B")
    public static byte field4309;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "F")
    public static float field4322;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public int field4311;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public int field4314;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public int field4316;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    public int field4324;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method1966(int arg0, byte arg1) {
        client.field2572.method2648(false, arg0);
        if (arg1 >= -5) {
            method1969(false);
        }
        field4313++;
        class240.field3085.method2648(false, arg0);
        class109.field1476.method2648(false, arg0);
        class91.field1117.method2648(false, arg0);
        class159.field2028.method2648(false, arg0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Ljb;", line = 25)
    public final class343 method1967(int arg0) {
        field4326++;
        if (arg0 != 0) {
            method1966(-81, (byte) -11);
        }
        return class226.method1377((byte) -82, this.field4318);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIII)Lew;", line = 46)
    public final class342 method1968(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 9 % ((arg0 - 24) / 45);
        field4307++;
        return new class342(this.field4318, arg2, arg3, arg1, this.field4312);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)V", line = 62)
    public static final void method1969(boolean arg0) {
        class271.field3417 = new class520(class293.field3751.method1936(-26539, class11.field177), "", class236.field3000, 1003, -1, 0L, 0, 0, arg0, false);
        field4323++;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(IIIIB)V", line = 74)
    public class342(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4312 = arg4;
        this.field4320 = arg1;
        this.field4318 = arg0;
        this.field4315 = arg3;
        this.field4321 = arg2;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lew;I)V", line = 85)
    public class342(class342 arg0, int arg1) {
        this.field4317 = arg0;
        this.field4312 = this.field4317.field4312;
        this.field4318 = this.field4317.field4318;
        this.field4315 = this.field4317.field4315 + arg1;
        this.field4320 = this.field4317.field4320 + arg1;
        this.field4321 = this.field4317.field4321 + arg1;
    }
}
