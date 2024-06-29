import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class310 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
    public static int[] field4249 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
    public static int[] field4248;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[S")
    public static short[] field4250;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method1997(byte arg0) {
        if (arg0 != -76) {
            method1998((class11) null, 40);
        }
        field4250 = null;
        field4248 = null;
        field4249 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lkh;I)V")
    public static final void method1998(class11 arg0, int arg1) {
        field4251++;
        if (arg1 != 2148) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class73.field1042 != null) {
            try {
                class73.field1042.method967((byte) -101, 0L);
                class73.field1042.method966((byte) 5, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method213(var2, 113, 24, 0);
    }

    static {
        new class442("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4252 = 0;
        field4253 = 0;
    }
}
