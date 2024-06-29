import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class225 extends class179 {

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    private int field3911 = 0;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    private int field3912 = 4096;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "J")
    public static long field3914 = 0L;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "Lmf;")
    public static class174 field3916 = new class174(64);

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "[I")
    public static int[] field3917;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)I", line = 6)
    public static final int method1537(int arg0, boolean arg1) {
        if (arg1) {
            method1537(-75, true);
        }
        field3913++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 92)
    public class225() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I", line = 21)
    public final int[] method41(int arg0, int arg1) {
        int[] var3 = this.field3157.method1258(arg1 + 31547, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, arg0, (byte) -14);
            for (int var5 = 0; var5 < class161.field2858; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field3911 <= var6 && var6 <= this.field3912 ? 4096 : 0;
            }
        }
        if (arg1 != -31598) {
            field3916 = (class174) null;
        }
        field3918++;
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILra;I)V", line = 56)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 <= 108) {
            return;
        }
        if (arg2 == 0) {
            this.field3911 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field3912 = arg1.method346(-16);
        }
        field3915++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 106)
    public static void method1538(boolean arg0) {
        if (!arg0) {
            field3920 = -120;
        }
        field3917 = null;
        field3916 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 121)
    public static final void method1539(String arg0, int arg1) {
        field3919++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg1);
    }
}
