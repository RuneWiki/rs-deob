import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class92 {

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1197 = 0;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Leh;")
    public class378 field1199;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lrf;")
    public class92 field1201;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([Lsf;II)V")
    public static final void method655(class547[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class547 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field7722;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field7722 > (var7 & 0x1) + var6) {
                class547 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method655(arg0, arg1, var4 - 1);
        method655(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Loha;")
    public final class771 method656(int arg0) {
        field1204++;
        if (arg0 != -19478) {
            this.method658(-73, false);
        }
        return class202.method1453(-128, this.field1206);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([SB)[S")
    public static final short[] method657(short[] arg0, byte arg1) {
        field1207++;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 67 / ((-arg1 - 46) / 51);
            short[] var3 = new short[arg0.length];
            class42.method287(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)Lrf;")
    public final class92 method658(int arg0, boolean arg1) {
        field1198++;
        return arg1 ? null : new class92(this.field1206, arg0);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V")
    public class92(int arg0, int arg1) {
        this.field1206 = arg0;
        this.field1196 = arg1;
    }
}
