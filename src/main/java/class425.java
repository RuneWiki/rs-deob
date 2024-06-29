import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class425 extends class739 {

    @OriginalMember(owner = "client!lha", name = "C", descriptor = "I")
    private int field6149;

    @OriginalMember(owner = "client!lha", name = "B", descriptor = "I")
    public static int field6148 = 2;

    @OriginalMember(owner = "client!lha", name = "D", descriptor = "[I")
    public static int[] field6150 = new int[3];

    @OriginalMember(owner = "client!lha", name = "z", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!lha", name = "E", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!lha", name = "F", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!lha", name = "A", descriptor = "Lcl;")
    public static class744 field6147;

    @OriginalMember(owner = "client!lha", name = "b", descriptor = "(B)V", line = 4)
    public static void method2644(byte arg0) {
        field6147 = null;
        if (arg0 != -62) {
            method2644((byte) 92);
        }
        field6150 = null;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lsl;IB)V", line = 25)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 == 1) {
            if (arg1 == 0) {
                this.field6149 = (arg0.method2886(true) << 12) / 255;
            }
            ++field6151;
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "([[SB[[F)[[S", line = 52)
    public static final short[][] method2645(short[][] arg0, byte arg1, float[][] arg2) {
        ++field6146;
        if (arg1 != -87) {
            field6150 = null;
        }
        for (int var3 = 0; var3 < arg2.length; ++var3) {
            for (int var4 = 0; ~arg0[var3].length < ~var4; ++var4) {
                arg0[var3][var4] = (short) ((int) (arg2[var3][var4] * 16383.0F));
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V", line = 82)
    public class425() {
        this(4096);
    }

    @OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(I)V", line = 111)
    public class425(int arg0) {
        super(0, true);
        this.field6149 = 4096;
        this.field6149 = arg0;
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(ZI)[I", line = 89)
    public final int[] method445(boolean arg0, int arg1) {
        ++field6152;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field10317.field2170) {
                class85.method685(var3, 0, class399.field5703, this.field6149);
            }
            return var3;
        }
    }
}
