import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class79 extends class196 {

    @OriginalMember(owner = "client!b", name = "X", descriptor = "Lqh;")
    public static class189 field1260 = new class189(30);

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "[I")
    public static int[] field1262 = new int[2];

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "Z")
    public static boolean field1263 = false;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Lhc;")
    public static class212 field1265 = new class212(8);

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "F")
    public static float field1261;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "[I")
    public static int[] field1268;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "[[[I")
    public static int[][][] field1266;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V")
    public static final void method555(int arg0, int arg1) {
        class3.field16 = -1;
        class169.field2758 = arg1;
        class3.field16 = -1;
        if (arg0 != 30) {
            field1268 = null;
        }
        ++field1253;
        class120.method863(69);
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(B)V")
    public static void method556(byte arg0) {
        int var1 = -73 % ((arg0 - -11) / 43);
        field1260 = null;
        field1265 = null;
        field1266 = null;
        field1268 = null;
        field1262 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method557(Component arg0, byte arg1) {
        arg0.removeMouseListener(class42.field664);
        if (arg1 != 124) {
            method559((byte) 79);
        }
        arg0.removeMouseMotionListener(class42.field664);
        arg0.removeFocusListener(class42.field664);
        class139.field2330 = 0;
        ++field1259;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class79() {
        super(1, true);
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(II)I")
    public static final int method558(int arg0, int arg1) {
        ++field1258;
        int var2 = 70 / ((43 - arg1) / 47);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            field1261 = -1.5181714F;
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[][] var4 = this.method1387(21, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class49.field767 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        ++field1255;
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(B)I")
    public static final int method559(byte arg0) {
        int var1 = 104 % ((arg0 - -67) / 39);
        ++field1254;
        return class84.field1402;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)I")
    public static final int method560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1264;
        if (arg4 != -12684) {
            method556((byte) -44);
        }
        int var5 = -class73.field1167[arg0 * 1024 / arg1] + 65536 >> 1;
        return ((-var5 + 65536) * arg3 >> 16) + (arg2 * var5 >> 16);
    }
}
