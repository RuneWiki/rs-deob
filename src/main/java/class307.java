import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class307 {

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    private int field4544 = 0;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Lip;")
    private class657 field4541 = null;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    private int field4545 = 0;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    private int field4548 = 0;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Lok;")
    private class228 field4547;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lsda;")
    private class232 field4536;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[Lfk;")
    private class605[] field4538;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ltm;")
    public class354 field4542;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lwba;")
    public static class46 field4539 = new class46();

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "[J")
    public static long[] field4550 = new long[32];

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "[I")
    public static int[] field4552 = new int[1000];

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lf;")
    public static class702 field4549;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Ljava/awt/Font;")
    public static Font field4551;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V", line = 3)
    public static final void method1952(int arg0, int arg1, int arg2) {
        field4540++;
        class9.field89 = arg0 - class25.field366;
        if (arg1 != 6) {
            method1956(null, 39, (byte) 115);
        }
        class319.field4698 = arg2 - class25.field365;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Z", line = 15)
    public final boolean method1953(byte arg0, int arg1) {
        field4553++;
        if (arg0 != 19) {
            method1954((byte) 47);
        }
        return this.field4538[arg1].method48(false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 28)
    public static void method1954(byte arg0) {
        field4539 = null;
        field4549 = null;
        int var1 = -69 / ((arg0 - 51) / 38);
        field4551 = null;
        field4552 = null;
        field4550 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZZIII)V", line = 53)
    public final void method1955(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4537++;
        boolean var7 = arg2 & this.field4547.method108();
        if (!var7 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (arg3 == 4) {
                arg4 = arg5;
            }
            arg3 = 2;
        }
        if (arg3 != 0 && arg1) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field4544 != arg3) {
            if (this.field4544 != 0) {
                this.field4538[Integer.MAX_VALUE & this.field4544].method45(0);
            }
            if (arg3 != 0) {
                this.field4538[arg3 & Integer.MAX_VALUE].method51(arg1, -128);
                this.field4538[arg3 & Integer.MAX_VALUE].method46(arg1, (byte) -74);
                this.field4538[Integer.MAX_VALUE & arg3].method47(arg5, false, arg4);
            }
            this.field4541 = null;
            this.field4544 = arg3;
            this.field4548 = arg5;
            this.field4545 = arg4;
        } else if (this.field4544 != 0) {
            this.field4538[this.field4544 & Integer.MAX_VALUE].method46(arg1, (byte) -110);
            if (this.field4548 != arg5 || this.field4545 != arg4) {
                this.field4538[Integer.MAX_VALUE & this.field4544].method47(arg5, false, arg4);
                this.field4545 = arg4;
                this.field4548 = arg5;
            }
        }
        if (arg0 <= 24) {
            this.field4548 = -74;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 106)
    public static final void method1956(String arg0, int arg1, byte arg2) {
        field4543++;
        int var3 = class7.field65;
        int[] var4 = class629.field8801;
        boolean var5 = false;
        if (arg2 != -79) {
            return;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class491 var7 = class141.field2087[var4[var6]];
            if (var7 != null && class648.field9106 != var7 && var7.field6981 != null && var7.field6981.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg1 == 1) {
                    class255.field3912++;
                    class135 var12 = class688.method3794(class493.field7008, class583.field8198, (byte) 38);
                    var12.field1978.method3852(false, var4[var6]);
                    var12.field1978.method3832(-32768, 0);
                    class19.method223(var12, 0);
                } else if (arg1 == 4) {
                    class408.field5958++;
                    class135 var8 = class688.method3794(class689.field9704, class583.field8198, (byte) 38);
                    var8.field1978.method3853((byte) 51, 0);
                    var8.field1978.method3865(-1449382360, var4[var6]);
                    class19.method223(var8, 0);
                } else if (arg1 == 5) {
                    class310.field4592++;
                    class135 var11 = class688.method3794(class27.field392, class583.field8198, (byte) 38);
                    var11.field1978.method3870(0, 2820);
                    var11.field1978.method3865(-1449382360, var4[var6]);
                    class19.method223(var11, 0);
                } else if (arg1 == 6) {
                    class358.field5131++;
                    class135 var9 = class688.method3794(class660.field9336, class583.field8198, (byte) 38);
                    var9.field1978.method3832(arg2 ^ 0x7FB1, 0);
                    var9.field1978.method3816(var4[var6], arg2 ^ 0x17);
                    class19.method223(var9, 0);
                } else if (arg1 == 7) {
                    class645.field9062++;
                    class135 var10 = class688.method3794(class603.field8523, class583.field8198, (byte) 38);
                    var10.field1978.method3840(false, var4[var6]);
                    var10.field1978.method3871(true, 0);
                    class19.method223(var10, 0);
                }
                break;
            }
        }
        if (!var5) {
            class60.method639(4, class274.field4137.method1804(7175, class512.field7203) + arg0, arg2 + 65614);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILip;I)Z", line = 197)
    public final boolean method1957(int arg0, class657 arg1, int arg2) {
        field4546++;
        if (this.field4544 == 0) {
            return false;
        } else if (arg0 == Integer.MAX_VALUE) {
            if (this.field4541 != arg1) {
                this.field4538[this.field4544 & Integer.MAX_VALUE].method43(arg2, arg1, 0);
                this.field4541 = arg1;
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lok;)V", line = 246)
    public class307(class228 arg0) {
        this.field4547 = arg0;
        this.field4536 = new class232(arg0);
        this.field4538 = new class605[10];
        this.field4538[1] = new class131(arg0);
        this.field4538[2] = new class8(arg0, this.field4536);
        this.field4538[4] = new class497(arg0, this.field4536);
        this.field4538[5] = new class537(arg0, this.field4536);
        this.field4538[6] = new class439(arg0);
        this.field4538[7] = new class216(arg0);
        this.field4538[3] = this.field4542 = new class354(arg0);
        this.field4538[8] = new class574(arg0, this.field4536);
        this.field4538[9] = new class39(arg0, this.field4536);
        if (!this.field4538[8].method48(false)) {
            this.field4538[8] = this.field4538[4];
        }
        if (!this.field4538[9].method48(false)) {
            this.field4538[9] = this.field4538[8];
        }
    }
}
