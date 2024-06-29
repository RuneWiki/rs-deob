import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class101 extends class6 {

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "Z")
    public static boolean field1195 = true;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1196 = "Loaded update list";

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "[B")
    private byte[] field1191;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "[Z")
    public static boolean[] field1193;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIFFF)V", line = 14)
    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1194 = (int) (arg7 * 4096.0F);
        this.field1183 = (int) (arg6 * 4096.0F);
        this.field1181 = this.field1186 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 24)
    public final void method29(int arg0) {
        field1192++;
        this.field1189 = arg0;
        this.field1180 = 0;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 33)
    public static void method542(int arg0) {
        field1196 = null;
        field1193 = null;
        if (arg0 <= 35) {
            method542(-122);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBI)V", line = 44)
    public final void method23(int arg0, byte arg1, int arg2) {
        int var4 = 10 % ((arg1 - 1) / 56);
        if (arg0 == 0) {
            this.field1199 = this.field1183 - (arg2 >= 0 ? arg2 : -arg2);
            this.field1199 = this.field1199 * this.field1199 >> 12;
            this.field1187 = 4096;
            this.field1180 = this.field1199;
        } else {
            this.field1187 = this.field1199 * this.field1194 >> 12;
            this.field1199 = this.field1183 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field1187 < 0) {
                this.field1187 = 0;
            } else if (this.field1187 > 4096) {
                this.field1187 = 4096;
            }
            this.field1199 = this.field1199 * this.field1199 >> 12;
            this.field1199 = this.field1199 * this.field1187 >> 12;
            this.field1180 += this.field1199 * this.field1181 >> 12;
            this.field1181 = this.field1186 * this.field1181 >> 12;
        }
        field1197++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 91)
    public final void method24(int arg0) {
        this.field1181 = this.field1186;
        this.field1180 >>= 0x4;
        field1185++;
        if (this.field1180 < 0) {
            this.field1180 = 0;
        } else if (this.field1180 > 255) {
            this.field1180 = 255;
        }
        this.method543(this.field1189++, (byte) this.field1180);
        this.field1180 = 0;
        if (arg0 != 25020) {
            this.method29(19);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)V", line = 121)
    public void method543(int arg0, byte arg1) {
        field1184++;
        this.field1191[arg0] = arg1;
    }
}
