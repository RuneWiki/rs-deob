import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class583 extends class189 {

    @OriginalMember(owner = "client!kha", name = "m", descriptor = "I")
    public static int field8208 = 0;

    @OriginalMember(owner = "client!kha", name = "o", descriptor = "[Z")
    public static boolean[] field8210 = new boolean[100];

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!kha", name = "p", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "J")
    public long field8207;

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "Lkha;")
    public class583 field8205;

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "Lkha;")
    public class583 field8206;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V", line = 13)
    public static void method3309(int arg0) {
        field8210 = null;
        if (arg0 != 0) {
            method3312(null, -73, 11, -96, null);
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)Z", line = 27)
    public final boolean method3310(byte arg0) {
        field8211++;
        if (this.field8205 == null) {
            return false;
        } else if (arg0 == 64) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V", line = 43)
    public final void method3311(int arg0) {
        field8209++;
        if (this.field8205 == null) {
            return;
        }
        if (arg0 != 100) {
            field8210 = null;
        }
        this.field8205.field8206 = this.field8206;
        this.field8206.field8205 = this.field8205;
        this.field8205 = null;
        this.field8206 = null;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lr;III[Z)Z", line = 62)
    public static final boolean method3312(class180 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class459.field6474 != class135.field1969) {
            int var6 = class588.field8292[arg1].method1815(arg3, arg2, 109);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class278 var8 = class588.field8292[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1815(arg3, arg2, 122);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1813(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1811(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
