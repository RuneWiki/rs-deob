import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class349 extends class29 {

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "Z")
    public static boolean field5124 = true;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5115 = new CRC32();

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "Ljm;")
    public static class167 field5128 = new class167("", 11);

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "Ljava/lang/String;")
    public String field5118;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "[C")
    public char[] field5120;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "[C")
    public char[] field5122;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
    public static int[] field5116;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "[I")
    public int[] field5123;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "[I")
    public int[] field5127;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "[[[Log;")
    public static class369[][][] field5121;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)V")
    public static final void method2246(int arg0, int arg1) {
        class363 var2 = class148.field2000;
        synchronized (class148.field2000) {
            class148.field2000.method2300(arg1, true);
            if (arg0 != 0) {
                method2251(101, -96, 84, -22);
            }
        }
        field5125++;
        class363 var3 = class141.field1914;
        synchronized (class141.field1914) {
            class141.field1914.method2300(arg1, true);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IC)I")
    public final int method2247(int arg0, char arg1) {
        field5113++;
        if (this.field5127 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field5127.length; var3++) {
            if (this.field5120[var3] == arg1) {
                return this.field5127[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lat;B)V")
    public final void method2248(class256 arg0, byte arg1) {
        field5117++;
        while (true) {
            int var3 = arg0.method1738((byte) -80);
            if (var3 == 0) {
                if (arg1 == 102) {
                    return;
                } else {
                    method2252(false);
                    return;
                }
            }
            this.method2250(var3, arg0, 110);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(CI)I")
    public final int method2249(char arg0, int arg1) {
        field5112++;
        if (this.field5123 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5123.length; var3++) {
            if (this.field5122[var3] == arg0) {
                return this.field5123[var3];
            }
        }
        if (arg1 != -1) {
            method2246(-95, -124);
        }
        return -1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILat;I)V")
    private final void method2250(int arg0, class256 arg1, int arg2) {
        if (arg0 == 1) {
            this.field5118 = arg1.method1715(true);
        } else if (arg0 == 2) {
            int var7 = arg1.method1738((byte) 124);
            this.field5122 = new char[var7];
            this.field5123 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5123[var8] = arg1.method1767(1930493576);
                byte var9 = arg1.method1728((byte) 123);
                this.field5122[var8] = var9 == 0 ? 0 : class141.method934((byte) 89, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1738((byte) 120);
            this.field5127 = new int[var4];
            this.field5120 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5127[var5] = arg1.method1767(1930493576);
                byte var6 = arg1.method1728((byte) 113);
                this.field5120[var5] = var6 == 0 ? 0 : class141.method934((byte) 67, var6);
            }
        }
        if (arg2 >= 85) {
            field5119++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V")
    public static final void method2251(int arg0, int arg1, int arg2, int arg3) {
        field5126++;
        class125 var4 = class56.method428(arg0, 9, -3636);
        var4.method846(arg2 + 18602);
        var4.field1657 = arg1;
        var4.field1654 = arg3;
        if (arg2 != 8246) {
            method2252(true);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
    public static void method2252(boolean arg0) {
        field5128 = null;
        field5121 = null;
        field5116 = null;
        if (!arg0) {
            field5115 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    public final void method2253(int arg0) {
        if (this.field5127 != null) {
            for (int var2 = 0; var2 < this.field5127.length; var2++) {
                this.field5127[var2] = class259.method1785(this.field5127[var2], 32768);
            }
        }
        if (arg0 != 0) {
            this.field5123 = null;
        }
        field5114++;
        if (this.field5123 != null) {
            for (int var3 = 0; var3 < this.field5123.length; var3++) {
                this.field5123[var3] = class259.method1785(this.field5123[var3], 32768);
            }
        }
    }
}
