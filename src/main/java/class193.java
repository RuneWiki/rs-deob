import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class193 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lli;")
    public class12 field3108;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3104 = 2;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lng;")
    public static final class73 method1385(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2814; var4++) {
            class73 var5 = var3.field2812[var4];
            if ((var5.field1278 >> 29 & 0x3L) == 2L && var5.field1270 == arg1 && var5.field1266 == arg2) {
                class81.method566(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IIII)V")
    public class193(int arg0, int arg1, int arg2, int arg3) {
        class12 var5 = class217.method1553(arg0, 31779);
        this.field3107 = arg1;
        this.field3106 = arg3;
        this.field3109 = arg2;
        if (var5.field248 == -1) {
            this.field3108 = var5;
        } else {
            this.field3108 = class217.method1553(var5.field248, 31779);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lli;III)V")
    public class193(class12 arg0, int arg1, int arg2, int arg3) {
        this.field3109 = arg2;
        this.field3108 = arg0;
        this.field3106 = arg3;
        this.field3107 = arg1;
    }
}
