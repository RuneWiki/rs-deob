import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class273 {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field4147 = 0;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lbo;")
    public static class16 field4135 = new class16();

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Z")
    public static boolean field4150 = false;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Loh;")
    public class294 field4137;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
    public int[] field4130;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[I")
    public int[] field4138;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "[I")
    public int[] field4140;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "[I")
    public int[] field4141;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
    public int[] field4145;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "[I")
    public int[] field4152;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "[Loh;")
    public class294[] field4146;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[[I")
    public int[][] field4136;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "[[I")
    public int[][] field4143;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B[B)[B", line = 9)
    public static final byte[] method2001(byte arg0, byte[] arg1) {
        field4139++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        if (arg0 == -20) {
            class84.method684(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 28)
    public static final void method2002(Component arg0, int arg1) {
        field4129++;
        Method var2 = class61.field899;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg0.addKeyListener(class260.field3879);
        arg0.addFocusListener(class260.field3879);
        int var4 = 53 % ((arg1 + 48) / 36);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 51)
    public static void method2003(byte arg0) {
        field4135 = null;
        if (arg0 != 73) {
            field4135 = (class16) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BB)V", line = 67)
    private final void method2004(byte[] arg0, byte arg1) {
        field4133++;
        class190 var3 = new class190(class260.method1907(arg0, -92));
        int var4 = var3.method1319(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4149 = var3.method1371(-4);
        } else {
            this.field4149 = 0;
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = var3.method1319(255);
        this.field4132 = var3.method1317((byte) 123);
        this.field4130 = new int[this.field4132];
        for (int var8 = 0; var8 < this.field4132; var8++) {
            this.field4130[var8] = var5 += var3.method1317((byte) 65);
            if (this.field4130[var8] > var6) {
                var6 = this.field4130[var8];
            }
        }
        this.field4144 = var6 + 1;
        this.field4138 = new int[this.field4144];
        this.field4141 = new int[this.field4144];
        this.field4136 = new int[this.field4144][];
        this.field4140 = new int[this.field4144];
        this.field4145 = new int[this.field4144];
        if (var7 != 0) {
            this.field4152 = new int[this.field4144];
            for (int var9 = 0; var9 < this.field4144; var9++) {
                this.field4152[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4132; var10++) {
                this.field4152[this.field4130[var10]] = var3.method1371(-4);
            }
            this.field4137 = new class294(this.field4152);
        }
        for (int var11 = 0; var11 < this.field4132; var11++) {
            this.field4140[this.field4130[var11]] = var3.method1371(-4);
        }
        if (arg1 < 102) {
            this.method2004((byte[]) null, (byte) 106);
        }
        for (int var12 = 0; var12 < this.field4132; var12++) {
            this.field4141[this.field4130[var12]] = var3.method1371(-4);
        }
        for (int var13 = 0; var13 < this.field4132; var13++) {
            this.field4138[this.field4130[var13]] = var3.method1317((byte) 1);
        }
        for (int var14 = 0; var14 < this.field4132; var14++) {
            int var15 = this.field4130[var14];
            int var16 = -1;
            int var17 = this.field4138[var15];
            int var18 = 0;
            this.field4136[var15] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field4136[var15][var19] = var18 += var3.method1317((byte) 76);
                if (var16 < var20) {
                    var16 = var20;
                }
            }
            this.field4145[var15] = var16 + 1;
            if (var16 + 1 == var17) {
                this.field4136[var15] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field4146 = new class294[var6 + 1];
        this.field4143 = new int[var6 + 1][];
        for (int var21 = 0; var21 < this.field4132; var21++) {
            int var22 = this.field4130[var21];
            int var23 = this.field4138[var22];
            this.field4143[var22] = new int[this.field4145[var22]];
            for (int var24 = 0; var24 < this.field4145[var22]; var24++) {
                this.field4143[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field4136[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field4136[var22][var25];
                }
                this.field4143[var22][var26] = var3.method1371(-4);
            }
            this.field4146[var22] = new class294(this.field4143[var22]);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 249)
    public static final void method2005(int arg0) {
        class94.field1312.method458((byte) -109);
        if (arg0 < 95) {
            field4142 = -117;
        }
        field4128++;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 261)
    public static final void method2006(int arg0) {
        class329.field4952.method42(true);
        if (arg0 < 84) {
            method2006(-112);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class112.field1625[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class303.field4526[var2] = 0L;
        }
        class32.field470 = 0;
        field4148++;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([BI)V", line = 303)
    public class273(byte[] arg0, int arg1) {
        this.field4131 = class22.method131(arg0.length, arg0, 118);
        if (this.field4131 != arg1) {
            throw new RuntimeException();
        }
        this.method2004(arg0, (byte) 105);
    }
}
