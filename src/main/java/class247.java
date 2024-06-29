import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class247 {

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    private int field3391 = 0;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    private int field3388 = -1;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "Lfi;")
    private class166 field3392 = new class166();

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "Z")
    public boolean field3396 = false;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    private int field3386;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "[[I")
    private int[][] field3384;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "[Lgk;")
    private class256[] field3390;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3387++;
        int var8 = arg5 - arg2;
        int var9 = arg3 + arg2;
        for (int var10 = arg3; var10 < var9; var10++) {
            class396.method2436(-1070, arg4, arg6, class186.field2697[var10], arg1);
        }
        for (int var11 = arg5; var11 > var8; var11--) {
            class396.method2436(arg0 - 20887, arg4, arg6, class186.field2697[var11], arg1);
        }
        if (arg0 != 19817) {
            return;
        }
        int var12 = arg1 - arg2;
        int var13 = arg6 + arg2;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class186.field2697[var14];
            class396.method2436(arg0 ^ 0xFFFFB6BB, arg4, arg6, var15, var13);
            class396.method2436(arg0 ^ 0xFFFFB6BB, arg7, var13, var15, var12);
            class396.method2436(arg0 ^ 0xFFFFB6BB, arg4, var12, var15, arg1);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)[[I")
    public final int[][] method1610(int arg0) {
        field3393++;
        if (this.field3395 != this.field3386) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3386; var2++) {
            this.field3390[var2] = class373.field5240;
        }
        return this.field3384;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)V")
    public static final void method1611(int arg0, byte arg1) {
        class440.field6330 = 100;
        class312.field4219 = arg0;
        class115.field1615 = 3;
        if (arg1 >= 117) {
            class100.field1446 = -1;
            field3389++;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
    public final void method1612(int arg0) {
        field3383++;
        for (int var2 = 0; var2 < this.field3386; var2++) {
            this.field3384[var2] = null;
        }
        if (arg0 >= 62) {
            this.field3384 = null;
            this.field3390 = null;
            this.field3392.method1250(10346);
            this.field3392 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)V")
    public static final void method1613(boolean arg0, int arg1) {
        field3394++;
        if (arg0 == class367.field5045) {
            return;
        }
        class367.field5045 = arg0;
        class264.method1697(119);
        if (arg1 != -24410) {
            method1611(126, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)[I")
    public final int[] method1614(int arg0, int arg1) {
        field3385++;
        if (arg0 <= 32) {
            this.field3396 = false;
        }
        if (this.field3395 == this.field3386) {
            this.field3396 = this.field3390[arg1] == null;
            this.field3390[arg1] = class373.field5240;
            return this.field3384[arg1];
        } else if (this.field3386 == 1) {
            this.field3396 = this.field3388 != arg1;
            this.field3388 = arg1;
            return this.field3384[0];
        } else {
            class256 var3 = this.field3390[arg1];
            if (var3 == null) {
                this.field3396 = true;
                if (this.field3391 >= this.field3386) {
                    class256 var4 = (class256) this.field3392.method1252(15666);
                    var3 = new class256(arg1, var4.field3466);
                    this.field3390[var4.field3469] = null;
                    var4.method2367(5);
                } else {
                    var3 = new class256(arg1, this.field3391);
                    this.field3391++;
                }
                this.field3390[arg1] = var3;
            } else {
                this.field3396 = false;
            }
            this.field3392.method1244(true, var3);
            return this.field3384[var3.field3466];
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(III)V")
    public class247(int arg0, int arg1, int arg2) {
        this.field3386 = arg0;
        this.field3395 = arg1;
        this.field3384 = new int[this.field3386][arg2];
        this.field3390 = new class256[this.field3395];
    }
}
