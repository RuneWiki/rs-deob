import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class548 {

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public int field7786;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "[B")
    private byte[] field7784;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public int field7780;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public int field7785;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public int field7792;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Lur;")
    public class500 field7793;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "[I")
    public int[] field7776;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "[I")
    public int[] field7777;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "[I")
    public int[] field7782;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "[I")
    public int[] field7783;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "[I")
    public int[] field7788;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "[I")
    public int[] field7791;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "[Lur;")
    public class500[] field7778;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "[[B")
    public byte[][] field7787;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "[[I")
    public int[][] field7781;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "[[I")
    public int[][] field7789;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public static final void method3157(byte arg0) {
        class578[] var1 = class278.field4157;
        synchronized (class278.field4157) {
            int var2 = 0;
            if (arg0 <= 126) {
                method3157((byte) 59);
            }
            while (true) {
                if (var2 >= class278.field4157.length) {
                    break;
                }
                class278.field4157[var2] = new class578();
                class239.field3539[var2] = 0;
                var2++;
            }
        }
        field7779++;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B[B)V")
    private final void method3158(byte arg0, byte[] arg1) {
        field7790++;
        class61 var3 = new class61(class433.method2631(-92, arg1));
        int var4 = var3.method732(-559537960);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field7780 = 0;
        } else {
            this.field7780 = var3.method730(-40);
        }
        if (arg0 <= 121) {
            return;
        }
        int var5 = var3.method732(-559537960);
        boolean var6 = (var5 & 0x1) != 0;
        this.field7785 = var3.method723((byte) -25);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        this.field7788 = new int[this.field7785];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field7785; var10++) {
            this.field7788[var10] = var8 += var3.method723((byte) -25);
            if (var9 < this.field7788[var10]) {
                var9 = this.field7788[var10];
            }
        }
        this.field7792 = var9 + 1;
        this.field7776 = new int[this.field7792];
        this.field7781 = new int[this.field7792][];
        this.field7777 = new int[this.field7792];
        this.field7782 = new int[this.field7792];
        if (var7) {
            this.field7787 = new byte[this.field7792][];
        }
        this.field7791 = new int[this.field7792];
        if (var6) {
            this.field7783 = new int[this.field7792];
            for (int var11 = 0; var11 < this.field7792; var11++) {
                this.field7783[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field7785; var12++) {
                this.field7783[this.field7788[var12]] = var3.method730(88);
            }
            this.field7793 = new class500(this.field7783);
        }
        for (int var13 = 0; var13 < this.field7785; var13++) {
            this.field7777[this.field7788[var13]] = var3.method730(-127);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field7785; var14++) {
                byte[] var15 = new byte[64];
                var3.method704(0, 64, var15, 0);
                this.field7787[this.field7788[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field7785; var16++) {
            this.field7776[this.field7788[var16]] = var3.method730(115);
        }
        for (int var17 = 0; var17 < this.field7785; var17++) {
            this.field7791[this.field7788[var17]] = var3.method723((byte) -25);
        }
        for (int var18 = 0; var18 < this.field7785; var18++) {
            int var25 = this.field7788[var18];
            int var26 = 0;
            int var27 = this.field7791[var25];
            int var28 = -1;
            this.field7781[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field7781[var25][var29] = var26 += var3.method723((byte) -25);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field7782[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field7781[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field7778 = new class500[var9 + 1];
        this.field7789 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field7785; var19++) {
            int var20 = this.field7788[var19];
            int var21 = this.field7791[var20];
            this.field7789[var20] = new int[this.field7782[var20]];
            for (int var22 = 0; var22 < this.field7782[var20]; var22++) {
                this.field7789[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field7781[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field7781[var20][var23];
                }
                this.field7789[var20][var24] = var3.method730(90);
            }
            this.field7778[var20] = new class500(this.field7789[var20]);
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "([BI[B)V")
    public class548(byte[] arg0, int arg1, byte[] arg2) {
        this.field7786 = class569.method3284(arg0.length, 72, arg0);
        if (this.field7786 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field7784 = class654.method3726(arg0, 64, 0, arg0.length);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field7784[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3158((byte) 123, arg0);
    }
}
