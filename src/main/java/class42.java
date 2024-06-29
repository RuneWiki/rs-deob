import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class42 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field641 = 16777215;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field643 = 8;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "S")
    public static short field638 = 205;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lkt;")
    public static class103[] field632 = new class103[14];

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Z")
    public boolean field639;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILae;)V", line = 8)
    public final void method311(int arg0, class156 arg1) {
        if (arg0 != 23861) {
            this.field637 = -128;
        }
        while (true) {
            int var3 = arg1.method941((byte) 123);
            if (var3 == 0) {
                field633++;
                return;
            }
            this.method315((byte) 125, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 28)
    public static final void method312(int arg0) {
        if (arg0 > 88) {
            field645++;
            class364.field5470.method38((byte) -14);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 51)
    public static final void method313(byte arg0) {
        field635++;
        if (arg0 < 21) {
            field638 = -18;
        }
        if (!class112.method661(2)) {
            return;
        }
        if (class388.field5759 == null) {
            class146.method910(-127);
        }
        class136.field1752 = true;
        class19.field267 = 0;
        try {
            class103.field1388 = class114.field1473.getToolkit().getSystemClipboard();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 80)
    public static void method314(int arg0) {
        field632 = null;
        if (arg0 != 0) {
            method313((byte) 86);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BILae;)V", line = 90)
    private final void method315(byte arg0, int arg1, class156 arg2) {
        field634++;
        if (arg1 == 1) {
            this.field643 = arg2.method993((byte) -48);
        } else if (arg1 == 2) {
            this.field639 = true;
        } else if (arg1 == 3) {
            this.field642 = arg2.method936((byte) -96);
            this.field646 = arg2.method936((byte) -96);
            this.field644 = arg2.method936((byte) -96);
        } else if (arg1 == 4) {
            this.field636 = arg2.method941((byte) 127);
        } else if (arg1 == 5) {
            this.field637 = arg2.method993((byte) -38);
        } else if (arg1 == 6) {
            this.field641 = arg2.method943(1295851312);
        }
        if (arg0 <= 117) {
            field632 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIII)I", line = 136)
    public static final int method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field640++;
        if (arg2 != 2) {
            field638 = 68;
        }
        if (class311.field4527 == null) {
            return 0;
        }
        if (arg4 < 3) {
            int var6 = arg5 >> 7;
            int var7 = arg3 >> 7;
            if (arg0 < 0 || arg1 < 0 || (class362.field5442 - 1) < arg0 || (class203.field2813 - 1) < arg1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class362.field5442 - 1) || class203.field2813 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class379.field5661[1][arg5 >> 7][arg3 >> 7] & 0x2) != 0;
            if ((arg5 & 0x7F) == 0) {
                boolean var9 = (class379.field5661[1][var6 - 1][arg3 >> 7] & 0x2) != 0;
                boolean var10 = (class379.field5661[1][var6][arg3 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class379.field5661[1][arg0][arg1] & 0x2) != 0;
                }
            }
            if ((arg3 & 0x7F) == 0) {
                boolean var11 = (class379.field5661[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class379.field5661[1][arg5 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class379.field5661[1][arg0][arg1] & 0x2) != 0;
                }
            }
            if (var8) {
                arg4++;
            }
        }
        return class311.field4527[arg4].method855(arg5, arg3);
    }
}
