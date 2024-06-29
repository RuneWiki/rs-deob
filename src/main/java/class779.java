import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class779 extends class262 {

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[Lim;")
    public class435[] field10716;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field10713;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field10714;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field10715;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field10717;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V", line = 7)
    public static final void method4291(int arg0, int arg1) {
        if (arg1 == 0) {
            field10714++;
            class17 var2 = class245.method1634(1, (long) arg0, 12);
            var2.method69(13);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 20)
    public static final void method4292(byte arg0) {
        field10717++;
        if (arg0 <= 112) {
            return;
        }
        for (int var1 = 0; var1 < class70.field770; var1++) {
            class22 var2 = class7.field40[var1];
            if (var2.field185 == 3) {
                if (var2.field195 == null) {
                    var2.field196 = Integer.MIN_VALUE;
                } else {
                    class44.field468.method2512(var2.field195);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([S[Ljava/lang/String;I)V", line = 50)
    public static final void method4293(short[] arg0, String[] arg1, int arg2) {
        if (arg2 != Integer.MIN_VALUE) {
            method4294(5, (byte) 70, -92, -96, 96);
        }
        class144.method956(arg0, 2, arg1, arg1.length - 1, 0);
        field10713++;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([Lim;)V", line = 60)
    public class779(class435[] arg0) {
        this.field10716 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIII)V", line = 70)
    public static final void method4294(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class177.field2236 <= arg4 && class627.field8783 >= arg4) {
            int var5 = class436.method2621(arg0, class474.field6576, class727.field10060, 512);
            int var6 = class436.method2621(arg2, class474.field6576, class727.field10060, 512);
            class378.method2366(var5, arg1 ^ 0x2, var6, arg3, arg4);
        }
        if (arg1 != 37) {
            method4294(-63, (byte) -11, 65, 8, -44);
        }
        field10715++;
    }
}
