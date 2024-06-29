import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class134 {

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    private int field162 = -1;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field164 = new String[] { method105(method104("Zr0Wq")), method105(method104("Ptr\u007f")), method105(method104("E/0=$")), method105(method104("Zr0Pq")), method105(method104("Zr0Rq")), method105(method104("Zr0Qq")) };

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lsca;I)V", line = 10)
    public final void method100(class47 arg0, int arg1) {
        try {
            arg0.method482(false, this.field162);
            field163++;
            if (arg1 > -81) {
                this.field162 = -91;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field164[3] + (arg0 == null ? field164[1] : field164[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V", line = 21)
    public static final void method101(byte arg0) {
        try {
            field160++;
            class309.field5029.method4429(72);
            if (arg0 == -3) {
                ;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field164[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILwq;)V", line = 34)
    public final void method102(int arg0, class176 arg1) {
        try {
            this.field162 = arg1.method1687((byte) -94);
            field159++;
            int var3 = 22 % ((83 - arg0) / 34);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field164[0] + arg0 + ',' + (arg1 == null ? field164[1] : field164[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 46)
    public static final void method103(byte arg0) {
        try {
            field161++;
            class196.field3117.method1197(1000);
            class15.field174.method5044(0);
            class392.field6245.method2708(58);
            class442.field6902.setBackground(Color.black);
            class75.field1096 = -1;
            class196.field3117 = class767.method5527(4, class442.field6902);
            if (arg0 >= -82) {
                method101((byte) -106);
            }
            class15.field174 = class57.method571(true, -37, class442.field6902);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field164[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method104(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method105(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
