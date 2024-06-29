import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 extends class70 {

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field779 = -1;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "Llc;")
    public static class69 field787 = class69.method470((byte) -108, " with @yel@");

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field782 = 3353893;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field792 = 3;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Llc;")
    public static class69 field794 = class69.method470((byte) -97, "p11_full");

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field780 = 0;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "Llc;")
    public static class69 field790 = class69.method470((byte) -115, "@yel@Classic");

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "[I")
    public int[] field778;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "[I")
    public int[] field784;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "[I")
    public int[] field795;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "[Lua;")
    public class116[] field788;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "[Lua;")
    public class116[] field796;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "[[[B")
    public byte[][][] field785;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public static final void method238(int arg0) {
        class22 var1 = (class22) class68.field1484.method580((byte) 82);
        field789++;
        while (var1 != null) {
            if (class71.field1588 != var1.field452 || var1.field443) {
                var1.method502(0);
            } else if (class62.field1282 >= var1.field444) {
                var1.method142((byte) -67, class69.field1534);
                if (var1.field443) {
                    var1.method502(0);
                } else {
                    class120.field2562.method979(var1.field452, var1.field455, var1.field441, var1.field457, 60, var1, 0, -1, false);
                }
            }
            var1 = (class22) class68.field1484.method576((byte) 38);
        }
        int var2 = -12 % ((arg0 + 79) / 34);
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static void method239(int arg0) {
        if (arg0 != 6084) {
            field792 = 5;
        }
        field787 = null;
        field790 = null;
        field794 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BB)[B")
    public static final byte[] method240(byte[] arg0, byte arg1) {
        class94 var2 = new class94(arg0);
        int var3 = var2.method703((byte) 101);
        int var4 = var2.method667(5811);
        field793++;
        if (var4 < 0 || class80.field1826 != 0 && class80.field1826 < var4) {
            throw new RuntimeException();
        }
        if (arg1 <= 112) {
            method239(-65);
        }
        if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method673((byte) -102, var5, 0, var4);
            return var5;
        }
        int var6 = var2.method667(5811);
        if (var6 < 0 || class80.field1826 != 0 && var6 > class80.field1826) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class86.method612(var7, var6, arg0, var4, 9);
        } else {
            try {
                DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                var8.readFully(var7);
                var8.close();
            } catch (IOException var9) {
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z[BII)V")
    public static final void method241(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (class98.field2158 >= 0) {
            class103.field2236.method4(-127);
            class98.field2158 = -1;
            class3.field61 = 0;
            class70.field1565 = 20;
            class98.field2141 = null;
        }
        field781++;
        if (arg2 != 12416) {
            field780 = 57;
        }
        if (arg1 == null) {
            return;
        }
        if (class70.field1565 > 0) {
            class103.field2236.method1(125);
            class70.field1565 = 0;
        }
        class98.field2158 = arg3;
        class103.field2236.method3(arg0, (byte) -111, arg3, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)I")
    public static final int method242(int arg0) {
        int var1 = 57 / ((6 - arg0) / 58);
        field786++;
        return class49.field1008++;
    }
}
