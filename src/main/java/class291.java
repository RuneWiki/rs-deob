import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class291 extends class24 {

    @OriginalMember(owner = "client!vja", name = "B", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!vja", name = "w", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!vja", name = "x", descriptor = "I")
    private int field4253;

    @OriginalMember(owner = "client!vja", name = "y", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!vja", name = "A", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!vja", name = "D", descriptor = "I")
    private int field4258;

    @OriginalMember(owner = "client!vja", name = "F", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IILvq;)V", line = 3)
    public static final void method1842(int arg0, int arg1, class489 arg2) {
        field4254++;
        if (class393.field5800 >= 50 || arg2 == null || arg2.field6779 == null || arg1 >= arg2.field6779.length || arg2.field6779[arg1] == null) {
            return;
        }
        int var3 = arg2.field6779[arg1][arg0];
        int var4 = var3 >> 8;
        int var5 = var3 >> 5 & 0x7;
        if (arg2.field6779[arg1].length > 1) {
            int var6 = (int) (Math.random() * (double) arg2.field6779[arg1].length);
            if (var6 > 0) {
                var4 = arg2.field6779[arg1][var6];
            }
        }
        int var7 = 256;
        if (arg2.field6793 != null && arg2.field6771 != null) {
            var7 = class791.method4363(arg2.field6793[arg1], arg2.field6771[arg1], 2);
        }
        if (arg2.field6782) {
            class642.method3567(false, 0, var5, 99, var4, 255, var7);
        } else {
            class87.method715(255, var4, 0, var5, var7, arg0 ^ 0xAC8);
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(ILjp;)V", line = 48)
    public final void method191(int arg0, class376 arg1) {
        field4256++;
        this.field4253 = arg1.method2384(68);
        this.field4258 = arg1.method2384(102);
        if (arg0 >= -56) {
            this.field4253 = -110;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lke;I)V", line = 60)
    public final void method190(class625 arg0, int arg1) {
        if (arg1 == 5) {
            arg0.method3422(this.field4253, 14500, this.field4258);
            field4252++;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)V", line = 72)
    public static final void method1843(int arg0) {
        if (class162.field2211 != null) {
            class162.field2211.method470((byte) 69);
            class664.field9178 = null;
            class162.field2211 = null;
        }
        if (arg0 <= 47) {
            method1842(-12, -26, null);
        }
        field4255++;
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(III)Z", line = 102)
    public static final boolean method1844(int arg0, int arg1, int arg2) {
        field4259++;
        if (arg1 != 0) {
            field4257 = -43;
        }
        if (class717.method4004(arg0, (byte) -1, arg2)) {
            return (arg2 & 0xB000) != 0 | class162.method1181(arg0, arg2, true) | class485.method2819(arg0, (byte) 22, arg2) ? true : (arg0 & 0x37) == 0 & (class481.method2801(arg2, arg1 ^ 0xFFFFFDDF, arg0) | class515.method2992(11816, arg2, arg0));
        } else {
            return false;
        }
    }
}
