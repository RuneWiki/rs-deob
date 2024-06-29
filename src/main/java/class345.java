import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class345 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lm;")
    private class179 field4867 = new class179();

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lnk;")
    private class206 field4871 = new class206();

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field4877;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    private int field4874;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Ljj;")
    private class156 field4875;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    public static int[] field4870 = new int[2];

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Z")
    public static boolean field4873 = false;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(JLm;B)V")
    public final void method2226(long arg0, class179 arg1, byte arg2) {
        field4869++;
        if (this.field4877 == 0) {
            class179 var5 = this.field4871.method1558(arg2 + 106);
            var5.method251(111);
            var5.method1398(110);
            if (this.field4867 == var5) {
                class179 var6 = this.field4871.method1558(-2);
                var6.method251(arg2 + 138);
                var6.method1398(110);
            }
        } else {
            this.field4877--;
        }
        this.field4875.method1217(1, arg0, arg1);
        this.field4871.method1564((byte) 106, arg1);
        if (arg2 != -108) {
            field4870 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method2227(byte arg0) {
        if (arg0 == 103) {
            field4870 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)Lm;")
    public final class179 method2228(int arg0, long arg1) {
        field4868++;
        class179 var4 = (class179) this.field4875.method1219(arg1, -101);
        if (var4 != null) {
            this.field4871.method1564((byte) 106, var4);
        }
        if (arg0 != -1) {
            field4873 = false;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLec;)V")
    public static final void method2229(byte arg0, class37 arg1) {
        field4876++;
        if (arg0 >= -83) {
            field4870 = null;
        }
        byte[] var2 = new byte[24];
        if (class76.field1303 != null) {
            try {
                class76.field1303.method482(0L, (byte) 18);
                class76.field1303.method479(var2, -93);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method313(0, var2, 25100, 24);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public final void method2230(int arg0) {
        this.field4871.method1557(arg0 ^ 0x3);
        field4878++;
        if (arg0 == 2) {
            this.field4875.method1228(-30653);
            this.field4867 = new class179();
            this.field4877 = this.field4874;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
    public class345(int arg0) {
        this.field4877 = arg0;
        this.field4874 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4875 = new class156(var2);
    }
}
