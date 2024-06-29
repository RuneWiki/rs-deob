import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class19 extends class12 {

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field198 = 0;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field199 = new String[100];

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "Lsg;")
    public static class226 field200 = new class226(0, 0);

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "Z")
    public static boolean field203 = false;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field204 = -1;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "Lfs;")
    public class330 field189;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "[Lue;")
    public class127[] field197;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "[[[Ldn;")
    public static class302[][][] field202;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Frame;Lam;B)V")
    public static final void method132(Frame arg0, class378 arg1, byte arg2) {
        while (true) {
            class241 var3 = arg1.method2381(0, arg0);
            while (var3.field3268 == 0) {
                class278.method1757(10L, 0);
            }
            if (var3.field3268 == 1) {
                field196++;
                arg0.setVisible(false);
                arg0.dispose();
                int var4 = -35 % ((-arg2 - 69) / 38);
                return;
            }
            class278.method1757(100L, 0);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
    public static void method133(boolean arg0) {
        if (arg0) {
            method132((Frame) null, (class378) null, (byte) -29);
        }
        field200 = null;
        field199 = null;
        field202 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILen;B)Z")
    public final boolean method134(int arg0, int arg1, class174 arg2, byte arg3) {
        field191++;
        if (this.field197 != null) {
            for (int var5 = 0; var5 < this.field197.length; var5++) {
                if (this.field197[var5].method777(arg0, arg1) && this.field189.method208(arg0, arg1, true, arg2)) {
                    return true;
                }
            }
        }
        if (arg3 != -72) {
            method133(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)I")
    public static final int method135(int arg0, int arg1, byte arg2) {
        field201++;
        if (arg0 == 1 || arg0 == 3) {
            return class375.field5488[arg1 & 0x3];
        } else {
            int var3 = 102 % ((arg2 - 35) / 62);
            return class139.field1978[arg1 & 0x3];
        }
    }
}
