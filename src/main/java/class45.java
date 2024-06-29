import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public abstract class class45 implements class216 {

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "Lnm;")
    public class476 field584;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "Lwu;")
    private class376 field589;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "Lwu;")
    public class376 field578;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "J")
    private long field590;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "Lha;")
    public static class59 field585;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "Lda;")
    private class60 field586;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Z")
    public boolean method320(int arg0) {
        field587++;
        if (arg0 != 5618) {
            this.field584 = null;
        }
        boolean var2 = true;
        if (!this.field578.method2216(this.field584.field6530, -77)) {
            var2 = false;
        }
        if (!this.field589.method2216(this.field584.field6530, 126)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIZ)V")
    public abstract void method321(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
    public static void method322(boolean arg0) {
        field585 = null;
        if (!arg0) {
            method322(false);
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)I")
    public final int method323(byte arg0) {
        field580++;
        int var2 = class549.field7251.method1272((byte) 43);
        int var3 = var2 * 100;
        if (this.field581 == var2 && var2 != 0) {
            int var4 = class549.field7251.method1278((byte) -56);
            if (var2 < var4) {
                long var5 = this.field590 - class549.field7251.method1276((byte) -83);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class375.method2193(116) - this.field590) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field581 = var2;
            this.field590 = class375.method2193(116);
        }
        if (arg0 != -36) {
            this.field586 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)V")
    public void method324(byte arg0) {
        field591++;
        if (arg0 <= 34) {
            this.method321(-115, -57, -24, false);
        }
        class539 var2 = class165.method1184(this.field589, 13580, this.field584.field6530);
        this.field586 = class341.field4807.method425(var2, class720.method4046(this.field578, this.field584.field6530), true);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIZI)V")
    public abstract void method325(int arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
    public static final void method326(File arg0, String arg1, byte arg2) {
        class271.field3787.put(arg1, arg0);
        field588++;
        if (arg2 != 20) {
            field585 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lwu;Lwu;Lnm;)V")
    public class45(class376 arg0, class376 arg1, class476 arg2) {
        this.field584 = arg2;
        this.field589 = arg1;
        this.field578 = arg0;
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(B)V")
    public static final void method327(byte arg0) {
        field579++;
        class344.method2062();
        int var1 = -94 % ((41 - arg0) / 62);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZB)V")
    public final void method328(boolean arg0, byte arg1) {
        if (arg1 >= -60) {
            return;
        }
        field582++;
        int var3 = this.field584.field6522.method1911(this.field584.field6529, 0, class69.field844) + this.field584.field6521;
        int var4 = this.field584.field6523.method2861((byte) -7, class304.field4321, this.field584.field6531) + this.field584.field6528;
        this.method325(var4, -119, arg0, var3);
        this.method321(var3, 2, var4, arg0);
        String var5 = class549.field7251.method1282((byte) 21);
        if (class375.method2193(116) - this.field590 > 10000L) {
            var5 = var5 + " (" + class549.field7251.method1271(255).method226(4) + ")";
        }
        this.field586.method513(this.field584.field6529 / 2 + var3, -124, var5, this.field584.field6531 / 2 + var4 + this.field584.field6526 + 4, this.field584.field6524, -1);
    }
}
