import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class145 {

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "[I")
    public int[] field1134;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "[[I")
    public int[][] field1131;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Lqc;")
    public static class114 field1138 = new class114(4096);

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "[I")
    public static int[] field1143 = new int[1000];

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Lfc;")
    private static class39 field1144 = class90.method774("You need a members account to login to this world)3", -86);

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Lfc;")
    public static class39 field1142 = field1144;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "Lfc;")
    private static class39 field1150 = class90.method774("Malformed login packet)3", -121);

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "Lfc;")
    public static class39 field1148 = class90.method774(")4slr)3ws?order=LPWM", -80);

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field1147 = 0;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lfc;")
    public static class39 field1149 = field1150;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field1141 = 0;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "Lfc;")
    private static class39 field1154 = class90.method774("Examine", -79);

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Lfc;")
    public static class39 field1151 = field1154;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "J")
    public static long field1153 = 0L;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Llf;")
    public static class82 field1145;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Ljava/awt/Font;")
    public static Font field1139;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "Z")
    public static boolean field1140;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "[[I")
    public static int[][] field1152;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Loc;BII)Lb;", line = 4)
    public static final class8 method498(class100 arg0, byte arg1, int arg2, int arg3) {
        field1155++;
        if (class127.method1054(arg2, (byte) 0, arg3, arg0)) {
            int var4 = 72 / ((arg1 - 71) / 34);
            return class77.method676((byte) -67);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILoc;I)[Lue;", line = 17)
    public static final class141[] method499(int arg0, int arg1, class100 arg2, int arg3) {
        if (arg3 > -49) {
            field1141 = 36;
        }
        field1137++;
        return class127.method1054(arg0, (byte) 0, arg1, arg2) ? class118.method1021(6662) : null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I[B)V", line = 45)
    public class42(int arg0, byte[] arg1) {
        this.field1130 = arg0;
        class25 var3 = new class25(arg1);
        this.field1132 = var3.method322((byte) -50);
        this.field1134 = new int[this.field1132];
        this.field1131 = new int[this.field1132][];
        for (int var4 = 0; var4 < this.field1132; var4++) {
            this.field1134[var4] = var3.method322((byte) -50);
        }
        for (int var5 = 0; var5 < this.field1132; var5++) {
            this.field1131[var5] = new int[var3.method322((byte) -50)];
        }
        for (int var6 = 0; var6 < this.field1132; var6++) {
            for (int var7 = 0; var7 < this.field1131[var6].length; var7++) {
                this.field1131[var6][var7] = var3.method322((byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V", line = 100)
    public static final void method500(int arg0) {
        class68.field1626 = 0;
        class28.field801 = 0;
        class17.method209((byte) 114);
        field1133++;
        class26.method336((byte) -93);
        class98.method817(32);
        class44.method519(-128);
        for (int var1 = 0; var1 < class28.field801; var1++) {
            int var3 = class31.field871[var1];
            if (class70.field1654 != class101.field2525[var3].field2868) {
                class101.field2525[var3] = null;
            }
        }
        if (class128.field3275 != class39.field1065.field710) {
            throw new RuntimeException("gpp1 pos:" + class39.field1065.field710 + " psize:" + class128.field3275);
        }
        for (int var2 = arg0; var2 < class111.field2871; var2++) {
            if (class101.field2525[class31.field862[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class111.field2871);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 150)
    public static void method501(boolean arg0) {
        field1151 = null;
        field1148 = null;
        field1149 = null;
        if (arg0) {
            method500(-32);
        }
        field1139 = null;
        field1145 = null;
        field1138 = null;
        field1143 = null;
        field1150 = null;
        field1142 = null;
        field1144 = null;
        field1154 = null;
        field1152 = null;
    }
}
