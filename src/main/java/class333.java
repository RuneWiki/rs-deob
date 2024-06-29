import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class333 extends class12 {

    @OriginalMember(owner = "client!i", name = "T", descriptor = "B")
    public byte field5112;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public int field5107;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Lag;")
    public class202 field5109;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([BI)Lib;", line = 16)
    public static final class312 method2297(byte[] arg0, int arg1) {
        field5111++;
        if (arg0 == null) {
            return null;
        }
        class312 var2;
        if (class249.field3893) {
            var2 = new class297(arg0, class80.field1572, class27.field530, class28.field537, class176.field2833, class254.field3968);
        } else {
            var2 = new class237(arg0, class80.field1572, class27.field530, class28.field537, class176.field2833, class254.field3968);
        }
        if (arg1 != 1) {
            method2297((byte[]) null, -52);
        }
        class97.method644((byte) 112);
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(Z)I", line = 38)
    public final int method95(boolean arg0) {
        field5106++;
        if (arg0) {
            this.method97(49);
        }
        return this.field5109 == null ? 0 : this.field5109.field3249 * 100 / (this.field5109.field3273.length - this.field5112);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZIIII)V", line = 54)
    public static final void method2298(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            method2297((byte[]) null, -79);
        }
        field5108++;
        class281 var5 = (class281) class21.field449.method303((long) arg3, (byte) 101);
        if (var5 == null) {
            var5 = new class281();
            class21.field449.method310((long) arg3, var5, 25357);
        }
        if (var5.field4327.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field4327.length; var8++) {
                var6[var8] = var5.field4327[var8];
                var7[var8] = var5.field4324[var8];
            }
            for (int var9 = var5.field4327.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4324 = var7;
            var5.field4327 = var6;
        }
        var5.field4327[arg4] = arg1;
        var5.field4324[arg4] = arg2;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)[B", line = 108)
    public final byte[] method97(int arg0) {
        field5105++;
        if (this.field239 || this.field5109.field3249 < this.field5109.field3273.length - this.field5112) {
            throw new RuntimeException();
        } else if (arg0 < 5) {
            return (byte[]) null;
        } else {
            return this.field5109.field3273;
        }
    }
}
