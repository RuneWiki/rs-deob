import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class76 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "[[I")
    public static int[][] field1098 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!co", name = "c", descriptor = "Ljm;")
    public static class485 field1100 = new class485(61, -1);

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V", line = 4)
    public static void method563(int arg0) {
        if (arg0 == 7) {
            field1100 = null;
            field1098 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B[[[Lsd;)V", line = 24)
    public static final void method564(byte arg0, class61[][][] arg1) {
        field1101++;
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class61[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class61 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field824 instanceof class55) {
                            ((class55) var6.field824).method361(18);
                        }
                        if (var6.field825 instanceof class55) {
                            ((class55) var6.field825).method361(-117);
                        }
                        if (var6.field816 instanceof class55) {
                            ((class55) var6.field816).method361(-96);
                        }
                        if (var6.field814 instanceof class55) {
                            ((class55) var6.field814).method361(83);
                        }
                        if (var6.field832 instanceof class55) {
                            ((class55) var6.field832).method361(9);
                        }
                        for (class302 var7 = var6.field819; var7 != null; var7 = var7.field4140) {
                            class33 var8 = var7.field4136;
                            if (var8 instanceof class55) {
                                ((class55) var8).method361(26);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 < 75) {
            method565(-56, -80, -76, -27, 61, 80, 75);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V", line = 100)
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1099++;
        int var7 = arg0 + arg6;
        int var8 = arg4 - arg6;
        for (int var9 = arg0; var9 < var7; var9++) {
            class419.method2511(class225.field3174[var9], arg3, arg5, arg2, -30);
        }
        int var10 = arg3 + arg6;
        int var11 = arg2 - arg6;
        for (int var12 = arg4; var12 > var8; var12--) {
            class419.method2511(class225.field3174[var12], arg3, arg5, arg2, 118);
        }
        if (arg1 <= 25) {
            method564((byte) -122, null);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class225.field3174[var13];
            class419.method2511(var14, arg3, arg5, var10, -14);
            class419.method2511(var14, var11, arg5, arg2, 94);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)Z")
    public abstract boolean method399(boolean arg0);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILco;ILqa;ZZ)V")
    public abstract void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6);

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V")
    public abstract void method398(int arg0);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lqa;III)Z")
    public abstract boolean method403(class162 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(ILqa;)V")
    public abstract void method400(int arg0, class162 arg1);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lqa;I)Lip;")
    public abstract class498 method402(class162 arg0, int arg1);
}
