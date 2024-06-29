import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class447 extends class394 implements class69 {

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "[I")
    public static int[] field6011 = new int[500];

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lhj;")
    public static class596 field6014 = new class596(63, 1);

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Llja;")
    public static class744 field6016 = new class744(25, 0);

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lhj;")
    public static class596 field6018 = new class596(114, 1);

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLjava/lang/String;)I", line = 3)
    public static final int method2634(byte arg0, String arg1) {
        ++field6012;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            var3 = class61.method526(arg1.charAt(var4), (byte) -102) + ((var3 << 5) - var3);
        }
        if (arg0 != 54) {
            method2635((byte) 102);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V", line = 26)
    public static void method2635(byte arg0) {
        int var1 = -67 % ((arg0 - -55) / 50);
        field6016 = null;
        field6014 = null;
        field6018 = null;
        field6011 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILiha;)V", line = 41)
    public static final void method2636(int arg0, class32 arg1) {
        if (arg0 != -7) {
            method2637(96, (byte) -9);
        }
        ++field6015;
        class37.field548 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lnv;IZ[[I)V", line = 59)
    public class447(class439 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class141.field1759, class748.field10384, arg1 * arg1 * 6, arg2);
        super.field5105.method2643(-2, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method2317(var5 + 34069, arg1, arg3[var5], -22784, arg1);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method2311(-588507160), arg1, arg1, 0, class563.method3265((byte) -126, super.field5099), super.field5105.field5891, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V", line = 104)
    public static final void method2637(int arg0, byte arg1) {
        class392.field5078 = 1000000000L / (long) arg0;
        if (arg1 == 58) {
            ++field6017;
        }
    }
}
