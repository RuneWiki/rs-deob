import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class775 extends class348 {

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field11054;

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11057 = new String[] { method5584(method5583("|K\u001d'IdWG%\b")), method5584(method5583("|K\u001dY\b")) };

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field11055;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
    public static int field11056;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 5)
    public final void method5582(int arg0) {
        try {
            field11055++;
            this.field11054.method3188();
            if (arg0 <= 10) {
                this.method5582(84);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11057[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V", line = 16)
    public class775(int arg0) {
        try {
            this.field11054 = new NativeHeap(arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11057[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5583(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5584(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 32;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
