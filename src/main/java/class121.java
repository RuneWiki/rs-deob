import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class121 extends class207 {

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "[I")
    public int[] field2349;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "[[I")
    public int[][] field2352;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "[Z")
    public boolean[] field2350;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Ljd;")
    public static class86 field2346 = class122.method868(":clanreq:", true);

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field2351 = 0;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[Lod;")
    public static class90[] field2343;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    public static final void method853(int arg0) {
        field2353++;
        class75.field1486.method703((byte) 122);
        class157.field2953.method703((byte) 122);
        class8.field260.method703((byte) 122);
        class255.field4528.method703((byte) 122);
        if (arg0 >= -4) {
            field2346 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
    public static final int method854(int arg0, int arg1) {
        int var2 = -116 % ((43 - arg1) / 63);
        field2344++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method855(boolean arg0) {
        field2343 = null;
        field2346 = null;
        if (arg0) {
            method857(-111);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lgj;I)V")
    public static final void method856(class224 arg0, int arg1) {
        field2348++;
        if (arg1 != 28120) {
            method853(-80);
        }
        class14 var2 = (class14) class149.field2774.method1698(arg0.field4029.method622(arg1 ^ 0xFFFF9226), (byte) 127);
        if (var2 == null) {
            class14.method105((class117) null, arg0.field705[0], 0, arg0, class180.field3244, false, (class170) null, arg0.field707[0]);
        } else {
            var2.method104((byte) -102);
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public static final void method857(int arg0) {
        class180.field3253 = arg0;
        for (int var1 = 0; var1 < class70.field1424; var1++) {
            for (int var2 = 0; var2 < class126.field2436; var2++) {
                if (class248.field4406[arg0][var1][var2] == null) {
                    class248.field4406[arg0][var1][var2] = new class249(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I[B)V")
    public class121(int arg0, byte[] arg1) {
        this.field2345 = arg0;
        class200 var3 = new class200(arg1);
        this.field2347 = var3.method1408((byte) -65);
        this.field2349 = new int[this.field2347];
        this.field2352 = new int[this.field2347][];
        this.field2350 = new boolean[this.field2347];
        for (int var4 = 0; var4 < this.field2347; var4++) {
            this.field2349[var4] = var3.method1408((byte) -118);
        }
        for (int var5 = 0; var5 < this.field2347; var5++) {
            this.field2350[var5] = var3.method1408((byte) -81) == 1;
        }
        for (int var6 = 0; var6 < this.field2347; var6++) {
            this.field2352[var6] = new int[var3.method1408((byte) -125)];
        }
        for (int var7 = 0; var7 < this.field2347; var7++) {
            for (int var8 = 0; var8 < this.field2352[var7].length; var8++) {
                this.field2352[var7][var8] = var3.method1408((byte) -59);
            }
        }
    }
}
