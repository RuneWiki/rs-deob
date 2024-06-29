import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class638 extends class217 {

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    private int field9171;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    private int field9172;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    private int field9165;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    private int field9162;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "Lhu;")
    public static class131 field9164;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Lgfa;")
    public static class748 field9168;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "[[[Lcj;")
    public static class691[][][] field9170;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)[B", line = 5)
    public static final byte[] method3650(byte arg0, int arg1) {
        ++field9169;
        class565 var2 = (class565) class284.field3457.method1613((long) arg1, 54);
        int var3 = 111 % ((-33 - arg0) / 47);
        if (var2 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; ~var6 > -256; ++var6) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; ~var7 > -256; ++var7) {
                int var8 = 255 - var7;
                int var9 = class661.method3763(var8, 30356, var5);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[-var7 + 511] = var10;
            }
            var2 = new class565(var4);
            class284.field3457.method1611((long) arg1, (byte) -107, var2);
        }
        return var2.field8037;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V", line = 54)
    public final void method1267(int arg0, int arg1, int arg2) {
        ++field9167;
        if (arg0 != -5) {
            method3650((byte) 88, 127);
        }
        int var4 = this.field9165 * arg2 >> 12;
        int var5 = this.field9162 * arg2 >> 12;
        int var6 = this.field9172 * arg1 >> 12;
        int var7 = this.field9171 * arg1 >> 12;
        class518.method3047(var4, var5, super.field2524, var7, super.field2515, var6, -1, super.field2520);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB)V", line = 74)
    public final void method1268(int arg0, int arg1, byte arg2) {
        ++field9166;
        int var4 = this.field9165 * arg1 >> 12;
        int var5 = this.field9162 * arg1 >> 12;
        if (arg2 != -39) {
            this.field9171 = 94;
        }
        int var6 = this.field9172 * arg0 >> 12;
        int var7 = this.field9171 * arg0 >> 12;
        class350.method2076(var5, var4, (byte) -111, super.field2524, var7, super.field2520, var6);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 93)
    public static void method3651(int arg0) {
        field9164 = null;
        if (arg0 != 25175) {
            field9170 = null;
        }
        field9170 = null;
        field9168 = null;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIII)V", line = 107)
    public class638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9171 = arg3;
        this.field9172 = arg1;
        this.field9165 = arg0;
        this.field9162 = arg2;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZ)V", line = 122)
    public final void method1265(int arg0, int arg1, boolean arg2) {
        ++field9163;
        int var4 = this.field9165 * arg0 >> 12;
        if (!arg2) {
            this.method1267(114, -121, 38);
        }
        int var5 = this.field9162 * arg0 >> 12;
        int var6 = this.field9172 * arg1 >> 12;
        int var7 = this.field9171 * arg1 >> 12;
        class154.method945(var7, super.field2515, 0, var4, var6, var5);
    }
}
