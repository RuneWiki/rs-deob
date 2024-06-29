import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class565 {

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "B")
    public byte field7086 = 0;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "S")
    public short field7090;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "B")
    public byte field7094;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "B")
    public byte field7083;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "S")
    public short field7091;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "[Lqaa;")
    public static class26[] field7071 = new class26[8];

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "B")
    public byte field7077;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "B")
    public byte field7080;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "B")
    public byte field7089;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "B")
    public byte field7093;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "Lig;")
    public class228 field7084;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "Lmf;")
    public class387 field7078;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Lqe;")
    public class436 field7074;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "Lap;")
    public class445 field7085;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "Luo;")
    public class539 field7073;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Luo;")
    public class539 field7082;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Lqs;")
    public class565 field7075;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Lou;")
    public class567 field7079;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Lou;")
    public class567 field7087;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "S")
    public short field7081;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "Z")
    public boolean field7076;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Z")
    public boolean field7088;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Z")
    public boolean field7092;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public final void method3003(int arg0) {
        if (arg0 <= 13) {
            this.field7082 = null;
        }
        while (this.field7074 != null) {
            class436 var2 = this.field7074.field5485;
            this.field7074.method2398(735366030);
            this.field7074 = var2;
        }
        field7072++;
        this.field7086 = 0;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(III)V")
    public class565(int arg0, int arg1, int arg2) {
        this.field7090 = (short) arg2;
        this.field7083 = this.field7094 = (byte) arg0;
        this.field7091 = (short) arg1;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method3004(byte arg0) {
        int var1 = -29 / ((-arg0 - 75) / 33);
        field7071 = null;
    }
}
