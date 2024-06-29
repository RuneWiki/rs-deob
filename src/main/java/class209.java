import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class209 extends class417 {

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "[[I")
    public int[][] field3100;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "[I")
    public int[] field3097;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "[Z")
    public boolean[] field3094;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "[I")
    public int[] field3099;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "Lee;")
    public static class582 field3093 = new class582();

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "[S")
    public static short[] field3098 = new short[256];

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1383(boolean arg0) {
        field3093 = null;
        if (arg0) {
            field3098 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(I[B)V", line = 36)
    public class209(int arg0, byte[] arg1) {
        this.field3095 = arg0;
        class148 var3 = new class148(arg1);
        this.field3096 = var3.method1032((byte) -33);
        this.field3100 = new int[this.field3096][];
        this.field3097 = new int[this.field3096];
        this.field3094 = new boolean[this.field3096];
        this.field3099 = new int[this.field3096];
        for (int var4 = 0; var4 < this.field3096; var4++) {
            this.field3099[var4] = var3.method1032((byte) -33);
        }
        for (int var5 = 0; var5 < this.field3096; var5++) {
            this.field3094[var5] = var3.method1032((byte) -33) == 1;
        }
        for (int var6 = 0; var6 < this.field3096; var6++) {
            this.field3097[var6] = var3.method1045(true);
        }
        for (int var7 = 0; var7 < this.field3096; var7++) {
            this.field3100[var7] = new int[var3.method1032((byte) -33)];
        }
        for (int var8 = 0; var8 < this.field3096; var8++) {
            for (int var9 = 0; var9 < this.field3100[var8].length; var9++) {
                this.field3100[var8][var9] = var3.method1032((byte) -33);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(JJ)J", line = 94)
    public static long method1384(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
