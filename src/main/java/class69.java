import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class69 extends class349 {

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public static final void method532(String arg0, int arg1) {
        field1285++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(III)V", line = 16)
    public final void method213(int arg0, int arg1, int arg2) {
        field1284++;
        if (arg2 != 13258) {
            method532((String) null, -117);
        }
        int var4 = this.field1276 * arg0 >> 12;
        int var5 = this.field1282 * arg1 >> 12;
        int var6 = this.field1278 * arg0 >> 12;
        int var7 = this.field1283 * arg1 >> 12;
        class86.method655(var5, var7, this.field5585, var4, var6, 4357);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIII)V", line = 49)
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1283 = arg3;
        this.field1278 = arg2;
        this.field1276 = arg0;
        this.field1282 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(III)V", line = 62)
    public final void method215(int arg0, int arg1, int arg2) {
        if (arg0 != -1664663732) {
            this.field1283 = -114;
        }
        field1279++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V", line = 72)
    public final void method210(int arg0, int arg1, int arg2) {
        field1281++;
        int var4 = this.field1276 * arg1 >> 12;
        int var5 = this.field1278 * arg1 >> 12;
        if (arg0 == 12459) {
            int var6 = this.field1282 * arg2 >> 12;
            int var7 = this.field1283 * arg2 >> 12;
            class272.method1920(var7, this.field5585, this.field5583, var4, this.field5589, var5, var6, 2);
        }
    }
}
