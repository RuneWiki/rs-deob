import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class58 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "[Ljd;")
    public class86[] field1170;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "[B")
    public byte[] field1174;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "[I")
    public int[] field1181;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[S")
    public short[] field1182;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "[S")
    public short[] field1179;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[[B")
    public static byte[][] field1176 = new byte[50][];

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[[I")
    public static int[][] field1172 = new int[104][104];

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lbj;Lbj;Z)I")
    public static final int method420(class151 arg0, class151 arg1, boolean arg2) {
        int var3 = 0;
        field1171++;
        if (arg1.method1096(-52, class93.field1884)) {
            var3++;
        }
        if (arg2) {
            method423((class86) null, false, 26, (class86) null);
        }
        if (arg1.method1096(-89, class132.field2505)) {
            var3++;
        }
        if (arg1.method1096(-86, class78.field1531)) {
            var3++;
        }
        if (arg0.method1096(-67, class93.field1884)) {
            var3++;
        }
        if (arg0.method1096(-40, class132.field2505)) {
            var3++;
        }
        if (arg0.method1096(-8, class78.field1531)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method421(boolean arg0) {
        if (!arg0) {
            field1176 = null;
        }
        field1176 = null;
        field1172 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
    public final int method422(int arg0, int arg1) {
        field1178++;
        if (arg0 < 81) {
            method421(false);
        }
        return this.field1174[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljd;ZILjd;)V")
    public static final void method423(class86 arg0, boolean arg1, int arg2, class86 arg3) {
        class9.method58(-1, (class86) null, arg3, (byte) -117, arg0, arg2);
        if (arg1) {
            method423((class86) null, false, 60, (class86) null);
        }
        field1175++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)Z")
    public final boolean method424(boolean arg0, int arg1) {
        if (arg0) {
            this.method422(-126, -125);
        }
        field1180++;
        return (this.field1174[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
    public class58(int arg0) {
        this.field1177 = arg0;
        this.field1170 = new class86[this.field1177];
        this.field1174 = new byte[this.field1177];
        this.field1181 = new int[this.field1177];
        this.field1182 = new short[this.field1177];
        this.field1179 = new short[this.field1177];
    }
}
