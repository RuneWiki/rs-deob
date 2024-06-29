import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class82 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Ltj;")
    private class135 field1187;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "Lpr;")
    private class313 field1193;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "Lpp;")
    private class270 field1194;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "Lhp;")
    private class217 field1188;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "[Lkr;")
    private class528[] field1196;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIZII)V", line = 3)
    public static final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field1192++;
        class351.method2180(arg3, arg1, arg6, arg4, arg5, arg8, arg2, arg0, arg7, 0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILeo;IZLeo;)Lkr;", line = 11)
    private final class528 method689(int arg0, class196 arg1, int arg2, boolean arg3, class196 arg4) {
        field1197++;
        if (this.field1188 == null) {
            throw new RuntimeException();
        }
        this.field1188.field3556 = arg2 * 8 + 5;
        if (this.field1188.field3572.length <= this.field1188.field3556) {
            throw new RuntimeException();
        } else if (this.field1196[arg2] == null) {
            int var6 = this.field1188.method1556(98);
            int var7 = -87 / ((arg0 + 14) / 51);
            int var8 = this.field1188.method1556(123);
            class528 var9 = new class528(arg2, arg4, arg1, this.field1193, this.field1187, var6, var8, arg3);
            this.field1196[arg2] = var9;
            return var9;
        } else {
            return this.field1196[arg2];
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Leo;IBLeo;)Lkr;", line = 48)
    public final class528 method690(class196 arg0, int arg1, byte arg2, class196 arg3) {
        if (arg2 >= -48) {
            this.field1196 = null;
        }
        field1189++;
        return this.method689(104, arg3, arg1, true, arg0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V", line = 66)
    public final void method691(byte arg0) {
        if (arg0 > -35) {
            return;
        }
        field1190++;
        if (this.field1196 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1196.length; var2++) {
            if (this.field1196[var2] != null) {
                this.field1196[var2].method3124((byte) -124);
            }
        }
        for (int var3 = 0; var3 < this.field1196.length; var3++) {
            if (this.field1196[var3] != null) {
                this.field1196[var3].method3122((byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lpr;Ltj;)V", line = 106)
    public class82(class313 arg0, class135 arg1) {
        this.field1187 = arg1;
        this.field1193 = arg0;
        if (!this.field1193.method2005(0)) {
            this.field1194 = this.field1193.method2006(255, (byte) 0, true, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Z", line = 119)
    public final boolean method692(int arg0) {
        if (arg0 != 8) {
            return false;
        }
        field1191++;
        if (this.field1188 != null) {
            return true;
        }
        if (this.field1194 == null) {
            if (this.field1193.method2005(0)) {
                return false;
            }
            this.field1194 = this.field1193.method2006(255, (byte) 0, true, 255, (byte) 0);
        }
        if (this.field1194.field3927) {
            return false;
        } else {
            this.field1188 = new class217(this.field1194.method1718(true));
            this.field1196 = new class528[(this.field1188.field3572.length - 5) / 8];
            return true;
        }
    }
}
