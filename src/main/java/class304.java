import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class304 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[C")
    public static char[] field4570 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[Z")
    public static boolean[] field4571 = new boolean[100];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4566 = 0;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[S")
    public static short[] field4567 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4572;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 11)
    public static final void method2071(int arg0) {
        field4574++;
        class90.field1264.method2238(71, (byte) -128);
        if (arg0 != -13658) {
            method2072(-33);
        }
        class234.field3321++;
        class90.field1264.method2184((byte) 89, class323.method2270(96));
        class90.field1264.method2189(-1, class187.field2592);
        class90.field1264.method2189(-1, class64.field836);
        class90.field1264.method2184((byte) 89, class239.field3394);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 31)
    public static void method2072(int arg0) {
        field4567 = null;
        field4570 = null;
        field4571 = null;
        int var1 = 115 % ((-arg0 - 48) / 59);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([BBLcg;)V", line = 45)
    public final void method2073(byte[] arg0, byte arg1, class316 arg2) {
        field4568++;
        if (arg2.field4798[arg2.field4777] != 31 || arg2.field4798[arg2.field4777 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4572 == null) {
            this.field4572 = new Inflater(true);
        }
        int var4 = -57 % ((-arg1 - 18) / 63);
        try {
            this.field4572.setInput(arg2.field4798, arg2.field4777 + 10, -arg2.field4777 - 10 + arg2.field4798.length + -8);
            this.field4572.inflate(arg0);
        } catch (Exception var6) {
            this.field4572.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4572.reset();
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(III)V", line = 74)
    private class304(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 96)
    public class304() {
        this(-1, 1000000, 1000000);
    }
}
