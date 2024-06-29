import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class66 extends class224 {

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "Z")
    public boolean field1195;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "J")
    public long field1194;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "Z")
    public boolean field1202;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "J")
    public long field1193;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Z")
    public boolean field1196;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Ljava/lang/String;")
    public String field1192;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Ljava/lang/String;")
    public String field1187;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field1197 = 0;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Lqe;")
    public static class465 field1185 = new class465(118, 2);

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "Ldm;")
    public static class50 field1201 = null;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "F")
    public static float field1188;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Lqo;")
    public static class22 field1181;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Ljava/lang/String;")
    public String field1182;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static final void method694(int arg0) {
        field1186++;
        if (arg0 != 28633) {
            field1197 = 76;
        }
        class167.field2461.method1535(-2);
        class422.field5917.method1591((byte) 2);
        class345.field4858.method1945((byte) 2);
        class567.field8085.setBackground(Color.black);
        class173.field2510 = -1;
        class167.field2461 = class488.method2938(class567.field8085, (byte) 106);
        class422.field5917 = class488.method2933((byte) 70, class567.field8085, true);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static void method695(byte arg0) {
        field1185 = null;
        int var1 = 31 / ((-arg0 - 68) / 39);
        field1181 = null;
        field1201 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Llda;")
    public static final class483 method696(int arg0, byte arg1) {
        field1184++;
        if (class657.field9249 && arg0 >= class453.field6399 && arg0 <= field1199) {
            if (arg1 >= -81) {
                field1181 = null;
            }
            return class200.field2874[arg0 - class453.field6399];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZBLha;)Lda;")
    public static final class59 method697(int arg0, boolean arg1, byte arg2, class58 arg3) {
        if (arg2 == -11) {
            field1190++;
            class435 var4 = class701.method3939((byte) -21, arg3, arg0, arg1);
            return var4 == null ? null : var4.field6081;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class66(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field1198 = arg3;
        this.field1195 = arg8;
        this.field1189 = arg7;
        this.field1194 = arg5;
        this.field1200 = arg6;
        this.field1202 = arg11;
        this.field1191 = arg4;
        this.field1183 = arg2;
        this.field1193 = arg10;
        this.field1196 = arg9;
        this.field1192 = arg1;
        this.field1187 = arg0;
    }
}
