import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class64 {

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "[Lfe;")
    public class41[] field2;

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "[I")
    public static int[] field7 = new int[99];

    @OriginalMember(owner = "client!a", name = "hb", descriptor = "Lrd;")
    public static class114 field9;

    @OriginalMember(owner = "client!a", name = "jb", descriptor = "Z")
    public static boolean field11;

    @OriginalMember(owner = "client!a", name = "kb", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "lb", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "ib", descriptor = "Lrd;")
    public static class114 field10;

    @OriginalMember(owner = "client!a", name = "nb", descriptor = "[I")
    public static int[] field15;

    @OriginalMember(owner = "client!a", name = "ob", descriptor = "Lrd;")
    public static class114 field16;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "mb", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "db", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "[[[B")
    public static byte[][][] field8;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
    public static final boolean method1(int arg0, int arg1) {
        field6++;
        if (class74.field1713[arg1]) {
            return true;
        } else if (class31.field642.method754((byte) 53, arg1)) {
            int var2 = class31.field642.method768(arg1, false);
            if (var2 == 0) {
                class74.field1713[arg1] = true;
                return true;
            }
            if (class78.field1772[arg1] == null) {
                class78.field1772[arg1] = new class90[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class78.field1772[arg1][var3] == null) {
                    byte[] var4 = class31.field642.method762(arg1, var3, (byte) 66);
                    if (var4 != null) {
                        class78.field1772[arg1][var3] = new class90();
                        class78.field1772[arg1][var3].field2060 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class78.field1772[arg1][var3].method689((byte) -87, new class60(var4));
                        } else {
                            class78.field1772[arg1][var3].method698(new class60(var4), 16959);
                        }
                    }
                }
            }
            class74.field1713[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lrd;")
    public static final class114 method2(int arg0, int arg1) {
        field1++;
        if (arg1 < 100000) {
            return class14.method113(arg1, -31766);
        } else {
            if (arg0 != 65280) {
                field9 = null;
            }
            return arg1 < 10000000 ? class101.method786((byte) 125, new class114[] { class14.method113(arg1 / 1000, arg0 ^ 0xFFFF7CEA), class36.field763 }) : class101.method786((byte) 127, new class114[] { class14.method113(arg1 / 1000000, arg0 - 97046), class5.field56 });
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Z")
    public final boolean method3(int arg0, int arg1) {
        if (arg1 == 2) {
            field4++;
            return this.field2[arg0].field838;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(II)Z")
    public static final boolean method4(int arg0, int arg1) {
        field5++;
        if (arg1 != 1073340130) {
            field12 = -61;
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lpb;Lpb;IZ)V")
    public class1(class100 arg0, class100 arg1, int arg2, boolean arg3) {
        class84 var5 = new class84();
        int var6 = arg0.method768(arg2, false);
        this.field2 = new class41[var6];
        int[] var7 = arg0.method751(arg2, false);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method762(arg2, var7[var8], (byte) 66);
            class56 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class56 var12 = (class56) var5.method654((byte) 24); var12 != null; var12 = (class56) var5.method644((byte) -68)) {
                if (var12.field1174 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method774(0, -1, var11);
                } else {
                    var13 = arg1.method774(var11, -1, 0);
                }
                var10 = new class56(var11, var13);
                var5.method645(var10, (byte) -40);
            }
            this.field2[var7[var8]] = new class41(var9, var10);
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
    public static void method5(int arg0) {
        field9 = null;
        field10 = null;
        field15 = null;
        field16 = null;
        field7 = null;
        if (arg0 != 16711680) {
            field9 = null;
        }
        field8 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field7[var1] = var0 / 4;
        }
        field9 = class84.method656("Chat panel redrawn", (byte) 125);
        field11 = false;
        field12 = 2;
        field13 = 0;
        field10 = class84.method656("headicons_pk", (byte) 122);
        field15 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field16 = class84.method656("Ladevorgang )2 bitte warten Sie)3", (byte) 121);
    }
}
