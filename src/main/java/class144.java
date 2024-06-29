import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class144 extends class132 {

    @OriginalMember(owner = "client!wq", name = "D", descriptor = "I")
    public static int field2221 = 1;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "Loca;")
    public static class221 field2224 = new class221(11, 0, 1, 2);

    @OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
    public static int field2227 = 0;

    @OriginalMember(owner = "client!wq", name = "N", descriptor = "Z")
    public static boolean field2229 = false;

    @OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!wq", name = "B", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!wq", name = "K", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "Ljava/lang/String;")
    public String field2222;

    @OriginalMember(owner = "client!wq", name = "A", descriptor = "[C")
    public char[] field2218;

    @OriginalMember(owner = "client!wq", name = "C", descriptor = "[C")
    public char[] field2220;

    @OriginalMember(owner = "client!wq", name = "G", descriptor = "[I")
    public int[] field2223;

    @OriginalMember(owner = "client!wq", name = "M", descriptor = "[I")
    public int[] field2228;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public final void method948(byte arg0) {
        field2219++;
        if (this.field2223 != null) {
            for (int var2 = 0; var2 < this.field2223.length; var2++) {
                this.field2223[var2] = class73.method578(this.field2223[var2], 32768);
            }
        }
        int var3 = -97 % ((arg0 - 32) / 50);
        if (this.field2228 != null) {
            for (int var4 = 0; var4 < this.field2228.length; var4++) {
                this.field2228[var4] = class73.method578(this.field2228[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBLdaa;)V")
    private final void method949(int arg0, byte arg1, class11 arg2) {
        if (arg1 > -95) {
            return;
        }
        if (arg0 == 1) {
            this.field2222 = arg2.method100((byte) 70);
        } else if (arg0 == 2) {
            int var4 = arg2.method110((byte) 99);
            this.field2228 = new int[var4];
            this.field2220 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2228[var5] = arg2.method93((byte) 80);
                byte var6 = arg2.method67(65280);
                this.field2220[var5] = var6 == 0 ? 0 : class363.method2173(var6, true);
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method110((byte) 68);
            this.field2218 = new char[var7];
            this.field2223 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2223[var8] = arg2.method93((byte) 124);
                byte var9 = arg2.method67(65280);
                this.field2218[var8] = var9 == 0 ? 0 : class363.method2173(var9, true);
            }
        }
        field2226++;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(CI)I")
    public final int method950(char arg0, int arg1) {
        if (arg1 < 120) {
            this.method953(-120, (char) 65531);
        }
        field2217++;
        if (this.field2223 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2223.length; var3++) {
            if (this.field2218[var3] == arg0) {
                return this.field2223[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILdaa;)V")
    public final void method951(int arg0, class11 arg1) {
        while (true) {
            int var3 = arg1.method110((byte) 96);
            if (var3 == 0) {
                if (arg0 != 0) {
                    method952(false);
                }
                field2225++;
                return;
            }
            this.method949(var3, (byte) -127, arg1);
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(Z)V")
    public static void method952(boolean arg0) {
        if (arg0) {
            field2224 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IC)I")
    public final int method953(int arg0, char arg1) {
        field2216++;
        if (this.field2228 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != 18765) {
            field2221 = -127;
        }
        while (this.field2228.length > var3) {
            if (this.field2220[var3] == arg1) {
                return this.field2228[var3];
            }
            var3++;
        }
        return -1;
    }
}
