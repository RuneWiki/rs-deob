import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 extends class435 {

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "Ljava/lang/String;")
    public String field369;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "Z")
    public boolean field365;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "Ljava/lang/String;")
    public String field370;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "J")
    public long field367;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "Z")
    public boolean field363;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "Lsr;")
    public static class167 field359 = new class167();

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field371 = -1;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "Lfo;")
    public static class361 field362;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([[[Lno;Z)V")
    public static final void method194(class498[][][] arg0, boolean arg1) {
        field360++;
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class498[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class498 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7268 instanceof class448) {
                            ((class448) var6.field7268).method45(9479);
                        }
                        if (var6.field7259 instanceof class448) {
                            ((class448) var6.field7259).method45(9479);
                        }
                        if (var6.field7271 instanceof class448) {
                            ((class448) var6.field7271).method45(9479);
                        }
                        if (var6.field7264 instanceof class448) {
                            ((class448) var6.field7264).method45(9479);
                        }
                        if (var6.field7257 instanceof class448) {
                            ((class448) var6.field7257).method45(9479);
                        }
                        for (class192 var7 = var6.field7263; var7 != null; var7 = var7.field2469) {
                            class279 var8 = var7.field2466;
                            if (var8 instanceof class448) {
                                ((class448) var8).method45(9479);
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            field359 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V")
    public static void method195(int arg0) {
        field362 = null;
        field359 = null;
        if (arg0 != 0) {
            field371 = 5;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class36(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field369 = arg1;
        this.field365 = arg8;
        this.field361 = arg3;
        this.field368 = arg6;
        this.field366 = arg2;
        this.field364 = arg4;
        this.field370 = arg0;
        this.field367 = arg5;
        this.field363 = arg9;
        this.field372 = arg7;
    }
}
