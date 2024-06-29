import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class368 {

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    private int field5578 = -1;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    private int field5584 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lbd;")
    private class37 field5574 = new class37();

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
    public boolean field5586 = false;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private int field5579;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    private int field5573;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[Lpq;")
    private class104[] field5576;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[[I")
    private int[][] field5575;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lal;")
    public static class52 field5580 = new class52(128);

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5588 = "Allocating memory";

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lmo;")
    public static class447 field5587;

    // $FF: synthetic field
    @OriginalMember(owner = "client!of", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field5589;

    // $FF: synthetic field
    @OriginalMember(owner = "client!of", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field5590;

    // $FF: synthetic field
    @OriginalMember(owner = "client!of", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field5591;

    // $FF: synthetic method
    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2369(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([Ljava/lang/Object;[JB)V", line = 5)
    public static final void method2363(Object[] arg0, long[] arg1, byte arg2) {
        if (arg2 <= -101) {
            class432.method2675(-24528, arg1.length - 1, arg1, arg0, 0);
            field5581++;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(III)V", line = 197)
    public class368(int arg0, int arg1, int arg2) {
        this.field5579 = arg1;
        this.field5573 = arg0;
        this.field5576 = new class104[this.field5579];
        this.field5575 = new int[this.field5573][arg2];
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)[[I", line = 29)
    public final int[][] method2364(int arg0) {
        field5583++;
        if (this.field5579 != this.field5573) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 19215) {
            this.method2364(-62);
        }
        for (int var2 = 0; var2 < this.field5573; var2++) {
            this.field5576[var2] = class56.field704;
        }
        return this.field5575;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 51)
    public static void method2365(int arg0) {
        field5587 = null;
        field5588 = null;
        field5580 = null;
        if (arg0 != -31339) {
            field5587 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLah;Lap;ILjava/awt/Canvas;I)Le;", line = 65)
    public static final class312 method2366(byte arg0, class215 arg1, class279 arg2, int arg3, Canvas arg4, int arg5) {
        field5582++;
        if (arg0 != 72) {
            field5580 = null;
        }
        try {
            Class var6 = Class.forName("sq");
            Constructor var7 = var6.getConstructor(field5589 == null ? (field5589 = method2369("java.awt.Canvas")) : field5589, field5590 == null ? (field5590 = method2369("ah")) : field5590, Integer.TYPE, Integer.TYPE, field5591 == null ? (field5591 = method2369("ap")) : field5591);
            return (class312) var7.newInstance(arg4, arg1, Integer.valueOf(arg5), new Integer(arg3), arg2);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)[I", line = 98)
    public final int[] method2367(byte arg0, int arg1) {
        int var3 = 110 % ((arg0 - 8) / 63);
        field5585++;
        if (this.field5579 == this.field5573) {
            this.field5586 = this.field5576[arg1] == null;
            this.field5576[arg1] = class56.field704;
            return this.field5575[arg1];
        } else if (this.field5573 == 1) {
            this.field5586 = this.field5578 != arg1;
            this.field5578 = arg1;
            return this.field5575[0];
        } else {
            class104 var4 = this.field5576[arg1];
            if (var4 == null) {
                this.field5586 = true;
                if (this.field5584 >= this.field5573) {
                    class104 var5 = (class104) this.field5574.method257(-99);
                    var4 = new class104(arg1, var5.field1459);
                    this.field5576[var5.field1461] = null;
                    var5.method1120(-108);
                } else {
                    var4 = new class104(arg1, this.field5584);
                    this.field5584++;
                }
                this.field5576[arg1] = var4;
            } else {
                this.field5586 = false;
            }
            this.field5574.method250(var4, 37);
            return this.field5575[var4.field1459];
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 167)
    public final void method2368(int arg0) {
        int var2 = 14 % ((arg0 + 11) / 61);
        field5577++;
        for (int var3 = 0; var3 < this.field5573; var3++) {
            this.field5575[var3] = null;
        }
        this.field5576 = null;
        this.field5575 = null;
        this.field5574.method255(-20994);
        this.field5574 = null;
    }
}
