import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class396 {

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lea;")
    private class148 field5461 = null;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    private int field5464 = 0;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    private int field5472 = 0;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    private int field5470 = 0;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Luq;")
    private class313 field5462;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lln;")
    private class94 field5463;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "[Ldt;")
    private class209[] field5471;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "Luk;")
    public class435 field5467;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "I")
    public static int field5469 = 0;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Z")
    public final boolean method2371(int arg0, int arg1) {
        field5468++;
        if (arg1 != 0) {
            field5469 = -76;
        }
        return this.field5471[arg0].method42(true);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BILea;)Z")
    public final boolean method2372(byte arg0, int arg1, class148 arg2) {
        field5466++;
        if (this.field5472 == 0) {
            return false;
        } else if (arg0 == -40) {
            if (this.field5461 != arg2) {
                this.field5471[this.field5472 & Integer.MAX_VALUE].method44(arg2, arg1, true);
                this.field5461 = arg2;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZBZIII)V")
    public final void method2373(boolean arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        boolean var7 = arg0 & this.field5462.method917();
        field5465++;
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg3 = arg5;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg2) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (arg1 != -119) {
            this.method2371(49, -43);
        }
        if (this.field5472 != arg4) {
            if (this.field5472 != 0) {
                this.field5471[this.field5472 & Integer.MAX_VALUE].method43(arg1 ^ 0x76);
            }
            if (arg4 != 0) {
                this.field5471[arg4 & Integer.MAX_VALUE].method47(arg2, (byte) 125);
                this.field5471[Integer.MAX_VALUE & arg4].method48(arg2, (byte) 125);
                this.field5471[arg4 & Integer.MAX_VALUE].method45(arg5, arg3, arg1 + 37);
            }
            this.field5461 = null;
            this.field5464 = arg3;
            this.field5472 = arg4;
            this.field5470 = arg5;
        } else if (this.field5472 != 0) {
            this.field5471[Integer.MAX_VALUE & this.field5472].method48(arg2, (byte) 125);
            if (this.field5470 != arg5 || this.field5464 != arg3) {
                this.field5471[Integer.MAX_VALUE & this.field5472].method45(arg5, arg3, -99);
                this.field5470 = arg5;
                this.field5464 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Luq;)V")
    public class396(class313 arg0) {
        this.field5462 = arg0;
        this.field5463 = new class94(arg0);
        this.field5471 = new class209[10];
        this.field5471[1] = new class38(arg0);
        this.field5471[2] = new class14(arg0, this.field5463);
        this.field5471[4] = new class10(arg0, this.field5463);
        this.field5471[5] = new class118(arg0, this.field5463);
        this.field5471[6] = new class463(arg0);
        this.field5471[7] = new class22(arg0);
        this.field5471[3] = this.field5467 = new class435(arg0);
        this.field5471[8] = new class127(arg0, this.field5463);
        this.field5471[9] = new class612(arg0, this.field5463);
        if (!this.field5471[8].method42(true)) {
            this.field5471[8] = this.field5471[4];
        }
        if (!this.field5471[9].method42(true)) {
            this.field5471[9] = this.field5471[8];
        }
    }

    static {
        new class344("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }
}
