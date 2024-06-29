import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class57 extends class23 {

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    private int field1085 = 204;

    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "I")
    private int field1093 = 1;

    @OriginalMember(owner = "client!qk", name = "ib", descriptor = "I")
    private int field1095 = 1;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "Lqd;")
    public static class40 field1087 = class147.method1106(" )2> ", (byte) -121);

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "Lqd;")
    private static class40 field1086 = class147.method1106("skill: ", (byte) -48);

    @OriginalMember(owner = "client!qk", name = "kb", descriptor = "Lqd;")
    public static class40 field1097 = field1086;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!qk", name = "fb", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!qk", name = "hb", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!qk", name = "jb", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 80)
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILsd;)V", line = 25)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            this.field1095 = arg2.method226(arg1 ^ 0xFF);
        } else if (arg0 == 1) {
            this.field1093 = arg2.method226(255);
        } else if (arg0 == 2) {
            this.field1085 = arg2.method197(arg1 - 1);
        }
        if (arg1 != 0) {
            method480(false, 4, 90);
        }
        field1092++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZII)V", line = 85)
    public static final void method480(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        field1094++;
        if (class52.field1007 != arg2) {
            class315.field5345 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class315.field5345[var3] = (var3 << 12) / arg2;
            }
            class6.field92 = arg2 - 1;
            class139.field2356 = arg2 == 64 ? 2048 : 4096;
            class52.field1007 = arg2;
        }
        if (class271.field4497 == arg1) {
            return;
        }
        if (class52.field1007 == arg1) {
            class150.field2509 = class315.field5345;
        } else {
            class150.field2509 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class150.field2509[var4] = (var4 << 12) / arg1;
            }
        }
        class212.field3384 = arg1 - 1;
        class271.field4497 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)[I", line = 136)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            this.method23(109, -95, (class26) null);
        }
        int[] var3 = this.field403.method724((byte) 82, arg1);
        field1091++;
        if (this.field403.field1760) {
            for (int var4 = 0; var4 < class52.field1007; var4++) {
                int var5 = class315.field5345[var4];
                int var6 = class150.field2509[arg1];
                int var7 = this.field1095 * var5 >> 12;
                int var8 = this.field1093 * var6 >> 12;
                int var9 = var6 % (4096 / this.field1093) * this.field1093;
                int var10 = var5 % (4096 / this.field1095) * this.field1095;
                if (this.field1085 > var9) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field1085 > var10) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var10 < this.field1085) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V", line = 224)
    public static void method481(int arg0) {
        if (arg0 != 31791) {
            method481(92);
        }
        field1087 = null;
        field1086 = null;
        field1097 = null;
    }
}
