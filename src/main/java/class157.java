import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class157 {

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "Lhp;")
    private class277 field1947 = new class277(64);

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "Lkea;")
    private class203 field1944;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "Lig;")
    public static class206 field1943 = new class206(60, -1);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BC)C")
    public static final char method907(byte arg0, char arg1) {
        field1940++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg0 < 21) {
            return 'C';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public static void method908(int arg0) {
        field1943 = null;
        if (arg0 != 159677890) {
            field1941 = -71;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II[BIIIIB[B)V")
    public static final void method909(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, byte[] arg8) {
        field1945++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg8[var10001] += arg2[arg1++];
                int var14 = arg6++;
                arg8[var14] += arg2[arg1++];
                int var15 = arg6++;
                arg8[var15] += arg2[arg1++];
                int var16 = arg6++;
                arg8[var16] += arg2[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg8[var10001] += arg2[arg1++];
            }
            arg6 += arg0;
            arg1 += arg3;
        }
        if (arg7 != 4) {
            field1941 = 66;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)Lnm;")
    public final class408 method910(byte arg0, int arg1) {
        field1946++;
        class277 var3 = this.field1947;
        class408 var4;
        synchronized (this.field1947) {
            var4 = (class408) this.field1947.method1801(0, (long) arg1);
        }
        if (arg0 >= -88) {
            return null;
        } else if (var4 == null) {
            class203 var5 = this.field1944;
            byte[] var6;
            synchronized (this.field1944) {
                var6 = this.field1944.method1286(arg1, 19, (byte) -49);
            }
            class408 var7 = new class408();
            if (var6 != null) {
                var7.method2586(-1, new class194(var6));
            }
            class277 var8 = this.field1947;
            synchronized (this.field1947) {
                this.field1947.method1808((long) arg1, var7, (byte) -110);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)Lhh;")
    public static final class111 method911(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        return var3 == null || var3.field1174 == null ? null : var3.field1174;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lcda;ILkea;)V")
    public class157(class149 arg0, int arg1, class203 arg2) {
        this.field1944 = arg2;
        this.field1942 = this.field1944.method1309(1675886592, 19);
    }

    static {
        new class474("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
