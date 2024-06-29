import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class554 extends class298 {

    @OriginalMember(owner = "client!jw", name = "C", descriptor = "[[B")
    private byte[][] field7779 = new byte[10][];

    @OriginalMember(owner = "client!jw", name = "E", descriptor = "Lee;")
    private class675 field7781 = new class675(null);

    @OriginalMember(owner = "client!jw", name = "N", descriptor = "Lee;")
    private class675 field7790 = new class675(null);

    @OriginalMember(owner = "client!jw", name = "M", descriptor = "I")
    private int field7789;

    @OriginalMember(owner = "client!jw", name = "F", descriptor = "Lfp;")
    private class323 field7782;

    @OriginalMember(owner = "client!jw", name = "I", descriptor = "Lqfa;")
    public static class98 field7785 = new class98(5, 3);

    @OriginalMember(owner = "client!jw", name = "D", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!jw", name = "H", descriptor = "I")
    private int field7784;

    @OriginalMember(owner = "client!jw", name = "J", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!jw", name = "L", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!jw", name = "K", descriptor = "[I")
    private int[] field7787;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "(I)Ltl;")
    public static final class619 method3204(int arg0) {
        field7788++;
        try {
            if (arg0 < 21) {
                method3207(-110);
            }
            return (class619) Class.forName("ck").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class306();
        }
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(ILfp;I)V")
    public class554(int arg0, class323 arg1, int arg2) {
        super(arg0);
        this.field7789 = arg2;
        this.field7782 = arg1;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILag;)V")
    public static final void method3205(int arg0, class682 arg1) {
        field7783++;
        for (int var2 = 0; var2 < class319.field4418; var2++) {
            int var4 = class136.field1976[var2];
            class280 var5 = class309.field4311[var4];
            int var6 = arg1.method3750((byte) 35);
            if ((var6 & 0x2) != 0) {
                var6 += arg1.method3750((byte) 35) << 8;
            }
            if ((var6 & 0x4000) != 0) {
                var6 += arg1.method3750((byte) 35) << 16;
            }
            class360.method2309(var5, var6, arg1, (byte) 122, var4);
        }
        int var3 = 122 % ((arg0 - 2) / 38);
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(Z)V")
    public final void method3206(boolean arg0) {
        if (!arg0) {
            this.field7784 = 80;
        }
        field7780++;
        if (this.field7787 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7787.length <= this.field7784 + var2) {
                return;
            }
            if (this.field7779[var2] == null && this.field7782.method2097((byte) -108, this.field7787[this.field7784 + var2], 0)) {
                this.field7779[var2] = this.field7782.method2100(0, (byte) 112, this.field7787[this.field7784 + var2]);
            }
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B[B)I")
    public final int method1937(byte arg0, byte[] arg1) throws IOException {
        field7786++;
        if (this.field7787 == null) {
            if (!this.field7782.method2097((byte) -87, this.field7789, 0)) {
                return 0;
            }
            byte[] var3 = this.field7782.method2100(0, (byte) 112, this.field7789);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field7790.field9154 = var3;
            this.field7790.field9146 = 0;
            int var4 = var3.length >> 1;
            this.field7787 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7787[var5] = this.field7790.method3757((byte) -65);
            }
        }
        if (this.field7784 >= this.field7787.length) {
            return -1;
        }
        this.method3206(true);
        this.field7790.field9146 = 0;
        this.field7790.field9154 = arg1;
        do {
            if (this.field7790.field9146 >= this.field7790.field9154.length) {
                this.field7790.field9154 = null;
                if (arg0 != 10) {
                    return 11;
                }
                return arg1.length;
            }
            if (this.field7781.field9154 == null) {
                if (this.field7779[0] == null) {
                    this.field7790.field9154 = null;
                    return this.field7790.field9146;
                }
                this.field7781.field9154 = this.field7779[0];
            }
            int var6 = this.field7790.field9154.length - this.field7790.field9146;
            int var7 = this.field7781.field9154.length - this.field7781.field9146;
            if (var6 < var7) {
                this.field7781.method3723(this.field7790.field9154, arg0 ^ 0xE, var6, this.field7790.field9146);
                this.field7790.field9154 = null;
                return arg1.length;
            }
            this.field7790.method3748(true, this.field7781.field9154, var7, this.field7781.field9146);
            this.field7784++;
            this.field7781.field9154 = null;
            this.field7781.field9146 = 0;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field7779[var8] = this.field7779[var8 + 1];
            }
            this.field7779[9] = null;
        } while (this.field7784 < this.field7787.length);
        this.field7790.field9154 = null;
        return this.field7790.field9146;
    }

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "(I)V")
    public static void method3207(int arg0) {
        if (arg0 != -438808511) {
            field7785 = null;
        }
        field7785 = null;
    }
}
