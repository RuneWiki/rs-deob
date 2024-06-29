import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class312 extends class42 {

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "[I")
    public static int[] field4109;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public int field4104;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4106;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "[I")
    public int[] field4108;

    static {
        new class304("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4109 = new int[32];
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 4)
    public static void method1808(int arg0) {
        if (arg0 != 17367) {
            field4109 = null;
        }
        field4109 = null;
        field4106 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([BI)[B", line = 18)
    public static final byte[] method1809(byte[] arg0, int arg1) {
        field4110++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class254.method1529(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)I", line = 40)
    public static final int method1810(int arg0, int arg1, int arg2, int arg3) {
        field4105++;
        if (arg2 == arg3) {
            return arg2;
        }
        if (arg0 != -15980) {
            method1808(-117);
        }
        int var4 = 128 - arg1;
        int var5 = (arg2 & 0x7F) * var4 + (arg3 & 0x7F) * arg1 >> 7;
        int var6 = (arg2 & 0x380) * var4 + (arg3 & 0x380) * arg1 >> 7;
        int var7 = (arg2 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg1 >> 7;
        return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method411(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method413(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method415(int arg0, int arg1, int arg2, Graphics arg3);
}
