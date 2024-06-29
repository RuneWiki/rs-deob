import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class22 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "B")
    public byte field185;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "Loq;")
    public class230 field190;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Lcw;")
    public static class144 field199 = new class144();

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "Liga;")
    public static class91 field201 = new class91(13, 7);

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "Lv;")
    public static class165 field202 = new class165();

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "Ljn;")
    public static class134 field203 = new class134(89, 3);

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "Lia;")
    public static class32 field204 = new class32(0, 0);

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "D")
    public static double field200;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "Lwu;")
    public class168 field195;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Lhaa;")
    public class307 field186;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "Lfk;")
    public class348 field194;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Lqw;")
    public class622 field188;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V", line = 13)
    public static void method91(byte arg0) {
        field202 = null;
        field204 = null;
        if (arg0 <= 96) {
            field205 = 96;
        }
        field201 = null;
        field199 = null;
        field203 = null;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(BIIIIIILoq;)V", line = 31)
    public class22(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class230 arg7) {
        this.field185 = arg0;
        this.field191 = arg1;
        this.field196 = arg3;
        this.field190 = arg7;
        this.field187 = arg4;
        this.field189 = arg2;
        this.field197 = arg6;
        this.field198 = arg5;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)Z", line = 47)
    public final boolean method92(int arg0) {
        field193++;
        int var2 = -60 / ((arg0 - 32) / 44);
        return this.field185 == 2 || this.field185 == 3;
    }
}
