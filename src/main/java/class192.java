import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class192 extends class242 {

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "[B")
    public static byte[] field3328;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Ljf;")
    public static class229 field3333;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[Lih;")
    public static class33[] field3334;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Ljf;")
    public class229 field3329;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lnf;")
    public class67 field3327;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Lnf;")
    public class67 field3332;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Z")
    public boolean field3326;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field3324;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method1314(int arg0, int arg1) {
        int var2 = -75 / ((arg1 - 62) / 43);
        field3335++;
        if (class146.field2544[arg0]) {
            return true;
        } else if (class318.field5378.method1257(arg0, (byte) 97)) {
            int var3 = class318.field5378.method1268(arg0, (byte) 109);
            if (var3 == 0) {
                class146.field2544[arg0] = true;
                return true;
            }
            if (class23.field423[arg0] == null) {
                class23.field423[arg0] = new class67[var3];
            }
            for (int var4 = 0; var4 < var3; var4++) {
                if (class23.field423[arg0][var4] == null) {
                    byte[] var5 = class318.field5378.method1275(var4, arg0, -5211);
                    if (var5 != null) {
                        class23.field423[arg0][var4] = new class67();
                        class23.field423[arg0][var4].field1247 = (arg0 << 16) + var4;
                        if (var5[0] == -1) {
                            class23.field423[arg0][var4].method501(-121, new class14(var5));
                        } else {
                            class23.field423[arg0][var4].method494(new class14(var5), -11618);
                        }
                    }
                }
            }
            class146.field2544[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 59)
    public static void method1315(int arg0) {
        if (arg0 > -27) {
            field3334 = (class33[]) null;
        }
        field3334 = null;
        field3333 = null;
        field3328 = null;
    }

    static {
        int var0 = 0;
        field3328 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3328[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3333 = class212.method1457((byte) 65, "W-=hlen Sie eine Option");
        field3334 = new class33[2048];
    }
}
