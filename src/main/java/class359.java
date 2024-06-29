import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class359 extends class337 {

    @OriginalMember(owner = "client!wha", name = "t", descriptor = "I")
    public int field4386;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!wha", name = "p", descriptor = "[I")
    public int[] field4382;

    @OriginalMember(owner = "client!wha", name = "u", descriptor = "[[I")
    public int[][] field4387;

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "[Z")
    public boolean[] field4380;

    @OriginalMember(owner = "client!wha", name = "s", descriptor = "[I")
    public int[] field4385;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "Luw;")
    public static class208 field4378 = new class208(107, -2);

    @OriginalMember(owner = "client!wha", name = "q", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!wha", name = "r", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
    public static void method2073(int arg0) {
        field4378 = null;
        if (arg0 != 0) {
            field4378 = null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)Lfi;")
    public static final class13 method2074(int arg0) {
        field4384++;
        return class570.field7200 == arg0 ? new class13() : class699.field9266[--class570.field7200];
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(I[B)V")
    public class359(int arg0, byte[] arg1) {
        this.field4386 = arg0;
        class234 var3 = new class234(arg1);
        this.field4381 = var3.method1509(true);
        this.field4382 = new int[this.field4381];
        this.field4387 = new int[this.field4381][];
        this.field4380 = new boolean[this.field4381];
        this.field4385 = new int[this.field4381];
        for (int var4 = 0; var4 < this.field4381; var4++) {
            this.field4382[var4] = var3.method1509(true);
            if (this.field4382[var4] == 6) {
                this.field4382[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field4381; var5++) {
            this.field4380[var5] = var3.method1509(true) == 1;
        }
        for (int var6 = 0; var6 < this.field4381; var6++) {
            this.field4385[var6] = var3.method1553((byte) -127);
        }
        for (int var7 = 0; var7 < this.field4381; var7++) {
            this.field4387[var7] = new int[var3.method1509(true)];
        }
        for (int var8 = 0; var8 < this.field4381; var8++) {
            for (int var9 = 0; var9 < this.field4387[var8].length; var9++) {
                this.field4387[var8][var9] = var3.method1509(true);
            }
        }
    }
}
