import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class34 {

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "[I")
    private int[] field480;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Ld;")
    public static class7 field477 = class37.method242("Clothes Shop", 1333943984);

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "Ld;")
    public static class7 field479 = class37.method242("Vegetable Store", 1333943984);

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "Ld;")
    public static class7 field481 = class37.method242("Skirt Shop", 1333943984);

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "I")
    public static int field482 = -1;

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "[[B")
    public static byte[][] field484 = new byte[1000][];

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "Ld;")
    public static class7 field486 = class37.method242("overlay2)3dat", 1333943984);

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 32)
    public static void method227(int arg0) {
        field481 = null;
        field486 = null;
        if (arg0 == 10971) {
            field477 = null;
            field484 = null;
            field479 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B[B)[B", line = 72)
    public static final byte[] method228(byte arg0, byte[] arg1) {
        class37 var2 = new class37(arg1);
        int var3 = var2.method237(arg0 - 187);
        if (arg0 != 60) {
            method228((byte) 61, null);
        }
        int var4 = var2.method244((byte) 117);
        if (var4 < 0 || class15.field151 != 0 && class15.field151 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var9 = new byte[var4];
            var2.method238(40, var9, 0, var4);
            return var9;
        } else {
            int var5 = var2.method244((byte) 117);
            if (var5 < 0 || class15.field151 != 0 && var5 > class15.field151) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class6.method48(var6, var5, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var10) {
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)I", line = 132)
    public final int method229(int arg0, int arg1) {
        int var3 = this.field480.length - 2;
        if (arg0 != -1) {
            field483 = 110;
        }
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field480[var4];
            if (arg1 == var5) {
                return this.field480[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "([I)V", line = 155)
    public class34(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field480 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field480[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field480[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field480[var5 + var5] = arg0[var4];
            this.field480[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 207)
    public static final void method230(int arg0) {
        if (class8.field94 != null) {
            class31 var1 = class8.field94;
            synchronized (class8.field94) {
                class8.field94 = null;
            }
        }
        if (arg0 != -26787) {
            field482 = 5;
        }
    }
}
