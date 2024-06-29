import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class335 {

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    private int field4843 = -1;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    private int field4846 = 0;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Lar;")
    private class47 field4835 = new class47();

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Z")
    public boolean field4847 = false;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    private int field4839;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    private int field4838;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "[[[I")
    private int[][][] field4841;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "[Lcs;")
    private class388[] field4842;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4837 = "wave:";

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Llm;")
    public static class347 field4836;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method2204(byte arg0) {
        field4840++;
        if (this.field4839 != this.field4838) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -73) {
            for (int var2 = 0; var2 < this.field4838; var2++) {
                this.field4842[var2] = class83.field1179;
            }
            return this.field4841;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)[[I")
    public final int[][] method2205(byte arg0, int arg1) {
        if (arg0 != -114) {
            this.field4839 = 64;
        }
        field4845++;
        if (this.field4839 == this.field4838) {
            this.field4847 = this.field4842[arg1] == null;
            this.field4842[arg1] = class83.field1179;
            return this.field4841[arg1];
        } else if (this.field4838 == 1) {
            this.field4847 = this.field4843 != arg1;
            this.field4843 = arg1;
            return this.field4841[0];
        } else {
            class388 var3 = this.field4842[arg1];
            if (var3 == null) {
                this.field4847 = true;
                if (this.field4838 > this.field4846) {
                    var3 = new class388(arg1, this.field4846);
                    this.field4846++;
                } else {
                    class388 var4 = (class388) this.field4835.method333((byte) 97);
                    var3 = new class388(arg1, var4.field5597);
                    this.field4842[var4.field5599] = null;
                    var4.method322(11);
                }
                this.field4842[arg1] = var3;
            } else {
                this.field4847 = false;
            }
            this.field4835.method336((byte) 123, var3);
            return this.field4841[var3.field5597];
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)[B")
    public static final byte[] method2206(boolean arg0, int arg1) {
        field4834++;
        class22 var2 = (class22) class395.field5836.method2674((long) arg1, 22300);
        if (!arg0) {
            return null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class139.method895(-19416, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class22(var3);
            class395.field5836.method2673((long) arg1, var2, 11465);
        }
        return var2.field288;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public final void method2207(boolean arg0) {
        field4844++;
        if (arg0) {
            this.method2204((byte) 95);
        }
        for (int var2 = 0; var2 < this.field4838; var2++) {
            this.field4841[var2][0] = null;
            this.field4841[var2][1] = null;
            this.field4841[var2][2] = null;
            this.field4841[var2] = null;
        }
        this.field4842 = null;
        this.field4841 = null;
        this.field4835.method335((byte) -119);
        this.field4835 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public static void method2208(byte arg0) {
        field4836 = null;
        int var1 = 20 % ((arg0 - 1) / 61);
        field4837 = null;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(III)V")
    public class335(int arg0, int arg1, int arg2) {
        this.field4839 = arg1;
        this.field4838 = arg0;
        this.field4841 = new int[this.field4838][3][arg2];
        this.field4842 = new class388[this.field4839];
    }
}
