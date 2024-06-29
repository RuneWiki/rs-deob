import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class313 extends class262 {

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
    private int field5348 = -1;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field5337 = -1;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lok;")
    public static class146 field5343 = class235.method1724(-12908, "S-Blectionner");

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "Lok;")
    public static class146 field5346 = class235.method1724(-12908, "leuchten3:");

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lok;")
    private static class146 field5338 = class235.method1724(-12908, "green:");

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "Lok;")
    public static class146 field5349 = field5338;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Lok;")
    public static class146 field5330 = field5338;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5334 = new CRC32();

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "I")
    public static int field5350 = 0;

    @OriginalMember(owner = "client!dg", name = "nb", descriptor = "Lok;")
    public static class146 field5351 = class235.method1724(-12908, ")4p=");

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    private int field5336;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
    private int field5345;

    @OriginalMember(owner = "client!dg", name = "ob", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "Loh;")
    public static class15 field5329;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "Loh;")
    public static class15 field5333;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[I")
    private int[] field5328;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "[I")
    public static int[] field5347;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "[S")
    public static short[] field5332;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[[I", line = 6)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != 7) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4347.method536(arg1, 4096);
        field5344++;
        if (this.field4347.field1202 && this.method2194(4476)) {
            int[] var4 = var3[1];
            int var5 = this.field5345 * (class104.field1676 == this.field5336 ? arg1 : this.field5336 * arg1 / class104.field1676);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class98.field1598 == this.field5345) {
                for (int var8 = 0; var8 < class98.field1598; var8++) {
                    int var9 = this.field5328[var5++];
                    var7[var8] = class82.method582(var9, 255) << 4;
                    var4[var8] = class82.method582(65280, var9) >> 4;
                    var6[var8] = class82.method582(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class98.field1598; var10++) {
                    int var11 = this.field5345 * var10 / class98.field1598;
                    int var12 = this.field5328[var5 + var11];
                    var7[var10] = class82.method582(var12 << 4, 4080);
                    var4[var10] = class82.method582(4080, var12 >> 4);
                    var6[var10] = class82.method582(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V", line = 74)
    public static void method2193(byte arg0) {
        field5334 = null;
        field5351 = null;
        field5346 = null;
        if (arg0 >= -79) {
            field5330 = (class146) null;
        }
        field5347 = null;
        field5332 = null;
        field5343 = null;
        field5330 = null;
        field5349 = null;
        field5329 = null;
        field5338 = null;
        field5333 = null;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)Z", line = 94)
    private final boolean method2194(int arg0) {
        field5340++;
        if (this.field5328 != null) {
            return true;
        }
        if (arg0 != 4476) {
            this.field5345 = 32;
        }
        if (this.field5348 < 0) {
            return false;
        }
        int var2 = class98.field1598;
        int var3 = class104.field1676;
        int var4 = class202.field3370.method834(this.field5348, 0) ? 64 : 128;
        this.field5328 = class202.field3370.method827(this.field5348, -31859);
        this.field5345 = var4;
        this.field5336 = var4;
        class206.method1560(var3, (byte) 96, var2);
        return this.field5328 != null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILok;I)V", line = 139)
    public static final void method2195(int arg0, class146 arg1, int arg2) {
        class4.field29++;
        class47.field820.method1656(204, 16);
        field5339++;
        class47.field820.method348(arg0, 255);
        class47.field820.method359(arg1.method1123(-13726), 128);
        if (arg2 != 3) {
            method2193((byte) -32);
        }
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V", line = 153)
    public static final void method2196(int arg0) {
        field5341++;
        if (arg0 >= -62) {
            method2195(-121, (class146) null, -110);
        }
        class311.field5304.method791(8);
        class13.field244.method791(8);
        class200.field3344.method791(8);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)V", line = 169)
    public static final void method2197(int arg0, int arg1, int arg2) {
        field5352++;
        int var3 = arg2;
        if (arg2 > 25) {
            var3 = 25;
        }
        arg2--;
        int var4 = class191.field3162[arg2];
        int var5 = class300.field5077[arg2];
        if (arg0 == 0) {
            class158.field2656++;
            class47.field820.method1656(38, 16);
            class47.field820.method332(var3 + var3 + 3, 67);
        }
        if (arg0 == 1) {
            class47.field820.method1656(201, 16);
            class47.field820.method332(var3 + var3 + 14 + 3, 120);
            class177.field2997++;
        }
        if (arg0 == 2) {
            class47.field820.method1656(235, 16);
            class55.field980++;
            class47.field820.method332(var3 + var3 + 3, 83);
        }
        class47.field820.method348(class113.field1813[82] ? 1 : 0, 255);
        class230.field3854 = class191.field3162[0];
        class171.field2893 = class300.field5077[arg1];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class47.field820.method370(class191.field3162[arg2] - var4, arg1 + 123);
            class47.field820.method383(class300.field5077[arg2] - var5, true);
        }
        class47.field820.method361(class15.field300 + var4, 1635554120);
        class47.field820.method365(class201.field3357 + var5, (byte) -112);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 222)
    public class313() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)I", line = 228)
    public final int method1891(int arg0) {
        if (arg0 <= 99) {
            return -94;
        } else {
            field5331++;
            return this.field5348;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V", line = 246)
    public final void method630(byte arg0) {
        field5342++;
        if (arg0 > -56) {
            method2193((byte) 100);
        }
        super.method630((byte) -64);
        this.field5328 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lwe;II)V", line = 292)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field5335++;
        if (arg1 != 2048) {
            field5329 = (class15) null;
        }
        if (arg2 == 0) {
            this.field5348 = arg0.method379(arg1 - 2050);
        }
    }
}
