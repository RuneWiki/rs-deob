import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class567 implements class169 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public int field8293;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field8300;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "Lvn;")
    public class186 field8302;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public int field8301;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public int field8291;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field8295;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lmf;")
    public class409 field8299;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public int field8294;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field8297;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Ldc;")
    public static class303 field8292 = new class303(13, 0, 1, 0);

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 3)
    public static void method3315(int arg0) {
        if (arg0 >= -112) {
            method3315(31);
        }
        field8292 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLej;)V", line = 24)
    public static final void method3316(byte arg0, class690 arg1) {
        field8298++;
        arg1.field9786 = null;
        int var2 = arg1.field9788.length;
        int var3 = 0;
        if (arg0 > -14) {
            method3315(72);
        }
        while (var2 > var3) {
            arg1.field9788[var3].field4209 = false;
            var3++;
        }
        class565[] var4 = client.field1378;
        synchronized (client.field1378) {
            if (var2 < client.field1378.length && class508.field7566[var2] < 200) {
                client.field1378[var2].method3307(0, arg1);
                int var10002 = class508.field7566[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Lkq;", line = 55)
    public class696 method726(int arg0) {
        field8296++;
        return arg0 == -17 ? null : null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lvn;Lmf;IIIIIII)V", line = 71)
    public class567(class186 arg0, class409 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field8293 = arg6;
        this.field8300 = arg4;
        this.field8302 = arg0;
        this.field8301 = arg2;
        this.field8291 = arg5;
        this.field8295 = arg3;
        this.field8299 = arg1;
        this.field8294 = arg7;
        this.field8297 = arg8;
    }
}
