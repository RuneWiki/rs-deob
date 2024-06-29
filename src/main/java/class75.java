import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class75 extends class202 {

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Laf;")
    public static class68 field1208 = new class68(2);

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field1214 = 0;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static final void method525(int arg0) {
        int var1 = -67 / ((arg0 - 52) / 51);
        field1207++;
        if (class85.field1352 == 5) {
            class85.field1352 = 6;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
    public static final void method526(byte arg0, int arg1) {
        class64.field1065.method476(false, arg1);
        field1206++;
        class133.field2122.method476(false, arg1);
        if (arg0 > -40) {
            method525(-109);
        }
        class39.field742.method476(false, arg1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method527(byte arg0) {
        field1208 = null;
        if (arg0 != 123) {
            method527((byte) 93);
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
    public class75(int arg0, int arg1) {
        this.field1210 = arg0;
        this.field1209 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIB)V")
    public static final void method528(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var8 = arg1 + 1;
        class56.method420(class29.field452[arg1], arg2, -7, arg4, arg0);
        int var9 = arg3 - 1;
        class56.method420(class29.field452[arg3], arg2, -7, arg4, arg0);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class29.field452[var6];
            var7[arg4] = var7[arg0] = arg2;
        }
        if (arg5 != -12) {
            field1212 = 5;
        }
        field1211++;
    }
}
