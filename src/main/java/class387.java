import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class387 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lvl;")
    public static class15 field5318 = new class15(9, 7);

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lfja;")
    public static class783 field5325 = new class783(75, -2);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public int field5319;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public int field5323;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public int field5326;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 8)
    public static void method2353(int arg0) {
        field5318 = null;
        if (arg0 < 95) {
            method2353(-61);
        }
        field5325 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Z", line = 20)
    public final boolean method2354(byte arg0) {
        int var2 = 118 / ((47 - arg0) / 56);
        field5322++;
        return (this.field5323 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z", line = 30)
    public final boolean method2355(int arg0) {
        if (arg0 <= 80) {
            field5325 = null;
        }
        field5321++;
        return (this.field5323 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Z", line = 42)
    public final boolean method2356(int arg0) {
        field5324++;
        if (arg0 == 21807) {
            return (this.field5323 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Z", line = 60)
    public final boolean method2357(int arg0) {
        if (arg0 == 512) {
            field5320++;
            return (this.field5323 & 0x2) != 0;
        } else {
            return true;
        }
    }
}
